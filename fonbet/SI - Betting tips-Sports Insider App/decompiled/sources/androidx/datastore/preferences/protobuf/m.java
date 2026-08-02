package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: b, reason: collision with root package name */
    public int f1653b;

    /* renamed from: c, reason: collision with root package name */
    public int f1654c;

    /* renamed from: e, reason: collision with root package name */
    public final Object f1656e;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1652a = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f1655d = 0;

    public m(l lVar) {
        Charset charset = a0.f1572a;
        this.f1656e = lVar;
        lVar.f1650b = this;
    }

    public void A(z zVar) {
        int u10;
        l lVar = (l) this.f1656e;
        int i5 = this.f1653b & 7;
        if (i5 == 0) {
            do {
                ((v0) zVar).add(Long.valueOf(lVar.n()));
                if (lVar.c()) {
                    return;
                } else {
                    u10 = lVar.u();
                }
            } while (u10 == this.f1653b);
            this.f1655d = u10;
            return;
        }
        if (i5 != 2) {
            throw c0.b();
        }
        int b10 = lVar.b() + lVar.v();
        do {
            ((v0) zVar).add(Long.valueOf(lVar.n()));
        } while (lVar.b() < b10);
        Q(b10);
    }

    public void B(s9.s sVar) {
        int u10;
        s9.k kVar = (s9.k) this.f1656e;
        int i5 = this.f1653b & 7;
        if (i5 == 0) {
            do {
                ((s9.l0) sVar).add(Long.valueOf(kVar.n()));
                if (kVar.c()) {
                    return;
                } else {
                    u10 = kVar.u();
                }
            } while (u10 == this.f1653b);
            this.f1655d = u10;
            return;
        }
        if (i5 != 2) {
            throw s9.v.b();
        }
        int b10 = kVar.b() + kVar.v();
        do {
            ((s9.l0) sVar).add(Long.valueOf(kVar.n()));
        } while (kVar.b() < b10);
        Q(b10);
    }

    public void C(z zVar) {
        int u10;
        l lVar = (l) this.f1656e;
        int i5 = this.f1653b & 7;
        if (i5 == 2) {
            int v5 = lVar.v();
            if ((v5 & 3) != 0) {
                throw new c0("Failed to parse the message.");
            }
            int b10 = lVar.b() + v5;
            do {
                ((v0) zVar).add(Integer.valueOf(lVar.o()));
            } while (lVar.b() < b10);
            return;
        }
        if (i5 != 5) {
            throw c0.b();
        }
        do {
            ((v0) zVar).add(Integer.valueOf(lVar.o()));
            if (lVar.c()) {
                return;
            } else {
                u10 = lVar.u();
            }
        } while (u10 == this.f1653b);
        this.f1655d = u10;
    }

    public void D(s9.s sVar) {
        int u10;
        s9.k kVar = (s9.k) this.f1656e;
        int i5 = this.f1653b & 7;
        if (i5 == 2) {
            int v5 = kVar.v();
            if ((v5 & 3) != 0) {
                throw new s9.v("Failed to parse the message.");
            }
            int b10 = kVar.b() + v5;
            do {
                ((s9.l0) sVar).add(Integer.valueOf(kVar.o()));
            } while (kVar.b() < b10);
            return;
        }
        if (i5 != 5) {
            throw s9.v.b();
        }
        do {
            ((s9.l0) sVar).add(Integer.valueOf(kVar.o()));
            if (kVar.c()) {
                return;
            } else {
                u10 = kVar.u();
            }
        } while (u10 == this.f1653b);
        this.f1655d = u10;
    }

    public void E(z zVar) {
        int u10;
        l lVar = (l) this.f1656e;
        int i5 = this.f1653b & 7;
        if (i5 == 1) {
            do {
                ((v0) zVar).add(Long.valueOf(lVar.p()));
                if (lVar.c()) {
                    return;
                } else {
                    u10 = lVar.u();
                }
            } while (u10 == this.f1653b);
            this.f1655d = u10;
            return;
        }
        if (i5 != 2) {
            throw c0.b();
        }
        int v5 = lVar.v();
        if ((v5 & 7) != 0) {
            throw new c0("Failed to parse the message.");
        }
        int b10 = lVar.b() + v5;
        do {
            ((v0) zVar).add(Long.valueOf(lVar.p()));
        } while (lVar.b() < b10);
    }

    public void F(s9.s sVar) {
        int u10;
        s9.k kVar = (s9.k) this.f1656e;
        int i5 = this.f1653b & 7;
        if (i5 == 1) {
            do {
                ((s9.l0) sVar).add(Long.valueOf(kVar.p()));
                if (kVar.c()) {
                    return;
                } else {
                    u10 = kVar.u();
                }
            } while (u10 == this.f1653b);
            this.f1655d = u10;
            return;
        }
        if (i5 != 2) {
            throw s9.v.b();
        }
        int v5 = kVar.v();
        if ((v5 & 7) != 0) {
            throw new s9.v("Failed to parse the message.");
        }
        int b10 = kVar.b() + v5;
        do {
            ((s9.l0) sVar).add(Long.valueOf(kVar.p()));
        } while (kVar.b() < b10);
    }

    public void G(z zVar) {
        int u10;
        l lVar = (l) this.f1656e;
        int i5 = this.f1653b & 7;
        if (i5 == 0) {
            do {
                ((v0) zVar).add(Integer.valueOf(lVar.q()));
                if (lVar.c()) {
                    return;
                } else {
                    u10 = lVar.u();
                }
            } while (u10 == this.f1653b);
            this.f1655d = u10;
            return;
        }
        if (i5 != 2) {
            throw c0.b();
        }
        int b10 = lVar.b() + lVar.v();
        do {
            ((v0) zVar).add(Integer.valueOf(lVar.q()));
        } while (lVar.b() < b10);
        Q(b10);
    }

    public void H(s9.s sVar) {
        int u10;
        s9.k kVar = (s9.k) this.f1656e;
        int i5 = this.f1653b & 7;
        if (i5 == 0) {
            do {
                ((s9.l0) sVar).add(Integer.valueOf(kVar.q()));
                if (kVar.c()) {
                    return;
                } else {
                    u10 = kVar.u();
                }
            } while (u10 == this.f1653b);
            this.f1655d = u10;
            return;
        }
        if (i5 != 2) {
            throw s9.v.b();
        }
        int b10 = kVar.b() + kVar.v();
        do {
            ((s9.l0) sVar).add(Integer.valueOf(kVar.q()));
        } while (kVar.b() < b10);
        Q(b10);
    }

    public void I(z zVar) {
        int u10;
        l lVar = (l) this.f1656e;
        int i5 = this.f1653b & 7;
        if (i5 == 0) {
            do {
                ((v0) zVar).add(Long.valueOf(lVar.r()));
                if (lVar.c()) {
                    return;
                } else {
                    u10 = lVar.u();
                }
            } while (u10 == this.f1653b);
            this.f1655d = u10;
            return;
        }
        if (i5 != 2) {
            throw c0.b();
        }
        int b10 = lVar.b() + lVar.v();
        do {
            ((v0) zVar).add(Long.valueOf(lVar.r()));
        } while (lVar.b() < b10);
        Q(b10);
    }

    public void J(s9.s sVar) {
        int u10;
        s9.k kVar = (s9.k) this.f1656e;
        int i5 = this.f1653b & 7;
        if (i5 == 0) {
            do {
                ((s9.l0) sVar).add(Long.valueOf(kVar.r()));
                if (kVar.c()) {
                    return;
                } else {
                    u10 = kVar.u();
                }
            } while (u10 == this.f1653b);
            this.f1655d = u10;
            return;
        }
        if (i5 != 2) {
            throw s9.v.b();
        }
        int b10 = kVar.b() + kVar.v();
        do {
            ((s9.l0) sVar).add(Long.valueOf(kVar.r()));
        } while (kVar.b() < b10);
        Q(b10);
    }

    public void K(z zVar, boolean z5) {
        String s8;
        int u10;
        l lVar = (l) this.f1656e;
        if ((this.f1653b & 7) != 2) {
            throw c0.b();
        }
        do {
            if (z5) {
                R(2);
                s8 = lVar.t();
            } else {
                R(2);
                s8 = lVar.s();
            }
            ((v0) zVar).add(s8);
            if (lVar.c()) {
                return;
            } else {
                u10 = lVar.u();
            }
        } while (u10 == this.f1653b);
        this.f1655d = u10;
    }

    public void L(s9.s sVar, boolean z5) {
        String s8;
        int u10;
        s9.k kVar = (s9.k) this.f1656e;
        if ((this.f1653b & 7) != 2) {
            throw s9.v.b();
        }
        do {
            if (z5) {
                R(2);
                s8 = kVar.t();
            } else {
                R(2);
                s8 = kVar.s();
            }
            ((s9.l0) sVar).add(s8);
            if (kVar.c()) {
                return;
            } else {
                u10 = kVar.u();
            }
        } while (u10 == this.f1653b);
        this.f1655d = u10;
    }

    public void M(z zVar) {
        int u10;
        l lVar = (l) this.f1656e;
        int i5 = this.f1653b & 7;
        if (i5 == 0) {
            do {
                ((v0) zVar).add(Integer.valueOf(lVar.v()));
                if (lVar.c()) {
                    return;
                } else {
                    u10 = lVar.u();
                }
            } while (u10 == this.f1653b);
            this.f1655d = u10;
            return;
        }
        if (i5 != 2) {
            throw c0.b();
        }
        int b10 = lVar.b() + lVar.v();
        do {
            ((v0) zVar).add(Integer.valueOf(lVar.v()));
        } while (lVar.b() < b10);
        Q(b10);
    }

    public void N(s9.s sVar) {
        int u10;
        s9.k kVar = (s9.k) this.f1656e;
        int i5 = this.f1653b & 7;
        if (i5 == 0) {
            do {
                ((s9.l0) sVar).add(Integer.valueOf(kVar.v()));
                if (kVar.c()) {
                    return;
                } else {
                    u10 = kVar.u();
                }
            } while (u10 == this.f1653b);
            this.f1655d = u10;
            return;
        }
        if (i5 != 2) {
            throw s9.v.b();
        }
        int b10 = kVar.b() + kVar.v();
        do {
            ((s9.l0) sVar).add(Integer.valueOf(kVar.v()));
        } while (kVar.b() < b10);
        Q(b10);
    }

    public void O(z zVar) {
        int u10;
        l lVar = (l) this.f1656e;
        int i5 = this.f1653b & 7;
        if (i5 == 0) {
            do {
                ((v0) zVar).add(Long.valueOf(lVar.w()));
                if (lVar.c()) {
                    return;
                } else {
                    u10 = lVar.u();
                }
            } while (u10 == this.f1653b);
            this.f1655d = u10;
            return;
        }
        if (i5 != 2) {
            throw c0.b();
        }
        int b10 = lVar.b() + lVar.v();
        do {
            ((v0) zVar).add(Long.valueOf(lVar.w()));
        } while (lVar.b() < b10);
        Q(b10);
    }

    public void P(s9.s sVar) {
        int u10;
        s9.k kVar = (s9.k) this.f1656e;
        int i5 = this.f1653b & 7;
        if (i5 == 0) {
            do {
                ((s9.l0) sVar).add(Long.valueOf(kVar.w()));
                if (kVar.c()) {
                    return;
                } else {
                    u10 = kVar.u();
                }
            } while (u10 == this.f1653b);
            this.f1655d = u10;
            return;
        }
        if (i5 != 2) {
            throw s9.v.b();
        }
        int b10 = kVar.b() + kVar.v();
        do {
            ((s9.l0) sVar).add(Long.valueOf(kVar.w()));
        } while (kVar.b() < b10);
        Q(b10);
    }

    public final void Q(int i5) {
        switch (this.f1652a) {
            case 0:
                if (((l) this.f1656e).b() != i5) {
                    throw c0.e();
                }
                return;
            default:
                if (((s9.k) this.f1656e).b() != i5) {
                    throw s9.v.e();
                }
                return;
        }
    }

    public final void R(int i5) {
        switch (this.f1652a) {
            case 0:
                if ((this.f1653b & 7) != i5) {
                    throw c0.b();
                }
                return;
            default:
                if ((this.f1653b & 7) != i5) {
                    throw s9.v.b();
                }
                return;
        }
    }

    public final boolean S() {
        int i5;
        int i10;
        switch (this.f1652a) {
            case 0:
                l lVar = (l) this.f1656e;
                if (lVar.c() || (i5 = this.f1653b) == this.f1654c) {
                    return false;
                }
                return lVar.x(i5);
            default:
                s9.k kVar = (s9.k) this.f1656e;
                if (kVar.c() || (i10 = this.f1653b) == this.f1654c) {
                    return false;
                }
                return kVar.x(i10);
        }
    }

    public final int a() {
        switch (this.f1652a) {
            case 0:
                int i5 = this.f1655d;
                if (i5 != 0) {
                    this.f1653b = i5;
                    this.f1655d = 0;
                } else {
                    this.f1653b = ((l) this.f1656e).u();
                }
                int i10 = this.f1653b;
                if (i10 == 0 || i10 == this.f1654c) {
                    return Integer.MAX_VALUE;
                }
                return i10 >>> 3;
            default:
                int i11 = this.f1655d;
                if (i11 != 0) {
                    this.f1653b = i11;
                    this.f1655d = 0;
                } else {
                    this.f1653b = ((s9.k) this.f1656e).u();
                }
                int i12 = this.f1653b;
                if (i12 == 0 || i12 == this.f1654c) {
                    return Integer.MAX_VALUE;
                }
                return i12 >>> 3;
        }
    }

    public void b(s9.a aVar, s9.n0 n0Var, s9.m mVar) {
        R(3);
        d(aVar, n0Var, mVar);
    }

    public void c(Object obj, x0 x0Var, q qVar) {
        int i5 = this.f1654c;
        this.f1654c = ((this.f1653b >>> 3) << 3) | 4;
        try {
            x0Var.i(obj, this, qVar);
            if (this.f1653b == this.f1654c) {
            } else {
                throw new c0("Failed to parse the message.");
            }
        } finally {
            this.f1654c = i5;
        }
    }

    public void d(Object obj, s9.n0 n0Var, s9.m mVar) {
        int i5 = this.f1654c;
        this.f1654c = ((this.f1653b >>> 3) << 3) | 4;
        try {
            n0Var.f(obj, this, mVar);
            if (this.f1653b == this.f1654c) {
            } else {
                throw new s9.v("Failed to parse the message.");
            }
        } finally {
            this.f1654c = i5;
        }
    }

    public void e(Object obj, x0 x0Var, q qVar) {
        l lVar = (l) this.f1656e;
        int v5 = lVar.v();
        if (lVar.f1649a >= 100) {
            throw new c0("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int e7 = lVar.e(v5);
        lVar.f1649a++;
        x0Var.i(obj, this, qVar);
        lVar.a(0);
        lVar.f1649a--;
        lVar.d(e7);
    }

    public void f(Object obj, s9.n0 n0Var, s9.m mVar) {
        s9.k kVar = (s9.k) this.f1656e;
        int v5 = kVar.v();
        if (kVar.f23343a + kVar.f23344b >= 100) {
            throw new s9.v("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int e7 = kVar.e(v5);
        kVar.f23343a++;
        n0Var.f(obj, this, mVar);
        kVar.a(0);
        kVar.f23343a--;
        kVar.d(e7);
    }

    public void g(z zVar) {
        int u10;
        l lVar = (l) this.f1656e;
        int i5 = this.f1653b & 7;
        if (i5 == 0) {
            do {
                ((v0) zVar).add(Boolean.valueOf(lVar.f()));
                if (lVar.c()) {
                    return;
                } else {
                    u10 = lVar.u();
                }
            } while (u10 == this.f1653b);
            this.f1655d = u10;
            return;
        }
        if (i5 != 2) {
            throw c0.b();
        }
        int b10 = lVar.b() + lVar.v();
        do {
            ((v0) zVar).add(Boolean.valueOf(lVar.f()));
        } while (lVar.b() < b10);
        Q(b10);
    }

    public void h(s9.s sVar) {
        int u10;
        s9.k kVar = (s9.k) this.f1656e;
        int i5 = this.f1653b & 7;
        if (i5 == 0) {
            do {
                ((s9.l0) sVar).add(Boolean.valueOf(kVar.f()));
                if (kVar.c()) {
                    return;
                } else {
                    u10 = kVar.u();
                }
            } while (u10 == this.f1653b);
            this.f1655d = u10;
            return;
        }
        if (i5 != 2) {
            throw s9.v.b();
        }
        int b10 = kVar.b() + kVar.v();
        do {
            ((s9.l0) sVar).add(Boolean.valueOf(kVar.f()));
        } while (kVar.b() < b10);
        Q(b10);
    }

    public i i() {
        R(2);
        return ((l) this.f1656e).g();
    }

    public s9.h j() {
        R(2);
        return ((s9.k) this.f1656e).g();
    }

    public void k(z zVar) {
        int u10;
        l lVar = (l) this.f1656e;
        if ((this.f1653b & 7) != 2) {
            throw c0.b();
        }
        do {
            ((v0) zVar).add(i());
            if (lVar.c()) {
                return;
            } else {
                u10 = lVar.u();
            }
        } while (u10 == this.f1653b);
        this.f1655d = u10;
    }

    public void l(s9.s sVar) {
        int u10;
        s9.k kVar = (s9.k) this.f1656e;
        if ((this.f1653b & 7) != 2) {
            throw s9.v.b();
        }
        do {
            ((s9.l0) sVar).add(j());
            if (kVar.c()) {
                return;
            } else {
                u10 = kVar.u();
            }
        } while (u10 == this.f1653b);
        this.f1655d = u10;
    }

    public void m(z zVar) {
        int u10;
        l lVar = (l) this.f1656e;
        int i5 = this.f1653b & 7;
        if (i5 == 1) {
            do {
                ((v0) zVar).add(Double.valueOf(lVar.h()));
                if (lVar.c()) {
                    return;
                } else {
                    u10 = lVar.u();
                }
            } while (u10 == this.f1653b);
            this.f1655d = u10;
            return;
        }
        if (i5 != 2) {
            throw c0.b();
        }
        int v5 = lVar.v();
        if ((v5 & 7) != 0) {
            throw new c0("Failed to parse the message.");
        }
        int b10 = lVar.b() + v5;
        do {
            ((v0) zVar).add(Double.valueOf(lVar.h()));
        } while (lVar.b() < b10);
    }

    public void n(s9.s sVar) {
        int u10;
        s9.k kVar = (s9.k) this.f1656e;
        int i5 = this.f1653b & 7;
        if (i5 == 1) {
            do {
                ((s9.l0) sVar).add(Double.valueOf(kVar.h()));
                if (kVar.c()) {
                    return;
                } else {
                    u10 = kVar.u();
                }
            } while (u10 == this.f1653b);
            this.f1655d = u10;
            return;
        }
        if (i5 != 2) {
            throw s9.v.b();
        }
        int v5 = kVar.v();
        if ((v5 & 7) != 0) {
            throw new s9.v("Failed to parse the message.");
        }
        int b10 = kVar.b() + v5;
        do {
            ((s9.l0) sVar).add(Double.valueOf(kVar.h()));
        } while (kVar.b() < b10);
    }

    public void o(z zVar) {
        int u10;
        l lVar = (l) this.f1656e;
        int i5 = this.f1653b & 7;
        if (i5 == 0) {
            do {
                ((v0) zVar).add(Integer.valueOf(lVar.i()));
                if (lVar.c()) {
                    return;
                } else {
                    u10 = lVar.u();
                }
            } while (u10 == this.f1653b);
            this.f1655d = u10;
            return;
        }
        if (i5 != 2) {
            throw c0.b();
        }
        int b10 = lVar.b() + lVar.v();
        do {
            ((v0) zVar).add(Integer.valueOf(lVar.i()));
        } while (lVar.b() < b10);
        Q(b10);
    }

    public void p(s9.s sVar) {
        int u10;
        s9.k kVar = (s9.k) this.f1656e;
        int i5 = this.f1653b & 7;
        if (i5 == 0) {
            do {
                ((s9.l0) sVar).add(Integer.valueOf(kVar.i()));
                if (kVar.c()) {
                    return;
                } else {
                    u10 = kVar.u();
                }
            } while (u10 == this.f1653b);
            this.f1655d = u10;
            return;
        }
        if (i5 != 2) {
            throw s9.v.b();
        }
        int b10 = kVar.b() + kVar.v();
        do {
            ((s9.l0) sVar).add(Integer.valueOf(kVar.i()));
        } while (kVar.b() < b10);
        Q(b10);
    }

    public Object q(s1 s1Var, Class cls, q qVar) {
        l lVar = (l) this.f1656e;
        switch (s1Var.ordinal()) {
            case 0:
                R(1);
                return Double.valueOf(lVar.h());
            case 1:
                R(5);
                return Float.valueOf(lVar.l());
            case 2:
                R(0);
                return Long.valueOf(lVar.n());
            case 3:
                R(0);
                return Long.valueOf(lVar.w());
            case 4:
                R(0);
                return Integer.valueOf(lVar.m());
            case 5:
                R(1);
                return Long.valueOf(lVar.k());
            case 6:
                R(5);
                return Integer.valueOf(lVar.j());
            case 7:
                R(0);
                return Boolean.valueOf(lVar.f());
            case 8:
                R(2);
                return lVar.t();
            case 9:
            default:
                throw new IllegalArgumentException("unsupported field type.");
            case 10:
                R(2);
                x0 a7 = u0.f1715c.a(cls);
                y d10 = a7.d();
                e(d10, a7, qVar);
                a7.b(d10);
                return d10;
            case 11:
                return i();
            case 12:
                R(0);
                return Integer.valueOf(lVar.v());
            case 13:
                R(0);
                return Integer.valueOf(lVar.i());
            case 14:
                R(5);
                return Integer.valueOf(lVar.o());
            case 15:
                R(1);
                return Long.valueOf(lVar.p());
            case 16:
                R(0);
                return Integer.valueOf(lVar.q());
            case 17:
                R(0);
                return Long.valueOf(lVar.r());
        }
    }

    public Object r(s9.d1 d1Var, Class cls, s9.m mVar) {
        s9.k kVar = (s9.k) this.f1656e;
        switch (d1Var.ordinal()) {
            case 0:
                R(1);
                return Double.valueOf(kVar.h());
            case 1:
                R(5);
                return Float.valueOf(kVar.l());
            case 2:
                R(0);
                return Long.valueOf(kVar.n());
            case 3:
                R(0);
                return Long.valueOf(kVar.w());
            case 4:
                R(0);
                return Integer.valueOf(kVar.m());
            case 5:
                R(1);
                return Long.valueOf(kVar.k());
            case 6:
                R(5);
                return Integer.valueOf(kVar.j());
            case 7:
                R(0);
                return Boolean.valueOf(kVar.f());
            case 8:
                R(2);
                return kVar.t();
            case 9:
            default:
                throw new IllegalArgumentException("unsupported field type.");
            case 10:
                R(2);
                s9.n0 a7 = s9.k0.f23346c.a(cls);
                s9.r d10 = a7.d();
                f(d10, a7, mVar);
                a7.b(d10);
                return d10;
            case 11:
                return j();
            case 12:
                R(0);
                return Integer.valueOf(kVar.v());
            case 13:
                R(0);
                return Integer.valueOf(kVar.i());
            case 14:
                R(5);
                return Integer.valueOf(kVar.o());
            case 15:
                R(1);
                return Long.valueOf(kVar.p());
            case 16:
                R(0);
                return Integer.valueOf(kVar.q());
            case 17:
                R(0);
                return Long.valueOf(kVar.r());
        }
    }

    public void s(z zVar) {
        int u10;
        l lVar = (l) this.f1656e;
        int i5 = this.f1653b & 7;
        if (i5 == 2) {
            int v5 = lVar.v();
            if ((v5 & 3) != 0) {
                throw new c0("Failed to parse the message.");
            }
            int b10 = lVar.b() + v5;
            do {
                ((v0) zVar).add(Integer.valueOf(lVar.j()));
            } while (lVar.b() < b10);
            return;
        }
        if (i5 != 5) {
            throw c0.b();
        }
        do {
            ((v0) zVar).add(Integer.valueOf(lVar.j()));
            if (lVar.c()) {
                return;
            } else {
                u10 = lVar.u();
            }
        } while (u10 == this.f1653b);
        this.f1655d = u10;
    }

    public void t(s9.s sVar) {
        int u10;
        s9.k kVar = (s9.k) this.f1656e;
        int i5 = this.f1653b & 7;
        if (i5 == 2) {
            int v5 = kVar.v();
            if ((v5 & 3) != 0) {
                throw new s9.v("Failed to parse the message.");
            }
            int b10 = kVar.b() + v5;
            do {
                ((s9.l0) sVar).add(Integer.valueOf(kVar.j()));
            } while (kVar.b() < b10);
            return;
        }
        if (i5 != 5) {
            throw s9.v.b();
        }
        do {
            ((s9.l0) sVar).add(Integer.valueOf(kVar.j()));
            if (kVar.c()) {
                return;
            } else {
                u10 = kVar.u();
            }
        } while (u10 == this.f1653b);
        this.f1655d = u10;
    }

    public void u(z zVar) {
        int u10;
        l lVar = (l) this.f1656e;
        int i5 = this.f1653b & 7;
        if (i5 == 1) {
            do {
                ((v0) zVar).add(Long.valueOf(lVar.k()));
                if (lVar.c()) {
                    return;
                } else {
                    u10 = lVar.u();
                }
            } while (u10 == this.f1653b);
            this.f1655d = u10;
            return;
        }
        if (i5 != 2) {
            throw c0.b();
        }
        int v5 = lVar.v();
        if ((v5 & 7) != 0) {
            throw new c0("Failed to parse the message.");
        }
        int b10 = lVar.b() + v5;
        do {
            ((v0) zVar).add(Long.valueOf(lVar.k()));
        } while (lVar.b() < b10);
    }

    public void v(s9.s sVar) {
        int u10;
        s9.k kVar = (s9.k) this.f1656e;
        int i5 = this.f1653b & 7;
        if (i5 == 1) {
            do {
                ((s9.l0) sVar).add(Long.valueOf(kVar.k()));
                if (kVar.c()) {
                    return;
                } else {
                    u10 = kVar.u();
                }
            } while (u10 == this.f1653b);
            this.f1655d = u10;
            return;
        }
        if (i5 != 2) {
            throw s9.v.b();
        }
        int v5 = kVar.v();
        if ((v5 & 7) != 0) {
            throw new s9.v("Failed to parse the message.");
        }
        int b10 = kVar.b() + v5;
        do {
            ((s9.l0) sVar).add(Long.valueOf(kVar.k()));
        } while (kVar.b() < b10);
    }

    public void w(z zVar) {
        int u10;
        l lVar = (l) this.f1656e;
        int i5 = this.f1653b & 7;
        if (i5 == 2) {
            int v5 = lVar.v();
            if ((v5 & 3) != 0) {
                throw new c0("Failed to parse the message.");
            }
            int b10 = lVar.b() + v5;
            do {
                ((v0) zVar).add(Float.valueOf(lVar.l()));
            } while (lVar.b() < b10);
            return;
        }
        if (i5 != 5) {
            throw c0.b();
        }
        do {
            ((v0) zVar).add(Float.valueOf(lVar.l()));
            if (lVar.c()) {
                return;
            } else {
                u10 = lVar.u();
            }
        } while (u10 == this.f1653b);
        this.f1655d = u10;
    }

    public void x(s9.s sVar) {
        int u10;
        s9.k kVar = (s9.k) this.f1656e;
        int i5 = this.f1653b & 7;
        if (i5 == 2) {
            int v5 = kVar.v();
            if ((v5 & 3) != 0) {
                throw new s9.v("Failed to parse the message.");
            }
            int b10 = kVar.b() + v5;
            do {
                ((s9.l0) sVar).add(Float.valueOf(kVar.l()));
            } while (kVar.b() < b10);
            return;
        }
        if (i5 != 5) {
            throw s9.v.b();
        }
        do {
            ((s9.l0) sVar).add(Float.valueOf(kVar.l()));
            if (kVar.c()) {
                return;
            } else {
                u10 = kVar.u();
            }
        } while (u10 == this.f1653b);
        this.f1655d = u10;
    }

    public void y(z zVar) {
        int u10;
        l lVar = (l) this.f1656e;
        int i5 = this.f1653b & 7;
        if (i5 == 0) {
            do {
                ((v0) zVar).add(Integer.valueOf(lVar.m()));
                if (lVar.c()) {
                    return;
                } else {
                    u10 = lVar.u();
                }
            } while (u10 == this.f1653b);
            this.f1655d = u10;
            return;
        }
        if (i5 != 2) {
            throw c0.b();
        }
        int b10 = lVar.b() + lVar.v();
        do {
            ((v0) zVar).add(Integer.valueOf(lVar.m()));
        } while (lVar.b() < b10);
        Q(b10);
    }

    public void z(s9.s sVar) {
        int u10;
        s9.k kVar = (s9.k) this.f1656e;
        int i5 = this.f1653b & 7;
        if (i5 == 0) {
            do {
                ((s9.l0) sVar).add(Integer.valueOf(kVar.m()));
                if (kVar.c()) {
                    return;
                } else {
                    u10 = kVar.u();
                }
            } while (u10 == this.f1653b);
            this.f1655d = u10;
            return;
        }
        if (i5 != 2) {
            throw s9.v.b();
        }
        int b10 = kVar.b() + kVar.v();
        do {
            ((s9.l0) sVar).add(Integer.valueOf(kVar.m()));
        } while (kVar.b() < b10);
        Q(b10);
    }

    public m(s9.k kVar) {
        Charset charset = s9.t.f23375a;
        this.f1656e = kVar;
        kVar.f23345c = this;
    }
}
