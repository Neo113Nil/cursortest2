package com.ironsource.adqualitysdk.sdk.i;

import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import com.ironsource.adqualitysdk.sdk.i.cg;
import com.unity3d.services.UnityServices;
import com.unity3d.services.ads.adunit.AdUnitActivity;
import com.vungle.ads.internal.protos.Sdk;

/* loaded from: classes6.dex */
public final class hh extends gt {

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static int f2328 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f2329 = 0;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static char f2330 = 64967;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static char f2331 = 23541;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static char f2332 = 5472;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static char f2333 = 5366;

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ｋ */
    public final String mo7798() {
        int i = 2 % 2;
        int i2 = f2328 + 49;
        f2329 = i2 % 128;
        int i3 = i2 % 2;
        String intern = m7833("攈簾\ufdc8늬쒀剪⌫ઐ\uf40f틬ﵨ䪍備删\uf238鍡天쪧믓㢚\uf82a駇蕡\ue917\uf111챩䮄ᑇ\uf238鍡天쪧믓㢚", 34 - (ViewConfiguration.getPressedStateDuration() >> 16)).intern();
        int i4 = f2328 + 103;
        f2329 = i4 % 128;
        int i5 = i4 % 2;
        return intern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﻐ */
    public final Class mo7796() {
        int i = 2 % 2;
        int i2 = f2329;
        int i3 = i2 + 9;
        f2328 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        int i4 = i2 + 81;
        f2328 = i4 % 128;
        if (i4 % 2 != 0) {
            return UnityServices.class;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﾇ */
    public final be mo7799() {
        int i = 2 % 2;
        cg cgVar = new cg(mo7797());
        int i2 = f2329 + 13;
        f2328 = i2 % 128;
        if (i2 % 2 != 0) {
            return cgVar;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﻛ */
    public final String mo7797() {
        int i = 2 % 2;
        int i2 = f2329 + 107;
        f2328 = i2 % 128;
        return m7833("쒀剪⌫ઐ\uf786\uecebꅇ\uf76c", i2 % 2 == 0 ? 50 - (ViewConfiguration.getMaximumFlingVelocity() >> 114) : 8 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern();
    }

    public static class d extends gt {

        /* renamed from: ﱡ, reason: contains not printable characters */
        private static int f2334 = 1;

        /* renamed from: ﺙ, reason: contains not printable characters */
        private static int f2335 = 0;

        /* renamed from: ﻐ, reason: contains not printable characters */
        private static byte[] f2336 = {73, 79, -9, 81, -7, 85, 38, 17, 79, -1, 93, -11, 39, 87, -66, 79, -1, -3, 85, 71, 55, -65, 83, 71, 55, -65, 82, 70, -2, -9, 72, 81, -10, -119, Ascii.SO, 53, -66, 73, 79, -1, -3, -117, 5, 2, 80, 95, 99, 126, 105, 91, 107, 109, 0, 0};

        /* renamed from: ﻛ, reason: contains not printable characters */
        private static int f2337 = 333632552;

        /* renamed from: ｋ, reason: contains not printable characters */
        private static short[] f2338 = null;

        /* renamed from: ﾇ, reason: contains not printable characters */
        private static int f2339 = 74;

        /* renamed from: ﾒ, reason: contains not printable characters */
        private static int f2340 = -1721993239;

        @Override // com.ironsource.adqualitysdk.sdk.i.gt
        /* renamed from: ｋ */
        public final String mo7798() {
            int i = 2 % 2;
            int i2 = f2335 + 75;
            f2334 = i2 % 128;
            int i3 = i2 % 2;
            if (!m7834()) {
                return m7835((short) (View.resolveSizeAndState(0, 0, 0) - 36), 1721993339 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (-29) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), View.resolveSizeAndState(0, 0, 0) - 333632552, (byte) (31 - ExpandableListView.getPackedPositionChild(0L))).intern();
            }
            int i4 = f2335 + 99;
            f2334 = i4 % 128;
            int i5 = i4 % 2;
            return null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.gt
        /* renamed from: ﻐ */
        public final Class mo7796() {
            int i = 2 % 2;
            int i2 = f2335 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
            f2334 = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 56 / 0;
                if (!m7834()) {
                    return AdUnitActivity.class;
                }
            } else if (!m7834()) {
                return AdUnitActivity.class;
            }
            int i4 = f2335 + 103;
            f2334 = i4 % 128;
            if (i4 % 2 != 0) {
                return null;
            }
            throw null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.gt
        /* renamed from: ﾇ */
        public final be mo7799() {
            int i = 2 % 2;
            cg.c cVar = new cg.c(mo7797());
            int i2 = f2335 + 49;
            f2334 = i2 % 128;
            int i3 = i2 % 2;
            return cVar;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.gt
        /* renamed from: ﻛ */
        public final String mo7797() {
            int i = 2 % 2;
            int i2 = f2335 + 103;
            f2334 = i2 % 128;
            int i3 = i2 % 2;
            String intern = m7835((short) (21 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), 1721993356 - (ViewConfiguration.getFadingEdgeLength() >> 16), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) - 66, ((Process.getThreadPriority(0) + 20) >> 6) - 333632507, (byte) (123 - TextUtils.getOffsetBefore("", 0))).intern();
            int i4 = f2334 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
            f2335 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 9 / 0;
            }
            return intern;
        }

        /* renamed from: ﺙ, reason: contains not printable characters */
        private static boolean m7834() {
            int i = 2 % 2;
            boolean m6241 = ay.m6241(new hh());
            int i2 = f2334 + 41;
            f2335 = i2 % 128;
            int i3 = i2 % 2;
            return m6241;
        }

        /* renamed from: ﾇ, reason: contains not printable characters */
        private static String m7835(short s, int i, int i2, int i3, byte b) {
            String obj;
            synchronized (n.f3088) {
                StringBuilder sb = new StringBuilder();
                int i4 = f2339;
                int i5 = i2 + i4;
                int i6 = i5 == -1 ? 1 : 0;
                if (i6 != 0) {
                    byte[] bArr = f2336;
                    if (bArr != null) {
                        i5 = (byte) (bArr[f2337 + i3] + i4);
                    } else {
                        i5 = (short) (f2338[f2337 + i3] + i4);
                    }
                }
                if (i5 > 0) {
                    n.f3090 = ((i3 + i5) - 2) + f2337 + i6;
                    n.f3091 = b;
                    n.f3092 = (char) (i + f2340);
                    sb.append(n.f3092);
                    n.f3093 = n.f3092;
                    n.f3089 = 1;
                    while (n.f3089 < i5) {
                        byte[] bArr2 = f2336;
                        if (bArr2 != null) {
                            int i7 = n.f3090;
                            n.f3090 = i7 - 1;
                            n.f3092 = (char) (n.f3093 + (((byte) (bArr2[i7] + s)) ^ n.f3091));
                        } else {
                            short[] sArr = f2338;
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

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static String m7833(String str, int i) {
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
                    char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + f2331)) ^ ((c2 >>> 5) + f2332)));
                    cArr4[1] = c3;
                    cArr4[0] = (char) (c2 - (((c3 >>> 5) + f2333) ^ ((c3 + i2) ^ ((c3 << 4) + f2330))));
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
