package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;

/* loaded from: classes4.dex */
public final class et extends em {

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static int f2020 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static char f2021 = 5727;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f2022 = 0;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static char f2023 = 21649;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static char f2024 = 49888;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static char f2025 = 4216;

    public et(ef efVar, ef efVar2) {
        super(efVar, efVar2);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ef
    /* renamed from: ﾇ */
    public final ea mo7722(ee eeVar, cl clVar) {
        return new ea(Boolean.valueOf(m7735().m7721(eeVar, clVar).m7682() && m7736().m7721(eeVar, clVar).m7682()));
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.em
    /* renamed from: ﻛ */
    public final String mo7734() {
        int i = 2 % 2;
        int i2 = f2020 + 61;
        f2022 = i2 % 128;
        String intern = m7750("䝄⣤", i2 % 2 != 0 ? Color.alpha(0) * 2 : Color.alpha(0) + 2).intern();
        int i3 = f2022 + 59;
        f2020 = i3 % 128;
        int i4 = i3 % 2;
        return intern;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m7750(String str, int i) {
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
                    char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + f2024)) ^ ((c2 >>> 5) + f2025)));
                    cArr4[1] = c3;
                    cArr4[0] = (char) (c2 - (((c3 >>> 5) + f2023) ^ ((c3 + i2) ^ ((c3 << 4) + f2021))));
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
