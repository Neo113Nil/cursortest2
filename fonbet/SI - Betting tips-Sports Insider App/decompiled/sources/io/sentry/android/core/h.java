package io.sentry.android.core;

import io.sentry.ILogger;
import io.sentry.b5;
import io.sentry.b6;
import io.sentry.d4;
import io.sentry.f3;
import io.sentry.i3;
import io.sentry.j5;
import io.sentry.k4;
import io.sentry.q2;
import io.sentry.u6;
import java.io.File;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class h implements io.sentry.q0, io.sentry.transport.o {

    /* renamed from: a, reason: collision with root package name */
    public final ILogger f15596a;

    /* renamed from: b, reason: collision with root package name */
    public final String f15597b;

    /* renamed from: c, reason: collision with root package name */
    public final int f15598c;

    /* renamed from: d, reason: collision with root package name */
    public final io.sentry.e1 f15599d;

    /* renamed from: e, reason: collision with root package name */
    public final n0 f15600e;

    /* renamed from: g, reason: collision with root package name */
    public final io.sentry.android.core.internal.util.p f15602g;
    public io.sentry.b1 j;

    /* renamed from: k, reason: collision with root package name */
    public Future f15605k;

    /* renamed from: l, reason: collision with root package name */
    public io.sentry.k f15606l;

    /* renamed from: n, reason: collision with root package name */
    public io.sentry.protocol.v f15608n;

    /* renamed from: o, reason: collision with root package name */
    public io.sentry.protocol.v f15609o;

    /* renamed from: p, reason: collision with root package name */
    public final AtomicBoolean f15610p;
    public k4 q;

    /* renamed from: r, reason: collision with root package name */
    public volatile boolean f15611r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f15612s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f15613t;

    /* renamed from: u, reason: collision with root package name */
    public int f15614u;

    /* renamed from: v, reason: collision with root package name */
    public final io.sentry.util.a f15615v;

    /* renamed from: w, reason: collision with root package name */
    public final io.sentry.util.a f15616w;

    /* renamed from: f, reason: collision with root package name */
    public boolean f15601f = false;

    /* renamed from: h, reason: collision with root package name */
    public u f15603h = null;

    /* renamed from: i, reason: collision with root package name */
    public boolean f15604i = false;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f15607m = new ArrayList();

    public h(n0 n0Var, io.sentry.android.core.internal.util.p pVar, ILogger iLogger, String str, int i5, io.sentry.e1 e1Var) {
        io.sentry.protocol.v vVar = io.sentry.protocol.v.f16922b;
        this.f15608n = vVar;
        this.f15609o = vVar;
        this.f15610p = new AtomicBoolean(false);
        this.q = new j5();
        this.f15611r = true;
        this.f15612s = false;
        this.f15613t = false;
        this.f15614u = 0;
        this.f15615v = new io.sentry.util.a();
        this.f15616w = new io.sentry.util.a();
        this.f15596a = iLogger;
        this.f15602g = pVar;
        this.f15600e = n0Var;
        this.f15597b = str;
        this.f15598c = i5;
        this.f15599d = e1Var;
    }

    @Override // io.sentry.transport.o
    public final void C(e5.j jVar) {
        if (jVar.k(io.sentry.l.All) || jVar.k(io.sentry.l.ProfileChunkUi)) {
            this.f15596a.h(b5.WARNING, "SDK is rate limited. Stopping profiler.", new Object[0]);
            h(false);
        }
    }

    @Override // io.sentry.q0
    public final void a(boolean z5) {
        io.sentry.r a7 = this.f15615v.a();
        try {
            this.f15614u = 0;
            this.f15612s = true;
            if (z5) {
                h(false);
                this.f15610p.set(true);
            }
            a7.close();
        } catch (Throwable th2) {
            try {
                a7.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // io.sentry.q0
    public final void b(i3 i3Var) {
        io.sentry.r a7 = this.f15615v.a();
        try {
            int i5 = g.f15583a[i3Var.ordinal()];
            if (i5 == 1) {
                int i10 = this.f15614u - 1;
                this.f15614u = i10;
                if (i10 > 0) {
                    a7.close();
                    return;
                } else {
                    if (i10 < 0) {
                        this.f15614u = 0;
                    }
                    this.f15612s = true;
                }
            } else if (i5 == 2) {
                this.f15612s = true;
            }
            a7.close();
        } catch (Throwable th2) {
            try {
                a7.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // io.sentry.q0
    public final void c(i3 i3Var, u6 u6Var) {
        io.sentry.r a7 = this.f15615v.a();
        try {
            if (this.f15611r) {
                double c2 = io.sentry.util.j.a().c();
                Double profileSessionSampleRate = u6Var.f17153a.getProfileSessionSampleRate();
                this.f15613t = profileSessionSampleRate != null && profileSessionSampleRate.doubleValue() >= c2;
                this.f15611r = false;
            }
            if (!this.f15613t) {
                this.f15596a.h(b5.DEBUG, "Profiler was not started due to sampling decision.", new Object[0]);
                a7.close();
                return;
            }
            int i5 = g.f15583a[i3Var.ordinal()];
            if (i5 == 1) {
                if (this.f15614u < 0) {
                    this.f15614u = 0;
                }
                this.f15614u++;
            } else if (i5 == 2 && this.f15604i) {
                this.f15596a.h(b5.DEBUG, "Profiler is already running.", new Object[0]);
                a7.close();
                return;
            }
            if (!this.f15604i) {
                this.f15596a.h(b5.DEBUG, "Started Profiler.", new Object[0]);
                g();
            }
            a7.close();
        } catch (Throwable th2) {
            try {
                a7.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // io.sentry.q0
    public final void d() {
        this.f15611r = true;
    }

    @Override // io.sentry.q0
    public final io.sentry.protocol.v e() {
        return this.f15608n;
    }

    public final void f() {
        io.sentry.b1 b1Var = this.j;
        if ((b1Var == null || b1Var == q2.f16972b) && d4.d() != q2.f16972b) {
            this.j = d4.d();
            this.f15606l = d4.d().m().getCompositePerformanceCollector();
            e5.j d10 = this.j.d();
            if (d10 != null) {
                ((CopyOnWriteArrayList) d10.f8648e).add(this);
            }
        }
    }

    public final void g() {
        f();
        this.f15600e.getClass();
        boolean z5 = this.f15601f;
        ILogger iLogger = this.f15596a;
        if (!z5) {
            this.f15601f = true;
            String str = this.f15597b;
            if (str == null) {
                iLogger.h(b5.WARNING, "Disabling profiling because no profiling traces dir path is defined in options.", new Object[0]);
            } else {
                int i5 = this.f15598c;
                if (i5 <= 0) {
                    iLogger.h(b5.WARNING, "Disabling profiling because trace rate is set to %d", Integer.valueOf(i5));
                } else {
                    this.f15603h = new u(str, ((int) TimeUnit.SECONDS.toMicros(1L)) / i5, this.f15602g, null, this.f15596a);
                }
            }
        }
        if (this.f15603h == null) {
            return;
        }
        io.sentry.b1 b1Var = this.j;
        if (b1Var != null) {
            e5.j d10 = b1Var.d();
            if (d10 != null && (d10.k(io.sentry.l.All) || d10.k(io.sentry.l.ProfileChunkUi))) {
                iLogger.h(b5.WARNING, "SDK is rate limited. Stopping profiler.", new Object[0]);
                h(false);
                return;
            } else {
                if (this.j.m().getConnectionStatusProvider().T() == io.sentry.n0.DISCONNECTED) {
                    iLogger.h(b5.WARNING, "Device is offline. Stopping profiler.", new Object[0]);
                    h(false);
                    return;
                }
                this.q = this.j.m().getDateProvider().a();
            }
        } else {
            this.q = new j5();
        }
        if (this.f15603h.c() == null) {
            return;
        }
        this.f15604i = true;
        io.sentry.protocol.v vVar = this.f15608n;
        io.sentry.protocol.v vVar2 = io.sentry.protocol.v.f16922b;
        if (vVar.equals(vVar2)) {
            this.f15608n = new io.sentry.protocol.v();
        }
        if (this.f15609o.equals(vVar2)) {
            this.f15609o = new io.sentry.protocol.v();
        }
        io.sentry.k kVar = this.f15606l;
        if (kVar != null) {
            kVar.a(this.f15609o.toString());
        }
        try {
            this.f15605k = this.f15599d.l(new f(0, this), 60000L);
        } catch (RejectedExecutionException e7) {
            iLogger.e(b5.ERROR, "Failed to schedule profiling chunk finish. Did you call Sentry.close()?", e7);
            this.f15612s = true;
        }
    }

    public final void h(boolean z5) {
        f();
        io.sentry.r a7 = this.f15615v.a();
        try {
            Future future = this.f15605k;
            if (future != null) {
                future.cancel(true);
            }
            if (this.f15603h != null && this.f15604i) {
                this.f15600e.getClass();
                io.sentry.k kVar = this.f15606l;
                s a10 = this.f15603h.a(kVar != null ? kVar.c(this.f15609o.toString()) : null, false);
                ILogger iLogger = this.f15596a;
                if (a10 == null) {
                    iLogger.h(b5.ERROR, "An error occurred while collecting a profile chunk, and it won't be sent.", new Object[0]);
                } else {
                    io.sentry.r a11 = this.f15616w.a();
                    try {
                        this.f15607m.add(new f3(this.f15608n, this.f15609o, (Map) a10.f15837e, (File) a10.f15836d, this.q));
                        a11.close();
                    } finally {
                    }
                }
                this.f15604i = false;
                this.f15609o = io.sentry.protocol.v.f16922b;
                io.sentry.b1 b1Var = this.j;
                if (b1Var != null) {
                    b6 m6 = b1Var.m();
                    try {
                        m6.getExecutorService().submit(new b1(this, m6, b1Var, 2));
                    } catch (Throwable th2) {
                        m6.getLogger().e(b5.DEBUG, "Failed to send profile chunks.", th2);
                    }
                }
                if (!z5 || this.f15612s) {
                    this.f15608n = io.sentry.protocol.v.f16922b;
                    iLogger.h(b5.DEBUG, "Profile chunk finished.", new Object[0]);
                } else {
                    iLogger.h(b5.DEBUG, "Profile chunk finished. Starting a new one.", new Object[0]);
                    g();
                }
                a7.close();
                return;
            }
            io.sentry.protocol.v vVar = io.sentry.protocol.v.f16922b;
            this.f15608n = vVar;
            this.f15609o = vVar;
            a7.close();
        } finally {
        }
    }
}
