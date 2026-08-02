package com.ironsource.adqualitysdk.sdk.i;

import android.os.Process;
import android.view.ViewConfiguration;
import com.ironsource.adqualitysdk.sdk.IronSourceAdQuality;

/* loaded from: classes6.dex */
public final class gj extends gt {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int[] f2197 = {958017820, -151691694, 1305403619, 451214543, -1472683759, -1172086081, 432031163, 2023975388, -198758622, 2133781118, -1243009221, 265842514, -374365576, -648124715, -1840016220, 951829309, 615655424, -229983573};

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f2198 = 0;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f2199 = 1;

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ｋ */
    public final String mo7798() {
        int i = 2 % 2;
        int i2 = f2199 + 69;
        f2198 = i2 % 128;
        int i3 = i2 % 2;
        String intern = m7804(new int[]{127303638, 711276312, 707397749, -624132466, -1671246570, -715039911, 16012169, -915673897, 741528863, 1062079030, 1109079853, -1051900690, -1478737200, 1217819212, -1478737200, 1217819212, 175734525, 201941699, -787299963, 348573986, -820749898, -1181590220, -859413697, 2130125781, 874781779, 1670893876}, (ViewConfiguration.getTouchSlop() >> 8) + 51).intern();
        int i4 = f2198 + 25;
        f2199 = i4 % 128;
        int i5 = i4 % 2;
        return intern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﻐ */
    public final Class mo7796() {
        int i = 2 % 2;
        int i2 = f2198 + 19;
        int i3 = i2 % 128;
        f2199 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i4 = i3 + 53;
        f2198 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 91 / 0;
        }
        return IronSourceAdQuality.class;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﾇ */
    public final be mo7799() {
        int i = 2 % 2;
        bg bgVar = new bg(mo7797());
        int i2 = f2199 + 85;
        f2198 = i2 % 128;
        int i3 = i2 % 2;
        return bgVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﻛ */
    public final String mo7797() {
        int i = 2 % 2;
        int i2 = f2198 + 107;
        f2199 = i2 % 128;
        return (i2 % 2 == 0 ? m7804(new int[]{335075839, -460297189, 279988959, -2066371647, 863671054, 1031861320, 1814891308, -2140214328}, 39 >> ((Process.getThreadPriority(0) / 37) % 8)) : m7804(new int[]{335075839, -460297189, 279988959, -2066371647, 863671054, 1031861320, 1814891308, -2140214328}, 15 - ((Process.getThreadPriority(0) + 20) >> 6))).intern();
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static String m7804(int[] iArr, int i) {
        String str;
        synchronized (a.f86) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) f2197.clone();
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
