package com.pgl.ssdk;

import com.pgl.ssdk.d;
import defpackage.a70;
import defpackage.dmi;
import defpackage.lnb;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes4.dex */
public class h {
    private static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static ByteBuffer a(ByteBuffer byteBuffer, int i) {
        a(byteBuffer);
        ByteBuffer a2 = a(byteBuffer, 8, byteBuffer.capacity() - 24);
        int i2 = 0;
        while (a2.hasRemaining()) {
            i2++;
            if (a2.remaining() < 8) {
                throw new j("Insufficient data to read size of APK Signing Block entry #".concat(String.valueOf(i2)));
            }
            long j = a2.getLong();
            if (j < 4 || j > 2147483647L) {
                throw new j("APK Signing Block entry #" + i2 + " size out of range: " + j);
            }
            int i3 = (int) j;
            int position = a2.position() + i3;
            if (i3 > a2.remaining()) {
                StringBuilder s = lnb.s(i2, i3, "APK Signing Block entry #", " size out of range: ", ", available: ");
                s.append(a2.remaining());
                throw new j(s.toString());
            }
            if (a2.getInt() == i) {
                return b(a2, i3 - 4);
            }
            a2.position(position);
        }
        throw new j("No APK Signature Scheme block in APK Signing Block with ID: ".concat(String.valueOf(i)));
    }

    public static ByteBuffer b(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() < 4) {
            throw new a("Remaining buffer too short to contain length of length-prefixed field. Remaining: " + byteBuffer.remaining());
        }
        int i = byteBuffer.getInt();
        if (i < 0) {
            a70.p("Negative length");
            return null;
        }
        if (i <= byteBuffer.remaining()) {
            return b(byteBuffer, i);
        }
        StringBuilder t = lnb.t(i, "Length-prefixed field longer than remaining buffer. Field length: ", ", remaining: ");
        t.append(byteBuffer.remaining());
        throw new a(t.toString());
    }

    public static byte[] c(ByteBuffer byteBuffer) {
        int i = byteBuffer.getInt();
        if (i < 0) {
            throw new a("Negative length");
        }
        if (i <= byteBuffer.remaining()) {
            byte[] bArr = new byte[i];
            byteBuffer.get(bArr);
            return bArr;
        }
        StringBuilder t = lnb.t(i, "Underflow while reading length-prefixed value. Length: ", ", available: ");
        t.append(byteBuffer.remaining());
        throw new a(t.toString());
    }

    private static ByteBuffer b(ByteBuffer byteBuffer, int i) {
        if (i < 0) {
            a70.p("size: ".concat(String.valueOf(i)));
            return null;
        }
        int limit = byteBuffer.limit();
        int position = byteBuffer.position();
        int i2 = i + position;
        if (i2 < position || i2 > limit) {
            throw new BufferUnderflowException();
        }
        byteBuffer.limit(i2);
        try {
            ByteBuffer slice = byteBuffer.slice();
            slice.order(byteBuffer.order());
            byteBuffer.position(i2);
            return slice;
        } finally {
            byteBuffer.limit(limit);
        }
    }

    public static i a(q qVar, t tVar, int i) {
        try {
            d.a a2 = d.a(qVar, tVar);
            long b = a2.b();
            q a3 = a2.a();
            ByteBuffer a4 = a3.a(0L, (int) a3.a());
            a4.order(ByteOrder.LITTLE_ENDIAN);
            return new i(a(a4, i), b, tVar.a(), tVar.e(), tVar.d());
        } catch (b e) {
            throw new j(e.getMessage(), e);
        }
    }

    private static ByteBuffer a(ByteBuffer byteBuffer, int i, int i2) {
        String concat;
        if (i < 0) {
            concat = "start: ".concat(String.valueOf(i));
        } else if (i2 >= i) {
            int capacity = byteBuffer.capacity();
            if (i2 <= byteBuffer.capacity()) {
                int limit = byteBuffer.limit();
                int position = byteBuffer.position();
                try {
                    byteBuffer.position(0);
                    byteBuffer.limit(i2);
                    byteBuffer.position(i);
                    ByteBuffer slice = byteBuffer.slice();
                    slice.order(byteBuffer.order());
                    return slice;
                } finally {
                    byteBuffer.position(0);
                    byteBuffer.limit(limit);
                    byteBuffer.position(position);
                }
            }
            concat = dmi.k(i2, capacity, "end > capacity: ", " > ");
        } else {
            concat = dmi.k(i2, i, "end < start: ", " < ");
        }
        a70.p(concat);
        return null;
    }

    public static void a(ByteBuffer byteBuffer) {
        if (byteBuffer.order() == ByteOrder.LITTLE_ENDIAN) {
            return;
        }
        a70.p("ByteBuffer byte order must be little endian");
    }
}
