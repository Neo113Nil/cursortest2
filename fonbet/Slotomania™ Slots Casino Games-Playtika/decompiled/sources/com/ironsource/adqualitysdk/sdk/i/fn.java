package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;

/* loaded from: classes4.dex */
public final class fn extends ef {

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static int f2096 = 1;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static int f2097 = 0;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static char f2098 = 7169;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static char f2099 = 36831;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static char f2100 = 65262;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static char f2101 = 9927;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private final ef f2102;

    public fn(ef efVar) {
        this.f2102 = efVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ef
    /* renamed from: ﾇ */
    public final ea mo7722(ee eeVar, cl clVar) {
        return new ea(Boolean.valueOf(!this.f2102.m7721(eeVar, clVar).m7682()));
    }

    public final String toString() {
        int i = 2 % 2;
        String obj = new StringBuilder().append(m7769("\uf2c1팦", TextUtils.indexOf("", "", 0) + 1).intern()).append(this.f2102).toString();
        int i2 = f2096 + 83;
        f2097 = i2 % 128;
        if (i2 % 2 == 0) {
            return obj;
        }
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m7769(String str, int i) {
        String str2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (o.f3094) {
            char[] cArr3 = new char[cArr2.length];
            o.f3095 = 0;
            char[] cArr4 = new char[2];
            while (o.f3095 < cArr2.length) {
                cArr4[0] = cArr2[o.f3095];
                cArr4[1] = cArr2[o.f3095 + 1];
                int i2 = 58224;
                for (int i3 = 0; i3 < 16; i3++) {
                    char c = cArr4[1];
                    char c2 = cArr4[0];
                    char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + f2099)) ^ ((c2 >>> 5) + f2098)));
                    cArr4[1] = c3;
                    cArr4[0] = (char) (c2 - (((c3 >>> 5) + f2100) ^ ((c3 + i2) ^ ((c3 << 4) + f2101))));
                    i2 -= 40503;
                }
                cArr3[o.f3095] = cArr4[0];
                cArr3[o.f3095 + 1] = cArr4[1];
                o.f3095 += 2;
            }
            str2 = new String(cArr3, 0, i);
        }
        return str2;
    }
}
