package com.appsflyer.internal;

import androidx.annotation.Nullable;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class AFa1nSDK extends HashMap<Integer, String> {
    private static AFa1nSDK registerClient;
    private final Object AFKeystoreWrapper = new Object();

    private AFa1nSDK() {
    }

    public static synchronized AFa1nSDK afErrorLog() {
        AFa1nSDK aFa1nSDK;
        synchronized (AFa1nSDK.class) {
            aFa1nSDK = registerClient;
            if (aFa1nSDK == null) {
                aFa1nSDK = new AFa1nSDK();
                registerClient = aFa1nSDK;
            }
        }
        return aFa1nSDK;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    @Nullable
    public String put(Integer num, String str) {
        String str2;
        synchronized (this.AFKeystoreWrapper) {
            str2 = (String) super.put((AFa1nSDK) num, (Integer) str);
        }
        return str2;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public String remove(@Nullable Object obj) {
        String str;
        synchronized (this.AFKeystoreWrapper) {
            str = (String) super.remove(obj);
        }
        return str;
    }

    @Override // java.util.HashMap, java.util.Map
    public boolean remove(@Nullable Object obj, @Nullable Object obj2) {
        boolean remove;
        synchronized (this.AFKeystoreWrapper) {
            remove = super.remove(obj, obj2);
        }
        return remove;
    }
}
