package androidx.health.platform.client.proto;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.nio.charset.Charset;
import java.util.Arrays;
import ru.ok.android.commons.nio.charset.CharsetEncoder;
import ru.ok.android.webrtc.mediarecord.VideoRecord;
import ru.ok.proto.rtmp.amf.AmfConstants;
import xsna.efz;
import xsna.l12;
import xsna.t5q0;

/* compiled from: Utf8.java */
/* loaded from: classes12.dex */
public final class f1 {
    public static final b a;

    /* compiled from: Utf8.java */
    public static class a {
        public static boolean a(byte b) {
            return b > -65;
        }
    }

    /* compiled from: Utf8.java */
    public static abstract class b {
        public abstract String a(int i, int i2, byte[] bArr) throws InvalidProtocolBufferException;

        public abstract int b(String str, byte[] bArr, int i, int i2);

        public abstract int c(int i, int i2, byte[] bArr);
    }

    /* compiled from: Utf8.java */
    public static final class c extends b {
        @Override // androidx.health.platform.client.proto.f1.b
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
            while (i < i3) {
                int i5 = i + 1;
                byte b2 = bArr[i];
                if (b2 >= 0) {
                    int i6 = i4 + 1;
                    cArr[i4] = (char) b2;
                    while (i5 < i3) {
                        byte b3 = bArr[i5];
                        if (b3 < 0) {
                            break;
                        }
                        i5++;
                        cArr[i6] = (char) b3;
                        i6++;
                    }
                    i4 = i6;
                    i = i5;
                } else if (b2 < -32) {
                    if (i5 >= i3) {
                        throw InvalidProtocolBufferException.g();
                    }
                    i += 2;
                    byte b4 = bArr[i5];
                    int i7 = i4 + 1;
                    if (b2 < -62 || a.a(b4)) {
                        throw InvalidProtocolBufferException.g();
                    }
                    cArr[i4] = (char) ((b4 & CharsetEncoder.DEFAULT_REPLACEMENT) | ((b2 & 31) << 6));
                    i4 = i7;
                } else {
                    if (b2 >= -16) {
                        if (i5 >= i3 - 2) {
                            throw InvalidProtocolBufferException.g();
                        }
                        byte b5 = bArr[i5];
                        int i8 = i + 3;
                        byte b6 = bArr[i + 2];
                        i += 4;
                        byte b7 = bArr[i8];
                        int i9 = i4 + 1;
                        if (!a.a(b5)) {
                            if ((((b5 + 112) + (b2 << 28)) >> 30) == 0 && !a.a(b6) && !a.a(b7)) {
                                int i10 = ((b5 & CharsetEncoder.DEFAULT_REPLACEMENT) << 12) | ((b2 & 7) << 18) | ((b6 & CharsetEncoder.DEFAULT_REPLACEMENT) << 6) | (b7 & CharsetEncoder.DEFAULT_REPLACEMENT);
                                cArr[i4] = (char) ((i10 >>> 10) + 55232);
                                cArr[i9] = (char) ((i10 & IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE) + 56320);
                                i4 += 2;
                            }
                        }
                        throw InvalidProtocolBufferException.g();
                    }
                    if (i5 >= i3 - 1) {
                        throw InvalidProtocolBufferException.g();
                    }
                    int i11 = i + 2;
                    byte b8 = bArr[i5];
                    i += 3;
                    byte b9 = bArr[i11];
                    int i12 = i4 + 1;
                    if (a.a(b8) || ((b2 == -32 && b8 < -96) || ((b2 == -19 && b8 >= -96) || a.a(b9)))) {
                        throw InvalidProtocolBufferException.g();
                    }
                    cArr[i4] = (char) (((b8 & CharsetEncoder.DEFAULT_REPLACEMENT) << 6) | ((b2 & AmfConstants.TYPE_XML_DOCUMENT_MARKER) << 12) | (b9 & CharsetEncoder.DEFAULT_REPLACEMENT));
                    i4 = i12;
                }
            }
            return new String(cArr, 0, i4);
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
        
            return r10 + r0;
         */
        @Override // androidx.health.platform.client.proto.f1.b
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

        @Override // androidx.health.platform.client.proto.f1.b
        public final int c(int i, int i2, byte[] bArr) {
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
                        return f1.a(i3, i2, bArr);
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
                        return f1.a(i3, i2, bArr);
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
        public static int d(long j, byte[] bArr, int i, int i2) {
            if (i2 == 0) {
                b bVar = f1.a;
                if (i > -12) {
                    return -1;
                }
                return i;
            }
            if (i2 == 1) {
                return f1.c(i, t5q0.g(j, bArr));
            }
            if (i2 == 2) {
                return f1.d(i, t5q0.g(j, bArr), t5q0.g(j + 1, bArr));
            }
            throw new AssertionError();
        }

        @Override // androidx.health.platform.client.proto.f1.b
        public final String a(int i, int i2, byte[] bArr) throws InvalidProtocolBufferException {
            Charset charset = b0.a;
            String str = new String(bArr, i, i2, charset);
            if (str.indexOf(65533) >= 0 && !Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i, i2 + i))) {
                throw InvalidProtocolBufferException.g();
            }
            return str;
        }

        @Override // androidx.health.platform.client.proto.f1.b
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
                t5q0.k(bArr, j4, (byte) charAt);
                i4++;
                j4 = 1 + j4;
            }
            if (i4 == length) {
                return (int) j4;
            }
            while (i4 < length) {
                char charAt2 = str.charAt(i4);
                if (charAt2 < 128 && j4 < j5) {
                    t5q0.k(bArr, j4, (byte) charAt2);
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
                                t5q0.k(bArr, j4, (byte) ((codePoint >>> 18) | PsExtractor.VIDEO_STREAM_MASK));
                                t5q0.k(bArr, j4 + j2, (byte) (((codePoint >>> 12) & 63) | 128));
                                long j6 = j4 + 3;
                                t5q0.k(bArr, j4 + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                j4 += 4;
                                t5q0.k(bArr, j6, (byte) ((codePoint & 63) | 128));
                                i4 = i5;
                            } else {
                                i4 = i5;
                            }
                        }
                        throw new d(i4 - 1, length);
                    }
                    t5q0.k(bArr, j4, (byte) ((charAt2 >>> '\f') | 480));
                    long j7 = j4 + 2;
                    j3 = j5;
                    t5q0.k(bArr, j4 + j2, (byte) (((charAt2 >>> 6) & 63) | 128));
                    j4 += 3;
                    t5q0.k(bArr, j7, (byte) ((charAt2 & '?') | 128));
                } else {
                    j2 = j;
                    long j8 = j4 + j2;
                    t5q0.k(bArr, j4, (byte) ((charAt2 >>> 6) | VideoRecord.DEFAULT_MAX_DIMENSION));
                    j4 += 2;
                    t5q0.k(bArr, j8, (byte) ((charAt2 & '?') | 128));
                    j3 = j5;
                }
                i4++;
                j = j2;
                j5 = j3;
            }
            return (int) j4;
        }

        @Override // androidx.health.platform.client.proto.f1.b
        public final int c(int i, int i2, byte[] bArr) {
            int i3;
            if ((i | i2 | (bArr.length - i2)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
            }
            long j = i;
            int i4 = (int) (i2 - j);
            if (i4 >= 16) {
                int i5 = 8 - (((int) j) & 7);
                long j2 = j;
                i3 = 0;
                while (true) {
                    if (i3 >= i5) {
                        while (true) {
                            int i6 = i3 + 8;
                            if (i6 > i4) {
                                break;
                            }
                            if ((t5q0.c.h(t5q0.f + j2, bArr) & (-9187201950435737472L)) != 0) {
                                break;
                            }
                            j2 += 8;
                            i3 = i6;
                        }
                        while (true) {
                            if (i3 >= i4) {
                                i3 = i4;
                                break;
                            }
                            long j3 = j2 + 1;
                            if (t5q0.g(j2, bArr) < 0) {
                                break;
                            }
                            i3++;
                            j2 = j3;
                        }
                    } else {
                        long j4 = j2 + 1;
                        if (t5q0.g(j2, bArr) < 0) {
                            break;
                        }
                        i3++;
                        j2 = j4;
                    }
                }
            } else {
                i3 = 0;
            }
            int i7 = i4 - i3;
            long j5 = j + i3;
            while (true) {
                byte b = 0;
                while (true) {
                    if (i7 <= 0) {
                        break;
                    }
                    long j6 = j5 + 1;
                    b = t5q0.g(j5, bArr);
                    if (b < 0) {
                        j5 = j6;
                        break;
                    }
                    i7--;
                    j5 = j6;
                }
                if (i7 == 0) {
                    return 0;
                }
                int i8 = i7 - 1;
                if (b < -32) {
                    if (i8 == 0) {
                        return b;
                    }
                    i7 -= 2;
                    if (b < -62) {
                        return -1;
                    }
                    long j7 = j5 + 1;
                    if (t5q0.g(j5, bArr) > -65) {
                        return -1;
                    }
                    j5 = j7;
                } else if (b < -16) {
                    if (i8 < 2) {
                        return d(j5, bArr, b, i8);
                    }
                    i7 -= 3;
                    long j8 = j5 + 1;
                    byte g = t5q0.g(j5, bArr);
                    if (g > -65) {
                        return -1;
                    }
                    if (b == -32 && g < -96) {
                        return -1;
                    }
                    if (b == -19 && g >= -96) {
                        return -1;
                    }
                    j5 += 2;
                    if (t5q0.g(j8, bArr) > -65) {
                        return -1;
                    }
                } else {
                    if (i8 < 3) {
                        return d(j5, bArr, b, i8);
                    }
                    i7 -= 4;
                    long j9 = j5 + 1;
                    byte g2 = t5q0.g(j5, bArr);
                    if (g2 > -65) {
                        return -1;
                    }
                    if ((((g2 + 112) + (b << 28)) >> 30) != 0) {
                        return -1;
                    }
                    long j10 = 2 + j5;
                    if (t5q0.g(j9, bArr) > -65) {
                        return -1;
                    }
                    j5 += 3;
                    if (t5q0.g(j10, bArr) > -65) {
                        return -1;
                    }
                }
            }
        }
    }

    static {
        a = (t5q0.e && t5q0.d && !l12.a()) ? new e() : new c();
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
