package com.google.protobuf;

import B0.A0;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;

/* loaded from: classes.dex */
final class Utf8 {

    /* renamed from: a, reason: collision with root package name */
    private static final SafeProcessor f60189a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f60190b = 0;

    /* loaded from: classes9.dex */
    private static class a {
        static void a(byte b11, byte b12, byte b13, byte b14, char[] cArr, int i11) throws InvalidProtocolBufferException {
            if (!h(b12)) {
                if ((((b12 + 112) + (b11 << 28)) >> 30) == 0 && !h(b13) && !h(b14)) {
                    int i12 = ((b11 & 7) << 18) | ((b12 & 63) << 12) | ((b13 & 63) << 6) | (b14 & 63);
                    cArr[i11] = (char) ((i12 >>> 10) + 55232);
                    cArr[i11 + 1] = (char) ((i12 & 1023) + 56320);
                    return;
                }
            }
            throw InvalidProtocolBufferException.invalidUtf8();
        }

        static boolean b(byte b11) {
            return b11 >= 0;
        }

        static void c(byte b11, char[] cArr, int i11) {
            cArr[i11] = (char) b11;
        }

        static boolean d(byte b11) {
            return b11 < -32;
        }

        static void e(byte b11, byte b12, char[] cArr, int i11) throws InvalidProtocolBufferException {
            if (b11 < -62 || h(b12)) {
                throw InvalidProtocolBufferException.invalidUtf8();
            }
            cArr[i11] = (char) (((b11 & 31) << 6) | (b12 & 63));
        }

        static boolean f(byte b11) {
            return b11 < -16;
        }

        static void g(byte b11, byte b12, byte b13, char[] cArr, int i11) throws InvalidProtocolBufferException {
            if (h(b12) || ((b11 == -32 && b12 < -96) || ((b11 == -19 && b12 >= -96) || h(b13)))) {
                throw InvalidProtocolBufferException.invalidUtf8();
            }
            cArr[i11] = (char) (((b11 & 15) << 12) | ((b12 & 63) << 6) | (b13 & 63));
        }

        private static boolean h(byte b11) {
            return b11 > -65;
        }
    }

    static abstract class b {
        b() {
        }

        final String decodeUtf8(ByteBuffer byteBuffer, int i11, int i12) throws InvalidProtocolBufferException {
            if (byteBuffer.hasArray()) {
                return decodeUtf8(byteBuffer.array(), byteBuffer.arrayOffset() + i11, i12);
            }
            return byteBuffer.isDirect() ? decodeUtf8Direct(byteBuffer, i11, i12) : decodeUtf8Default(byteBuffer, i11, i12);
        }

        abstract String decodeUtf8(byte[] bArr, int i11, int i12) throws InvalidProtocolBufferException;

        final String decodeUtf8Default(ByteBuffer byteBuffer, int i11, int i12) throws InvalidProtocolBufferException {
            if ((i11 | i12 | ((byteBuffer.limit() - i11) - i12)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i11), Integer.valueOf(i12)));
            }
            int i13 = i11 + i12;
            char[] cArr = new char[i12];
            int i14 = 0;
            while (i11 < i13) {
                byte b11 = byteBuffer.get(i11);
                if (!a.b(b11)) {
                    break;
                }
                i11++;
                a.c(b11, cArr, i14);
                i14++;
            }
            int i15 = i14;
            while (i11 < i13) {
                int i16 = i11 + 1;
                byte b12 = byteBuffer.get(i11);
                if (a.b(b12)) {
                    int i17 = i15 + 1;
                    a.c(b12, cArr, i15);
                    int i18 = i16;
                    while (i18 < i13) {
                        byte b13 = byteBuffer.get(i18);
                        if (!a.b(b13)) {
                            break;
                        }
                        i18++;
                        a.c(b13, cArr, i17);
                        i17++;
                    }
                    i15 = i17;
                    i11 = i18;
                } else if (a.d(b12)) {
                    if (i16 >= i13) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    i11 += 2;
                    a.e(b12, byteBuffer.get(i16), cArr, i15);
                    i15++;
                } else if (a.f(b12)) {
                    if (i16 >= i13 - 1) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    int i19 = i11 + 2;
                    i11 += 3;
                    a.g(b12, byteBuffer.get(i16), byteBuffer.get(i19), cArr, i15);
                    i15++;
                } else {
                    if (i16 >= i13 - 2) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    byte b14 = byteBuffer.get(i16);
                    int i21 = i11 + 3;
                    byte b15 = byteBuffer.get(i11 + 2);
                    i11 += 4;
                    a.a(b12, b14, b15, byteBuffer.get(i21), cArr, i15);
                    i15 += 2;
                }
            }
            return new String(cArr, 0, i15);
        }

        abstract String decodeUtf8Direct(ByteBuffer byteBuffer, int i11, int i12) throws InvalidProtocolBufferException;

        abstract int encodeUtf8(String str, byte[] bArr, int i11, int i12);

        final void encodeUtf8(String str, ByteBuffer byteBuffer) {
            if (byteBuffer.hasArray()) {
                int arrayOffset = byteBuffer.arrayOffset();
                C5964o.b(Utf8.h(str, byteBuffer.array(), byteBuffer.position() + arrayOffset, byteBuffer.remaining()) - arrayOffset, byteBuffer);
            } else if (byteBuffer.isDirect()) {
                encodeUtf8Direct(str, byteBuffer);
            } else {
                encodeUtf8Default(str, byteBuffer);
            }
        }

        final void encodeUtf8Default(String str, ByteBuffer byteBuffer) {
            int length = str.length();
            int position = byteBuffer.position();
            int i11 = 0;
            while (i11 < length) {
                try {
                    char charAt = str.charAt(i11);
                    if (charAt >= 128) {
                        break;
                    }
                    byteBuffer.put(position + i11, (byte) charAt);
                    i11++;
                } catch (IndexOutOfBoundsException unused) {
                    throw new ArrayIndexOutOfBoundsException("Not enough space in output buffer to encode UTF-8 string");
                }
            }
            if (i11 == length) {
                C5964o.b(position + i11, byteBuffer);
                return;
            }
            int i12 = position + i11;
            while (i11 < length) {
                char charAt2 = str.charAt(i11);
                if (charAt2 < 128) {
                    byteBuffer.put(i12, (byte) charAt2);
                } else if (charAt2 < 2048) {
                    int i13 = i12 + 1;
                    byteBuffer.put(i12, (byte) ((charAt2 >>> 6) | 192));
                    byteBuffer.put(i13, (byte) ((charAt2 & '?') | UserVerificationMethods.USER_VERIFY_PATTERN));
                    i12 = i13;
                } else {
                    if (charAt2 >= 55296 && 57343 >= charAt2) {
                        int i14 = i11 + 1;
                        if (i14 != length) {
                            char charAt3 = str.charAt(i14);
                            if (Character.isSurrogatePair(charAt2, charAt3)) {
                                int codePoint = Character.toCodePoint(charAt2, charAt3);
                                byteBuffer.put(i12, (byte) ((codePoint >>> 18) | 240));
                                int i15 = i12 + 2;
                                byteBuffer.put(i12 + 1, (byte) (((codePoint >>> 12) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                                i12 += 3;
                                byteBuffer.put(i15, (byte) (((codePoint >>> 6) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                                byteBuffer.put(i12, (byte) ((codePoint & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                                i11 = i14;
                            } else {
                                i11 = i14;
                            }
                        }
                        throw new c(i11, length);
                    }
                    int i16 = i12 + 1;
                    byteBuffer.put(i12, (byte) ((charAt2 >>> '\f') | 224));
                    i12 += 2;
                    byteBuffer.put(i16, (byte) (((charAt2 >>> 6) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                    byteBuffer.put(i12, (byte) ((charAt2 & '?') | UserVerificationMethods.USER_VERIFY_PATTERN));
                }
                i11++;
                i12++;
            }
            C5964o.b(i12, byteBuffer);
        }

        abstract void encodeUtf8Direct(String str, ByteBuffer byteBuffer);

        final boolean isValidUtf8(byte[] bArr, int i11, int i12) {
            return partialIsValidUtf8(0, bArr, i11, i12) == 0;
        }

        final int partialIsValidUtf8(int i11, ByteBuffer byteBuffer, int i12, int i13) {
            if (!byteBuffer.hasArray()) {
                return byteBuffer.isDirect() ? partialIsValidUtf8Direct(i11, byteBuffer, i12, i13) : partialIsValidUtf8Default(i11, byteBuffer, i12, i13);
            }
            int arrayOffset = byteBuffer.arrayOffset();
            return partialIsValidUtf8(i11, byteBuffer.array(), i12 + arrayOffset, arrayOffset + i13);
        }

        abstract int partialIsValidUtf8(int i11, byte[] bArr, int i12, int i13);

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0017, code lost:
        
            if (r8.get(r9) > (-65)) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x004c, code lost:
        
            if (r8.get(r9) > (-65)) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x008f, code lost:
        
            if (r8.get(r7) > (-65)) goto L53;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        final int partialIsValidUtf8Default(int i11, ByteBuffer byteBuffer, int i12, int i13) {
            byte b11;
            int i14;
            int i15;
            if (i11 != 0) {
                if (i12 >= i13) {
                    return i11;
                }
                byte b12 = (byte) i11;
                if (b12 < -32) {
                    if (b12 >= -62) {
                        i15 = i12 + 1;
                    }
                    return -1;
                }
                if (b12 < -16) {
                    byte b13 = (byte) (~(i11 >> 8));
                    if (b13 == 0) {
                        int i16 = i12 + 1;
                        byte b14 = byteBuffer.get(i12);
                        if (i16 >= i13) {
                            return Utf8.k(b12, b14);
                        }
                        i12 = i16;
                        b13 = b14;
                    }
                    if (b13 <= -65 && ((b12 != -32 || b13 >= -96) && (b12 != -19 || b13 < -96))) {
                        i15 = i12 + 1;
                    }
                    return -1;
                }
                byte b15 = (byte) (~(i11 >> 8));
                if (b15 == 0) {
                    i14 = i12 + 1;
                    b15 = byteBuffer.get(i12);
                    if (i14 >= i13) {
                        return Utf8.k(b12, b15);
                    }
                    b11 = 0;
                } else {
                    b11 = (byte) (i11 >> 16);
                    i14 = i12;
                }
                if (b11 == 0) {
                    int i17 = i14 + 1;
                    byte b16 = byteBuffer.get(i14);
                    if (i17 >= i13) {
                        return Utf8.l(b12, b15, b16);
                    }
                    b11 = b16;
                    i14 = i17;
                }
                if (b15 <= -65) {
                    if ((((b15 + 112) + (b12 << 28)) >> 30) == 0 && b11 <= -65) {
                        i12 = i14 + 1;
                    }
                }
                return -1;
                i12 = i15;
            }
            return partialIsValidUtf8(byteBuffer, i12, i13);
        }

        abstract int partialIsValidUtf8Direct(int i11, ByteBuffer byteBuffer, int i12, int i13);

        final boolean isValidUtf8(ByteBuffer byteBuffer, int i11, int i12) {
            return partialIsValidUtf8(0, byteBuffer, i11, i12) == 0;
        }

        private static int partialIsValidUtf8(ByteBuffer byteBuffer, int i11, int i12) {
            int i13 = Utf8.f60190b;
            int i14 = i12 - 7;
            int i15 = i11;
            while (i15 < i14 && (byteBuffer.getLong(i15) & (-9187201950435737472L)) == 0) {
                i15 += 8;
            }
            int i16 = (i15 - i11) + i11;
            while (i16 < i12) {
                int i17 = i16 + 1;
                byte b11 = byteBuffer.get(i16);
                if (b11 >= 0) {
                    i16 = i17;
                } else if (b11 < -32) {
                    if (i17 >= i12) {
                        return b11;
                    }
                    if (b11 < -62 || byteBuffer.get(i17) > -65) {
                        return -1;
                    }
                    i16 += 2;
                } else {
                    if (b11 >= -16) {
                        if (i17 >= i12 - 2) {
                            return Utf8.e(b11, byteBuffer, i17, i12 - i17);
                        }
                        int i18 = i16 + 2;
                        byte b12 = byteBuffer.get(i17);
                        if (b12 <= -65) {
                            if ((((b12 + 112) + (b11 << 28)) >> 30) == 0) {
                                int i19 = i16 + 3;
                                if (byteBuffer.get(i18) <= -65) {
                                    i16 += 4;
                                    if (byteBuffer.get(i19) > -65) {
                                    }
                                }
                            }
                        }
                        return -1;
                    }
                    if (i17 >= i12 - 1) {
                        return Utf8.e(b11, byteBuffer, i17, i12 - i17);
                    }
                    int i21 = i16 + 2;
                    byte b13 = byteBuffer.get(i17);
                    if (b13 > -65 || ((b11 == -32 && b13 < -96) || ((b11 == -19 && b13 >= -96) || byteBuffer.get(i21) > -65))) {
                        return -1;
                    }
                    i16 += 3;
                }
            }
            return 0;
        }
    }

    static class c extends IllegalArgumentException {
        c(int i11, int i12) {
            super(A0.a(i11, i12, "Unpaired surrogate at index ", " of "));
        }
    }

    static {
        if (UnsafeProcessor.isAvailable()) {
            int i11 = C5950a.f60193b;
        }
        f60189a = new SafeProcessor();
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
            return k(b11, bArr[i11]);
        }
        if (i13 == 2) {
            return l(b11, bArr[i11], bArr[i11 + 1]);
        }
        throw new AssertionError();
    }

    static int d(int i11) {
        if (i11 > -12) {
            return -1;
        }
        return i11;
    }

    static int e(int i11, ByteBuffer byteBuffer, int i12, int i13) {
        if (i13 == 0) {
            if (i11 > -12) {
                return -1;
            }
            return i11;
        }
        if (i13 == 1) {
            return k(i11, byteBuffer.get(i12));
        }
        if (i13 == 2) {
            return l(i11, byteBuffer.get(i12), byteBuffer.get(i12 + 1));
        }
        throw new AssertionError();
    }

    static String f(ByteBuffer byteBuffer, int i11, int i12) throws InvalidProtocolBufferException {
        return f60189a.decodeUtf8(byteBuffer, i11, i12);
    }

    static String g(byte[] bArr, int i11, int i12) throws InvalidProtocolBufferException {
        return f60189a.decodeUtf8(bArr, i11, i12);
    }

    static int h(String str, byte[] bArr, int i11, int i12) {
        return f60189a.encodeUtf8(str, bArr, i11, i12);
    }

    static void i(String str, ByteBuffer byteBuffer) {
        f60189a.encodeUtf8(str, byteBuffer);
    }

    static int j(String str) {
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
                                throw new c(i12, length2);
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

    /* JADX INFO: Access modifiers changed from: private */
    public static int k(int i11, int i12) {
        if (i11 > -12 || i12 > -65) {
            return -1;
        }
        return i11 ^ (i12 << 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int l(int i11, int i12, int i13) {
        if (i11 > -12 || i12 > -65 || i13 > -65) {
            return -1;
        }
        return (i11 ^ (i12 << 8)) ^ (i13 << 16);
    }

    static boolean m(ByteBuffer byteBuffer) {
        return f60189a.isValidUtf8(byteBuffer, byteBuffer.position(), byteBuffer.remaining());
    }

    static boolean n(byte[] bArr) {
        return f60189a.isValidUtf8(bArr, 0, bArr.length);
    }

    static boolean o(byte[] bArr, int i11, int i12) {
        return f60189a.isValidUtf8(bArr, i11, i12);
    }

    static int p(int i11, ByteBuffer byteBuffer, int i12, int i13) {
        return f60189a.partialIsValidUtf8(i11, byteBuffer, i12, i13);
    }

    static int q(int i11, byte[] bArr, int i12, int i13) {
        return f60189a.partialIsValidUtf8(i11, bArr, i12, i13);
    }

    static final class UnsafeProcessor extends b {
        UnsafeProcessor() {
        }

        static boolean isAvailable() {
            return UnsafeUtil.A() && UnsafeUtil.B();
        }

        private static int unsafeEstimateConsecutiveAscii(byte[] bArr, long j11, int i11) {
            int i12 = 0;
            if (i11 < 16) {
                return 0;
            }
            int i13 = 8 - (((int) j11) & 7);
            while (i12 < i13) {
                long j12 = 1 + j11;
                if (UnsafeUtil.s(j11, bArr) < 0) {
                    return i12;
                }
                i12++;
                j11 = j12;
            }
            while (true) {
                int i14 = i12 + 8;
                if (i14 > i11 || (UnsafeUtil.x(bArr, UnsafeUtil.f60186f + j11) & (-9187201950435737472L)) != 0) {
                    break;
                }
                j11 += 8;
                i12 = i14;
            }
            while (i12 < i11) {
                long j13 = j11 + 1;
                if (UnsafeUtil.s(j11, bArr) < 0) {
                    return i12;
                }
                i12++;
                j11 = j13;
            }
            return i11;
        }

        private static int unsafeIncompleteStateFor(byte[] bArr, int i11, long j11, int i12) {
            if (i12 == 0) {
                return Utf8.d(i11);
            }
            if (i12 == 1) {
                return Utf8.k(i11, UnsafeUtil.s(j11, bArr));
            }
            if (i12 == 2) {
                return Utf8.l(i11, UnsafeUtil.s(j11, bArr), UnsafeUtil.s(j11 + 1, bArr));
            }
            throw new AssertionError();
        }

        @Override // com.google.protobuf.Utf8.b
        String decodeUtf8(byte[] bArr, int i11, int i12) throws InvalidProtocolBufferException {
            Charset charset = Internal.f60125a;
            String str = new String(bArr, i11, i12, charset);
            if (str.indexOf(65533) >= 0 && !Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i11, i12 + i11))) {
                throw InvalidProtocolBufferException.invalidUtf8();
            }
            return str;
        }

        @Override // com.google.protobuf.Utf8.b
        String decodeUtf8Direct(ByteBuffer byteBuffer, int i11, int i12) throws InvalidProtocolBufferException {
            if ((i11 | i12 | ((byteBuffer.limit() - i11) - i12)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i11), Integer.valueOf(i12)));
            }
            long j11 = UnsafeUtil.j(byteBuffer) + i11;
            long j12 = i12 + j11;
            char[] cArr = new char[i12];
            int i13 = 0;
            while (j11 < j12) {
                byte r11 = UnsafeUtil.r(j11);
                if (!a.b(r11)) {
                    break;
                }
                j11++;
                a.c(r11, cArr, i13);
                i13++;
            }
            int i14 = i13;
            while (j11 < j12) {
                long j13 = j11 + 1;
                byte r12 = UnsafeUtil.r(j11);
                if (a.b(r12)) {
                    int i15 = i14 + 1;
                    a.c(r12, cArr, i14);
                    long j14 = j13;
                    while (j14 < j12) {
                        byte r13 = UnsafeUtil.r(j14);
                        if (!a.b(r13)) {
                            break;
                        }
                        j14++;
                        a.c(r13, cArr, i15);
                        i15++;
                    }
                    i14 = i15;
                    j11 = j14;
                } else if (a.d(r12)) {
                    if (j13 >= j12) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    j11 += 2;
                    a.e(r12, UnsafeUtil.r(j13), cArr, i14);
                    i14++;
                } else if (a.f(r12)) {
                    if (j13 >= j12 - 1) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    long j15 = 2 + j11;
                    j11 += 3;
                    a.g(r12, UnsafeUtil.r(j13), UnsafeUtil.r(j15), cArr, i14);
                    i14++;
                } else {
                    if (j13 >= j12 - 2) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    byte r14 = UnsafeUtil.r(j13);
                    long j16 = j11 + 3;
                    byte r15 = UnsafeUtil.r(2 + j11);
                    j11 += 4;
                    a.a(r12, r14, r15, UnsafeUtil.r(j16), cArr, i14);
                    i14 += 2;
                }
            }
            return new String(cArr, 0, i14);
        }

        @Override // com.google.protobuf.Utf8.b
        int encodeUtf8(String str, byte[] bArr, int i11, int i12) {
            long j11;
            long j12;
            int i13;
            char charAt;
            long j13 = i11;
            long j14 = i12 + j13;
            int length = str.length();
            if (length > i12 || bArr.length - i12 < i11) {
                throw new ArrayIndexOutOfBoundsException("Not enough space in output buffer to encode UTF-8 string");
            }
            int i14 = 0;
            while (true) {
                j11 = 1;
                if (i14 >= length || (charAt = str.charAt(i14)) >= 128) {
                    break;
                }
                UnsafeUtil.F(bArr, j13, (byte) charAt);
                i14++;
                j13 = 1 + j13;
            }
            if (i14 == length) {
                return (int) j13;
            }
            while (i14 < length) {
                char charAt2 = str.charAt(i14);
                if (charAt2 < 128 && j13 < j14) {
                    UnsafeUtil.F(bArr, j13, (byte) charAt2);
                    j12 = j11;
                    j13 += j11;
                } else if (charAt2 >= 2048 || j13 > j14 - 2) {
                    j12 = j11;
                    if ((charAt2 >= 55296 && 57343 >= charAt2) || j13 > j14 - 3) {
                        if (j13 > j14 - 4) {
                            if (55296 > charAt2 || charAt2 > 57343 || ((i13 = i14 + 1) != length && Character.isSurrogatePair(charAt2, str.charAt(i13)))) {
                                throw new ArrayIndexOutOfBoundsException("Not enough space in output buffer to encode UTF-8 string");
                            }
                            throw new c(i14, length);
                        }
                        int i15 = i14 + 1;
                        if (i15 != length) {
                            char charAt3 = str.charAt(i15);
                            if (Character.isSurrogatePair(charAt2, charAt3)) {
                                int codePoint = Character.toCodePoint(charAt2, charAt3);
                                UnsafeUtil.F(bArr, j13, (byte) ((codePoint >>> 18) | 240));
                                UnsafeUtil.F(bArr, j13 + j12, (byte) (((codePoint >>> 12) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                                long j15 = j13 + 3;
                                UnsafeUtil.F(bArr, 2 + j13, (byte) (((codePoint >>> 6) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                                j13 += 4;
                                UnsafeUtil.F(bArr, j15, (byte) ((codePoint & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                                i14 = i15;
                            } else {
                                i14 = i15;
                            }
                        }
                        throw new c(i14 - 1, length);
                    }
                    UnsafeUtil.F(bArr, j13, (byte) ((charAt2 >>> '\f') | 480));
                    long j16 = 2 + j13;
                    UnsafeUtil.F(bArr, j13 + j12, (byte) (((charAt2 >>> 6) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                    j13 += 3;
                    UnsafeUtil.F(bArr, j16, (byte) ((charAt2 & '?') | UserVerificationMethods.USER_VERIFY_PATTERN));
                } else {
                    j12 = j11;
                    long j17 = j13 + j12;
                    UnsafeUtil.F(bArr, j13, (byte) ((charAt2 >>> 6) | 960));
                    j13 += 2;
                    UnsafeUtil.F(bArr, j17, (byte) ((charAt2 & '?') | UserVerificationMethods.USER_VERIFY_PATTERN));
                }
                i14++;
                j11 = j12;
            }
            return (int) j13;
        }

        @Override // com.google.protobuf.Utf8.b
        void encodeUtf8Direct(String str, ByteBuffer byteBuffer) {
            long j11;
            char c11;
            long j12;
            long j13;
            char c12;
            int i11;
            char charAt;
            long j14 = UnsafeUtil.j(byteBuffer);
            long position = byteBuffer.position() + j14;
            long limit = byteBuffer.limit() + j14;
            int length = str.length();
            if (length > limit - position) {
                throw new ArrayIndexOutOfBoundsException("Not enough space in output buffer to encode UTF-8 string");
            }
            int i12 = 0;
            while (true) {
                j11 = 1;
                c11 = 128;
                if (i12 >= length || (charAt = str.charAt(i12)) >= 128) {
                    break;
                }
                UnsafeUtil.E(position, (byte) charAt);
                i12++;
                position = 1 + position;
            }
            if (i12 == length) {
                C5964o.b((int) (position - j14), byteBuffer);
                return;
            }
            while (i12 < length) {
                char charAt2 = str.charAt(i12);
                if (charAt2 < c11 && position < limit) {
                    UnsafeUtil.E(position, (byte) charAt2);
                    j13 = j14;
                    j12 = j11;
                    position += j11;
                } else if (charAt2 >= 2048 || position > limit - 2) {
                    j12 = j11;
                    if ((charAt2 >= 55296 && 57343 >= charAt2) || position > limit - 3) {
                        j13 = j14;
                        if (position > limit - 4) {
                            if (55296 <= charAt2 && charAt2 <= 57343 && ((i11 = i12 + 1) == length || !Character.isSurrogatePair(charAt2, str.charAt(i11)))) {
                                throw new c(i12, length);
                            }
                            throw new ArrayIndexOutOfBoundsException("Not enough space in output buffer to encode UTF-8 string");
                        }
                        int i13 = i12 + 1;
                        if (i13 != length) {
                            char charAt3 = str.charAt(i13);
                            if (Character.isSurrogatePair(charAt2, charAt3)) {
                                int codePoint = Character.toCodePoint(charAt2, charAt3);
                                UnsafeUtil.E(position, (byte) ((codePoint >>> 18) | 240));
                                c12 = 128;
                                UnsafeUtil.E(position + j12, (byte) (((codePoint >>> 12) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                                long j15 = position + 3;
                                UnsafeUtil.E(position + 2, (byte) (((codePoint >>> 6) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                                position += 4;
                                UnsafeUtil.E(j15, (byte) ((codePoint & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                                i12 = i13;
                            } else {
                                i12 = i13;
                            }
                        }
                        throw new c(i12 - 1, length);
                    }
                    UnsafeUtil.E(position, (byte) ((charAt2 >>> '\f') | 480));
                    long j16 = position + 2;
                    j13 = j14;
                    UnsafeUtil.E(position + j12, (byte) (((charAt2 >>> 6) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                    position += 3;
                    UnsafeUtil.E(j16, (byte) ((charAt2 & '?') | UserVerificationMethods.USER_VERIFY_PATTERN));
                    c12 = 128;
                    i12++;
                    c11 = c12;
                    j11 = j12;
                    j14 = j13;
                } else {
                    j12 = j11;
                    long j17 = position + j12;
                    UnsafeUtil.E(position, (byte) ((charAt2 >>> 6) | 960));
                    position += 2;
                    UnsafeUtil.E(j17, (byte) ((charAt2 & '?') | c11));
                    j13 = j14;
                }
                c12 = c11;
                i12++;
                c11 = c12;
                j11 = j12;
                j14 = j13;
            }
            C5964o.b((int) (position - j14), byteBuffer);
        }

        /* JADX WARN: Code restructure failed: missing block: B:34:0x0058, code lost:
        
            if (com.google.protobuf.UnsafeUtil.s(r0, r12) > (-65)) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x009e, code lost:
        
            if (com.google.protobuf.UnsafeUtil.s(r0, r12) > (-65)) goto L59;
         */
        @Override // com.google.protobuf.Utf8.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        int partialIsValidUtf8(int i11, byte[] bArr, int i12, int i13) {
            byte b11;
            long j11;
            if ((i12 | i13 | (bArr.length - i13)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", Integer.valueOf(bArr.length), Integer.valueOf(i12), Integer.valueOf(i13)));
            }
            long j12 = i12;
            long j13 = i13;
            if (i11 != 0) {
                if (j12 >= j13) {
                    return i11;
                }
                byte b12 = (byte) i11;
                if (b12 < -32) {
                    if (b12 >= -62) {
                        long j14 = 1 + j12;
                        if (UnsafeUtil.s(j12, bArr) <= -65) {
                            j12 = j14;
                        }
                    }
                    return -1;
                }
                if (b12 < -16) {
                    byte b13 = (byte) (~(i11 >> 8));
                    if (b13 == 0) {
                        long j15 = j12 + 1;
                        b13 = UnsafeUtil.s(j12, bArr);
                        if (j15 >= j13) {
                            return Utf8.k(b12, b13);
                        }
                        j12 = j15;
                    }
                    if (b13 <= -65 && ((b12 != -32 || b13 >= -96) && (b12 != -19 || b13 < -96))) {
                        j11 = j12 + 1;
                    }
                    return -1;
                }
                byte b14 = (byte) (~(i11 >> 8));
                if (b14 == 0) {
                    long j16 = j12 + 1;
                    b14 = UnsafeUtil.s(j12, bArr);
                    if (j16 >= j13) {
                        return Utf8.k(b12, b14);
                    }
                    b11 = 0;
                    j12 = j16;
                } else {
                    b11 = (byte) (i11 >> 16);
                }
                if (b11 == 0) {
                    long j17 = j12 + 1;
                    b11 = UnsafeUtil.s(j12, bArr);
                    if (j17 >= j13) {
                        return Utf8.l(b12, b14, b11);
                    }
                    j12 = j17;
                }
                if (b14 <= -65) {
                    if ((((b14 + 112) + (b12 << 28)) >> 30) == 0 && b11 <= -65) {
                        j11 = j12 + 1;
                    }
                }
                return -1;
                j12 = j11;
            }
            return partialIsValidUtf8(bArr, j12, (int) (j13 - j12));
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
        
            if (com.google.protobuf.UnsafeUtil.r(r0) > (-65)) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x0061, code lost:
        
            if (com.google.protobuf.UnsafeUtil.r(r0) > (-65)) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x00a3, code lost:
        
            if (com.google.protobuf.UnsafeUtil.r(r0) > (-65)) goto L57;
         */
        @Override // com.google.protobuf.Utf8.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        int partialIsValidUtf8Direct(int i11, ByteBuffer byteBuffer, int i12, int i13) {
            byte b11;
            long j11;
            if ((i12 | i13 | (byteBuffer.limit() - i13)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i12), Integer.valueOf(i13)));
            }
            long j12 = UnsafeUtil.j(byteBuffer) + i12;
            long j13 = (i13 - i12) + j12;
            if (i11 != 0) {
                if (j12 >= j13) {
                    return i11;
                }
                byte b12 = (byte) i11;
                if (b12 < -32) {
                    if (b12 >= -62) {
                        j11 = 1 + j12;
                    }
                    return -1;
                }
                if (b12 < -16) {
                    byte b13 = (byte) (~(i11 >> 8));
                    if (b13 == 0) {
                        long j14 = j12 + 1;
                        b13 = UnsafeUtil.r(j12);
                        if (j14 >= j13) {
                            return Utf8.k(b12, b13);
                        }
                        j12 = j14;
                    }
                    if (b13 <= -65 && ((b12 != -32 || b13 >= -96) && (b12 != -19 || b13 < -96))) {
                        j11 = 1 + j12;
                    }
                    return -1;
                }
                byte b14 = (byte) (~(i11 >> 8));
                if (b14 == 0) {
                    long j15 = j12 + 1;
                    b14 = UnsafeUtil.r(j12);
                    if (j15 >= j13) {
                        return Utf8.k(b12, b14);
                    }
                    b11 = 0;
                    j12 = j15;
                } else {
                    b11 = (byte) (i11 >> 16);
                }
                if (b11 == 0) {
                    long j16 = j12 + 1;
                    b11 = UnsafeUtil.r(j12);
                    if (j16 >= j13) {
                        return Utf8.l(b12, b14, b11);
                    }
                    j12 = j16;
                }
                if (b14 <= -65) {
                    if ((((b14 + 112) + (b12 << 28)) >> 30) == 0 && b11 <= -65) {
                        j11 = 1 + j12;
                    }
                }
                return -1;
                j12 = j11;
            }
            return partialIsValidUtf8(j12, (int) (j13 - j12));
        }

        private static int unsafeEstimateConsecutiveAscii(long j11, int i11) {
            if (i11 < 16) {
                return 0;
            }
            int i12 = (int) ((-j11) & 7);
            int i13 = i12;
            while (i13 > 0) {
                long j12 = 1 + j11;
                if (UnsafeUtil.r(j11) < 0) {
                    return i12 - i13;
                }
                i13--;
                j11 = j12;
            }
            int i14 = i11 - i12;
            while (i14 >= 8 && (UnsafeUtil.w(j11) & (-9187201950435737472L)) == 0) {
                j11 += 8;
                i14 -= 8;
            }
            return i11 - i14;
        }

        private static int unsafeIncompleteStateFor(long j11, int i11, int i12) {
            if (i12 == 0) {
                return Utf8.d(i11);
            }
            if (i12 == 1) {
                return Utf8.k(i11, UnsafeUtil.r(j11));
            }
            if (i12 == 2) {
                return Utf8.l(i11, UnsafeUtil.r(j11), UnsafeUtil.r(j11 + 1));
            }
            throw new AssertionError();
        }

        /* JADX WARN: Code restructure failed: missing block: B:69:0x0039, code lost:
        
            return -1;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static int partialIsValidUtf8(byte[] bArr, long j11, int i11) {
            int unsafeEstimateConsecutiveAscii = unsafeEstimateConsecutiveAscii(bArr, j11, i11);
            int i12 = i11 - unsafeEstimateConsecutiveAscii;
            long j12 = j11 + unsafeEstimateConsecutiveAscii;
            while (true) {
                byte b11 = 0;
                while (true) {
                    if (i12 <= 0) {
                        break;
                    }
                    long j13 = j12 + 1;
                    b11 = UnsafeUtil.s(j12, bArr);
                    if (b11 < 0) {
                        j12 = j13;
                        break;
                    }
                    i12--;
                    j12 = j13;
                }
                if (i12 != 0) {
                    int i13 = i12 - 1;
                    if (b11 >= -32) {
                        if (b11 >= -16) {
                            if (i13 < 3) {
                                return unsafeIncompleteStateFor(bArr, b11, j12, i13);
                            }
                            i12 -= 4;
                            long j14 = 1 + j12;
                            byte s11 = UnsafeUtil.s(j12, bArr);
                            if (s11 > -65) {
                                break;
                            }
                            if ((((s11 + 112) + (b11 << 28)) >> 30) != 0) {
                                break;
                            }
                            long j15 = 2 + j12;
                            if (UnsafeUtil.s(j14, bArr) > -65) {
                                break;
                            }
                            j12 += 3;
                            if (UnsafeUtil.s(j15, bArr) > -65) {
                                break;
                            }
                        } else {
                            if (i13 < 2) {
                                return unsafeIncompleteStateFor(bArr, b11, j12, i13);
                            }
                            i12 -= 3;
                            long j16 = 1 + j12;
                            byte s12 = UnsafeUtil.s(j12, bArr);
                            if (s12 > -65 || ((b11 == -32 && s12 < -96) || (b11 == -19 && s12 >= -96))) {
                                break;
                            }
                            j12 += 2;
                            if (UnsafeUtil.s(j16, bArr) > -65) {
                                break;
                            }
                        }
                    } else if (i13 != 0) {
                        i12 -= 2;
                        if (b11 < -62) {
                            break;
                        }
                        long j17 = 1 + j12;
                        if (UnsafeUtil.s(j12, bArr) > -65) {
                            break;
                        }
                        j12 = j17;
                    } else {
                        return b11;
                    }
                } else {
                    return 0;
                }
            }
            return -1;
        }

        /* JADX WARN: Code restructure failed: missing block: B:69:0x0039, code lost:
        
            return -1;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static int partialIsValidUtf8(long j11, int i11) {
            int unsafeEstimateConsecutiveAscii = unsafeEstimateConsecutiveAscii(j11, i11);
            long j12 = j11 + unsafeEstimateConsecutiveAscii;
            int i12 = i11 - unsafeEstimateConsecutiveAscii;
            while (true) {
                byte b11 = 0;
                while (true) {
                    if (i12 <= 0) {
                        break;
                    }
                    long j13 = j12 + 1;
                    b11 = UnsafeUtil.r(j12);
                    if (b11 < 0) {
                        j12 = j13;
                        break;
                    }
                    i12--;
                    j12 = j13;
                }
                if (i12 != 0) {
                    int i13 = i12 - 1;
                    if (b11 >= -32) {
                        if (b11 >= -16) {
                            if (i13 < 3) {
                                return unsafeIncompleteStateFor(j12, b11, i13);
                            }
                            i12 -= 4;
                            long j14 = 1 + j12;
                            byte r11 = UnsafeUtil.r(j12);
                            if (r11 > -65) {
                                break;
                            }
                            if ((((r11 + 112) + (b11 << 28)) >> 30) != 0) {
                                break;
                            }
                            long j15 = 2 + j12;
                            if (UnsafeUtil.r(j14) > -65) {
                                break;
                            }
                            j12 += 3;
                            if (UnsafeUtil.r(j15) > -65) {
                                break;
                            }
                        } else {
                            if (i13 < 2) {
                                return unsafeIncompleteStateFor(j12, b11, i13);
                            }
                            i12 -= 3;
                            long j16 = 1 + j12;
                            byte r12 = UnsafeUtil.r(j12);
                            if (r12 > -65 || ((b11 == -32 && r12 < -96) || (b11 == -19 && r12 >= -96))) {
                                break;
                            }
                            j12 += 2;
                            if (UnsafeUtil.r(j16) > -65) {
                                break;
                            }
                        }
                    } else if (i13 != 0) {
                        i12 -= 2;
                        if (b11 < -62) {
                            break;
                        }
                        long j17 = 1 + j12;
                        if (UnsafeUtil.r(j12) > -65) {
                            break;
                        }
                        j12 = j17;
                    } else {
                        return b11;
                    }
                } else {
                    return 0;
                }
            }
            return -1;
        }
    }

    static final class SafeProcessor extends b {
        SafeProcessor() {
        }

        private static int partialIsValidUtf8NonAscii(byte[] bArr, int i11, int i12) {
            while (i11 < i12) {
                int i13 = i11 + 1;
                byte b11 = bArr[i11];
                if (b11 < 0) {
                    if (b11 < -32) {
                        if (i13 >= i12) {
                            return b11;
                        }
                        if (b11 >= -62) {
                            i11 += 2;
                            if (bArr[i13] > -65) {
                            }
                        }
                        return -1;
                    }
                    if (b11 < -16) {
                        if (i13 >= i12 - 1) {
                            return Utf8.c(i13, i12, bArr);
                        }
                        int i14 = i11 + 2;
                        byte b12 = bArr[i13];
                        if (b12 <= -65 && ((b11 != -32 || b12 >= -96) && (b11 != -19 || b12 < -96))) {
                            i11 += 3;
                            if (bArr[i14] > -65) {
                            }
                        }
                        return -1;
                    }
                    if (i13 >= i12 - 2) {
                        return Utf8.c(i13, i12, bArr);
                    }
                    int i15 = i11 + 2;
                    byte b13 = bArr[i13];
                    if (b13 <= -65) {
                        if ((((b13 + 112) + (b11 << 28)) >> 30) == 0) {
                            int i16 = i11 + 3;
                            if (bArr[i15] <= -65) {
                                i11 += 4;
                                if (bArr[i16] > -65) {
                                }
                            }
                        }
                    }
                    return -1;
                }
                i11 = i13;
            }
            return 0;
        }

        @Override // com.google.protobuf.Utf8.b
        String decodeUtf8(byte[] bArr, int i11, int i12) throws InvalidProtocolBufferException {
            if ((i11 | i12 | ((bArr.length - i11) - i12)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i11), Integer.valueOf(i12)));
            }
            int i13 = i11 + i12;
            char[] cArr = new char[i12];
            int i14 = 0;
            while (i11 < i13) {
                byte b11 = bArr[i11];
                if (!a.b(b11)) {
                    break;
                }
                i11++;
                a.c(b11, cArr, i14);
                i14++;
            }
            int i15 = i14;
            while (i11 < i13) {
                int i16 = i11 + 1;
                byte b12 = bArr[i11];
                if (a.b(b12)) {
                    int i17 = i15 + 1;
                    a.c(b12, cArr, i15);
                    int i18 = i16;
                    while (i18 < i13) {
                        byte b13 = bArr[i18];
                        if (!a.b(b13)) {
                            break;
                        }
                        i18++;
                        a.c(b13, cArr, i17);
                        i17++;
                    }
                    i15 = i17;
                    i11 = i18;
                } else if (a.d(b12)) {
                    if (i16 >= i13) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    i11 += 2;
                    a.e(b12, bArr[i16], cArr, i15);
                    i15++;
                } else if (a.f(b12)) {
                    if (i16 >= i13 - 1) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    int i19 = i11 + 2;
                    i11 += 3;
                    a.g(b12, bArr[i16], bArr[i19], cArr, i15);
                    i15++;
                } else {
                    if (i16 >= i13 - 2) {
                        throw InvalidProtocolBufferException.invalidUtf8();
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

        @Override // com.google.protobuf.Utf8.b
        String decodeUtf8Direct(ByteBuffer byteBuffer, int i11, int i12) throws InvalidProtocolBufferException {
            return decodeUtf8Default(byteBuffer, i11, i12);
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
        
            return r10 + r0;
         */
        @Override // com.google.protobuf.Utf8.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        int encodeUtf8(String str, byte[] bArr, int i11, int i12) {
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
                            if (55296 > charAt2 || charAt2 > 57343 || ((i13 = i16 + 1) != str.length() && Character.isSurrogatePair(charAt2, str.charAt(i13)))) {
                                throw new ArrayIndexOutOfBoundsException("Not enough space in output buffer to encode UTF-8 string");
                            }
                            throw new c(i16, length);
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
                        throw new c(i16 - 1, length);
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

        @Override // com.google.protobuf.Utf8.b
        void encodeUtf8Direct(String str, ByteBuffer byteBuffer) {
            encodeUtf8Default(str, byteBuffer);
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0015, code lost:
        
            if (r8[r9] > (-65)) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0046, code lost:
        
            if (r8[r9] > (-65)) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x0083, code lost:
        
            if (r8[r7] > (-65)) goto L53;
         */
        @Override // com.google.protobuf.Utf8.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        int partialIsValidUtf8(int i11, byte[] bArr, int i12, int i13) {
            byte b11;
            int i14;
            int i15;
            if (i11 != 0) {
                if (i12 >= i13) {
                    return i11;
                }
                byte b12 = (byte) i11;
                if (b12 < -32) {
                    if (b12 >= -62) {
                        i15 = i12 + 1;
                    }
                    return -1;
                }
                if (b12 < -16) {
                    byte b13 = (byte) (~(i11 >> 8));
                    if (b13 == 0) {
                        int i16 = i12 + 1;
                        byte b14 = bArr[i12];
                        if (i16 >= i13) {
                            return Utf8.k(b12, b14);
                        }
                        i12 = i16;
                        b13 = b14;
                    }
                    if (b13 <= -65 && ((b12 != -32 || b13 >= -96) && (b12 != -19 || b13 < -96))) {
                        i15 = i12 + 1;
                    }
                    return -1;
                }
                byte b15 = (byte) (~(i11 >> 8));
                if (b15 == 0) {
                    i14 = i12 + 1;
                    b15 = bArr[i12];
                    if (i14 >= i13) {
                        return Utf8.k(b12, b15);
                    }
                    b11 = 0;
                } else {
                    b11 = (byte) (i11 >> 16);
                    i14 = i12;
                }
                if (b11 == 0) {
                    int i17 = i14 + 1;
                    byte b16 = bArr[i14];
                    if (i17 >= i13) {
                        return Utf8.l(b12, b15, b16);
                    }
                    b11 = b16;
                    i14 = i17;
                }
                if (b15 <= -65) {
                    if ((((b15 + 112) + (b12 << 28)) >> 30) == 0 && b11 <= -65) {
                        i12 = i14 + 1;
                    }
                }
                return -1;
                i12 = i15;
            }
            return partialIsValidUtf8(bArr, i12, i13);
        }

        @Override // com.google.protobuf.Utf8.b
        int partialIsValidUtf8Direct(int i11, ByteBuffer byteBuffer, int i12, int i13) {
            return partialIsValidUtf8Default(i11, byteBuffer, i12, i13);
        }

        private static int partialIsValidUtf8(byte[] bArr, int i11, int i12) {
            while (i11 < i12 && bArr[i11] >= 0) {
                i11++;
            }
            if (i11 >= i12) {
                return 0;
            }
            return partialIsValidUtf8NonAscii(bArr, i11, i12);
        }
    }
}
