package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.q;
import java.io.IOException;
import ru.ok.proto.rtmp.amf.AmfConstants;

/* compiled from: ArrayDecoders.java */
/* loaded from: classes.dex */
public final class d {

    /* compiled from: ArrayDecoders.java */
    public static final class a {
        public int a;
        public long b;
        public Object c;
        public final k d;

        public a(k kVar) {
            kVar.getClass();
            this.d = kVar;
        }
    }

    public static int a(byte[] bArr, int i, a aVar) throws InvalidProtocolBufferException {
        int k = k(bArr, i, aVar);
        int i2 = aVar.a;
        if (i2 < 0) {
            throw InvalidProtocolBufferException.i();
        }
        if (i2 > bArr.length - k) {
            throw InvalidProtocolBufferException.l();
        }
        if (i2 == 0) {
            aVar.c = ByteString.b;
            return k;
        }
        aVar.c = ByteString.e(k, i2, bArr);
        return k + i2;
    }

    public static int b(int i, byte[] bArr) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public static long c(int i, byte[] bArr) {
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    public static int d(a0 a0Var, byte[] bArr, int i, int i2, int i3, a aVar) throws IOException {
        w wVar = (w) a0Var;
        Object b = wVar.b();
        int F = wVar.F(b, bArr, i, i2, i3, aVar);
        wVar.d(b);
        aVar.c = b;
        return F;
    }

    public static int e(a0 a0Var, byte[] bArr, int i, int i2, a aVar) throws IOException {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = j(i4, bArr, i3, aVar);
            i4 = aVar.a;
        }
        int i5 = i3;
        if (i4 < 0 || i4 > i2 - i5) {
            throw InvalidProtocolBufferException.l();
        }
        Object b = a0Var.b();
        int i6 = i5 + i4;
        a0Var.g(b, bArr, i5, i6, aVar);
        a0Var.d(b);
        aVar.c = b;
        return i6;
    }

    public static int f(a0<?> a0Var, int i, byte[] bArr, int i2, int i3, q.d<?> dVar, a aVar) throws IOException {
        int e = e(a0Var, bArr, i2, i3, aVar);
        dVar.add(aVar.c);
        while (e < i3) {
            int k = k(bArr, e, aVar);
            if (i != aVar.a) {
                break;
            }
            e = e(a0Var, bArr, k, i3, aVar);
            dVar.add(aVar.c);
        }
        return e;
    }

    public static int g(byte[] bArr, int i, a aVar) throws InvalidProtocolBufferException {
        int k = k(bArr, i, aVar);
        int i2 = aVar.a;
        if (i2 < 0) {
            throw InvalidProtocolBufferException.i();
        }
        if (i2 == 0) {
            aVar.c = "";
            return k;
        }
        aVar.c = new String(bArr, k, i2, q.a);
        return k + i2;
    }

    public static int h(byte[] bArr, int i, a aVar) throws InvalidProtocolBufferException {
        int k = k(bArr, i, aVar);
        int i2 = aVar.a;
        if (i2 < 0) {
            throw InvalidProtocolBufferException.i();
        }
        if (i2 == 0) {
            aVar.c = "";
            return k;
        }
        aVar.c = h0.a.a(k, i2, bArr);
        return k + i2;
    }

    public static int i(int i, byte[] bArr, int i2, int i3, f0 f0Var, a aVar) throws InvalidProtocolBufferException {
        if ((i >>> 3) == 0) {
            throw new InvalidProtocolBufferException("Protocol message contained an invalid tag (zero).");
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int m = m(bArr, i2, aVar);
            f0Var.b(i, Long.valueOf(aVar.b));
            return m;
        }
        if (i4 == 1) {
            f0Var.b(i, Long.valueOf(c(i2, bArr)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int k = k(bArr, i2, aVar);
            int i5 = aVar.a;
            if (i5 < 0) {
                throw InvalidProtocolBufferException.i();
            }
            if (i5 > bArr.length - k) {
                throw InvalidProtocolBufferException.l();
            }
            if (i5 == 0) {
                f0Var.b(i, ByteString.b);
            } else {
                f0Var.b(i, ByteString.e(k, i5, bArr));
            }
            return k + i5;
        }
        if (i4 != 3) {
            if (i4 != 5) {
                throw new InvalidProtocolBufferException("Protocol message contained an invalid tag (zero).");
            }
            f0Var.b(i, Integer.valueOf(b(i2, bArr)));
            return i2 + 4;
        }
        f0 f0Var2 = new f0();
        int i6 = (i & (-8)) | 4;
        int i7 = 0;
        while (true) {
            if (i2 >= i3) {
                break;
            }
            int k2 = k(bArr, i2, aVar);
            int i8 = aVar.a;
            if (i8 == i6) {
                i7 = i8;
                i2 = k2;
                break;
            }
            i2 = i(i8, bArr, k2, i3, f0Var2, aVar);
            i7 = i8;
        }
        if (i2 > i3 || i7 != i6) {
            throw InvalidProtocolBufferException.j();
        }
        f0Var.b(i, f0Var2);
        return i2;
    }

    public static int j(int i, byte[] bArr, int i2, a aVar) {
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

    public static int k(byte[] bArr, int i, a aVar) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return j(b, bArr, i2, aVar);
        }
        aVar.a = b;
        return i2;
    }

    public static int l(int i, byte[] bArr, int i2, int i3, q.d<?> dVar, a aVar) {
        p pVar = (p) dVar;
        int k = k(bArr, i2, aVar);
        pVar.addInt(aVar.a);
        while (k < i3) {
            int k2 = k(bArr, k, aVar);
            if (i != aVar.a) {
                break;
            }
            k = k(bArr, k2, aVar);
            pVar.addInt(aVar.a);
        }
        return k;
    }

    public static int m(byte[] bArr, int i, a aVar) {
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

    public static int n(int i, byte[] bArr, int i2, int i3, a aVar) throws InvalidProtocolBufferException {
        if ((i >>> 3) == 0) {
            throw new InvalidProtocolBufferException("Protocol message contained an invalid tag (zero).");
        }
        int i4 = i & 7;
        if (i4 == 0) {
            return m(bArr, i2, aVar);
        }
        if (i4 == 1) {
            return i2 + 8;
        }
        if (i4 == 2) {
            return k(bArr, i2, aVar) + aVar.a;
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
            i2 = k(bArr, i2, aVar);
            i6 = aVar.a;
            if (i6 == i5) {
                break;
            }
            i2 = n(i6, bArr, i2, i3, aVar);
        }
        if (i2 > i3 || i6 != i5) {
            throw InvalidProtocolBufferException.j();
        }
        return i2;
    }
}
