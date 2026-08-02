package com.playtika.plugins.googleplay.billingclient;

/* loaded from: classes8.dex */
public class ItemType {
    static final String INAPP = "inapp";
    static final String SUBS = "subs";

    public static String fromInt(int i) {
        return i == 0 ? "inapp" : "subs";
    }
}
