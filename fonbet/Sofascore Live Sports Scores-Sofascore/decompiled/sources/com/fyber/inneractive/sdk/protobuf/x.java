package com.fyber.inneractive.sdk.protobuf;

import defpackage.yhk;
import defpackage.zzl;
import java.nio.charset.Charset;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class x implements s2 {
    public final w a;
    public int b;
    public int c;
    public int d = 0;

    public x(w wVar) {
        Charset charset = l1.a;
        if (wVar == null) {
            yhk.s("input");
            throw null;
        }
        this.a = wVar;
        wVar.d = this;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void a(List list) {
        int t;
        int t2;
        boolean z = list instanceof u1;
        int i = this.b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
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
            if (i2 != 2) {
                zzl.o();
                return;
            }
            int b = this.a.b() + this.a.u();
            do {
                list.add(Long.valueOf(this.a.v()));
            } while (this.a.b() < b);
            a(b);
            return;
        }
        u1 u1Var = (u1) list;
        int i3 = i & 7;
        if (i3 == 0) {
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
        if (i3 != 2) {
            zzl.o();
            return;
        }
        int b2 = this.a.b() + this.a.u();
        do {
            u1Var.a(this.a.v());
        } while (this.a.b() < b2);
        a(b2);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void b(List list, t2 t2Var, h0 h0Var) {
        int t;
        int i = this.b;
        if ((i & 7) != 2) {
            zzl.o();
            return;
        }
        do {
            list.add(d(t2Var, h0Var));
            if (this.a.c() || this.d != 0) {
                return;
            } else {
                t = this.a.t();
            }
        } while (t == i);
        this.d = t;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void c(List list) {
        int t;
        int t2;
        boolean z = list instanceof a1;
        int i = this.b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
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
            if (i2 != 2) {
                zzl.o();
                return;
            }
            int b = this.a.b() + this.a.u();
            do {
                list.add(Integer.valueOf(this.a.p()));
            } while (this.a.b() < b);
            a(b);
            return;
        }
        a1 a1Var = (a1) list;
        int i3 = i & 7;
        if (i3 == 0) {
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
        if (i3 != 2) {
            zzl.o();
            return;
        }
        int b2 = this.a.b() + this.a.u();
        do {
            a1Var.c(this.a.p());
        } while (this.a.b() < b2);
        a(b2);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void d(List list) {
        int t;
        int t2;
        boolean z = list instanceof q0;
        int i = this.b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 2) {
                int u = this.a.u();
                c(u);
                int b = this.a.b() + u;
                do {
                    list.add(Float.valueOf(this.a.j()));
                } while (this.a.b() < b);
                return;
            }
            if (i2 != 5) {
                zzl.o();
                return;
            }
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
        q0 q0Var = (q0) list;
        int i3 = i & 7;
        if (i3 == 2) {
            int u2 = this.a.u();
            c(u2);
            int b2 = this.a.b() + u2;
            do {
                q0Var.a(this.a.j());
            } while (this.a.b() < b2);
            return;
        }
        if (i3 != 5) {
            zzl.o();
            return;
        }
        do {
            q0Var.a(this.a.j());
            if (this.a.c()) {
                return;
            } else {
                t2 = this.a.t();
            }
        } while (t2 == this.b);
        this.d = t2;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void e(List list) {
        int t;
        int t2;
        boolean z = list instanceof a1;
        int i = this.b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 2) {
                int u = this.a.u();
                c(u);
                int b = this.a.b() + u;
                do {
                    list.add(Integer.valueOf(this.a.h()));
                } while (this.a.b() < b);
                return;
            }
            if (i2 != 5) {
                zzl.o();
                return;
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
        int i3 = i & 7;
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
            zzl.o();
            return;
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

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void f(List list) {
        int t;
        int t2;
        boolean z = list instanceof a1;
        int i = this.b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 2) {
                int u = this.a.u();
                c(u);
                int b = this.a.b() + u;
                do {
                    list.add(Integer.valueOf(this.a.n()));
                } while (this.a.b() < b);
                return;
            }
            if (i2 != 5) {
                zzl.o();
                return;
            }
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
        a1 a1Var = (a1) list;
        int i3 = i & 7;
        if (i3 == 2) {
            int u2 = this.a.u();
            c(u2);
            int b2 = this.a.b() + u2;
            do {
                a1Var.c(this.a.n());
            } while (this.a.b() < b2);
            return;
        }
        if (i3 != 5) {
            zzl.o();
            return;
        }
        do {
            a1Var.c(this.a.n());
            if (this.a.c()) {
                return;
            } else {
                t2 = this.a.t();
            }
        } while (t2 == this.b);
        this.d = t2;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void g(List list) {
        int t;
        int t2;
        boolean z = list instanceof u1;
        int i = this.b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
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
            if (i2 != 2) {
                zzl.o();
                return;
            }
            int b = this.a.b() + this.a.u();
            do {
                list.add(Long.valueOf(this.a.q()));
            } while (this.a.b() < b);
            a(b);
            return;
        }
        u1 u1Var = (u1) list;
        int i3 = i & 7;
        if (i3 == 0) {
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
        if (i3 != 2) {
            zzl.o();
            return;
        }
        int b2 = this.a.b() + this.a.u();
        do {
            u1Var.a(this.a.q());
        } while (this.a.b() < b2);
        a(b2);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void h(List list) {
        int t;
        if ((this.b & 7) != 2) {
            zzl.o();
            return;
        }
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
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void i(List list) {
        int t;
        int t2;
        boolean z = list instanceof a1;
        int i = this.b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
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
            if (i2 != 2) {
                zzl.o();
                return;
            }
            int b = this.a.b() + this.a.u();
            do {
                list.add(Integer.valueOf(this.a.u()));
            } while (this.a.b() < b);
            a(b);
            return;
        }
        a1 a1Var = (a1) list;
        int i3 = i & 7;
        if (i3 == 0) {
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
        if (i3 != 2) {
            zzl.o();
            return;
        }
        int b2 = this.a.b() + this.a.u();
        do {
            a1Var.c(this.a.u());
        } while (this.a.b() < b2);
        a(b2);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void j(List list) {
        int t;
        int t2;
        boolean z = list instanceof d0;
        int i = this.b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 1) {
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
            if (i2 != 2) {
                zzl.o();
                return;
            }
            int u = this.a.u();
            d(u);
            int b = this.a.b() + u;
            do {
                list.add(Double.valueOf(this.a.f()));
            } while (this.a.b() < b);
            return;
        }
        d0 d0Var = (d0) list;
        int i3 = i & 7;
        if (i3 == 1) {
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
        if (i3 != 2) {
            zzl.o();
            return;
        }
        int u2 = this.a.u();
        d(u2);
        int b2 = this.a.b() + u2;
        do {
            d0Var.a(this.a.f());
        } while (this.a.b() < b2);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void k(List list) {
        int t;
        int t2;
        boolean z = list instanceof u1;
        int i = this.b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
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
            if (i2 != 2) {
                zzl.o();
                return;
            }
            int b = this.a.b() + this.a.u();
            do {
                list.add(Long.valueOf(this.a.l()));
            } while (this.a.b() < b);
            a(b);
            return;
        }
        u1 u1Var = (u1) list;
        int i3 = i & 7;
        if (i3 == 0) {
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
        if (i3 != 2) {
            zzl.o();
            return;
        }
        int b2 = this.a.b() + this.a.u();
        do {
            u1Var.a(this.a.l());
        } while (this.a.b() < b2);
        a(b2);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void l(List list) {
        int t;
        int t2;
        boolean z = list instanceof j;
        int i = this.b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
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
            if (i2 != 2) {
                zzl.o();
                return;
            }
            int b = this.a.b() + this.a.u();
            do {
                list.add(Boolean.valueOf(this.a.d()));
            } while (this.a.b() < b);
            a(b);
            return;
        }
        j jVar = (j) list;
        int i3 = i & 7;
        if (i3 == 0) {
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
        if (i3 != 2) {
            zzl.o();
            return;
        }
        int b2 = this.a.b() + this.a.u();
        do {
            jVar.a(this.a.d());
        } while (this.a.b() < b2);
        a(b2);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void m(List list) {
        int t;
        int t2;
        boolean z = list instanceof u1;
        int i = this.b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 1) {
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
            if (i2 != 2) {
                zzl.o();
                return;
            }
            int u = this.a.u();
            d(u);
            int b = this.a.b() + u;
            do {
                list.add(Long.valueOf(this.a.o()));
            } while (this.a.b() < b);
            return;
        }
        u1 u1Var = (u1) list;
        int i3 = i & 7;
        if (i3 == 1) {
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
        if (i3 != 2) {
            zzl.o();
            return;
        }
        int u2 = this.a.u();
        d(u2);
        int b2 = this.a.b() + u2;
        do {
            u1Var.a(this.a.o());
        } while (this.a.b() < b2);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void n(List list) {
        int t;
        int t2;
        boolean z = list instanceof u1;
        int i = this.b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 1) {
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
            if (i2 != 2) {
                zzl.o();
                return;
            }
            int u = this.a.u();
            d(u);
            int b = this.a.b() + u;
            do {
                list.add(Long.valueOf(this.a.i()));
            } while (this.a.b() < b);
            return;
        }
        u1 u1Var = (u1) list;
        int i3 = i & 7;
        if (i3 == 1) {
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
        if (i3 != 2) {
            zzl.o();
            return;
        }
        int u2 = this.a.u();
        d(u2);
        int b2 = this.a.b() + u2;
        do {
            u1Var.a(this.a.i());
        } while (this.a.b() < b2);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void o(List list) {
        int t;
        int t2;
        boolean z = list instanceof a1;
        int i = this.b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
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
            if (i2 != 2) {
                zzl.o();
                return;
            }
            int b = this.a.b() + this.a.u();
            do {
                list.add(Integer.valueOf(this.a.k()));
            } while (this.a.b() < b);
            a(b);
            return;
        }
        a1 a1Var = (a1) list;
        int i3 = i & 7;
        if (i3 == 0) {
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
        if (i3 != 2) {
            zzl.o();
            return;
        }
        int b2 = this.a.b() + this.a.u();
        do {
            a1Var.c(this.a.k());
        } while (this.a.b() < b2);
        a(b2);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void p(List list) {
        int t;
        int t2;
        boolean z = list instanceof a1;
        int i = this.b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
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
            if (i2 != 2) {
                zzl.o();
                return;
            }
            int b = this.a.b() + this.a.u();
            do {
                list.add(Integer.valueOf(this.a.g()));
            } while (this.a.b() < b);
            a(b);
            return;
        }
        a1 a1Var = (a1) list;
        int i3 = i & 7;
        if (i3 == 0) {
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
        if (i3 != 2) {
            zzl.o();
            return;
        }
        int b2 = this.a.b() + this.a.u();
        do {
            a1Var.c(this.a.g());
        } while (this.a.b() < b2);
        a(b2);
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
            i = this.a.t();
            this.b = i;
        }
        if (i == 0 || i == this.c) {
            return Integer.MAX_VALUE;
        }
        return i >>> 3;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final long t() {
        b(1);
        return this.a.o();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void q(List list) {
        a(list, false);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final Object b(Class cls, h0 h0Var) {
        b(2);
        return d(p2.c.a(cls), h0Var);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final Object b(t2 t2Var, h0 h0Var) {
        b(2);
        return d(t2Var, h0Var);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final double h() {
        b(1);
        return this.a.f();
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

    public final void b(int i) {
        if ((this.b & 7) == i) {
            return;
        }
        zzl.o();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final Object a(t2 t2Var, h0 h0Var) {
        b(3);
        return c(t2Var, h0Var);
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
    public final long g() {
        b(1);
        return this.a.i();
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
    public final int j() {
        b(0);
        return this.a.p();
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
    public final s a() {
        b(2);
        return this.a.e();
    }

    public static void d(int i) {
        if ((i & 7) == 0) {
            return;
        }
        zzl.j("Failed to parse the message.");
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
    public final Object a(Class cls, h0 h0Var) {
        b(3);
        return c(p2.c.a(cls), h0Var);
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
            r4.a--;
            this.a.c(d);
            return a;
        }
        zzl.j("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        return null;
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
        zzl.o();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final int c() {
        b(0);
        return this.a.u();
    }

    public static void c(int i) {
        if ((i & 3) == 0) {
            return;
        }
        zzl.j("Failed to parse the message.");
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final int d() {
        b(0);
        return this.a.k();
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
        zzl.o();
    }

    public final void a(int i) {
        if (this.a.b() == i) {
            return;
        }
        zzl.j("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
