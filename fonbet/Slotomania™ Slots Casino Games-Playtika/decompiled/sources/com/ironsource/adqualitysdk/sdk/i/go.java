package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.PointF;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.bytedance.sdk.openadsdk.api.init.PAGSdk;
import com.google.common.base.Ascii;
import com.vungle.ads.internal.protos.Sdk;

/* loaded from: classes6.dex */
public abstract class go extends gt {

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static int f2220 = 1;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static int f2221 = 0;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f2222 = 70;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f2223 = -1255406502;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f2224 = 1481656921;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static short[] f2225;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static byte[] f2226 = {-61, 2, -11, Ascii.CR, -3, -1, -15, -5, Ascii.ETB};

    public static class d extends go {

        /* renamed from: ﮐ, reason: contains not printable characters */
        private static int f2234 = 1;

        /* renamed from: ﻐ, reason: contains not printable characters */
        private static char f2235 = 21564;

        /* renamed from: ﻛ, reason: contains not printable characters */
        private static int f2236 = 0;

        /* renamed from: ｋ, reason: contains not printable characters */
        private static char f2237 = 43169;

        /* renamed from: ﾇ, reason: contains not printable characters */
        private static char f2238 = 44132;

        /* renamed from: ﾒ, reason: contains not printable characters */
        private static char f2239 = 27752;

        @Override // com.ironsource.adqualitysdk.sdk.i.gt
        /* renamed from: ｋ */
        public final String mo7798() {
            int i = 2 % 2;
            int i2 = f2234 + 45;
            f2236 = i2 % 128;
            String intern = m7811("뚊쫍⛲굢볖툧썊鵣牒ꂷ賍傏ꄪꇄ䒫ැ狒\uf449\uf41c饨\uf3fa涕裸늊䒫ැ狒\uf449럚ㅺ䞵≩ケ쨕ⵀ뽦", i2 % 2 != 0 ? 40 << View.MeasureSpec.makeMeasureSpec(1, 1) : View.MeasureSpec.makeMeasureSpec(0, 0) + 35).intern();
            int i3 = f2236 + 95;
            f2234 = i3 % 128;
            if (i3 % 2 != 0) {
                return intern;
            }
            throw null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.gt
        /* renamed from: ﻐ */
        public final Class mo7796() {
            int i = 2 % 2;
            int i2 = f2236 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
            int i3 = i2 % 128;
            f2234 = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 93;
            f2236 = i5 % 128;
            int i6 = i5 % 2;
            return TTAdSdk.class;
        }

        /* renamed from: ﾒ, reason: contains not printable characters */
        private static String m7811(String str, int i) {
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
                        char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + f2239)) ^ ((c2 >>> 5) + f2237)));
                        cArr4[1] = c3;
                        cArr4[0] = (char) (c2 - (((c3 >>> 5) + f2235) ^ ((c3 + i2) ^ ((c3 << 4) + f2238))));
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

    public static class c extends go {

        /* renamed from: ﮐ, reason: contains not printable characters */
        private static int f2227 = 1;

        /* renamed from: ﱡ, reason: contains not printable characters */
        private static int f2228 = 0;

        /* renamed from: ﻐ, reason: contains not printable characters */
        private static byte[] f2229 = {-29, -15, -34, -28, 17, -64, 72, -41, 7, -27, -57, 37, 9, -37, -49, Ascii.US, -29, 17, -37, -33, Ascii.SI, -39, Ascii.NAK, -31, -95, Ascii.US, -29, 17, -91, Ascii.EM, -32, Ascii.NAK, -35, Ascii.CR, Ascii.VT, 17, 7, -13, -42, 33, Ascii.FF, -34, 0};

        /* renamed from: ﻛ, reason: contains not printable characters */
        private static int f2230 = 40;

        /* renamed from: ｋ, reason: contains not printable characters */
        private static int f2231 = -1059823865;

        /* renamed from: ﾇ, reason: contains not printable characters */
        private static int f2232 = -927051618;

        /* renamed from: ﾒ, reason: contains not printable characters */
        private static short[] f2233;

        @Override // com.ironsource.adqualitysdk.sdk.i.gt
        /* renamed from: ｋ */
        public final String mo7798() {
            int i = 2 % 2;
            int i2 = f2228 + 17;
            f2227 = i2 % 128;
            int i3 = i2 % 2;
            String intern = m7810((short) ((-120) - TextUtils.indexOf((CharSequence) "", '0', 0)), 927051717 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 3 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1059823865, (byte) (106 - TextUtils.lastIndexOf("", '0'))).intern();
            int i4 = f2228 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
            f2227 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 7 / 0;
            }
            return intern;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.gt
        /* renamed from: ﻐ */
        public final Class mo7796() {
            int i = 2 % 2;
            int i2 = f2228 + 81;
            f2227 = i2 % 128;
            if (i2 % 2 != 0) {
                return PAGSdk.class;
            }
            Object obj = null;
            super.hashCode();
            throw null;
        }

        /* renamed from: ﾇ, reason: contains not printable characters */
        private static String m7810(short s, int i, int i2, int i3, byte b) {
            String obj;
            synchronized (n.f3088) {
                StringBuilder sb = new StringBuilder();
                int i4 = f2230;
                int i5 = i2 + i4;
                int i6 = i5 == -1 ? 1 : 0;
                if (i6 != 0) {
                    byte[] bArr = f2229;
                    if (bArr != null) {
                        i5 = (byte) (bArr[f2231 + i3] + i4);
                    } else {
                        i5 = (short) (f2233[f2231 + i3] + i4);
                    }
                }
                if (i5 > 0) {
                    n.f3090 = ((i3 + i5) - 2) + f2231 + i6;
                    n.f3091 = b;
                    n.f3092 = (char) (i + f2232);
                    sb.append(n.f3092);
                    n.f3093 = n.f3092;
                    n.f3089 = 1;
                    while (n.f3089 < i5) {
                        byte[] bArr2 = f2229;
                        if (bArr2 != null) {
                            int i7 = n.f3090;
                            n.f3090 = i7 - 1;
                            n.f3092 = (char) (n.f3093 + (((byte) (bArr2[i7] + s)) ^ n.f3091));
                        } else {
                            short[] sArr = f2233;
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

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﾇ */
    public final be mo7799() {
        int i = 2 % 2;
        bm bmVar = new bm(mo7797());
        int i2 = f2221 + 39;
        f2220 = i2 % 128;
        if (i2 % 2 != 0) {
            return bmVar;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﻛ */
    public final String mo7797() {
        int i = 2 % 2;
        int i2 = f2220 + 59;
        f2221 = i2 % 128;
        return (i2 % 2 != 0 ? m7809((short) ((-1) - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 1255406600 << (ViewConfiguration.getDoubleTapTimeout() >> 44), 49 % Process.getGidForName(""), (-1481656921) >> View.MeasureSpec.getSize(1), (byte) View.MeasureSpec.makeMeasureSpec(0, 0)) : m7809((short) ((r7 > 0L ? 1 : (r7 == 0L ? 0 : -1)) - 1), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 1255406600, Process.getGidForName("") - 70, (-1481656921) - View.MeasureSpec.getSize(0), (byte) View.MeasureSpec.makeMeasureSpec(0, 0))).intern();
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m7809(short s, int i, int i2, int i3, byte b) {
        String obj;
        synchronized (n.f3088) {
            StringBuilder sb = new StringBuilder();
            int i4 = f2222;
            int i5 = i2 + i4;
            int i6 = i5 == -1 ? 1 : 0;
            if (i6 != 0) {
                byte[] bArr = f2226;
                if (bArr != null) {
                    i5 = (byte) (bArr[f2224 + i3] + i4);
                } else {
                    i5 = (short) (f2225[f2224 + i3] + i4);
                }
            }
            if (i5 > 0) {
                n.f3090 = ((i3 + i5) - 2) + f2224 + i6;
                n.f3091 = b;
                n.f3092 = (char) (i + f2223);
                sb.append(n.f3092);
                n.f3093 = n.f3092;
                n.f3089 = 1;
                while (n.f3089 < i5) {
                    byte[] bArr2 = f2226;
                    if (bArr2 != null) {
                        int i7 = n.f3090;
                        n.f3090 = i7 - 1;
                        n.f3092 = (char) (n.f3093 + (((byte) (bArr2[i7] + s)) ^ n.f3091));
                    } else {
                        short[] sArr = f2225;
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
