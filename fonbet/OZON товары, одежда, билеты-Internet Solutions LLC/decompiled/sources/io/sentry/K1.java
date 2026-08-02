package io.sentry;

import io.sentry.W2;
import io.sentry.android.core.SentryAndroidOptions;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class K1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static volatile X f66655a = Q0.b();

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static volatile W f66656b = O0.C();

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final C7209u1 f66657c = new C7209u1(W2.empty());

    /* renamed from: d, reason: collision with root package name */
    private static volatile boolean f66658d = false;

    /* renamed from: e, reason: collision with root package name */
    private static final Charset f66659e = Charset.forName("UTF-8");

    /* renamed from: f, reason: collision with root package name */
    private static final long f66660f = System.currentTimeMillis();

    /* renamed from: g, reason: collision with root package name */
    private static final io.sentry.util.a f66661g = new io.sentry.util.a();

    public interface a<T extends W2> {
        void a(@NotNull T t2);
    }

    public static void a(W2 w22) {
        s3 s3Var;
        String cacheDirPathWithoutDsn = w22.getCacheDirPathWithoutDsn();
        if (cacheDirPathWithoutDsn != null) {
            File file = new File(cacheDirPathWithoutDsn, "app_start_profiling_config");
            try {
                io.sentry.util.g.a(file);
                if (w22.isEnableAppStartProfiling() || w22.isStartProfilerOnAppStart()) {
                    if (!w22.isStartProfilerOnAppStart() && !w22.isTracingEnabled()) {
                        w22.getLogger().c(I2.INFO, "Tracing is disabled and app start profiling will not start.", new Object[0]);
                        return;
                    }
                    if (file.createNewFile()) {
                        if (w22.isEnableAppStartProfiling()) {
                            s3Var = w22.getInternalTracesSampler().a(new C7205t1(new t3(), Double.valueOf(io.sentry.util.u.a().d())));
                        } else {
                            s3Var = new s3(Boolean.FALSE, null);
                        }
                        L1 l12 = new L1(w22, s3Var);
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        try {
                            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream, f66659e));
                            try {
                                w22.getSerializer().a(bufferedWriter, l12);
                                bufferedWriter.close();
                                fileOutputStream.close();
                            } finally {
                            }
                        } finally {
                        }
                    }
                }
            } catch (Throwable th2) {
                w22.getLogger().a(I2.ERROR, "Unable to create app start profiling config file. ", th2);
            }
        }
    }

    public static /* synthetic */ void b(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return;
        }
        for (File file2 : listFiles) {
            if (file2.lastModified() < f66660f - TimeUnit.MINUTES.toMillis(5L)) {
                io.sentry.util.g.a(file2);
            }
        }
    }

    public static void c() {
        InterfaceC7097a0 a11 = f66661g.a();
        try {
            W d11 = d();
            f66656b = O0.C();
            f66655a.close();
            d11.a(false);
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
    public static W d() {
        if (f66658d) {
            return f66656b;
        }
        W w11 = f66655a.get();
        if (w11 != null && !w11.w()) {
            return w11;
        }
        W B11 = f66656b.B("getCurrentScopes");
        f66655a.a(B11);
        return B11;
    }

    @NotNull
    public static C7209u1 e() {
        return f66657c;
    }

    public static void f(@NotNull B1.t0 t0Var, @NotNull io.sentry.android.core.j0 j0Var) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        int i11 = 1;
        final W2 w22 = (W2) SentryAndroidOptions.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        try {
            j0Var.a(w22);
        } catch (Throwable th2) {
            w22.getLogger().a(I2.ERROR, "Error in the 'OptionsConfiguration.configure' callback.", th2);
        }
        InterfaceC7097a0 a11 = f66661g.a();
        try {
            if (!w22.getClass().getName().equals("io.sentry.android.core.SentryAndroidOptions") && io.sentry.util.r.a()) {
                throw new IllegalArgumentException("You are running Android. Please, use SentryAndroid.init. ".concat(w22.getClass().getName()));
            }
            if (w22.isEnableExternalConfiguration()) {
                w22.merge(B.a(io.sentry.config.g.a(), w22.getLogger()));
            }
            String dsn = w22.getDsn();
            if (w22.isEnabled() && (dsn == null || !dsn.isEmpty())) {
                if (dsn == null) {
                    throw new IllegalArgumentException("DSN is required. Use empty string or set enabled to false in SentryOptions to disable SDK.");
                }
                w22.retrieveParsedDsn();
                Boolean isGlobalHubMode = w22.isGlobalHubMode();
                boolean booleanValue = isGlobalHubMode != null ? isGlobalHubMode.booleanValue() : true;
                w22.getLogger().c(I2.INFO, "GlobalHubMode: '%s'", String.valueOf(booleanValue));
                f66658d = booleanValue;
                if (w22.getFatalLogger() instanceof J0) {
                    w22.setFatalLogger(new p3());
                }
                C7209u1 c7209u1 = f66657c;
                if (io.sentry.util.i.d(c7209u1.getOptions(), w22, i())) {
                    if (i()) {
                        w22.getLogger().c(I2.WARNING, "Sentry has been already initialized. Previous configuration will be overwritten.", new Object[0]);
                    }
                    w22.activate();
                    d().a(true);
                    c7209u1.D(w22);
                    f66656b = new C7229z1(new C7209u1(w22), new C7209u1(w22), c7209u1);
                    if (w22.isDebug() && (w22.getLogger() instanceof J0)) {
                        w22.setLogger(new p3());
                    }
                    h(w22);
                    f66655a.a(f66656b);
                    g(w22);
                    c7209u1.e(new R1(w22));
                    if (w22.getExecutorService().isClosed()) {
                        w22.setExecutorService(new C2(w22));
                        w22.getExecutorService().a();
                    }
                    try {
                        w22.getExecutorService().submit(new Runnable() { // from class: io.sentry.H1
                            @Override // java.lang.Runnable
                            public final void run() {
                                W2.this.loadLazyFields();
                            }
                        });
                    } catch (RejectedExecutionException e11) {
                        w22.getLogger().a(I2.DEBUG, "Failed to call the executor. Lazy fields will not be loaded. Did you call Sentry.close()?", e11);
                    }
                    try {
                        w22.getExecutorService().submit(new C0(w22));
                    } catch (Throwable th3) {
                        w22.getLogger().a(I2.DEBUG, "Failed to move previous session.", th3);
                    }
                    for (InterfaceC7166l0 interfaceC7166l0 : w22.getIntegrations()) {
                        try {
                            interfaceC7166l0.d(A1.C(), w22);
                        } catch (Throwable th4) {
                            w22.getLogger().a(I2.WARNING, "Failed to register the integration " + interfaceC7166l0.getClass().getName(), th4);
                        }
                    }
                    try {
                        w22.getExecutorService().submit(new Runnable() { // from class: io.sentry.J1
                            @Override // java.lang.Runnable
                            public final void run() {
                                W2 w23 = W2.this;
                                for (O o11 : w23.getOptionsObservers()) {
                                    o11.g(w23.getRelease());
                                    o11.d(w23.getProguardUuid());
                                    o11.e(w23.getSdkVersion());
                                    o11.b(w23.getDist());
                                    o11.c(w23.getEnvironment());
                                    o11.a(w23.getTags());
                                    o11.f(w23.getSessionReplay().n());
                                }
                                io.sentry.cache.l findPersistingScopeObserver = w23.findPersistingScopeObserver();
                                if (findPersistingScopeObserver != null) {
                                    findPersistingScopeObserver.H();
                                }
                            }
                        });
                    } catch (Throwable th5) {
                        w22.getLogger().a(I2.DEBUG, "Failed to notify options observers.", th5);
                    }
                    try {
                        w22.getExecutorService().submit(new RunnableC7147g1(A1.C(), w22));
                    } catch (Throwable th6) {
                        w22.getLogger().a(I2.DEBUG, "Failed to finalize previous session.", th6);
                    }
                    try {
                        w22.getExecutorService().submit(new H4.d(w22, i11));
                    } catch (Throwable th7) {
                        w22.getLogger().a(I2.ERROR, "Failed to call the executor. App start profiling config will not be changed. Did you call Sentry.close()?", th7);
                    }
                    ILogger logger = w22.getLogger();
                    I2 i22 = I2.DEBUG;
                    logger.c(i22, "Using openTelemetryMode %s", w22.getOpenTelemetryMode());
                    w22.getLogger().c(i22, "Using span factory %s", w22.getSpanFactory().getClass().getName());
                    w22.getLogger().c(i22, "Using scopes storage %s", f66655a.getClass().getName());
                } else {
                    w22.getLogger().c(I2.WARNING, "This init call has been ignored due to priority being too low.", new Object[0]);
                }
                a11.close();
            }
            c();
            a11.close();
        } catch (Throwable th8) {
            try {
                a11.close();
            } catch (Throwable th9) {
                th8.addSuppressed(th9);
            }
            throw th8;
        }
    }

    private static void g(@NotNull W2 w22) {
        io.sentry.cache.g fVar;
        ILogger logger = w22.getLogger();
        I2 i22 = I2.INFO;
        logger.c(i22, "Initializing SDK with DSN: '%s'", w22.getDsn());
        String outboxPath = w22.getOutboxPath();
        if (outboxPath != null) {
            new File(outboxPath).mkdirs();
        } else {
            logger.c(i22, "No outbox dir path is defined in options.", new Object[0]);
        }
        String cacheDirPath = w22.getCacheDirPath();
        if (cacheDirPath != null) {
            new File(cacheDirPath).mkdirs();
            if (w22.getEnvelopeDiskCache() instanceof io.sentry.transport.h) {
                int i11 = io.sentry.cache.f.f67785j;
                String cacheDirPath2 = w22.getCacheDirPath();
                int maxCacheItems = w22.getMaxCacheItems();
                if (cacheDirPath2 == null) {
                    w22.getLogger().c(I2.WARNING, "cacheDirPath is null, returning NoOpEnvelopeCache", new Object[0]);
                    fVar = io.sentry.transport.h.a();
                } else {
                    fVar = new io.sentry.cache.f(w22, cacheDirPath2, maxCacheItems);
                }
                w22.setEnvelopeDiskCache(fVar);
            }
        }
        String profilingTracesDirPath = w22.getProfilingTracesDirPath();
        if ((w22.isProfilingEnabled() || w22.isContinuousProfilingEnabled()) && profilingTracesDirPath != null) {
            final File file = new File(profilingTracesDirPath);
            file.mkdirs();
            try {
                w22.getExecutorService().submit(new Runnable() { // from class: io.sentry.I1
                    @Override // java.lang.Runnable
                    public final void run() {
                        K1.b(file);
                    }
                });
            } catch (RejectedExecutionException e11) {
                w22.getLogger().a(I2.ERROR, "Failed to call the executor. Old profiles will not be deleted. Did you call Sentry.close()?", e11);
            }
        }
        io.sentry.internal.modules.b modulesLoader = w22.getModulesLoader();
        if (!w22.isSendModules()) {
            w22.setModulesLoader(io.sentry.internal.modules.e.b());
        } else if (modulesLoader instanceof io.sentry.internal.modules.e) {
            w22.setModulesLoader(new io.sentry.internal.modules.a(Arrays.asList(new io.sentry.internal.modules.c(w22.getLogger()), new io.sentry.internal.modules.f(w22.getLogger())), w22.getLogger()));
        }
        if (w22.getDebugMetaLoader() instanceof io.sentry.internal.debugmeta.b) {
            w22.setDebugMetaLoader(new io.sentry.internal.debugmeta.c(w22.getLogger()));
        }
        List<Properties> a11 = w22.getDebugMetaLoader().a();
        if (a11 != null) {
            if (w22.getBundleIds().isEmpty()) {
                Iterator<Properties> it = a11.iterator();
                while (it.hasNext()) {
                    String property = it.next().getProperty("io.sentry.bundle-ids");
                    w22.getLogger().c(I2.DEBUG, "Bundle IDs found: %s", property);
                    if (property != null) {
                        for (String str : property.split(",", -1)) {
                            w22.addBundleId(str);
                        }
                    }
                }
            }
            if (w22.getProguardUuid() == null) {
                Iterator<Properties> it2 = a11.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    String property2 = it2.next().getProperty("io.sentry.ProguardUuids");
                    if (property2 != null) {
                        w22.getLogger().c(I2.DEBUG, "Proguard UUID found: %s", property2);
                        w22.setProguardUuid(property2);
                        break;
                    }
                }
            }
            Iterator<Properties> it3 = a11.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                Properties next = it3.next();
                String property3 = next.getProperty("io.sentry.build-tool");
                if (property3 != null) {
                    String property4 = next.getProperty("io.sentry.build-tool-version");
                    if (property4 == null) {
                        property4 = "unknown";
                    }
                    w22.getLogger().c(I2.DEBUG, "Build tool found: %s, version %s", property3, property4);
                    G2.d().b(property3, property4);
                }
            }
            for (Properties properties : a11) {
                String property5 = properties.getProperty("io.sentry.distribution.org-slug");
                String property6 = properties.getProperty("io.sentry.distribution.project-slug");
                String property7 = properties.getProperty("io.sentry.distribution.auth-token");
                String property8 = properties.getProperty("io.sentry.distribution.build-configuration");
                String property9 = properties.getProperty("io.sentry.distribution.install-groups-override");
                if (property5 != null || property6 != null || property7 != null || property8 != null || property9 != null) {
                    W2.g distribution = w22.getDistribution();
                    if (property5 != null && !property5.isEmpty() && distribution.f66769b.isEmpty()) {
                        w22.getLogger().c(I2.DEBUG, "Distribution org slug found: %s", property5);
                        distribution.f66769b = property5;
                    }
                    if (property6 != null && !property6.isEmpty() && distribution.f66770c.isEmpty()) {
                        w22.getLogger().c(I2.DEBUG, "Distribution project slug found: %s", property6);
                        distribution.f66770c = property6;
                    }
                    if (property7 != null && !property7.isEmpty() && distribution.f66768a.isEmpty()) {
                        w22.getLogger().c(I2.DEBUG, "Distribution org auth token found", new Object[0]);
                        distribution.f66768a = property7;
                    }
                    if (property8 != null && !property8.isEmpty() && distribution.f66771d == null) {
                        w22.getLogger().c(I2.DEBUG, "Distribution build configuration found: %s", property8);
                        distribution.f66771d = property8;
                    }
                    if (property9 != null && !property9.isEmpty() && distribution.f66772e == null) {
                        String[] split = property9.split(",", -1);
                        ArrayList arrayList = new ArrayList();
                        for (String str2 : split) {
                            String trim = str2.trim();
                            if (!trim.isEmpty()) {
                                arrayList.add(trim);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            w22.getLogger().c(I2.DEBUG, "Distribution install groups override found: %s", arrayList);
                            distribution.f66772e = arrayList;
                        }
                    }
                }
            }
        }
        if (w22.getThreadChecker() instanceof io.sentry.util.thread.b) {
            w22.setThreadChecker(io.sentry.util.thread.c.d());
        }
        if (w22.getPerformanceCollectors().isEmpty()) {
            w22.addPerformanceCollector(new C7170m0());
        }
        if (w22.isEnableBackpressureHandling() && io.sentry.util.r.c()) {
            if (w22.getBackpressureMonitor() instanceof io.sentry.backpressure.c) {
                w22.setBackpressureMonitor(new io.sentry.backpressure.a(A1.C(), w22));
            }
            w22.getBackpressureMonitor().start();
        }
        io.sentry.util.i.c(w22);
        io.sentry.util.i.b(w22);
        w22.getLogger().c(I2.INFO, "Continuous profiler is enabled %s mode: %s", Boolean.valueOf(w22.isContinuousProfilingEnabled()), w22.getProfileLifecycle());
    }

    private static void h(W2 w22) {
        if (io.sentry.util.r.c()) {
            if (U2.AUTO.equals(w22.getOpenTelemetryMode())) {
                if (io.sentry.util.m.b("io.sentry.opentelemetry.agent.AgentMarker", J0.e())) {
                    w22.getLogger().c(I2.DEBUG, "openTelemetryMode has been inferred from AUTO to AGENT", new Object[0]);
                    w22.setOpenTelemetryMode(U2.AGENT);
                } else if (io.sentry.util.m.b("io.sentry.opentelemetry.agent.AgentlessMarker", J0.e())) {
                    w22.getLogger().c(I2.DEBUG, "openTelemetryMode has been inferred from AUTO to AGENTLESS", new Object[0]);
                    w22.setOpenTelemetryMode(U2.AGENTLESS);
                } else if (io.sentry.util.m.b("io.sentry.opentelemetry.agent.AgentlessSpringMarker", J0.e())) {
                    w22.getLogger().c(I2.DEBUG, "openTelemetryMode has been inferred from AUTO to AGENTLESS_SPRING", new Object[0]);
                    w22.setOpenTelemetryMode(U2.AGENTLESS_SPRING);
                }
            }
        }
        U2 u22 = U2.OFF;
        if (u22 == w22.getOpenTelemetryMode()) {
            w22.setSpanFactory(new C7181p());
        }
        f66655a.close();
        if (u22 == w22.getOpenTelemetryMode()) {
            f66655a = new C7177o();
        } else {
            f66655a = B1.a(new io.sentry.util.m(), J0.e());
        }
        if (io.sentry.util.r.c()) {
            U2 openTelemetryMode = w22.getOpenTelemetryMode();
            Iterator it = (u22.equals(openTelemetryMode) ? Collections.EMPTY_LIST : io.sentry.util.v.a(openTelemetryMode)).iterator();
            while (it.hasNext()) {
                w22.addIgnoredSpanOrigin((String) it.next());
            }
        }
    }

    public static boolean i() {
        return d().isEnabled();
    }

    public static void j(String str, String str2) {
        d().setTag(str, str2);
    }
}
