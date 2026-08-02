package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.warren.VungleApiClient;
import io.ktor.util.date.GMTDateParser;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes5.dex */
public abstract class hl extends gt {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static char f2348 = 3;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static char[] f2349 = {'v', AbstractJsonLexerKt.UNICODE_ESC, 'n', 'g', 'l', 'e', 'w', 'x', 'y'};

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f2350 = 1;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f2351;

    public static class b extends hl {

        /* renamed from: ﻐ, reason: contains not printable characters */
        private static char f2359 = 5;

        /* renamed from: ﻛ, reason: contains not printable characters */
        private static char[] f2360 = {'c', 'o', GMTDateParser.MINUTES, '.', 'v', AbstractJsonLexerKt.UNICODE_ESC, 'n', 'g', 'l', 'e', 'w', 'a', 'r', 'V', 'A', 'p', 'i', 'C', 't', GMTDateParser.DAY_OF_MONTH, 'f', GMTDateParser.HOURS, 'j', 'k', 'q'};

        /* renamed from: ﾇ, reason: contains not printable characters */
        private static int f2361 = 1;

        /* renamed from: ﾒ, reason: contains not printable characters */
        private static int f2362;

        @Override // com.ironsource.adqualitysdk.sdk.i.gt
        /* renamed from: ｋ */
        public final String mo7798() {
            int i = 2 % 2;
            int i2 = f2362 + 75;
            f2361 = i2 % 128;
            String intern = (i2 % 2 == 0 ? m7839(19 << TextUtils.getOffsetAfter("", 1), "\u0001\u0002\u0003\u0004\u0000\t\u0007\b\t\u0005\u0000\r\f\r\u000e\u0007\b\u0001\n\b\u0007\b\t\u0005\n\u0013\u0011\u0012\u0006\u0012\u0005\u0007²", (byte) (22 << View.MeasureSpec.getSize(1))) : m7839(TextUtils.getOffsetAfter("", 0) + 33, "\u0001\u0002\u0003\u0004\u0000\t\u0007\b\t\u0005\u0000\r\f\r\u000e\u0007\b\u0001\n\b\u0007\b\t\u0005\n\u0013\u0011\u0012\u0006\u0012\u0005\u0007²", (byte) (View.MeasureSpec.getSize(0) + 62))).intern();
            int i3 = f2362 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
            f2361 = i3 % 128;
            if (i3 % 2 != 0) {
                return intern;
            }
            Object obj = null;
            super.hashCode();
            throw null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.gt
        /* renamed from: ﻐ */
        public final Class mo7796() {
            int i = 2 % 2;
            int i2 = f2362 + 31;
            f2361 = i2 % 128;
            if (i2 % 2 != 0) {
                return VungleApiClient.class;
            }
            throw null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.gt
        /* renamed from: ﾇ */
        public final be mo7799() {
            int i = 2 % 2;
            cc ccVar = new cc(m7839((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 5, "\u0000\t\u0007\b\t\u0005", (byte) (Color.argb(0, 0, 0, 0) + 70)).intern());
            int i2 = f2361 + 77;
            f2362 = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 54 / 0;
            }
            return ccVar;
        }

        /* renamed from: ﻛ, reason: contains not printable characters */
        private static String m7839(int i, String str, byte b) {
            String str2;
            char[] cArr = str;
            if (str != null) {
                cArr = str.toCharArray();
            }
            char[] cArr2 = cArr;
            synchronized (j.f2674) {
                char[] cArr3 = f2360;
                char c = f2359;
                char[] cArr4 = new char[i];
                if (i % 2 != 0) {
                    i--;
                    cArr4[i] = (char) (cArr2[i] - b);
                }
                if (i > 1) {
                    j.f2681 = 0;
                    while (j.f2681 < i) {
                        j.f2680 = cArr2[j.f2681];
                        j.f2677 = cArr2[j.f2681 + 1];
                        if (j.f2680 == j.f2677) {
                            cArr4[j.f2681] = (char) (j.f2680 - b);
                            cArr4[j.f2681 + 1] = (char) (j.f2677 - b);
                        } else {
                            j.f2679 = j.f2680 / c;
                            j.f2676 = j.f2680 % c;
                            j.f2678 = j.f2677 / c;
                            j.f2675 = j.f2677 % c;
                            if (j.f2676 == j.f2675) {
                                j.f2679 = ((j.f2679 + c) - 1) % c;
                                j.f2678 = ((j.f2678 + c) - 1) % c;
                                int i2 = (j.f2679 * c) + j.f2676;
                                int i3 = (j.f2678 * c) + j.f2675;
                                cArr4[j.f2681] = cArr3[i2];
                                cArr4[j.f2681 + 1] = cArr3[i3];
                            } else if (j.f2679 == j.f2678) {
                                j.f2676 = ((j.f2676 + c) - 1) % c;
                                j.f2675 = ((j.f2675 + c) - 1) % c;
                                int i4 = (j.f2679 * c) + j.f2676;
                                int i5 = (j.f2678 * c) + j.f2675;
                                cArr4[j.f2681] = cArr3[i4];
                                cArr4[j.f2681 + 1] = cArr3[i5];
                            } else {
                                int i6 = (j.f2679 * c) + j.f2675;
                                int i7 = (j.f2678 * c) + j.f2676;
                                cArr4[j.f2681] = cArr3[i6];
                                cArr4[j.f2681 + 1] = cArr3[i7];
                            }
                        }
                        j.f2681 += 2;
                    }
                }
                str2 = new String(cArr4);
            }
            return str2;
        }
    }

    public static class a extends hl {

        /* renamed from: ﱟ, reason: contains not printable characters */
        private static int f2352 = 0;

        /* renamed from: ﺙ, reason: contains not printable characters */
        private static int f2353 = 1;

        /* renamed from: ﻐ, reason: contains not printable characters */
        private static int f2354 = 67;

        /* renamed from: ﻛ, reason: contains not printable characters */
        private static short[] f2355 = null;

        /* renamed from: ｋ, reason: contains not printable characters */
        private static int f2356 = 1721737273;

        /* renamed from: ﾇ, reason: contains not printable characters */
        private static int f2357 = -1536501439;

        /* renamed from: ﾒ, reason: contains not printable characters */
        private static byte[] f2358 = {-20, 73, 70, -77, -78, 102, -107, -74, 96, -109, -74, 74, -74, -74, 80, 103, -116, -74, 76, -73, 76, SignedBytes.MAX_POWER_OF_TWO, -72, Ascii.SI, -115, 68, -68, -77, 66, -66, 73, 74, 116, -12, SignedBytes.MAX_POWER_OF_TWO, 76, 124, -122, -74, 74, -74, -74, -80, 7, -114, -79, 67};

        @Override // com.ironsource.adqualitysdk.sdk.i.gt
        /* renamed from: ｋ */
        public final String mo7798() {
            int i = 2 % 2;
            int i2 = f2353 + 77;
            f2352 = i2 % 128;
            int i3 = i2 % 2;
            String intern = m7838((short) (ViewConfiguration.getTouchSlop() >> 8), 1536501537 - TextUtils.lastIndexOf("", '0', 0, 0), Gravity.getAbsoluteGravity(0, 0) - 68, (-1721737273) - (ViewConfiguration.getScrollDefaultDelay() >> 16), (byte) (79 - View.MeasureSpec.makeMeasureSpec(0, 0))).intern();
            int i4 = f2353 + 33;
            f2352 = i4 % 128;
            int i5 = i4 % 2;
            return intern;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.gt
        /* renamed from: ﻐ */
        public final Class mo7796() {
            int i = 2 % 2;
            int i2 = f2353 + 77;
            f2352 = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 52 / 0;
            }
            return com.vungle.ads.internal.network.VungleApiClient.class;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.gt
        /* renamed from: ﾇ */
        public final be mo7799() {
            int i = 2 % 2;
            cj cjVar = new cj(mo7797());
            int i2 = f2352 + 21;
            f2353 = i2 % 128;
            if (i2 % 2 != 0) {
                return cjVar;
            }
            throw null;
        }

        /* renamed from: ﾒ, reason: contains not printable characters */
        private static String m7838(short s, int i, int i2, int i3, byte b) {
            String obj;
            synchronized (n.f3088) {
                StringBuilder sb = new StringBuilder();
                int i4 = f2354;
                int i5 = i2 + i4;
                int i6 = i5 == -1 ? 1 : 0;
                if (i6 != 0) {
                    byte[] bArr = f2358;
                    if (bArr != null) {
                        i5 = (byte) (bArr[f2356 + i3] + i4);
                    } else {
                        i5 = (short) (f2355[f2356 + i3] + i4);
                    }
                }
                if (i5 > 0) {
                    n.f3090 = ((i3 + i5) - 2) + f2356 + i6;
                    n.f3091 = b;
                    n.f3092 = (char) (i + f2357);
                    sb.append(n.f3092);
                    n.f3093 = n.f3092;
                    n.f3089 = 1;
                    while (n.f3089 < i5) {
                        byte[] bArr2 = f2358;
                        if (bArr2 != null) {
                            int i7 = n.f3090;
                            n.f3090 = i7 - 1;
                            n.f3092 = (char) (n.f3093 + (((byte) (bArr2[i7] + s)) ^ n.f3091));
                        } else {
                            short[] sArr = f2355;
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
    /* renamed from: ﻛ */
    public final String mo7797() {
        int red;
        int maximumDrawingCacheSize;
        int i = 2 % 2;
        int i2 = f2351 + 41;
        f2350 = i2 % 128;
        if (i2 % 2 == 0) {
            red = 53 << Color.red(0);
            maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >>> 90) + Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE;
        } else {
            red = Color.red(0) + 6;
            maximumDrawingCacheSize = 6 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
        }
        return m7837(red, "\u0001\u0002\u0000\u0005\u0005\u0003", (byte) maximumDrawingCacheSize).intern();
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m7837(int i, String str, byte b2) {
        String str2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (j.f2674) {
            char[] cArr3 = f2349;
            char c = f2348;
            char[] cArr4 = new char[i];
            if (i % 2 != 0) {
                i--;
                cArr4[i] = (char) (cArr2[i] - b2);
            }
            if (i > 1) {
                j.f2681 = 0;
                while (j.f2681 < i) {
                    j.f2680 = cArr2[j.f2681];
                    j.f2677 = cArr2[j.f2681 + 1];
                    if (j.f2680 == j.f2677) {
                        cArr4[j.f2681] = (char) (j.f2680 - b2);
                        cArr4[j.f2681 + 1] = (char) (j.f2677 - b2);
                    } else {
                        j.f2679 = j.f2680 / c;
                        j.f2676 = j.f2680 % c;
                        j.f2678 = j.f2677 / c;
                        j.f2675 = j.f2677 % c;
                        if (j.f2676 == j.f2675) {
                            j.f2679 = ((j.f2679 + c) - 1) % c;
                            j.f2678 = ((j.f2678 + c) - 1) % c;
                            int i2 = (j.f2679 * c) + j.f2676;
                            int i3 = (j.f2678 * c) + j.f2675;
                            cArr4[j.f2681] = cArr3[i2];
                            cArr4[j.f2681 + 1] = cArr3[i3];
                        } else if (j.f2679 == j.f2678) {
                            j.f2676 = ((j.f2676 + c) - 1) % c;
                            j.f2675 = ((j.f2675 + c) - 1) % c;
                            int i4 = (j.f2679 * c) + j.f2676;
                            int i5 = (j.f2678 * c) + j.f2675;
                            cArr4[j.f2681] = cArr3[i4];
                            cArr4[j.f2681 + 1] = cArr3[i5];
                        } else {
                            int i6 = (j.f2679 * c) + j.f2675;
                            int i7 = (j.f2678 * c) + j.f2676;
                            cArr4[j.f2681] = cArr3[i6];
                            cArr4[j.f2681 + 1] = cArr3[i7];
                        }
                    }
                    j.f2681 += 2;
                }
            }
            str2 = new String(cArr4);
        }
        return str2;
    }
}
