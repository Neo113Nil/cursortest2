package com.ironsource.adqualitysdk.sdk.i;

import android.os.Process;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.do, reason: invalid class name */
/* loaded from: classes4.dex */
public final class Cdo extends dn {

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f1801 = 0;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f1802 = 1;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int[] f1803 = {-272759797, 796446861, -513992623, -1683652822, -601479256, -1360569437, 1750315830, -884445416, 34699819, -449721626, 1670890592, -818513930, -1485993457, 1318516215, 1875750669, 2136448136, 1558987698, 914517304};

    public Cdo(String str, String str2, String str3, int i, String str4) {
        this(str, str2, str3, i, str4, null);
    }

    public Cdo(String str, String str2, String str3, int i, String str4, Throwable th) {
        super(str4, new dq(str, str2, str3, i), th);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.dn
    /* renamed from: ﻛ */
    public final String mo7592() {
        int i = 2 % 2;
        int i2 = f1802 + 93;
        f1801 = i2 % 128;
        int[] iArr = {-966232527, 1798911004, 1376033742, -1535651184, -980385224, 633340232, -1871019585, 631801378, -499233605, -1026263824, 1196985704, -1865253280, 1277446477, 416866510};
        return (i2 % 2 != 0 ? m7594(iArr, 51 >>> (Process.myTid() * 5)) : m7594(iArr, 25 - (Process.myTid() >> 22))).intern();
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m7594(int[] iArr, int i) {
        String str;
        synchronized (a.f86) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) f1803.clone();
            a.f83 = 0;
            while (a.f83 < iArr.length) {
                cArr[0] = (char) (iArr[a.f83] >> 16);
                cArr[1] = (char) iArr[a.f83];
                cArr[2] = (char) (iArr[a.f83 + 1] >> 16);
                cArr[3] = (char) iArr[a.f83 + 1];
                a.f84 = (cArr[0] << 16) + cArr[1];
                a.f85 = (cArr[2] << 16) + cArr[3];
                a.m5773(iArr2);
                for (int i2 = 0; i2 < 16; i2++) {
                    int i3 = a.f84 ^ iArr2[i2];
                    a.f84 = i3;
                    a.f85 = a.m5774(i3) ^ a.f85;
                    int i4 = a.f84;
                    a.f84 = a.f85;
                    a.f85 = i4;
                }
                int i5 = a.f84;
                a.f84 = a.f85;
                a.f85 = i5;
                a.f85 = i5 ^ iArr2[16];
                a.f84 ^= iArr2[17];
                int i6 = a.f84;
                int i7 = a.f85;
                cArr[0] = (char) (a.f84 >>> 16);
                cArr[1] = (char) a.f84;
                cArr[2] = (char) (a.f85 >>> 16);
                cArr[3] = (char) a.f85;
                a.m5773(iArr2);
                cArr2[a.f83 << 1] = cArr[0];
                cArr2[(a.f83 << 1) + 1] = cArr[1];
                cArr2[(a.f83 << 1) + 2] = cArr[2];
                cArr2[(a.f83 << 1) + 3] = cArr[3];
                a.f83 += 2;
            }
            str = new String(cArr2, 0, i);
        }
        return str;
    }
}
