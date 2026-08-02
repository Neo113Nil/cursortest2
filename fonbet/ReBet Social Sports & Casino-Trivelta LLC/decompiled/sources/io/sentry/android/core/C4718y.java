package io.sentry.android.core;

import com.twilio.voice.Constants;
import io.sentry.A1;
import io.sentry.AbstractC4772k2;
import io.sentry.AbstractC4856v2;
import io.sentry.C4726b1;
import io.sentry.C4867x3;
import io.sentry.C4870y1;
import io.sentry.EnumC4774l;
import io.sentry.EnumC4788n3;
import io.sentry.F3;
import io.sentry.ILogger;
import io.sentry.InterfaceC4740e0;
import io.sentry.InterfaceC4760i0;
import io.sentry.InterfaceC4764j;
import io.sentry.InterfaceC4765j0;
import io.sentry.P;
import io.sentry.android.core.O;
import io.sentry.k4;
import io.sentry.transport.z;
import io.sentry.util.C4843a;
import io.sentry.util.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: io.sentry.android.core.y, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4718y implements io.sentry.Q, z.b {

    /* renamed from: a, reason: collision with root package name */
    public final ILogger f51348a;

    /* renamed from: b, reason: collision with root package name */
    public final String f51349b;

    /* renamed from: c, reason: collision with root package name */
    public final int f51350c;

    /* renamed from: d, reason: collision with root package name */
    public final p.a f51351d;

    /* renamed from: e, reason: collision with root package name */
    public final C4683i0 f51352e;

    /* renamed from: g, reason: collision with root package name */
    public final io.sentry.android.core.internal.util.E f51354g;

    /* renamed from: j, reason: collision with root package name */
    public InterfaceC4740e0 f51357j;

    /* renamed from: k, reason: collision with root package name */
    public Future f51358k;

    /* renamed from: l, reason: collision with root package name */
    public InterfaceC4764j f51359l;

    /* renamed from: n, reason: collision with root package name */
    public io.sentry.protocol.u f51361n;

    /* renamed from: o, reason: collision with root package name */
    public io.sentry.protocol.u f51362o;

    /* renamed from: p, reason: collision with root package name */
    public final AtomicBoolean f51363p;

    /* renamed from: q, reason: collision with root package name */
    public AbstractC4856v2 f51364q;

    /* renamed from: r, reason: collision with root package name */
    public volatile boolean f51365r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f51366s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f51367t;

    /* renamed from: u, reason: collision with root package name */
    public int f51368u;

    /* renamed from: v, reason: collision with root package name */
    public final C4843a f51369v;

    /* renamed from: w, reason: collision with root package name */
    public final C4843a f51370w;

    /* renamed from: f, reason: collision with root package name */
    public boolean f51353f = false;

    /* renamed from: h, reason: collision with root package name */
    public O f51355h = null;

    /* renamed from: i, reason: collision with root package name */
    public boolean f51356i = false;

    /* renamed from: m, reason: collision with root package name */
    public final List f51360m = new ArrayList();

    /* renamed from: io.sentry.android.core.y$a */
    public static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$io$sentry$ProfileLifecycle;

        static {
            int[] iArr = new int[A1.values().length];
            $SwitchMap$io$sentry$ProfileLifecycle = iArr;
            try {
                iArr[A1.TRACE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$sentry$ProfileLifecycle[A1.MANUAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public C4718y(C4683i0 c4683i0, io.sentry.android.core.internal.util.E e10, ILogger iLogger, String str, int i10, p.a aVar) {
        io.sentry.protocol.u uVar = io.sentry.protocol.u.f52477c;
        this.f51361n = uVar;
        this.f51362o = uVar;
        this.f51363p = new AtomicBoolean(false);
        this.f51364q = new C4867x3();
        this.f51365r = true;
        this.f51366s = false;
        this.f51367t = false;
        this.f51368u = 0;
        this.f51369v = new C4843a();
        this.f51370w = new C4843a();
        this.f51348a = iLogger;
        this.f51354g = e10;
        this.f51352e = c4683i0;
        this.f51349b = str;
        this.f51350c = i10;
        this.f51351d = aVar;
    }

    public static /* synthetic */ void h(C4718y c4718y, F3 f32, InterfaceC4740e0 interfaceC4740e0) {
        if (c4718y.f51363p.get()) {
            return;
        }
        ArrayList arrayList = new ArrayList(c4718y.f51360m.size());
        InterfaceC4765j0 d10 = c4718y.f51370w.d();
        try {
            Iterator it = c4718y.f51360m.iterator();
            while (it.hasNext()) {
                arrayList.add(((C4870y1.a) it.next()).a(f32));
            }
            c4718y.f51360m.clear();
            if (d10 != null) {
                d10.close();
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                interfaceC4740e0.r((C4870y1) it2.next());
            }
        } catch (Throwable th2) {
            if (d10 != null) {
                try {
                    d10.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    private void l() {
        j();
        if (this.f51352e.d() < 22) {
            return;
        }
        i();
        if (this.f51355h == null) {
            return;
        }
        InterfaceC4740e0 interfaceC4740e0 = this.f51357j;
        if (interfaceC4740e0 != null) {
            io.sentry.transport.z e10 = interfaceC4740e0.e();
            if (e10 != null && (e10.A0(EnumC4774l.All) || e10.A0(EnumC4774l.ProfileChunkUi))) {
                this.f51348a.c(EnumC4788n3.WARNING, "SDK is rate limited. Stopping profiler.", new Object[0]);
                m(false);
                return;
            } else {
                if (this.f51357j.i().getConnectionStatusProvider().s0() == P.a.DISCONNECTED) {
                    this.f51348a.c(EnumC4788n3.WARNING, "Device is offline. Stopping profiler.", new Object[0]);
                    m(false);
                    return;
                }
                this.f51364q = this.f51357j.i().getDateProvider().now();
            }
        } else {
            this.f51364q = new C4867x3();
        }
        if (this.f51355h.j() == null) {
            return;
        }
        this.f51356i = true;
        io.sentry.protocol.u uVar = this.f51361n;
        io.sentry.protocol.u uVar2 = io.sentry.protocol.u.f52477c;
        if (uVar.equals(uVar2)) {
            this.f51361n = new io.sentry.protocol.u();
        }
        if (this.f51362o.equals(uVar2)) {
            this.f51362o = new io.sentry.protocol.u();
        }
        InterfaceC4764j interfaceC4764j = this.f51359l;
        if (interfaceC4764j != null) {
            interfaceC4764j.f(this.f51362o.toString());
        }
        try {
            this.f51358k = ((InterfaceC4760i0) this.f51351d.a()).b(new Runnable() { // from class: io.sentry.android.core.w
                @Override // java.lang.Runnable
                public final void run() {
                    C4718y.this.m(true);
                }
            }, 60000L);
        } catch (RejectedExecutionException e11) {
            this.f51348a.b(EnumC4788n3.ERROR, "Failed to schedule profiling chunk finish. Did you call Sentry.close()?", e11);
            this.f51366s = true;
        }
    }

    @Override // io.sentry.transport.z.b
    public void D0(io.sentry.transport.z zVar) {
        if (zVar.A0(EnumC4774l.All) || zVar.A0(EnumC4774l.ProfileChunkUi)) {
            this.f51348a.c(EnumC4788n3.WARNING, "SDK is rate limited. Stopping profiler.", new Object[0]);
            m(false);
        }
    }

    @Override // io.sentry.Q
    public void a(boolean z10) {
        InterfaceC4765j0 d10 = this.f51369v.d();
        try {
            this.f51368u = 0;
            this.f51366s = true;
            if (z10) {
                m(false);
                this.f51363p.set(true);
            }
            if (d10 != null) {
                d10.close();
            }
        } catch (Throwable th2) {
            if (d10 != null) {
                try {
                    d10.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // io.sentry.Q
    public void b(A1 a12, k4 k4Var) {
        InterfaceC4765j0 d10 = this.f51369v.d();
        try {
            if (this.f51365r) {
                this.f51367t = k4Var.c(io.sentry.util.B.a().c());
                this.f51365r = false;
            }
            if (!this.f51367t) {
                this.f51348a.c(EnumC4788n3.DEBUG, "Profiler was not started due to sampling decision.", new Object[0]);
                if (d10 != null) {
                    d10.close();
                    return;
                }
                return;
            }
            int i10 = a.$SwitchMap$io$sentry$ProfileLifecycle[a12.ordinal()];
            if (i10 == 1) {
                if (this.f51368u < 0) {
                    this.f51368u = 0;
                }
                this.f51368u++;
            } else if (i10 == 2 && isRunning()) {
                this.f51348a.c(EnumC4788n3.DEBUG, "Profiler is already running.", new Object[0]);
                if (d10 != null) {
                    d10.close();
                    return;
                }
                return;
            }
            if (!isRunning()) {
                this.f51348a.c(EnumC4788n3.DEBUG, "Started Profiler.", new Object[0]);
                l();
            }
            if (d10 != null) {
                d10.close();
            }
        } catch (Throwable th2) {
            if (d10 != null) {
                try {
                    d10.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // io.sentry.Q
    public void c() {
        this.f51365r = true;
    }

    @Override // io.sentry.Q
    public io.sentry.protocol.u d() {
        return this.f51362o;
    }

    @Override // io.sentry.Q
    public void e(A1 a12) {
        InterfaceC4765j0 d10 = this.f51369v.d();
        try {
            int i10 = a.$SwitchMap$io$sentry$ProfileLifecycle[a12.ordinal()];
            if (i10 == 1) {
                int i11 = this.f51368u - 1;
                this.f51368u = i11;
                if (i11 > 0) {
                    if (d10 != null) {
                        d10.close();
                        return;
                    }
                    return;
                } else {
                    if (i11 < 0) {
                        this.f51368u = 0;
                    }
                    this.f51366s = true;
                }
            } else if (i10 == 2) {
                this.f51366s = true;
            }
            if (d10 != null) {
                d10.close();
            }
        } catch (Throwable th2) {
            if (d10 != null) {
                try {
                    d10.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // io.sentry.Q
    public io.sentry.protocol.u f() {
        return this.f51361n;
    }

    public final void i() {
        if (this.f51353f) {
            return;
        }
        this.f51353f = true;
        String str = this.f51349b;
        if (str == null) {
            this.f51348a.c(EnumC4788n3.WARNING, "Disabling profiling because no profiling traces dir path is defined in options.", new Object[0]);
            return;
        }
        int i10 = this.f51350c;
        if (i10 <= 0) {
            this.f51348a.c(EnumC4788n3.WARNING, "Disabling profiling because trace rate is set to %d", Integer.valueOf(i10));
        } else {
            this.f51355h = new O(str, ((int) TimeUnit.SECONDS.toMicros(1L)) / this.f51350c, this.f51354g, null, this.f51348a);
        }
    }

    @Override // io.sentry.Q
    public boolean isRunning() {
        return this.f51356i;
    }

    public final void j() {
        InterfaceC4740e0 interfaceC4740e0 = this.f51357j;
        if ((interfaceC4740e0 == null || interfaceC4740e0 == C4726b1.E()) && AbstractC4772k2.p() != C4726b1.E()) {
            this.f51357j = AbstractC4772k2.p();
            this.f51359l = AbstractC4772k2.p().i().getCompositePerformanceCollector();
            io.sentry.transport.z e10 = this.f51357j.e();
            if (e10 != null) {
                e10.J(this);
            }
        }
    }

    public final void k(final InterfaceC4740e0 interfaceC4740e0, final F3 f32) {
        try {
            f32.getExecutorService().submit(new Runnable() { // from class: io.sentry.android.core.x
                @Override // java.lang.Runnable
                public final void run() {
                    C4718y.h(C4718y.this, f32, interfaceC4740e0);
                }
            });
        } catch (Throwable th2) {
            f32.getLogger().b(EnumC4788n3.DEBUG, "Failed to send profile chunks.", th2);
        }
    }

    public final void m(boolean z10) {
        j();
        InterfaceC4765j0 d10 = this.f51369v.d();
        try {
            Future future = this.f51358k;
            if (future != null) {
                future.cancel(true);
            }
            if (this.f51355h != null && this.f51356i) {
                if (this.f51352e.d() < 22) {
                    if (d10 != null) {
                        d10.close();
                        return;
                    }
                    return;
                }
                InterfaceC4764j interfaceC4764j = this.f51359l;
                O.b g10 = this.f51355h.g(false, interfaceC4764j != null ? interfaceC4764j.c(this.f51362o.toString()) : null);
                if (g10 == null) {
                    this.f51348a.c(EnumC4788n3.ERROR, "An error occurred while collecting a profile chunk, and it won't be sent.", new Object[0]);
                } else {
                    d10 = this.f51370w.d();
                    try {
                        this.f51360m.add(new C4870y1.a(this.f51361n, this.f51362o, g10.f50764d, g10.f50763c, this.f51364q, Constants.PLATFORM_ANDROID));
                        if (d10 != null) {
                            d10.close();
                        }
                    } finally {
                        if (d10 == null) {
                            throw th;
                        }
                        try {
                            d10.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                }
                this.f51356i = false;
                io.sentry.protocol.u uVar = io.sentry.protocol.u.f52477c;
                this.f51362o = uVar;
                InterfaceC4740e0 interfaceC4740e0 = this.f51357j;
                if (interfaceC4740e0 != null) {
                    k(interfaceC4740e0, interfaceC4740e0.i());
                }
                if (!z10 || this.f51366s) {
                    this.f51361n = uVar;
                    this.f51348a.c(EnumC4788n3.DEBUG, "Profile chunk finished.", new Object[0]);
                } else {
                    this.f51348a.c(EnumC4788n3.DEBUG, "Profile chunk finished. Starting a new one.", new Object[0]);
                    l();
                }
                if (d10 != null) {
                    d10.close();
                    return;
                }
                return;
            }
            io.sentry.protocol.u uVar2 = io.sentry.protocol.u.f52477c;
            this.f51361n = uVar2;
            this.f51362o = uVar2;
            if (d10 != null) {
                d10.close();
            }
        } finally {
        }
    }
}
