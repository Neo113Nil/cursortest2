package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import defpackage.c2a;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbbj {
    public NetworkCapabilities a;

    public static zzbbj a(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        zzbbj zzbbjVar = new zzbbj();
        if (connectivityManager != null) {
            try {
                connectivityManager.registerDefaultNetworkCallback(new c2a(zzbbjVar, 5));
                return zzbbjVar;
            } catch (RuntimeException unused) {
                synchronized (zzbbj.class) {
                    zzbbjVar.a = null;
                }
            }
        }
        return zzbbjVar;
    }
}
