package io.sentry.android.core;

import android.content.Context;
import android.os.Build;
import io.sentry.AbstractC4779m;
import io.sentry.C1;
import io.sentry.D1;
import io.sentry.EnumC4788n3;
import io.sentry.F3;
import io.sentry.ILogger;
import io.sentry.InterfaceC4760i0;
import io.sentry.InterfaceC4765j0;
import io.sentry.InterfaceC4790o0;
import io.sentry.InterfaceC4795p0;
import io.sentry.X1;
import io.sentry.android.core.O;
import io.sentry.util.C4843a;
import io.sentry.util.p;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class T implements InterfaceC4795p0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f50824a;

    /* renamed from: b, reason: collision with root package name */
    public final ILogger f50825b;

    /* renamed from: c, reason: collision with root package name */
    public final String f50826c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f50827d;

    /* renamed from: e, reason: collision with root package name */
    public final int f50828e;

    /* renamed from: f, reason: collision with root package name */
    public final p.a f50829f;

    /* renamed from: g, reason: collision with root package name */
    public final C4683i0 f50830g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f50831h;

    /* renamed from: i, reason: collision with root package name */
    public final AtomicBoolean f50832i;

    /* renamed from: j, reason: collision with root package name */
    public final io.sentry.android.core.internal.util.E f50833j;

    /* renamed from: k, reason: collision with root package name */
    public volatile D1 f50834k;

    /* renamed from: l, reason: collision with root package name */
    public volatile O f50835l;

    /* renamed from: m, reason: collision with root package name */
    public long f50836m;

    /* renamed from: n, reason: collision with root package name */
    public long f50837n;

    /* renamed from: o, reason: collision with root package name */
    public Date f50838o;

    /* renamed from: p, reason: collision with root package name */
    public final C4843a f50839p;

    public T(Context context, final SentryAndroidOptions sentryAndroidOptions, C4683i0 c4683i0, io.sentry.android.core.internal.util.E e10) {
        this(context, c4683i0, e10, sentryAndroidOptions.getLogger(), sentryAndroidOptions.getProfilingTracesDirPath(), sentryAndroidOptions.isProfilingEnabled(), sentryAndroidOptions.getProfilingTracesHz(), new p.a() { // from class: io.sentry.android.core.S
            @Override // io.sentry.util.p.a
            public final Object a() {
                InterfaceC4760i0 executorService;
                executorService = SentryAndroidOptions.this.getExecutorService();
                return executorService;
            }
        });
    }

    @Override // io.sentry.InterfaceC4795p0
    public void a(InterfaceC4790o0 interfaceC4790o0) {
        if (this.f50832i.get() && this.f50834k == null) {
            InterfaceC4765j0 d10 = this.f50839p.d();
            try {
                if (this.f50832i.get() && this.f50834k == null) {
                    this.f50834k = new D1(interfaceC4790o0, Long.valueOf(this.f50836m), Long.valueOf(this.f50837n));
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
    }

    @Override // io.sentry.InterfaceC4795p0
    public C1 b(InterfaceC4790o0 interfaceC4790o0, List list, F3 f32) {
        return g(interfaceC4790o0.getName(), interfaceC4790o0.h().toString(), interfaceC4790o0.a().q().toString(), false, list, f32);
    }

    @Override // io.sentry.InterfaceC4795p0
    public void close() {
        T t10;
        D1 d12 = this.f50834k;
        if (d12 != null) {
            t10 = this;
            t10.g(d12.i(), d12.h(), d12.j(), true, null, X1.D().i());
        } else {
            t10 = this;
        }
        t10.f50832i.set(false);
        if (t10.f50835l != null) {
            t10.f50835l.f();
        }
    }

    public final void e() {
        if (this.f50831h) {
            return;
        }
        this.f50831h = true;
        if (!this.f50827d) {
            this.f50825b.c(EnumC4788n3.INFO, "Profiling is disabled in options.", new Object[0]);
            return;
        }
        String str = this.f50826c;
        if (str == null) {
            this.f50825b.c(EnumC4788n3.WARNING, "Disabling profiling because no profiling traces dir path is defined in options.", new Object[0]);
            return;
        }
        int i10 = this.f50828e;
        if (i10 <= 0) {
            this.f50825b.c(EnumC4788n3.WARNING, "Disabling profiling because trace rate is set to %d", Integer.valueOf(i10));
        } else {
            this.f50835l = new O(str, ((int) TimeUnit.SECONDS.toMicros(1L)) / this.f50828e, this.f50833j, this.f50829f, this.f50825b);
        }
    }

    public final boolean f() {
        O.c j10;
        if (this.f50835l == null || (j10 = this.f50835l.j()) == null) {
            return false;
        }
        this.f50836m = j10.f50766a;
        this.f50837n = j10.f50767b;
        this.f50838o = j10.f50768c;
        return true;
    }

    public final C1 g(String str, String str2, String str3, boolean z10, List list, F3 f32) {
        if (this.f50830g.d() < 22 || this.f50835l == null) {
            return null;
        }
        InterfaceC4765j0 d10 = this.f50839p.d();
        try {
            D1 d12 = this.f50834k;
            if (d12 == null || !d12.h().equals(str2)) {
                this.f50825b.c(EnumC4788n3.INFO, "Transaction %s (%s) finished, but was not currently being profiled. Skipping", str, str3);
                if (d10 != null) {
                    d10.close();
                }
                return null;
            }
            this.f50834k = null;
            if (d10 != null) {
                d10.close();
            }
            this.f50825b.c(EnumC4788n3.DEBUG, "Transaction %s (%s) finished.", str, str3);
            O.b g10 = this.f50835l.g(false, list);
            this.f50832i.set(false);
            if (g10 == null) {
                return null;
            }
            long j10 = g10.f50761a - this.f50836m;
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(d12);
            d12.k(Long.valueOf(g10.f50761a), Long.valueOf(this.f50836m), Long.valueOf(g10.f50762b), Long.valueOf(this.f50837n));
            Long q10 = f32 instanceof SentryAndroidOptions ? C4713v0.i(this.f50824a, (SentryAndroidOptions) f32).q() : null;
            String l10 = q10 != null ? Long.toString(q10.longValue()) : "0";
            String[] strArr = Build.SUPPORTED_ABIS;
            return new C1(g10.f50763c, this.f50838o, arrayList, str, str2, str3, Long.toString(j10), this.f50830g.d(), (strArr == null || strArr.length <= 0) ? "" : strArr[0], new Callable() { // from class: io.sentry.android.core.Q
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    List c10;
                    c10 = io.sentry.android.core.internal.util.n.a().c();
                    return c10;
                }
            }, this.f50830g.b(), this.f50830g.c(), this.f50830g.e(), this.f50830g.f(), l10, f32.getProguardUuid(), f32.getRelease(), f32.getEnvironment(), (g10.f50765e || z10) ? "timeout" : "normal", g10.f50764d);
        } finally {
        }
    }

    @Override // io.sentry.InterfaceC4795p0
    public boolean isRunning() {
        return this.f50832i.get();
    }

    @Override // io.sentry.InterfaceC4795p0
    public void start() {
        if (this.f50830g.d() >= 22 && !this.f50832i.getAndSet(true)) {
            e();
            if (f()) {
                this.f50825b.c(EnumC4788n3.DEBUG, "Profiler started.", new Object[0]);
                return;
            }
            if (this.f50835l != null && this.f50835l.h()) {
                this.f50825b.c(EnumC4788n3.WARNING, "A profile is already running. This profile will be ignored.", new Object[0]);
                return;
            }
            InterfaceC4765j0 d10 = this.f50839p.d();
            try {
                this.f50834k = null;
                if (d10 != null) {
                    d10.close();
                }
                this.f50832i.set(false);
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
    }

    public T(Context context, C4683i0 c4683i0, io.sentry.android.core.internal.util.E e10, ILogger iLogger, String str, boolean z10, int i10, p.a aVar) {
        this.f50831h = false;
        this.f50832i = new AtomicBoolean(false);
        this.f50835l = null;
        this.f50839p = new C4843a();
        this.f50824a = (Context) io.sentry.util.w.c(AbstractC4704q0.g(context), "The application context is required");
        this.f50825b = (ILogger) io.sentry.util.w.c(iLogger, "ILogger is required");
        this.f50833j = (io.sentry.android.core.internal.util.E) io.sentry.util.w.c(e10, "SentryFrameMetricsCollector is required");
        this.f50830g = (C4683i0) io.sentry.util.w.c(c4683i0, "The BuildInfoProvider is required.");
        this.f50826c = str;
        this.f50827d = z10;
        this.f50828e = i10;
        this.f50829f = (p.a) io.sentry.util.w.c(aVar, "A supplier for ISentryExecutorService is required.");
        this.f50838o = AbstractC4779m.c();
    }
}
