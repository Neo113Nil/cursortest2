package com.ironsource.adqualitysdk.sdk.i;

import android.media.MediaPlayer;
import android.os.Process;
import android.view.View;

/* loaded from: classes4.dex */
public final class hm extends hi<MediaPlayer.OnInfoListener> implements MediaPlayer.OnInfoListener {

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static long f2363 = -2361711480239749084L;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f2364 = 0;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f2365 = 1;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private e f2366;

    public interface e {
        /* renamed from: ﻛ */
        boolean mo7410(hm hmVar, MediaPlayer mediaPlayer, int i, int i2);
    }

    public hm(MediaPlayer.OnInfoListener onInfoListener, e eVar) {
        super(onInfoListener);
        this.f2366 = eVar;
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        int i3 = 2 % 2;
        try {
            this.f2366.mo7410(this, mediaPlayer, i, i2);
            int i4 = f2364 + 31;
            f2365 = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            kl.m8458(m7840("桤\uf812栫돟㻵\uf058ꏞ⛷䢒탉荋٠⤷넢\ue2d2朗\u09b1醴쉣䒌\uea47爙℥ꐸ쫀劉µ", View.MeasureSpec.getMode(0)).intern(), m7840("誗\u242f諒`Ⴁⱹ࿕ࢢꩵ\u0cbb⽞⠳쮗洆仓䥏\ueb6b䶒湤櫉ࢲ긥贂詿⡧躴겙ꯔ䦙\uefcd차", (Process.getThreadPriority(0) + 20) >> 6).intern(), th, false);
        }
        if (mo6363() == null) {
            return false;
        }
        int i6 = f2364 + 5;
        f2365 = i6 % 128;
        int i7 = i6 % 2;
        boolean onInfo = mo6363().onInfo(mediaPlayer, i, i2);
        int i8 = f2364 + 91;
        f2365 = i8 % 128;
        if (i8 % 2 != 0) {
            return onInfo;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m7840(String str, int i) {
        String str2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (g.f2155) {
            char[] m7785 = g.m7785(f2363, cArr2, i);
            g.f2157 = 4;
            while (g.f2157 < m7785.length) {
                g.f2156 = g.f2157 - 4;
                m7785[g.f2157] = (char) ((m7785[g.f2157] ^ m7785[g.f2157 % 4]) ^ (g.f2156 * f2363));
                g.f2157++;
            }
            str2 = new String(m7785, 4, m7785.length - 4);
        }
        return str2;
    }
}
