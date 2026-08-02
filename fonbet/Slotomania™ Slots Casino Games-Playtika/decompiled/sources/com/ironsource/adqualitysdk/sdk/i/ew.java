package com.ironsource.adqualitysdk.sdk.i;

import android.view.Gravity;

/* loaded from: classes4.dex */
public final class ew extends ey {

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static int f2030 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static char f2031 = 17857;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static char f2032 = 52253;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f2033 = 0;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static char f2034 = 21300;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static char f2035 = 5612;

    public ew(ef efVar, ef efVar2) {
        super(efVar, efVar2);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ey
    /* renamed from: ｋ, reason: contains not printable characters */
    public final Number mo7756(Number number, Number number2) {
        int i = 2 % 2;
        int i2 = f2033 + 69;
        int i3 = i2 % 128;
        f2030 = i3;
        int i4 = i2 % 2;
        if ((number instanceof Double) || (number2 instanceof Double)) {
            return Double.valueOf(number.doubleValue() / number2.doubleValue());
        }
        if (!(number instanceof Long)) {
            int i5 = i3 + 41;
            f2033 = i5 % 128;
            if (i5 % 2 != 0) {
                boolean z = number2 instanceof Long;
                throw null;
            }
            if (!(number2 instanceof Long)) {
                return Integer.valueOf(number.intValue() / number2.intValue());
            }
        }
        Long valueOf = Long.valueOf(number.longValue() / number2.longValue());
        int i6 = f2033 + 51;
        f2030 = i6 % 128;
        int i7 = i6 % 2;
        return valueOf;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.em
    /* renamed from: ﻛ */
    public final String mo7734() {
        int i = 2 % 2;
        int i2 = f2033 + 55;
        f2030 = i2 % 128;
        return (i2 % 2 == 0 ? m7755("\ue424쫥", 0 - Gravity.getAbsoluteGravity(0, 0)) : m7755("\ue424쫥", 1 - Gravity.getAbsoluteGravity(0, 0))).intern();
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m7755(String str, int i) {
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
                    char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + f2035)) ^ ((c2 >>> 5) + f2034)));
                    cArr4[1] = c3;
                    cArr4[0] = (char) (c2 - (((c3 >>> 5) + f2031) ^ ((c3 + i2) ^ ((c3 << 4) + f2032))));
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
