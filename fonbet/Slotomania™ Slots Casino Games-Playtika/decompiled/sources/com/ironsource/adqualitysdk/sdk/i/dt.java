package com.ironsource.adqualitysdk.sdk.i;

import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;

/* loaded from: classes4.dex */
public final class dt extends dr {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f1827 = 0;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f1828 = 1;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static char f1829 = 60620;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f1830;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static long f1831;

    public dt(cl clVar, String str, String str2) {
        super(clVar, null, new StringBuilder().append(str2).append(m7604((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), "\u0000\u0000\u0000\u0000", "\ued8f䀼챮䳬", "Ⅾ嘬έ뎯ꕳ쯐ᄣ帱抗", 1849703661 - (ViewConfiguration.getFadingEdgeLength() >> 16)).intern()).append(str).append(m7604((char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 48083), "\u0000\u0000\u0000\u0000", "밺뚫폰쮻", "ᒜ缧\ue45d붶ࢶ⣱戅蟵廀럩猆⬰拽陟", View.combineMeasuredStates(0, 0)).intern()).toString());
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.dr, com.ironsource.adqualitysdk.sdk.i.dn
    /* renamed from: ﻛ */
    public final String mo7592() {
        int i = 2 % 2;
        int i2 = f1827 + 63;
        f1828 = i2 % 128;
        String intern = (i2 % 2 == 0 ? m7604((char) TextUtils.indexOf("", "", 0), "\u0000\u0000\u0000\u0000", "퇏␢ﲇ톕", "ﶝ肶\uf8d4ⴑ监\uf8b1\ud9ef䆕醄鈴曉㟵뭈ᙳ㓸⽌苽똯\uf6f2畆넏狇蔯᪄䛖꽆嬱剂듡≋\ud988ꐪ닞ໞ뎢", (-2027674928) - (Process.getElapsedCpuTime() > 1L ? 1 : (Process.getElapsedCpuTime() == 1L ? 0 : -1))) : m7604((char) TextUtils.indexOf("", "", 0), "\u0000\u0000\u0000\u0000", "퇏␢ﲇ톕", "ﶝ肶\uf8d4ⴑ监\uf8b1\ud9ef䆕醄鈴曉㟵뭈ᙳ㓸⽌苽똯\uf6f2畆넏狇蔯᪄䛖꽆嬱剂듡≋\ud988ꐪ닞ໞ뎢", (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 2027674928)).intern();
        int i3 = f1827 + 17;
        f1828 = i3 % 128;
        if (i3 % 2 != 0) {
            return intern;
        }
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String m7604(char c, String str, String str2, String str3, int i) {
        String str4;
        char[] cArr = str3;
        if (str3 != null) {
            cArr = str3.toCharArray();
        }
        char[] cArr2 = cArr;
        char[] cArr3 = str2;
        if (str2 != null) {
            cArr3 = str2.toCharArray();
        }
        char[] cArr4 = cArr3;
        char[] cArr5 = str;
        if (str != null) {
            cArr5 = str.toCharArray();
        }
        char[] cArr6 = cArr5;
        synchronized (f.f2042) {
            char[] cArr7 = (char[]) cArr4.clone();
            char[] cArr8 = (char[]) cArr6.clone();
            cArr7[0] = (char) (c ^ cArr7[0]);
            cArr8[2] = (char) (cArr8[2] + ((char) i));
            int length = cArr2.length;
            char[] cArr9 = new char[length];
            f.f2041 = 0;
            while (f.f2041 < length) {
                int i2 = (f.f2041 + 2) % 4;
                int i3 = (f.f2041 + 3) % 4;
                f.f2043 = (char) (((cArr7[f.f2041 % 4] * 32718) + cArr8[i2]) % 65535);
                cArr8[i3] = (char) (((cArr7[i3] * 32718) + cArr8[i2]) / 65535);
                cArr7[i3] = f.f2043;
                cArr9[f.f2041] = (char) ((((cArr7[i3] ^ cArr2[f.f2041]) ^ f1831) ^ f1830) ^ f1829);
                f.f2041++;
            }
            str4 = new String(cArr9);
        }
        return str4;
    }
}
