package io.sentry.android.core;

import android.content.Context;
import android.os.Build;
import com.sports.insider.MyApp;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.sentry.ILogger;
import io.sentry.b5;
import io.sentry.b6;
import io.sentry.d4;
import io.sentry.j3;
import io.sentry.j6;
import io.sentry.k1;
import io.sentry.k3;
import io.sentry.l1;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class w implements l1 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f15874a;

    /* renamed from: b, reason: collision with root package name */
    public final ILogger f15875b;

    /* renamed from: c, reason: collision with root package name */
    public final String f15876c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f15877d;

    /* renamed from: e, reason: collision with root package name */
    public final int f15878e;

    /* renamed from: f, reason: collision with root package name */
    public final io.sentry.e1 f15879f;

    /* renamed from: g, reason: collision with root package name */
    public final n0 f15880g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f15881h;

    /* renamed from: i, reason: collision with root package name */
    public final AtomicBoolean f15882i;
    public final io.sentry.android.core.internal.util.p j;

    /* renamed from: k, reason: collision with root package name */
    public volatile k3 f15883k;

    /* renamed from: l, reason: collision with root package name */
    public volatile u f15884l;

    /* renamed from: m, reason: collision with root package name */
    public long f15885m;

    /* renamed from: n, reason: collision with root package name */
    public long f15886n;

    /* renamed from: o, reason: collision with root package name */
    public Date f15887o;

    /* renamed from: p, reason: collision with root package name */
    public final io.sentry.util.a f15888p;

    public w(MyApp myApp, SentryAndroidOptions sentryAndroidOptions, n0 n0Var, io.sentry.android.core.internal.util.p pVar) {
        ILogger logger = sentryAndroidOptions.getLogger();
        String profilingTracesDirPath = sentryAndroidOptions.getProfilingTracesDirPath();
        boolean isProfilingEnabled = sentryAndroidOptions.isProfilingEnabled();
        int profilingTracesHz = sentryAndroidOptions.getProfilingTracesHz();
        io.sentry.e1 executorService = sentryAndroidOptions.getExecutorService();
        this.f15881h = false;
        this.f15882i = new AtomicBoolean(false);
        this.f15884l = null;
        this.f15888p = new io.sentry.util.a();
        Context applicationContext = myApp.getApplicationContext();
        this.f15874a = applicationContext != null ? applicationContext : myApp;
        y4.a.C(logger, "ILogger is required");
        this.f15875b = logger;
        this.j = pVar;
        this.f15880g = n0Var;
        this.f15876c = profilingTracesDirPath;
        this.f15877d = isProfilingEnabled;
        this.f15878e = profilingTracesHz;
        y4.a.C(executorService, "The ISentryExecutorService is required.");
        this.f15879f = executorService;
        this.f15887o = com.google.android.play.core.appupdate.b.n();
    }

    @Override // io.sentry.l1
    public final void a(k1 k1Var) {
        if (this.f15882i.get() && this.f15883k == null) {
            io.sentry.r a7 = this.f15888p.a();
            try {
                if (this.f15882i.get() && this.f15883k == null) {
                    this.f15883k = new k3(k1Var, Long.valueOf(this.f15885m), Long.valueOf(this.f15886n));
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
    }

    public final j3 b(String str, String str2, String str3, boolean z5, List list, b6 b6Var) {
        this.f15880g.getClass();
        int i5 = Build.VERSION.SDK_INT;
        if (this.f15884l != null) {
            io.sentry.r a7 = this.f15888p.a();
            try {
                k3 k3Var = this.f15883k;
                if (k3Var == null || !k3Var.f16597a.equals(str2)) {
                    this.f15875b.h(b5.INFO, "Transaction %s (%s) finished, but was not currently being profiled. Skipping", str, str3);
                    a7.close();
                    return null;
                }
                this.f15883k = null;
                a7.close();
                this.f15875b.h(b5.DEBUG, "Transaction %s (%s) finished.", str, str3);
                s a10 = this.f15884l.a(list, false);
                this.f15882i.set(false);
                if (a10 != null) {
                    long j = a10.f15833a - this.f15885m;
                    ArrayList arrayList = new ArrayList(1);
                    arrayList.add(k3Var);
                    long j6 = a10.f15833a;
                    long j10 = this.f15885m;
                    long j11 = a10.f15835c;
                    long j12 = this.f15886n;
                    if (k3Var.f16601e == null) {
                        k3Var.f16601e = Long.valueOf(j6 - j10);
                        k3Var.f16600d = Long.valueOf(k3Var.f16600d.longValue() - j10);
                        k3Var.f16603g = Long.valueOf(j11 - j12);
                        k3Var.f16602f = Long.valueOf(k3Var.f16602f.longValue() - j12);
                    }
                    Long l6 = b6Var instanceof SentryAndroidOptions ? q0.c(this.f15874a, (SentryAndroidOptions) b6Var).f15825h : null;
                    String l10 = l6 != null ? Long.toString(l6.longValue()) : CommonUrlParts.Values.FALSE_INTEGER;
                    String[] strArr = Build.SUPPORTED_ABIS;
                    String str4 = l10;
                    File file = (File) a10.f15836d;
                    Date date = this.f15887o;
                    String l11 = Long.toString(j);
                    this.f15880g.getClass();
                    String str5 = (strArr == null || strArr.length <= 0) ? "" : strArr[0];
                    io.sentry.i0 i0Var = new io.sentry.i0(2);
                    this.f15880g.getClass();
                    String str6 = Build.MANUFACTURER;
                    this.f15880g.getClass();
                    String str7 = Build.MODEL;
                    this.f15880g.getClass();
                    return new j3(file, date, arrayList, str, str2, str3, l11, i5, str5, i0Var, str6, str7, Build.VERSION.RELEASE, this.f15880g.b(), str4, b6Var.getProguardUuid(), b6Var.getRelease(), b6Var.getEnvironment(), (a10.f15834b || z5) ? "timeout" : "normal", (Map) a10.f15837e);
                }
            } finally {
            }
        }
        return null;
    }

    @Override // io.sentry.l1
    public final void close() {
        w wVar;
        k3 k3Var = this.f15883k;
        if (k3Var != null) {
            wVar = this;
            wVar.b(k3Var.f16599c, k3Var.f16597a, k3Var.f16598b, true, null, d4.d().m());
        } else {
            wVar = this;
        }
        wVar.f15882i.set(false);
        if (wVar.f15884l == null) {
            return;
        }
        u uVar = wVar.f15884l;
        io.sentry.r a7 = uVar.f15858o.a();
        try {
            Future future = uVar.f15848d;
            if (future != null) {
                future.cancel(true);
                uVar.f15848d = null;
            }
            if (uVar.f15857n) {
                uVar.a(null, true);
            }
            a7.close();
        } finally {
        }
    }

    @Override // io.sentry.l1
    public final j3 g(j6 j6Var, List list, b6 b6Var) {
        return b(j6Var.f16572e, j6Var.f16568a.toString(), j6Var.f16569b.f16648c.f16667a.toString(), false, list, b6Var);
    }

    @Override // io.sentry.l1
    public final boolean isRunning() {
        return this.f15882i.get();
    }

    @Override // io.sentry.l1
    public final void start() {
        t c2;
        this.f15880g.getClass();
        if (this.f15882i.getAndSet(true)) {
            return;
        }
        if (!this.f15881h) {
            this.f15881h = true;
            if (this.f15877d) {
                String str = this.f15876c;
                if (str == null) {
                    this.f15875b.h(b5.WARNING, "Disabling profiling because no profiling traces dir path is defined in options.", new Object[0]);
                } else {
                    int i5 = this.f15878e;
                    if (i5 <= 0) {
                        this.f15875b.h(b5.WARNING, "Disabling profiling because trace rate is set to %d", Integer.valueOf(i5));
                    } else {
                        this.f15884l = new u(str, ((int) TimeUnit.SECONDS.toMicros(1L)) / this.f15878e, this.j, this.f15879f, this.f15875b);
                    }
                }
            } else {
                this.f15875b.h(b5.INFO, "Profiling is disabled in options.", new Object[0]);
            }
        }
        if (this.f15884l != null && (c2 = this.f15884l.c()) != null) {
            this.f15885m = c2.f15842a;
            this.f15886n = c2.f15843b;
            this.f15887o = c2.f15844c;
            this.f15875b.h(b5.DEBUG, "Profiler started.", new Object[0]);
            return;
        }
        if (this.f15884l != null && this.f15884l.f15857n) {
            this.f15875b.h(b5.WARNING, "A profile is already running. This profile will be ignored.", new Object[0]);
            return;
        }
        io.sentry.r a7 = this.f15888p.a();
        try {
            this.f15883k = null;
            a7.close();
            this.f15882i.set(false);
        } finally {
        }
    }
}
