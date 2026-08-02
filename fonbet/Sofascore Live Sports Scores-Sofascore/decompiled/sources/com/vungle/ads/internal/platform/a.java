package com.vungle.ads.internal.platform;

import android.content.Context;
import android.telephony.TelephonyManager;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class a {
    public static String a(Context context) {
        context.getClass();
        Object systemService = context.getSystemService("phone");
        systemService.getClass();
        return ((TelephonyManager) systemService).getNetworkOperatorName();
    }
}
