package org.spongycastle.asn1;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: org.spongycastle.asn1.x, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C5945x {

    /* renamed from: a, reason: collision with root package name */
    public final InputStream f62280a;

    /* renamed from: b, reason: collision with root package name */
    public final int f62281b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[][] f62282c;

    public C5945x(InputStream inputStream) {
        this(inputStream, z0.c(inputStream));
    }

    public InterfaceC5927e a(int i10) {
        if (i10 == 4) {
            return new F(this);
        }
        if (i10 == 8) {
            return new S(this);
        }
        if (i10 == 16) {
            return new H(this);
        }
        if (i10 == 17) {
            return new J(this);
        }
        throw new C5930h("unknown BER object encountered: 0x" + Integer.toHexString(i10));
    }

    public InterfaceC5927e b() {
        int read = this.f62280a.read();
        if (read == -1) {
            return null;
        }
        e(false);
        int m12 = C5932j.m1(this.f62280a, read);
        boolean z10 = (read & 32) != 0;
        int A02 = C5932j.A0(this.f62280a, this.f62281b);
        if (A02 < 0) {
            if (!z10) {
                throw new IOException("indefinite-length primitive encoding encountered");
            }
            C5945x c5945x = new C5945x(new u0(this.f62280a, this.f62281b), this.f62281b);
            return (read & 64) != 0 ? new C(m12, c5945x) : (read & 128) != 0 ? new L(true, m12, c5945x) : c5945x.a(m12);
        }
        s0 s0Var = new s0(this.f62280a, A02);
        if ((read & 64) != 0) {
            return new N(z10, m12, s0Var.r());
        }
        if ((read & 128) != 0) {
            return new L(z10, m12, new C5945x(s0Var));
        }
        if (!z10) {
            if (m12 == 4) {
                return new a0(s0Var);
            }
            try {
                return C5932j.B(m12, s0Var, this.f62282c);
            } catch (IllegalArgumentException e10) {
                throw new C5930h("corrupted stream detected", e10);
            }
        }
        if (m12 == 4) {
            return new F(new C5945x(s0Var));
        }
        if (m12 == 8) {
            return new S(new C5945x(s0Var));
        }
        if (m12 == 16) {
            return new e0(new C5945x(s0Var));
        }
        if (m12 == 17) {
            return new g0(new C5945x(s0Var));
        }
        throw new IOException("unknown tag " + m12 + " encountered");
    }

    public AbstractC5940s c(boolean z10, int i10) {
        if (!z10) {
            return new i0(false, i10, new Z(((s0) this.f62280a).r()));
        }
        C5928f d10 = d();
        return this.f62280a instanceof u0 ? d10.c() == 1 ? new K(true, i10, d10.b(0)) : new K(false, i10, D.a(d10)) : d10.c() == 1 ? new i0(true, i10, d10.b(0)) : new i0(false, i10, T.a(d10));
    }

    public C5928f d() {
        C5928f c5928f = new C5928f();
        while (true) {
            InterfaceC5927e b10 = b();
            if (b10 == null) {
                return c5928f;
            }
            if (b10 instanceof t0) {
                c5928f.a(((t0) b10).getLoadedObject());
            } else {
                c5928f.a(b10.toASN1Primitive());
            }
        }
    }

    public final void e(boolean z10) {
        InputStream inputStream = this.f62280a;
        if (inputStream instanceof u0) {
            ((u0) inputStream).B(z10);
        }
    }

    public C5945x(InputStream inputStream, int i10) {
        this.f62280a = inputStream;
        this.f62281b = i10;
        this.f62282c = new byte[11][];
    }
}
