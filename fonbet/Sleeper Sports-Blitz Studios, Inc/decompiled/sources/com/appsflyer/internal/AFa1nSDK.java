package com.appsflyer.internal;

import java.util.HashMap;

/* loaded from: classes6.dex */
public class AFa1nSDK extends HashMap<Integer, String> {
    private static AFa1nSDK getCurrencyIso4217Code;
    private final Object getMonetizationNetwork = new Object();

    private AFa1nSDK() {
    }

    public static synchronized AFa1nSDK afErrorLog() {
        AFa1nSDK aFa1nSDK;
        synchronized (AFa1nSDK.class) {
            if (getCurrencyIso4217Code == null) {
                getCurrencyIso4217Code = new AFa1nSDK();
            }
            aFa1nSDK = getCurrencyIso4217Code;
        }
        return aFa1nSDK;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public String put(Integer num, String str) {
        String str2;
        synchronized (this.getMonetizationNetwork) {
            str2 = (String) super.put((AFa1nSDK) num, (Integer) str);
        }
        return str2;
    }

    @Override // java.util.HashMap, java.util.Map
    public boolean remove(Object obj, Object obj2) {
        boolean remove;
        synchronized (this.getMonetizationNetwork) {
            remove = super.remove(obj, obj2);
        }
        return remove;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public String remove(Object obj) {
        String str;
        synchronized (this.getMonetizationNetwork) {
            str = (String) super.remove(obj);
        }
        return str;
    }
}
