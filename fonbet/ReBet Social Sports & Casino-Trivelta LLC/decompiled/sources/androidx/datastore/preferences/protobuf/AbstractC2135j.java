package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.q0;
import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: androidx.datastore.preferences.protobuf.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2135j extends AbstractC2131f {

    /* renamed from: c, reason: collision with root package name */
    public static final Logger f19529c = Logger.getLogger(AbstractC2135j.class.getName());

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f19530d = p0.B();

    /* renamed from: a, reason: collision with root package name */
    public C2136k f19531a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f19532b;

    /* renamed from: androidx.datastore.preferences.protobuf.j$b */
    public static abstract class b extends AbstractC2135j {
        final byte[] buffer;

        /* renamed from: e, reason: collision with root package name */
        public final int f19533e;

        /* renamed from: f, reason: collision with root package name */
        public int f19534f;

        /* renamed from: g, reason: collision with root package name */
        public int f19535g;

        public b(int i10) {
            super();
            if (i10 < 0) {
                throw new IllegalArgumentException("bufferSize must be >= 0");
            }
            byte[] bArr = new byte[Math.max(i10, 20)];
            this.buffer = bArr;
            this.f19533e = bArr.length;
        }

        public final void R0(byte b10) {
            byte[] bArr = this.buffer;
            int i10 = this.f19534f;
            this.f19534f = i10 + 1;
            bArr[i10] = b10;
            this.f19535g++;
        }

        public final void S0(int i10) {
            byte[] bArr = this.buffer;
            int i11 = this.f19534f;
            int i12 = i11 + 1;
            this.f19534f = i12;
            bArr[i11] = (byte) (i10 & 255);
            int i13 = i11 + 2;
            this.f19534f = i13;
            bArr[i12] = (byte) ((i10 >> 8) & 255);
            int i14 = i11 + 3;
            this.f19534f = i14;
            bArr[i13] = (byte) ((i10 >> 16) & 255);
            this.f19534f = i11 + 4;
            bArr[i14] = (byte) ((i10 >> 24) & 255);
            this.f19535g += 4;
        }

        public final void T0(long j10) {
            byte[] bArr = this.buffer;
            int i10 = this.f19534f;
            int i11 = i10 + 1;
            this.f19534f = i11;
            bArr[i10] = (byte) (j10 & 255);
            int i12 = i10 + 2;
            this.f19534f = i12;
            bArr[i11] = (byte) ((j10 >> 8) & 255);
            int i13 = i10 + 3;
            this.f19534f = i13;
            bArr[i12] = (byte) ((j10 >> 16) & 255);
            int i14 = i10 + 4;
            this.f19534f = i14;
            bArr[i13] = (byte) (255 & (j10 >> 24));
            int i15 = i10 + 5;
            this.f19534f = i15;
            bArr[i14] = (byte) (((int) (j10 >> 32)) & 255);
            int i16 = i10 + 6;
            this.f19534f = i16;
            bArr[i15] = (byte) (((int) (j10 >> 40)) & 255);
            int i17 = i10 + 7;
            this.f19534f = i17;
            bArr[i16] = (byte) (((int) (j10 >> 48)) & 255);
            this.f19534f = i10 + 8;
            bArr[i17] = (byte) (((int) (j10 >> 56)) & 255);
            this.f19535g += 8;
        }

        public final void U0(int i10) {
            if (i10 >= 0) {
                W0(i10);
            } else {
                X0(i10);
            }
        }

        public final void V0(int i10, int i11) {
            W0(r0.c(i10, i11));
        }

        public final void W0(int i10) {
            if (!AbstractC2135j.f19530d) {
                while ((i10 & (-128)) != 0) {
                    byte[] bArr = this.buffer;
                    int i11 = this.f19534f;
                    this.f19534f = i11 + 1;
                    bArr[i11] = (byte) ((i10 | 128) & 255);
                    this.f19535g++;
                    i10 >>>= 7;
                }
                byte[] bArr2 = this.buffer;
                int i12 = this.f19534f;
                this.f19534f = i12 + 1;
                bArr2[i12] = (byte) i10;
                this.f19535g++;
                return;
            }
            long j10 = this.f19534f;
            while ((i10 & (-128)) != 0) {
                byte[] bArr3 = this.buffer;
                int i13 = this.f19534f;
                this.f19534f = i13 + 1;
                p0.H(bArr3, i13, (byte) ((i10 | 128) & 255));
                i10 >>>= 7;
            }
            byte[] bArr4 = this.buffer;
            int i14 = this.f19534f;
            this.f19534f = i14 + 1;
            p0.H(bArr4, i14, (byte) i10);
            this.f19535g += (int) (this.f19534f - j10);
        }

        public final void X0(long j10) {
            if (!AbstractC2135j.f19530d) {
                while ((j10 & (-128)) != 0) {
                    byte[] bArr = this.buffer;
                    int i10 = this.f19534f;
                    this.f19534f = i10 + 1;
                    bArr[i10] = (byte) ((((int) j10) | 128) & 255);
                    this.f19535g++;
                    j10 >>>= 7;
                }
                byte[] bArr2 = this.buffer;
                int i11 = this.f19534f;
                this.f19534f = i11 + 1;
                bArr2[i11] = (byte) j10;
                this.f19535g++;
                return;
            }
            long j11 = this.f19534f;
            while ((j10 & (-128)) != 0) {
                byte[] bArr3 = this.buffer;
                int i12 = this.f19534f;
                this.f19534f = i12 + 1;
                p0.H(bArr3, i12, (byte) ((((int) j10) | 128) & 255));
                j10 >>>= 7;
            }
            byte[] bArr4 = this.buffer;
            int i13 = this.f19534f;
            this.f19534f = i13 + 1;
            p0.H(bArr4, i13, (byte) j10);
            this.f19535g += (int) (this.f19534f - j11);
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.j$c */
    public static class c extends IOException {
        private static final long serialVersionUID = -6947486886997889499L;

        public c(Throwable th2) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th2);
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.j$d */
    public static final class d extends b {

        /* renamed from: h, reason: collision with root package name */
        public final OutputStream f19536h;

        public d(OutputStream outputStream, int i10) {
            super(i10);
            if (outputStream == null) {
                throw new NullPointerException("out");
            }
            this.f19536h = outputStream;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2135j
        public void A0(int i10, P p10) {
            M0(1, 3);
            N0(2, i10);
            b1(3, p10);
            M0(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2135j
        public void B0(int i10, AbstractC2132g abstractC2132g) {
            M0(1, 3);
            N0(2, i10);
            e0(3, abstractC2132g);
            M0(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2135j
        public void K0(int i10, String str) {
            M0(i10, 2);
            L0(str);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2135j
        public void L0(String str) {
            int c10;
            try {
                int length = str.length() * 3;
                int Q10 = AbstractC2135j.Q(length);
                int i10 = Q10 + length;
                int i11 = this.f19533e;
                if (i10 > i11) {
                    byte[] bArr = new byte[length];
                    int b10 = q0.b(str, bArr, 0, length);
                    O0(b10);
                    a(bArr, 0, b10);
                    return;
                }
                if (i10 > i11 - this.f19534f) {
                    Y0();
                }
                int Q11 = AbstractC2135j.Q(str.length());
                int i12 = this.f19534f;
                try {
                    if (Q11 == Q10) {
                        int i13 = i12 + Q11;
                        this.f19534f = i13;
                        int b11 = q0.b(str, this.buffer, i13, this.f19533e - i13);
                        this.f19534f = i12;
                        c10 = (b11 - i12) - Q11;
                        W0(c10);
                        this.f19534f = b11;
                    } else {
                        c10 = q0.c(str);
                        W0(c10);
                        this.f19534f = q0.b(str, this.buffer, this.f19534f, c10);
                    }
                    this.f19535g += c10;
                } catch (q0.d e10) {
                    this.f19535g -= this.f19534f - i12;
                    this.f19534f = i12;
                    throw e10;
                } catch (ArrayIndexOutOfBoundsException e11) {
                    throw new c(e11);
                }
            } catch (q0.d e12) {
                W(str, e12);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2135j
        public void M0(int i10, int i11) {
            O0(r0.c(i10, i11));
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2135j
        public void N0(int i10, int i11) {
            Z0(20);
            V0(i10, 0);
            W0(i11);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2135j
        public void O0(int i10) {
            Z0(5);
            W0(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2135j
        public void P0(int i10, long j10) {
            Z0(20);
            V0(i10, 0);
            X0(j10);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2135j
        public void Q0(long j10) {
            Z0(10);
            X0(j10);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2135j
        public void V() {
            if (this.f19534f > 0) {
                Y0();
            }
        }

        public final void Y0() {
            this.f19536h.write(this.buffer, 0, this.f19534f);
            this.f19534f = 0;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2135j
        public void Z(byte b10) {
            if (this.f19534f == this.f19533e) {
                Y0();
            }
            R0(b10);
        }

        public final void Z0(int i10) {
            if (this.f19533e - this.f19534f < i10) {
                Y0();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2135j, androidx.datastore.preferences.protobuf.AbstractC2131f
        public void a(byte[] bArr, int i10, int i11) {
            a1(bArr, i10, i11);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2135j
        public void a0(int i10, boolean z10) {
            Z0(11);
            V0(i10, 0);
            R0(z10 ? (byte) 1 : (byte) 0);
        }

        public void a1(byte[] bArr, int i10, int i11) {
            int i12 = this.f19533e;
            int i13 = this.f19534f;
            if (i12 - i13 >= i11) {
                System.arraycopy(bArr, i10, this.buffer, i13, i11);
                this.f19534f += i11;
                this.f19535g += i11;
                return;
            }
            int i14 = i12 - i13;
            System.arraycopy(bArr, i10, this.buffer, i13, i14);
            int i15 = i10 + i14;
            int i16 = i11 - i14;
            this.f19534f = this.f19533e;
            this.f19535g += i14;
            Y0();
            if (i16 <= this.f19533e) {
                System.arraycopy(bArr, i15, this.buffer, 0, i16);
                this.f19534f = i16;
            } else {
                this.f19536h.write(bArr, i15, i16);
            }
            this.f19535g += i16;
        }

        public void b1(int i10, P p10) {
            M0(i10, 2);
            z0(p10);
        }

        public void c1(P p10, f0 f0Var) {
            O0(((AbstractC2126a) p10).c(f0Var));
            f0Var.b(p10, this.f19531a);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2135j
        public void d0(byte[] bArr, int i10, int i11) {
            O0(i11);
            a1(bArr, i10, i11);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2135j
        public void e0(int i10, AbstractC2132g abstractC2132g) {
            M0(i10, 2);
            f0(abstractC2132g);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2135j
        public void f0(AbstractC2132g abstractC2132g) {
            O0(abstractC2132g.size());
            abstractC2132g.t(this);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2135j
        public void k0(int i10, int i11) {
            Z0(14);
            V0(i10, 5);
            S0(i11);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2135j
        public void l0(int i10) {
            Z0(4);
            S0(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2135j
        public void m0(int i10, long j10) {
            Z0(18);
            V0(i10, 1);
            T0(j10);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2135j
        public void n0(long j10) {
            Z0(8);
            T0(j10);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2135j
        public void u0(int i10, int i11) {
            Z0(20);
            V0(i10, 0);
            U0(i11);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2135j
        public void v0(int i10) {
            if (i10 >= 0) {
                O0(i10);
            } else {
                Q0(i10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2135j
        public void y0(int i10, P p10, f0 f0Var) {
            M0(i10, 2);
            c1(p10, f0Var);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2135j
        public void z0(P p10) {
            O0(p10.getSerializedSize());
            p10.a(this);
        }
    }

    public static int A(P p10) {
        return y(p10.getSerializedSize());
    }

    public static int B(P p10, f0 f0Var) {
        return y(((AbstractC2126a) p10).c(f0Var));
    }

    public static int C(int i10) {
        if (i10 > 4096) {
            return 4096;
        }
        return i10;
    }

    public static int D(int i10, AbstractC2132g abstractC2132g) {
        return (O(1) * 2) + P(2, i10) + f(3, abstractC2132g);
    }

    public static int E(int i10, int i11) {
        return O(i10) + F(i11);
    }

    public static int F(int i10) {
        return 4;
    }

    public static int G(int i10, long j10) {
        return O(i10) + H(j10);
    }

    public static int H(long j10) {
        return 8;
    }

    public static int I(int i10, int i11) {
        return O(i10) + J(i11);
    }

    public static int J(int i10) {
        return Q(T(i10));
    }

    public static int K(int i10, long j10) {
        return O(i10) + L(j10);
    }

    public static int L(long j10) {
        return S(U(j10));
    }

    public static int M(int i10, String str) {
        return O(i10) + N(str);
    }

    public static int N(String str) {
        int length;
        try {
            length = q0.c(str);
        } catch (q0.d unused) {
            length = str.getBytes(AbstractC2149y.f19691b).length;
        }
        return y(length);
    }

    public static int O(int i10) {
        return Q(r0.c(i10, 0));
    }

    public static int P(int i10, int i11) {
        return O(i10) + Q(i11);
    }

    public static int Q(int i10) {
        return (352 - (Integer.numberOfLeadingZeros(i10) * 9)) >>> 6;
    }

    public static int R(int i10, long j10) {
        return O(i10) + S(j10);
    }

    public static int S(long j10) {
        return (640 - (Long.numberOfLeadingZeros(j10) * 9)) >>> 6;
    }

    public static int T(int i10) {
        return (i10 >> 31) ^ (i10 << 1);
    }

    public static long U(long j10) {
        return (j10 >> 63) ^ (j10 << 1);
    }

    public static AbstractC2135j Y(OutputStream outputStream, int i10) {
        return new d(outputStream, i10);
    }

    public static int c(int i10, boolean z10) {
        return O(i10) + d(z10);
    }

    public static int d(boolean z10) {
        return 1;
    }

    public static int e(byte[] bArr) {
        return y(bArr.length);
    }

    public static int f(int i10, AbstractC2132g abstractC2132g) {
        return O(i10) + g(abstractC2132g);
    }

    public static int g(AbstractC2132g abstractC2132g) {
        return y(abstractC2132g.size());
    }

    public static int h(int i10, double d10) {
        return O(i10) + i(d10);
    }

    public static int i(double d10) {
        return 8;
    }

    public static int j(int i10, int i11) {
        return O(i10) + k(i11);
    }

    public static int k(int i10) {
        return v(i10);
    }

    public static int l(int i10, int i11) {
        return O(i10) + m(i11);
    }

    public static int m(int i10) {
        return 4;
    }

    public static int n(int i10, long j10) {
        return O(i10) + o(j10);
    }

    public static int o(long j10) {
        return 8;
    }

    public static int p(int i10, float f10) {
        return O(i10) + q(f10);
    }

    public static int q(float f10) {
        return 4;
    }

    public static int r(int i10, P p10, f0 f0Var) {
        return (O(i10) * 2) + t(p10, f0Var);
    }

    public static int s(P p10) {
        return p10.getSerializedSize();
    }

    public static int t(P p10, f0 f0Var) {
        return ((AbstractC2126a) p10).c(f0Var);
    }

    public static int u(int i10, int i11) {
        return O(i10) + v(i11);
    }

    public static int v(int i10) {
        return S(i10);
    }

    public static int w(int i10, long j10) {
        return O(i10) + x(j10);
    }

    public static int x(long j10) {
        return S(j10);
    }

    public static int y(int i10) {
        return Q(i10) + i10;
    }

    public static int z(int i10, P p10, f0 f0Var) {
        return O(i10) + B(p10, f0Var);
    }

    public abstract void A0(int i10, P p10);

    public abstract void B0(int i10, AbstractC2132g abstractC2132g);

    public final void C0(int i10, int i11) {
        k0(i10, i11);
    }

    public final void D0(int i10) {
        l0(i10);
    }

    public final void E0(int i10, long j10) {
        m0(i10, j10);
    }

    public final void F0(long j10) {
        n0(j10);
    }

    public final void G0(int i10, int i11) {
        N0(i10, T(i11));
    }

    public final void H0(int i10) {
        O0(T(i10));
    }

    public final void I0(int i10, long j10) {
        P0(i10, U(j10));
    }

    public final void J0(long j10) {
        Q0(U(j10));
    }

    public abstract void K0(int i10, String str);

    public abstract void L0(String str);

    public abstract void M0(int i10, int i11);

    public abstract void N0(int i10, int i11);

    public abstract void O0(int i10);

    public abstract void P0(int i10, long j10);

    public abstract void Q0(long j10);

    public abstract void V();

    public final void W(String str, q0.d dVar) {
        f19529c.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) dVar);
        byte[] bytes = str.getBytes(AbstractC2149y.f19691b);
        try {
            O0(bytes.length);
            a(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e10) {
            throw new c(e10);
        }
    }

    public boolean X() {
        return this.f19532b;
    }

    public abstract void Z(byte b10);

    @Override // androidx.datastore.preferences.protobuf.AbstractC2131f
    public abstract void a(byte[] bArr, int i10, int i11);

    public abstract void a0(int i10, boolean z10);

    public final void b0(boolean z10) {
        Z(z10 ? (byte) 1 : (byte) 0);
    }

    public final void c0(byte[] bArr) {
        d0(bArr, 0, bArr.length);
    }

    public abstract void d0(byte[] bArr, int i10, int i11);

    public abstract void e0(int i10, AbstractC2132g abstractC2132g);

    public abstract void f0(AbstractC2132g abstractC2132g);

    public final void g0(int i10, double d10) {
        m0(i10, Double.doubleToRawLongBits(d10));
    }

    public final void h0(double d10) {
        n0(Double.doubleToRawLongBits(d10));
    }

    public final void i0(int i10, int i11) {
        u0(i10, i11);
    }

    public final void j0(int i10) {
        v0(i10);
    }

    public abstract void k0(int i10, int i11);

    public abstract void l0(int i10);

    public abstract void m0(int i10, long j10);

    public abstract void n0(long j10);

    public final void o0(int i10, float f10) {
        k0(i10, Float.floatToRawIntBits(f10));
    }

    public final void p0(float f10) {
        l0(Float.floatToRawIntBits(f10));
    }

    public final void q0(int i10, P p10) {
        M0(i10, 3);
        s0(p10);
        M0(i10, 4);
    }

    public final void r0(int i10, P p10, f0 f0Var) {
        M0(i10, 3);
        t0(p10, f0Var);
        M0(i10, 4);
    }

    public final void s0(P p10) {
        p10.a(this);
    }

    public final void t0(P p10, f0 f0Var) {
        f0Var.b(p10, this.f19531a);
    }

    public abstract void u0(int i10, int i11);

    public abstract void v0(int i10);

    public final void w0(int i10, long j10) {
        P0(i10, j10);
    }

    public final void x0(long j10) {
        Q0(j10);
    }

    public abstract void y0(int i10, P p10, f0 f0Var);

    public abstract void z0(P p10);

    public AbstractC2135j() {
    }
}
