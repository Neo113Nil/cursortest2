package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes8.dex */
public final class g {

    /* renamed from: ｋ, reason: contains not printable characters */
    public static final Object f2155 = new Object();

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static int f2156;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static int f2157;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static char[] m7785(long j, char[] cArr, int i) {
        int length = cArr.length;
        char[] cArr2 = new char[length];
        int i2 = 0;
        int i3 = 4;
        for (int i4 = 0; i4 < cArr.length; i4++) {
            if ((((j >>> i4) & 1) != i || i2 >= 4) && i3 < length) {
                cArr2[i3] = cArr[i4];
                i3++;
            } else {
                cArr2[i2] = cArr[i4];
                i2++;
            }
        }
        return cArr2;
    }
}
