package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;
import java.util.Arrays;
import okio.Utf8;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class l1 extends m4.g {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1651e;

    public /* synthetic */ l1(int i5) {
        this.f1651e = i5;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    @Override // m4.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String f(byte[] bArr, int i5, int i10) {
        switch (this.f1651e) {
            case 0:
                if ((i5 | i10 | ((bArr.length - i5) - i10)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i5), Integer.valueOf(i10)));
                }
                int i11 = i5 + i10;
                char[] cArr = new char[i10];
                int i12 = 0;
                while (i5 < i11) {
                    byte b10 = bArr[i5];
                    if (b10 < 0) {
                        while (i5 < i11) {
                            int i13 = i5 + 1;
                            byte b11 = bArr[i5];
                            if (b11 >= 0) {
                                int i14 = i12 + 1;
                                cArr[i12] = (char) b11;
                                while (i13 < i11) {
                                    byte b12 = bArr[i13];
                                    if (b12 >= 0) {
                                        i13++;
                                        cArr[i14] = (char) b12;
                                        i14++;
                                    } else {
                                        i12 = i14;
                                        i5 = i13;
                                    }
                                }
                                i12 = i14;
                                i5 = i13;
                            } else if (b11 < -32) {
                                if (i13 >= i11) {
                                    throw c0.a();
                                }
                                i5 += 2;
                                byte b13 = bArr[i13];
                                int i15 = i12 + 1;
                                if (b11 < -62 || k2.x.v(b13)) {
                                    throw c0.a();
                                }
                                cArr[i12] = (char) ((b13 & Utf8.REPLACEMENT_BYTE) | ((b11 & 31) << 6));
                                i12 = i15;
                            } else if (b11 < -16) {
                                if (i13 >= i11 - 1) {
                                    throw c0.a();
                                }
                                int i16 = i5 + 2;
                                byte b14 = bArr[i13];
                                i5 += 3;
                                byte b15 = bArr[i16];
                                int i17 = i12 + 1;
                                if (k2.x.v(b14) || ((b11 == -32 && b14 < -96) || ((b11 == -19 && b14 >= -96) || k2.x.v(b15)))) {
                                    throw c0.a();
                                }
                                cArr[i12] = (char) (((b14 & Utf8.REPLACEMENT_BYTE) << 6) | ((b11 & 15) << 12) | (b15 & Utf8.REPLACEMENT_BYTE));
                                i12 = i17;
                            } else {
                                if (i13 >= i11 - 2) {
                                    throw c0.a();
                                }
                                byte b16 = bArr[i13];
                                int i18 = i5 + 3;
                                byte b17 = bArr[i5 + 2];
                                i5 += 4;
                                byte b18 = bArr[i18];
                                int i19 = i12 + 1;
                                if (k2.x.v(b16) || (((b16 + 112) + (b11 << 28)) >> 30) != 0 || k2.x.v(b17) || k2.x.v(b18)) {
                                    throw c0.a();
                                }
                                int i20 = ((b16 & Utf8.REPLACEMENT_BYTE) << 12) | ((b11 & 7) << 18) | ((b17 & Utf8.REPLACEMENT_BYTE) << 6) | (b18 & Utf8.REPLACEMENT_BYTE);
                                cArr[i12] = (char) ((i20 >>> 10) + Utf8.HIGH_SURROGATE_HEADER);
                                cArr[i19] = (char) ((i20 & 1023) + Utf8.LOG_SURROGATE_HEADER);
                                i12 += 2;
                            }
                        }
                        return new String(cArr, 0, i12);
                    }
                    i5++;
                    cArr[i12] = (char) b10;
                    i12++;
                }
                while (i5 < i11) {
                }
                return new String(cArr, 0, i12);
            default:
                Charset charset = a0.f1572a;
                String str = new String(bArr, i5, i10, charset);
                if (str.indexOf(Utf8.REPLACEMENT_CODE_POINT) >= 0 && !Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i5, i10 + i5))) {
                    throw c0.a();
                }
                return str;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:?, code lost:
    
        return r27 + r5;
     */
    @Override // m4.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int i(String str, byte[] bArr, int i5, int i10) {
        int i11;
        int i12;
        char charAt;
        long j;
        long j6;
        long j10;
        int i13;
        char charAt2;
        switch (this.f1651e) {
            case 0:
                int length = str.length();
                int i14 = i10 + i5;
                int i15 = 0;
                while (i15 < length && (i12 = i15 + i5) < i14 && (charAt = str.charAt(i15)) < 128) {
                    bArr[i12] = (byte) charAt;
                    i15++;
                }
                int i16 = i5 + i15;
                while (i15 < length) {
                    char charAt3 = str.charAt(i15);
                    if (charAt3 < 128 && i16 < i14) {
                        bArr[i16] = (byte) charAt3;
                        i16++;
                    } else if (charAt3 < 2048 && i16 <= i14 - 2) {
                        int i17 = i16 + 1;
                        bArr[i16] = (byte) ((charAt3 >>> 6) | 960);
                        i16 += 2;
                        bArr[i17] = (byte) ((charAt3 & '?') | 128);
                    } else {
                        if ((charAt3 >= 55296 && 57343 >= charAt3) || i16 > i14 - 3) {
                            if (i16 > i14 - 4) {
                                if (55296 <= charAt3 && charAt3 <= 57343 && ((i11 = i15 + 1) == str.length() || !Character.isSurrogatePair(charAt3, str.charAt(i11)))) {
                                    throw new m1(i15, length);
                                }
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt3 + " at index " + i16);
                            }
                            int i18 = i15 + 1;
                            if (i18 != str.length()) {
                                char charAt4 = str.charAt(i18);
                                if (Character.isSurrogatePair(charAt3, charAt4)) {
                                    int codePoint = Character.toCodePoint(charAt3, charAt4);
                                    bArr[i16] = (byte) ((codePoint >>> 18) | 240);
                                    bArr[i16 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                    int i19 = i16 + 3;
                                    bArr[i16 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                    i16 += 4;
                                    bArr[i19] = (byte) ((codePoint & 63) | 128);
                                    i15 = i18;
                                } else {
                                    i15 = i18;
                                }
                            }
                            throw new m1(i15 - 1, length);
                        }
                        bArr[i16] = (byte) ((charAt3 >>> '\f') | 480);
                        int i20 = i16 + 2;
                        bArr[i16 + 1] = (byte) (((charAt3 >>> 6) & 63) | 128);
                        i16 += 3;
                        bArr[i20] = (byte) ((charAt3 & '?') | 128);
                    }
                    i15++;
                }
                return i16;
            default:
                long j11 = i5;
                long j12 = i10 + j11;
                int length2 = str.length();
                if (length2 > i10 || bArr.length - i10 < i5) {
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(length2 - 1) + " at index " + (i5 + i10));
                }
                int i21 = 0;
                while (true) {
                    j = 1;
                    if (i21 < length2 && (charAt2 = str.charAt(i21)) < 128) {
                        k1.j(bArr, j11, (byte) charAt2);
                        i21++;
                        j11 = 1 + j11;
                    }
                }
                if (i21 != length2) {
                    while (i21 < length2) {
                        char charAt5 = str.charAt(i21);
                        if (charAt5 < 128 && j11 < j12) {
                            k1.j(bArr, j11, (byte) charAt5);
                            j10 = j12;
                            j6 = j;
                            j11 += j;
                        } else if (charAt5 >= 2048 || j11 > j12 - 2) {
                            j6 = j;
                            if ((charAt5 >= 55296 && 57343 >= charAt5) || j11 > j12 - 3) {
                                j10 = j12;
                                if (j11 > j10 - 4) {
                                    if (55296 <= charAt5 && charAt5 <= 57343 && ((i13 = i21 + 1) == length2 || !Character.isSurrogatePair(charAt5, str.charAt(i13)))) {
                                        throw new m1(i21, length2);
                                    }
                                    throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt5 + " at index " + j11);
                                }
                                int i22 = i21 + 1;
                                if (i22 != length2) {
                                    char charAt6 = str.charAt(i22);
                                    if (Character.isSurrogatePair(charAt5, charAt6)) {
                                        int codePoint2 = Character.toCodePoint(charAt5, charAt6);
                                        k1.j(bArr, j11, (byte) ((codePoint2 >>> 18) | 240));
                                        k1.j(bArr, j11 + j6, (byte) (((codePoint2 >>> 12) & 63) | 128));
                                        long j13 = j11 + 3;
                                        k1.j(bArr, j11 + 2, (byte) (((codePoint2 >>> 6) & 63) | 128));
                                        j11 += 4;
                                        k1.j(bArr, j13, (byte) ((codePoint2 & 63) | 128));
                                        i21 = i22;
                                    } else {
                                        i21 = i22;
                                    }
                                }
                                throw new m1(i21 - 1, length2);
                            }
                            k1.j(bArr, j11, (byte) ((charAt5 >>> '\f') | 480));
                            j10 = j12;
                            long j14 = j11 + 2;
                            k1.j(bArr, j11 + j6, (byte) (((charAt5 >>> 6) & 63) | 128));
                            j11 += 3;
                            k1.j(bArr, j14, (byte) ((charAt5 & '?') | 128));
                        } else {
                            j6 = j;
                            long j15 = j11 + j6;
                            k1.j(bArr, j11, (byte) ((charAt5 >>> 6) | 960));
                            j11 += 2;
                            k1.j(bArr, j15, (byte) ((charAt5 & '?') | 128));
                            j10 = j12;
                        }
                        i21++;
                        j = j6;
                        j12 = j10;
                    }
                }
                return (int) j11;
        }
    }
}
