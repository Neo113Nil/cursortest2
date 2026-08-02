package defpackage;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class fik {
    public static final u8f a;

    static {
        if (uck.e && uck.d) {
            Class cls = jx.a;
        }
        a = new u8f(5);
    }

    public static String a(ByteBuffer byteBuffer, int i, int i2) {
        u8f u8fVar = a;
        u8fVar.getClass();
        if (byteBuffer.hasArray()) {
            return u8fVar.a(byteBuffer.arrayOffset() + i, i2, byteBuffer.array());
        }
        return byteBuffer.isDirect() ? u8f.b(byteBuffer, i, i2) : u8f.b(byteBuffer, i, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0023, code lost:
    
        return r10 + r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int b(String str, byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        char charAt;
        a.getClass();
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
                if ((charAt2 >= 55296 && 57343 >= charAt2) || i7 > i5 - 3) {
                    if (i7 > i5 - 4) {
                        if (55296 <= charAt2 && charAt2 <= 57343 && ((i3 = i6 + 1) == str.length() || !Character.isSurrogatePair(charAt2, str.charAt(i3)))) {
                            throw new cik(i6, length);
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
                    throw new cik(i6 - 1, length);
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

    public static void c(String str, ByteBuffer byteBuffer) {
        a.getClass();
        if (byteBuffer.hasArray()) {
            int arrayOffset = byteBuffer.arrayOffset();
            byteBuffer.position(b(str, byteBuffer.array(), byteBuffer.position() + arrayOffset, byteBuffer.remaining()) - arrayOffset);
        } else if (byteBuffer.isDirect()) {
            u8f.d(str, byteBuffer);
        } else {
            u8f.d(str, byteBuffer);
        }
    }

    public static int d(String str) {
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
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(str, i) < 65536) {
                                throw new cik(i, length2);
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

    public static int e(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    public static int f(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }

    public static int g(int i, int i2, int i3, ByteBuffer byteBuffer) {
        if (i3 == 0) {
            if (i > -12) {
                return -1;
            }
            return i;
        }
        if (i3 == 1) {
            return e(i, byteBuffer.get(i2));
        }
        if (i3 == 2) {
            return f(i, byteBuffer.get(i2), byteBuffer.get(i2 + 1));
        }
        ogj.b();
        return 0;
    }

    public static int h(byte[] bArr, int i, int i2) {
        byte b = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 == 0) {
            if (b > -12) {
                return -1;
            }
            return b;
        }
        if (i3 == 1) {
            return e(b, bArr[i]);
        }
        if (i3 == 2) {
            return f(b, bArr[i], bArr[i + 1]);
        }
        ogj.b();
        return 0;
    }
}
