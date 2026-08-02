package io.sentry;

import io.sentry.protocol.C4799a;
import io.sentry.protocol.C4801c;
import io.sentry.protocol.C4802d;
import io.sentry.protocol.C4804f;
import io.sentry.protocol.C4806h;
import java.util.Enumeration;
import java.util.Set;

/* renamed from: io.sentry.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4754h extends C4802d {

    /* renamed from: c, reason: collision with root package name */
    public final C4802d f52089c;

    /* renamed from: d, reason: collision with root package name */
    public final C4802d f52090d;

    /* renamed from: e, reason: collision with root package name */
    public final C4802d f52091e;

    /* renamed from: f, reason: collision with root package name */
    public final P1 f52092f;

    /* renamed from: io.sentry.h$a */
    public static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$io$sentry$ScopeType;

        static {
            int[] iArr = new int[P1.values().length];
            $SwitchMap$io$sentry$ScopeType = iArr;
            try {
                iArr[P1.CURRENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$sentry$ScopeType[P1.ISOLATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$sentry$ScopeType[P1.GLOBAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public C4754h(C4802d c4802d, C4802d c4802d2, C4802d c4802d3, P1 p12) {
        this.f52089c = c4802d;
        this.f52090d = c4802d2;
        this.f52091e = c4802d3;
        this.f52092f = p12;
    }

    @Override // io.sentry.protocol.C4802d
    public void A(a4 a4Var) {
        C().A(a4Var);
    }

    public final C4802d C() {
        int i10 = a.$SwitchMap$io$sentry$ScopeType[this.f52092f.ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? this.f52091e : this.f52089c : this.f52090d : this.f52091e;
    }

    public final C4802d D() {
        C4802d c4802d = new C4802d();
        c4802d.m(this.f52089c);
        c4802d.m(this.f52090d);
        c4802d.m(this.f52091e);
        return c4802d;
    }

    @Override // io.sentry.protocol.C4802d
    public boolean a(Object obj) {
        return this.f52089c.a(obj) || this.f52090d.a(obj) || this.f52091e.a(obj);
    }

    @Override // io.sentry.protocol.C4802d
    public Set b() {
        return D().b();
    }

    @Override // io.sentry.protocol.C4802d
    public Object c(Object obj) {
        Object c10 = this.f52091e.c(obj);
        if (c10 != null) {
            return c10;
        }
        Object c11 = this.f52090d.c(obj);
        return c11 != null ? c11 : this.f52089c.c(obj);
    }

    @Override // io.sentry.protocol.C4802d
    public C4799a d() {
        C4799a d10 = this.f52091e.d();
        if (d10 != null) {
            return d10;
        }
        C4799a d11 = this.f52090d.d();
        return d11 != null ? d11 : this.f52089c.d();
    }

    @Override // io.sentry.protocol.C4802d
    public C4804f e() {
        C4804f e10 = this.f52091e.e();
        if (e10 != null) {
            return e10;
        }
        C4804f e11 = this.f52090d.e();
        return e11 != null ? e11 : this.f52089c.e();
    }

    @Override // io.sentry.protocol.C4802d
    public C4806h f() {
        C4806h f10 = this.f52091e.f();
        if (f10 != null) {
            return f10;
        }
        C4806h f11 = this.f52090d.f();
        return f11 != null ? f11 : this.f52089c.f();
    }

    @Override // io.sentry.protocol.C4802d
    public io.sentry.protocol.o h() {
        io.sentry.protocol.o h10 = this.f52091e.h();
        if (h10 != null) {
            return h10;
        }
        io.sentry.protocol.o h11 = this.f52090d.h();
        return h11 != null ? h11 : this.f52089c.h();
    }

    @Override // io.sentry.protocol.C4802d
    public io.sentry.protocol.w i() {
        io.sentry.protocol.w i10 = this.f52091e.i();
        if (i10 != null) {
            return i10;
        }
        io.sentry.protocol.w i11 = this.f52090d.i();
        return i11 != null ? i11 : this.f52089c.i();
    }

    @Override // io.sentry.protocol.C4802d
    public a4 j() {
        a4 j10 = this.f52091e.j();
        if (j10 != null) {
            return j10;
        }
        a4 j11 = this.f52090d.j();
        return j11 != null ? j11 : this.f52089c.j();
    }

    @Override // io.sentry.protocol.C4802d
    public Enumeration k() {
        return D().k();
    }

    @Override // io.sentry.protocol.C4802d
    public Object l(String str, Object obj) {
        return C().l(str, obj);
    }

    @Override // io.sentry.protocol.C4802d
    public void m(C4802d c4802d) {
        C().m(c4802d);
    }

    @Override // io.sentry.protocol.C4802d
    public Object n(Object obj) {
        return C().n(obj);
    }

    @Override // io.sentry.protocol.C4802d
    public void o(C4799a c4799a) {
        C().o(c4799a);
    }

    @Override // io.sentry.protocol.C4802d
    public void q(C4801c c4801c) {
        C().q(c4801c);
    }

    @Override // io.sentry.protocol.C4802d
    public void r(C4804f c4804f) {
        C().r(c4804f);
    }

    @Override // io.sentry.protocol.C4802d
    public void s(C4806h c4806h) {
        C().s(c4806h);
    }

    @Override // io.sentry.protocol.C4802d, io.sentry.G0
    public void serialize(InterfaceC4813r1 interfaceC4813r1, ILogger iLogger) {
        D().serialize(interfaceC4813r1, iLogger);
    }

    @Override // io.sentry.protocol.C4802d
    public void u(io.sentry.protocol.k kVar) {
        C().u(kVar);
    }

    @Override // io.sentry.protocol.C4802d
    public void v(io.sentry.protocol.o oVar) {
        C().v(oVar);
    }

    @Override // io.sentry.protocol.C4802d
    public void x(io.sentry.protocol.q qVar) {
        C().x(qVar);
    }

    @Override // io.sentry.protocol.C4802d
    public void y(io.sentry.protocol.w wVar) {
        C().y(wVar);
    }

    @Override // io.sentry.protocol.C4802d
    public void z(io.sentry.protocol.C c10) {
        C().z(c10);
    }
}
