package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.graphics.PointF;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import com.google.android.exoplayer2.C;
import com.ironsource.adqualitysdk.sdk.i.bw;
import com.mbridge.msdk.MBridgeSDK;
import com.mintegral.msdk.MIntegralSDK;
import io.ktor.util.date.GMTDateParser;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes5.dex */
public final class ha {
    public ha() {
    }

    public static class d extends gt {

        /* renamed from: ﻐ, reason: contains not printable characters */
        private static int f2293 = 0;

        /* renamed from: ﻛ, reason: contains not printable characters */
        private static int f2294 = 1;

        /* renamed from: ﾇ, reason: contains not printable characters */
        private static char[] f2295 = {'?', 133, 138, 'i', 'i', 135, 135, 141, 136, 130, 136, 133, 130, 'i', 'i', 140, 135, 131, GMTDateParser.HOURS, GMTDateParser.YEAR, 'g', 'w', 141, 136, 130, 136, 133, 130, AbstractJsonLexerKt.BEGIN_OBJ, 'g', 'c', '2', 'l', 'q', 'k', 'k', 'l', 'f', 'i', 'l'};

        @Override // com.ironsource.adqualitysdk.sdk.i.gt
        /* renamed from: ｋ */
        public final String mo7798() {
            int i = 2 % 2;
            int i2 = f2293 + 87;
            f2294 = i2 % 128;
            int i3 = i2 % 2;
            String intern = m7825("\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001", new int[]{0, 31, 28, 0}, false).intern();
            int i4 = f2293 + 19;
            f2294 = i4 % 128;
            if (i4 % 2 != 0) {
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
            int i2 = f2293 + 79;
            int i3 = i2 % 128;
            f2294 = i3;
            if (i2 % 2 == 0) {
                throw null;
            }
            int i4 = i3 + 17;
            f2293 = i4 % 128;
            int i5 = i4 % 2;
            return MIntegralSDK.class;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.gt
        /* renamed from: ﾇ */
        public final be mo7799() {
            int i = 2 % 2;
            bw.a aVar = new bw.a(mo7797());
            int i2 = f2293 + 23;
            f2294 = i2 % 128;
            int i3 = i2 % 2;
            return aVar;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.gt
        /* renamed from: ﻛ */
        public final String mo7797() {
            int i = 2 % 2;
            int i2 = f2294 + 29;
            f2293 = i2 % 128;
            int i3 = i2 % 2;
            String intern = m7825("\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001", new int[]{31, 9, 0, 5}, true).intern();
            int i4 = f2293 + 37;
            f2294 = i4 % 128;
            int i5 = i4 % 2;
            return intern;
        }

        /* renamed from: ﻛ, reason: contains not printable characters */
        private static String m7825(String str, int[] iArr, boolean z) {
            String str2;
            byte[] bArr = str;
            if (str != null) {
                bArr = str.getBytes(C.ISO88591_NAME);
            }
            byte[] bArr2 = bArr;
            synchronized (h.f2286) {
                int i = iArr[0];
                int i2 = iArr[1];
                int i3 = iArr[2];
                int i4 = iArr[3];
                char[] cArr = new char[i2];
                System.arraycopy(f2295, i, cArr, 0, i2);
                if (bArr2 != null) {
                    char[] cArr2 = new char[i2];
                    h.f2287 = 0;
                    char c = 0;
                    while (h.f2287 < i2) {
                        if (bArr2[h.f2287] == 1) {
                            cArr2[h.f2287] = (char) (((cArr[h.f2287] << 1) + 1) - c);
                        } else {
                            cArr2[h.f2287] = (char) ((cArr[h.f2287] << 1) - c);
                        }
                        c = cArr2[h.f2287];
                        h.f2287++;
                    }
                    cArr = cArr2;
                }
                if (i4 > 0) {
                    char[] cArr3 = new char[i2];
                    System.arraycopy(cArr, 0, cArr3, 0, i2);
                    int i5 = i2 - i4;
                    System.arraycopy(cArr3, 0, cArr, i5, i4);
                    System.arraycopy(cArr3, i4, cArr, 0, i5);
                }
                if (z) {
                    char[] cArr4 = new char[i2];
                    h.f2287 = 0;
                    while (h.f2287 < i2) {
                        cArr4[h.f2287] = cArr[(i2 - h.f2287) - 1];
                        h.f2287++;
                    }
                    cArr = cArr4;
                }
                if (i3 > 0) {
                    h.f2287 = 0;
                    while (h.f2287 < i2) {
                        cArr[h.f2287] = (char) (cArr[h.f2287] - iArr[2]);
                        h.f2287++;
                    }
                }
                str2 = new String(cArr);
            }
            return str2;
        }
    }

    public static class a extends gt {

        /* renamed from: ﻐ, reason: contains not printable characters */
        private static char f2288 = 50998;

        /* renamed from: ﻛ, reason: contains not printable characters */
        private static int f2289 = 0;

        /* renamed from: ｋ, reason: contains not printable characters */
        private static int f2290 = 0;

        /* renamed from: ﾇ, reason: contains not printable characters */
        private static int f2291 = 1;

        /* renamed from: ﾒ, reason: contains not printable characters */
        private static long f2292;

        @Override // com.ironsource.adqualitysdk.sdk.i.gt
        /* renamed from: ｋ */
        public final String mo7798() {
            char offsetAfter;
            char c;
            int i = 2 % 2;
            int i2 = f2291 + 99;
            f2289 = i2 % 128;
            if (i2 % 2 != 0) {
                offsetAfter = (char) (TextUtils.getOffsetAfter("", 0) * 36186);
                c = 'e';
            } else {
                offsetAfter = (char) (36186 - TextUtils.getOffsetAfter("", 0));
                c = '0';
            }
            return m7824(offsetAfter, "\u0000\u0000\u0000\u0000", "ㇳ␟婏ⲍ", "\ue30a嵡ꂃ人鱿㪛睔匏瞬\ue517ᙲ\ud9bf渠꼖撙\ue5a2ꐴ\uefc7⣋\ue3f5\uf648銷뭄뻦ㄝ崨\ue537", 8033 - AndroidCharacter.getMirror(c)).intern();
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.gt
        /* renamed from: ﻐ */
        public final Class mo7796() {
            int i = 2 % 2;
            int i2 = f2289 + 31;
            int i3 = i2 % 128;
            f2291 = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 3;
            f2289 = i5 % 128;
            if (i5 % 2 == 0) {
                return MBridgeSDK.class;
            }
            Object obj = null;
            super.hashCode();
            throw null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.gt
        /* renamed from: ﾇ */
        public final be mo7799() {
            int i = 2 % 2;
            bw.b bVar = new bw.b(mo7797());
            int i2 = f2291 + 27;
            f2289 = i2 % 128;
            int i3 = i2 % 2;
            return bVar;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.gt
        /* renamed from: ﻛ */
        public final String mo7797() {
            int i = 2 % 2;
            int i2 = f2291 + 79;
            f2289 = i2 % 128;
            String intern = (i2 % 2 != 0 ? m7824((char) (PointF.length(1.0f, 1.0f) > 2.0f ? 1 : (PointF.length(1.0f, 1.0f) == 2.0f ? 0 : -1)), "\u0000\u0000\u0000\u0000", "몺炂䔋麔", "ꃄ䪭䓓榚睂茐낳焗揱", 191922873 << TextUtils.lastIndexOf("", 'f', 0)) : m7824((char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), "\u0000\u0000\u0000\u0000", "몺炂䔋麔", "ꃄ䪭䓓榚睂茐낳焗揱", 191922873 - TextUtils.lastIndexOf("", '0', 0))).intern();
            int i3 = f2291 + 29;
            f2289 = i3 % 128;
            if (i3 % 2 == 0) {
                return intern;
            }
            Object obj = null;
            super.hashCode();
            throw null;
        }

        /* renamed from: ﻐ, reason: contains not printable characters */
        private static String m7824(char c, String str, String str2, String str3, int i) {
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
                    cArr9[f.f2041] = (char) ((((cArr7[i3] ^ cArr2[f.f2041]) ^ f2292) ^ f2290) ^ f2288);
                    f.f2041++;
                }
                str4 = new String(cArr9);
            }
            return str4;
        }
    }

    public ha(Context context) {
        context.getApplicationContext();
    }
}
