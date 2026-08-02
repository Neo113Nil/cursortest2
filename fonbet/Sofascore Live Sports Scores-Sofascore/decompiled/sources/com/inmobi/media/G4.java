package com.inmobi.media;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import android.telephony.TelephonyManager;
import defpackage.eq3;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public abstract class G4 {
    public static final EnumC3369df a() {
        Context context = AbstractC3424fj.a;
        if (context == null) {
            return EnumC3369df.UNAVAILABLE;
        }
        try {
            Object systemService = context.getSystemService("connectivity");
            systemService.getClass();
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                int type = activeNetworkInfo.getType();
                if (type != 0) {
                    if (type != 1) {
                        return EnumC3369df.SLOW;
                    }
                    Object systemService2 = context.getApplicationContext().getSystemService(com.ironsource.Q3.b);
                    systemService2.getClass();
                    int linkSpeed = ((WifiManager) systemService2).getConnectionInfo().getLinkSpeed();
                    return linkSpeed >= 10 ? EnumC3369df.FAST : linkSpeed >= 2 ? EnumC3369df.MEDIUM : EnumC3369df.SLOW;
                }
                if (eq3.b(context, "android.permission.READ_PHONE_STATE") != 0) {
                    return EnumC3369df.UNAVAILABLE;
                }
                Object systemService3 = context.getSystemService("phone");
                systemService3.getClass();
                int networkType = ((TelephonyManager) systemService3).getNetworkType();
                return (networkType == 1 || networkType == 2 || networkType == 4 || networkType == 7 || networkType == 11 || networkType == 16) ? EnumC3369df.SLOW : (networkType == 18 || networkType == 20) ? EnumC3369df.FAST : EnumC3369df.MEDIUM;
            }
            return EnumC3369df.UNAVAILABLE;
        } catch (SecurityException unused) {
            return EnumC3369df.UNAVAILABLE;
        }
    }
}
