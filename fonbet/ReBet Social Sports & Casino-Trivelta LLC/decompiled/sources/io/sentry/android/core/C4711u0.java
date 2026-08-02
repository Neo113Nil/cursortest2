package io.sentry.android.core;

import android.content.Context;
import android.content.pm.PackageInfo;
import io.sentry.AbstractC4779m;
import io.sentry.AbstractC4810q2;
import io.sentry.C4733c3;
import io.sentry.EnumC4788n3;
import io.sentry.G3;
import io.sentry.android.core.AbstractC4704q0;
import io.sentry.protocol.C4799a;
import io.sentry.util.p;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;

/* renamed from: io.sentry.android.core.u0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4711u0 implements io.sentry.D {

    /* renamed from: a, reason: collision with root package name */
    public final Context f51309a;

    /* renamed from: b, reason: collision with root package name */
    public final C4683i0 f51310b;

    /* renamed from: c, reason: collision with root package name */
    public final SentryAndroidOptions f51311c;

    /* renamed from: d, reason: collision with root package name */
    public final Future f51312d;

    /* renamed from: e, reason: collision with root package name */
    public final io.sentry.util.p f51313e = new io.sentry.util.p(new p.a() { // from class: io.sentry.android.core.s0
        @Override // io.sentry.util.p.a
        public final Object a() {
            String l10;
            l10 = AbstractC4704q0.l(io.sentry.U0.e());
            return l10;
        }
    });

    /* renamed from: io.sentry.android.core.u0$b */
    public static final class b implements ThreadFactory {
        public b() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, "SentryDeviceInfoCache");
            thread.setDaemon(true);
            return thread;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C4711u0(Context context, C4683i0 c4683i0, final SentryAndroidOptions sentryAndroidOptions) {
        this.f51309a = (Context) io.sentry.util.w.c(AbstractC4704q0.g(context), "The application context is required.");
        this.f51310b = (C4683i0) io.sentry.util.w.c(c4683i0, "The BuildInfoProvider is required.");
        this.f51311c = (SentryAndroidOptions) io.sentry.util.w.c(sentryAndroidOptions, "The options object is required.");
        Future future = null;
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new b());
        try {
            future = newSingleThreadExecutor.submit(new Callable() { // from class: io.sentry.android.core.t0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    C4713v0 i10;
                    i10 = C4713v0.i(C4711u0.this.f51309a, sentryAndroidOptions);
                    return i10;
                }
            });
        } catch (RejectedExecutionException e10) {
            sentryAndroidOptions.getLogger().b(EnumC4788n3.WARNING, "Device info caching task rejected.", e10);
        }
        this.f51312d = future;
        newSingleThreadExecutor.shutdown();
    }

    public static void c(C4733c3 c4733c3) {
        io.sentry.protocol.z i10;
        List e10;
        List p02 = c4733c3.p0();
        if (p02 == null || p02.size() <= 1) {
            return;
        }
        io.sentry.protocol.t tVar = (io.sentry.protocol.t) p02.get(p02.size() - 1);
        if (!"java.lang".equals(tVar.h()) || (i10 = tVar.i()) == null || (e10 = i10.e()) == null) {
            return;
        }
        Iterator it = e10.iterator();
        while (it.hasNext()) {
            if ("com.android.internal.os.RuntimeInit$MethodAndArgsCaller".equals(((io.sentry.protocol.y) it.next()).v())) {
                Collections.reverse(p02);
                return;
            }
        }
    }

    private void e(AbstractC4810q2 abstractC4810q2) {
        String str;
        io.sentry.protocol.o h10 = abstractC4810q2.C().h();
        Future future = this.f51312d;
        if (future != null) {
            try {
                abstractC4810q2.C().v(((C4713v0) future.get()).j());
            } catch (Throwable th2) {
                this.f51311c.getLogger().b(EnumC4788n3.ERROR, "Failed to retrieve os system", th2);
            }
        } else {
            this.f51311c.getLogger().c(EnumC4788n3.ERROR, "Failed to retrieve device info", new Object[0]);
        }
        if (h10 != null) {
            String g10 = h10.g();
            if (g10 == null || g10.isEmpty()) {
                str = "os_1";
            } else {
                str = "os_" + g10.trim().toLowerCase(Locale.ROOT);
            }
            abstractC4810q2.C().l(str, h10);
        }
    }

    private void f(AbstractC4810q2 abstractC4810q2) {
        io.sentry.protocol.F Q10 = abstractC4810q2.Q();
        if (Q10 == null) {
            Q10 = new io.sentry.protocol.F();
            abstractC4810q2.f0(Q10);
        }
        if (Q10.i() == null) {
            Q10.m(D0.a(this.f51309a));
        }
        if (Q10.j() == null && this.f51311c.isSendDefaultPii()) {
            Q10.n("{{auto}}");
        }
    }

    private void n(AbstractC4810q2 abstractC4810q2) {
        Future future = this.f51312d;
        if (future == null) {
            this.f51311c.getLogger().c(EnumC4788n3.ERROR, "Failed to retrieve device info", new Object[0]);
            return;
        }
        try {
            AbstractC4704q0.a l10 = ((C4713v0) future.get()).l();
            if (l10 != null) {
                for (Map.Entry entry : l10.a().entrySet()) {
                    abstractC4810q2.d0((String) entry.getKey(), (String) entry.getValue());
                }
            }
        } catch (Throwable th2) {
            this.f51311c.getLogger().b(EnumC4788n3.ERROR, "Error getting side loaded info.", th2);
        }
    }

    private void o(C4733c3 c4733c3, io.sentry.J j10) {
        if (c4733c3.u0() != null) {
            boolean g10 = io.sentry.util.l.g(j10);
            for (io.sentry.protocol.A a10 : c4733c3.u0()) {
                boolean h10 = io.sentry.android.core.internal.util.k.e().h(a10);
                if (a10.o() == null) {
                    a10.r(Boolean.valueOf(h10));
                }
                if (!g10 && a10.p() == null) {
                    a10.v(Boolean.valueOf(h10));
                }
            }
        }
    }

    private boolean p(AbstractC4810q2 abstractC4810q2, io.sentry.J j10) {
        if (io.sentry.util.l.n(j10)) {
            return true;
        }
        this.f51311c.getLogger().c(EnumC4788n3.DEBUG, "Event was cached so not applying data relevant to the current app execution/version: %s", abstractC4810q2.G());
        return false;
    }

    @Override // io.sentry.D
    public G3 d(G3 g32, io.sentry.J j10) {
        boolean p10 = p(g32, j10);
        if (p10) {
            g(g32, j10);
        }
        i(g32, false, p10);
        return g32;
    }

    public final void g(AbstractC4810q2 abstractC4810q2, io.sentry.J j10) {
        C4799a d10 = abstractC4810q2.C().d();
        if (d10 == null) {
            d10 = new C4799a();
        }
        h(d10, j10);
        m(abstractC4810q2, d10);
        abstractC4810q2.C().o(d10);
    }

    public final void h(C4799a c4799a, io.sentry.J j10) {
        Boolean z02;
        c4799a.o(AbstractC4704q0.i(this.f51309a));
        io.sentry.android.core.performance.n q10 = io.sentry.android.core.performance.m.v().q(this.f51311c);
        if (q10.m()) {
            c4799a.p(AbstractC4779m.o(q10.g()));
        }
        if (io.sentry.util.l.g(j10) || c4799a.l() != null || (z02 = AppState.w0().z0()) == null) {
            return;
        }
        c4799a.r(Boolean.valueOf(!z02.booleanValue()));
    }

    public final void i(AbstractC4810q2 abstractC4810q2, boolean z10, boolean z11) {
        f(abstractC4810q2);
        j(abstractC4810q2, z10, z11);
        n(abstractC4810q2);
    }

    public final void j(AbstractC4810q2 abstractC4810q2, boolean z10, boolean z11) {
        if (abstractC4810q2.C().e() == null) {
            if (this.f51312d != null) {
                try {
                    abstractC4810q2.C().r(((C4713v0) this.f51312d.get()).a(z10, z11));
                } catch (Throwable th2) {
                    this.f51311c.getLogger().b(EnumC4788n3.ERROR, "Failed to retrieve device info", th2);
                }
            } else {
                this.f51311c.getLogger().c(EnumC4788n3.ERROR, "Failed to retrieve device info", new Object[0]);
            }
            e(abstractC4810q2);
        }
    }

    @Override // io.sentry.D
    public C4733c3 k(C4733c3 c4733c3, io.sentry.J j10) {
        boolean p10 = p(c4733c3, j10);
        if (p10) {
            g(c4733c3, j10);
            o(c4733c3, j10);
        }
        i(c4733c3, true, p10);
        c(c4733c3);
        return c4733c3;
    }

    public final void l(AbstractC4810q2 abstractC4810q2, String str) {
        if (abstractC4810q2.E() == null) {
            abstractC4810q2.U(str);
        }
    }

    public final void m(AbstractC4810q2 abstractC4810q2, C4799a c4799a) {
        C4713v0 c4713v0;
        PackageInfo o10 = AbstractC4704q0.o(this.f51309a, 4096, this.f51311c.getLogger(), this.f51310b);
        if (o10 != null) {
            l(abstractC4810q2, AbstractC4704q0.q(o10, this.f51310b));
            Future future = this.f51312d;
            if (future != null) {
                try {
                    c4713v0 = (C4713v0) future.get();
                } catch (Throwable th2) {
                    this.f51311c.getLogger().b(EnumC4788n3.ERROR, "Failed to retrieve device info", th2);
                }
                AbstractC4704q0.x(o10, this.f51310b, c4713v0, c4799a);
            }
            this.f51311c.getLogger().c(EnumC4788n3.ERROR, "Failed to retrieve device info", new Object[0]);
            c4713v0 = null;
            AbstractC4704q0.x(o10, this.f51310b, c4713v0, c4799a);
        }
    }

    @Override // io.sentry.D
    public io.sentry.protocol.B r(io.sentry.protocol.B b10, io.sentry.J j10) {
        boolean p10 = p(b10, j10);
        if (p10) {
            g(b10, j10);
        }
        i(b10, false, p10);
        return b10;
    }
}
