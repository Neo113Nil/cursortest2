package com.google.protobuf;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.nio.ByteBuffer;
import ru.ok.android.commons.nio.charset.CharsetEncoder;
import ru.ok.android.webrtc.mediarecord.VideoRecord;
import ru.ok.proto.rtmp.amf.AmfConstants;
import xsna.efz;
import xsna.n12;
import xsna.sa30;
import xsna.v5q0;

/* compiled from: Utf8.java */
/* loaded from: classes.dex */
public final class b0 {
    public static final c a;

    /* compiled from: Utf8.java */
    /* loaded from: classes13.dex */
    public static class a {
        public static void a(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) throws InvalidProtocolBufferException {
            if (!h(b2)) {
                if ((((b2 + 112) + (b << 28)) >> 30) == 0 && !h(b3) && !h(b4)) {
                    int i2 = ((b & 7) << 18) | ((b2 & CharsetEncoder.DEFAULT_REPLACEMENT) << 12) | ((b3 & CharsetEncoder.DEFAULT_REPLACEMENT) << 6) | (b4 & CharsetEncoder.DEFAULT_REPLACEMENT);
                    cArr[i] = (char) ((i2 >>> 10) + 55232);
                    cArr[i + 1] = (char) ((i2 & IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE) + 56320);
                    return;
                }
            }
            throw InvalidProtocolBufferException.invalidUtf8();
        }

        public static boolean b(byte b) {
            return b >= 0;
        }

        public static void c(byte b, char[] cArr, int i) {
            cArr[i] = (char) b;
        }

        public static boolean d(byte b) {
            return b < -32;
        }

        public static void e(byte b, byte b2, char[] cArr, int i) throws InvalidProtocolBufferException {
            if (b < -62 || h(b2)) {
                throw InvalidProtocolBufferException.invalidUtf8();
            }
            cArr[i] = (char) (((b & 31) << 6) | (b2 & CharsetEncoder.DEFAULT_REPLACEMENT));
        }

        public static boolean f(byte b) {
            return b < -16;
        }

        public static void g(byte b, byte b2, byte b3, char[] cArr, int i) throws InvalidProtocolBufferException {
            if (h(b2) || ((b == -32 && b2 < -96) || ((b == -19 && b2 >= -96) || h(b3)))) {
                throw InvalidProtocolBufferException.invalidUtf8();
            }
            cArr[i] = (char) (((b & AmfConstants.TYPE_XML_DOCUMENT_MARKER) << 12) | ((b2 & CharsetEncoder.DEFAULT_REPLACEMENT) << 6) | (b3 & CharsetEncoder.DEFAULT_REPLACEMENT));
        }

        public static boolean h(byte b) {
            return b > -65;
        }
    }

    /* compiled from: Utf8.java */
    public static abstract class b {
        public static String a(ByteBuffer byteBuffer, int i, int i2) throws InvalidProtocolBufferException {
            if ((i | i2 | ((byteBuffer.limit() - i) - i2)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i2)));
            }
            int i3 = i + i2;
            char[] cArr = new char[i2];
            int i4 = 0;
            while (i < i3) {
                byte b = byteBuffer.get(i);
                if (!a.b(b)) {
                    break;
                }
                i++;
                a.c(b, cArr, i4);
                i4++;
            }
            int i5 = i4;
            while (i < i3) {
                int i6 = i + 1;
                byte b2 = byteBuffer.get(i);
                if (a.b(b2)) {
                    int i7 = i5 + 1;
                    a.c(b2, cArr, i5);
                    int i8 = i6;
                    while (i8 < i3) {
                        byte b3 = byteBuffer.get(i8);
                        if (!a.b(b3)) {
                            break;
                        }
                        i8++;
                        a.c(b3, cArr, i7);
                        i7++;
                    }
                    i5 = i7;
                    i = i8;
                } else if (a.d(b2)) {
                    if (i6 >= i3) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    i += 2;
                    a.e(b2, byteBuffer.get(i6), cArr, i5);
                    i5++;
                } else if (a.f(b2)) {
                    if (i6 >= i3 - 1) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    int i9 = i + 2;
                    i += 3;
                    a.g(b2, byteBuffer.get(i6), byteBuffer.get(i9), cArr, i5);
                    i5++;
                } else {
                    if (i6 >= i3 - 2) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    byte b4 = byteBuffer.get(i6);
                    int i10 = i + 3;
                    byte b5 = byteBuffer.get(i + 2);
                    i += 4;
                    a.a(b2, b4, b5, byteBuffer.get(i10), cArr, i5);
                    i5 += 2;
                }
            }
            return new String(cArr, 0, i5);
        }

        public static void b(CharSequence charSequence, ByteBuffer byteBuffer) {
            int i;
            int length = charSequence.length();
            int position = byteBuffer.position();
            int i2 = 0;
            while (i2 < length) {
                try {
                    char charAt = charSequence.charAt(i2);
                    if (charAt >= 128) {
                        break;
                    }
                    byteBuffer.put(position + i2, (byte) charAt);
                    i2++;
                } catch (IndexOutOfBoundsException unused) {
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i2) + " at index " + (Math.max(i2, (position - byteBuffer.position()) + 1) + byteBuffer.position()));
                }
            }
            if (i2 == length) {
                sa30.I(position + i2, byteBuffer);
                return;
            }
            position += i2;
            while (i2 < length) {
                char charAt2 = charSequence.charAt(i2);
                if (charAt2 < 128) {
                    byteBuffer.put(position, (byte) charAt2);
                } else if (charAt2 < 2048) {
                    int i3 = position + 1;
                    try {
                        byteBuffer.put(position, (byte) ((charAt2 >>> 6) | PsExtractor.AUDIO_STREAM));
                        byteBuffer.put(i3, (byte) ((charAt2 & '?') | 128));
                        position = i3;
                    } catch (IndexOutOfBoundsException unused2) {
                        position = i3;
                        throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i2) + " at index " + (Math.max(i2, (position - byteBuffer.position()) + 1) + byteBuffer.position()));
                    }
                } else {
                    if (charAt2 >= 55296 && 57343 >= charAt2) {
                        int i4 = i2 + 1;
                        if (i4 != length) {
                            try {
                                char charAt3 = charSequence.charAt(i4);
                                if (Character.isSurrogatePair(charAt2, charAt3)) {
                                    int codePoint = Character.toCodePoint(charAt2, charAt3);
                                    int i5 = position + 1;
                                    try {
                                        byteBuffer.put(position, (byte) ((codePoint >>> 18) | PsExtractor.VIDEO_STREAM_MASK));
                                        i = position + 2;
                                    } catch (IndexOutOfBoundsException unused3) {
                                        position = i5;
                                        i2 = i4;
                                        throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i2) + " at index " + (Math.max(i2, (position - byteBuffer.position()) + 1) + byteBuffer.position()));
                                    }
                                    try {
                                        byteBuffer.put(i5, (byte) (((codePoint >>> 12) & 63) | 128));
                                        position += 3;
                                        byteBuffer.put(i, (byte) (((codePoint >>> 6) & 63) | 128));
                                        byteBuffer.put(position, (byte) ((codePoint & 63) | 128));
                                        i2 = i4;
                                    } catch (IndexOutOfBoundsException unused4) {
                                        i2 = i4;
                                        position = i;
                                        throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i2) + " at index " + (Math.max(i2, (position - byteBuffer.position()) + 1) + byteBuffer.position()));
                                    }
                                } else {
                                    i2 = i4;
                                }
                            } catch (IndexOutOfBoundsException unused5) {
                            }
                        }
                        throw new d(i2, length);
                    }
                    int i6 = position + 1;
                    byteBuffer.put(position, (byte) ((charAt2 >>> '\f') | 224));
                    position += 2;
                    byteBuffer.put(i6, (byte) (((charAt2 >>> 6) & 63) | 128));
                    byteBuffer.put(position, (byte) ((charAt2 & '?') | 128));
                }
                i2++;
                position++;
            }
            sa30.I(position, byteBuffer);
        }

        public static int f(int i, int i2, int i3, ByteBuffer byteBuffer) {
            byte b;
            int i4;
            byte b2;
            int i5;
            int i6 = i2;
            if (i != 0) {
                if (i6 >= i3) {
                    return i;
                }
                byte b3 = (byte) i;
                if (b3 < -32) {
                    if (b3 < -62) {
                        return -1;
                    }
                    int i7 = i6 + 1;
                    if (byteBuffer.get(i6) > -65) {
                        return -1;
                    }
                    i6 = i7;
                } else if (b3 < -16) {
                    byte b4 = (byte) (~(i >> 8));
                    if (b4 == 0) {
                        i5 = i6 + 1;
                        b2 = byteBuffer.get(i6);
                        if (i5 >= i3) {
                            return b0.g(b3, b2);
                        }
                    } else {
                        b2 = b4;
                        i5 = i6;
                    }
                    if (b2 > -65) {
                        return -1;
                    }
                    if (b3 == -32 && b2 < -96) {
                        return -1;
                    }
                    if (b3 == -19 && b2 >= -96) {
                        return -1;
                    }
                    i6 = i5 + 1;
                    if (byteBuffer.get(i5) > -65) {
                        return -1;
                    }
                } else {
                    byte b5 = (byte) (~(i >> 8));
                    if (b5 == 0) {
                        i4 = i6 + 1;
                        b5 = byteBuffer.get(i6);
                        if (i4 >= i3) {
                            return b0.g(b3, b5);
                        }
                        b = 0;
                    } else {
                        b = (byte) (i >> 16);
                        i4 = i6;
                    }
                    if (b == 0) {
                        int i8 = i4 + 1;
                        byte b6 = byteBuffer.get(i4);
                        if (i8 >= i3) {
                            return b0.h(b3, b5, b6);
                        }
                        b = b6;
                        i4 = i8;
                    }
                    if (b5 > -65) {
                        return -1;
                    }
                    if ((((b5 + 112) + (b3 << 28)) >> 30) != 0 || b > -65) {
                        return -1;
                    }
                    i6 = i4 + 1;
                    if (byteBuffer.get(i4) > -65) {
                        return -1;
                    }
                }
            }
            c cVar = b0.a;
            int i9 = i3 - 7;
            int i10 = i6;
            while (i10 < i9 && (byteBuffer.getLong(i10) & (-9187201950435737472L)) == 0) {
                i10 += 8;
            }
            int i11 = (i10 - i6) + i6;
            while (i11 < i3) {
                int i12 = i11 + 1;
                byte b7 = byteBuffer.get(i11);
                if (b7 >= 0) {
                    i11 = i12;
                } else if (b7 < -32) {
                    if (i12 >= i3) {
                        return b7;
                    }
                    if (b7 < -62 || byteBuffer.get(i12) > -65) {
                        return -1;
                    }
                    i11 += 2;
                } else if (b7 < -16) {
                    if (i12 >= i3 - 1) {
                        return b0.b(b7, i12, i3 - i12, byteBuffer);
                    }
                    int i13 = i11 + 2;
                    byte b8 = byteBuffer.get(i12);
                    if (b8 > -65) {
                        return -1;
                    }
                    if (b7 == -32 && b8 < -96) {
                        return -1;
                    }
                    if ((b7 == -19 && b8 >= -96) || byteBuffer.get(i13) > -65) {
                        return -1;
                    }
                    i11 += 3;
                } else {
                    if (i12 >= i3 - 2) {
                        return b0.b(b7, i12, i3 - i12, byteBuffer);
                    }
                    int i14 = i11 + 2;
                    byte b9 = byteBuffer.get(i12);
                    if (b9 > -65) {
                        return -1;
                    }
                    if ((((b9 + 112) + (b7 << 28)) >> 30) != 0) {
                        return -1;
                    }
                    int i15 = i11 + 3;
                    if (byteBuffer.get(i14) > -65) {
                        return -1;
                    }
                    i11 += 4;
                    if (byteBuffer.get(i15) > -65) {
                        return -1;
                    }
                }
            }
            return 0;
        }

        public final boolean c(int i, int i2, byte[] bArr) {
            return e(0, i, i2, bArr) == 0;
        }

        public final int d(int i, int i2, int i3, ByteBuffer byteBuffer) {
            if (!byteBuffer.hasArray()) {
                return byteBuffer.isDirect() ? g(i, i2, i3, byteBuffer) : f(i, i2, i3, byteBuffer);
            }
            int arrayOffset = byteBuffer.arrayOffset();
            return e(i, i2 + arrayOffset, arrayOffset + i3, byteBuffer.array());
        }

        public abstract int e(int i, int i2, int i3, byte[] bArr);

        public abstract int g(int i, int i2, int i3, ByteBuffer byteBuffer);
    }

    /* compiled from: Utf8.java */
    public static final class c extends b {
        /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
        
            if (r15[r13] > (-65)) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0047, code lost:
        
            if (r15[r13] > (-65)) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x0082, code lost:
        
            if (r15[r13] > (-65)) goto L50;
         */
        @Override // com.google.protobuf.b0.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final int e(int i, int i2, int i3, byte[] bArr) {
            byte b;
            int i4;
            if (i != 0) {
                if (i2 >= i3) {
                    return i;
                }
                byte b2 = (byte) i;
                if (b2 < -32) {
                    if (b2 >= -62) {
                        i4 = i2 + 1;
                    }
                    return -1;
                }
                if (b2 < -16) {
                    byte b3 = (byte) (~(i >> 8));
                    if (b3 == 0) {
                        int i5 = i2 + 1;
                        byte b4 = bArr[i2];
                        if (i5 >= i3) {
                            return b0.g(b2, b4);
                        }
                        i2 = i5;
                        b3 = b4;
                    }
                    if (b3 <= -65 && ((b2 != -32 || b3 >= -96) && (b2 != -19 || b3 < -96))) {
                        i4 = i2 + 1;
                    }
                    return -1;
                }
                byte b5 = (byte) (~(i >> 8));
                if (b5 == 0) {
                    int i6 = i2 + 1;
                    b5 = bArr[i2];
                    if (i6 >= i3) {
                        return b0.g(b2, b5);
                    }
                    i2 = i6;
                    b = 0;
                } else {
                    b = (byte) (i >> 16);
                }
                if (b == 0) {
                    int i7 = i2 + 1;
                    byte b6 = bArr[i2];
                    if (i7 >= i3) {
                        return b0.h(b2, b5, b6);
                    }
                    i2 = i7;
                    b = b6;
                }
                if (b5 <= -65) {
                    if ((((b5 + 112) + (b2 << 28)) >> 30) == 0 && b <= -65) {
                        i4 = i2 + 1;
                    }
                }
                return -1;
                i2 = i4;
            }
            while (i2 < i3 && bArr[i2] >= 0) {
                i2++;
            }
            if (i2 < i3) {
                while (i2 < i3) {
                    int i8 = i2 + 1;
                    byte b7 = bArr[i2];
                    if (b7 < 0) {
                        if (b7 < -32) {
                            if (i8 >= i3) {
                                return b7;
                            }
                            if (b7 >= -62) {
                                i2 += 2;
                                if (bArr[i8] > -65) {
                                }
                            }
                            return -1;
                        }
                        if (b7 < -16) {
                            if (i8 >= i3 - 1) {
                                return b0.a(i8, i3, bArr);
                            }
                            int i9 = i2 + 2;
                            byte b8 = bArr[i8];
                            if (b8 <= -65 && ((b7 != -32 || b8 >= -96) && (b7 != -19 || b8 < -96))) {
                                i2 += 3;
                                if (bArr[i9] > -65) {
                                }
                            }
                            return -1;
                        }
                        if (i8 >= i3 - 2) {
                            return b0.a(i8, i3, bArr);
                        }
                        int i10 = i2 + 2;
                        byte b9 = bArr[i8];
                        if (b9 <= -65) {
                            if ((((b9 + 112) + (b7 << 28)) >> 30) == 0) {
                                int i11 = i2 + 3;
                                if (bArr[i10] <= -65) {
                                    i2 += 4;
                                    if (bArr[i11] > -65) {
                                    }
                                }
                            }
                        }
                        return -1;
                    }
                    i2 = i8;
                }
            }
            return 0;
        }

        @Override // com.google.protobuf.b0.b
        public final int g(int i, int i2, int i3, ByteBuffer byteBuffer) {
            return b.f(i, i2, i3, byteBuffer);
        }

        public final String h(int i, int i2, byte[] bArr) throws InvalidProtocolBufferException {
            if ((i | i2 | ((bArr.length - i) - i2)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
            }
            int i3 = i + i2;
            char[] cArr = new char[i2];
            int i4 = 0;
            while (i < i3) {
                byte b = bArr[i];
                if (!a.b(b)) {
                    break;
                }
                i++;
                a.c(b, cArr, i4);
                i4++;
            }
            int i5 = i4;
            while (i < i3) {
                int i6 = i + 1;
                byte b2 = bArr[i];
                if (a.b(b2)) {
                    int i7 = i5 + 1;
                    a.c(b2, cArr, i5);
                    int i8 = i6;
                    while (i8 < i3) {
                        byte b3 = bArr[i8];
                        if (!a.b(b3)) {
                            break;
                        }
                        i8++;
                        a.c(b3, cArr, i7);
                        i7++;
                    }
                    i5 = i7;
                    i = i8;
                } else if (a.d(b2)) {
                    if (i6 >= i3) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    i += 2;
                    a.e(b2, bArr[i6], cArr, i5);
                    i5++;
                } else if (a.f(b2)) {
                    if (i6 >= i3 - 1) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    int i9 = i + 2;
                    i += 3;
                    a.g(b2, bArr[i6], bArr[i9], cArr, i5);
                    i5++;
                } else {
                    if (i6 >= i3 - 2) {
                        throw InvalidProtocolBufferException.invalidUtf8();
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
    }

    /* compiled from: Utf8.java */
    public static class d extends IllegalArgumentException {
        public d(int i, int i2) {
            super(efz.a(i, i2, "Unpaired surrogate at index ", " of "));
        }
    }

    static {
        if (v5q0.e && v5q0.d) {
            Class<?> cls = n12.a;
        }
        a = new c();
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
            return g(b2, bArr[i]);
        }
        if (i3 == 2) {
            return h(b2, bArr[i], bArr[i + 1]);
        }
        throw new AssertionError();
    }

    public static int b(int i, int i2, int i3, ByteBuffer byteBuffer) {
        if (i3 == 0) {
            if (i > -12) {
                return -1;
            }
            return i;
        }
        if (i3 == 1) {
            return g(i, byteBuffer.get(i2));
        }
        if (i3 == 2) {
            return h(i, byteBuffer.get(i2), byteBuffer.get(i2 + 1));
        }
        throw new AssertionError();
    }

    public static String c(ByteBuffer byteBuffer, int i, int i2) throws InvalidProtocolBufferException {
        c cVar = a;
        cVar.getClass();
        if (byteBuffer.hasArray()) {
            return cVar.h(byteBuffer.arrayOffset() + i, i2, byteBuffer.array());
        }
        return byteBuffer.isDirect() ? b.a(byteBuffer, i, i2) : b.a(byteBuffer, i, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0022, code lost:
    
        return r9 + r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int d(CharSequence charSequence, byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        char charAt;
        a.getClass();
        int length = charSequence.length();
        int i5 = i2 + i;
        int i6 = 0;
        while (i6 < length && (i4 = i6 + i) < i5 && (charAt = charSequence.charAt(i6)) < 128) {
            bArr[i4] = (byte) charAt;
            i6++;
        }
        int i7 = i + i6;
        while (i6 < length) {
            char charAt2 = charSequence.charAt(i6);
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
                        if (55296 <= charAt2 && charAt2 <= 57343 && ((i3 = i6 + 1) == charSequence.length() || !Character.isSurrogatePair(charAt2, charSequence.charAt(i3)))) {
                            throw new d(i6, length);
                        }
                        throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + i7);
                    }
                    int i9 = i6 + 1;
                    if (i9 != charSequence.length()) {
                        char charAt3 = charSequence.charAt(i9);
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

    public static void e(String str, ByteBuffer byteBuffer) {
        a.getClass();
        if (byteBuffer.hasArray()) {
            int arrayOffset = byteBuffer.arrayOffset();
            sa30.I(d(str, byteBuffer.array(), byteBuffer.position() + arrayOffset, byteBuffer.remaining()) - arrayOffset, byteBuffer);
        } else if (byteBuffer.isDirect()) {
            b.b(str, byteBuffer);
        } else {
            b.b(str, byteBuffer);
        }
    }

    public static int f(String str) {
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

    public static int g(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    public static int h(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }
}
