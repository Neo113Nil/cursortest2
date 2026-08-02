package com.fyber.inneractive.sdk.util;

import android.os.Build;
import android.telephony.TelephonyManager;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class k extends o {
    public static String i() {
        try {
            return ((TelephonyManager) o.a.getSystemService("phone")).getNetworkCountryIso();
        } catch (Exception unused) {
            return null;
        }
    }

    public static String j() {
        return Build.MANUFACTURER + " " + Build.MODEL;
    }

    public static int k() {
        try {
            if (o.a("android.permission.READ_PHONE_STATE")) {
                return ((TelephonyManager) o.a.getSystemService("phone")).getDataNetworkType();
            }
            return 0;
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static String l() {
        try {
            return o.a.getPackageManager().getPackageInfo(o.a.getPackageName(), 0).versionName;
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean m() {
        boolean z = (o.a.getResources().getConfiguration().screenLayout & 15) == 4;
        IAlog.e("This device has a tablet resolution? %s", Boolean.valueOf(z));
        return z;
    }

    public static boolean n() {
        TelephonyManager telephonyManager = (TelephonyManager) o.a.getSystemService("phone");
        return telephonyManager != null && telephonyManager.getSimState() == 5;
    }
}
