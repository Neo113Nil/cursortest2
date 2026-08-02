package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static int f83;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static int f84;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static int f85;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static final Object f86 = new Object();

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static void m5773(int[] iArr) {
        for (int i = 0; i < iArr.length / 2; i++) {
            int i2 = iArr[i];
            iArr[i] = iArr[(iArr.length - i) - 1];
            iArr[(iArr.length - i) - 1] = i2;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static int m5774(int i) {
        b bVar = b.f654;
        return ((bVar.f656[0][i >>> 24] + bVar.f656[1][(i >>> 16) & 255]) ^ bVar.f656[2][(i >>> 8) & 255]) + bVar.f656[3][i & 255];
    }
}
