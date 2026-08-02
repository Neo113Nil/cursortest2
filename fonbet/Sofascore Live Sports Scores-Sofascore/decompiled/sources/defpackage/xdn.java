package defpackage;

import com.google.android.gms.internal.pal.zzadi;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class xdn {
    public static final wje a;

    static {
        if (sdn.e && sdn.d) {
            int i = b7n.a;
        }
        a = new wje(7);
    }

    public static /* bridge */ /* synthetic */ int a(int i, int i2, byte[] bArr) {
        byte b = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 == 0) {
            if (b > -12) {
                return -1;
            }
            return b;
        }
        if (i3 == 1) {
            byte b2 = bArr[i];
            if (b > -12 || b2 > -65) {
                return -1;
            }
            return (b2 << 8) ^ b;
        }
        if (i3 != 2) {
            ogj.b();
            return 0;
        }
        byte b3 = bArr[i];
        byte b4 = bArr[i + 1];
        if (b > -12 || b3 > -65 || b4 > -65) {
            return -1;
        }
        return (b4 << 16) ^ ((b3 << 8) ^ b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001e, code lost:
    
        return r10 + r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int b(String str, byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        char charAt;
        int length = str.length();
        int i5 = i2 + i;
        int i6 = 0;
        while (i6 < length && (i4 = i6 + i) < i5 && (charAt = str.charAt(i6)) < 128) {
            bArr[i4] = (byte) charAt;
            i6++;
        }
        int i7 = i + i6;
        while (i6 < length) {
            char charAt2 = str.charAt(i6);
            if (charAt2 < 128 && i7 < i5) {
                bArr[i7] = (byte) charAt2;
                i7++;
            } else if (charAt2 < 2048 && i7 <= i5 - 2) {
                int i8 = i7 + 1;
                bArr[i7] = (byte) ((charAt2 >>> 6) | 960);
                i7 += 2;
                bArr[i8] = (byte) ((charAt2 & '?') | 128);
            } else {
                if ((charAt2 >= 55296 && charAt2 <= 57343) || i7 > i5 - 3) {
                    if (i7 > i5 - 4) {
                        if (charAt2 >= 55296 && charAt2 <= 57343 && ((i3 = i6 + 1) == str.length() || !Character.isSurrogatePair(charAt2, str.charAt(i3)))) {
                            throw new wdn(i6, length);
                        }
                        ogj.d(charAt2, i7);
                        return 0;
                    }
                    int i9 = i6 + 1;
                    if (i9 != str.length()) {
                        char charAt3 = str.charAt(i9);
                        if (Character.isSurrogatePair(charAt2, charAt3)) {
                            int codePoint = Character.toCodePoint(charAt2, charAt3);
                            bArr[i7] = (byte) ((codePoint >>> 18) | 240);
                            bArr[i7 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                            int i10 = i7 + 3;
                            bArr[i7 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                            i7 += 4;
                            bArr[i10] = (byte) ((codePoint & 63) | 128);
                            i6 = i9;
                        } else {
                            i6 = i9;
                        }
                    }
                    throw new wdn(i6 - 1, length);
                }
                bArr[i7] = (byte) ((charAt2 >>> '\f') | 480);
                int i11 = i7 + 2;
                bArr[i7 + 1] = (byte) (((charAt2 >>> 6) & 63) | 128);
                i7 += 3;
                bArr[i11] = (byte) ((charAt2 & '?') | 128);
            }
            i6++;
        }
        return i7;
    }

    public static int c(String str) {
        int length = str.length();
        int i = 0;
        while (i < length && str.charAt(i) < 128) {
            i++;
        }
        int i2 = length;
        while (true) {
            if (i >= length) {
                break;
            }
            char charAt = str.charAt(i);
            if (charAt < 2048) {
                i2 += (127 - charAt) >>> 31;
                i++;
            } else {
                int length2 = str.length();
                int i3 = 0;
                while (i < length2) {
                    char charAt2 = str.charAt(i);
                    if (charAt2 < 2048) {
                        i3 += (127 - charAt2) >>> 31;
                    } else {
                        i3 += 2;
                        if (charAt2 >= 55296 && charAt2 <= 57343) {
                            if (Character.codePointAt(str, i) < 65536) {
                                throw new wdn(i, length2);
                            }
                            i++;
                        }
                    }
                    i++;
                }
                i2 += i3;
            }
        }
        if (i2 >= length) {
            return i2;
        }
        ogj.f(i2 + 4294967296L, "UTF-8 length does not fit in int: ");
        return 0;
    }

    public static String d(int i, int i2, byte[] bArr) {
        int length = bArr.length;
        if ((i | i2 | ((length - i) - i2)) < 0) {
            yhk.p("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(length), Integer.valueOf(i), Integer.valueOf(i2)});
            return null;
        }
        int i3 = i + i2;
        char[] cArr = new char[i2];
        int i4 = 0;
        while (i < i3) {
            byte b = bArr[i];
            if (b < 0) {
                break;
            }
            i++;
            cArr[i4] = (char) b;
            i4++;
        }
        while (i < i3) {
            int i5 = i + 1;
            byte b2 = bArr[i];
            if (b2 >= 0) {
                cArr[i4] = (char) b2;
                i4++;
                i = i5;
                while (i < i3) {
                    byte b3 = bArr[i];
                    if (b3 >= 0) {
                        i++;
                        cArr[i4] = (char) b3;
                        i4++;
                    }
                }
            } else {
                if (b2 >= -32) {
                    if (b2 < -16) {
                        if (i5 >= i3 - 1) {
                            throw zzadi.g();
                        }
                        int i6 = i + 2;
                        i += 3;
                        int i7 = i4 + 1;
                        byte b4 = bArr[i5];
                        byte b5 = bArr[i6];
                        if (!w3a.c0(b4)) {
                            if (b2 == -32) {
                                if (b4 >= -96) {
                                    b2 = -32;
                                }
                            }
                            if (b2 == -19) {
                                if (b4 < -96) {
                                    b2 = -19;
                                }
                            }
                            if (!w3a.c0(b5)) {
                                cArr[i4] = (char) (((b4 & 63) << 6) | ((b2 & 15) << 12) | (b5 & 63));
                                i4 = i7;
                            }
                        }
                        throw zzadi.g();
                    }
                    if (i5 >= i3 - 2) {
                        throw zzadi.g();
                    }
                    int i8 = i + 2;
                    int i9 = i + 3;
                    i += 4;
                    byte b6 = bArr[i5];
                    byte b7 = bArr[i8];
                    byte b8 = bArr[i9];
                    if (!w3a.c0(b6)) {
                        if ((((b6 + 112) + (b2 << 28)) >> 30) == 0 && !w3a.c0(b7) && !w3a.c0(b8)) {
                            int i10 = ((b6 & 63) << 12) | ((b2 & 7) << 18) | ((b7 & 63) << 6) | (b8 & 63);
                            cArr[i4] = (char) ((i10 >>> 10) + 55232);
                            cArr[i4 + 1] = (char) ((i10 & IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE) + 56320);
                            i4 += 2;
                        }
                    }
                    throw zzadi.g();
                }
                if (i5 >= i3) {
                    throw zzadi.g();
                }
                i += 2;
                int i11 = i4 + 1;
                byte b9 = bArr[i5];
                if (b2 < -62 || w3a.c0(b9)) {
                    throw zzadi.g();
                }
                cArr[i4] = (char) ((b9 & 63) | ((b2 & 31) << 6));
                i4 = i11;
            }
        }
        return new String(cArr, 0, i4);
    }
}
