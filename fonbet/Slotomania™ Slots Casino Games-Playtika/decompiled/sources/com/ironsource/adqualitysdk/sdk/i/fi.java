package com.ironsource.adqualitysdk.sdk.i;

import android.view.KeyEvent;

/* loaded from: classes4.dex */
public final class fi extends ev {

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static int f2076 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static char f2077 = 44444;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static char f2078 = 18605;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static char f2079 = 49393;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static char f2080 = 53924;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f2081;

    public fi(ef efVar, ef efVar2) {
        super(efVar, efVar2);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ev
    /* renamed from: ﻐ */
    final boolean mo7754(int i) {
        int i2 = 2 % 2;
        int i3 = f2081;
        int i4 = i3 + 5;
        f2076 = i4 % 128;
        int i5 = i4 % 2;
        if (i == 0) {
            return false;
        }
        int i6 = i3 + 87;
        f2076 = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ev
    /* renamed from: ｋ */
    final boolean mo7753(String str, String str2) {
        int i = 2 % 2;
        if (!str.equals(str2)) {
            int i2 = f2076 + 1;
            f2081 = i2 % 128;
            return i2 % 2 == 0;
        }
        int i3 = f2076 + 39;
        f2081 = i3 % 128;
        if (i3 % 2 == 0) {
            return false;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ev
    /* renamed from: ｋ */
    final boolean mo7752(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = f2076 + 15;
        int i3 = i2 % 128;
        f2081 = i3;
        int i4 = i2 % 2;
        if (obj == obj2) {
            return false;
        }
        int i5 = i3 + 105;
        f2076 = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.em
    /* renamed from: ﻛ */
    public final String mo7734() {
        int i = 2 % 2;
        int i2 = f2081 + 33;
        f2076 = i2 % 128;
        String intern = m7766("鈩㴒", i2 % 2 == 0 ? KeyEvent.keyCodeFromString("") * 3 : KeyEvent.keyCodeFromString("") + 2).intern();
        int i3 = f2076 + 25;
        f2081 = i3 % 128;
        int i4 = i3 % 2;
        return intern;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static String m7766(String str, int i) {
        String str2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (o.f3094) {
            char[] cArr3 = new char[cArr2.length];
            o.f3095 = 0;
            char[] cArr4 = new char[2];
            while (o.f3095 < cArr2.length) {
                cArr4[0] = cArr2[o.f3095];
                cArr4[1] = cArr2[o.f3095 + 1];
                int i2 = 58224;
                for (int i3 = 0; i3 < 16; i3++) {
                    char c = cArr4[1];
                    char c2 = cArr4[0];
                    char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + f2080)) ^ ((c2 >>> 5) + f2078)));
                    cArr4[1] = c3;
                    cArr4[0] = (char) (c2 - (((c3 >>> 5) + f2079) ^ ((c3 + i2) ^ ((c3 << 4) + f2077))));
                    i2 -= 40503;
                }
                cArr3[o.f3095] = cArr4[0];
                cArr3[o.f3095 + 1] = cArr4[1];
                o.f3095 += 2;
            }
            str2 = new String(cArr3, 0, i);
        }
        return str2;
    }
}
