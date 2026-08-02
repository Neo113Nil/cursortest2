package com.google.flatbuffers;

import com.google.flatbuffers.e;
import java.nio.ByteBuffer;

/* loaded from: classes9.dex */
public final class f extends e {
    @Override // com.google.flatbuffers.e
    public final String a(ByteBuffer byteBuffer, int i11, int i12) throws IllegalArgumentException {
        if (!byteBuffer.hasArray()) {
            if ((i11 | i12 | ((byteBuffer.limit() - i11) - i12)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i11), Integer.valueOf(i12)));
            }
            int i13 = i11 + i12;
            char[] cArr = new char[i12];
            int i14 = 0;
            while (i11 < i13) {
                byte b11 = byteBuffer.get(i11);
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
                byte b12 = byteBuffer.get(i11);
                if (b12 >= 0) {
                    int i17 = i15 + 1;
                    cArr[i15] = (char) b12;
                    while (i16 < i13) {
                        byte b13 = byteBuffer.get(i16);
                        if (b13 < 0) {
                            break;
                        }
                        i16++;
                        cArr[i17] = (char) b13;
                        i17++;
                    }
                    i15 = i17;
                    i11 = i16;
                } else if (b12 < -32) {
                    if (i16 >= i13) {
                        throw new IllegalArgumentException("Invalid UTF-8");
                    }
                    i11 += 2;
                    e.a.c(b12, byteBuffer.get(i16), cArr, i15);
                    i15++;
                } else if (b12 < -16) {
                    if (i16 >= i13 - 1) {
                        throw new IllegalArgumentException("Invalid UTF-8");
                    }
                    int i18 = i11 + 2;
                    i11 += 3;
                    e.a.b(b12, byteBuffer.get(i16), byteBuffer.get(i18), cArr, i15);
                    i15++;
                } else {
                    if (i16 >= i13 - 2) {
                        throw new IllegalArgumentException("Invalid UTF-8");
                    }
                    byte b14 = byteBuffer.get(i16);
                    int i19 = i11 + 3;
                    byte b15 = byteBuffer.get(i11 + 2);
                    i11 += 4;
                    e.a.a(b12, b14, b15, byteBuffer.get(i19), cArr, i15);
                    i15 += 2;
                }
            }
            return new String(cArr, 0, i15);
        }
        byte[] array = byteBuffer.array();
        int arrayOffset = byteBuffer.arrayOffset() + i11;
        if ((arrayOffset | i12 | ((array.length - arrayOffset) - i12)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(array.length), Integer.valueOf(arrayOffset), Integer.valueOf(i12)));
        }
        int i21 = arrayOffset + i12;
        char[] cArr2 = new char[i12];
        int i22 = 0;
        while (arrayOffset < i21) {
            byte b16 = array[arrayOffset];
            if (b16 < 0) {
                break;
            }
            arrayOffset++;
            cArr2[i22] = (char) b16;
            i22++;
        }
        int i23 = i22;
        while (arrayOffset < i21) {
            int i24 = arrayOffset + 1;
            byte b17 = array[arrayOffset];
            if (b17 >= 0) {
                int i25 = i23 + 1;
                cArr2[i23] = (char) b17;
                while (i24 < i21) {
                    byte b18 = array[i24];
                    if (b18 < 0) {
                        break;
                    }
                    i24++;
                    cArr2[i25] = (char) b18;
                    i25++;
                }
                i23 = i25;
                arrayOffset = i24;
            } else if (b17 < -32) {
                if (i24 >= i21) {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
                arrayOffset += 2;
                e.a.c(b17, array[i24], cArr2, i23);
                i23++;
            } else if (b17 < -16) {
                if (i24 >= i21 - 1) {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
                int i26 = arrayOffset + 2;
                arrayOffset += 3;
                e.a.b(b17, array[i24], array[i26], cArr2, i23);
                i23++;
            } else {
                if (i24 >= i21 - 2) {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
                byte b19 = array[i24];
                int i27 = arrayOffset + 3;
                byte b21 = array[arrayOffset + 2];
                arrayOffset += 4;
                e.a.a(b17, b19, b21, array[i27], cArr2, i23);
                i23 += 2;
            }
        }
        return new String(cArr2, 0, i23);
    }
}
