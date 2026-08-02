package com.fyber.inneractive.sdk.protobuf;

import java.nio.charset.Charset;
import java.util.List;

/* loaded from: classes12.dex */
public final class x implements s2 {
    public final w a;
    public int b;
    public int c;
    public int d = 0;

    public x(w wVar) {
        Charset charset = l1.a;
        if (wVar == null) {
            throw new NullPointerException("input");
        }
        this.a = wVar;
        wVar.d = this;
    }

    public static void c(int i) {
        if ((i & 3) != 0) {
            throw new n1("Failed to parse the message.");
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final Object a(Class cls, h0 h0Var) {
        b(3);
        return c(p2.c.a(cls), h0Var);
    }

    public final void b(int i) {
        if ((this.b & 7) == i) {
            return;
        }
        int i2 = n1.a;
        throw new m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final int d() {
        b(0);
        return this.a.k();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final int e() {
        return this.b;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final long f() {
        b(0);
        return this.a.v();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final long g() {
        b(1);
        return this.a.i();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final double h() {
        b(1);
        return this.a.f();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final boolean i() {
        int i;
        if (this.a.c() || (i = this.b) == this.c) {
            return false;
        }
        return this.a.e(i);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final int j() {
        b(0);
        return this.a.p();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final float k() {
        b(5);
        return this.a.j();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final long l() {
        b(0);
        return this.a.q();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final int m() {
        b(5);
        return this.a.n();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final String n() {
        b(2);
        return this.a.r();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final long o() {
        b(0);
        return this.a.l();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final String p() {
        b(2);
        return this.a.s();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final int q() {
        b(5);
        return this.a.h();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final boolean r() {
        b(0);
        return this.a.d();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final int s() {
        int i = this.d;
        if (i != 0) {
            this.b = i;
            this.d = 0;
        } else {
            this.b = this.a.t();
        }
        int i2 = this.b;
        if (i2 == 0 || i2 == this.c) {
            return Integer.MAX_VALUE;
        }
        return i2 >>> 3;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final long t() {
        b(1);
        return this.a.o();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void e(List list) {
        int t;
        int t2;
        if (!(list instanceof a1)) {
            int i = this.b & 7;
            if (i == 2) {
                int u = this.a.u();
                c(u);
                int b = this.a.b() + u;
                do {
                    list.add(Integer.valueOf(this.a.h()));
                } while (this.a.b() < b);
                return;
            }
            if (i != 5) {
                int i2 = n1.a;
                throw new m1();
            }
            do {
                list.add(Integer.valueOf(this.a.h()));
                if (this.a.c()) {
                    return;
                } else {
                    t = this.a.t();
                }
            } while (t == this.b);
            this.d = t;
            return;
        }
        a1 a1Var = (a1) list;
        int i3 = this.b & 7;
        if (i3 == 2) {
            int u2 = this.a.u();
            c(u2);
            int b2 = this.a.b() + u2;
            do {
                a1Var.c(this.a.h());
            } while (this.a.b() < b2);
            return;
        }
        if (i3 != 5) {
            int i4 = n1.a;
            throw new m1();
        }
        do {
            a1Var.c(this.a.h());
            if (this.a.c()) {
                return;
            } else {
                t2 = this.a.t();
            }
        } while (t2 == this.b);
        this.d = t2;
    }

    public static void d(int i) {
        if ((i & 7) != 0) {
            throw new n1("Failed to parse the message.");
        }
    }

    public final Object c(t2 t2Var, h0 h0Var) {
        int i = this.c;
        this.c = ((this.b >>> 3) << 3) | 4;
        try {
            Object a = t2Var.a();
            t2Var.a(a, this, h0Var);
            t2Var.c(a);
            if (this.b == this.c) {
                return a;
            }
            throw new n1("Failed to parse the message.");
        } finally {
            this.c = i;
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void f(List list) {
        int t;
        int t2;
        if (list instanceof a1) {
            a1 a1Var = (a1) list;
            int i = this.b & 7;
            if (i == 2) {
                int u = this.a.u();
                c(u);
                int b = this.a.b() + u;
                do {
                    a1Var.c(this.a.n());
                } while (this.a.b() < b);
                return;
            }
            if (i == 5) {
                do {
                    a1Var.c(this.a.n());
                    if (this.a.c()) {
                        return;
                    } else {
                        t2 = this.a.t();
                    }
                } while (t2 == this.b);
                this.d = t2;
                return;
            }
            int i2 = n1.a;
            throw new m1();
        }
        int i3 = this.b & 7;
        if (i3 == 2) {
            int u2 = this.a.u();
            c(u2);
            int b2 = this.a.b() + u2;
            do {
                list.add(Integer.valueOf(this.a.n()));
            } while (this.a.b() < b2);
            return;
        }
        if (i3 == 5) {
            do {
                list.add(Integer.valueOf(this.a.n()));
                if (this.a.c()) {
                    return;
                } else {
                    t = this.a.t();
                }
            } while (t == this.b);
            this.d = t;
            return;
        }
        int i4 = n1.a;
        throw new m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void g(List list) {
        int t;
        int t2;
        if (list instanceof u1) {
            u1 u1Var = (u1) list;
            int i = this.b & 7;
            if (i == 0) {
                do {
                    u1Var.a(this.a.q());
                    if (this.a.c()) {
                        return;
                    } else {
                        t2 = this.a.t();
                    }
                } while (t2 == this.b);
                this.d = t2;
                return;
            }
            if (i == 2) {
                int b = this.a.b() + this.a.u();
                do {
                    u1Var.a(this.a.q());
                } while (this.a.b() < b);
                a(b);
                return;
            }
            int i2 = n1.a;
            throw new m1();
        }
        int i3 = this.b & 7;
        if (i3 == 0) {
            do {
                list.add(Long.valueOf(this.a.q()));
                if (this.a.c()) {
                    return;
                } else {
                    t = this.a.t();
                }
            } while (t == this.b);
            this.d = t;
            return;
        }
        if (i3 == 2) {
            int b2 = this.a.b() + this.a.u();
            do {
                list.add(Long.valueOf(this.a.q()));
            } while (this.a.b() < b2);
            a(b2);
            return;
        }
        int i4 = n1.a;
        throw new m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void h(List list) {
        int t;
        if ((this.b & 7) == 2) {
            do {
                b(2);
                list.add(this.a.e());
                if (this.a.c()) {
                    return;
                } else {
                    t = this.a.t();
                }
            } while (t == this.b);
            this.d = t;
            return;
        }
        int i = n1.a;
        throw new m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void i(List list) {
        int t;
        int t2;
        if (list instanceof a1) {
            a1 a1Var = (a1) list;
            int i = this.b & 7;
            if (i == 0) {
                do {
                    a1Var.c(this.a.u());
                    if (this.a.c()) {
                        return;
                    } else {
                        t2 = this.a.t();
                    }
                } while (t2 == this.b);
                this.d = t2;
                return;
            }
            if (i == 2) {
                int b = this.a.b() + this.a.u();
                do {
                    a1Var.c(this.a.u());
                } while (this.a.b() < b);
                a(b);
                return;
            }
            int i2 = n1.a;
            throw new m1();
        }
        int i3 = this.b & 7;
        if (i3 == 0) {
            do {
                list.add(Integer.valueOf(this.a.u()));
                if (this.a.c()) {
                    return;
                } else {
                    t = this.a.t();
                }
            } while (t == this.b);
            this.d = t;
            return;
        }
        if (i3 == 2) {
            int b2 = this.a.b() + this.a.u();
            do {
                list.add(Integer.valueOf(this.a.u()));
            } while (this.a.b() < b2);
            a(b2);
            return;
        }
        int i4 = n1.a;
        throw new m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void j(List list) {
        int t;
        int t2;
        if (list instanceof d0) {
            d0 d0Var = (d0) list;
            int i = this.b & 7;
            if (i == 1) {
                do {
                    d0Var.a(this.a.f());
                    if (this.a.c()) {
                        return;
                    } else {
                        t2 = this.a.t();
                    }
                } while (t2 == this.b);
                this.d = t2;
                return;
            }
            if (i == 2) {
                int u = this.a.u();
                d(u);
                int b = this.a.b() + u;
                do {
                    d0Var.a(this.a.f());
                } while (this.a.b() < b);
                return;
            }
            int i2 = n1.a;
            throw new m1();
        }
        int i3 = this.b & 7;
        if (i3 == 1) {
            do {
                list.add(Double.valueOf(this.a.f()));
                if (this.a.c()) {
                    return;
                } else {
                    t = this.a.t();
                }
            } while (t == this.b);
            this.d = t;
            return;
        }
        if (i3 == 2) {
            int u2 = this.a.u();
            d(u2);
            int b2 = this.a.b() + u2;
            do {
                list.add(Double.valueOf(this.a.f()));
            } while (this.a.b() < b2);
            return;
        }
        int i4 = n1.a;
        throw new m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void k(List list) {
        int t;
        int t2;
        if (list instanceof u1) {
            u1 u1Var = (u1) list;
            int i = this.b & 7;
            if (i == 0) {
                do {
                    u1Var.a(this.a.l());
                    if (this.a.c()) {
                        return;
                    } else {
                        t2 = this.a.t();
                    }
                } while (t2 == this.b);
                this.d = t2;
                return;
            }
            if (i == 2) {
                int b = this.a.b() + this.a.u();
                do {
                    u1Var.a(this.a.l());
                } while (this.a.b() < b);
                a(b);
                return;
            }
            int i2 = n1.a;
            throw new m1();
        }
        int i3 = this.b & 7;
        if (i3 == 0) {
            do {
                list.add(Long.valueOf(this.a.l()));
                if (this.a.c()) {
                    return;
                } else {
                    t = this.a.t();
                }
            } while (t == this.b);
            this.d = t;
            return;
        }
        if (i3 == 2) {
            int b2 = this.a.b() + this.a.u();
            do {
                list.add(Long.valueOf(this.a.l()));
            } while (this.a.b() < b2);
            a(b2);
            return;
        }
        int i4 = n1.a;
        throw new m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void l(List list) {
        int t;
        int t2;
        if (list instanceof j) {
            j jVar = (j) list;
            int i = this.b & 7;
            if (i == 0) {
                do {
                    jVar.a(this.a.d());
                    if (this.a.c()) {
                        return;
                    } else {
                        t2 = this.a.t();
                    }
                } while (t2 == this.b);
                this.d = t2;
                return;
            }
            if (i == 2) {
                int b = this.a.b() + this.a.u();
                do {
                    jVar.a(this.a.d());
                } while (this.a.b() < b);
                a(b);
                return;
            }
            int i2 = n1.a;
            throw new m1();
        }
        int i3 = this.b & 7;
        if (i3 == 0) {
            do {
                list.add(Boolean.valueOf(this.a.d()));
                if (this.a.c()) {
                    return;
                } else {
                    t = this.a.t();
                }
            } while (t == this.b);
            this.d = t;
            return;
        }
        if (i3 == 2) {
            int b2 = this.a.b() + this.a.u();
            do {
                list.add(Boolean.valueOf(this.a.d()));
            } while (this.a.b() < b2);
            a(b2);
            return;
        }
        int i4 = n1.a;
        throw new m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void m(List list) {
        int t;
        int t2;
        if (list instanceof u1) {
            u1 u1Var = (u1) list;
            int i = this.b & 7;
            if (i == 1) {
                do {
                    u1Var.a(this.a.o());
                    if (this.a.c()) {
                        return;
                    } else {
                        t2 = this.a.t();
                    }
                } while (t2 == this.b);
                this.d = t2;
                return;
            }
            if (i == 2) {
                int u = this.a.u();
                d(u);
                int b = this.a.b() + u;
                do {
                    u1Var.a(this.a.o());
                } while (this.a.b() < b);
                return;
            }
            int i2 = n1.a;
            throw new m1();
        }
        int i3 = this.b & 7;
        if (i3 == 1) {
            do {
                list.add(Long.valueOf(this.a.o()));
                if (this.a.c()) {
                    return;
                } else {
                    t = this.a.t();
                }
            } while (t == this.b);
            this.d = t;
            return;
        }
        if (i3 == 2) {
            int u2 = this.a.u();
            d(u2);
            int b2 = this.a.b() + u2;
            do {
                list.add(Long.valueOf(this.a.o()));
            } while (this.a.b() < b2);
            return;
        }
        int i4 = n1.a;
        throw new m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void n(List list) {
        int t;
        int t2;
        if (list instanceof u1) {
            u1 u1Var = (u1) list;
            int i = this.b & 7;
            if (i == 1) {
                do {
                    u1Var.a(this.a.i());
                    if (this.a.c()) {
                        return;
                    } else {
                        t2 = this.a.t();
                    }
                } while (t2 == this.b);
                this.d = t2;
                return;
            }
            if (i == 2) {
                int u = this.a.u();
                d(u);
                int b = this.a.b() + u;
                do {
                    u1Var.a(this.a.i());
                } while (this.a.b() < b);
                return;
            }
            int i2 = n1.a;
            throw new m1();
        }
        int i3 = this.b & 7;
        if (i3 == 1) {
            do {
                list.add(Long.valueOf(this.a.i()));
                if (this.a.c()) {
                    return;
                } else {
                    t = this.a.t();
                }
            } while (t == this.b);
            this.d = t;
            return;
        }
        if (i3 == 2) {
            int u2 = this.a.u();
            d(u2);
            int b2 = this.a.b() + u2;
            do {
                list.add(Long.valueOf(this.a.i()));
            } while (this.a.b() < b2);
            return;
        }
        int i4 = n1.a;
        throw new m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void o(List list) {
        int t;
        int t2;
        if (list instanceof a1) {
            a1 a1Var = (a1) list;
            int i = this.b & 7;
            if (i == 0) {
                do {
                    a1Var.c(this.a.k());
                    if (this.a.c()) {
                        return;
                    } else {
                        t2 = this.a.t();
                    }
                } while (t2 == this.b);
                this.d = t2;
                return;
            }
            if (i == 2) {
                int b = this.a.b() + this.a.u();
                do {
                    a1Var.c(this.a.k());
                } while (this.a.b() < b);
                a(b);
                return;
            }
            int i2 = n1.a;
            throw new m1();
        }
        int i3 = this.b & 7;
        if (i3 == 0) {
            do {
                list.add(Integer.valueOf(this.a.k()));
                if (this.a.c()) {
                    return;
                } else {
                    t = this.a.t();
                }
            } while (t == this.b);
            this.d = t;
            return;
        }
        if (i3 == 2) {
            int b2 = this.a.b() + this.a.u();
            do {
                list.add(Integer.valueOf(this.a.k()));
            } while (this.a.b() < b2);
            a(b2);
            return;
        }
        int i4 = n1.a;
        throw new m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void p(List list) {
        int t;
        int t2;
        if (list instanceof a1) {
            a1 a1Var = (a1) list;
            int i = this.b & 7;
            if (i == 0) {
                do {
                    a1Var.c(this.a.g());
                    if (this.a.c()) {
                        return;
                    } else {
                        t2 = this.a.t();
                    }
                } while (t2 == this.b);
                this.d = t2;
                return;
            }
            if (i == 2) {
                int b = this.a.b() + this.a.u();
                do {
                    a1Var.c(this.a.g());
                } while (this.a.b() < b);
                a(b);
                return;
            }
            int i2 = n1.a;
            throw new m1();
        }
        int i3 = this.b & 7;
        if (i3 == 0) {
            do {
                list.add(Integer.valueOf(this.a.g()));
                if (this.a.c()) {
                    return;
                } else {
                    t = this.a.t();
                }
            } while (t == this.b);
            this.d = t;
            return;
        }
        if (i3 == 2) {
            int b2 = this.a.b() + this.a.u();
            do {
                list.add(Integer.valueOf(this.a.g()));
            } while (this.a.b() < b2);
            a(b2);
            return;
        }
        int i4 = n1.a;
        throw new m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void q(List list) {
        a(list, false);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final Object a(t2 t2Var, h0 h0Var) {
        b(3);
        return c(t2Var, h0Var);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final Object b(Class cls, h0 h0Var) {
        b(2);
        return d(p2.c.a(cls), h0Var);
    }

    public final Object d(t2 t2Var, h0 h0Var) {
        int u = this.a.u();
        w wVar = this.a;
        if (wVar.a < wVar.b) {
            int d = wVar.d(u);
            Object a = t2Var.a();
            this.a.a++;
            t2Var.a(a, this, h0Var);
            t2Var.c(a);
            this.a.a(0);
            r5.a--;
            this.a.c(d);
            return a;
        }
        throw new n1("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final s a() {
        b(2);
        return this.a.e();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void a(List list) {
        int t;
        int t2;
        if (list instanceof u1) {
            u1 u1Var = (u1) list;
            int i = this.b & 7;
            if (i == 0) {
                do {
                    u1Var.a(this.a.v());
                    if (this.a.c()) {
                        return;
                    } else {
                        t2 = this.a.t();
                    }
                } while (t2 == this.b);
                this.d = t2;
                return;
            }
            if (i == 2) {
                int b = this.a.b() + this.a.u();
                do {
                    u1Var.a(this.a.v());
                } while (this.a.b() < b);
                a(b);
                return;
            }
            int i2 = n1.a;
            throw new m1();
        }
        int i3 = this.b & 7;
        if (i3 == 0) {
            do {
                list.add(Long.valueOf(this.a.v()));
                if (this.a.c()) {
                    return;
                } else {
                    t = this.a.t();
                }
            } while (t == this.b);
            this.d = t;
            return;
        }
        if (i3 == 2) {
            int b2 = this.a.b() + this.a.u();
            do {
                list.add(Long.valueOf(this.a.v()));
            } while (this.a.b() < b2);
            a(b2);
            return;
        }
        int i4 = n1.a;
        throw new m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final Object b(t2 t2Var, h0 h0Var) {
        b(2);
        return d(t2Var, h0Var);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final int b() {
        b(0);
        return this.a.g();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void b(List list) {
        a(list, true);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void b(List list, t2 t2Var, h0 h0Var) {
        int t;
        int i = this.b;
        if ((i & 7) == 2) {
            do {
                list.add(d(t2Var, h0Var));
                if (this.a.c() || this.d != 0) {
                    return;
                } else {
                    t = this.a.t();
                }
            } while (t == i);
            this.d = t;
            return;
        }
        int i2 = n1.a;
        throw new m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final int c() {
        b(0);
        return this.a.u();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void c(List list) {
        int t;
        int t2;
        if (list instanceof a1) {
            a1 a1Var = (a1) list;
            int i = this.b & 7;
            if (i == 0) {
                do {
                    a1Var.c(this.a.p());
                    if (this.a.c()) {
                        return;
                    } else {
                        t2 = this.a.t();
                    }
                } while (t2 == this.b);
                this.d = t2;
                return;
            }
            if (i == 2) {
                int b = this.a.b() + this.a.u();
                do {
                    a1Var.c(this.a.p());
                } while (this.a.b() < b);
                a(b);
                return;
            }
            int i2 = n1.a;
            throw new m1();
        }
        int i3 = this.b & 7;
        if (i3 == 0) {
            do {
                list.add(Integer.valueOf(this.a.p()));
                if (this.a.c()) {
                    return;
                } else {
                    t = this.a.t();
                }
            } while (t == this.b);
            this.d = t;
            return;
        }
        if (i3 == 2) {
            int b2 = this.a.b() + this.a.u();
            do {
                list.add(Integer.valueOf(this.a.p()));
            } while (this.a.b() < b2);
            a(b2);
            return;
        }
        int i4 = n1.a;
        throw new m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void d(List list) {
        int t;
        int t2;
        if (list instanceof q0) {
            q0 q0Var = (q0) list;
            int i = this.b & 7;
            if (i == 2) {
                int u = this.a.u();
                c(u);
                int b = this.a.b() + u;
                do {
                    q0Var.a(this.a.j());
                } while (this.a.b() < b);
                return;
            }
            if (i == 5) {
                do {
                    q0Var.a(this.a.j());
                    if (this.a.c()) {
                        return;
                    } else {
                        t2 = this.a.t();
                    }
                } while (t2 == this.b);
                this.d = t2;
                return;
            }
            int i2 = n1.a;
            throw new m1();
        }
        int i3 = this.b & 7;
        if (i3 == 2) {
            int u2 = this.a.u();
            c(u2);
            int b2 = this.a.b() + u2;
            do {
                list.add(Float.valueOf(this.a.j()));
            } while (this.a.b() < b2);
            return;
        }
        if (i3 == 5) {
            do {
                list.add(Float.valueOf(this.a.j()));
                if (this.a.c()) {
                    return;
                } else {
                    t = this.a.t();
                }
            } while (t == this.b);
            this.d = t;
            return;
        }
        int i4 = n1.a;
        throw new m1();
    }

    public final void a(List list, boolean z) {
        String r;
        int t;
        int t2;
        if ((this.b & 7) == 2) {
            if ((list instanceof q1) && !z) {
                q1 q1Var = (q1) list;
                do {
                    b(2);
                    q1Var.a(this.a.e());
                    if (this.a.c()) {
                        return;
                    } else {
                        t2 = this.a.t();
                    }
                } while (t2 == this.b);
                this.d = t2;
                return;
            }
            do {
                if (z) {
                    b(2);
                    r = this.a.s();
                } else {
                    b(2);
                    r = this.a.r();
                }
                list.add(r);
                if (this.a.c()) {
                    return;
                } else {
                    t = this.a.t();
                }
            } while (t == this.b);
            this.d = t;
            return;
        }
        int i = n1.a;
        throw new m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void a(List list, t2 t2Var, h0 h0Var) {
        int t;
        int i = this.b;
        if ((i & 7) == 3) {
            do {
                list.add(c(t2Var, h0Var));
                if (this.a.c() || this.d != 0) {
                    return;
                } else {
                    t = this.a.t();
                }
            } while (t == i);
            this.d = t;
            return;
        }
        int i2 = n1.a;
        throw new m1();
    }

    public final void a(int i) {
        if (this.a.b() != i) {
            throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }
}
