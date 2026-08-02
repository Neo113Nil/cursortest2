package com.ironsource.adqualitysdk.sdk.i;

import android.util.TypedValue;

/* loaded from: classes4.dex */
public final class fd extends eu {

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static int f2055 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static char f2056 = 56844;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static char f2057 = 1647;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f2058 = 0;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static char f2059 = 7903;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static char f2060 = 45192;

    public fd(ef efVar, ef efVar2) {
        super(efVar, efVar2);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ev
    /* renamed from: ﻐ */
    final boolean mo7754(int i) {
        int i2 = 2 % 2;
        int i3 = f2055 + 99;
        int i4 = i3 % 128;
        f2058 = i4;
        if (i3 % 2 != 0) {
            int i5 = 39 / 0;
            if (i > 0) {
                return true;
            }
        } else if (i > 0) {
            return true;
        }
        int i6 = i4 + 75;
        f2055 = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.em
    /* renamed from: ﻛ */
    public final String mo7734() {
        int i = 2 % 2;
        int i2 = f2055 + 49;
        f2058 = i2 % 128;
        int i3 = i2 % 2;
        String intern = m7761("忦㔴", (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1).intern();
        int i4 = f2058 + 89;
        f2055 = i4 % 128;
        int i5 = i4 % 2;
        return intern;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String m7761(String str, int i) {
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
                    char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + f2057)) ^ ((c2 >>> 5) + f2060)));
                    cArr4[1] = c3;
                    cArr4[0] = (char) (c2 - (((c3 >>> 5) + f2056) ^ ((c3 + i2) ^ ((c3 << 4) + f2059))));
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
