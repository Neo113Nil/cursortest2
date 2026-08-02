package com.ironsource.adqualitysdk.sdk.i;

import com.vungle.ads.internal.protos.Sdk;

/* loaded from: classes5.dex */
public enum hs {
    f2404(-1),
    f2405(0),
    f2406(1),
    f2407(2),
    f2408(3),
    f2400(4),
    f2401(5),
    f2402(6),
    f2403(7);


    /* renamed from: ﭖ, reason: contains not printable characters */
    private static int f2396 = 0;

    /* renamed from: ﭴ, reason: contains not printable characters */
    private static int f2397 = 1;

    /* renamed from: ﮌ, reason: contains not printable characters */
    private static int f2399;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private final int f2409;

    /* renamed from: ﻐ, reason: contains not printable characters */
    static void m7851() {
        f2396 = Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE;
    }

    public static hs valueOf(String str) {
        int i = 2 % 2;
        int i2 = f2399 + 81;
        f2397 = i2 % 128;
        int i3 = i2 % 2;
        hs hsVar = (hs) Enum.valueOf(hs.class, str);
        if (i3 == 0) {
            int i4 = 56 / 0;
        }
        return hsVar;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static hs[] valuesCustom() {
        int i = 2 % 2;
        int i2 = f2399 + 17;
        f2397 = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj = null;
            super.hashCode();
            throw null;
        }
        hs[] hsVarArr = (hs[]) values().clone();
        int i3 = f2399 + 83;
        f2397 = i3 % 128;
        int i4 = i3 % 2;
        return hsVarArr;
    }

    static {
        m7851();
        int i = f2397 + 31;
        f2399 = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    hs(int i) {
        this.f2409 = i;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static hs m7853(int i) {
        int i2 = 2 % 2;
        Object obj = null;
        switch (i) {
            case -1:
                return f2404;
            case 0:
                return f2405;
            case 1:
                return f2406;
            case 2:
                hs hsVar = f2407;
                int i3 = f2399 + 115;
                f2397 = i3 % 128;
                int i4 = i3 % 2;
                return hsVar;
            case 3:
                return f2408;
            case 4:
                return f2400;
            case 5:
                hs hsVar2 = f2401;
                int i5 = f2399 + 101;
                f2397 = i5 % 128;
                if (i5 % 2 != 0) {
                    return hsVar2;
                }
                super.hashCode();
                throw null;
            case 6:
                return f2402;
            case 7:
                hs hsVar3 = f2403;
                int i6 = f2397 + 87;
                f2399 = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 59 / 0;
                }
                return hsVar3;
            default:
                return null;
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final int m7854() {
        int i = 2 % 2;
        int i2 = f2399 + 99;
        int i3 = i2 % 128;
        f2397 = i3;
        int i4 = i2 % 2;
        int i5 = this.f2409;
        int i6 = i3 + 7;
        f2399 = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m7852(int i, boolean z, int i2, String str, int i3) {
        String str2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (d.f1644) {
            char[] cArr3 = new char[i];
            d.f1641 = 0;
            while (d.f1641 < i) {
                d.f1643 = cArr2[d.f1641];
                cArr3[d.f1641] = (char) (d.f1643 + i2);
                int i4 = d.f1641;
                cArr3[i4] = (char) (cArr3[i4] - f2396);
                d.f1641++;
            }
            if (i3 > 0) {
                d.f1642 = i3;
                char[] cArr4 = new char[i];
                System.arraycopy(cArr3, 0, cArr4, 0, i);
                System.arraycopy(cArr4, 0, cArr3, i - d.f1642, d.f1642);
                System.arraycopy(cArr4, d.f1642, cArr3, 0, i - d.f1642);
            }
            if (z) {
                char[] cArr5 = new char[i];
                d.f1641 = 0;
                while (d.f1641 < i) {
                    cArr5[d.f1641] = cArr3[(i - d.f1641) - 1];
                    d.f1641++;
                }
                cArr3 = cArr5;
            }
            str2 = new String(cArr3);
        }
        return str2;
    }
}
