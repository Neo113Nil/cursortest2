package com.mbridge.msdk.foundation.tools;

import android.net.ConnectivityManager;

/* compiled from: NetManager.java */
/* loaded from: classes13.dex */
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
