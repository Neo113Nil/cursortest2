package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import com.google.common.base.Ascii;

/* loaded from: classes4.dex */
public final class ga extends fz {

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static int f2158 = 1;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static int f2159 = 0;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f2160 = 107;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static short[] f2161 = null;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f2162 = 1380459327;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f2163 = 871082476;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static byte[] f2164 = {-100, -78, -4, -3, 1, Ascii.SI, -13, -100, -51, -4, -3, 1, Ascii.SI, -13};

    public ga(ef efVar) {
        super(efVar);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.fz, com.ironsource.adqualitysdk.sdk.i.gb
    /* renamed from: ﾒ */
    public final ea mo7776(ee eeVar, cl clVar) {
        int i = 2 % 2;
        int i2 = f2158 + 99;
        f2159 = i2 % 128;
        int i3 = i2 % 2;
        ea mo7776 = super.mo7776(eeVar, clVar);
        mo7776.m7681(true);
        int i4 = f2158 + 19;
        f2159 = i4 % 128;
        int i5 = i4 % 2;
        return mo7776;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.fz
    public final String toString() {
        int i = 2 % 2;
        int i2 = f2159 + 45;
        f2158 = i2 % 128;
        int i3 = i2 % 2;
        if (m7784() == null) {
            return m7786((short) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (KeyEvent.getMaxKeyCode() >> 16) - 871082362, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 109, Gravity.getAbsoluteGravity(0, 0) - 1380459320, (byte) TextUtils.getOffsetBefore("", 0)).intern();
        }
        String obj = new StringBuilder().append(m7786((short) (TextUtils.lastIndexOf("", '0', 0) + 1), (-871082363) - TextUtils.indexOf((CharSequence) "", '0'), Color.argb(0, 0, 0, 0) - 108, (-1380459327) - KeyEvent.getDeadChar(0, 0), (byte) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1)).intern()).append(super.toString()).toString();
        int i4 = f2159 + 81;
        f2158 = i4 % 128;
        if (i4 % 2 != 0) {
            return obj;
        }
        Object obj2 = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m7786(short s, int i, int i2, int i3, byte b) {
        String obj;
        synchronized (n.f3088) {
            StringBuilder sb = new StringBuilder();
            int i4 = f2160;
            int i5 = i2 + i4;
            int i6 = i5 == -1 ? 1 : 0;
            if (i6 != 0) {
                byte[] bArr = f2164;
                if (bArr != null) {
                    i5 = (byte) (bArr[f2162 + i3] + i4);
                } else {
                    i5 = (short) (f2161[f2162 + i3] + i4);
                }
            }
            if (i5 > 0) {
                n.f3090 = ((i3 + i5) - 2) + f2162 + i6;
                n.f3091 = b;
                n.f3092 = (char) (i + f2163);
                sb.append(n.f3092);
                n.f3093 = n.f3092;
                n.f3089 = 1;
                while (n.f3089 < i5) {
                    byte[] bArr2 = f2164;
                    if (bArr2 != null) {
                        int i7 = n.f3090;
                        n.f3090 = i7 - 1;
                        n.f3092 = (char) (n.f3093 + (((byte) (bArr2[i7] + s)) ^ n.f3091));
                    } else {
                        short[] sArr = f2161;
                        int i8 = n.f3090;
                        n.f3090 = i8 - 1;
                        n.f3092 = (char) (n.f3093 + (((short) (sArr[i8] + s)) ^ n.f3091));
                    }
                    sb.append(n.f3092);
                    n.f3093 = n.f3092;
                    n.f3089++;
                }
            }
            obj = sb.toString();
        }
        return obj;
    }
}
