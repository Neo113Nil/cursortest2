package com.ironsource.adqualitysdk.sdk.i;

import android.view.ViewConfiguration;

/* loaded from: classes4.dex */
public final class fv extends gb {

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int[] f2131 = {-2099115065, -1185804686, -141390289, 2025137541, 1039141312, -1699546477, -1787659676, -1091522738, -452130863, 1024070397, 2057812799, 846683926, -1810673706, -1836082940, 719637960, 1230694603, -1738329970, -703759246};

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f2132 = 0;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f2133 = 1;

    @Override // com.ironsource.adqualitysdk.sdk.i.gb
    /* renamed from: ﾒ */
    public final ea mo7776(ee eeVar, cl clVar) {
        int i = 2 % 2;
        ea eaVar = new ea(null);
        eaVar.m7676();
        int i2 = f2132 + 91;
        f2133 = i2 % 128;
        int i3 = i2 % 2;
        return eaVar;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = f2133 + 5;
        f2132 = i2 % 128;
        int i3 = i2 % 2;
        String intern = m7778(new int[]{261484606, -479531502, -1141935004, -1007400694}, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 6).intern();
        int i4 = f2133 + 105;
        f2132 = i4 % 128;
        int i5 = i4 % 2;
        return intern;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m7778(int[] iArr, int i) {
        String str;
        synchronized (a.f86) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) f2131.clone();
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
