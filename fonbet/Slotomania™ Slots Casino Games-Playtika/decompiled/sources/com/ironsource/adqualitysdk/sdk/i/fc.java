package com.ironsource.adqualitysdk.sdk.i;

import android.view.View;

/* loaded from: classes4.dex */
public final class fc extends eu {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static long f2052 = 5389674942021487013L;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f2053 = 0;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f2054 = 1;

    public fc(ef efVar, ef efVar2) {
        super(efVar, efVar2);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ev
    /* renamed from: ﻐ */
    final boolean mo7754(int i) {
        int i2 = 2 % 2;
        int i3 = f2054;
        int i4 = i3 + 7;
        int i5 = i4 % 128;
        f2053 = i5;
        int i6 = i4 % 2;
        if (i < 0) {
            int i7 = i5 + 49;
            f2054 = i7 % 128;
            int i8 = i7 % 2;
            return true;
        }
        int i9 = i3 + 29;
        f2053 = i9 % 128;
        if (i9 % 2 == 0) {
            return false;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.em
    /* renamed from: ﻛ */
    public final String mo7734() {
        int i = 2 % 2;
        int i2 = f2054 + 43;
        f2053 = i2 % 128;
        String intern = (i2 % 2 != 0 ? m7760("즙", 49253 >> View.resolveSizeAndState(0, 0, 1)) : m7760("즙", 49253 - View.resolveSizeAndState(0, 0, 0))).intern();
        int i3 = f2054 + 25;
        f2053 = i3 % 128;
        int i4 = i3 % 2;
        return intern;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m7760(String str, int i) {
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
                cArr3[i.f2453] = (char) ((cArr2[i.f2453] ^ (i.f2453 * i.f2455)) ^ f2052);
                i.f2453++;
            }
            str2 = new String(cArr3);
        }
        return str2;
    }
}
