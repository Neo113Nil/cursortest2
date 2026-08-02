package com.ironsource.adqualitysdk.sdk.i;

import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﹾ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public abstract class AbstractC1088 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static final HashMap f3395 = new HashMap();

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static String m645(String str) {
        HashMap hashMap = f3395;
        String str2 = (String) hashMap.get(str);
        if (str2 != null) {
            return str2;
        }
        hashMap.put(str, str);
        return str;
    }
}
