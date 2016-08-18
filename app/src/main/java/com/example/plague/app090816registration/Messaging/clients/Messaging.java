package com.example.plague.app090816registration.Messaging.clients;

import com.example.plague.app090816registration.WhoAmI;

import java.util.HashMap;

public class Messaging {
    private static HashMap<String, Message> messages  = new HashMap<>();;
    private static Object lock = new Object();

    public Messaging(WhoAmI whoAmI) {
        new ReceiveThread(whoAmI).start();
    }

    public static HashMap<String, Message> getMessages() {
        synchronized (lock) {
            return messages;
        }
    }
}
