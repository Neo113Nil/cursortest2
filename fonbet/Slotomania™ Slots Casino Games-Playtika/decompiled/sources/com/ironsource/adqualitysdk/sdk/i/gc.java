package com.ironsource.adqualitysdk.sdk.i;

import android.view.ViewConfiguration;
import com.vungle.ads.internal.protos.Sdk;

/* loaded from: classes4.dex */
public abstract class gc extends gb {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static long f2168 = -9019254268343255734L;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f2169 = 1;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f2170;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private final byte f2171;

    public gc(byte b) {
        this.f2171 = b;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    protected final void m7791(StringBuilder sb) {
        int i = 2 % 2;
        int i2 = f2169 + 29;
        f2170 = i2 % 128;
        int i3 = i2 % 2;
        m7789(sb, this.f2171);
        if (i3 != 0) {
            throw null;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    protected final void m7792(StringBuilder sb) {
        int i = 2 % 2;
        int i2 = f2169 + 1;
        f2170 = i2 % 128;
        int i3 = i2 % 2;
        m7789(sb, this.f2171 - 1);
        int i4 = f2170 + 77;
        f2169 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static void m7789(StringBuilder sb, int i) {
        int i2 = 2 % 2;
        int i3 = f2170 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
        int i4 = i3 % 128;
        f2169 = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 79;
        f2170 = i6 % 128;
        int i7 = i6 % 2;
        for (int i8 = 0; i8 < i; i8++) {
            sb.append(m7790("絪ၕ", 27967 - (ViewConfiguration.getEdgeSlop() >> 16)).intern());
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m7790(String str, int i) {
        String str2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (i.f2454) {
            i.f2455 = i;
            char[] cArr3 = new char[cArr2.length];
            i.f2453 = 0;
            while (i.f2453 < cArr2.length) {
                cArr3[i.f2453] = (char) ((cArr2[i.f2453] ^ (i.f2453 * i.f2455)) ^ f2168);
                i.f2453++;
            }
            str2 = new String(cArr3);
        }
        return str2;
    }
}
