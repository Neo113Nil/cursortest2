package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;

/* loaded from: classes4.dex */
public final class fj extends em {

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static int f2082 = 0;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static int f2083 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f2084 = 1053546823;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f2085 = -1572212177;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f2086 = 44;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static byte[] f2087 = {0};

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static short[] f2088;

    public fj(ef efVar, ef efVar2) {
        super(efVar, efVar2);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ef
    /* renamed from: ﾇ */
    public final ea mo7722(ee eeVar, cl clVar) {
        int i = 2 % 2;
        int i2 = f2083 + 65;
        f2082 = i2 % 128;
        if (i2 % 2 == 0) {
            ea m7721 = m7735().m7721(eeVar, clVar);
            ea m77212 = m7736().m7721(eeVar, clVar);
            if (!(!(m7721.m7684() instanceof String)) || (m77212.m7684() instanceof String)) {
                ea eaVar = new ea(new StringBuilder().append(m7721.m7684()).append(m77212.m7684()).toString());
                int i3 = f2082 + 51;
                f2083 = i3 % 128;
                int i4 = i3 % 2;
                return eaVar;
            }
            Number m7680 = m7721.m7680();
            Number m76802 = m77212.m7680();
            if ((m7680 instanceof Double) || (m76802 instanceof Double)) {
                return new ea(Double.valueOf(m7680.doubleValue() + m76802.doubleValue()));
            }
            if ((m7680 instanceof Long) || (m76802 instanceof Long)) {
                return new ea(Long.valueOf(m7680.longValue() + m76802.longValue()));
            }
            return new ea(Integer.valueOf(m7680.intValue() + m76802.intValue()));
        }
        ea m77213 = m7735().m7721(eeVar, clVar);
        m7736().m7721(eeVar, clVar);
        boolean z = m77213.m7684() instanceof String;
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.em
    /* renamed from: ﻛ */
    public final String mo7734() {
        int i = 2 % 2;
        int i2 = f2082 + 57;
        f2083 = i2 % 128;
        int i3 = i2 % 2;
        String intern = m7767((short) (Color.rgb(0, 0, 0) + 16777216), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 1572212220, (-44) - ImageFormat.getBitsPerPixel(0), TextUtils.getCapsMode("", 0, 0) - 1053546823, (byte) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1)).intern();
        int i4 = f2082 + 113;
        f2083 = i4 % 128;
        int i5 = i4 % 2;
        return intern;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m7767(short s, int i, int i2, int i3, byte b) {
        String obj;
        synchronized (n.f3088) {
            StringBuilder sb = new StringBuilder();
            int i4 = f2086;
            int i5 = i2 + i4;
            int i6 = i5 == -1 ? 1 : 0;
            if (i6 != 0) {
                byte[] bArr = f2087;
                if (bArr != null) {
                    i5 = (byte) (bArr[f2084 + i3] + i4);
                } else {
                    i5 = (short) (f2088[f2084 + i3] + i4);
                }
            }
            if (i5 > 0) {
                n.f3090 = ((i3 + i5) - 2) + f2084 + i6;
                n.f3091 = b;
                n.f3092 = (char) (i + f2085);
                sb.append(n.f3092);
                n.f3093 = n.f3092;
                n.f3089 = 1;
                while (n.f3089 < i5) {
                    byte[] bArr2 = f2087;
                    if (bArr2 != null) {
                        int i7 = n.f3090;
                        n.f3090 = i7 - 1;
                        n.f3092 = (char) (n.f3093 + (((byte) (bArr2[i7] + s)) ^ n.f3091));
                    } else {
                        short[] sArr = f2088;
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
