package com.google.flatbuffers;

import java.nio.ByteBuffer;

/* loaded from: classes9.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    private static f f59776a;

    static class a {
        static void a(byte b11, byte b12, byte b13, byte b14, char[] cArr, int i11) throws IllegalArgumentException {
            if (!d(b12)) {
                if ((((b12 + 112) + (b11 << 28)) >> 30) == 0 && !d(b13) && !d(b14)) {
                    int i12 = ((b11 & 7) << 18) | ((b12 & 63) << 12) | ((b13 & 63) << 6) | (b14 & 63);
                    cArr[i11] = (char) ((i12 >>> 10) + 55232);
                    cArr[i11 + 1] = (char) ((i12 & 1023) + 56320);
                    return;
                }
            }
            throw new IllegalArgumentException("Invalid UTF-8");
        }

        static void b(byte b11, byte b12, byte b13, char[] cArr, int i11) throws IllegalArgumentException {
            if (d(b12) || ((b11 == -32 && b12 < -96) || ((b11 == -19 && b12 >= -96) || d(b13)))) {
                throw new IllegalArgumentException("Invalid UTF-8");
            }
            cArr[i11] = (char) (((b11 & 15) << 12) | ((b12 & 63) << 6) | (b13 & 63));
        }

        static void c(byte b11, byte b12, char[] cArr, int i11) throws IllegalArgumentException {
            if (b11 < -62) {
                throw new IllegalArgumentException("Invalid UTF-8: Illegal leading byte in 2 bytes utf");
            }
            if (d(b12)) {
                throw new IllegalArgumentException("Invalid UTF-8: Illegal trailing byte in 2 bytes utf");
            }
            cArr[i11] = (char) (((b11 & 31) << 6) | (b12 & 63));
        }

        private static boolean d(byte b11) {
            return b11 > -65;
        }
    }

    public static e b() {
        if (f59776a == null) {
            f59776a = new f();
        }
        return f59776a;
    }

    public abstract String a(ByteBuffer byteBuffer, int i11, int i12);
}
