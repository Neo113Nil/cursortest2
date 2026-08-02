package org.spongycastle.asn1;

import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: org.spongycastle.asn1.j, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C5932j extends FilterInputStream {

    /* renamed from: a, reason: collision with root package name */
    public final int f62257a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f62258b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[][] f62259c;

    public C5932j(InputStream inputStream) {
        this(inputStream, z0.c(inputStream));
    }

    public static int A0(InputStream inputStream, int i10) {
        int read = inputStream.read();
        if (read < 0) {
            throw new EOFException("EOF found when length expected");
        }
        if (read == 128) {
            return -1;
        }
        if (read <= 127) {
            return read;
        }
        int i11 = read & 127;
        if (i11 > 4) {
            throw new IOException("DER length more than 4 bytes: " + i11);
        }
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            int read2 = inputStream.read();
            if (read2 < 0) {
                throw new EOFException("EOF found reading length");
            }
            i12 = (i12 << 8) + read2;
        }
        if (i12 < 0) {
            throw new IOException("corrupted stream - negative length found");
        }
        if (i12 < i10) {
            return i12;
        }
        throw new IOException("corrupted stream - out of bounds length found");
    }

    public static AbstractC5940s B(int i10, s0 s0Var, byte[][] bArr) {
        if (i10 == 10) {
            return C5929g.k(U(s0Var, bArr));
        }
        if (i10 == 12) {
            return new j0(s0Var.r());
        }
        if (i10 == 30) {
            return new O(J(s0Var));
        }
        switch (i10) {
            case 1:
                return C5925c.k(U(s0Var, bArr));
            case 2:
                return new C5933k(s0Var.r(), false);
            case 3:
                return AbstractC5924b.l(s0Var.d(), s0Var);
            case 4:
                return new Z(s0Var.r());
            case 5:
                return X.f62244a;
            case 6:
                return C5936n.m(U(s0Var, bArr));
            default:
                switch (i10) {
                    case 18:
                        return new Y(s0Var.r());
                    case 19:
                        return new c0(s0Var.r());
                    case 20:
                        return new h0(s0Var.r());
                    case 21:
                        return new l0(s0Var.r());
                    case 22:
                        return new W(s0Var.r());
                    case 23:
                        return new A(s0Var.r());
                    case 24:
                        return new C5931i(s0Var.r());
                    case 25:
                        return new V(s0Var.r());
                    case 26:
                        return new m0(s0Var.r());
                    case 27:
                        return new U(s0Var.r());
                    case 28:
                        return new k0(s0Var.r());
                    default:
                        throw new IOException("unknown tag " + i10 + " encountered");
                }
        }
    }

    public static char[] J(s0 s0Var) {
        int read;
        int d10 = s0Var.d() / 2;
        char[] cArr = new char[d10];
        for (int i10 = 0; i10 < d10; i10++) {
            int read2 = s0Var.read();
            if (read2 < 0 || (read = s0Var.read()) < 0) {
                break;
            }
            cArr[i10] = (char) ((read2 << 8) | (read & 255));
        }
        return cArr;
    }

    public static byte[] U(s0 s0Var, byte[][] bArr) {
        int d10 = s0Var.d();
        if (s0Var.d() >= bArr.length) {
            return s0Var.r();
        }
        byte[] bArr2 = bArr[d10];
        if (bArr2 == null) {
            bArr2 = new byte[d10];
            bArr[d10] = bArr2;
        }
        Bj.a.c(s0Var, bArr2);
        return bArr2;
    }

    public static int m1(InputStream inputStream, int i10) {
        int i11 = i10 & 31;
        if (i11 != 31) {
            return i11;
        }
        int read = inputStream.read();
        if ((read & 127) == 0) {
            throw new IOException("corrupted stream - invalid high tag number found");
        }
        int i12 = 0;
        while (read >= 0 && (read & 128) != 0) {
            i12 = ((read & 127) | i12) << 7;
            read = inputStream.read();
        }
        if (read >= 0) {
            return (read & 127) | i12;
        }
        throw new EOFException("EOF found inside tag value.");
    }

    public AbstractC5940s D0() {
        int read = read();
        if (read <= 0) {
            if (read != 0) {
                return null;
            }
            throw new IOException("unexpected end-of-contents marker");
        }
        int m12 = m1(this, read);
        boolean z10 = (read & 32) != 0;
        int z02 = z0();
        if (z02 >= 0) {
            try {
                return r(read, m12, z02);
            } catch (IllegalArgumentException e10) {
                throw new C5930h("corrupted stream detected", e10);
            }
        }
        if (!z10) {
            throw new IOException("indefinite-length primitive encoding encountered");
        }
        C5945x c5945x = new C5945x(new u0(this, this.f62257a), this.f62257a);
        if ((read & 64) != 0) {
            return new C(m12, c5945x).getLoadedObject();
        }
        if ((read & 128) != 0) {
            return new L(true, m12, c5945x).getLoadedObject();
        }
        if (m12 == 4) {
            return new F(c5945x).getLoadedObject();
        }
        if (m12 == 8) {
            return new S(c5945x).getLoadedObject();
        }
        if (m12 == 16) {
            return new H(c5945x).getLoadedObject();
        }
        if (m12 == 17) {
            return new J(c5945x).getLoadedObject();
        }
        throw new IOException("unknown BER object encountered");
    }

    public C5928f d(s0 s0Var) {
        return new C5932j(s0Var).k();
    }

    public C5928f k() {
        C5928f c5928f = new C5928f();
        while (true) {
            AbstractC5940s D02 = D0();
            if (D02 == null) {
                return c5928f;
            }
            c5928f.a(D02);
        }
    }

    public AbstractC5940s r(int i10, int i11, int i12) {
        boolean z10 = (i10 & 32) != 0;
        s0 s0Var = new s0(this, i12);
        if ((i10 & 64) != 0) {
            return new N(z10, i11, s0Var.r());
        }
        if ((i10 & 128) != 0) {
            return new C5945x(s0Var).c(z10, i11);
        }
        if (!z10) {
            return B(i11, s0Var, this.f62259c);
        }
        if (i11 == 4) {
            C5928f d10 = d(s0Var);
            int c10 = d10.c();
            AbstractC5937o[] abstractC5937oArr = new AbstractC5937o[c10];
            for (int i13 = 0; i13 != c10; i13++) {
                abstractC5937oArr[i13] = (AbstractC5937o) d10.b(i13);
            }
            return new E(abstractC5937oArr);
        }
        if (i11 == 8) {
            return new Q(d(s0Var));
        }
        if (i11 == 16) {
            return this.f62258b ? new w0(s0Var.r()) : T.a(d(s0Var));
        }
        if (i11 == 17) {
            return T.b(d(s0Var));
        }
        throw new IOException("unknown tag " + i11 + " encountered");
    }

    public int w0() {
        return this.f62257a;
    }

    public int z0() {
        return A0(this, this.f62257a);
    }

    public C5932j(byte[] bArr) {
        this(new ByteArrayInputStream(bArr), bArr.length);
    }

    public C5932j(byte[] bArr, boolean z10) {
        this(new ByteArrayInputStream(bArr), bArr.length, z10);
    }

    public C5932j(InputStream inputStream, int i10) {
        this(inputStream, i10, false);
    }

    public C5932j(InputStream inputStream, boolean z10) {
        this(inputStream, z0.c(inputStream), z10);
    }

    public C5932j(InputStream inputStream, int i10, boolean z10) {
        super(inputStream);
        this.f62257a = i10;
        this.f62258b = z10;
        this.f62259c = new byte[11][];
    }
}
