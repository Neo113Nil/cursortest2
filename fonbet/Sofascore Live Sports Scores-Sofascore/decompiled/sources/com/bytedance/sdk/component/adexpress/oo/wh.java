package com.bytedance.sdk.component.adexpress.oo;

import android.text.TextUtils;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class wh {
    public static boolean pcc(String str) {
        return TextUtils.equals(str, "fullscreen_interstitial_ad") || TextUtils.equals(str, "rewarded_video");
    }

    public static boolean sf(String str) {
        return com.bytedance.sdk.component.adexpress.oo.sf() && pcc(str);
    }
}
