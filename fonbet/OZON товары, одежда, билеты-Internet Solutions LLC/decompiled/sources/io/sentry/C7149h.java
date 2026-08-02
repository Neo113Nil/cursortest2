package io.sentry;

import io.sentry.protocol.C7185a;
import io.sentry.protocol.C7186b;
import io.sentry.protocol.C7187c;
import io.sentry.protocol.C7189e;
import io.sentry.protocol.C7191g;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.sentry.h, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C7149h extends C7187c {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C7187c f67928c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C7187c f67929d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final C7187c f67930e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final EnumC7225y1 f67931f;

    /* renamed from: io.sentry.h$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f67932a;

        static {
            int[] iArr = new int[EnumC7225y1.values().length];
            f67932a = iArr;
            try {
                iArr[EnumC7225y1.CURRENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f67932a[EnumC7225y1.ISOLATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f67932a[EnumC7225y1.GLOBAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public C7149h(@NotNull C7187c c7187c, @NotNull C7187c c7187c2, @NotNull C7187c c7187c3, @NotNull EnumC7225y1 enumC7225y1) {
        this.f67928c = c7187c;
        this.f67929d = c7187c2;
        this.f67930e = c7187c3;
        this.f67931f = enumC7225y1;
    }

    @NotNull
    private C7187c A() {
        C7187c c7187c = new C7187c();
        c7187c.m(this.f67928c);
        c7187c.m(this.f67929d);
        c7187c.m(this.f67930e);
        return c7187c;
    }

    @NotNull
    private C7187c z() {
        int i11 = a.f67932a[this.f67931f.ordinal()];
        C7187c c7187c = this.f67930e;
        return i11 != 1 ? i11 != 2 ? i11 != 3 ? c7187c : this.f67928c : this.f67929d : c7187c;
    }

    @Override // io.sentry.protocol.C7187c
    public final boolean a(Object obj) {
        throw null;
    }

    @Override // io.sentry.protocol.C7187c
    @NotNull
    public final Set<Map.Entry<String, Object>> b() {
        return A().b();
    }

    @Override // io.sentry.protocol.C7187c
    public final Object c(String str) {
        Object c11 = this.f67930e.c(str);
        if (c11 != null) {
            return c11;
        }
        Object c12 = this.f67929d.c(str);
        return c12 != null ? c12 : this.f67928c.c(str);
    }

    @Override // io.sentry.protocol.C7187c
    public final C7185a d() {
        C7185a d11 = this.f67930e.d();
        if (d11 != null) {
            return d11;
        }
        C7185a d12 = this.f67929d.d();
        return d12 != null ? d12 : this.f67928c.d();
    }

    @Override // io.sentry.protocol.C7187c
    public final C7189e e() {
        C7189e e11 = this.f67930e.e();
        if (e11 != null) {
            return e11;
        }
        C7189e e12 = this.f67929d.e();
        return e12 != null ? e12 : this.f67928c.e();
    }

    @Override // io.sentry.protocol.C7187c
    public final C7191g f() {
        C7191g f7 = this.f67930e.f();
        if (f7 != null) {
            return f7;
        }
        C7191g f11 = this.f67929d.f();
        return f11 != null ? f11 : this.f67928c.f();
    }

    @Override // io.sentry.protocol.C7187c
    public final io.sentry.protocol.n h() {
        io.sentry.protocol.n h11 = this.f67930e.h();
        if (h11 != null) {
            return h11;
        }
        io.sentry.protocol.n h12 = this.f67929d.h();
        return h12 != null ? h12 : this.f67928c.h();
    }

    @Override // io.sentry.protocol.C7187c
    public final io.sentry.protocol.v i() {
        io.sentry.protocol.v i11 = this.f67930e.i();
        if (i11 != null) {
            return i11;
        }
        io.sentry.protocol.v i12 = this.f67929d.i();
        return i12 != null ? i12 : this.f67928c.i();
    }

    @Override // io.sentry.protocol.C7187c
    public final j3 j() {
        j3 j11 = this.f67930e.j();
        if (j11 != null) {
            return j11;
        }
        j3 j12 = this.f67929d.j();
        return j12 != null ? j12 : this.f67928c.j();
    }

    @Override // io.sentry.protocol.C7187c
    @NotNull
    public final Enumeration<String> k() {
        return A().k();
    }

    @Override // io.sentry.protocol.C7187c
    public final Object l(Object obj, String str) {
        return z().l(obj, str);
    }

    @Override // io.sentry.protocol.C7187c
    public final void m(C7187c c7187c) {
        z().m(c7187c);
    }

    @Override // io.sentry.protocol.C7187c
    public final Object n() {
        throw null;
    }

    @Override // io.sentry.protocol.C7187c
    public final void o(@NotNull C7185a c7185a) {
        z().o(c7185a);
    }

    @Override // io.sentry.protocol.C7187c
    public final void p(@NotNull C7186b c7186b) {
        z().p(c7186b);
    }

    @Override // io.sentry.protocol.C7187c
    public final void q(@NotNull C7189e c7189e) {
        z().q(c7189e);
    }

    @Override // io.sentry.protocol.C7187c
    public final void r(@NotNull C7191g c7191g) {
        throw null;
    }

    @Override // io.sentry.protocol.C7187c
    public final void s(@NotNull io.sentry.protocol.j jVar) {
        z().s(jVar);
    }

    @Override // io.sentry.protocol.C7187c, io.sentry.InterfaceC7220x0
    public final void serialize(@NotNull InterfaceC7135d1 interfaceC7135d1, @NotNull ILogger iLogger) throws IOException {
        A().serialize(interfaceC7135d1, iLogger);
    }

    @Override // io.sentry.protocol.C7187c
    public final void t(@NotNull io.sentry.protocol.n nVar) {
        z().t(nVar);
    }

    @Override // io.sentry.protocol.C7187c
    public final void u(@NotNull io.sentry.protocol.p pVar) {
        z().u(pVar);
    }

    @Override // io.sentry.protocol.C7187c
    public final void v(@NotNull io.sentry.protocol.v vVar) {
        z().v(vVar);
    }

    @Override // io.sentry.protocol.C7187c
    public final void w(@NotNull io.sentry.protocol.B b11) {
        z().w(b11);
    }

    @Override // io.sentry.protocol.C7187c
    public final void x(@NotNull j3 j3Var) {
        z().x(j3Var);
    }
}
