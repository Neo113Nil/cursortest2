package io.sentry;

import io.sentry.protocol.C4803e;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class I0 implements D, Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final F3 f50382a;

    /* renamed from: b, reason: collision with root package name */
    public final K3 f50383b;

    /* renamed from: c, reason: collision with root package name */
    public final C4738d3 f50384c;

    /* renamed from: d, reason: collision with root package name */
    public volatile M f50385d = null;

    public I0(F3 f32) {
        this.f50382a = f32;
        J3 j32 = new J3(f32);
        this.f50384c = new C4738d3(j32);
        this.f50383b = new K3(j32);
    }

    private void A0(AbstractC4810q2 abstractC4810q2) {
        C4803e c10 = C4803e.c(abstractC4810q2.D(), this.f50382a);
        if (c10 != null) {
            abstractC4810q2.T(c10);
        }
    }

    private void D0(AbstractC4810q2 abstractC4810q2) {
        if (abstractC4810q2.E() == null) {
            abstractC4810q2.U(this.f50382a.getDist());
        }
    }

    private void U(AbstractC4810q2 abstractC4810q2) {
        io.sentry.protocol.F Q10 = abstractC4810q2.Q();
        if (Q10 == null) {
            Q10 = new io.sentry.protocol.F();
            abstractC4810q2.f0(Q10);
        }
        if (Q10.j() == null && this.f50382a.isSendDefaultPii()) {
            Q10.n("{{auto}}");
        }
    }

    private void Y1(AbstractC4810q2 abstractC4810q2) {
        if (abstractC4810q2.J() == null) {
            abstractC4810q2.Z(this.f50382a.getRelease());
        }
    }

    private void Z1(AbstractC4810q2 abstractC4810q2) {
        if (abstractC4810q2.L() == null) {
            abstractC4810q2.b0(this.f50382a.getSdkVersion());
        }
    }

    private void m1(AbstractC4810q2 abstractC4810q2) {
        if (abstractC4810q2.F() == null) {
            abstractC4810q2.V(this.f50382a.getEnvironment());
        }
    }

    public final void B() {
        if (this.f50385d == null) {
            this.f50385d = M.e();
        }
    }

    public final boolean J(J j10) {
        return io.sentry.util.l.f(j10, io.sentry.hints.e.class);
    }

    public final void T1(AbstractC4810q2 abstractC4810q2) {
        if (abstractC4810q2.I() == null) {
            abstractC4810q2.Y("java");
        }
    }

    public final void a2(AbstractC4810q2 abstractC4810q2) {
        if (abstractC4810q2.M() == null) {
            abstractC4810q2.c0(this.f50382a.getServerName());
        }
        if (this.f50382a.isAttachServerName() && abstractC4810q2.M() == null) {
            B();
            if (this.f50385d != null) {
                abstractC4810q2.c0(this.f50385d.d());
            }
        }
    }

    public final void b2(AbstractC4810q2 abstractC4810q2) {
        if (abstractC4810q2.N() == null) {
            abstractC4810q2.e0(this.f50382a.getTags());
            return;
        }
        for (Map.Entry<String, String> entry : this.f50382a.getTags().entrySet()) {
            if (!abstractC4810q2.N().containsKey(entry.getKey())) {
                abstractC4810q2.d0(entry.getKey(), entry.getValue());
            }
        }
    }

    public final void c2(C4733c3 c4733c3, J j10) {
        boolean z10;
        if (c4733c3.u0() == null) {
            List<io.sentry.protocol.t> p02 = c4733c3.p0();
            ArrayList arrayList = null;
            if (p02 != null && !p02.isEmpty()) {
                for (io.sentry.protocol.t tVar : p02) {
                    if (tVar.g() != null && tVar.j() != null) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(tVar.j());
                    }
                }
            }
            if (this.f50382a.isAttachThreads() || io.sentry.util.l.f(j10, io.sentry.hints.a.class)) {
                Object e10 = io.sentry.util.l.e(j10);
                boolean isAttachStacktrace = this.f50382a.isAttachStacktrace();
                if (e10 instanceof io.sentry.hints.a) {
                    z10 = ((io.sentry.hints.a) e10).f();
                    isAttachStacktrace = true;
                } else {
                    z10 = false;
                }
                c4733c3.F0(this.f50383b.b(arrayList, z10, isAttachStacktrace));
                return;
            }
            if (this.f50382a.isAttachStacktrace()) {
                if ((p02 == null || p02.isEmpty()) && !J(j10)) {
                    c4733c3.F0(this.f50383b.a(this.f50382a.isAttachStacktrace()));
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f50385d != null) {
            this.f50385d.c();
        }
    }

    @Override // io.sentry.D
    public G3 d(G3 g32, J j10) {
        z0(g32);
        if (d2(g32, j10)) {
            w0(g32);
            io.sentry.protocol.s x10 = this.f50382a.getSessionReplay().x();
            if (x10 != null) {
                g32.b0(x10);
            }
        }
        return g32;
    }

    public final boolean d2(AbstractC4810q2 abstractC4810q2, J j10) {
        if (io.sentry.util.l.n(j10)) {
            return true;
        }
        this.f50382a.getLogger().c(EnumC4788n3.DEBUG, "Event was cached so not applying data relevant to the current app execution/version: %s", abstractC4810q2.G());
        return false;
    }

    @Override // io.sentry.D
    public C4733c3 k(C4733c3 c4733c3, J j10) {
        z0(c4733c3);
        n1(c4733c3);
        A0(c4733c3);
        y1(c4733c3);
        if (d2(c4733c3, j10)) {
            w0(c4733c3);
            c2(c4733c3, j10);
        }
        return c4733c3;
    }

    public final void n1(C4733c3 c4733c3) {
        Throwable P10 = c4733c3.P();
        if (P10 != null) {
            c4733c3.A0(this.f50384c.d(P10));
        }
    }

    @Override // io.sentry.D
    public io.sentry.protocol.B r(io.sentry.protocol.B b10, J j10) {
        z0(b10);
        A0(b10);
        if (d2(b10, j10)) {
            w0(b10);
        }
        return b10;
    }

    public final void w0(AbstractC4810q2 abstractC4810q2) {
        Y1(abstractC4810q2);
        m1(abstractC4810q2);
        a2(abstractC4810q2);
        D0(abstractC4810q2);
        Z1(abstractC4810q2);
        b2(abstractC4810q2);
        U(abstractC4810q2);
    }

    public final void y1(C4733c3 c4733c3) {
        Map a10 = this.f50382a.getModulesLoader().a();
        if (a10 == null) {
            return;
        }
        Map t02 = c4733c3.t0();
        if (t02 == null) {
            c4733c3.E0(a10);
        } else {
            t02.putAll(a10);
        }
    }

    public final void z0(AbstractC4810q2 abstractC4810q2) {
        T1(abstractC4810q2);
    }
}
