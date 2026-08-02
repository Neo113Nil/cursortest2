package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import android.view.KeyEvent;

/* loaded from: classes4.dex */
public final class cn {

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static int f1489 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static char f1490 = 58611;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static char f1491 = 46970;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f1492 = 0;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static char f1493 = 58567;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static char f1494 = 2041;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static void m7271(String str, String str2) {
        int i = 2 % 2;
        m.m8541(new StringBuilder().append(m7270("蝈\uf6c8瑆䃘", 4 - KeyEvent.normalizeMetaState(0)).intern()).append(str).toString(), str2);
        int i2 = f1492 + 97;
        f1489 = i2 % 128;
        int i3 = i2 % 2;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m7273(String str, String str2) {
        int i = 2 % 2;
        int i2 = f1489 + 13;
        f1492 = i2 % 128;
        int i3 = i2 % 2;
        m7269(str, str2, null, null);
        int i4 = f1489 + 57;
        f1492 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static void m7268(String str, String str2, Throwable th) {
        int i = 2 % 2;
        int i2 = f1489 + 101;
        f1492 = i2 % 128;
        int i3 = i2 % 2;
        m7269(str, str2, th, null);
        int i4 = f1492 + 17;
        f1489 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static void m7272(String str, String str2, dn dnVar) {
        int i = 2 % 2;
        int i2 = f1492 + 77;
        f1489 = i2 % 128;
        int i3 = i2 % 2;
        m7269(str, str2, null, dnVar);
        int i4 = f1489 + 105;
        f1492 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 92 / 0;
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static void m7269(String str, String str2, Throwable th, dn dnVar) {
        int i = 2 % 2;
        kl.m8447(new StringBuilder().append(m7270("蝈\uf6c8♾馀", TextUtils.indexOf((CharSequence) "", '0') + 5).intern()).append(str).toString(), str2, Integer.toHexString(str2.hashCode()), th, dnVar, null, false);
        int i2 = f1489 + 41;
        f1492 = i2 % 128;
        int i3 = i2 % 2;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m7270(String str, int i) {
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
                    char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + f1491)) ^ ((c2 >>> 5) + f1494)));
                    cArr4[1] = c3;
                    cArr4[0] = (char) (c2 - (((c3 >>> 5) + f1493) ^ ((c3 + i2) ^ ((c3 << 4) + f1490))));
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
