package defpackage;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.nio.charset.StandardCharsets;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class tqo {
    public static final /* synthetic */ int a = 0;

    static {
        int i = dpo.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001f, code lost:
    
        return r13 + r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int a(String str, byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        int length;
        int i5;
        char charAt;
        int length2 = str.length();
        int i6 = 0;
        while (true) {
            i3 = i + i2;
            if (i6 >= length2 || (i5 = i6 + i) >= i3 || (charAt = str.charAt(i6)) >= 128) {
                break;
            }
            bArr[i5] = (byte) charAt;
            i6++;
        }
        int i7 = i + i6;
        while (i6 < length2) {
            char charAt2 = str.charAt(i6);
            if (charAt2 < 128 && i7 < i3) {
                bArr[i7] = (byte) charAt2;
                i7++;
            } else if (charAt2 < 2048 && i7 <= i3 - 2) {
                bArr[i7] = (byte) ((charAt2 >>> 6) | 960);
                bArr[i7 + 1] = (byte) ((charAt2 & '?') | 128);
                i7 += 2;
            } else {
                if ((charAt2 >= 55296 && charAt2 <= 57343) || i7 > i3 - 3) {
                    if (i7 <= i3 - 4) {
                        i6++;
                        if (i6 != str.length()) {
                            char charAt3 = str.charAt(i6);
                            if (Character.isSurrogatePair(charAt2, charAt3)) {
                                int i8 = i7 + 3;
                                int codePoint = Character.toCodePoint(charAt2, charAt3);
                                bArr[i7] = (byte) ((codePoint >>> 18) | 240);
                                bArr[i7 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                bArr[i7 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                i7 += 4;
                                bArr[i8] = (byte) ((codePoint & 63) | 128);
                            }
                        }
                        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
                        length = bytes.length;
                        if (length - i > i2) {
                            hc5.h("Not enough space in output buffer to encode UTF-8 string");
                            return 0;
                        }
                        System.arraycopy(bytes, 0, bArr, i, length);
                    } else {
                        if (charAt2 < 55296 || charAt2 > 57343 || ((i4 = i6 + 1) != str.length() && Character.isSurrogatePair(charAt2, str.charAt(i4)))) {
                            hc5.h("Not enough space in output buffer to encode UTF-8 string");
                            return 0;
                        }
                        byte[] bytes2 = str.getBytes(StandardCharsets.UTF_8);
                        length = bytes2.length;
                        if (length - i > i2) {
                            hc5.h("Not enough space in output buffer to encode UTF-8 string");
                            return 0;
                        }
                        System.arraycopy(bytes2, 0, bArr, i, length);
                    }
                    return i + length;
                }
                bArr[i7] = (byte) ((charAt2 >>> '\f') | 480);
                bArr[i7 + 1] = (byte) (((charAt2 >>> 6) & 63) | 128);
                bArr[i7 + 2] = (byte) ((charAt2 & '?') | 128);
                i7 += 3;
            }
            i6++;
        }
        return i7;
    }

    public static String b(int i, int i2, byte[] bArr) {
        if (i2 == 0) {
            return "";
        }
        int length = bArr.length;
        if ((((length - i) - i2) | i | i2) < 0) {
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
                    if (b2 >= -16) {
                        if (i5 >= i3 - 2) {
                            hbo.i("Protocol message had invalid UTF-8.");
                            return null;
                        }
                        byte b4 = bArr[i5];
                        int i6 = i + 3;
                        byte b5 = bArr[i + 2];
                        i += 4;
                        byte b6 = bArr[i6];
                        if (!d7a.J(b4)) {
                            if ((((b4 + 112) + (b2 << 28)) >> 30) == 0 && !d7a.J(b5) && !d7a.J(b6)) {
                                int i7 = ((b4 & 63) << 12) | ((b2 & 7) << 18) | ((b5 & 63) << 6) | (b6 & 63);
                                cArr[i4] = (char) ((i7 >>> 10) + 55232);
                                cArr[i4 + 1] = (char) ((i7 & IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE) + 56320);
                                i4 += 2;
                            }
                        }
                        hbo.i("Protocol message had invalid UTF-8.");
                        return null;
                    }
                    if (i5 >= i3 - 1) {
                        hbo.i("Protocol message had invalid UTF-8.");
                        return null;
                    }
                    int i8 = i4 + 1;
                    int i9 = i + 2;
                    byte b7 = bArr[i5];
                    i += 3;
                    byte b8 = bArr[i9];
                    if (!d7a.J(b7)) {
                        if (b2 == -32) {
                            if (b7 >= -96) {
                                b2 = -32;
                            }
                        }
                        if (b2 == -19) {
                            if (b7 < -96) {
                                b2 = -19;
                            }
                        }
                        if (!d7a.J(b8)) {
                            cArr[i4] = (char) (((b7 & 63) << 6) | ((b2 & 15) << 12) | (b8 & 63));
                            i4 = i8;
                        }
                    }
                    hbo.i("Protocol message had invalid UTF-8.");
                    return null;
                }
                if (i5 >= i3) {
                    hbo.i("Protocol message had invalid UTF-8.");
                    return null;
                }
                int i10 = i4 + 1;
                i += 2;
                byte b9 = bArr[i5];
                if (b2 < -62 || d7a.J(b9)) {
                    hbo.i("Protocol message had invalid UTF-8.");
                    return null;
                }
                cArr[i4] = (char) ((b9 & 63) | ((b2 & 31) << 6));
                i4 = i10;
            }
        }
        return new String(cArr, 0, i4);
    }

    public static boolean c(int i, int i2, byte[] bArr) {
        while (i < i2 && bArr[i] >= 0) {
            i++;
        }
        if (i >= i2) {
            return true;
        }
        while (i < i2) {
            int i3 = i + 1;
            byte b = bArr[i];
            if (b >= 0) {
                i = i3;
            } else {
                if (b < -32) {
                    if (i3 < i2 && b >= -62) {
                        i += 2;
                        if (bArr[i3] > -65) {
                        }
                    }
                    return false;
                }
                if (b >= -16) {
                    if (i3 >= i2 - 2) {
                        return false;
                    }
                    int i4 = i + 2;
                    byte b2 = bArr[i3];
                    if (b2 <= -65) {
                        if ((((b2 + 112) + (b << 28)) >> 30) == 0) {
                            int i5 = i + 3;
                            if (bArr[i4] <= -65) {
                                i += 4;
                                if (bArr[i5] > -65) {
                                }
                            }
                        }
                    }
                    return false;
                }
                if (i3 >= i2 - 1) {
                    return false;
                }
                int i6 = i + 2;
                byte b3 = bArr[i3];
                if (b3 > -65 || (b == -32 && b3 < -96)) {
                    return false;
                }
                if (b == -19 && b3 >= -96) {
                    return false;
                }
                i += 3;
                if (bArr[i6] > -65) {
                    return false;
                }
            }
        }
        return true;
    }
}
