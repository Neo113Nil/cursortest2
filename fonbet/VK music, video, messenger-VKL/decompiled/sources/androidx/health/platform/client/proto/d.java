package androidx.health.platform.client.proto;

import androidx.health.platform.client.proto.b0;
import java.io.IOException;
import ru.ok.proto.rtmp.amf.AmfConstants;

/* compiled from: ArrayDecoders.java */
/* loaded from: classes12.dex */
public final class d {

    /* compiled from: ArrayDecoders.java */
    public static final class a {
        public int a;
        public long b;
        public Object c;
        public final v d;
        public int e;

        public a(v vVar) {
            vVar.getClass();
            this.d = vVar;
        }
    }

    public static int a(byte[] bArr, int i, a aVar) throws InvalidProtocolBufferException {
        int g = g(bArr, i, aVar);
        int i2 = aVar.a;
        if (i2 < 0) {
            throw InvalidProtocolBufferException.i();
        }
        if (i2 > bArr.length - g) {
            throw InvalidProtocolBufferException.l();
        }
        if (i2 == 0) {
            aVar.c = ByteString.b;
            return g;
        }
        aVar.c = ByteString.e(g, i2, bArr);
        return g + i2;
    }

    public static int b(int i, byte[] bArr) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public static long c(int i, byte[] bArr) {
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    public static int d(w0<?> w0Var, int i, byte[] bArr, int i2, int i3, b0.d<?> dVar, a aVar) throws IOException {
        Object b = w0Var.b();
        w0<?> w0Var2 = w0Var;
        byte[] bArr2 = bArr;
        int i4 = i3;
        a aVar2 = aVar;
        int k = k(b, w0Var2, bArr2, i2, i4, aVar2);
        w0Var2.d(b);
        aVar2.c = b;
        dVar.add(b);
        while (k < i4) {
            a aVar3 = aVar2;
            int i5 = i4;
            int g = g(bArr2, k, aVar3);
            if (i != aVar3.a) {
                break;
            }
            byte[] bArr3 = bArr2;
            w0<?> w0Var3 = w0Var2;
            Object b2 = w0Var3.b();
            k = k(b2, w0Var3, bArr3, g, i5, aVar3);
            w0Var2 = w0Var3;
            bArr2 = bArr3;
            i4 = i5;
            aVar2 = aVar3;
            w0Var2.d(b2);
            aVar2.c = b2;
            dVar.add(b2);
        }
        return k;
    }

    public static int e(int i, byte[] bArr, int i2, int i3, d1 d1Var, a aVar) throws InvalidProtocolBufferException {
        if ((i >>> 3) == 0) {
            throw new InvalidProtocolBufferException("Protocol message contained an invalid tag (zero).");
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int i5 = i(bArr, i2, aVar);
            d1Var.c(i, Long.valueOf(aVar.b));
            return i5;
        }
        if (i4 == 1) {
            d1Var.c(i, Long.valueOf(c(i2, bArr)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int g = g(bArr, i2, aVar);
            int i6 = aVar.a;
            if (i6 < 0) {
                throw InvalidProtocolBufferException.i();
            }
            if (i6 > bArr.length - g) {
                throw InvalidProtocolBufferException.l();
            }
            if (i6 == 0) {
                d1Var.c(i, ByteString.b);
            } else {
                d1Var.c(i, ByteString.e(g, i6, bArr));
            }
            return g + i6;
        }
        if (i4 != 3) {
            if (i4 != 5) {
                throw new InvalidProtocolBufferException("Protocol message contained an invalid tag (zero).");
            }
            d1Var.c(i, Integer.valueOf(b(i2, bArr)));
            return i2 + 4;
        }
        d1 d1Var2 = new d1();
        int i7 = (i & (-8)) | 4;
        int i8 = aVar.e + 1;
        aVar.e = i8;
        if (i8 >= 100) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i9 = 0;
        while (true) {
            if (i2 >= i3) {
                break;
            }
            int g2 = g(bArr, i2, aVar);
            int i10 = aVar.a;
            if (i10 == i7) {
                i9 = i10;
                i2 = g2;
                break;
            }
            i2 = e(i10, bArr, g2, i3, d1Var2, aVar);
            i9 = i10;
        }
        aVar.e--;
        if (i2 > i3 || i9 != i7) {
            throw InvalidProtocolBufferException.j();
        }
        d1Var.c(i, d1Var2);
        return i2;
    }

    public static int f(int i, byte[] bArr, int i2, a aVar) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            aVar.a = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & Byte.MAX_VALUE) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            aVar.a = i5 | (b2 << AmfConstants.TYPE_RECORDSET_MARKER);
            return i6;
        }
        int i7 = i5 | ((b2 & Byte.MAX_VALUE) << 14);
        int i8 = i2 + 3;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            aVar.a = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & Byte.MAX_VALUE) << 21);
        int i10 = i2 + 4;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            aVar.a = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                aVar.a = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    public static int g(byte[] bArr, int i, a aVar) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return f(b, bArr, i2, aVar);
        }
        aVar.a = b;
        return i2;
    }

    public static int h(int i, byte[] bArr, int i2, int i3, b0.d<?> dVar, a aVar) {
        a0 a0Var = (a0) dVar;
        int g = g(bArr, i2, aVar);
        a0Var.addInt(aVar.a);
        while (g < i3) {
            int g2 = g(bArr, g, aVar);
            if (i != aVar.a) {
                break;
            }
            g = g(bArr, g2, aVar);
            a0Var.addInt(aVar.a);
        }
        return g;
    }

    public static int i(byte[] bArr, int i, a aVar) {
        int i2 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            aVar.b = j;
            return i2;
        }
        int i3 = i + 2;
        byte b = bArr[i2];
        long j2 = (j & 127) | ((b & Byte.MAX_VALUE) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            i4 += 7;
            j2 |= (r10 & Byte.MAX_VALUE) << i4;
            b = bArr[i3];
            i3 = i5;
        }
        aVar.b = j2;
        return i3;
    }

    public static int j(Object obj, w0 w0Var, byte[] bArr, int i, int i2, int i3, a aVar) throws IOException {
        j0 j0Var = (j0) w0Var;
        int i4 = aVar.e + 1;
        aVar.e = i4;
        if (i4 >= 100) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int C = j0Var.C(obj, bArr, i, i2, i3, aVar);
        aVar.e--;
        aVar.c = obj;
        return C;
    }

    public static int k(Object obj, w0 w0Var, byte[] bArr, int i, int i2, a aVar) throws IOException {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = f(i4, bArr, i3, aVar);
            i4 = aVar.a;
        }
        int i5 = i3;
        if (i4 < 0 || i4 > i2 - i5) {
            throw InvalidProtocolBufferException.l();
        }
        int i6 = aVar.e + 1;
        aVar.e = i6;
        if (i6 >= 100) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i7 = i5 + i4;
        w0Var.e(obj, bArr, i5, i7, aVar);
        aVar.e--;
        aVar.c = obj;
        return i7;
    }

    public static int l(int i, byte[] bArr, int i2, int i3, a aVar) throws InvalidProtocolBufferException {
        if ((i >>> 3) == 0) {
            throw new InvalidProtocolBufferException("Protocol message contained an invalid tag (zero).");
        }
        int i4 = i & 7;
        if (i4 == 0) {
            return i(bArr, i2, aVar);
        }
        if (i4 == 1) {
            return i2 + 8;
        }
        if (i4 == 2) {
            return g(bArr, i2, aVar) + aVar.a;
        }
        if (i4 != 3) {
            if (i4 == 5) {
                return i2 + 4;
            }
            throw new InvalidProtocolBufferException("Protocol message contained an invalid tag (zero).");
        }
        int i5 = (i & (-8)) | 4;
        int i6 = 0;
        while (i2 < i3) {
            i2 = g(bArr, i2, aVar);
            i6 = aVar.a;
            if (i6 == i5) {
                break;
            }
            i2 = l(i6, bArr, i2, i3, aVar);
        }
        if (i2 > i3 || i6 != i5) {
            throw InvalidProtocolBufferException.j();
        }
        return i2;
    }
}
