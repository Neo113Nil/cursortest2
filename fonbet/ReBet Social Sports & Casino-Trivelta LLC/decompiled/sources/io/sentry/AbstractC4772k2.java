package io.sentry;

import io.sentry.util.AbstractC4846d;
import io.sentry.util.AbstractC4851i;
import io.sentry.util.C4843a;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* renamed from: io.sentry.k2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4772k2 {

    /* renamed from: a, reason: collision with root package name */
    public static volatile InterfaceC4745f0 f52145a = C4736d1.c();

    /* renamed from: b, reason: collision with root package name */
    public static volatile InterfaceC4740e0 f52146b = C4726b1.E();

    /* renamed from: c, reason: collision with root package name */
    public static final InterfaceC4730c0 f52147c = new L1(F3.empty());

    /* renamed from: d, reason: collision with root package name */
    public static volatile boolean f52148d = false;

    /* renamed from: e, reason: collision with root package name */
    public static final Charset f52149e = Charset.forName("UTF-8");

    /* renamed from: f, reason: collision with root package name */
    public static final long f52150f = System.currentTimeMillis();

    /* renamed from: g, reason: collision with root package name */
    public static final C4843a f52151g = new C4843a();

    /* renamed from: io.sentry.k2$a */
    public interface a {
        void a(F3 f32);
    }

    public static void A(F3 f32) {
        if (f32.isDebug() && (f32.getLogger() instanceof U0)) {
            f32.setLogger(new i4());
        }
    }

    public static void B(F3 f32) {
        s().close();
        f32.getScopesStorageFactory();
        if (EnumC4877z3.OFF == f32.getOpenTelemetryMode()) {
            f52145a = new C4794p();
        } else {
            f52145a = Y1.a(new io.sentry.util.s(), U0.e());
        }
    }

    public static Boolean C() {
        return p().x();
    }

    public static boolean D() {
        return p().isEnabled();
    }

    public static boolean E() {
        return p().c();
    }

    public static void F(F3 f32) {
        try {
            f32.getExecutorService().submit(new L0(f32));
        } catch (Throwable th2) {
            f32.getLogger().b(EnumC4788n3.DEBUG, "Failed to move previous session.", th2);
        }
    }

    public static void G(final F3 f32) {
        try {
            f32.getExecutorService().submit(new Runnable() { // from class: io.sentry.j2
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC4772k2.c(F3.this);
                }
            });
        } catch (Throwable th2) {
            f32.getLogger().b(EnumC4788n3.DEBUG, "Failed to notify options observers.", th2);
        }
    }

    public static boolean H(F3 f32) {
        if (f32.isEnableExternalConfiguration()) {
            f32.merge(F.g(io.sentry.config.g.a(), f32.getLogger()));
        }
        String dsn = f32.getDsn();
        if (!f32.isEnabled() || (dsn != null && dsn.isEmpty())) {
            h();
            return false;
        }
        if (dsn == null) {
            throw new IllegalArgumentException("DSN is required. Use empty string or set enabled to false in SentryOptions to disable SDK.");
        }
        f32.retrieveParsedDsn();
        return true;
    }

    public static l4 I(F3 f32) {
        m4 m4Var = new m4("app.launch", "profile");
        m4Var.D(true);
        return f32.getInternalTracesSampler().a(new K1(m4Var, null, Double.valueOf(io.sentry.util.B.a().c()), null));
    }

    public static void J() {
        p().t();
    }

    public static InterfaceC4790o0 K(m4 m4Var, o4 o4Var) {
        return p().w(m4Var, o4Var);
    }

    public static /* synthetic */ void a(F3 f32) {
        String cacheDirPathWithoutDsn = f32.getCacheDirPathWithoutDsn();
        if (cacheDirPathWithoutDsn != null) {
            File file = new File(cacheDirPathWithoutDsn, "app_start_profiling_config");
            try {
                AbstractC4851i.a(file);
                if (f32.isEnableAppStartProfiling() || f32.isStartProfilerOnAppStart()) {
                    if (!f32.isStartProfilerOnAppStart() && !f32.isTracingEnabled()) {
                        f32.getLogger().c(EnumC4788n3.INFO, "Tracing is disabled and app start profiling will not start.", new Object[0]);
                        return;
                    }
                    if (file.createNewFile()) {
                        C4777l2 c4777l2 = new C4777l2(f32, f32.isEnableAppStartProfiling() ? I(f32) : new l4(Boolean.FALSE));
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        try {
                            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream, f52149e));
                            try {
                                f32.getSerializer().a(c4777l2, bufferedWriter);
                                bufferedWriter.close();
                                fileOutputStream.close();
                            } finally {
                            }
                        } finally {
                        }
                    }
                }
            } catch (Throwable th2) {
                f32.getLogger().b(EnumC4788n3.ERROR, "Unable to create app start profiling config file. ", th2);
            }
        }
    }

    public static /* synthetic */ void c(F3 f32) {
        for (X x10 : f32.getOptionsObservers()) {
            x10.h(f32.getRelease());
            x10.f(f32.getProguardUuid());
            x10.g(f32.getSdkVersion());
            x10.c(f32.getDist());
            x10.e(f32.getEnvironment());
            x10.b(f32.getTags());
            x10.d(f32.getSessionReplay().u());
        }
        io.sentry.cache.t findPersistingScopeObserver = f32.findPersistingScopeObserver();
        if (findPersistingScopeObserver != null) {
            findPersistingScopeObserver.D();
        }
    }

    public static /* synthetic */ void d(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return;
        }
        for (File file2 : listFiles) {
            if (file2.lastModified() < f52150f - TimeUnit.MINUTES.toMillis(5L)) {
                AbstractC4851i.a(file2);
            }
        }
    }

    public static void e(C4744f c4744f, J j10) {
        p().g(c4744f, j10);
    }

    public static void f(a aVar, F3 f32) {
        try {
            aVar.a(f32);
        } catch (Throwable th2) {
            f32.getLogger().b(EnumC4788n3.ERROR, "Error in the 'OptionsConfiguration.configure' callback.", th2);
        }
    }

    public static io.sentry.protocol.u g(C4733c3 c4733c3, J j10) {
        return p().v(c4733c3, j10);
    }

    public static void h() {
        InterfaceC4765j0 d10 = f52151g.d();
        try {
            InterfaceC4740e0 p10 = p();
            f52146b = C4726b1.E();
            s().close();
            p10.a(false);
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

    public static void i(N1 n12) {
        j(null, n12);
    }

    public static void j(P1 p12, N1 n12) {
        p().n(p12, n12);
    }

    public static void k() {
        p().endSession();
    }

    public static V l() {
        return p().z();
    }

    public static void m(F3 f32, InterfaceC4740e0 interfaceC4740e0) {
        try {
            f32.getExecutorService().submit(new RunnableC4865x1(f32, interfaceC4740e0));
        } catch (Throwable th2) {
            f32.getLogger().b(EnumC4788n3.DEBUG, "Failed to finalize previous session.", th2);
        }
    }

    public static void n(long j10) {
        p().b(j10);
    }

    public static InterfaceC4740e0 o(String str) {
        return p().B(str);
    }

    public static InterfaceC4740e0 p() {
        return q(true);
    }

    public static InterfaceC4740e0 q(boolean z10) {
        if (f52148d) {
            return f52146b;
        }
        InterfaceC4740e0 interfaceC4740e0 = s().get();
        if (interfaceC4740e0 != null && !interfaceC4740e0.m()) {
            return interfaceC4740e0;
        }
        if (!z10) {
            return C4726b1.E();
        }
        InterfaceC4740e0 B10 = f52146b.B("getCurrentScopes");
        s().b(B10);
        return B10;
    }

    public static InterfaceC4730c0 r() {
        return f52147c;
    }

    public static InterfaceC4745f0 s() {
        return f52145a;
    }

    public static void t(final F3 f32, InterfaceC4760i0 interfaceC4760i0) {
        try {
            interfaceC4760i0.submit(new Runnable() { // from class: io.sentry.h2
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC4772k2.a(F3.this);
                }
            });
        } catch (Throwable th2) {
            f32.getLogger().b(EnumC4788n3.ERROR, "Failed to call the executor. App start profiling config will not be changed. Did you call Sentry.close()?", th2);
        }
    }

    public static void u(AbstractC4828s1 abstractC4828s1, a aVar, boolean z10) {
        F3 f32 = (F3) abstractC4828s1.a();
        f(aVar, f32);
        v(f32, z10);
    }

    public static void v(final F3 f32, boolean z10) {
        InterfaceC4765j0 d10 = f52151g.d();
        try {
            if (!f32.getClass().getName().equals("io.sentry.android.core.SentryAndroidOptions") && io.sentry.util.y.a()) {
                throw new IllegalArgumentException("You are running Android. Please, use SentryAndroid.init. " + f32.getClass().getName());
            }
            if (!H(f32)) {
                if (d10 != null) {
                    d10.close();
                    return;
                }
                return;
            }
            Boolean isGlobalHubMode = f32.isGlobalHubMode();
            if (isGlobalHubMode != null) {
                z10 = isGlobalHubMode.booleanValue();
            }
            f32.getLogger().c(EnumC4788n3.INFO, "GlobalHubMode: '%s'", String.valueOf(z10));
            f52148d = z10;
            x(f32);
            InterfaceC4730c0 interfaceC4730c0 = f52147c;
            if (io.sentry.util.m.d(interfaceC4730c0.i(), f32, D())) {
                if (D()) {
                    f32.getLogger().c(EnumC4788n3.WARNING, "Sentry has been already initialized. Previous configuration will be overwritten.", new Object[0]);
                }
                f32.activate();
                p().a(true);
                interfaceC4730c0.u(f32);
                f52146b = new W1(new L1(f32), new L1(f32), interfaceC4730c0, "Sentry.init");
                A(f32);
                y(f32);
                s().b(f52146b);
                w(f32);
                interfaceC4730c0.K(new C4834t2(f32));
                if (f32.getExecutorService().isClosed()) {
                    f32.setExecutorService(new C4743e3(f32));
                }
                try {
                    f32.getExecutorService().submit(new Runnable() { // from class: io.sentry.g2
                        @Override // java.lang.Runnable
                        public final void run() {
                            F3.this.loadLazyFields();
                        }
                    });
                } catch (RejectedExecutionException e10) {
                    f32.getLogger().b(EnumC4788n3.DEBUG, "Failed to call the executor. Lazy fields will not be loaded. Did you call Sentry.close()?", e10);
                }
                F(f32);
                for (InterfaceC4839u0 interfaceC4839u0 : f32.getIntegrations()) {
                    try {
                        interfaceC4839u0.J(X1.D(), f32);
                    } catch (Throwable th2) {
                        f32.getLogger().b(EnumC4788n3.WARNING, "Failed to register the integration " + interfaceC4839u0.getClass().getName(), th2);
                    }
                }
                G(f32);
                m(f32, X1.D());
                t(f32, f32.getExecutorService());
                ILogger logger = f32.getLogger();
                EnumC4788n3 enumC4788n3 = EnumC4788n3.DEBUG;
                logger.c(enumC4788n3, "Using openTelemetryMode %s", f32.getOpenTelemetryMode());
                f32.getLogger().c(enumC4788n3, "Using span factory %s", f32.getSpanFactory().getClass().getName());
                f32.getLogger().c(enumC4788n3, "Using scopes storage %s", f52145a.getClass().getName());
            } else {
                f32.getLogger().c(EnumC4788n3.WARNING, "This init call has been ignored due to priority being too low.", new Object[0]);
            }
            if (d10 != null) {
                d10.close();
            }
        } catch (Throwable th3) {
            if (d10 != null) {
                try {
                    d10.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
            }
            throw th3;
        }
    }

    public static void w(F3 f32) {
        ILogger logger = f32.getLogger();
        EnumC4788n3 enumC4788n3 = EnumC4788n3.INFO;
        logger.c(enumC4788n3, "Initializing SDK with DSN: '%s'", f32.getDsn());
        String outboxPath = f32.getOutboxPath();
        if (outboxPath != null) {
            new File(outboxPath).mkdirs();
        } else {
            logger.c(enumC4788n3, "No outbox dir path is defined in options.", new Object[0]);
        }
        String cacheDirPath = f32.getCacheDirPath();
        if (cacheDirPath != null) {
            new File(cacheDirPath).mkdirs();
            if (f32.getEnvelopeDiskCache() instanceof io.sentry.transport.r) {
                f32.setEnvelopeDiskCache(io.sentry.cache.f.r(f32));
            }
        }
        String profilingTracesDirPath = f32.getProfilingTracesDirPath();
        if ((f32.isProfilingEnabled() || f32.isContinuousProfilingEnabled()) && profilingTracesDirPath != null) {
            final File file = new File(profilingTracesDirPath);
            file.mkdirs();
            try {
                f32.getExecutorService().submit(new Runnable() { // from class: io.sentry.i2
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractC4772k2.d(file);
                    }
                });
            } catch (RejectedExecutionException e10) {
                f32.getLogger().b(EnumC4788n3.ERROR, "Failed to call the executor. Old profiles will not be deleted. Did you call Sentry.close()?", e10);
            }
        }
        io.sentry.internal.modules.b modulesLoader = f32.getModulesLoader();
        if (!f32.isSendModules()) {
            f32.setModulesLoader(io.sentry.internal.modules.e.b());
        } else if (modulesLoader instanceof io.sentry.internal.modules.e) {
            f32.setModulesLoader(new io.sentry.internal.modules.a(Arrays.asList(new io.sentry.internal.modules.c(f32.getLogger()), new io.sentry.internal.modules.f(f32.getLogger())), f32.getLogger()));
        }
        if (f32.getDebugMetaLoader() instanceof io.sentry.internal.debugmeta.b) {
            f32.setDebugMetaLoader(new io.sentry.internal.debugmeta.c(f32.getLogger()));
        }
        AbstractC4846d.a(f32, f32.getDebugMetaLoader().a());
        if (f32.getThreadChecker() instanceof io.sentry.util.thread.b) {
            f32.setThreadChecker(io.sentry.util.thread.c.d());
        }
        if (f32.getPerformanceCollectors().isEmpty()) {
            f32.addPerformanceCollector(new C4854v0());
        }
        if (f32.isEnableBackpressureHandling() && io.sentry.util.y.c()) {
            if (f32.getBackpressureMonitor() instanceof io.sentry.backpressure.c) {
                f32.setBackpressureMonitor(new io.sentry.backpressure.a(f32, X1.D()));
            }
            f32.getBackpressureMonitor().start();
        }
        z(f32);
        f32.getLogger().c(EnumC4788n3.INFO, "Continuous profiler is enabled %s mode: %s", Boolean.valueOf(f32.isContinuousProfilingEnabled()), f32.getProfileLifecycle());
    }

    public static void x(F3 f32) {
        if (f32.getFatalLogger() instanceof U0) {
            f32.setFatalLogger(new i4());
        }
    }

    public static void y(F3 f32) {
        io.sentry.opentelemetry.a.c(f32, new io.sentry.util.s());
        if (EnumC4877z3.OFF == f32.getOpenTelemetryMode()) {
            f32.setSpanFactory(new C4807q());
        }
        B(f32);
        io.sentry.opentelemetry.a.a(f32);
    }

    public static void z(F3 f32) {
        io.sentry.util.m.c(f32);
        io.sentry.util.m.b(f32);
    }
}
