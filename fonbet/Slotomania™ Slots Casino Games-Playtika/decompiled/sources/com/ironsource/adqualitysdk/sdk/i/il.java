package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.google.common.base.Ascii;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.io.encoding.Base64;

/* loaded from: classes5.dex */
public class il {

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static int f2536 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static final byte[] f2537;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f2538;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static /* synthetic */ boolean f2539;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static final byte[] f2540;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static long f2541;

    /* renamed from: ﻛ, reason: contains not printable characters */
    static void m8074() {
        f2541 = -8120704396829508868L;
    }

    static {
        m8074();
        int i = f2536;
        int i2 = i + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
        f2538 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 2 % 2;
        }
        f2539 = true;
        f2537 = new byte[]{65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
        f2540 = new byte[]{-9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, -9, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, Base64.padSymbol, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, Ascii.VT, Ascii.FF, Ascii.CR, Ascii.SO, Ascii.SI, Ascii.DLE, 17, Ascii.DC2, 19, Ascii.DC4, Ascii.NAK, Ascii.SYN, Ascii.ETB, Ascii.CAN, Ascii.EM, -9, -9, -9, -9, -9, -9, Ascii.SUB, Ascii.ESC, Ascii.FS, Ascii.GS, Ascii.RS, Ascii.US, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -9, -9, -9, -9, -9};
        int i4 = i + 97;
        f2538 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private il() {
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static byte[] m8077(byte[] bArr, int i, int i2, byte[] bArr2, int i3, byte[] bArr3) {
        int i4;
        int i5;
        int i6 = 2 % 2;
        int i7 = 0;
        if (i2 > 0) {
            i4 = (bArr[i] << Ascii.CAN) >>> 8;
            int i8 = f2536 + 81;
            f2538 = i8 % 128;
            int i9 = i8 % 2;
        } else {
            i4 = 0;
        }
        if (i2 > 1) {
            int i10 = f2538 + 77;
            f2536 = i10 % 128;
            int i11 = i10 % 2;
            i5 = (bArr[i + 1] << Ascii.CAN) >>> 16;
        } else {
            i5 = 0;
        }
        int i12 = i4 | i5;
        if (i2 > 2) {
            i7 = (bArr[i + 2] << Ascii.CAN) >>> 24;
            int i13 = f2538 + 7;
            f2536 = i13 % 128;
            int i14 = i13 % 2;
        }
        int i15 = i12 | i7;
        if (i2 == 1) {
            bArr2[i3] = bArr3[i15 >>> 18];
            bArr2[i3 + 1] = bArr3[(i15 >>> 12) & 63];
            bArr2[i3 + 2] = Base64.padSymbol;
            bArr2[i3 + 3] = Base64.padSymbol;
            return bArr2;
        }
        if (i2 == 2) {
            bArr2[i3] = bArr3[i15 >>> 18];
            bArr2[i3 + 1] = bArr3[(i15 >>> 12) & 63];
            bArr2[i3 + 2] = bArr3[(i15 >>> 6) & 63];
            bArr2[i3 + 3] = Base64.padSymbol;
            return bArr2;
        }
        if (i2 != 3) {
            return bArr2;
        }
        bArr2[i3] = bArr3[i15 >>> 18];
        bArr2[i3 + 1] = bArr3[(i15 >>> 12) & 63];
        bArr2[i3 + 2] = bArr3[(i15 >>> 6) & 63];
        bArr2[i3 + 3] = bArr3[i15 & 63];
        return bArr2;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static String m8079(byte[] bArr) {
        int i = 2 % 2;
        int i2 = f2538 + 105;
        f2536 = i2 % 128;
        int i3 = i2 % 2;
        int length = bArr.length;
        if (i3 != 0) {
            return m8073(bArr, length, f2537);
        }
        String m8073 = m8073(bArr, length, f2537);
        int i4 = 1 / 0;
        return m8073;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m8073(byte[] bArr, int i, byte[] bArr2) {
        int i2 = 2 % 2;
        byte[] m8080 = m8080(bArr, 0, i, bArr2);
        String str = new String(m8080, 0, m8080.length);
        int i3 = f2536 + 29;
        f2538 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 26 / 0;
        }
        return str;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static byte[] m8080(byte[] bArr, int i, int i2, byte[] bArr2) {
        int i3 = 2 % 2;
        int i4 = ((i2 + 2) / 3) << 2;
        int i5 = i4 + (i4 / Integer.MAX_VALUE);
        byte[] bArr3 = new byte[i5];
        int i6 = i2 - 2;
        int i7 = f2538 + 79;
        f2536 = i7 % 128;
        int i8 = i7 % 2;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        while (i9 < i6) {
            int i12 = ((bArr[i9] << Ascii.CAN) >>> 8) | ((bArr[i9 + 1] << Ascii.CAN) >>> 16) | ((bArr[i9 + 2] << Ascii.CAN) >>> 24);
            bArr3[i10] = bArr2[i12 >>> 18];
            int i13 = i10 + 1;
            bArr3[i13] = bArr2[(i12 >>> 12) & 63];
            bArr3[i10 + 2] = bArr2[(i12 >>> 6) & 63];
            bArr3[i10 + 3] = bArr2[i12 & 63];
            i11 += 4;
            if (i11 == Integer.MAX_VALUE) {
                bArr3[i10 + 4] = 10;
                i11 = 0;
                i10 = i13;
            }
            i9 += 3;
            i10 += 4;
        }
        if (i9 < i2) {
            m8077(bArr, i9, i2 - i9, bArr3, i10, bArr2);
            if (i11 + 4 == Integer.MAX_VALUE) {
                int i14 = f2538 + 85;
                f2536 = i14 % 128;
                if (i14 % 2 == 0) {
                    bArr3[i10 % 4] = 59;
                    i10 += 51;
                } else {
                    bArr3[i10 + 4] = 10;
                    i10++;
                }
            }
            i10 += 4;
        }
        if (f2539 || i10 == i5) {
            return bArr3;
        }
        throw new AssertionError();
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int m8078(byte[] bArr, byte[] bArr2, int i, byte[] bArr3) {
        int i2 = 2 % 2;
        int i3 = f2538;
        int i4 = i3 + 31;
        int i5 = i4 % 128;
        f2536 = i5;
        int i6 = i4 % 2;
        byte b = bArr[2];
        if (b != 61) {
            byte b2 = bArr[3];
            if (b2 == 61) {
                int i7 = ((bArr3[bArr[1]] << Ascii.CAN) >>> 12) | ((bArr3[bArr[0]] << Ascii.CAN) >>> 6) | ((bArr3[b] << Ascii.CAN) >>> 18);
                bArr2[i] = (byte) (i7 >>> 16);
                bArr2[i + 1] = (byte) (i7 >>> 8);
                int i8 = i3 + 31;
                f2536 = i8 % 128;
                if (i8 % 2 != 0) {
                    return 2;
                }
                throw null;
            }
            int i9 = ((bArr3[bArr[1]] << Ascii.CAN) >>> 12) | ((bArr3[bArr[0]] << Ascii.CAN) >>> 6) | ((bArr3[b] << Ascii.CAN) >>> 18) | ((bArr3[b2] << Ascii.CAN) >>> 24);
            bArr2[i] = (byte) (i9 >> 16);
            bArr2[i + 1] = (byte) (i9 >> 8);
            bArr2[i + 2] = (byte) i9;
            return 3;
        }
        int i10 = i5 + 29;
        f2538 = i10 % 128;
        int i11 = i10 % 2;
        bArr2[i] = (byte) ((((bArr3[bArr[1]] << Ascii.CAN) >>> 12) | ((bArr3[bArr[0]] << Ascii.CAN) >>> 6)) >>> 16);
        return 1;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static byte[] m8072(String str) throws in {
        int i = 2 % 2;
        int i2 = f2536 + 43;
        f2538 = i2 % 128;
        int i3 = i2 % 2;
        byte[] bytes = str.getBytes();
        byte[] m8075 = m8075(bytes, bytes.length);
        int i4 = f2536 + 71;
        f2538 = i4 % 128;
        int i5 = i4 % 2;
        return m8075;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static byte[] m8075(byte[] bArr, int i) throws in {
        int i2 = 2 % 2;
        int i3 = f2538 + 97;
        f2536 = i3 % 128;
        int i4 = i3 % 2;
        byte[] m8076 = m8076(bArr, 0, i, f2540);
        int i5 = f2538 + 71;
        f2536 = i5 % 128;
        int i6 = i5 % 2;
        return m8076;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0106 A[SYNTHETIC] */
    /* renamed from: ｋ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static byte[] m8076(byte[] bArr, int i, int i2, byte[] bArr2) throws in {
        byte b;
        byte b2;
        int i3;
        int i4 = 2 % 2;
        byte[] bArr3 = new byte[((i2 * 3) / 4) + 2];
        byte[] bArr4 = new byte[4];
        int i5 = f2536 + 9;
        f2538 = i5 % 128;
        int i6 = i5 % 2;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < i2; i9++) {
            int i10 = f2538 + 21;
            int i11 = i10 % 128;
            f2536 = i11;
            if (i10 % 2 == 0) {
                b = (byte) (bArr[i9] | 42);
                b2 = bArr2[b];
                if (b2 < 95) {
                    throw new in(new StringBuilder().append(m8071("뀚轳끘뗮랆푎宨ꧾ숚ꎁ撚\uf81b柌鶛迢\uec27玤燏ﮧဪῺ斬\ue7caя⯘妾폑⡊㟟䶝㾢屯쏾⇟", 1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))).intern()).append(i9).append(m8071("꣤⪋\ua8deၗ\uf79f裍", ViewConfiguration.getMaximumDrawingCacheSize() >> 24).intern()).append((int) bArr[i9]).append(m8071("齸딏齐辗\udf2fꎖ瓡鎎ꪲ쬻ጁ辉䢱", Color.green(0)).intern()).toString());
                }
                int i12 = i11 + 115;
                f2538 = i12 % 128;
                int i13 = i12 % 2;
                if (b2 < -1) {
                    int i14 = i11 + 37;
                    int i15 = i14 % 128;
                    f2538 = i15;
                    if (i14 % 2 != 0) {
                        if (b == 29) {
                            int i16 = i2 - i9;
                            byte b3 = (byte) (bArr[i2 - 1] & Byte.MAX_VALUE);
                            if (i7 != 0 || i7 == 1) {
                                throw new in(new StringBuilder().append(m8071("嶯䉗巆磅왂쬵똳擒돌퉀箠\ue764訿僪ﹰ\uf310鸖복詣ང\uf20dꢒ阀᭱옿铜ꉙ㜣\uda2f肪丠䌔⹝\ueca2娰彁ȏ\ud844曒殲ᚬ쑞狐蟤", TextUtils.indexOf("", "", 0)).intern()).append(i9).toString());
                            }
                            if ((i7 == 3 && i16 > 2) || (i7 == 4 && i16 > 1)) {
                                throw new in(new StringBuilder().append(m8071("篟露箯궯휹뼾遆놰ꊥ쌪ྮ鍪걝薗\uef09蜟렯槙魐筍퐿編蝼潶\ue01c䇻덡䍳ﱟ嗝彔㝝ࠡ㧟䭁⭙⑿ഫ瞳ιわᄱ掫\uf3ea䳚\ue500ྞ\ue795士줛㮉\udbca瓩\udd6f⟱쿯肊ꄾ포ꏾ鳟땁ￛ韜ꢼ饛\uebd9變", ViewConfiguration.getKeyRepeatTimeout() >> 16).intern()).append(i9).toString());
                            }
                            if (b3 != 61) {
                                int i17 = i15 + 55;
                                f2536 = i17 % 128;
                                if (i17 % 2 != 0 ? b3 != 10 : b3 != 73) {
                                    throw new in(m8071("쯘ⲋ쮽ᘙ註睎⁌ਂﾠ鸬쟕嬑ᱎ㸶눔佴\u086d퉧였데摫옗\uda71꜏倞渚\uee64謘䰜\uee37ɌＳ렩艮ᙄ\ue338鐶뚐⫸ퟃ胑ꪓ㺭", TextUtils.indexOf("", "", 0, 0)).intern());
                                }
                            }
                        }
                        i3 = i7 + 1;
                        bArr4[i7] = b;
                        if (i3 != 4) {
                            int i18 = i15 + 53;
                            f2536 = i18 % 128;
                            int i19 = i18 % 2;
                            i8 += m8078(bArr4, bArr3, i8, bArr2);
                            i7 = 0;
                        } else {
                            i7 = i3;
                        }
                    } else {
                        if (b == 61) {
                            int i162 = i2 - i9;
                            byte b32 = (byte) (bArr[i2 - 1] & Byte.MAX_VALUE);
                            if (i7 != 0) {
                            }
                            throw new in(new StringBuilder().append(m8071("嶯䉗巆磅왂쬵똳擒돌퉀箠\ue764訿僪ﹰ\uf310鸖복詣ང\uf20dꢒ阀᭱옿铜ꉙ㜣\uda2f肪丠䌔⹝\ueca2娰彁ȏ\ud844曒殲ᚬ쑞狐蟤", TextUtils.indexOf("", "", 0)).intern()).append(i9).toString());
                        }
                        i3 = i7 + 1;
                        bArr4[i7] = b;
                        if (i3 != 4) {
                        }
                    }
                }
            } else {
                b = (byte) (bArr[i9] & Byte.MAX_VALUE);
                b2 = bArr2[b];
                if (b2 < -5) {
                    throw new in(new StringBuilder().append(m8071("뀚轳끘뗮랆푎宨ꧾ숚ꎁ撚\uf81b柌鶛迢\uec27玤燏ﮧဪῺ斬\ue7caя⯘妾폑⡊㟟䶝㾢屯쏾⇟", 1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))).intern()).append(i9).append(m8071("꣤⪋\ua8deၗ\uf79f裍", ViewConfiguration.getMaximumDrawingCacheSize() >> 24).intern()).append((int) bArr[i9]).append(m8071("齸딏齐辗\udf2fꎖ瓡鎎ꪲ쬻ጁ辉䢱", Color.green(0)).intern()).toString());
                }
                int i122 = i11 + 115;
                f2538 = i122 % 128;
                int i132 = i122 % 2;
                if (b2 < -1) {
                }
            }
            if (i7 != 0) {
                if (i7 == 1) {
                    throw new in(new StringBuilder().append(m8071("쓻ṵ쒈ⓠꌲō⽧㣼횤띬뇞ⵎ፩ೈ鬕㥦݂\ue0d7\uef0b씺歘\uf4a1\uf37d턘弪좺인ﴟ䌩\udcc9⭝褾띋낖㽊锼鬈葬Ψꆊ", Drawable.resolveOpacity(0, 0)).intern()).append(i2 - 1).toString());
                }
                bArr4[i7] = Base64.padSymbol;
                i8 += m8078(bArr4, bArr3, i8, bArr2);
            }
            byte[] bArr5 = new byte[i8];
            System.arraycopy(bArr3, 0, bArr5, 0, i8);
            return bArr5;
        }
        if (i7 != 0) {
        }
        byte[] bArr52 = new byte[i8];
        System.arraycopy(bArr3, 0, bArr52, 0, i8);
        return bArr52;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static String m8071(String str, int i) {
        String str2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (g.f2155) {
            char[] m7785 = g.m7785(f2541, cArr2, i);
            g.f2157 = 4;
            while (g.f2157 < m7785.length) {
                g.f2156 = g.f2157 - 4;
                m7785[g.f2157] = (char) ((m7785[g.f2157] ^ m7785[g.f2157 % 4]) ^ (g.f2156 * f2541));
                g.f2157++;
            }
            str2 = new String(m7785, 4, m7785.length - 4);
        }
        return str2;
    }
}
