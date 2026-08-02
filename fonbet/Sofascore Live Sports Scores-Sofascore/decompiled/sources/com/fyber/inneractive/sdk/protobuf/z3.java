package com.fyber.inneractive.sdk.protobuf;

import defpackage.yhk;
import defpackage.zzl;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class z3 {
    public static String a(ByteBuffer byteBuffer, int i, int i2) {
        if ((i | i2 | ((byteBuffer.limit() - i) - i2)) < 0) {
            yhk.p("buffer limit=%d, index=%d, limit=%d", new Object[]{Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i2)});
            return null;
        }
        int i3 = i + i2;
        char[] cArr = new char[i2];
        int i4 = 0;
        while (i < i3) {
            byte b = byteBuffer.get(i);
            if (!y3.a(b)) {
                break;
            }
            i++;
            cArr[i4] = (char) b;
            i4++;
        }
        int i5 = i4;
        while (i < i3) {
            int i6 = i + 1;
            byte b2 = byteBuffer.get(i);
            if (y3.a(b2)) {
                cArr[i5] = (char) b2;
                i5++;
                i = i6;
                while (i < i3) {
                    byte b3 = byteBuffer.get(i);
                    if (!y3.a(b3)) {
                        break;
                    }
                    i++;
                    cArr[i5] = (char) b3;
                    i5++;
                }
            } else if (b2 < -32) {
                if (i6 >= i3) {
                    zzl.j("Protocol message had invalid UTF-8.");
                    return null;
                }
                i += 2;
                y3.a(b2, byteBuffer.get(i6), cArr, i5);
                i5++;
            } else if (b2 < -16) {
                if (i6 >= i3 - 1) {
                    zzl.j("Protocol message had invalid UTF-8.");
                    return null;
                }
                int i7 = i + 2;
                i += 3;
                y3.a(b2, byteBuffer.get(i6), byteBuffer.get(i7), cArr, i5);
                i5++;
            } else {
                if (i6 >= i3 - 2) {
                    zzl.j("Protocol message had invalid UTF-8.");
                    return null;
                }
                byte b4 = byteBuffer.get(i6);
                int i8 = i + 3;
                byte b5 = byteBuffer.get(i + 2);
                i += 4;
                y3.a(b2, b4, b5, byteBuffer.get(i8), cArr, i5);
                i5 += 2;
            }
        }
        return new String(cArr, 0, i5);
    }

    public abstract int a(CharSequence charSequence, byte[] bArr, int i, int i2);

    public abstract String a(byte[] bArr, int i, int i2);

    public abstract String b(ByteBuffer byteBuffer, int i, int i2);

    public final boolean b(byte[] bArr, int i, int i2) {
        return c(bArr, i, i2) == 0;
    }

    public abstract int c(byte[] bArr, int i, int i2);
}
