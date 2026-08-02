package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.ironsource.adqualitysdk.sdk.i.be;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class bf extends be {

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static int f796 = 0;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static int f797 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f798 = 308991216;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f799 = 71;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static short[] f800 = null;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f801 = -1478503379;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static byte[] f802 = {78, 72, -69, -80, 66, -72, 0};

    public bf(String str) {
        super(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* renamed from: ﻛ */
    public final String mo6357() {
        int i = 2 % 2;
        int i2 = f797 + 43;
        f796 = i2 % 128;
        int i3 = i2 % 2;
        String intern = m6387((short) (ViewConfiguration.getPressedStateDuration() >> 16), (-308991147) - (ViewConfiguration.getEdgeSlop() >> 16), TextUtils.getCapsMode("", 0, 0) - 64, 1478503379 - (ViewConfiguration.getFadingEdgeLength() >> 16), (byte) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 80)).intern();
        int i4 = f797 + 49;
        f796 = i4 % 128;
        int i5 = i4 % 2;
        return intern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* renamed from: ﻐ */
    final Class mo6356(String str) {
        int i = 2 % 2;
        int i2 = f796;
        int i3 = i2 + 99;
        f797 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        int i4 = i2 + 101;
        f797 = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* renamed from: ﾇ */
    final Map<String, be.c> mo6358() {
        int i = 2 % 2;
        HashMap hashMap = new HashMap();
        int i2 = f797 + 9;
        f796 = i2 % 128;
        int i3 = i2 % 2;
        return hashMap;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* renamed from: ﻏ */
    public final boolean mo6370() {
        int i = 2 % 2;
        int i2 = f796 + 59;
        f797 = i2 % 128;
        return i2 % 2 != 0;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* renamed from: ﺙ */
    public final boolean mo6378() {
        int i = 2 % 2;
        int i2 = f797;
        int i3 = i2 + 39;
        f796 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 55;
        f796 = i5 % 128;
        if (i5 % 2 == 0) {
            return true;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m6387(short s, int i, int i2, int i3, byte b) {
        String obj;
        synchronized (n.f3088) {
            StringBuilder sb = new StringBuilder();
            int i4 = f799;
            int i5 = i2 + i4;
            int i6 = i5 == -1 ? 1 : 0;
            if (i6 != 0) {
                byte[] bArr = f802;
                if (bArr != null) {
                    i5 = (byte) (bArr[f801 + i3] + i4);
                } else {
                    i5 = (short) (f800[f801 + i3] + i4);
                }
            }
            if (i5 > 0) {
                n.f3090 = ((i3 + i5) - 2) + f801 + i6;
                n.f3091 = b;
                n.f3092 = (char) (i + f798);
                sb.append(n.f3092);
                n.f3093 = n.f3092;
                n.f3089 = 1;
                while (n.f3089 < i5) {
                    byte[] bArr2 = f802;
                    if (bArr2 != null) {
                        int i7 = n.f3090;
                        n.f3090 = i7 - 1;
                        n.f3092 = (char) (n.f3093 + (((byte) (bArr2[i7] + s)) ^ n.f3091));
                    } else {
                        short[] sArr = f800;
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
