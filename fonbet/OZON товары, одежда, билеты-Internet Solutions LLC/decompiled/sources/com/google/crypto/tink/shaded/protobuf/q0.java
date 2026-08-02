package com.google.crypto.tink.shaded.protobuf;

import B0.A0;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.nio.charset.Charset;
import java.util.Arrays;

/* loaded from: classes.dex */
final class q0 {

    /* renamed from: a, reason: collision with root package name */
    private static final b f59458a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f59459b = 0;

    private static class a {
        static void a(byte b11, byte b12, byte b13, byte b14, char[] cArr, int i11) throws A {
            if (!d(b12)) {
                if ((((b12 + 112) + (b11 << 28)) >> 30) == 0 && !d(b13) && !d(b14)) {
                    int i12 = ((b11 & 7) << 18) | ((b12 & 63) << 12) | ((b13 & 63) << 6) | (b14 & 63);
                    cArr[i11] = (char) ((i12 >>> 10) + 55232);
                    cArr[i11 + 1] = (char) ((i12 & 1023) + 56320);
                    return;
                }
            }
            throw A.d();
        }

        static void b(byte b11, byte b12, char[] cArr, int i11) throws A {
            if (b11 < -62 || d(b12)) {
                throw A.d();
            }
            cArr[i11] = (char) (((b11 & 31) << 6) | (b12 & 63));
        }

        static void c(byte b11, byte b12, byte b13, char[] cArr, int i11) throws A {
            if (d(b12) || ((b11 == -32 && b12 < -96) || ((b11 == -19 && b12 >= -96) || d(b13)))) {
                throw A.d();
            }
            cArr[i11] = (char) (((b11 & 15) << 12) | ((b12 & 63) << 6) | (b13 & 63));
        }

        private static boolean d(byte b11) {
            return b11 > -65;
        }
    }

    static abstract class b {
        abstract String a(byte[] bArr, int i11, int i12) throws A;

        abstract int b(String str, byte[] bArr, int i11, int i12);

        abstract int c(byte[] bArr, int i11, int i12);
    }

    static final class c extends b {
        @Override // com.google.crypto.tink.shaded.protobuf.q0.b
        final String a(byte[] bArr, int i11, int i12) throws A {
            if ((i11 | i12 | ((bArr.length - i11) - i12)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i11), Integer.valueOf(i12)));
            }
            int i13 = i11 + i12;
            char[] cArr = new char[i12];
            int i14 = 0;
            while (i11 < i13) {
                byte b11 = bArr[i11];
                if (b11 < 0) {
                    break;
                }
                i11++;
                cArr[i14] = (char) b11;
                i14++;
            }
            int i15 = i14;
            while (i11 < i13) {
                int i16 = i11 + 1;
                byte b12 = bArr[i11];
                if (b12 >= 0) {
                    int i17 = i15 + 1;
                    cArr[i15] = (char) b12;
                    int i18 = i16;
                    while (i18 < i13) {
                        byte b13 = bArr[i18];
                        if (b13 < 0) {
                            break;
                        }
                        i18++;
                        cArr[i17] = (char) b13;
                        i17++;
                    }
                    i15 = i17;
                    i11 = i18;
                } else if (b12 < -32) {
                    if (i16 >= i13) {
                        throw A.d();
                    }
                    i11 += 2;
                    a.b(b12, bArr[i16], cArr, i15);
                    i15++;
                } else if (b12 < -16) {
                    if (i16 >= i13 - 1) {
                        throw A.d();
                    }
                    int i19 = i11 + 2;
                    i11 += 3;
                    a.c(b12, bArr[i16], bArr[i19], cArr, i15);
                    i15++;
                } else {
                    if (i16 >= i13 - 2) {
                        throw A.d();
                    }
                    byte b14 = bArr[i16];
                    int i21 = i11 + 3;
                    byte b15 = bArr[i11 + 2];
                    i11 += 4;
                    a.a(b12, b14, b15, bArr[i21], cArr, i15);
                    i15 += 2;
                }
            }
            return new String(cArr, 0, i15);
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
        
            return r10 + r0;
         */
        @Override // com.google.crypto.tink.shaded.protobuf.q0.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        final int b(String str, byte[] bArr, int i11, int i12) {
            int i13;
            int i14;
            char charAt;
            int length = str.length();
            int i15 = i12 + i11;
            int i16 = 0;
            while (i16 < length && (i14 = i16 + i11) < i15 && (charAt = str.charAt(i16)) < 128) {
                bArr[i14] = (byte) charAt;
                i16++;
            }
            int i17 = i11 + i16;
            while (i16 < length) {
                char charAt2 = str.charAt(i16);
                if (charAt2 < 128 && i17 < i15) {
                    bArr[i17] = (byte) charAt2;
                    i17++;
                } else if (charAt2 < 2048 && i17 <= i15 - 2) {
                    int i18 = i17 + 1;
                    bArr[i17] = (byte) ((charAt2 >>> 6) | 960);
                    i17 += 2;
                    bArr[i18] = (byte) ((charAt2 & '?') | UserVerificationMethods.USER_VERIFY_PATTERN);
                } else {
                    if ((charAt2 >= 55296 && 57343 >= charAt2) || i17 > i15 - 3) {
                        if (i17 > i15 - 4) {
                            if (55296 <= charAt2 && charAt2 <= 57343 && ((i13 = i16 + 1) == str.length() || !Character.isSurrogatePair(charAt2, str.charAt(i13)))) {
                                throw new d(i16, length);
                            }
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + i17);
                        }
                        int i19 = i16 + 1;
                        if (i19 != str.length()) {
                            char charAt3 = str.charAt(i19);
                            if (Character.isSurrogatePair(charAt2, charAt3)) {
                                int codePoint = Character.toCodePoint(charAt2, charAt3);
                                bArr[i17] = (byte) ((codePoint >>> 18) | 240);
                                bArr[i17 + 1] = (byte) (((codePoint >>> 12) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN);
                                int i21 = i17 + 3;
                                bArr[i17 + 2] = (byte) (((codePoint >>> 6) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN);
                                i17 += 4;
                                bArr[i21] = (byte) ((codePoint & 63) | UserVerificationMethods.USER_VERIFY_PATTERN);
                                i16 = i19;
                            } else {
                                i16 = i19;
                            }
                        }
                        throw new d(i16 - 1, length);
                    }
                    bArr[i17] = (byte) ((charAt2 >>> '\f') | 480);
                    int i22 = i17 + 2;
                    bArr[i17 + 1] = (byte) (((charAt2 >>> 6) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN);
                    i17 += 3;
                    bArr[i22] = (byte) ((charAt2 & '?') | UserVerificationMethods.USER_VERIFY_PATTERN);
                }
                i16++;
            }
            return i17;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.q0.b
        final int c(byte[] bArr, int i11, int i12) {
            while (i11 < i12 && bArr[i11] >= 0) {
                i11++;
            }
            if (i11 >= i12) {
                return 0;
            }
            while (i11 < i12) {
                int i13 = i11 + 1;
                byte b11 = bArr[i11];
                if (b11 >= 0) {
                    i11 = i13;
                } else if (b11 < -32) {
                    if (i13 >= i12) {
                        return b11;
                    }
                    if (b11 < -62) {
                        return -1;
                    }
                    i11 += 2;
                    if (bArr[i13] > -65) {
                        return -1;
                    }
                } else if (b11 < -16) {
                    if (i13 >= i12 - 1) {
                        return q0.c(i13, i12, bArr);
                    }
                    int i14 = i11 + 2;
                    byte b12 = bArr[i13];
                    if (b12 > -65) {
                        return -1;
                    }
                    if (b11 == -32 && b12 < -96) {
                        return -1;
                    }
                    if (b11 == -19 && b12 >= -96) {
                        return -1;
                    }
                    i11 += 3;
                    if (bArr[i14] > -65) {
                        return -1;
                    }
                } else {
                    if (i13 >= i12 - 2) {
                        return q0.c(i13, i12, bArr);
                    }
                    int i15 = i11 + 2;
                    byte b13 = bArr[i13];
                    if (b13 > -65) {
                        return -1;
                    }
                    if ((((b13 + 112) + (b11 << 28)) >> 30) != 0) {
                        return -1;
                    }
                    int i16 = i11 + 3;
                    if (bArr[i15] > -65) {
                        return -1;
                    }
                    i11 += 4;
                    if (bArr[i16] > -65) {
                        return -1;
                    }
                }
            }
            return 0;
        }
    }

    static class d extends IllegalArgumentException {
        d(int i11, int i12) {
            super(A0.a(i11, i12, "Unpaired surrogate at index ", " of "));
        }
    }

    static final class e extends b {
        private static int d(byte[] bArr, int i11, long j11, int i12) {
            if (i12 == 0) {
                int i13 = q0.f59459b;
                if (i11 > -12) {
                    return -1;
                }
                return i11;
            }
            if (i12 == 1) {
                return q0.a(i11, p0.q(j11, bArr));
            }
            if (i12 == 2) {
                return q0.b(i11, p0.q(j11, bArr), p0.q(j11 + 1, bArr));
            }
            throw new AssertionError();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.q0.b
        final String a(byte[] bArr, int i11, int i12) throws A {
            Charset charset = C5919z.f59480a;
            String str = new String(bArr, i11, i12, charset);
            if (str.indexOf(65533) >= 0 && !Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i11, i12 + i11))) {
                throw A.d();
            }
            return str;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.q0.b
        final int b(String str, byte[] bArr, int i11, int i12) {
            long j11;
            long j12;
            long j13;
            int i13;
            char charAt;
            long j14 = i11;
            long j15 = i12 + j14;
            int length = str.length();
            if (length > i12 || bArr.length - i12 < i11) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(length - 1) + " at index " + (i11 + i12));
            }
            int i14 = 0;
            while (true) {
                j11 = 1;
                if (i14 >= length || (charAt = str.charAt(i14)) >= 128) {
                    break;
                }
                p0.A(bArr, j14, (byte) charAt);
                i14++;
                j14 = 1 + j14;
            }
            if (i14 == length) {
                return (int) j14;
            }
            while (i14 < length) {
                char charAt2 = str.charAt(i14);
                if (charAt2 < 128 && j14 < j15) {
                    p0.A(bArr, j14, (byte) charAt2);
                    j13 = j15;
                    j12 = j11;
                    j14 += j11;
                } else if (charAt2 >= 2048 || j14 > j15 - 2) {
                    j12 = j11;
                    if ((charAt2 >= 55296 && 57343 >= charAt2) || j14 > j15 - 3) {
                        j13 = j15;
                        if (j14 > j13 - 4) {
                            if (55296 <= charAt2 && charAt2 <= 57343 && ((i13 = i14 + 1) == length || !Character.isSurrogatePair(charAt2, str.charAt(i13)))) {
                                throw new d(i14, length);
                            }
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + j14);
                        }
                        int i15 = i14 + 1;
                        if (i15 != length) {
                            char charAt3 = str.charAt(i15);
                            if (Character.isSurrogatePair(charAt2, charAt3)) {
                                int codePoint = Character.toCodePoint(charAt2, charAt3);
                                p0.A(bArr, j14, (byte) ((codePoint >>> 18) | 240));
                                p0.A(bArr, j14 + j12, (byte) (((codePoint >>> 12) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                                long j16 = j14 + 3;
                                p0.A(bArr, j14 + 2, (byte) (((codePoint >>> 6) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                                j14 += 4;
                                p0.A(bArr, j16, (byte) ((codePoint & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                                i14 = i15;
                            } else {
                                i14 = i15;
                            }
                        }
                        throw new d(i14 - 1, length);
                    }
                    p0.A(bArr, j14, (byte) ((charAt2 >>> '\f') | 480));
                    long j17 = j14 + 2;
                    j13 = j15;
                    p0.A(bArr, j14 + j12, (byte) (((charAt2 >>> 6) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                    j14 += 3;
                    p0.A(bArr, j17, (byte) ((charAt2 & '?') | UserVerificationMethods.USER_VERIFY_PATTERN));
                } else {
                    j12 = j11;
                    long j18 = j14 + j12;
                    p0.A(bArr, j14, (byte) ((charAt2 >>> 6) | 960));
                    j14 += 2;
                    p0.A(bArr, j18, (byte) ((charAt2 & '?') | UserVerificationMethods.USER_VERIFY_PATTERN));
                    j13 = j15;
                }
                i14++;
                j11 = j12;
                j15 = j13;
            }
            return (int) j14;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.q0.b
        final int c(byte[] bArr, int i11, int i12) {
            int i13;
            if ((i11 | i12 | (bArr.length - i12)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", Integer.valueOf(bArr.length), Integer.valueOf(i11), Integer.valueOf(i12)));
            }
            long j11 = i11;
            int i14 = (int) (i12 - j11);
            if (i14 >= 16) {
                int i15 = 8 - (((int) j11) & 7);
                long j12 = j11;
                i13 = 0;
                while (true) {
                    if (i13 >= i15) {
                        while (true) {
                            int i16 = i13 + 8;
                            if (i16 > i14 || (p0.u(bArr, p0.f59455f + j12) & (-9187201950435737472L)) != 0) {
                                break;
                            }
                            j12 += 8;
                            i13 = i16;
                        }
                        while (true) {
                            if (i13 >= i14) {
                                i13 = i14;
                                break;
                            }
                            long j13 = j12 + 1;
                            if (p0.q(j12, bArr) < 0) {
                                break;
                            }
                            i13++;
                            j12 = j13;
                        }
                    } else {
                        long j14 = j12 + 1;
                        if (p0.q(j12, bArr) < 0) {
                            break;
                        }
                        i13++;
                        j12 = j14;
                    }
                }
            } else {
                i13 = 0;
            }
            int i17 = i14 - i13;
            long j15 = j11 + i13;
            while (true) {
                byte b11 = 0;
                while (true) {
                    if (i17 <= 0) {
                        break;
                    }
                    long j16 = j15 + 1;
                    b11 = p0.q(j15, bArr);
                    if (b11 < 0) {
                        j15 = j16;
                        break;
                    }
                    i17--;
                    j15 = j16;
                }
                if (i17 == 0) {
                    return 0;
                }
                int i18 = i17 - 1;
                if (b11 < -32) {
                    if (i18 == 0) {
                        return b11;
                    }
                    i17 -= 2;
                    if (b11 < -62) {
                        return -1;
                    }
                    long j17 = j15 + 1;
                    if (p0.q(j15, bArr) > -65) {
                        return -1;
                    }
                    j15 = j17;
                } else if (b11 < -16) {
                    if (i18 < 2) {
                        return d(bArr, b11, j15, i18);
                    }
                    i17 -= 3;
                    long j18 = j15 + 1;
                    byte q11 = p0.q(j15, bArr);
                    if (q11 > -65) {
                        return -1;
                    }
                    if (b11 == -32 && q11 < -96) {
                        return -1;
                    }
                    if (b11 == -19 && q11 >= -96) {
                        return -1;
                    }
                    j15 += 2;
                    if (p0.q(j18, bArr) > -65) {
                        return -1;
                    }
                } else {
                    if (i18 < 3) {
                        return d(bArr, b11, j15, i18);
                    }
                    i17 -= 4;
                    long j19 = j15 + 1;
                    byte q12 = p0.q(j15, bArr);
                    if (q12 > -65) {
                        return -1;
                    }
                    if ((((q12 + 112) + (b11 << 28)) >> 30) != 0) {
                        return -1;
                    }
                    long j21 = 2 + j15;
                    if (p0.q(j19, bArr) > -65) {
                        return -1;
                    }
                    j15 += 3;
                    if (p0.q(j21, bArr) > -65) {
                        return -1;
                    }
                }
            }
        }
    }

    static {
        f59458a = (p0.x() && p0.y() && !C5898d.b()) ? new e() : new c();
    }

    static int a(int i11, int i12) {
        if (i11 > -12 || i12 > -65) {
            return -1;
        }
        return i11 ^ (i12 << 8);
    }

    static int b(int i11, int i12, int i13) {
        if (i11 > -12 || i12 > -65 || i13 > -65) {
            return -1;
        }
        return (i11 ^ (i12 << 8)) ^ (i13 << 16);
    }

    static int c(int i11, int i12, byte[] bArr) {
        byte b11 = bArr[i11 - 1];
        int i13 = i12 - i11;
        if (i13 == 0) {
            if (b11 > -12) {
                return -1;
            }
            return b11;
        }
        if (i13 == 1) {
            byte b12 = bArr[i11];
            if (b11 > -12 || b12 > -65) {
                return -1;
            }
            return (b12 << 8) ^ b11;
        }
        if (i13 != 2) {
            throw new AssertionError();
        }
        byte b13 = bArr[i11];
        byte b14 = bArr[i11 + 1];
        if (b11 > -12 || b13 > -65 || b14 > -65) {
            return -1;
        }
        return (b14 << 16) ^ ((b13 << 8) ^ b11);
    }

    static String d(byte[] bArr, int i11, int i12) throws A {
        return f59458a.a(bArr, i11, i12);
    }

    static int e(String str, byte[] bArr, int i11, int i12) {
        return f59458a.b(str, bArr, i11, i12);
    }

    static int f(String str) {
        int length = str.length();
        int i11 = 0;
        int i12 = 0;
        while (i12 < length && str.charAt(i12) < 128) {
            i12++;
        }
        int i13 = length;
        while (true) {
            if (i12 >= length) {
                break;
            }
            char charAt = str.charAt(i12);
            if (charAt < 2048) {
                i13 += (127 - charAt) >>> 31;
                i12++;
            } else {
                int length2 = str.length();
                while (i12 < length2) {
                    char charAt2 = str.charAt(i12);
                    if (charAt2 < 2048) {
                        i11 += (127 - charAt2) >>> 31;
                    } else {
                        i11 += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(str, i12) < 65536) {
                                throw new d(i12, length2);
                            }
                            i12++;
                        }
                    }
                    i12++;
                }
                i13 += i11;
            }
        }
        if (i13 >= length) {
            return i13;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i13 + 4294967296L));
    }

    static boolean g(byte[] bArr, int i11, int i12) {
        return f59458a.c(bArr, i11, i12) == 0;
    }
}
