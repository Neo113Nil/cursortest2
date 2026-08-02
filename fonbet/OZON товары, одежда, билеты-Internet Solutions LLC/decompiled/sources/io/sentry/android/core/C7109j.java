package io.sentry.android.core;

import d0.RunnableC6011w;
import io.sentry.C7151h1;
import io.sentry.EnumC7159j1;
import io.sentry.EnumC7161k;
import io.sentry.I2;
import io.sentry.ILogger;
import io.sentry.InterfaceC7097a0;
import io.sentry.InterfaceC7157j;
import io.sentry.J;
import io.sentry.K1;
import io.sentry.O0;
import io.sentry.S2;
import io.sentry.T1;
import io.sentry.W2;
import io.sentry.android.core.C7119u;
import io.sentry.r3;
import io.sentry.transport.m;
import io.sentry.util.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.sentry.android.core.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7109j implements io.sentry.K, m.b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ILogger f67246a;

    /* renamed from: b, reason: collision with root package name */
    private final String f67247b;

    /* renamed from: c, reason: collision with root package name */
    private final int f67248c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final l.a<io.sentry.Z> f67249d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final I f67250e;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final io.sentry.android.core.internal.util.v f67252g;

    /* renamed from: j, reason: collision with root package name */
    private io.sentry.W f67255j;

    /* renamed from: k, reason: collision with root package name */
    private Future<?> f67256k;

    /* renamed from: l, reason: collision with root package name */
    private InterfaceC7157j f67257l;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private io.sentry.protocol.t f67259n;

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    private io.sentry.protocol.t f67260o;

    /* renamed from: p, reason: collision with root package name */
    @NotNull
    private final AtomicBoolean f67261p;

    /* renamed from: q, reason: collision with root package name */
    @NotNull
    private T1 f67262q;

    /* renamed from: r, reason: collision with root package name */
    private volatile boolean f67263r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f67264s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f67265t;

    /* renamed from: u, reason: collision with root package name */
    private int f67266u;

    /* renamed from: v, reason: collision with root package name */
    private final io.sentry.util.a f67267v;

    /* renamed from: w, reason: collision with root package name */
    private final io.sentry.util.a f67268w;

    /* renamed from: f, reason: collision with root package name */
    private boolean f67251f = false;

    /* renamed from: h, reason: collision with root package name */
    private C7119u f67253h = null;

    /* renamed from: i, reason: collision with root package name */
    private boolean f67254i = false;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private final ArrayList f67258m = new ArrayList();

    /* renamed from: io.sentry.android.core.j$a */
    /* loaded from: classes10.dex */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f67269a;

        static {
            int[] iArr = new int[EnumC7159j1.values().length];
            f67269a = iArr;
            try {
                iArr[EnumC7159j1.TRACE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f67269a[EnumC7159j1.MANUAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public C7109j(@NotNull I i11, @NotNull io.sentry.android.core.internal.util.v vVar, @NotNull ILogger iLogger, String str, int i12, @NotNull l.a<io.sentry.Z> aVar) {
        io.sentry.protocol.t tVar = io.sentry.protocol.t.f68325b;
        this.f67259n = tVar;
        this.f67260o = tVar;
        this.f67261p = new AtomicBoolean(false);
        this.f67262q = new S2();
        this.f67263r = true;
        this.f67264s = false;
        this.f67265t = false;
        this.f67266u = 0;
        this.f67267v = new io.sentry.util.a();
        this.f67268w = new io.sentry.util.a();
        this.f67246a = iLogger;
        this.f67252g = vVar;
        this.f67250e = i11;
        this.f67247b = str;
        this.f67248c = i12;
        this.f67249d = aVar;
    }

    public static /* synthetic */ void g(C7109j c7109j, W2 w22, io.sentry.W w11) {
        if (c7109j.f67261p.get()) {
            return;
        }
        ArrayList arrayList = c7109j.f67258m;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        InterfaceC7097a0 a11 = c7109j.f67268w.a();
        try {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((C7151h1.a) it.next()).a(w22));
            }
            arrayList.clear();
            a11.close();
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                w11.j((C7151h1) it2.next());
            }
        } catch (Throwable th2) {
            try {
                a11.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    private void i() {
        io.sentry.W w11 = this.f67255j;
        if ((w11 == null || w11 == O0.C()) && K1.d() != O0.C()) {
            this.f67255j = K1.d();
            this.f67257l = K1.d().getOptions().getCompositePerformanceCollector();
            io.sentry.transport.m h11 = this.f67255j.h();
            if (h11 != null) {
                h11.d(this);
            }
        }
    }

    private void k() {
        i();
        this.f67250e.getClass();
        boolean z11 = this.f67251f;
        ILogger iLogger = this.f67246a;
        if (!z11) {
            this.f67251f = true;
            String str = this.f67247b;
            if (str == null) {
                iLogger.c(I2.WARNING, "Disabling profiling because no profiling traces dir path is defined in options.", new Object[0]);
            } else {
                int i11 = this.f67248c;
                if (i11 <= 0) {
                    iLogger.c(I2.WARNING, "Disabling profiling because trace rate is set to %d", Integer.valueOf(i11));
                } else {
                    this.f67253h = new C7119u(str, ((int) TimeUnit.SECONDS.toMicros(1L)) / i11, this.f67252g, null, this.f67246a);
                }
            }
        }
        if (this.f67253h == null) {
            return;
        }
        io.sentry.W w11 = this.f67255j;
        if (w11 != null) {
            io.sentry.transport.m h11 = w11.h();
            if (h11 != null && (h11.m(EnumC7161k.All) || h11.m(EnumC7161k.ProfileChunkUi))) {
                iLogger.c(I2.WARNING, "SDK is rate limited. Stopping profiler.", new Object[0]);
                l(false);
                return;
            } else {
                if (this.f67255j.getOptions().getConnectionStatusProvider().l() == J.a.DISCONNECTED) {
                    iLogger.c(I2.WARNING, "Device is offline. Stopping profiler.", new Object[0]);
                    l(false);
                    return;
                }
                this.f67262q = this.f67255j.getOptions().getDateProvider().now();
            }
        } else {
            this.f67262q = new S2();
        }
        if (this.f67253h.i() == null) {
            return;
        }
        this.f67254i = true;
        io.sentry.protocol.t tVar = this.f67259n;
        io.sentry.protocol.t tVar2 = io.sentry.protocol.t.f68325b;
        if (tVar.equals(tVar2)) {
            this.f67259n = new io.sentry.protocol.t();
        }
        if (this.f67260o.equals(tVar2)) {
            this.f67260o = new io.sentry.protocol.t();
        }
        InterfaceC7157j interfaceC7157j = this.f67257l;
        if (interfaceC7157j != null) {
            interfaceC7157j.f(this.f67260o.toString());
        }
        try {
            this.f67256k = this.f67249d.g().b(new B90.g0(this, 7), 60000L);
        } catch (RejectedExecutionException e11) {
            iLogger.a(I2.ERROR, "Failed to schedule profiling chunk finish. Did you call Sentry.close()?", e11);
            this.f67264s = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l(boolean z11) {
        i();
        InterfaceC7097a0 a11 = this.f67267v.a();
        try {
            Future<?> future = this.f67256k;
            if (future != null) {
                future.cancel(true);
            }
            if (this.f67253h != null && this.f67254i) {
                this.f67250e.getClass();
                InterfaceC7157j interfaceC7157j = this.f67257l;
                C7119u.b f7 = this.f67253h.f(interfaceC7157j != null ? interfaceC7157j.d(this.f67260o.toString()) : null, false);
                ILogger iLogger = this.f67246a;
                if (f7 == null) {
                    iLogger.c(I2.ERROR, "An error occurred while collecting a profile chunk, and it won't be sent.", new Object[0]);
                } else {
                    InterfaceC7097a0 a12 = this.f67268w.a();
                    try {
                        this.f67258m.add(new C7151h1.a(this.f67259n, this.f67260o, f7.f67373d, f7.f67372c, this.f67262q));
                        a12.close();
                    } finally {
                    }
                }
                this.f67254i = false;
                this.f67260o = io.sentry.protocol.t.f68325b;
                io.sentry.W w11 = this.f67255j;
                if (w11 != null) {
                    W2 options = w11.getOptions();
                    try {
                        options.getExecutorService().submit(new RunnableC6011w(this, options, w11, 1));
                    } catch (Throwable th2) {
                        options.getLogger().a(I2.DEBUG, "Failed to send profile chunks.", th2);
                    }
                }
                if (!z11 || this.f67264s) {
                    this.f67259n = io.sentry.protocol.t.f68325b;
                    iLogger.c(I2.DEBUG, "Profile chunk finished.", new Object[0]);
                } else {
                    iLogger.c(I2.DEBUG, "Profile chunk finished. Starting a new one.", new Object[0]);
                    k();
                }
                a11.close();
                return;
            }
            io.sentry.protocol.t tVar = io.sentry.protocol.t.f68325b;
            this.f67259n = tVar;
            this.f67260o = tVar;
            a11.close();
        } finally {
        }
    }

    @Override // io.sentry.K
    public final void a(boolean z11) {
        InterfaceC7097a0 a11 = this.f67267v.a();
        try {
            this.f67266u = 0;
            this.f67264s = true;
            if (z11) {
                l(false);
                this.f67261p.set(true);
            }
            a11.close();
        } catch (Throwable th2) {
            try {
                a11.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // io.sentry.K
    public final void b(@NotNull EnumC7159j1 enumC7159j1, @NotNull r3 r3Var) {
        InterfaceC7097a0 a11 = this.f67267v.a();
        try {
            if (this.f67263r) {
                this.f67265t = r3Var.b(io.sentry.util.u.a().d());
                this.f67263r = false;
            }
            if (!this.f67265t) {
                this.f67246a.c(I2.DEBUG, "Profiler was not started due to sampling decision.", new Object[0]);
                a11.close();
                return;
            }
            int i11 = a.f67269a[enumC7159j1.ordinal()];
            if (i11 == 1) {
                if (this.f67266u < 0) {
                    this.f67266u = 0;
                }
                this.f67266u++;
            } else if (i11 == 2 && this.f67254i) {
                this.f67246a.c(I2.DEBUG, "Profiler is already running.", new Object[0]);
                a11.close();
                return;
            }
            if (!this.f67254i) {
                this.f67246a.c(I2.DEBUG, "Started Profiler.", new Object[0]);
                k();
            }
            a11.close();
        } catch (Throwable th2) {
            try {
                a11.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // io.sentry.K
    public final void c() {
        this.f67263r = true;
    }

    @Override // io.sentry.K
    @NotNull
    public final io.sentry.protocol.t d() {
        return this.f67259n;
    }

    @Override // io.sentry.K
    public final void e(@NotNull EnumC7159j1 enumC7159j1) {
        InterfaceC7097a0 a11 = this.f67267v.a();
        try {
            int i11 = a.f67269a[enumC7159j1.ordinal()];
            if (i11 == 1) {
                int i12 = this.f67266u - 1;
                this.f67266u = i12;
                if (i12 > 0) {
                    a11.close();
                    return;
                } else {
                    if (i12 < 0) {
                        this.f67266u = 0;
                    }
                    this.f67264s = true;
                }
            } else if (i11 == 2) {
                this.f67264s = true;
            }
            a11.close();
        } catch (Throwable th2) {
            try {
                a11.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @NotNull
    public final io.sentry.protocol.t h() {
        return this.f67260o;
    }

    public final boolean j() {
        return this.f67254i;
    }

    @Override // io.sentry.transport.m.b
    public final void m(@NotNull io.sentry.transport.m mVar) {
        if (mVar.m(EnumC7161k.All) || mVar.m(EnumC7161k.ProfileChunkUi)) {
            this.f67246a.c(I2.WARNING, "SDK is rate limited. Stopping profiler.", new Object[0]);
            l(false);
        }
    }
}
