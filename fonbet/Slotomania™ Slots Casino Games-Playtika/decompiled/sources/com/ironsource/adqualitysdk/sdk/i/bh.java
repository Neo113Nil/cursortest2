package com.ironsource.adqualitysdk.sdk.i;

import android.view.KeyEvent;
import com.ironsource.adqualitysdk.sdk.i.be;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class bh extends be {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f807 = 1;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f808;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int[] f809 = {214551532, -375498113, 877388656, -1112991584, -524021956, -1810680371, -1488597023, 239397849, -625563877, -126784317, -334208093, -84438350, -2000391749, -501868993, -1867355456, -1520780872, 1573650047, 1477544069};

    public bh(String str) {
        super(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* renamed from: ﻛ */
    public final String mo6357() {
        int i = 2 % 2;
        int i2 = f808 + 5;
        f807 = i2 % 128;
        int[] iArr = {593552850, 1983978741, -1121733379, 1446651584};
        return (i2 % 2 == 0 ? m6389(iArr, KeyEvent.getDeadChar(0, 1) + 70) : m6389(iArr, 7 - KeyEvent.getDeadChar(0, 0))).intern();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* renamed from: ﻐ */
    final Class mo6356(String str) {
        int i = 2 % 2;
        int i2 = f808;
        int i3 = i2 + 47;
        f807 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 75;
        f807 = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* renamed from: ﾇ */
    final Map<String, be.c> mo6358() {
        int i = 2 % 2;
        HashMap hashMap = new HashMap();
        int i2 = f808 + 93;
        f807 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 87 / 0;
        }
        return hashMap;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* renamed from: ﻏ */
    public final boolean mo6370() {
        int i = 2 % 2;
        int i2 = f808 + 99;
        int i3 = i2 % 128;
        f807 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 33;
        f808 = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m6389(int[] iArr, int i) {
        String str;
        synchronized (a.f86) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) f809.clone();
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
