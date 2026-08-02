package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.text.TextUtils;
import io.bidmachine.BidMachine;

/* loaded from: classes6.dex */
public final class gl extends gt {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f2204 = 1;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int[] f2205 = {-2007551954, 708982991, -656892763, 971423121, 1241575879, -1595441930, 2005195262, 901337680, -2086820758, -1758075677, -1344555373, -537680749, -639249616, -370343022, 1702477782, -773555802, -1440747393, 463762506};

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f2206;

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ｋ */
    public final String mo7798() {
        int i = 2 % 2;
        int i2 = f2206 + 89;
        f2204 = i2 % 128;
        String intern = (i2 % 2 == 0 ? m7806(new int[]{-1498384558, -862882705, 1763698121, 70893470, -1399452547, -476097293, 268712520, -39389609, 39505225, -1429736567, 34928872, 1836945133}, Color.argb(1, 0, 1, 0) + 91) : m7806(new int[]{-1498384558, -862882705, 1763698121, 70893470, -1399452547, -476097293, 268712520, -39389609, 39505225, -1429736567, 34928872, 1836945133}, 24 - Color.argb(0, 0, 0, 0))).intern();
        int i3 = f2204 + 59;
        f2206 = i3 % 128;
        int i4 = i3 % 2;
        return intern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﻐ */
    public final Class mo7796() {
        int i = 2 % 2;
        int i2 = f2204 + 49;
        int i3 = i2 % 128;
        f2206 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 7;
        f2204 = i5 % 128;
        int i6 = i5 % 2;
        return BidMachine.class;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﾇ */
    public final be mo7799() {
        int i = 2 % 2;
        bl blVar = new bl(mo7797());
        int i2 = f2206 + 27;
        f2204 = i2 % 128;
        if (i2 % 2 != 0) {
            return blVar;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﻛ */
    public final String mo7797() {
        int i = 2 % 2;
        int i2 = f2206 + 111;
        f2204 = i2 % 128;
        int i3 = i2 % 2;
        String intern = m7806(new int[]{2046264676, -36164452, -1599011981, -2092846428, 1412497911, -1068548964}, 9 - TextUtils.lastIndexOf("", '0')).intern();
        int i4 = f2206 + 55;
        f2204 = i4 % 128;
        if (i4 % 2 != 0) {
            return intern;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m7806(int[] iArr, int i) {
        String str;
        synchronized (a.f86) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) f2205.clone();
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
