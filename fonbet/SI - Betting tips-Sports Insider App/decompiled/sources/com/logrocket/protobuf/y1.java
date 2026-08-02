package com.logrocket.protobuf;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class y1 extends l1 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f6827c;

    public /* synthetic */ y1(int i5) {
        this.f6827c = i5;
    }

    public static int g(long j, byte[] bArr, int i5, int i10) {
        if (i10 == 0) {
            l1 l1Var = a2.f6667a;
            if (i5 > -12) {
                return -1;
            }
            return i5;
        }
        if (i10 == 1) {
            return a2.d(i5, x1.g(bArr, j));
        }
        if (i10 == 2) {
            return a2.e(i5, x1.g(bArr, j), x1.g(bArr, j + 1));
        }
        throw new AssertionError();
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:?, code lost:
    
        return r27 + r5;
     */
    @Override // com.logrocket.protobuf.l1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(CharSequence charSequence, byte[] bArr, int i5, int i10) {
        int i11;
        int i12;
        char charAt;
        long j;
        long j6;
        long j10;
        int i13;
        char charAt2;
        switch (this.f6827c) {
            case 0:
                int length = charSequence.length();
                int i14 = i10 + i5;
                int i15 = 0;
                while (i15 < length && (i12 = i15 + i5) < i14 && (charAt = charSequence.charAt(i15)) < 128) {
                    bArr[i12] = (byte) charAt;
                    i15++;
                }
                int i16 = i5 + i15;
                while (i15 < length) {
                    char charAt3 = charSequence.charAt(i15);
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
                                if (55296 <= charAt3 && charAt3 <= 57343 && ((i11 = i15 + 1) == charSequence.length() || !Character.isSurrogatePair(charAt3, charSequence.charAt(i11)))) {
                                    throw new z1(i15, length);
                                }
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt3 + " at index " + i16);
                            }
                            int i18 = i15 + 1;
                            if (i18 != charSequence.length()) {
                                char charAt4 = charSequence.charAt(i18);
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
                            throw new z1(i15 - 1, length);
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
                int length2 = charSequence.length();
                if (length2 > i10 || bArr.length - i10 < i5) {
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(length2 - 1) + " at index " + (i5 + i10));
                }
                int i21 = 0;
                while (true) {
                    j = 1;
                    if (i21 < length2 && (charAt2 = charSequence.charAt(i21)) < 128) {
                        x1.l(bArr, j11, (byte) charAt2);
                        i21++;
                        j11 = 1 + j11;
                    }
                }
                if (i21 != length2) {
                    while (i21 < length2) {
                        char charAt5 = charSequence.charAt(i21);
                        if (charAt5 < 128 && j11 < j12) {
                            x1.l(bArr, j11, (byte) charAt5);
                            j10 = j12;
                            j6 = j;
                            j11 += j;
                        } else if (charAt5 >= 2048 || j11 > j12 - 2) {
                            j6 = j;
                            if ((charAt5 >= 55296 && 57343 >= charAt5) || j11 > j12 - 3) {
                                j10 = j12;
                                if (j11 > j10 - 4) {
                                    if (55296 <= charAt5 && charAt5 <= 57343 && ((i13 = i21 + 1) == length2 || !Character.isSurrogatePair(charAt5, charSequence.charAt(i13)))) {
                                        throw new z1(i21, length2);
                                    }
                                    throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt5 + " at index " + j11);
                                }
                                int i22 = i21 + 1;
                                if (i22 != length2) {
                                    char charAt6 = charSequence.charAt(i22);
                                    if (Character.isSurrogatePair(charAt5, charAt6)) {
                                        int codePoint2 = Character.toCodePoint(charAt5, charAt6);
                                        x1.l(bArr, j11, (byte) ((codePoint2 >>> 18) | 240));
                                        x1.l(bArr, j11 + j6, (byte) (((codePoint2 >>> 12) & 63) | 128));
                                        long j13 = j11 + 3;
                                        x1.l(bArr, j11 + 2, (byte) (((codePoint2 >>> 6) & 63) | 128));
                                        j11 += 4;
                                        x1.l(bArr, j13, (byte) ((codePoint2 & 63) | 128));
                                        i21 = i22;
                                    } else {
                                        i21 = i22;
                                    }
                                }
                                throw new z1(i21 - 1, length2);
                            }
                            x1.l(bArr, j11, (byte) ((charAt5 >>> '\f') | 480));
                            j10 = j12;
                            long j14 = j11 + 2;
                            x1.l(bArr, j11 + j6, (byte) (((charAt5 >>> 6) & 63) | 128));
                            j11 += 3;
                            x1.l(bArr, j14, (byte) ((charAt5 & '?') | 128));
                        } else {
                            j6 = j;
                            long j15 = j11 + j6;
                            x1.l(bArr, j11, (byte) ((charAt5 >>> 6) | 960));
                            j11 += 2;
                            x1.l(bArr, j15, (byte) ((charAt5 & '?') | 128));
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

    @Override // com.logrocket.protobuf.l1
    public final void c(CharSequence charSequence, ByteBuffer byteBuffer) {
        long j;
        long j6;
        int i5;
        char charAt;
        switch (this.f6827c) {
            case 0:
                l1.b(charSequence, byteBuffer);
                return;
            default:
                long i10 = x1.f6821c.i(x1.f6825g, byteBuffer);
                long position = byteBuffer.position() + i10;
                long limit = byteBuffer.limit() + i10;
                int length = charSequence.length();
                if (length > limit - position) {
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(length - 1) + " at index " + byteBuffer.limit());
                }
                int i11 = 0;
                while (i11 < length && (charAt = charSequence.charAt(i11)) < 128) {
                    x1.k((byte) charAt, position);
                    i11++;
                    position++;
                }
                if (i11 == length) {
                    byteBuffer.position((int) (position - i10));
                    return;
                }
                while (i11 < length) {
                    char charAt2 = charSequence.charAt(i11);
                    if (charAt2 < 128 && position < limit) {
                        x1.k((byte) charAt2, position);
                        j = i10;
                        j6 = limit;
                        position++;
                    } else if (charAt2 >= 2048 || position > limit - 2) {
                        j = i10;
                        if ((charAt2 >= 55296 && 57343 >= charAt2) || position > limit - 3) {
                            j6 = limit;
                            if (position > j6 - 4) {
                                if (55296 <= charAt2 && charAt2 <= 57343 && ((i5 = i11 + 1) == length || !Character.isSurrogatePair(charAt2, charSequence.charAt(i5)))) {
                                    throw new z1(i11, length);
                                }
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + position);
                            }
                            int i12 = i11 + 1;
                            if (i12 != length) {
                                char charAt3 = charSequence.charAt(i12);
                                if (Character.isSurrogatePair(charAt2, charAt3)) {
                                    int codePoint = Character.toCodePoint(charAt2, charAt3);
                                    x1.k((byte) ((codePoint >>> 18) | 240), position);
                                    x1.k((byte) (((codePoint >>> 12) & 63) | 128), position + 1);
                                    long j10 = position + 3;
                                    x1.k((byte) (((codePoint >>> 6) & 63) | 128), position + 2);
                                    position += 4;
                                    x1.k((byte) ((codePoint & 63) | 128), j10);
                                    i11 = i12;
                                } else {
                                    i11 = i12;
                                }
                            }
                            throw new z1(i11 - 1, length);
                        }
                        x1.k((byte) ((charAt2 >>> '\f') | 480), position);
                        j6 = limit;
                        long j11 = position + 2;
                        x1.k((byte) (((charAt2 >>> 6) & 63) | 128), position + 1);
                        position += 3;
                        x1.k((byte) ((charAt2 & '?') | 128), j11);
                    } else {
                        j = i10;
                        long j12 = position + 1;
                        x1.k((byte) ((charAt2 >>> 6) | 960), position);
                        position += 2;
                        x1.k((byte) ((charAt2 & '?') | 128), j12);
                        j6 = limit;
                    }
                    i11++;
                    i10 = j;
                    limit = j6;
                }
                byteBuffer.position((int) (position - i10));
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
    
        if (com.logrocket.protobuf.x1.g(r26, r13) > (-65)) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
    
        r13 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x0216, code lost:
    
        if (r26[r0] > (-65)) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x025a, code lost:
    
        if (r26[r0] > (-65)) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x006f, code lost:
    
        if (com.logrocket.protobuf.x1.g(r26, r13) > (-65)) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00b6, code lost:
    
        if (com.logrocket.protobuf.x1.g(r26, r13) > (-65)) goto L18;
     */
    @Override // com.logrocket.protobuf.l1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int e(int i5, byte[] bArr, int i10, int i11) {
        byte b10;
        int i12;
        byte b11;
        int i13;
        int i14;
        byte b12;
        byte b13;
        long j;
        int i15 = i10;
        switch (this.f6827c) {
            case 0:
                if (i5 != 0) {
                    if (i15 >= i11) {
                        return i5;
                    }
                    byte b14 = (byte) i5;
                    if (b14 >= -32) {
                        if (b14 >= -16) {
                            byte b15 = (byte) (~(i5 >> 8));
                            if (b15 == 0) {
                                i12 = i15 + 1;
                                b15 = bArr[i15];
                                if (i12 >= i11) {
                                    return a2.d(b14, b15);
                                }
                                b10 = 0;
                            } else {
                                b10 = (byte) (i5 >> 16);
                                i12 = i15;
                            }
                            if (b10 == 0) {
                                int i16 = i12 + 1;
                                byte b16 = bArr[i12];
                                if (i16 >= i11) {
                                    return a2.e(b14, b15, b16);
                                }
                                b10 = b16;
                                i12 = i16;
                            }
                            if (b15 <= -65 && (((b15 + 112) + (b14 << 28)) >> 30) == 0 && b10 <= -65) {
                                i15 = i12 + 1;
                                break;
                            }
                        } else {
                            byte b17 = (byte) (~(i5 >> 8));
                            if (b17 == 0) {
                                i13 = i15 + 1;
                                b11 = bArr[i15];
                                if (i13 >= i11) {
                                    return a2.d(b14, b11);
                                }
                            } else {
                                b11 = b17;
                                i13 = i15;
                            }
                            if (b11 <= -65 && ((b14 != -32 || b11 >= -96) && (b14 != -19 || b11 < -96))) {
                                i15 = i13 + 1;
                                break;
                            }
                        }
                    } else if (b14 >= -62) {
                        int i17 = i15 + 1;
                        if (bArr[i15] <= -65) {
                            i15 = i17;
                        }
                    }
                    return -1;
                }
                while (i15 < i11 && bArr[i15] >= 0) {
                    i15++;
                }
                if (i15 < i11) {
                    while (i15 < i11) {
                        int i18 = i15 + 1;
                        byte b18 = bArr[i15];
                        if (b18 < 0) {
                            if (b18 < -32) {
                                if (i18 >= i11) {
                                    return b18;
                                }
                                if (b18 >= -62) {
                                    i15 += 2;
                                    if (bArr[i18] > -65) {
                                    }
                                }
                                return -1;
                            }
                            if (b18 >= -16) {
                                if (i18 >= i11 - 2) {
                                    return a2.a(bArr, i18, i11);
                                }
                                int i19 = i15 + 2;
                                byte b19 = bArr[i18];
                                if (b19 <= -65 && (((b19 + 112) + (b18 << 28)) >> 30) == 0) {
                                    int i20 = i15 + 3;
                                    if (bArr[i19] <= -65) {
                                        i15 += 4;
                                        if (bArr[i20] > -65) {
                                        }
                                    }
                                }
                                return -1;
                            }
                            if (i18 >= i11 - 1) {
                                return a2.a(bArr, i18, i11);
                            }
                            int i21 = i15 + 2;
                            byte b20 = bArr[i18];
                            if (b20 <= -65 && ((b18 != -32 || b20 >= -96) && (b18 != -19 || b20 < -96))) {
                                i15 += 3;
                                if (bArr[i21] > -65) {
                                }
                            }
                            return -1;
                        }
                        i15 = i18;
                    }
                }
                return 0;
            default:
                if ((i15 | i11 | (bArr.length - i11)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", Integer.valueOf(bArr.length), Integer.valueOf(i15), Integer.valueOf(i11)));
                }
                byte b21 = 0;
                long j6 = i15;
                long j10 = i11;
                if (i5 != 0) {
                    if (j6 >= j10) {
                        return i5;
                    }
                    byte b22 = (byte) i5;
                    if (b22 < -32) {
                        if (b22 >= -62) {
                            j = j6 + 1;
                            break;
                        }
                        return -1;
                    }
                    if (b22 < -16) {
                        byte b23 = (byte) (~(i5 >> 8));
                        if (b23 == 0) {
                            long j11 = j6 + 1;
                            b23 = x1.g(bArr, j6);
                            if (j11 >= j10) {
                                return a2.d(b22, b23);
                            }
                            j6 = j11;
                        }
                        if (b23 <= -65 && ((b22 != -32 || b23 >= -96) && (b22 != -19 || b23 < -96))) {
                            j = j6 + 1;
                            break;
                        }
                        return -1;
                    }
                    byte b24 = (byte) (~(i5 >> 8));
                    if (b24 == 0) {
                        long j12 = j6 + 1;
                        b24 = x1.g(bArr, j6);
                        if (j12 >= j10) {
                            return a2.d(b22, b24);
                        }
                        b13 = 0;
                        j6 = j12;
                    } else {
                        b13 = (byte) (i5 >> 16);
                    }
                    if (b13 == 0) {
                        long j13 = j6 + 1;
                        b13 = x1.g(bArr, j6);
                        if (j13 >= j10) {
                            return a2.e(b22, b24, b13);
                        }
                        j6 = j13;
                    }
                    if (b24 <= -65 && (((b24 + 112) + (b22 << 28)) >> 30) == 0 && b13 <= -65) {
                        j = j6 + 1;
                        break;
                    }
                    return -1;
                }
                int i22 = (int) (j10 - j6);
                if (i22 < 16) {
                    i14 = 0;
                    b12 = 0;
                } else {
                    int i23 = 8 - (((int) j6) & 7);
                    i14 = 0;
                    long j14 = j6;
                    while (true) {
                        if (i14 < i23) {
                            long j15 = j14 + 1;
                            if (x1.g(bArr, j14) < 0) {
                                b12 = 0;
                            } else {
                                i14++;
                                j14 = j15;
                            }
                        } else {
                            while (true) {
                                int i24 = i14 + 8;
                                if (i24 <= i22) {
                                    b12 = b21;
                                    if ((x1.f6821c.i(x1.f6824f + j14, bArr) & (-9187201950435737472L)) == 0) {
                                        j14 += 8;
                                        i14 = i24;
                                        b21 = b12;
                                    }
                                } else {
                                    b12 = b21;
                                }
                            }
                            while (true) {
                                if (i14 < i22) {
                                    long j16 = j14 + 1;
                                    if (x1.g(bArr, j14) >= 0) {
                                        i14++;
                                        j14 = j16;
                                    }
                                } else {
                                    i14 = i22;
                                }
                            }
                        }
                    }
                }
                int i25 = i22 - i14;
                long j17 = j6 + i14;
                while (true) {
                    byte b25 = b12;
                    while (true) {
                        if (i25 > 0) {
                            long j18 = j17 + 1;
                            b25 = x1.g(bArr, j17);
                            if (b25 >= 0) {
                                i25--;
                                j17 = j18;
                            } else {
                                j17 = j18;
                            }
                        }
                    }
                    if (i25 == 0) {
                        return b12;
                    }
                    int i26 = i25 - 1;
                    if (b25 < -32) {
                        if (i26 == 0) {
                            return b25;
                        }
                        i25 -= 2;
                        if (b25 >= -62) {
                            long j19 = j17 + 1;
                            if (x1.g(bArr, j17) <= -65) {
                                j17 = j19;
                            }
                        }
                    } else if (b25 < -16) {
                        if (i26 < 2) {
                            return g(j17, bArr, b25, i26);
                        }
                        i25 -= 3;
                        long j20 = j17 + 1;
                        byte g10 = x1.g(bArr, j17);
                        if (g10 <= -65 && ((b25 != -32 || g10 >= -96) && (b25 != -19 || g10 < -96))) {
                            j17 += 2;
                            if (x1.g(bArr, j20) > -65) {
                            }
                        }
                    } else {
                        if (i26 < 3) {
                            return g(j17, bArr, b25, i26);
                        }
                        i25 -= 4;
                        long j21 = j17 + 1;
                        byte g11 = x1.g(bArr, j17);
                        if (g11 <= -65 && (((g11 + 112) + (b25 << 28)) >> 30) == 0) {
                            long j22 = 2 + j17;
                            if (x1.g(bArr, j21) <= -65) {
                                j17 += 3;
                                if (x1.g(bArr, j22) > -65) {
                                }
                            }
                        }
                    }
                }
                return -1;
        }
    }
}
