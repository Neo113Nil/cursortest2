package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.os.Process;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import java.util.Map;

/* loaded from: classes3.dex */
public final class am {

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static int f345 = 0;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static int f346 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static short[] f347 = null;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f348 = 81;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f349 = -399147315;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f350 = 675718672;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static byte[] f351 = {-13, 3, 10, 3, -21, Ascii.VT, -5, 5, 10, -18, Ascii.CR, 3, 0};

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static boolean m6012(Map<String, String> map, String str) {
        int i;
        int i2 = 2 % 2;
        int i3 = f345 + 19;
        f346 = i3 % 128;
        if (i3 % 2 == 0) {
            map.containsKey(str);
            Object obj = null;
            super.hashCode();
            throw null;
        }
        if (map.containsKey(str)) {
            int i4 = f346 + 81;
            f345 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 61 / 0;
            }
            return false;
        }
        int size = map.size();
        if (m6010(map)) {
            int i6 = f346 + 99;
            f345 = i6 % 128;
            int i7 = i6 % 2;
            i = 1;
        } else {
            i = 0;
        }
        return size >= 5 + i;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static boolean m6010(Map<String, String> map) {
        int i = 2 % 2;
        int i2 = f345 + 37;
        f346 = i2 % 128;
        int i3 = i2 % 2;
        boolean containsKey = map.containsKey(m6009((short) View.getDefaultSize(0, 0), Color.blue(0) - 675718575, (-68) - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 399147315 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (byte) (ViewConfiguration.getFadingEdgeLength() >> 16)).intern());
        int i4 = f346 + 93;
        f345 = i4 % 128;
        if (i4 % 2 == 0) {
            return containsKey;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static boolean m6008(String str) {
        int i = 2 % 2;
        int i2 = f346 + 113;
        f345 = i2 % 128;
        int i3 = i2 % 2;
        boolean equals = m6009((short) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), ((Process.getThreadPriority(0) + 20) >> 6) - 675718575, KeyEvent.getDeadChar(0, 0) - 68, 399147315 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (byte) ExpandableListView.getPackedPositionType(0L)).intern().equals(str);
        int i4 = f346 + 49;
        f345 = i4 % 128;
        if (i4 % 2 == 0) {
            return equals;
        }
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static boolean m6011(String str, String str2) {
        int i = 2 % 2;
        if (kn.m8477(str, 64) && kn.m8477(str2, 64)) {
            int i2 = f345;
            int i3 = i2 + 61;
            f346 = i3 % 128;
            r2 = i3 % 2 != 0;
            int i4 = i2 + 9;
            f346 = i4 % 128;
            int i5 = i4 % 2;
        }
        return r2;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String m6009(short s, int i, int i2, int i3, byte b) {
        String obj;
        synchronized (n.f3088) {
            StringBuilder sb = new StringBuilder();
            int i4 = f348;
            int i5 = i2 + i4;
            int i6 = i5 == -1 ? 1 : 0;
            if (i6 != 0) {
                byte[] bArr = f351;
                if (bArr != null) {
                    i5 = (byte) (bArr[f349 + i3] + i4);
                } else {
                    i5 = (short) (f347[f349 + i3] + i4);
                }
            }
            if (i5 > 0) {
                n.f3090 = ((i3 + i5) - 2) + f349 + i6;
                n.f3091 = b;
                n.f3092 = (char) (i + f350);
                sb.append(n.f3092);
                n.f3093 = n.f3092;
                n.f3089 = 1;
                while (n.f3089 < i5) {
                    byte[] bArr2 = f351;
                    if (bArr2 != null) {
                        int i7 = n.f3090;
                        n.f3090 = i7 - 1;
                        n.f3092 = (char) (n.f3093 + (((byte) (bArr2[i7] + s)) ^ n.f3091));
                    } else {
                        short[] sArr = f347;
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
