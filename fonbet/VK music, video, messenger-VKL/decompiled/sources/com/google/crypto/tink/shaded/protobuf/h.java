package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;
import java.util.List;
import xsna.ayy;
import xsna.v7f0;

/* compiled from: CodedInputStreamReader.java */
/* loaded from: classes.dex */
public final class h implements v7f0 {
    public final g a;
    public int b;
    public int c;
    public int d = 0;

    public h(g gVar) {
        q.a(gVar, "input");
        this.a = gVar;
        gVar.c = this;
    }

    public static void S(int i) throws IOException {
        if ((i & 3) != 0) {
            throw InvalidProtocolBufferException.j();
        }
    }

    public static void T(int i) throws IOException {
        if ((i & 7) != 0) {
            throw InvalidProtocolBufferException.j();
        }
    }

    @Override // xsna.v7f0
    public final void A(List<String> list) throws IOException {
        P(list, false);
    }

    @Override // xsna.v7f0
    public final void B(List<Float> list) throws IOException {
        int w;
        int w2;
        boolean z = list instanceof o;
        g gVar = this.a;
        if (!z) {
            int i = this.b & 7;
            if (i == 2) {
                int x = gVar.x();
                S(x);
                int d = gVar.d() + x;
                do {
                    list.add(Float.valueOf(gVar.n()));
                } while (gVar.d() < d);
                return;
            }
            if (i != 5) {
                throw InvalidProtocolBufferException.g();
            }
            do {
                list.add(Float.valueOf(gVar.n()));
                if (gVar.e()) {
                    return;
                } else {
                    w = gVar.w();
                }
            } while (w == this.b);
            this.d = w;
            return;
        }
        o oVar = (o) list;
        int i2 = this.b & 7;
        if (i2 == 2) {
            int x2 = gVar.x();
            S(x2);
            int d2 = gVar.d() + x2;
            do {
                oVar.addFloat(gVar.n());
            } while (gVar.d() < d2);
            return;
        }
        if (i2 != 5) {
            throw InvalidProtocolBufferException.g();
        }
        do {
            oVar.addFloat(gVar.n());
            if (gVar.e()) {
                return;
            } else {
                w2 = gVar.w();
            }
        } while (w2 == this.b);
        this.d = w2;
    }

    @Override // xsna.v7f0
    public final void C(List<ByteString> list) throws IOException {
        int w;
        if ((this.b & 7) != 2) {
            throw InvalidProtocolBufferException.g();
        }
        do {
            list.add(v());
            g gVar = this.a;
            if (gVar.e()) {
                return;
            } else {
                w = gVar.w();
            }
        } while (w == this.b);
        this.d = w;
    }

    @Override // xsna.v7f0
    public final void D(List<Double> list) throws IOException {
        int w;
        int w2;
        boolean z = list instanceof j;
        g gVar = this.a;
        if (!z) {
            int i = this.b & 7;
            if (i == 1) {
                do {
                    list.add(Double.valueOf(gVar.j()));
                    if (gVar.e()) {
                        return;
                    } else {
                        w = gVar.w();
                    }
                } while (w == this.b);
                this.d = w;
                return;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.g();
            }
            int x = gVar.x();
            T(x);
            int d = gVar.d() + x;
            do {
                list.add(Double.valueOf(gVar.j()));
            } while (gVar.d() < d);
            return;
        }
        j jVar = (j) list;
        int i2 = this.b & 7;
        if (i2 == 1) {
            do {
                jVar.addDouble(gVar.j());
                if (gVar.e()) {
                    return;
                } else {
                    w2 = gVar.w();
                }
            } while (w2 == this.b);
            this.d = w2;
            return;
        }
        if (i2 != 2) {
            throw InvalidProtocolBufferException.g();
        }
        int x2 = gVar.x();
        T(x2);
        int d2 = gVar.d() + x2;
        do {
            jVar.addDouble(gVar.j());
        } while (gVar.d() < d2);
    }

    @Override // xsna.v7f0
    public final long E() throws IOException {
        R(1);
        return this.a.m();
    }

    @Override // xsna.v7f0
    public final void F(List<Integer> list) throws IOException {
        int w;
        int w2;
        boolean z = list instanceof p;
        g gVar = this.a;
        if (!z) {
            int i = this.b & 7;
            if (i == 2) {
                int x = gVar.x();
                S(x);
                int d = gVar.d() + x;
                do {
                    list.add(Integer.valueOf(gVar.q()));
                } while (gVar.d() < d);
                return;
            }
            if (i != 5) {
                throw InvalidProtocolBufferException.g();
            }
            do {
                list.add(Integer.valueOf(gVar.q()));
                if (gVar.e()) {
                    return;
                } else {
                    w = gVar.w();
                }
            } while (w == this.b);
            this.d = w;
            return;
        }
        p pVar = (p) list;
        int i2 = this.b & 7;
        if (i2 == 2) {
            int x2 = gVar.x();
            S(x2);
            int d2 = gVar.d() + x2;
            do {
                pVar.addInt(gVar.q());
            } while (gVar.d() < d2);
            return;
        }
        if (i2 != 5) {
            throw InvalidProtocolBufferException.g();
        }
        do {
            pVar.addInt(gVar.q());
            if (gVar.e()) {
                return;
            } else {
                w2 = gVar.w();
            }
        } while (w2 == this.b);
        this.d = w2;
    }

    @Override // xsna.v7f0
    public final void G() throws IOException {
        R(2);
        g gVar = this.a;
        gVar.g(gVar.x());
        throw null;
    }

    @Override // xsna.v7f0
    public final void H(List<Long> list) throws IOException {
        int w;
        int w2;
        boolean z = list instanceof u;
        g gVar = this.a;
        if (!z) {
            int i = this.b & 7;
            if (i == 0) {
                do {
                    list.add(Long.valueOf(gVar.p()));
                    if (gVar.e()) {
                        return;
                    } else {
                        w = gVar.w();
                    }
                } while (w == this.b);
                this.d = w;
                return;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.g();
            }
            int d = gVar.d() + gVar.x();
            do {
                list.add(Long.valueOf(gVar.p()));
            } while (gVar.d() < d);
            Q(d);
            return;
        }
        u uVar = (u) list;
        int i2 = this.b & 7;
        if (i2 == 0) {
            do {
                uVar.addLong(gVar.p());
                if (gVar.e()) {
                    return;
                } else {
                    w2 = gVar.w();
                }
            } while (w2 == this.b);
            this.d = w2;
            return;
        }
        if (i2 != 2) {
            throw InvalidProtocolBufferException.g();
        }
        int d2 = gVar.d() + gVar.x();
        do {
            uVar.addLong(gVar.p());
        } while (gVar.d() < d2);
        Q(d2);
    }

    @Override // xsna.v7f0
    public final void I(List<Integer> list) throws IOException {
        int w;
        int w2;
        boolean z = list instanceof p;
        g gVar = this.a;
        if (!z) {
            int i = this.b & 7;
            if (i == 0) {
                do {
                    list.add(Integer.valueOf(gVar.k()));
                    if (gVar.e()) {
                        return;
                    } else {
                        w = gVar.w();
                    }
                } while (w == this.b);
                this.d = w;
                return;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.g();
            }
            int d = gVar.d() + gVar.x();
            do {
                list.add(Integer.valueOf(gVar.k()));
            } while (gVar.d() < d);
            Q(d);
            return;
        }
        p pVar = (p) list;
        int i2 = this.b & 7;
        if (i2 == 0) {
            do {
                pVar.addInt(gVar.k());
                if (gVar.e()) {
                    return;
                } else {
                    w2 = gVar.w();
                }
            } while (w2 == this.b);
            this.d = w2;
            return;
        }
        if (i2 != 2) {
            throw InvalidProtocolBufferException.g();
        }
        int d2 = gVar.d() + gVar.x();
        do {
            pVar.addInt(gVar.k());
        } while (gVar.d() < d2);
        Q(d2);
    }

    @Override // xsna.v7f0
    public final void J(List<Integer> list) throws IOException {
        int w;
        int w2;
        boolean z = list instanceof p;
        g gVar = this.a;
        if (!z) {
            int i = this.b & 7;
            if (i == 0) {
                do {
                    list.add(Integer.valueOf(gVar.x()));
                    if (gVar.e()) {
                        return;
                    } else {
                        w = gVar.w();
                    }
                } while (w == this.b);
                this.d = w;
                return;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.g();
            }
            int d = gVar.d() + gVar.x();
            do {
                list.add(Integer.valueOf(gVar.x()));
            } while (gVar.d() < d);
            Q(d);
            return;
        }
        p pVar = (p) list;
        int i2 = this.b & 7;
        if (i2 == 0) {
            do {
                pVar.addInt(gVar.x());
                if (gVar.e()) {
                    return;
                } else {
                    w2 = gVar.w();
                }
            } while (w2 == this.b);
            this.d = w2;
            return;
        }
        if (i2 != 2) {
            throw InvalidProtocolBufferException.g();
        }
        int d2 = gVar.d() + gVar.x();
        do {
            pVar.addInt(gVar.x());
        } while (gVar.d() < d2);
        Q(d2);
    }

    @Override // xsna.v7f0
    public final long K() throws IOException {
        R(0);
        return this.a.t();
    }

    @Override // xsna.v7f0
    public final int L() throws IOException {
        R(5);
        return this.a.q();
    }

    @Override // xsna.v7f0
    public final String M() throws IOException {
        R(2);
        return this.a.v();
    }

    public final <T> T N(a0<T> a0Var, k kVar) throws IOException {
        int i = this.c;
        this.c = ((this.b >>> 3) << 3) | 4;
        try {
            T b = a0Var.b();
            a0Var.e(b, this, kVar);
            a0Var.d(b);
            if (this.b == this.c) {
                return b;
            }
            throw InvalidProtocolBufferException.j();
        } finally {
            this.c = i;
        }
    }

    public final <T> T O(a0<T> a0Var, k kVar) throws IOException {
        g gVar = this.a;
        int x = gVar.x();
        if (gVar.a >= gVar.b) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int g = gVar.g(x);
        T b = a0Var.b();
        gVar.a++;
        a0Var.e(b, this, kVar);
        a0Var.d(b);
        gVar.a(0);
        gVar.a--;
        gVar.f(g);
        return b;
    }

    public final void P(List<String> list, boolean z) throws IOException {
        int w;
        int w2;
        if ((this.b & 7) != 2) {
            throw InvalidProtocolBufferException.g();
        }
        boolean z2 = list instanceof ayy;
        g gVar = this.a;
        if (!z2 || z) {
            do {
                list.add(z ? M() : q());
                if (gVar.e()) {
                    return;
                } else {
                    w = gVar.w();
                }
            } while (w == this.b);
            this.d = w;
            return;
        }
        ayy ayyVar = (ayy) list;
        do {
            ayyVar.w3(v());
            if (gVar.e()) {
                return;
            } else {
                w2 = gVar.w();
            }
        } while (w2 == this.b);
        this.d = w2;
    }

    public final void Q(int i) throws IOException {
        if (this.a.d() != i) {
            throw InvalidProtocolBufferException.l();
        }
    }

    public final void R(int i) throws IOException {
        if ((this.b & 7) != i) {
            throw InvalidProtocolBufferException.g();
        }
    }

    @Override // xsna.v7f0
    public final int a() throws IOException {
        R(0);
        return this.a.x();
    }

    @Override // xsna.v7f0
    public final <T> T b(a0<T> a0Var, k kVar) throws IOException {
        R(3);
        return (T) N(a0Var, kVar);
    }

    @Override // xsna.v7f0
    public final int c() throws IOException {
        R(0);
        return this.a.k();
    }

    @Override // xsna.v7f0
    public final void d(List<Boolean> list) throws IOException {
        int w;
        int w2;
        boolean z = list instanceof e;
        g gVar = this.a;
        if (!z) {
            int i = this.b & 7;
            if (i == 0) {
                do {
                    list.add(Boolean.valueOf(gVar.h()));
                    if (gVar.e()) {
                        return;
                    } else {
                        w = gVar.w();
                    }
                } while (w == this.b);
                this.d = w;
                return;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.g();
            }
            int d = gVar.d() + gVar.x();
            do {
                list.add(Boolean.valueOf(gVar.h()));
            } while (gVar.d() < d);
            Q(d);
            return;
        }
        e eVar = (e) list;
        int i2 = this.b & 7;
        if (i2 == 0) {
            do {
                eVar.addBoolean(gVar.h());
                if (gVar.e()) {
                    return;
                } else {
                    w2 = gVar.w();
                }
            } while (w2 == this.b);
            this.d = w2;
            return;
        }
        if (i2 != 2) {
            throw InvalidProtocolBufferException.g();
        }
        int d2 = gVar.d() + gVar.x();
        do {
            eVar.addBoolean(gVar.h());
        } while (gVar.d() < d2);
        Q(d2);
    }

    @Override // xsna.v7f0
    public final void e(List<Integer> list) throws IOException {
        int w;
        int w2;
        boolean z = list instanceof p;
        g gVar = this.a;
        if (!z) {
            int i = this.b & 7;
            if (i == 0) {
                do {
                    list.add(Integer.valueOf(gVar.s()));
                    if (gVar.e()) {
                        return;
                    } else {
                        w = gVar.w();
                    }
                } while (w == this.b);
                this.d = w;
                return;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.g();
            }
            int d = gVar.d() + gVar.x();
            do {
                list.add(Integer.valueOf(gVar.s()));
            } while (gVar.d() < d);
            Q(d);
            return;
        }
        p pVar = (p) list;
        int i2 = this.b & 7;
        if (i2 == 0) {
            do {
                pVar.addInt(gVar.s());
                if (gVar.e()) {
                    return;
                } else {
                    w2 = gVar.w();
                }
            } while (w2 == this.b);
            this.d = w2;
            return;
        }
        if (i2 != 2) {
            throw InvalidProtocolBufferException.g();
        }
        int d2 = gVar.d() + gVar.x();
        do {
            pVar.addInt(gVar.s());
        } while (gVar.d() < d2);
        Q(d2);
    }

    @Override // xsna.v7f0
    public final void f(List<Long> list) throws IOException {
        int w;
        int w2;
        boolean z = list instanceof u;
        g gVar = this.a;
        if (!z) {
            int i = this.b & 7;
            if (i == 1) {
                do {
                    list.add(Long.valueOf(gVar.r()));
                    if (gVar.e()) {
                        return;
                    } else {
                        w = gVar.w();
                    }
                } while (w == this.b);
                this.d = w;
                return;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.g();
            }
            int x = gVar.x();
            T(x);
            int d = gVar.d() + x;
            do {
                list.add(Long.valueOf(gVar.r()));
            } while (gVar.d() < d);
            return;
        }
        u uVar = (u) list;
        int i2 = this.b & 7;
        if (i2 == 1) {
            do {
                uVar.addLong(gVar.r());
                if (gVar.e()) {
                    return;
                } else {
                    w2 = gVar.w();
                }
            } while (w2 == this.b);
            this.d = w2;
            return;
        }
        if (i2 != 2) {
            throw InvalidProtocolBufferException.g();
        }
        int x2 = gVar.x();
        T(x2);
        int d2 = gVar.d() + x2;
        do {
            uVar.addLong(gVar.r());
        } while (gVar.d() < d2);
    }

    @Override // xsna.v7f0
    public final void g(List<Integer> list) throws IOException {
        int w;
        int w2;
        boolean z = list instanceof p;
        g gVar = this.a;
        if (!z) {
            int i = this.b & 7;
            if (i == 0) {
                do {
                    list.add(Integer.valueOf(gVar.o()));
                    if (gVar.e()) {
                        return;
                    } else {
                        w = gVar.w();
                    }
                } while (w == this.b);
                this.d = w;
                return;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.g();
            }
            int d = gVar.d() + gVar.x();
            do {
                list.add(Integer.valueOf(gVar.o()));
            } while (gVar.d() < d);
            Q(d);
            return;
        }
        p pVar = (p) list;
        int i2 = this.b & 7;
        if (i2 == 0) {
            do {
                pVar.addInt(gVar.o());
                if (gVar.e()) {
                    return;
                } else {
                    w2 = gVar.w();
                }
            } while (w2 == this.b);
            this.d = w2;
            return;
        }
        if (i2 != 2) {
            throw InvalidProtocolBufferException.g();
        }
        int d2 = gVar.d() + gVar.x();
        do {
            pVar.addInt(gVar.o());
        } while (gVar.d() < d2);
        Q(d2);
    }

    @Override // xsna.v7f0
    public final int getTag() {
        return this.b;
    }

    @Override // xsna.v7f0
    public final <T> T h(a0<T> a0Var, k kVar) throws IOException {
        R(2);
        return (T) O(a0Var, kVar);
    }

    @Override // xsna.v7f0
    public final boolean i() throws IOException {
        int i;
        g gVar = this.a;
        if (gVar.e() || (i = this.b) == this.c) {
            return false;
        }
        return gVar.z(i);
    }

    @Override // xsna.v7f0
    public final long j() throws IOException {
        R(0);
        return this.a.p();
    }

    @Override // xsna.v7f0
    public final boolean k() throws IOException {
        R(0);
        return this.a.h();
    }

    @Override // xsna.v7f0
    public final void l(List<Long> list) throws IOException {
        int w;
        int w2;
        boolean z = list instanceof u;
        g gVar = this.a;
        if (!z) {
            int i = this.b & 7;
            if (i == 0) {
                do {
                    list.add(Long.valueOf(gVar.y()));
                    if (gVar.e()) {
                        return;
                    } else {
                        w = gVar.w();
                    }
                } while (w == this.b);
                this.d = w;
                return;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.g();
            }
            int d = gVar.d() + gVar.x();
            do {
                list.add(Long.valueOf(gVar.y()));
            } while (gVar.d() < d);
            Q(d);
            return;
        }
        u uVar = (u) list;
        int i2 = this.b & 7;
        if (i2 == 0) {
            do {
                uVar.addLong(gVar.y());
                if (gVar.e()) {
                    return;
                } else {
                    w2 = gVar.w();
                }
            } while (w2 == this.b);
            this.d = w2;
            return;
        }
        if (i2 != 2) {
            throw InvalidProtocolBufferException.g();
        }
        int d2 = gVar.d() + gVar.x();
        do {
            uVar.addLong(gVar.y());
        } while (gVar.d() < d2);
        Q(d2);
    }

    @Override // xsna.v7f0
    public final void m(List<String> list) throws IOException {
        P(list, true);
    }

    @Override // xsna.v7f0
    public final int n() throws IOException {
        R(0);
        return this.a.o();
    }

    @Override // xsna.v7f0
    public final void o(List<Long> list) throws IOException {
        int w;
        int w2;
        boolean z = list instanceof u;
        g gVar = this.a;
        if (!z) {
            int i = this.b & 7;
            if (i == 1) {
                do {
                    list.add(Long.valueOf(gVar.m()));
                    if (gVar.e()) {
                        return;
                    } else {
                        w = gVar.w();
                    }
                } while (w == this.b);
                this.d = w;
                return;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.g();
            }
            int x = gVar.x();
            T(x);
            int d = gVar.d() + x;
            do {
                list.add(Long.valueOf(gVar.m()));
            } while (gVar.d() < d);
            return;
        }
        u uVar = (u) list;
        int i2 = this.b & 7;
        if (i2 == 1) {
            do {
                uVar.addLong(gVar.m());
                if (gVar.e()) {
                    return;
                } else {
                    w2 = gVar.w();
                }
            } while (w2 == this.b);
            this.d = w2;
            return;
        }
        if (i2 != 2) {
            throw InvalidProtocolBufferException.g();
        }
        int x2 = gVar.x();
        T(x2);
        int d2 = gVar.d() + x2;
        do {
            uVar.addLong(gVar.m());
        } while (gVar.d() < d2);
    }

    @Override // xsna.v7f0
    public final int p() throws IOException {
        R(5);
        return this.a.l();
    }

    @Override // xsna.v7f0
    public final String q() throws IOException {
        R(2);
        return this.a.u();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.v7f0
    public final <T> void r(List<T> list, a0<T> a0Var, k kVar) throws IOException {
        int w;
        int i = this.b;
        if ((i & 7) != 3) {
            throw InvalidProtocolBufferException.g();
        }
        do {
            list.add(N(a0Var, kVar));
            g gVar = this.a;
            if (gVar.e() || this.d != 0) {
                return;
            } else {
                w = gVar.w();
            }
        } while (w == i);
        this.d = w;
    }

    @Override // xsna.v7f0
    public final double readDouble() throws IOException {
        R(1);
        return this.a.j();
    }

    @Override // xsna.v7f0
    public final float readFloat() throws IOException {
        R(5);
        return this.a.n();
    }

    @Override // xsna.v7f0
    public final void s(List<Long> list) throws IOException {
        int w;
        int w2;
        boolean z = list instanceof u;
        g gVar = this.a;
        if (!z) {
            int i = this.b & 7;
            if (i == 0) {
                do {
                    list.add(Long.valueOf(gVar.t()));
                    if (gVar.e()) {
                        return;
                    } else {
                        w = gVar.w();
                    }
                } while (w == this.b);
                this.d = w;
                return;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.g();
            }
            int d = gVar.d() + gVar.x();
            do {
                list.add(Long.valueOf(gVar.t()));
            } while (gVar.d() < d);
            Q(d);
            return;
        }
        u uVar = (u) list;
        int i2 = this.b & 7;
        if (i2 == 0) {
            do {
                uVar.addLong(gVar.t());
                if (gVar.e()) {
                    return;
                } else {
                    w2 = gVar.w();
                }
            } while (w2 == this.b);
            this.d = w2;
            return;
        }
        if (i2 != 2) {
            throw InvalidProtocolBufferException.g();
        }
        int d2 = gVar.d() + gVar.x();
        do {
            uVar.addLong(gVar.t());
        } while (gVar.d() < d2);
        Q(d2);
    }

    @Override // xsna.v7f0
    public final long t() throws IOException {
        R(1);
        return this.a.r();
    }

    @Override // xsna.v7f0
    public final int u() throws IOException {
        R(0);
        return this.a.s();
    }

    @Override // xsna.v7f0
    public final ByteString v() throws IOException {
        R(2);
        return this.a.i();
    }

    @Override // xsna.v7f0
    public final long w() throws IOException {
        R(0);
        return this.a.y();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.v7f0
    public final <T> void x(List<T> list, a0<T> a0Var, k kVar) throws IOException {
        int w;
        int i = this.b;
        if ((i & 7) != 2) {
            throw InvalidProtocolBufferException.g();
        }
        do {
            list.add(O(a0Var, kVar));
            g gVar = this.a;
            if (gVar.e() || this.d != 0) {
                return;
            } else {
                w = gVar.w();
            }
        } while (w == i);
        this.d = w;
    }

    @Override // xsna.v7f0
    public final void y(List<Integer> list) throws IOException {
        int w;
        int w2;
        boolean z = list instanceof p;
        g gVar = this.a;
        if (!z) {
            int i = this.b & 7;
            if (i == 2) {
                int x = gVar.x();
                S(x);
                int d = gVar.d() + x;
                do {
                    list.add(Integer.valueOf(gVar.l()));
                } while (gVar.d() < d);
                return;
            }
            if (i != 5) {
                throw InvalidProtocolBufferException.g();
            }
            do {
                list.add(Integer.valueOf(gVar.l()));
                if (gVar.e()) {
                    return;
                } else {
                    w = gVar.w();
                }
            } while (w == this.b);
            this.d = w;
            return;
        }
        p pVar = (p) list;
        int i2 = this.b & 7;
        if (i2 == 2) {
            int x2 = gVar.x();
            S(x2);
            int d2 = gVar.d() + x2;
            do {
                pVar.addInt(gVar.l());
            } while (gVar.d() < d2);
            return;
        }
        if (i2 != 5) {
            throw InvalidProtocolBufferException.g();
        }
        do {
            pVar.addInt(gVar.l());
            if (gVar.e()) {
                return;
            } else {
                w2 = gVar.w();
            }
        } while (w2 == this.b);
        this.d = w2;
    }

    @Override // xsna.v7f0
    public final int z() throws IOException {
        int i = this.d;
        if (i != 0) {
            this.b = i;
            this.d = 0;
        } else {
            this.b = this.a.w();
        }
        int i2 = this.b;
        if (i2 == 0 || i2 == this.c) {
            return Integer.MAX_VALUE;
        }
        return i2 >>> 3;
    }
}
