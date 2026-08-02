package com.bytedance.sdk.openadsdk.utils;

import android.text.TextUtils;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class tmg {
    private static void pcc(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            com.bytedance.sdk.openadsdk.gpj.oo.pcc.pcc((String) null, str, str2);
        } catch (Throwable unused) {
        }
    }

    private static String sf(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return com.bytedance.sdk.openadsdk.gpj.oo.pcc.sf((String) null, str, str2);
        } catch (Throwable unused) {
            return str2;
        }
    }

    public static String pcc() {
        return sf("any_door_id", null);
    }

    public static void pcc(String str) {
        pcc("any_door_id", str);
    }
}
