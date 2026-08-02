package io.sentry.android.core;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import io.sentry.A1;
import io.sentry.C7143f1;
import io.sentry.C7165l;
import io.sentry.C7167l1;
import io.sentry.C7171m1;
import io.sentry.I2;
import io.sentry.ILogger;
import io.sentry.InterfaceC7097a0;
import io.sentry.InterfaceC7142f0;
import io.sentry.InterfaceC7146g0;
import io.sentry.W2;
import io.sentry.android.core.C7119u;
import io.sentry.e3;
import io.sentry.util.l;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.sentry.android.core.x, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C7122x implements InterfaceC7146g0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f67381a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ILogger f67382b;

    /* renamed from: c, reason: collision with root package name */
    private final String f67383c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f67384d;

    /* renamed from: e, reason: collision with root package name */
    private final int f67385e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final l.a<io.sentry.Z> f67386f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final I f67387g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f67388h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final AtomicBoolean f67389i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final io.sentry.android.core.internal.util.v f67390j;

    /* renamed from: k, reason: collision with root package name */
    private volatile C7171m1 f67391k;

    /* renamed from: l, reason: collision with root package name */
    private volatile C7119u f67392l;

    /* renamed from: m, reason: collision with root package name */
    private long f67393m;

    /* renamed from: n, reason: collision with root package name */
    private long f67394n;

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    private Date f67395o;

    /* renamed from: p, reason: collision with root package name */
    @NotNull
    private final io.sentry.util.a f67396p;

    public C7122x(@NotNull Context context, @NotNull SentryAndroidOptions sentryAndroidOptions, @NotNull I i11, @NotNull io.sentry.android.core.internal.util.v vVar) {
        this(context, i11, vVar, sentryAndroidOptions.getLogger(), sentryAndroidOptions.getProfilingTracesDirPath(), sentryAndroidOptions.isProfilingEnabled(), sentryAndroidOptions.getProfilingTracesHz(), new B90.r(sentryAndroidOptions));
    }

    @SuppressLint({"NewApi"})
    private C7167l1 c(@NotNull String str, @NotNull String str2, @NotNull String str3, boolean z11, List<C7143f1> list, @NotNull W2 w22) {
        this.f67387g.getClass();
        int i11 = Build.VERSION.SDK_INT;
        if (this.f67392l != null) {
            InterfaceC7097a0 a11 = this.f67396p.a();
            try {
                C7171m1 c7171m1 = this.f67391k;
                if (c7171m1 != null && c7171m1.h().equals(str2)) {
                    this.f67391k = null;
                    a11.close();
                    this.f67382b.c(I2.DEBUG, "Transaction %s (%s) finished.", str, str3);
                    C7119u.b f7 = this.f67392l.f(list, false);
                    this.f67389i.set(false);
                    if (f7 != null) {
                        long j11 = f7.f67370a - this.f67393m;
                        ArrayList arrayList = new ArrayList(1);
                        arrayList.add(c7171m1);
                        c7171m1.k(Long.valueOf(f7.f67370a), Long.valueOf(this.f67393m), Long.valueOf(f7.f67371b), Long.valueOf(this.f67394n));
                        Long g10 = w22 instanceof SentryAndroidOptions ? P.c(this.f67381a, (SentryAndroidOptions) w22).g() : null;
                        String l11 = g10 != null ? Long.toString(g10.longValue()) : "0";
                        String[] strArr = Build.SUPPORTED_ABIS;
                        File file = f7.f67372c;
                        Date date = this.f67395o;
                        String l12 = Long.toString(j11);
                        this.f67387g.getClass();
                        String str4 = (strArr == null || strArr.length <= 0) ? "" : strArr[0];
                        CallableC7121w callableC7121w = new CallableC7121w();
                        this.f67387g.getClass();
                        String str5 = Build.MANUFACTURER;
                        this.f67387g.getClass();
                        String str6 = Build.MODEL;
                        this.f67387g.getClass();
                        return new C7167l1(file, date, arrayList, str, str2, str3, l12, i11, str4, callableC7121w, str5, str6, Build.VERSION.RELEASE, this.f67387g.a(), l11, w22.getProguardUuid(), w22.getRelease(), w22.getEnvironment(), (f7.f67374e || z11) ? "timeout" : "normal", f7.f67373d);
                    }
                }
                this.f67382b.c(I2.INFO, "Transaction %s (%s) finished, but was not currently being profiled. Skipping", str, str3);
                a11.close();
                return null;
            } finally {
            }
        }
        return null;
    }

    @Override // io.sentry.InterfaceC7146g0
    public final void a(@NotNull InterfaceC7142f0 interfaceC7142f0) {
        if (this.f67389i.get() && this.f67391k == null) {
            InterfaceC7097a0 a11 = this.f67396p.a();
            try {
                if (this.f67389i.get() && this.f67391k == null) {
                    this.f67391k = new C7171m1(interfaceC7142f0, Long.valueOf(this.f67393m), Long.valueOf(this.f67394n));
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
    }

    @Override // io.sentry.InterfaceC7146g0
    public final C7167l1 b(@NotNull e3 e3Var, List list, @NotNull W2 w22) {
        return c(e3Var.getName(), e3Var.k().toString(), e3Var.e().o().toString(), false, list, w22);
    }

    @Override // io.sentry.InterfaceC7146g0
    public final void close() {
        C7122x c7122x;
        C7171m1 c7171m1 = this.f67391k;
        if (c7171m1 != null) {
            c7122x = this;
            c7122x.c(c7171m1.i(), c7171m1.h(), c7171m1.j(), true, null, A1.C().getOptions());
        } else {
            c7122x = this;
        }
        c7122x.f67389i.set(false);
        if (c7122x.f67392l != null) {
            c7122x.f67392l.e();
        }
    }

    @Override // io.sentry.InterfaceC7146g0
    public final boolean isRunning() {
        return this.f67389i.get();
    }

    @Override // io.sentry.InterfaceC7146g0
    public final void start() {
        C7119u.c i11;
        this.f67387g.getClass();
        if (this.f67389i.getAndSet(true)) {
            return;
        }
        if (!this.f67388h) {
            this.f67388h = true;
            if (this.f67384d) {
                String str = this.f67383c;
                if (str == null) {
                    this.f67382b.c(I2.WARNING, "Disabling profiling because no profiling traces dir path is defined in options.", new Object[0]);
                } else {
                    int i12 = this.f67385e;
                    if (i12 <= 0) {
                        this.f67382b.c(I2.WARNING, "Disabling profiling because trace rate is set to %d", Integer.valueOf(i12));
                    } else {
                        this.f67392l = new C7119u(str, ((int) TimeUnit.SECONDS.toMicros(1L)) / this.f67385e, this.f67390j, this.f67386f, this.f67382b);
                    }
                }
            } else {
                this.f67382b.c(I2.INFO, "Profiling is disabled in options.", new Object[0]);
            }
        }
        if (this.f67392l != null && (i11 = this.f67392l.i()) != null) {
            this.f67393m = i11.f67375a;
            this.f67394n = i11.f67376b;
            this.f67395o = i11.f67377c;
            this.f67382b.c(I2.DEBUG, "Profiler started.", new Object[0]);
            return;
        }
        if (this.f67392l != null && this.f67392l.g()) {
            this.f67382b.c(I2.WARNING, "A profile is already running. This profile will be ignored.", new Object[0]);
            return;
        }
        InterfaceC7097a0 a11 = this.f67396p.a();
        try {
            this.f67391k = null;
            a11.close();
            this.f67389i.set(false);
        } finally {
        }
    }

    public C7122x(@NotNull Context context, @NotNull I i11, @NotNull io.sentry.android.core.internal.util.v vVar, @NotNull ILogger iLogger, String str, boolean z11, int i12, @NotNull l.a<io.sentry.Z> aVar) {
        this.f67388h = false;
        this.f67389i = new AtomicBoolean(false);
        this.f67392l = null;
        this.f67396p = new io.sentry.util.a();
        Context applicationContext = context.getApplicationContext();
        this.f67381a = applicationContext != null ? applicationContext : context;
        io.sentry.util.p.b(iLogger, "ILogger is required");
        this.f67382b = iLogger;
        this.f67390j = vVar;
        io.sentry.util.p.b(i11, "The BuildInfoProvider is required.");
        this.f67387g = i11;
        this.f67383c = str;
        this.f67384d = z11;
        this.f67385e = i12;
        this.f67386f = aVar;
        this.f67395o = C7165l.b();
    }
}
