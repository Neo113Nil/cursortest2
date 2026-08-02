package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* loaded from: classes4.dex */
public final class fp extends ef {

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static short[] f2103 = null;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static int f2104 = 1;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static int f2105;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f2106;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static byte[] f2107;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static final fp f2108;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f2109;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f2110;

    /* renamed from: ﻛ, reason: contains not printable characters */
    static void m7770() {
        f2109 = 757713460;
        f2106 = 20;
        f2110 = -903153225;
        f2107 = new byte[]{-16, -116, 87, -121};
    }

    static {
        m7770();
        f2108 = new fp();
        int i = f2105 + 41;
        f2104 = i % 128;
        int i2 = i % 2;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static synchronized fp m7771() {
        fp fpVar;
        synchronized (fp.class) {
            int i = 2 % 2;
            int i2 = f2105 + 5;
            f2104 = i2 % 128;
            if (i2 % 2 == 0) {
                fpVar = f2108;
                int i3 = 26 / 0;
            } else {
                fpVar = f2108;
            }
        }
        return fpVar;
    }

    private fp() {
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ef
    /* renamed from: ﾇ */
    public final ea mo7722(ee eeVar, cl clVar) {
        int i = 2 % 2;
        ea eaVar = new ea(null);
        int i2 = f2104 + 85;
        f2105 = i2 % 128;
        int i3 = i2 % 2;
        return eaVar;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = f2105 + 43;
        f2104 = i2 % 128;
        int i3 = i2 % 2;
        String intern = m7772((short) ((ViewConfiguration.getFadingEdgeLength() >> 16) - 110), 903153335 - View.MeasureSpec.makeMeasureSpec(0, 0), (ViewConfiguration.getEdgeSlop() >> 16) - 21, (-757713461) - TextUtils.indexOf((CharSequence) "", '0', 0), (byte) (30 - (KeyEvent.getMaxKeyCode() >> 16))).intern();
        int i4 = f2105 + 39;
        f2104 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 28 / 0;
        }
        return intern;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m7772(short s, int i, int i2, int i3, byte b) {
        String obj;
        synchronized (n.f3088) {
            StringBuilder sb = new StringBuilder();
            int i4 = f2106;
            int i5 = i2 + i4;
            int i6 = i5 == -1 ? 1 : 0;
            if (i6 != 0) {
                byte[] bArr = f2107;
                if (bArr != null) {
                    i5 = (byte) (bArr[f2109 + i3] + i4);
                } else {
                    i5 = (short) (f2103[f2109 + i3] + i4);
                }
            }
            if (i5 > 0) {
                n.f3090 = ((i3 + i5) - 2) + f2109 + i6;
                n.f3091 = b;
                n.f3092 = (char) (i + f2110);
                sb.append(n.f3092);
                n.f3093 = n.f3092;
                n.f3089 = 1;
                while (n.f3089 < i5) {
                    byte[] bArr2 = f2107;
                    if (bArr2 != null) {
                        int i7 = n.f3090;
                        n.f3090 = i7 - 1;
                        n.f3092 = (char) (n.f3093 + (((byte) (bArr2[i7] + s)) ^ n.f3091));
                    } else {
                        short[] sArr = f2103;
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
