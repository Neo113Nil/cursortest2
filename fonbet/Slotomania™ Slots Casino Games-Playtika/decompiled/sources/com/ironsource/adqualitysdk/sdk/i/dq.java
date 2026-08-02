package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

/* loaded from: classes4.dex */
public final class dq extends dy {

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static char f1815 = 34341;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static char f1816 = 50355;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static char f1817 = 45488;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static char f1818 = 16768;

    public dq(String str, String str2, String str3, int i) {
        super(str, str2);
        m7664(new dw(new StringBuilder().append(str).append(m7601("峡᭙", Color.red(0) + 1).intern()).append(str2).toString(), str3, new StringBuilder().append(m7601("癗釤悯뵙\uf548滏祟\ue11b", MotionEvent.axisFromString("") + 9).intern()).append(str.toLowerCase()).append(m7601("깟紹", 1 - Gravity.getAbsoluteGravity(0, 0)).intern()).append(str2).append(m7601("ᓌ\ue539⽁ꗇ", (ViewConfiguration.getScrollBarSize() >> 8) + 4).intern()).toString(), i));
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String m7601(String str, int i) {
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
                    char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + f1817)) ^ ((c2 >>> 5) + f1816)));
                    cArr4[1] = c3;
                    cArr4[0] = (char) (c2 - (((c3 >>> 5) + f1818) ^ ((c3 + i2) ^ ((c3 << 4) + f1815))));
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
