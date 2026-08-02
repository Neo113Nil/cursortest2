package com.mbridge.msdk.foundation.tools;

import android.net.ConnectivityManager;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class h0 {
    private static ConnectivityManager a;

    public static synchronized ConnectivityManager a() {
        ConnectivityManager connectivityManager;
        synchronized (h0.class) {
            try {
                if (a == null && com.mbridge.msdk.foundation.controller.c.n().d() != null) {
                    a = (ConnectivityManager) com.mbridge.msdk.foundation.controller.c.n().d().getSystemService("connectivity");
                }
            } catch (Exception e) {
                q0.b("NetManager", e.getMessage());
            }
            connectivityManager = a;
        }
        return connectivityManager;
    }
}
