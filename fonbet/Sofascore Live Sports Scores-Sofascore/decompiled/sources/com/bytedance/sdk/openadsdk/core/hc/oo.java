package com.bytedance.sdk.openadsdk.core.hc;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.settings.vh;
import defpackage.lnb;
import defpackage.wv8;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class oo {
    public static String pcc(String str, String str2) {
        return TextUtils.isEmpty(str2) ? str2 : (str2.startsWith("http://") || str2.startsWith("https://")) ? str2 : (TextUtils.isEmpty(str) || str.endsWith("/")) ? wv8.i(str, "static/", str2) : lnb.o(str, "/static/", str2);
    }

    public static String pcc(String str) {
        return TextUtils.isEmpty(str) ? str : pcc(vh.sf().gpj(), str);
    }
}
