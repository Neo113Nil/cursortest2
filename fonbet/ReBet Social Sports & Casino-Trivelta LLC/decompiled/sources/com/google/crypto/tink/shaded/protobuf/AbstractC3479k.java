package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.p0;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.crypto.tink.shaded.protobuf.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3479k extends AbstractC3475g {

    /* renamed from: c, reason: collision with root package name */
    public static final Logger f37327c = Logger.getLogger(AbstractC3479k.class.getName());

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f37328d = o0.E();

    /* renamed from: a, reason: collision with root package name */
    public C3480l f37329a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f37330b;

    /* renamed from: com.google.crypto.tink.shaded.protobuf.k$b */
    public static class b extends AbstractC3479k {
        private final byte[] buffer;

        /* renamed from: e, reason: collision with root package name */
        public final int f37331e;

        /* renamed from: f, reason: collision with root package name */
        public final int f37332f;

        /* renamed from: g, reason: collision with root package name */
        public int f37333g;

        public b(byte[] bArr, int i10, int i11) {
            super();
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            int i12 = i10 + i11;
            if ((i10 | i11 | (bArr.length - i12)) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)));
            }
            this.buffer = bArr;
            this.f37331e = i10;
            this.f37333g = i10;
            this.f37332f = i12;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3479k
        public final void C0(int i10, String str) {
            D0(i10, 2);
            M0(str);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3479k
        public final void D0(int i10, int i11) {
            F0(q0.c(i10, i11));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3479k
        public final void E0(int i10, int i11) {
            D0(i10, 0);
            F0(i11);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3479k
        public final void F0(int i10) {
            while ((i10 & (-128)) != 0) {
                try {
                    byte[] bArr = this.buffer;
                    int i11 = this.f37333g;
                    this.f37333g = i11 + 1;
                    bArr[i11] = (byte) ((i10 & 127) | 128);
                    i10 >>>= 7;
                } catch (IndexOutOfBoundsException e10) {
                    throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f37333g), Integer.valueOf(this.f37332f), 1), e10);
                }
            }
            byte[] bArr2 = this.buffer;
            int i12 = this.f37333g;
            this.f37333g = i12 + 1;
            bArr2[i12] = (byte) i10;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3479k
        public final void G0(int i10, long j10) {
            D0(i10, 0);
            H0(j10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3479k
        public final void H0(long j10) {
            if (AbstractC3479k.f37328d && W() >= 10) {
                while ((j10 & (-128)) != 0) {
                    byte[] bArr = this.buffer;
                    int i10 = this.f37333g;
                    this.f37333g = i10 + 1;
                    o0.K(bArr, i10, (byte) ((((int) j10) & 127) | 128));
                    j10 >>>= 7;
                }
                byte[] bArr2 = this.buffer;
                int i11 = this.f37333g;
                this.f37333g = i11 + 1;
                o0.K(bArr2, i11, (byte) j10);
                return;
            }
            while ((j10 & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.buffer;
                    int i12 = this.f37333g;
                    this.f37333g = i12 + 1;
                    bArr3[i12] = (byte) ((((int) j10) & 127) | 128);
                    j10 >>>= 7;
                } catch (IndexOutOfBoundsException e10) {
                    throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f37333g), Integer.valueOf(this.f37332f), 1), e10);
                }
            }
            byte[] bArr4 = this.buffer;
            int i13 = this.f37333g;
            this.f37333g = i13 + 1;
            bArr4[i13] = (byte) j10;
        }

        public final void I0(byte[] bArr, int i10, int i11) {
            try {
                System.arraycopy(bArr, i10, this.buffer, this.f37333g, i11);
                this.f37333g += i11;
            } catch (IndexOutOfBoundsException e10) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f37333g), Integer.valueOf(this.f37332f), Integer.valueOf(i11)), e10);
            }
        }

        public final void J0(AbstractC3476h abstractC3476h) {
            F0(abstractC3476h.size());
            abstractC3476h.z(this);
        }

        public final void K0(int i10, O o10) {
            D0(i10, 2);
            L0(o10);
        }

        public final void L0(O o10) {
            F0(o10.getSerializedSize());
            o10.a(this);
        }

        public final void M0(String str) {
            int i10 = this.f37333g;
            try {
                int N10 = AbstractC3479k.N(str.length() * 3);
                int N11 = AbstractC3479k.N(str.length());
                if (N11 != N10) {
                    F0(p0.g(str));
                    this.f37333g = p0.f(str, this.buffer, this.f37333g, W());
                    return;
                }
                int i11 = i10 + N11;
                this.f37333g = i11;
                int f10 = p0.f(str, this.buffer, i11, W());
                this.f37333g = i10;
                F0((f10 - i10) - N11);
                this.f37333g = f10;
            } catch (p0.d e10) {
                this.f37333g = i10;
                S(str, e10);
            } catch (IndexOutOfBoundsException e11) {
                throw new c(e11);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3479k
        public final int W() {
            return this.f37332f - this.f37333g;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3479k
        public final void X(byte b10) {
            try {
                byte[] bArr = this.buffer;
                int i10 = this.f37333g;
                this.f37333g = i10 + 1;
                bArr[i10] = b10;
            } catch (IndexOutOfBoundsException e10) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f37333g), Integer.valueOf(this.f37332f), 1), e10);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3479k
        public final void Y(int i10, boolean z10) {
            D0(i10, 0);
            X(z10 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3479k, com.google.crypto.tink.shaded.protobuf.AbstractC3475g
        public final void a(byte[] bArr, int i10, int i11) {
            I0(bArr, i10, i11);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3479k
        public final void a0(int i10, AbstractC3476h abstractC3476h) {
            D0(i10, 2);
            J0(abstractC3476h);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3479k
        public final void f0(int i10, int i11) {
            D0(i10, 5);
            g0(i11);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3479k
        public final void g0(int i10) {
            try {
                byte[] bArr = this.buffer;
                int i11 = this.f37333g;
                int i12 = i11 + 1;
                this.f37333g = i12;
                bArr[i11] = (byte) (i10 & 255);
                int i13 = i11 + 2;
                this.f37333g = i13;
                bArr[i12] = (byte) ((i10 >> 8) & 255);
                int i14 = i11 + 3;
                this.f37333g = i14;
                bArr[i13] = (byte) ((i10 >> 16) & 255);
                this.f37333g = i11 + 4;
                bArr[i14] = (byte) ((i10 >> 24) & 255);
            } catch (IndexOutOfBoundsException e10) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f37333g), Integer.valueOf(this.f37332f), 1), e10);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3479k
        public final void h0(int i10, long j10) {
            D0(i10, 1);
            i0(j10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3479k
        public final void i0(long j10) {
            try {
                byte[] bArr = this.buffer;
                int i10 = this.f37333g;
                int i11 = i10 + 1;
                this.f37333g = i11;
                bArr[i10] = (byte) (((int) j10) & 255);
                int i12 = i10 + 2;
                this.f37333g = i12;
                bArr[i11] = (byte) (((int) (j10 >> 8)) & 255);
                int i13 = i10 + 3;
                this.f37333g = i13;
                bArr[i12] = (byte) (((int) (j10 >> 16)) & 255);
                int i14 = i10 + 4;
                this.f37333g = i14;
                bArr[i13] = (byte) (((int) (j10 >> 24)) & 255);
                int i15 = i10 + 5;
                this.f37333g = i15;
                bArr[i14] = (byte) (((int) (j10 >> 32)) & 255);
                int i16 = i10 + 6;
                this.f37333g = i16;
                bArr[i15] = (byte) (((int) (j10 >> 40)) & 255);
                int i17 = i10 + 7;
                this.f37333g = i17;
                bArr[i16] = (byte) (((int) (j10 >> 48)) & 255);
                this.f37333g = i10 + 8;
                bArr[i17] = (byte) (((int) (j10 >> 56)) & 255);
            } catch (IndexOutOfBoundsException e10) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f37333g), Integer.valueOf(this.f37332f), 1), e10);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3479k
        public final void n0(int i10, int i11) {
            D0(i10, 0);
            o0(i11);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3479k
        public final void o0(int i10) {
            if (i10 >= 0) {
                F0(i10);
            } else {
                H0(i10);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3479k
        public final void r0(int i10, O o10, e0 e0Var) {
            D0(i10, 2);
            F0(((AbstractC3469a) o10).b(e0Var));
            e0Var.c(o10, this.f37329a);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3479k
        public final void s0(int i10, O o10) {
            D0(1, 3);
            E0(2, i10);
            K0(3, o10);
            D0(1, 4);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3479k
        public final void t0(int i10, AbstractC3476h abstractC3476h) {
            D0(1, 3);
            E0(2, i10);
            a0(3, abstractC3476h);
            D0(1, 4);
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.k$c */
    public static class c extends IOException {
        private static final long serialVersionUID = -6947486886997889499L;

        public c(Throwable th2) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th2);
        }

        public c(String str, Throwable th2) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str, th2);
        }
    }

    public static int A(int i10, AbstractC3476h abstractC3476h) {
        return (L(1) * 2) + M(2, i10) + f(3, abstractC3476h);
    }

    public static int B(int i10, int i11) {
        return L(i10) + C(i11);
    }

    public static int C(int i10) {
        return 4;
    }

    public static int D(int i10, long j10) {
        return L(i10) + E(j10);
    }

    public static int E(long j10) {
        return 8;
    }

    public static int F(int i10, int i11) {
        return L(i10) + G(i11);
    }

    public static int G(int i10) {
        return N(Q(i10));
    }

    public static int H(int i10, long j10) {
        return L(i10) + I(j10);
    }

    public static int I(long j10) {
        return P(R(j10));
    }

    public static int J(int i10, String str) {
        return L(i10) + K(str);
    }

    public static int K(String str) {
        int length;
        try {
            length = p0.g(str);
        } catch (p0.d unused) {
            length = str.getBytes(AbstractC3493z.f37488b).length;
        }
        return x(length);
    }

    public static int L(int i10) {
        return N(q0.c(i10, 0));
    }

    public static int M(int i10, int i11) {
        return L(i10) + N(i11);
    }

    public static int N(int i10) {
        if ((i10 & (-128)) == 0) {
            return 1;
        }
        if ((i10 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i10) == 0) {
            return 3;
        }
        return (i10 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int O(int i10, long j10) {
        return L(i10) + P(j10);
    }

    public static int P(long j10) {
        int i10;
        if (((-128) & j10) == 0) {
            return 1;
        }
        if (j10 < 0) {
            return 10;
        }
        if (((-34359738368L) & j10) != 0) {
            j10 >>>= 28;
            i10 = 6;
        } else {
            i10 = 2;
        }
        if (((-2097152) & j10) != 0) {
            i10 += 2;
            j10 >>>= 14;
        }
        return (j10 & (-16384)) != 0 ? i10 + 1 : i10;
    }

    public static int Q(int i10) {
        return (i10 >> 31) ^ (i10 << 1);
    }

    public static long R(long j10) {
        return (j10 >> 63) ^ (j10 << 1);
    }

    public static AbstractC3479k U(byte[] bArr) {
        return V(bArr, 0, bArr.length);
    }

    public static AbstractC3479k V(byte[] bArr, int i10, int i11) {
        return new b(bArr, i10, i11);
    }

    public static int d(int i10, boolean z10) {
        return L(i10) + e(z10);
    }

    public static int e(boolean z10) {
        return 1;
    }

    public static int f(int i10, AbstractC3476h abstractC3476h) {
        return L(i10) + g(abstractC3476h);
    }

    public static int g(AbstractC3476h abstractC3476h) {
        return x(abstractC3476h.size());
    }

    public static int h(int i10, double d10) {
        return L(i10) + i(d10);
    }

    public static int i(double d10) {
        return 8;
    }

    public static int j(int i10, int i11) {
        return L(i10) + k(i11);
    }

    public static int k(int i10) {
        return u(i10);
    }

    public static int l(int i10, int i11) {
        return L(i10) + m(i11);
    }

    public static int m(int i10) {
        return 4;
    }

    public static int n(int i10, long j10) {
        return L(i10) + o(j10);
    }

    public static int o(long j10) {
        return 8;
    }

    public static int p(int i10, float f10) {
        return L(i10) + q(f10);
    }

    public static int q(float f10) {
        return 4;
    }

    public static int r(int i10, O o10, e0 e0Var) {
        return (L(i10) * 2) + s(o10, e0Var);
    }

    public static int s(O o10, e0 e0Var) {
        return ((AbstractC3469a) o10).b(e0Var);
    }

    public static int t(int i10, int i11) {
        return L(i10) + u(i11);
    }

    public static int u(int i10) {
        if (i10 >= 0) {
            return N(i10);
        }
        return 10;
    }

    public static int v(int i10, long j10) {
        return L(i10) + w(j10);
    }

    public static int w(long j10) {
        return P(j10);
    }

    public static int x(int i10) {
        return N(i10) + i10;
    }

    public static int y(int i10, O o10, e0 e0Var) {
        return L(i10) + z(o10, e0Var);
    }

    public static int z(O o10, e0 e0Var) {
        return x(((AbstractC3469a) o10).b(e0Var));
    }

    public final void A0(int i10, long j10) {
        G0(i10, R(j10));
    }

    public final void B0(long j10) {
        H0(R(j10));
    }

    public abstract void C0(int i10, String str);

    public abstract void D0(int i10, int i11);

    public abstract void E0(int i10, int i11);

    public abstract void F0(int i10);

    public abstract void G0(int i10, long j10);

    public abstract void H0(long j10);

    public final void S(String str, p0.d dVar) {
        f37327c.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) dVar);
        byte[] bytes = str.getBytes(AbstractC3493z.f37488b);
        try {
            F0(bytes.length);
            a(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e10) {
            throw new c(e10);
        }
    }

    public boolean T() {
        return this.f37330b;
    }

    public abstract int W();

    public abstract void X(byte b10);

    public abstract void Y(int i10, boolean z10);

    public final void Z(boolean z10) {
        X(z10 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3475g
    public abstract void a(byte[] bArr, int i10, int i11);

    public abstract void a0(int i10, AbstractC3476h abstractC3476h);

    public final void b0(int i10, double d10) {
        h0(i10, Double.doubleToRawLongBits(d10));
    }

    public final void c() {
        if (W() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public final void c0(double d10) {
        i0(Double.doubleToRawLongBits(d10));
    }

    public final void d0(int i10, int i11) {
        n0(i10, i11);
    }

    public final void e0(int i10) {
        o0(i10);
    }

    public abstract void f0(int i10, int i11);

    public abstract void g0(int i10);

    public abstract void h0(int i10, long j10);

    public abstract void i0(long j10);

    public final void j0(int i10, float f10) {
        f0(i10, Float.floatToRawIntBits(f10));
    }

    public final void k0(float f10) {
        g0(Float.floatToRawIntBits(f10));
    }

    public final void l0(int i10, O o10, e0 e0Var) {
        D0(i10, 3);
        m0(o10, e0Var);
        D0(i10, 4);
    }

    public final void m0(O o10, e0 e0Var) {
        e0Var.c(o10, this.f37329a);
    }

    public abstract void n0(int i10, int i11);

    public abstract void o0(int i10);

    public final void p0(int i10, long j10) {
        G0(i10, j10);
    }

    public final void q0(long j10) {
        H0(j10);
    }

    public abstract void r0(int i10, O o10, e0 e0Var);

    public abstract void s0(int i10, O o10);

    public abstract void t0(int i10, AbstractC3476h abstractC3476h);

    public final void u0(int i10, int i11) {
        f0(i10, i11);
    }

    public final void v0(int i10) {
        g0(i10);
    }

    public final void w0(int i10, long j10) {
        h0(i10, j10);
    }

    public final void x0(long j10) {
        i0(j10);
    }

    public final void y0(int i10, int i11) {
        E0(i10, Q(i11));
    }

    public final void z0(int i10) {
        F0(Q(i10));
    }

    public AbstractC3479k() {
    }
}
