package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;
import java.util.List;

/* renamed from: com.google.crypto.tink.shaded.protobuf.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5905k {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC5904j f59423a;

    /* renamed from: b, reason: collision with root package name */
    private int f59424b;

    /* renamed from: c, reason: collision with root package name */
    private int f59425c;

    /* renamed from: d, reason: collision with root package name */
    private int f59426d = 0;

    private C5905k(AbstractC5904j abstractC5904j) {
        C5919z.a(abstractC5904j, "input");
        this.f59423a = abstractC5904j;
        abstractC5904j.f59407e = this;
    }

    private void R(int i11) throws IOException {
        if (this.f59423a.d() != i11) {
            throw A.l();
        }
    }

    private void S(int i11) throws IOException {
        if ((this.f59424b & 7) != i11) {
            throw A.e();
        }
    }

    private static void U(int i11) throws IOException {
        if ((i11 & 3) != 0) {
            throw A.h();
        }
    }

    private static void V(int i11) throws IOException {
        if ((i11 & 7) != 0) {
            throw A.h();
        }
    }

    public static C5905k a(AbstractC5904j abstractC5904j) {
        C5905k c5905k = abstractC5904j.f59407e;
        return c5905k != null ? c5905k : new C5905k(abstractC5904j);
    }

    private <T> void e(T t2, f0<T> f0Var, C5910p c5910p) throws IOException {
        int i11 = this.f59425c;
        this.f59425c = ((this.f59424b >>> 3) << 3) | 4;
        try {
            f0Var.b(t2, this, c5910p);
            if (this.f59424b == this.f59425c) {
            } else {
                throw A.h();
            }
        } finally {
            this.f59425c = i11;
        }
    }

    private <T> void g(T t2, f0<T> f0Var, C5910p c5910p) throws IOException {
        AbstractC5904j abstractC5904j = this.f59423a;
        int y11 = abstractC5904j.y();
        if (abstractC5904j.f59403a + abstractC5904j.f59404b >= abstractC5904j.f59405c) {
            throw new A("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int h11 = abstractC5904j.h(y11);
        abstractC5904j.f59403a++;
        f0Var.b(t2, this, c5910p);
        abstractC5904j.a(0);
        abstractC5904j.f59403a--;
        abstractC5904j.g(h11);
    }

    public final void A() throws IOException {
        S(2);
        AbstractC5904j abstractC5904j = this.f59423a;
        abstractC5904j.h(abstractC5904j.y());
        throw null;
    }

    public final <T> void B(List<T> list, f0<T> f0Var, C5910p c5910p) throws IOException {
        int x11;
        int i11 = this.f59424b;
        if ((i11 & 7) != 2) {
            throw A.e();
        }
        do {
            T newInstance = f0Var.newInstance();
            g(newInstance, f0Var, c5910p);
            f0Var.makeImmutable(newInstance);
            list.add(newInstance);
            AbstractC5904j abstractC5904j = this.f59423a;
            if (abstractC5904j.e() || this.f59426d != 0) {
                return;
            } else {
                x11 = abstractC5904j.x();
            }
        } while (x11 == i11);
        this.f59426d = x11;
    }

    public final int C() throws IOException {
        S(5);
        return this.f59423a.r();
    }

    public final void D(List<Integer> list) throws IOException {
        int x11;
        int x12;
        boolean z11 = list instanceof C5918y;
        AbstractC5904j abstractC5904j = this.f59423a;
        if (!z11) {
            int i11 = this.f59424b & 7;
            if (i11 == 2) {
                int y11 = abstractC5904j.y();
                U(y11);
                int d11 = abstractC5904j.d() + y11;
                do {
                    list.add(Integer.valueOf(abstractC5904j.r()));
                } while (abstractC5904j.d() < d11);
                return;
            }
            if (i11 != 5) {
                throw A.e();
            }
            do {
                list.add(Integer.valueOf(abstractC5904j.r()));
                if (abstractC5904j.e()) {
                    return;
                } else {
                    x11 = abstractC5904j.x();
                }
            } while (x11 == this.f59424b);
            this.f59426d = x11;
            return;
        }
        C5918y c5918y = (C5918y) list;
        int i12 = this.f59424b & 7;
        if (i12 == 2) {
            int y12 = abstractC5904j.y();
            U(y12);
            int d12 = abstractC5904j.d() + y12;
            do {
                c5918y.addInt(abstractC5904j.r());
            } while (abstractC5904j.d() < d12);
            return;
        }
        if (i12 != 5) {
            throw A.e();
        }
        do {
            c5918y.addInt(abstractC5904j.r());
            if (abstractC5904j.e()) {
                return;
            } else {
                x12 = abstractC5904j.x();
            }
        } while (x12 == this.f59424b);
        this.f59426d = x12;
    }

    public final long E() throws IOException {
        S(1);
        return this.f59423a.s();
    }

    public final void F(List<Long> list) throws IOException {
        int x11;
        int x12;
        boolean z11 = list instanceof I;
        AbstractC5904j abstractC5904j = this.f59423a;
        if (!z11) {
            int i11 = this.f59424b & 7;
            if (i11 == 1) {
                do {
                    list.add(Long.valueOf(abstractC5904j.s()));
                    if (abstractC5904j.e()) {
                        return;
                    } else {
                        x11 = abstractC5904j.x();
                    }
                } while (x11 == this.f59424b);
                this.f59426d = x11;
                return;
            }
            if (i11 != 2) {
                throw A.e();
            }
            int y11 = abstractC5904j.y();
            V(y11);
            int d11 = abstractC5904j.d() + y11;
            do {
                list.add(Long.valueOf(abstractC5904j.s()));
            } while (abstractC5904j.d() < d11);
            return;
        }
        I i12 = (I) list;
        int i13 = this.f59424b & 7;
        if (i13 == 1) {
            do {
                i12.addLong(abstractC5904j.s());
                if (abstractC5904j.e()) {
                    return;
                } else {
                    x12 = abstractC5904j.x();
                }
            } while (x12 == this.f59424b);
            this.f59426d = x12;
            return;
        }
        if (i13 != 2) {
            throw A.e();
        }
        int y12 = abstractC5904j.y();
        V(y12);
        int d12 = abstractC5904j.d() + y12;
        do {
            i12.addLong(abstractC5904j.s());
        } while (abstractC5904j.d() < d12);
    }

    public final int G() throws IOException {
        S(0);
        return this.f59423a.t();
    }

    public final void H(List<Integer> list) throws IOException {
        int x11;
        int x12;
        boolean z11 = list instanceof C5918y;
        AbstractC5904j abstractC5904j = this.f59423a;
        if (!z11) {
            int i11 = this.f59424b & 7;
            if (i11 == 0) {
                do {
                    list.add(Integer.valueOf(abstractC5904j.t()));
                    if (abstractC5904j.e()) {
                        return;
                    } else {
                        x11 = abstractC5904j.x();
                    }
                } while (x11 == this.f59424b);
                this.f59426d = x11;
                return;
            }
            if (i11 != 2) {
                throw A.e();
            }
            int d11 = abstractC5904j.d() + abstractC5904j.y();
            do {
                list.add(Integer.valueOf(abstractC5904j.t()));
            } while (abstractC5904j.d() < d11);
            R(d11);
            return;
        }
        C5918y c5918y = (C5918y) list;
        int i12 = this.f59424b & 7;
        if (i12 == 0) {
            do {
                c5918y.addInt(abstractC5904j.t());
                if (abstractC5904j.e()) {
                    return;
                } else {
                    x12 = abstractC5904j.x();
                }
            } while (x12 == this.f59424b);
            this.f59426d = x12;
            return;
        }
        if (i12 != 2) {
            throw A.e();
        }
        int d12 = abstractC5904j.d() + abstractC5904j.y();
        do {
            c5918y.addInt(abstractC5904j.t());
        } while (abstractC5904j.d() < d12);
        R(d12);
    }

    public final long I() throws IOException {
        S(0);
        return this.f59423a.u();
    }

    public final void J(List<Long> list) throws IOException {
        int x11;
        int x12;
        boolean z11 = list instanceof I;
        AbstractC5904j abstractC5904j = this.f59423a;
        if (!z11) {
            int i11 = this.f59424b & 7;
            if (i11 == 0) {
                do {
                    list.add(Long.valueOf(abstractC5904j.u()));
                    if (abstractC5904j.e()) {
                        return;
                    } else {
                        x11 = abstractC5904j.x();
                    }
                } while (x11 == this.f59424b);
                this.f59426d = x11;
                return;
            }
            if (i11 != 2) {
                throw A.e();
            }
            int d11 = abstractC5904j.d() + abstractC5904j.y();
            do {
                list.add(Long.valueOf(abstractC5904j.u()));
            } while (abstractC5904j.d() < d11);
            R(d11);
            return;
        }
        I i12 = (I) list;
        int i13 = this.f59424b & 7;
        if (i13 == 0) {
            do {
                i12.addLong(abstractC5904j.u());
                if (abstractC5904j.e()) {
                    return;
                } else {
                    x12 = abstractC5904j.x();
                }
            } while (x12 == this.f59424b);
            this.f59426d = x12;
            return;
        }
        if (i13 != 2) {
            throw A.e();
        }
        int d12 = abstractC5904j.d() + abstractC5904j.y();
        do {
            i12.addLong(abstractC5904j.u());
        } while (abstractC5904j.d() < d12);
        R(d12);
    }

    public final String K() throws IOException {
        S(2);
        return this.f59423a.v();
    }

    public final void L(List<String> list, boolean z11) throws IOException {
        int x11;
        int x12;
        if ((this.f59424b & 7) != 2) {
            throw A.e();
        }
        boolean z12 = list instanceof E;
        AbstractC5904j abstractC5904j = this.f59423a;
        if (!z12 || z11) {
            do {
                list.add(z11 ? M() : K());
                if (abstractC5904j.e()) {
                    return;
                } else {
                    x11 = abstractC5904j.x();
                }
            } while (x11 == this.f59424b);
            this.f59426d = x11;
            return;
        }
        E e11 = (E) list;
        do {
            j();
            e11.p();
            if (abstractC5904j.e()) {
                return;
            } else {
                x12 = abstractC5904j.x();
            }
        } while (x12 == this.f59424b);
        this.f59426d = x12;
    }

    public final String M() throws IOException {
        S(2);
        return this.f59423a.w();
    }

    public final int N() throws IOException {
        S(0);
        return this.f59423a.y();
    }

    public final void O(List<Integer> list) throws IOException {
        int x11;
        int x12;
        boolean z11 = list instanceof C5918y;
        AbstractC5904j abstractC5904j = this.f59423a;
        if (!z11) {
            int i11 = this.f59424b & 7;
            if (i11 == 0) {
                do {
                    list.add(Integer.valueOf(abstractC5904j.y()));
                    if (abstractC5904j.e()) {
                        return;
                    } else {
                        x11 = abstractC5904j.x();
                    }
                } while (x11 == this.f59424b);
                this.f59426d = x11;
                return;
            }
            if (i11 != 2) {
                throw A.e();
            }
            int d11 = abstractC5904j.d() + abstractC5904j.y();
            do {
                list.add(Integer.valueOf(abstractC5904j.y()));
            } while (abstractC5904j.d() < d11);
            R(d11);
            return;
        }
        C5918y c5918y = (C5918y) list;
        int i12 = this.f59424b & 7;
        if (i12 == 0) {
            do {
                c5918y.addInt(abstractC5904j.y());
                if (abstractC5904j.e()) {
                    return;
                } else {
                    x12 = abstractC5904j.x();
                }
            } while (x12 == this.f59424b);
            this.f59426d = x12;
            return;
        }
        if (i12 != 2) {
            throw A.e();
        }
        int d12 = abstractC5904j.d() + abstractC5904j.y();
        do {
            c5918y.addInt(abstractC5904j.y());
        } while (abstractC5904j.d() < d12);
        R(d12);
    }

    public final long P() throws IOException {
        S(0);
        return this.f59423a.z();
    }

    public final void Q(List<Long> list) throws IOException {
        int x11;
        int x12;
        boolean z11 = list instanceof I;
        AbstractC5904j abstractC5904j = this.f59423a;
        if (!z11) {
            int i11 = this.f59424b & 7;
            if (i11 == 0) {
                do {
                    list.add(Long.valueOf(abstractC5904j.z()));
                    if (abstractC5904j.e()) {
                        return;
                    } else {
                        x11 = abstractC5904j.x();
                    }
                } while (x11 == this.f59424b);
                this.f59426d = x11;
                return;
            }
            if (i11 != 2) {
                throw A.e();
            }
            int d11 = abstractC5904j.d() + abstractC5904j.y();
            do {
                list.add(Long.valueOf(abstractC5904j.z()));
            } while (abstractC5904j.d() < d11);
            R(d11);
            return;
        }
        I i12 = (I) list;
        int i13 = this.f59424b & 7;
        if (i13 == 0) {
            do {
                i12.addLong(abstractC5904j.z());
                if (abstractC5904j.e()) {
                    return;
                } else {
                    x12 = abstractC5904j.x();
                }
            } while (x12 == this.f59424b);
            this.f59426d = x12;
            return;
        }
        if (i13 != 2) {
            throw A.e();
        }
        int d12 = abstractC5904j.d() + abstractC5904j.y();
        do {
            i12.addLong(abstractC5904j.z());
        } while (abstractC5904j.d() < d12);
        R(d12);
    }

    public final boolean T() throws IOException {
        int i11;
        AbstractC5904j abstractC5904j = this.f59423a;
        if (abstractC5904j.e() || (i11 = this.f59424b) == this.f59425c) {
            return false;
        }
        return abstractC5904j.A(i11);
    }

    public final int b() throws IOException {
        int i11 = this.f59426d;
        if (i11 != 0) {
            this.f59424b = i11;
            this.f59426d = 0;
        } else {
            this.f59424b = this.f59423a.x();
        }
        int i12 = this.f59424b;
        if (i12 == 0 || i12 == this.f59425c) {
            return Integer.MAX_VALUE;
        }
        return i12 >>> 3;
    }

    public final int c() {
        return this.f59424b;
    }

    public final void d(S s11, f0 f0Var, C5910p c5910p) throws IOException {
        S(3);
        e(s11, f0Var, c5910p);
    }

    public final void f(S s11, f0 f0Var, C5910p c5910p) throws IOException {
        S(2);
        g(s11, f0Var, c5910p);
    }

    public final boolean h() throws IOException {
        S(0);
        return this.f59423a.i();
    }

    public final void i(List<Boolean> list) throws IOException {
        int x11;
        int x12;
        boolean z11 = list instanceof C5900f;
        AbstractC5904j abstractC5904j = this.f59423a;
        if (!z11) {
            int i11 = this.f59424b & 7;
            if (i11 == 0) {
                do {
                    list.add(Boolean.valueOf(abstractC5904j.i()));
                    if (abstractC5904j.e()) {
                        return;
                    } else {
                        x11 = abstractC5904j.x();
                    }
                } while (x11 == this.f59424b);
                this.f59426d = x11;
                return;
            }
            if (i11 != 2) {
                throw A.e();
            }
            int d11 = abstractC5904j.d() + abstractC5904j.y();
            do {
                list.add(Boolean.valueOf(abstractC5904j.i()));
            } while (abstractC5904j.d() < d11);
            R(d11);
            return;
        }
        C5900f c5900f = (C5900f) list;
        int i12 = this.f59424b & 7;
        if (i12 == 0) {
            do {
                c5900f.addBoolean(abstractC5904j.i());
                if (abstractC5904j.e()) {
                    return;
                } else {
                    x12 = abstractC5904j.x();
                }
            } while (x12 == this.f59424b);
            this.f59426d = x12;
            return;
        }
        if (i12 != 2) {
            throw A.e();
        }
        int d12 = abstractC5904j.d() + abstractC5904j.y();
        do {
            c5900f.addBoolean(abstractC5904j.i());
        } while (abstractC5904j.d() < d12);
        R(d12);
    }

    public final AbstractC5903i j() throws IOException {
        S(2);
        return this.f59423a.j();
    }

    public final void k(List<AbstractC5903i> list) throws IOException {
        int x11;
        if ((this.f59424b & 7) != 2) {
            throw A.e();
        }
        do {
            list.add(j());
            AbstractC5904j abstractC5904j = this.f59423a;
            if (abstractC5904j.e()) {
                return;
            } else {
                x11 = abstractC5904j.x();
            }
        } while (x11 == this.f59424b);
        this.f59426d = x11;
    }

    public final double l() throws IOException {
        S(1);
        return this.f59423a.k();
    }

    public final void m(List<Double> list) throws IOException {
        int x11;
        int x12;
        boolean z11 = list instanceof C5908n;
        AbstractC5904j abstractC5904j = this.f59423a;
        if (!z11) {
            int i11 = this.f59424b & 7;
            if (i11 == 1) {
                do {
                    list.add(Double.valueOf(abstractC5904j.k()));
                    if (abstractC5904j.e()) {
                        return;
                    } else {
                        x11 = abstractC5904j.x();
                    }
                } while (x11 == this.f59424b);
                this.f59426d = x11;
                return;
            }
            if (i11 != 2) {
                throw A.e();
            }
            int y11 = abstractC5904j.y();
            V(y11);
            int d11 = abstractC5904j.d() + y11;
            do {
                list.add(Double.valueOf(abstractC5904j.k()));
            } while (abstractC5904j.d() < d11);
            return;
        }
        C5908n c5908n = (C5908n) list;
        int i12 = this.f59424b & 7;
        if (i12 == 1) {
            do {
                c5908n.addDouble(abstractC5904j.k());
                if (abstractC5904j.e()) {
                    return;
                } else {
                    x12 = abstractC5904j.x();
                }
            } while (x12 == this.f59424b);
            this.f59426d = x12;
            return;
        }
        if (i12 != 2) {
            throw A.e();
        }
        int y12 = abstractC5904j.y();
        V(y12);
        int d12 = abstractC5904j.d() + y12;
        do {
            c5908n.addDouble(abstractC5904j.k());
        } while (abstractC5904j.d() < d12);
    }

    public final int n() throws IOException {
        S(0);
        return this.f59423a.l();
    }

    public final void o(List<Integer> list) throws IOException {
        int x11;
        int x12;
        boolean z11 = list instanceof C5918y;
        AbstractC5904j abstractC5904j = this.f59423a;
        if (!z11) {
            int i11 = this.f59424b & 7;
            if (i11 == 0) {
                do {
                    list.add(Integer.valueOf(abstractC5904j.l()));
                    if (abstractC5904j.e()) {
                        return;
                    } else {
                        x11 = abstractC5904j.x();
                    }
                } while (x11 == this.f59424b);
                this.f59426d = x11;
                return;
            }
            if (i11 != 2) {
                throw A.e();
            }
            int d11 = abstractC5904j.d() + abstractC5904j.y();
            do {
                list.add(Integer.valueOf(abstractC5904j.l()));
            } while (abstractC5904j.d() < d11);
            R(d11);
            return;
        }
        C5918y c5918y = (C5918y) list;
        int i12 = this.f59424b & 7;
        if (i12 == 0) {
            do {
                c5918y.addInt(abstractC5904j.l());
                if (abstractC5904j.e()) {
                    return;
                } else {
                    x12 = abstractC5904j.x();
                }
            } while (x12 == this.f59424b);
            this.f59426d = x12;
            return;
        }
        if (i12 != 2) {
            throw A.e();
        }
        int d12 = abstractC5904j.d() + abstractC5904j.y();
        do {
            c5918y.addInt(abstractC5904j.l());
        } while (abstractC5904j.d() < d12);
        R(d12);
    }

    public final int p() throws IOException {
        S(5);
        return this.f59423a.m();
    }

    public final void q(List<Integer> list) throws IOException {
        int x11;
        int x12;
        boolean z11 = list instanceof C5918y;
        AbstractC5904j abstractC5904j = this.f59423a;
        if (!z11) {
            int i11 = this.f59424b & 7;
            if (i11 == 2) {
                int y11 = abstractC5904j.y();
                U(y11);
                int d11 = abstractC5904j.d() + y11;
                do {
                    list.add(Integer.valueOf(abstractC5904j.m()));
                } while (abstractC5904j.d() < d11);
                return;
            }
            if (i11 != 5) {
                throw A.e();
            }
            do {
                list.add(Integer.valueOf(abstractC5904j.m()));
                if (abstractC5904j.e()) {
                    return;
                } else {
                    x11 = abstractC5904j.x();
                }
            } while (x11 == this.f59424b);
            this.f59426d = x11;
            return;
        }
        C5918y c5918y = (C5918y) list;
        int i12 = this.f59424b & 7;
        if (i12 == 2) {
            int y12 = abstractC5904j.y();
            U(y12);
            int d12 = abstractC5904j.d() + y12;
            do {
                c5918y.addInt(abstractC5904j.m());
            } while (abstractC5904j.d() < d12);
            return;
        }
        if (i12 != 5) {
            throw A.e();
        }
        do {
            c5918y.addInt(abstractC5904j.m());
            if (abstractC5904j.e()) {
                return;
            } else {
                x12 = abstractC5904j.x();
            }
        } while (x12 == this.f59424b);
        this.f59426d = x12;
    }

    public final long r() throws IOException {
        S(1);
        return this.f59423a.n();
    }

    public final void s(List<Long> list) throws IOException {
        int x11;
        int x12;
        boolean z11 = list instanceof I;
        AbstractC5904j abstractC5904j = this.f59423a;
        if (!z11) {
            int i11 = this.f59424b & 7;
            if (i11 == 1) {
                do {
                    list.add(Long.valueOf(abstractC5904j.n()));
                    if (abstractC5904j.e()) {
                        return;
                    } else {
                        x11 = abstractC5904j.x();
                    }
                } while (x11 == this.f59424b);
                this.f59426d = x11;
                return;
            }
            if (i11 != 2) {
                throw A.e();
            }
            int y11 = abstractC5904j.y();
            V(y11);
            int d11 = abstractC5904j.d() + y11;
            do {
                list.add(Long.valueOf(abstractC5904j.n()));
            } while (abstractC5904j.d() < d11);
            return;
        }
        I i12 = (I) list;
        int i13 = this.f59424b & 7;
        if (i13 == 1) {
            do {
                i12.addLong(abstractC5904j.n());
                if (abstractC5904j.e()) {
                    return;
                } else {
                    x12 = abstractC5904j.x();
                }
            } while (x12 == this.f59424b);
            this.f59426d = x12;
            return;
        }
        if (i13 != 2) {
            throw A.e();
        }
        int y12 = abstractC5904j.y();
        V(y12);
        int d12 = abstractC5904j.d() + y12;
        do {
            i12.addLong(abstractC5904j.n());
        } while (abstractC5904j.d() < d12);
    }

    public final float t() throws IOException {
        S(5);
        return this.f59423a.o();
    }

    public final void u(List<Float> list) throws IOException {
        int x11;
        int x12;
        boolean z11 = list instanceof C5915v;
        AbstractC5904j abstractC5904j = this.f59423a;
        if (!z11) {
            int i11 = this.f59424b & 7;
            if (i11 == 2) {
                int y11 = abstractC5904j.y();
                U(y11);
                int d11 = abstractC5904j.d() + y11;
                do {
                    list.add(Float.valueOf(abstractC5904j.o()));
                } while (abstractC5904j.d() < d11);
                return;
            }
            if (i11 != 5) {
                throw A.e();
            }
            do {
                list.add(Float.valueOf(abstractC5904j.o()));
                if (abstractC5904j.e()) {
                    return;
                } else {
                    x11 = abstractC5904j.x();
                }
            } while (x11 == this.f59424b);
            this.f59426d = x11;
            return;
        }
        C5915v c5915v = (C5915v) list;
        int i12 = this.f59424b & 7;
        if (i12 == 2) {
            int y12 = abstractC5904j.y();
            U(y12);
            int d12 = abstractC5904j.d() + y12;
            do {
                c5915v.addFloat(abstractC5904j.o());
            } while (abstractC5904j.d() < d12);
            return;
        }
        if (i12 != 5) {
            throw A.e();
        }
        do {
            c5915v.addFloat(abstractC5904j.o());
            if (abstractC5904j.e()) {
                return;
            } else {
                x12 = abstractC5904j.x();
            }
        } while (x12 == this.f59424b);
        this.f59426d = x12;
    }

    @Deprecated
    public final <T> void v(List<T> list, f0<T> f0Var, C5910p c5910p) throws IOException {
        int x11;
        int i11 = this.f59424b;
        if ((i11 & 7) != 3) {
            throw A.e();
        }
        do {
            T newInstance = f0Var.newInstance();
            e(newInstance, f0Var, c5910p);
            f0Var.makeImmutable(newInstance);
            list.add(newInstance);
            AbstractC5904j abstractC5904j = this.f59423a;
            if (abstractC5904j.e() || this.f59426d != 0) {
                return;
            } else {
                x11 = abstractC5904j.x();
            }
        } while (x11 == i11);
        this.f59426d = x11;
    }

    public final int w() throws IOException {
        S(0);
        return this.f59423a.p();
    }

    public final void x(List<Integer> list) throws IOException {
        int x11;
        int x12;
        boolean z11 = list instanceof C5918y;
        AbstractC5904j abstractC5904j = this.f59423a;
        if (!z11) {
            int i11 = this.f59424b & 7;
            if (i11 == 0) {
                do {
                    list.add(Integer.valueOf(abstractC5904j.p()));
                    if (abstractC5904j.e()) {
                        return;
                    } else {
                        x11 = abstractC5904j.x();
                    }
                } while (x11 == this.f59424b);
                this.f59426d = x11;
                return;
            }
            if (i11 != 2) {
                throw A.e();
            }
            int d11 = abstractC5904j.d() + abstractC5904j.y();
            do {
                list.add(Integer.valueOf(abstractC5904j.p()));
            } while (abstractC5904j.d() < d11);
            R(d11);
            return;
        }
        C5918y c5918y = (C5918y) list;
        int i12 = this.f59424b & 7;
        if (i12 == 0) {
            do {
                c5918y.addInt(abstractC5904j.p());
                if (abstractC5904j.e()) {
                    return;
                } else {
                    x12 = abstractC5904j.x();
                }
            } while (x12 == this.f59424b);
            this.f59426d = x12;
            return;
        }
        if (i12 != 2) {
            throw A.e();
        }
        int d12 = abstractC5904j.d() + abstractC5904j.y();
        do {
            c5918y.addInt(abstractC5904j.p());
        } while (abstractC5904j.d() < d12);
        R(d12);
    }

    public final long y() throws IOException {
        S(0);
        return this.f59423a.q();
    }

    public final void z(List<Long> list) throws IOException {
        int x11;
        int x12;
        boolean z11 = list instanceof I;
        AbstractC5904j abstractC5904j = this.f59423a;
        if (!z11) {
            int i11 = this.f59424b & 7;
            if (i11 == 0) {
                do {
                    list.add(Long.valueOf(abstractC5904j.q()));
                    if (abstractC5904j.e()) {
                        return;
                    } else {
                        x11 = abstractC5904j.x();
                    }
                } while (x11 == this.f59424b);
                this.f59426d = x11;
                return;
            }
            if (i11 != 2) {
                throw A.e();
            }
            int d11 = abstractC5904j.d() + abstractC5904j.y();
            do {
                list.add(Long.valueOf(abstractC5904j.q()));
            } while (abstractC5904j.d() < d11);
            R(d11);
            return;
        }
        I i12 = (I) list;
        int i13 = this.f59424b & 7;
        if (i13 == 0) {
            do {
                i12.addLong(abstractC5904j.q());
                if (abstractC5904j.e()) {
                    return;
                } else {
                    x12 = abstractC5904j.x();
                }
            } while (x12 == this.f59424b);
            this.f59426d = x12;
            return;
        }
        if (i13 != 2) {
            throw A.e();
        }
        int d12 = abstractC5904j.d() + abstractC5904j.y();
        do {
            i12.addLong(abstractC5904j.q());
        } while (abstractC5904j.d() < d12);
        R(d12);
    }
}
