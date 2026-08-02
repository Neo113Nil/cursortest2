package io.sentry;

import java.util.Enumeration;
import java.util.Set;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class i extends io.sentry.protocol.c {

    /* renamed from: c, reason: collision with root package name */
    public final io.sentry.protocol.c f16484c;

    /* renamed from: d, reason: collision with root package name */
    public final io.sentry.protocol.c f16485d;

    /* renamed from: e, reason: collision with root package name */
    public final io.sentry.protocol.c f16486e;

    /* renamed from: f, reason: collision with root package name */
    public final w3 f16487f;

    public i(io.sentry.protocol.c cVar, io.sentry.protocol.c cVar2, io.sentry.protocol.c cVar3, w3 w3Var) {
        this.f16484c = cVar;
        this.f16485d = cVar2;
        this.f16486e = cVar3;
        this.f16487f = w3Var;
    }

    @Override // io.sentry.protocol.c
    public final boolean a(Object obj) {
        throw null;
    }

    @Override // io.sentry.protocol.c
    public final Set b() {
        return y().f16754a.entrySet();
    }

    @Override // io.sentry.protocol.c
    public final Object c(Object obj) {
        Object c2 = this.f16486e.c(obj);
        if (c2 != null) {
            return c2;
        }
        Object c8 = this.f16485d.c(obj);
        return c8 != null ? c8 : this.f16484c.c(obj);
    }

    @Override // io.sentry.protocol.c
    public final io.sentry.protocol.a d() {
        io.sentry.protocol.a d10 = this.f16486e.d();
        if (d10 != null) {
            return d10;
        }
        io.sentry.protocol.a d11 = this.f16485d.d();
        return d11 != null ? d11 : this.f16484c.d();
    }

    @Override // io.sentry.protocol.c
    public final io.sentry.protocol.f e() {
        io.sentry.protocol.f e7 = this.f16486e.e();
        if (e7 != null) {
            return e7;
        }
        io.sentry.protocol.f e9 = this.f16485d.e();
        return e9 != null ? e9 : this.f16484c.e();
    }

    @Override // io.sentry.protocol.c
    public final io.sentry.protocol.h f() {
        io.sentry.protocol.h f6 = this.f16486e.f();
        if (f6 != null) {
            return f6;
        }
        io.sentry.protocol.h f10 = this.f16485d.f();
        return f10 != null ? f10 : this.f16484c.f();
    }

    @Override // io.sentry.protocol.c
    public final io.sentry.protocol.o g() {
        io.sentry.protocol.o g10 = this.f16486e.g();
        if (g10 != null) {
            return g10;
        }
        io.sentry.protocol.o g11 = this.f16485d.g();
        return g11 != null ? g11 : this.f16484c.g();
    }

    @Override // io.sentry.protocol.c
    public final io.sentry.protocol.x h() {
        io.sentry.protocol.x h10 = this.f16486e.h();
        if (h10 != null) {
            return h10;
        }
        io.sentry.protocol.x h11 = this.f16485d.h();
        return h11 != null ? h11 : this.f16484c.h();
    }

    @Override // io.sentry.protocol.c
    public final n6 i() {
        n6 i5 = this.f16486e.i();
        if (i5 != null) {
            return i5;
        }
        n6 i10 = this.f16485d.i();
        return i10 != null ? i10 : this.f16484c.i();
    }

    @Override // io.sentry.protocol.c
    public final Enumeration j() {
        return y().f16754a.keys();
    }

    @Override // io.sentry.protocol.c
    public final Object k(Object obj, String str) {
        return x().k(obj, str);
    }

    @Override // io.sentry.protocol.c
    public final void l(io.sentry.protocol.c cVar) {
        throw null;
    }

    @Override // io.sentry.protocol.c
    public final void m(io.sentry.protocol.a aVar) {
        x().m(aVar);
    }

    @Override // io.sentry.protocol.c
    public final void n(io.sentry.protocol.b bVar) {
        x().n(bVar);
    }

    @Override // io.sentry.protocol.c
    public final void o(io.sentry.protocol.f fVar) {
        x().o(fVar);
    }

    @Override // io.sentry.protocol.c
    public final void p(io.sentry.protocol.h hVar) {
        throw null;
    }

    @Override // io.sentry.protocol.c
    public final void q(io.sentry.protocol.k kVar) {
        x().q(kVar);
    }

    @Override // io.sentry.protocol.c
    public final void r(io.sentry.protocol.o oVar) {
        x().r(oVar);
    }

    @Override // io.sentry.protocol.c
    public final void s(io.sentry.protocol.r rVar) {
        x().s(rVar);
    }

    @Override // io.sentry.protocol.c, io.sentry.c2
    public final void serialize(b3 b3Var, ILogger iLogger) {
        y().serialize(b3Var, iLogger);
    }

    @Override // io.sentry.protocol.c
    public final void t(io.sentry.protocol.x xVar) {
        x().t(xVar);
    }

    @Override // io.sentry.protocol.c
    public final void u(io.sentry.protocol.f0 f0Var) {
        x().u(f0Var);
    }

    @Override // io.sentry.protocol.c
    public final void v(n6 n6Var) {
        x().v(n6Var);
    }

    public final io.sentry.protocol.c x() {
        int i5 = h.f16443a[this.f16487f.ordinal()];
        io.sentry.protocol.c cVar = this.f16486e;
        return i5 != 1 ? i5 != 2 ? i5 != 3 ? cVar : this.f16484c : this.f16485d : cVar;
    }

    public final io.sentry.protocol.c y() {
        io.sentry.protocol.c cVar = new io.sentry.protocol.c();
        cVar.l(this.f16484c);
        cVar.l(this.f16485d);
        cVar.l(this.f16486e);
        return cVar;
    }
}
