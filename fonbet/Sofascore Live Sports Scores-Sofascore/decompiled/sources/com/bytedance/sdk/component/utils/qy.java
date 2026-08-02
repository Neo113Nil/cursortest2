package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class qy {
    private static volatile String pcc;

    public static String pcc() {
        if (!TextUtils.isEmpty(pcc)) {
            return pcc;
        }
        String str = Build.MODEL;
        pcc = str;
        return str;
    }

    public static int pcc(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            return context.getApplicationInfo().icon;
        } catch (Exception unused) {
            return 0;
        }
    }
}
