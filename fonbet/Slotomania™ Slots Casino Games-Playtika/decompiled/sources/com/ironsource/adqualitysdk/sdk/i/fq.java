package com.ironsource.adqualitysdk.sdk.i;

import android.view.ViewConfiguration;
import com.vungle.ads.internal.protos.Sdk;

/* loaded from: classes4.dex */
public final class fq extends fm<String> {

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static int f2111 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f2112 = 0;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static char f2113 = 37311;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static char f2114 = 35555;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static char f2115 = 50771;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static char f2116 = 56969;

    public fq(String str) {
        super(eb.m7685(str));
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.fm
    public final String toString() {
        int i = 2 % 2;
        String obj = new StringBuilder().append(m7773("黖\udaf3", (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))).intern()).append(super.toString()).append(m7773("黖\udaf3", (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))).intern()).toString();
        int i2 = f2112 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
        f2111 = i2 % 128;
        int i3 = i2 % 2;
        return obj;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m7773(String str, int i) {
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
                    char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + f2114)) ^ ((c2 >>> 5) + f2116)));
                    cArr4[1] = c3;
                    cArr4[0] = (char) (c2 - (((c3 >>> 5) + f2115) ^ ((c3 + i2) ^ ((c3 << 4) + f2113))));
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
