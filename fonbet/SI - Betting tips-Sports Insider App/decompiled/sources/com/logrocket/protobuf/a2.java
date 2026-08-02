package com.logrocket.protobuf;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class a2 {

    /* renamed from: a, reason: collision with root package name */
    public static final l1 f6667a;

    static {
        f6667a = (x1.f6823e && x1.f6822d && !c.a()) ? new y1(1) : new y1(0);
    }

    public static int a(byte[] bArr, int i5, int i10) {
        byte b10 = bArr[i5 - 1];
        int i11 = i10 - i5;
        if (i11 == 0) {
            if (b10 > -12) {
                return -1;
            }
            return b10;
        }
        if (i11 == 1) {
            return d(b10, bArr[i5]);
        }
        if (i11 == 2) {
            return e(b10, bArr[i5], bArr[i5 + 1]);
        }
        throw new AssertionError();
    }

    public static void b(String str, ByteBuffer byteBuffer) {
        l1 l1Var = f6667a;
        l1Var.getClass();
        if (byteBuffer.hasArray()) {
            int arrayOffset = byteBuffer.arrayOffset();
            byteBuffer.position(l1Var.a(str, byteBuffer.array(), byteBuffer.position() + arrayOffset, byteBuffer.remaining()) - arrayOffset);
        } else if (byteBuffer.isDirect()) {
            l1Var.c(str, byteBuffer);
        } else {
            l1.b(str, byteBuffer);
        }
    }

    public static int c(String str) {
        int length = str.length();
        int i5 = 0;
        int i10 = 0;
        while (i10 < length && str.charAt(i10) < 128) {
            i10++;
        }
        int i11 = length;
        while (true) {
            if (i10 >= length) {
                break;
            }
            char charAt = str.charAt(i10);
            if (charAt < 2048) {
                i11 += (127 - charAt) >>> 31;
                i10++;
            } else {
                int length2 = str.length();
                while (i10 < length2) {
                    char charAt2 = str.charAt(i10);
                    if (charAt2 < 2048) {
                        i5 += (127 - charAt2) >>> 31;
                    } else {
                        i5 += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(str, i10) < 65536) {
                                throw new z1(i10, length2);
                            }
                            i10++;
                        }
                    }
                    i10++;
                }
                i11 += i5;
            }
        }
        if (i11 >= length) {
            return i11;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i11 + 4294967296L));
    }

    public static int d(int i5, int i10) {
        if (i5 > -12 || i10 > -65) {
            return -1;
        }
        return i5 ^ (i10 << 8);
    }

    public static int e(int i5, int i10, int i11) {
        if (i5 > -12 || i10 > -65 || i11 > -65) {
            return -1;
        }
        return (i5 ^ (i10 << 8)) ^ (i11 << 16);
    }
}
