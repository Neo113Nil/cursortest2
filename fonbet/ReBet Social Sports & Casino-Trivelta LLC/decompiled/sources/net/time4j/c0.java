package net.time4j;

import qi.EnumC6185f;
import qi.InterfaceC6186g;

/* loaded from: classes5.dex */
public final class c0 implements oi.o, InterfaceC6186g {

    /* renamed from: a, reason: collision with root package name */
    public final A f57732a;

    /* renamed from: b, reason: collision with root package name */
    public final net.time4j.tz.l f57733b;

    /* renamed from: c, reason: collision with root package name */
    public final transient H f57734c;

    public c0(A a10, net.time4j.tz.l lVar) {
        this.f57733b = lVar;
        net.time4j.tz.p B10 = lVar.B(a10);
        if (!a10.d0() || (B10.i() == 0 && B10.h() % 60 == 0)) {
            this.f57732a = a10;
            this.f57734c = H.O(a10, B10);
        } else {
            throw new IllegalArgumentException("Leap second can only be represented  with timezone-offset in full minutes: " + B10);
        }
    }

    public static c0 l(A a10, net.time4j.tz.l lVar) {
        return new c0(a10, lVar);
    }

    @Override // li.InterfaceC5472f
    public int a() {
        return this.f57732a.a();
    }

    public net.time4j.tz.p b() {
        return this.f57733b.B(this.f57732a);
    }

    @Override // oi.o
    public Object c(oi.p pVar) {
        Object c10 = this.f57734c.f(pVar) ? this.f57734c.c(pVar) : this.f57732a.c(pVar);
        if (pVar == G.f57594x && this.f57734c.n() >= 1972) {
            H h10 = (H) this.f57734c.y(pVar, c10);
            if (!this.f57733b.K(h10, h10) && h10.S(this.f57733b).h0(1L, N.SECONDS).d0()) {
                return pVar.getType().cast(60);
            }
        }
        return c10;
    }

    @Override // oi.o
    public boolean d() {
        return true;
    }

    @Override // oi.o
    public int e(oi.p pVar) {
        if (this.f57732a.d0() && pVar == G.f57594x) {
            return 60;
        }
        int e10 = this.f57734c.e(pVar);
        return e10 == Integer.MIN_VALUE ? this.f57732a.e(pVar) : e10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c0) {
            c0 c0Var = (c0) obj;
            if (this.f57732a.equals(c0Var.f57732a) && this.f57733b.equals(c0Var.f57733b)) {
                return true;
            }
        }
        return false;
    }

    @Override // oi.o
    public boolean f(oi.p pVar) {
        return this.f57734c.f(pVar) || this.f57732a.f(pVar);
    }

    @Override // qi.InterfaceC6186g
    public int g(EnumC6185f enumC6185f) {
        return this.f57732a.g(enumC6185f);
    }

    @Override // qi.InterfaceC6186g
    public long h(EnumC6185f enumC6185f) {
        return this.f57732a.h(enumC6185f);
    }

    public int hashCode() {
        return this.f57732a.hashCode() ^ this.f57733b.hashCode();
    }

    public boolean i() {
        return this.f57732a.d0();
    }

    @Override // oi.o
    public Object j(oi.p pVar) {
        return (this.f57732a.d0() && pVar == G.f57594x) ? pVar.getType().cast(60) : this.f57734c.f(pVar) ? this.f57734c.j(pVar) : this.f57732a.j(pVar);
    }

    @Override // li.InterfaceC5472f
    public long k() {
        return this.f57732a.k();
    }

    @Override // oi.o
    public Object m(oi.p pVar) {
        return this.f57734c.f(pVar) ? this.f57734c.m(pVar) : this.f57732a.m(pVar);
    }

    @Override // oi.o
    public net.time4j.tz.k r() {
        return this.f57733b.z();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append(this.f57734c.P());
        sb2.append('T');
        int q10 = this.f57734c.q();
        if (q10 < 10) {
            sb2.append('0');
        }
        sb2.append(q10);
        sb2.append(':');
        int l10 = this.f57734c.l();
        if (l10 < 10) {
            sb2.append('0');
        }
        sb2.append(l10);
        sb2.append(':');
        if (i()) {
            sb2.append("60");
        } else {
            int i10 = this.f57734c.i();
            if (i10 < 10) {
                sb2.append('0');
            }
            sb2.append(i10);
        }
        int a10 = this.f57734c.a();
        if (a10 != 0) {
            G.G0(sb2, a10);
        }
        sb2.append(b());
        net.time4j.tz.k r10 = r();
        if (!(r10 instanceof net.time4j.tz.p)) {
            sb2.append('[');
            sb2.append(r10.a());
            sb2.append(']');
        }
        return sb2.toString();
    }
}
