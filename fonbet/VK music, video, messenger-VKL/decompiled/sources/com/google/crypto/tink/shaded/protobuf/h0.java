package com.google.crypto.tink.shaded.protobuf;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import ru.ok.android.commons.nio.charset.CharsetEncoder;
import ru.ok.android.webrtc.mediarecord.VideoRecord;
import ru.ok.proto.rtmp.amf.AmfConstants;
import xsna.efz;
import xsna.m12;
import xsna.u5q0;

/* compiled from: Utf8.java */
/* loaded from: classes.dex */
public final class h0 {
    public static final b a;

    /* compiled from: Utf8.java */
    public static class a {
        public static void a(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) throws InvalidProtocolBufferException {
            if (!d(b2)) {
                if ((((b2 + 112) + (b << 28)) >> 30) == 0 && !d(b3) && !d(b4)) {
                    int i2 = ((b & 7) << 18) | ((b2 & CharsetEncoder.DEFAULT_REPLACEMENT) << 12) | ((b3 & CharsetEncoder.DEFAULT_REPLACEMENT) << 6) | (b4 & CharsetEncoder.DEFAULT_REPLACEMENT);
                    cArr[i] = (char) ((i2 >>> 10) + 55232);
                    cArr[i + 1] = (char) ((i2 & IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE) + 56320);
                    return;
                }
            }
            throw InvalidProtocolBufferException.d();
        }

        public static void b(byte b, byte b2, char[] cArr, int i) throws InvalidProtocolBufferException {
            if (b < -62 || d(b2)) {
                throw InvalidProtocolBufferException.d();
            }
            cArr[i] = (char) (((b & 31) << 6) | (b2 & CharsetEncoder.DEFAULT_REPLACEMENT));
        }

        public static void c(byte b, byte b2, byte b3, char[] cArr, int i) throws InvalidProtocolBufferException {
            if (d(b2) || ((b == -32 && b2 < -96) || ((b == -19 && b2 >= -96) || d(b3)))) {
                throw InvalidProtocolBufferException.d();
            }
            cArr[i] = (char) (((b & AmfConstants.TYPE_XML_DOCUMENT_MARKER) << 12) | ((b2 & CharsetEncoder.DEFAULT_REPLACEMENT) << 6) | (b3 & CharsetEncoder.DEFAULT_REPLACEMENT));
        }

        public static boolean d(byte b) {
            return b > -65;
        }
    }

    /* compiled from: Utf8.java */
    public static abstract class b {
        public abstract String a(int i, int i2, byte[] bArr) throws InvalidProtocolBufferException;

        public abstract int b(String str, byte[] bArr, int i, int i2);

        public final boolean c(int i, int i2, byte[] bArr) {
            return d(i, i2, bArr) == 0;
        }

        public abstract int d(int i, int i2, byte[] bArr);
    }

    /* compiled from: Utf8.java */
    public static final class c extends b {
        @Override // com.google.crypto.tink.shaded.protobuf.h0.b
        public final String a(int i, int i2, byte[] bArr) throws InvalidProtocolBufferException {
            if ((i | i2 | ((bArr.length - i) - i2)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
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
            int i5 = i4;
            while (i < i3) {
                int i6 = i + 1;
                byte b2 = bArr[i];
                if (b2 >= 0) {
                    int i7 = i5 + 1;
                    cArr[i5] = (char) b2;
                    int i8 = i6;
                    while (i8 < i3) {
                        byte b3 = bArr[i8];
                        if (b3 < 0) {
                            break;
                        }
                        i8++;
                        cArr[i7] = (char) b3;
                        i7++;
                    }
                    i5 = i7;
                    i = i8;
                } else if (b2 < -32) {
                    if (i6 >= i3) {
                        throw InvalidProtocolBufferException.d();
                    }
                    i += 2;
                    a.b(b2, bArr[i6], cArr, i5);
                    i5++;
                } else if (b2 < -16) {
                    if (i6 >= i3 - 1) {
                        throw InvalidProtocolBufferException.d();
                    }
                    int i9 = i + 2;
                    i += 3;
                    a.c(b2, bArr[i6], bArr[i9], cArr, i5);
                    i5++;
                } else {
                    if (i6 >= i3 - 2) {
                        throw InvalidProtocolBufferException.d();
                    }
                    byte b4 = bArr[i6];
                    int i10 = i + 3;
                    byte b5 = bArr[i + 2];
                    i += 4;
                    a.a(b2, b4, b5, bArr[i10], cArr, i5);
                    i5 += 2;
                }
            }
            return new String(cArr, 0, i5);
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
        
            return r10 + r0;
         */
        @Override // com.google.crypto.tink.shaded.protobuf.h0.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final int b(String str, byte[] bArr, int i, int i2) {
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
                    bArr[i7] = (byte) ((charAt2 >>> 6) | VideoRecord.DEFAULT_MAX_DIMENSION);
                    i7 += 2;
                    bArr[i8] = (byte) ((charAt2 & '?') | 128);
                } else {
                    if ((charAt2 >= 55296 && 57343 >= charAt2) || i7 > i5 - 3) {
                        if (i7 > i5 - 4) {
                            if (55296 <= charAt2 && charAt2 <= 57343 && ((i3 = i6 + 1) == str.length() || !Character.isSurrogatePair(charAt2, str.charAt(i3)))) {
                                throw new d(i6, length);
                            }
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + i7);
                        }
                        int i9 = i6 + 1;
                        if (i9 != str.length()) {
                            char charAt3 = str.charAt(i9);
                            if (Character.isSurrogatePair(charAt2, charAt3)) {
                                int codePoint = Character.toCodePoint(charAt2, charAt3);
                                bArr[i7] = (byte) ((codePoint >>> 18) | PsExtractor.VIDEO_STREAM_MASK);
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
                        throw new d(i6 - 1, length);
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

        @Override // com.google.crypto.tink.shaded.protobuf.h0.b
        public final int d(int i, int i2, byte[] bArr) {
            while (i < i2 && bArr[i] >= 0) {
                i++;
            }
            if (i >= i2) {
                return 0;
            }
            while (i < i2) {
                int i3 = i + 1;
                byte b = bArr[i];
                if (b >= 0) {
                    i = i3;
                } else if (b < -32) {
                    if (i3 >= i2) {
                        return b;
                    }
                    if (b < -62) {
                        return -1;
                    }
                    i += 2;
                    if (bArr[i3] > -65) {
                        return -1;
                    }
                } else if (b < -16) {
                    if (i3 >= i2 - 1) {
                        return h0.a(i3, i2, bArr);
                    }
                    int i4 = i + 2;
                    byte b2 = bArr[i3];
                    if (b2 > -65) {
                        return -1;
                    }
                    if (b == -32 && b2 < -96) {
                        return -1;
                    }
                    if (b == -19 && b2 >= -96) {
                        return -1;
                    }
                    i += 3;
                    if (bArr[i4] > -65) {
                        return -1;
                    }
                } else {
                    if (i3 >= i2 - 2) {
                        return h0.a(i3, i2, bArr);
                    }
                    int i5 = i + 2;
                    byte b3 = bArr[i3];
                    if (b3 > -65) {
                        return -1;
                    }
                    if ((((b3 + 112) + (b << 28)) >> 30) != 0) {
                        return -1;
                    }
                    int i6 = i + 3;
                    if (bArr[i5] > -65) {
                        return -1;
                    }
                    i += 4;
                    if (bArr[i6] > -65) {
                        return -1;
                    }
                }
            }
            return 0;
        }
    }

    /* compiled from: Utf8.java */
    public static class d extends IllegalArgumentException {
        public d(int i, int i2) {
            super(efz.a(i, i2, "Unpaired surrogate at index ", " of "));
        }
    }

    /* compiled from: Utf8.java */
    public static final class e extends b {
        public static int e(long j, byte[] bArr, int i, int i2) {
            if (i2 == 0) {
                b bVar = h0.a;
                if (i > -12) {
                    return -1;
                }
                return i;
            }
            if (i2 == 1) {
                return h0.c(i, u5q0.f(j, bArr));
            }
            if (i2 == 2) {
                return h0.d(i, u5q0.f(j, bArr), u5q0.f(j + 1, bArr));
            }
            throw new AssertionError();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.h0.b
        public final String a(int i, int i2, byte[] bArr) throws InvalidProtocolBufferException {
            if ((i | i2 | ((bArr.length - i) - i2)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
            }
            int i3 = i + i2;
            char[] cArr = new char[i2];
            int i4 = 0;
            while (i < i3) {
                byte f = u5q0.f(i, bArr);
                if (f < 0) {
                    break;
                }
                i++;
                cArr[i4] = (char) f;
                i4++;
            }
            int i5 = i4;
            while (i < i3) {
                int i6 = i + 1;
                byte f2 = u5q0.f(i, bArr);
                if (f2 >= 0) {
                    int i7 = i5 + 1;
                    cArr[i5] = (char) f2;
                    while (i6 < i3) {
                        byte f3 = u5q0.f(i6, bArr);
                        if (f3 < 0) {
                            break;
                        }
                        i6++;
                        cArr[i7] = (char) f3;
                        i7++;
                    }
                    i5 = i7;
                    i = i6;
                } else if (f2 < -32) {
                    if (i6 >= i3) {
                        throw InvalidProtocolBufferException.d();
                    }
                    i += 2;
                    a.b(f2, u5q0.f(i6, bArr), cArr, i5);
                    i5++;
                } else if (f2 < -16) {
                    if (i6 >= i3 - 1) {
                        throw InvalidProtocolBufferException.d();
                    }
                    int i8 = i + 2;
                    i += 3;
                    a.c(f2, u5q0.f(i6, bArr), u5q0.f(i8, bArr), cArr, i5);
                    i5++;
                } else {
                    if (i6 >= i3 - 2) {
                        throw InvalidProtocolBufferException.d();
                    }
                    byte f4 = u5q0.f(i6, bArr);
                    int i9 = i + 3;
                    byte f5 = u5q0.f(i + 2, bArr);
                    i += 4;
                    a.a(f2, f4, f5, u5q0.f(i9, bArr), cArr, i5);
                    i5 += 2;
                }
            }
            return new String(cArr, 0, i5);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.h0.b
        public final int b(String str, byte[] bArr, int i, int i2) {
            long j;
            long j2;
            long j3;
            int i3;
            char charAt;
            long j4 = i;
            long j5 = i2 + j4;
            int length = str.length();
            if (length > i2 || bArr.length - i2 < i) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(length - 1) + " at index " + (i + i2));
            }
            int i4 = 0;
            while (true) {
                j = 1;
                if (i4 >= length || (charAt = str.charAt(i4)) >= 128) {
                    break;
                }
                u5q0.j(bArr, j4, (byte) charAt);
                i4++;
                j4 = 1 + j4;
            }
            if (i4 == length) {
                return (int) j4;
            }
            while (i4 < length) {
                char charAt2 = str.charAt(i4);
                if (charAt2 < 128 && j4 < j5) {
                    u5q0.j(bArr, j4, (byte) charAt2);
                    j3 = j5;
                    j2 = j;
                    j4 += j;
                } else if (charAt2 >= 2048 || j4 > j5 - 2) {
                    j2 = j;
                    if ((charAt2 >= 55296 && 57343 >= charAt2) || j4 > j5 - 3) {
                        j3 = j5;
                        if (j4 > j3 - 4) {
                            if (55296 <= charAt2 && charAt2 <= 57343 && ((i3 = i4 + 1) == length || !Character.isSurrogatePair(charAt2, str.charAt(i3)))) {
                                throw new d(i4, length);
                            }
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + j4);
                        }
                        int i5 = i4 + 1;
                        if (i5 != length) {
                            char charAt3 = str.charAt(i5);
                            if (Character.isSurrogatePair(charAt2, charAt3)) {
                                int codePoint = Character.toCodePoint(charAt2, charAt3);
                                u5q0.j(bArr, j4, (byte) ((codePoint >>> 18) | PsExtractor.VIDEO_STREAM_MASK));
                                u5q0.j(bArr, j4 + j2, (byte) (((codePoint >>> 12) & 63) | 128));
                                long j6 = j4 + 3;
                                u5q0.j(bArr, j4 + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                j4 += 4;
                                u5q0.j(bArr, j6, (byte) ((codePoint & 63) | 128));
                                i4 = i5;
                            } else {
                                i4 = i5;
                            }
                        }
                        throw new d(i4 - 1, length);
                    }
                    u5q0.j(bArr, j4, (byte) ((charAt2 >>> '\f') | 480));
                    long j7 = j4 + 2;
                    j3 = j5;
                    u5q0.j(bArr, j4 + j2, (byte) (((charAt2 >>> 6) & 63) | 128));
                    j4 += 3;
                    u5q0.j(bArr, j7, (byte) ((charAt2 & '?') | 128));
                } else {
                    j2 = j;
                    long j8 = j4 + j2;
                    u5q0.j(bArr, j4, (byte) ((charAt2 >>> 6) | VideoRecord.DEFAULT_MAX_DIMENSION));
                    j4 += 2;
                    u5q0.j(bArr, j8, (byte) ((charAt2 & '?') | 128));
                    j3 = j5;
                }
                i4++;
                j = j2;
                j5 = j3;
            }
            return (int) j4;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.h0.b
        public final int d(int i, int i2, byte[] bArr) {
            int i3;
            if ((i | i2 | (bArr.length - i2)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
            }
            long j = i;
            int i4 = (int) (i2 - j);
            if (i4 >= 16) {
                long j2 = j;
                i3 = 0;
                while (true) {
                    if (i3 >= i4) {
                        i3 = i4;
                        break;
                    }
                    long j3 = j2 + 1;
                    if (u5q0.f(j2, bArr) < 0) {
                        break;
                    }
                    i3++;
                    j2 = j3;
                }
            } else {
                i3 = 0;
            }
            int i5 = i4 - i3;
            long j4 = j + i3;
            while (true) {
                byte b = 0;
                while (true) {
                    if (i5 <= 0) {
                        break;
                    }
                    long j5 = j4 + 1;
                    b = u5q0.f(j4, bArr);
                    if (b < 0) {
                        j4 = j5;
                        break;
                    }
                    i5--;
                    j4 = j5;
                }
                if (i5 == 0) {
                    return 0;
                }
                int i6 = i5 - 1;
                if (b < -32) {
                    if (i6 == 0) {
                        return b;
                    }
                    i5 -= 2;
                    if (b < -62) {
                        return -1;
                    }
                    long j6 = j4 + 1;
                    if (u5q0.f(j4, bArr) > -65) {
                        return -1;
                    }
                    j4 = j6;
                } else if (b < -16) {
                    if (i6 < 2) {
                        return e(j4, bArr, b, i6);
                    }
                    i5 -= 3;
                    long j7 = j4 + 1;
                    byte f = u5q0.f(j4, bArr);
                    if (f > -65) {
                        return -1;
                    }
                    if (b == -32 && f < -96) {
                        return -1;
                    }
                    if (b == -19 && f >= -96) {
                        return -1;
                    }
                    j4 += 2;
                    if (u5q0.f(j7, bArr) > -65) {
                        return -1;
                    }
                } else {
                    if (i6 < 3) {
                        return e(j4, bArr, b, i6);
                    }
                    i5 -= 4;
                    long j8 = j4 + 1;
                    byte f2 = u5q0.f(j4, bArr);
                    if (f2 > -65) {
                        return -1;
                    }
                    if ((((f2 + 112) + (b << 28)) >> 30) != 0) {
                        return -1;
                    }
                    long j9 = 2 + j4;
                    if (u5q0.f(j8, bArr) > -65) {
                        return -1;
                    }
                    j4 += 3;
                    if (u5q0.f(j9, bArr) > -65) {
                        return -1;
                    }
                }
            }
        }
    }

    static {
        a = (u5q0.f && u5q0.e && !m12.a()) ? new e() : new c();
    }

    public static int a(int i, int i2, byte[] bArr) {
        byte b2 = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 == 0) {
            if (b2 > -12) {
                return -1;
            }
            return b2;
        }
        if (i3 == 1) {
            return c(b2, bArr[i]);
        }
        if (i3 == 2) {
            return d(b2, bArr[i], bArr[i + 1]);
        }
        throw new AssertionError();
    }

    public static int b(String str) {
        int length = str.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && str.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char charAt = str.charAt(i2);
            if (charAt < 2048) {
                i3 += (127 - charAt) >>> 31;
                i2++;
            } else {
                int length2 = str.length();
                while (i2 < length2) {
                    char charAt2 = str.charAt(i2);
                    if (charAt2 < 2048) {
                        i += (127 - charAt2) >>> 31;
                    } else {
                        i += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(str, i2) < 65536) {
                                throw new d(i2, length2);
                            }
                            i2++;
                        }
                    }
                    i2++;
                }
                i3 += i;
            }
        }
        if (i3 >= length) {
            return i3;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i3 + 4294967296L));
    }

    public static int c(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    public static int d(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }
}
