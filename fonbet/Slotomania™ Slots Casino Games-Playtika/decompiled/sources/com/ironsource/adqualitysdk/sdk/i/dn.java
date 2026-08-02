package com.ironsource.adqualitysdk.sdk.i;

import android.media.AudioTrack;
import android.util.Log;
import android.view.View;
import android.view.ViewConfiguration;

/* loaded from: classes4.dex */
public abstract class dn extends RuntimeException {

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static char f1793 = 9365;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static int f1794 = 1;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static int f1795;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f1796;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static long f1797;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private final Throwable f1798;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private final dy f1799;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private final String f1800;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public abstract String mo7592();

    public dn(String str, dy dyVar, Throwable th) {
        this.f1800 = str;
        this.f1799 = dyVar;
        this.f1798 = th;
    }

    @Override // java.lang.Throwable
    public String toString() {
        String str;
        int i = 2 % 2;
        StringBuilder append = new StringBuilder().append(mo7592()).append(m7591((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 41182), "\u0000\u0000\u0000\u0000", "ꂪ햪\udf21꒠", "䷏┝", View.MeasureSpec.getMode(0)).intern()).append(this.f1800).append('\n').append(this.f1799);
        if (this.f1798 != null) {
            str = new StringBuilder().append(m7591((char) (ViewConfiguration.getEdgeSlop() >> 16), "\u0000\u0000\u0000\u0000", "뚙귢褀퇩", "ᗘ\ueda0梁歫欋斊ꟕ庌婥\ue8bb\uda3d\uec91", ViewConfiguration.getKeyRepeatDelay() >> 16).intern()).append(Log.getStackTraceString(this.f1798)).toString();
            int i2 = f1795 + 75;
            f1794 = i2 % 128;
            int i3 = i2 % 2;
        } else {
            str = "";
        }
        return append.append(str).toString();
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m7593(String str) {
        int i = 2 % 2;
        int i2 = f1795 + 73;
        f1794 = i2 % 128;
        int i3 = i2 % 2;
        cn.m7272(str, this.f1800, this);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m7591(char c, String str, String str2, String str3, int i) {
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
                cArr9[f.f2041] = (char) ((((cArr7[i3] ^ cArr2[f.f2041]) ^ f1797) ^ f1796) ^ f1793);
                f.f2041++;
            }
            str4 = new String(cArr9);
        }
        return str4;
    }
}
