package io.sentry;

import com.sports.insider.MyApp;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.sentry.android.core.SentryAndroidOptions;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.ServiceLoader;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class d4 {

    /* renamed from: a, reason: collision with root package name */
    public static volatile c1 f16306a = s2.f17052a;

    /* renamed from: b, reason: collision with root package name */
    public static volatile b1 f16307b = q2.f16972b;

    /* renamed from: c, reason: collision with root package name */
    public static final s3 f16308c = new s3(b6.empty());

    /* renamed from: d, reason: collision with root package name */
    public static volatile boolean f16309d = false;

    /* renamed from: e, reason: collision with root package name */
    public static final Charset f16310e = Charset.forName("UTF-8");

    /* renamed from: f, reason: collision with root package name */
    public static final long f16311f = System.currentTimeMillis();

    /* renamed from: g, reason: collision with root package name */
    public static final io.sentry.util.a f16312g = new io.sentry.util.a();

    public static io.sentry.protocol.v a(String str, b5 b5Var) {
        return d().A(str, b5Var);
    }

    public static void b() {
        r a7 = f16312g.a();
        try {
            b1 d10 = d();
            f16307b = q2.f16972b;
            f16306a.close();
            d10.a(false);
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

    public static void c(u3 u3Var) {
        d().u(u3Var);
    }

    public static b1 d() {
        if (f16309d) {
            return f16307b;
        }
        b1 b1Var = f16306a.get();
        if (b1Var != null && !b1Var.j()) {
            return b1Var;
        }
        b1 D = f16307b.D("getCurrentScopes");
        f16306a.a(D);
        return D;
    }

    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object, java.util.Collection] */
    public static void e(k2 k2Var, io.sentry.android.core.e eVar) {
        b6 b6Var = (b6) SentryAndroidOptions.class.getDeclaredConstructor(null).newInstance(null);
        try {
            io.sentry.android.core.c1.a((io.sentry.android.core.v) eVar.f15569a, (MyApp) eVar.f15570b, (androidx.credentials.playservices.controllers.CreateRestoreCredential.a) eVar.f15571c, (SentryAndroidOptions) b6Var);
        } catch (Throwable th2) {
            b6Var.getLogger().e(b5.ERROR, "Error in the 'OptionsConfiguration.configure' callback.", th2);
        }
        r a7 = f16312g.a();
        try {
            if (!b6Var.getClass().getName().equals("io.sentry.android.core.SentryAndroidOptions") && io.sentry.util.h.f17164a) {
                throw new IllegalArgumentException("You are running Android. Please, use SentryAndroid.init. ".concat(b6Var.getClass().getName()));
            }
            if (i(b6Var)) {
                Boolean isGlobalHubMode = b6Var.isGlobalHubMode();
                int i5 = 1;
                boolean booleanValue = isGlobalHubMode != null ? isGlobalHubMode.booleanValue() : true;
                int i10 = 0;
                b6Var.getLogger().h(b5.INFO, "GlobalHubMode: '%s'", String.valueOf(booleanValue));
                f16309d = booleanValue;
                if (b6Var.getFatalLogger() instanceof n2) {
                    b6Var.setFatalLogger(new k2());
                }
                s3 s3Var = f16308c;
                if (m4.g.w(s3Var.f17063l, b6Var, h())) {
                    if (h()) {
                        b6Var.getLogger().h(b5.WARNING, "Sentry has been already initialized. Previous configuration will be overwritten.", new Object[0]);
                    }
                    d().a(true);
                    s3Var.f17063l = b6Var;
                    ?? r32 = s3Var.f17060h;
                    s3Var.f17060h = s3.a(b6Var.getMaxBreadcrumbs());
                    Iterator it = r32.iterator();
                    while (it.hasNext()) {
                        s3Var.h((e) it.next(), null);
                    }
                    f16307b = new x3(new s3(b6Var), new s3(b6Var), s3Var);
                    if (b6Var.isDebug() && (b6Var.getLogger() instanceof n2)) {
                        b6Var.setLogger(new k2());
                    }
                    g(b6Var);
                    f16306a.a(f16307b);
                    f(b6Var);
                    s3Var.f17071u = new com.android.billingclient.api.x0(b6Var);
                    if (b6Var.getExecutorService().isClosed()) {
                        b6Var.setExecutorService(new com.google.firebase.messaging.x(b6Var));
                        b6Var.getExecutorService().f();
                    }
                    try {
                        b6Var.getExecutorService().submit(new b4(b6Var, i10));
                    } catch (RejectedExecutionException e7) {
                        b6Var.getLogger().e(b5.DEBUG, "Failed to call the executor. Lazy fields will not be loaded. Did you call Sentry.close()?", e7);
                    }
                    try {
                        b6Var.getExecutorService().submit(new androidx.core.widget.b(9, b6Var));
                    } catch (Throwable th3) {
                        b6Var.getLogger().e(b5.DEBUG, "Failed to move previous session.", th3);
                    }
                    for (q1 q1Var : b6Var.getIntegrations()) {
                        try {
                            q1Var.y(b6Var);
                        } catch (Throwable th4) {
                            b6Var.getLogger().e(b5.WARNING, "Failed to register the integration " + q1Var.getClass().getName(), th4);
                        }
                    }
                    try {
                        b6Var.getExecutorService().submit(new b4(b6Var, 2));
                    } catch (Throwable th5) {
                        b6Var.getLogger().e(b5.DEBUG, "Failed to notify options observers.", th5);
                    }
                    try {
                        b6Var.getExecutorService().submit(new e3(b6Var));
                    } catch (Throwable th6) {
                        b6Var.getLogger().e(b5.DEBUG, "Failed to finalize previous session.", th6);
                    }
                    try {
                        b6Var.getExecutorService().submit(new b4(b6Var, i5));
                    } catch (Throwable th7) {
                        b6Var.getLogger().e(b5.ERROR, "Failed to call the executor. App start profiling config will not be changed. Did you call Sentry.close()?", th7);
                    }
                    ILogger logger = b6Var.getLogger();
                    b5 b5Var = b5.DEBUG;
                    logger.h(b5Var, "Using openTelemetryMode %s", b6Var.getOpenTelemetryMode());
                    b6Var.getLogger().h(b5Var, "Using span factory %s", b6Var.getSpanFactory().getClass().getName());
                    b6Var.getLogger().h(b5Var, "Using scopes storage %s", f16306a.getClass().getName());
                } else {
                    b6Var.getLogger().h(b5.WARNING, "This init call has been ignored due to priority being too low.", new Object[0]);
                }
            }
            a7.close();
        } catch (Throwable th8) {
            try {
                a7.close();
            } catch (Throwable th9) {
                th8.addSuppressed(th9);
            }
            throw th8;
        }
    }

    public static void f(b6 b6Var) {
        Iterator it;
        ILogger logger;
        Iterator it2;
        io.sentry.cache.d cVar;
        ILogger logger2 = b6Var.getLogger();
        b5 b5Var = b5.INFO;
        logger2.h(b5Var, "Initializing SDK with DSN: '%s'", b6Var.getDsn());
        String outboxPath = b6Var.getOutboxPath();
        if (outboxPath != null) {
            b6Var.getRuntimeManager().b(new c4(new File(outboxPath), 0));
        } else {
            logger2.h(b5Var, "No outbox dir path is defined in options.", new Object[0]);
        }
        String cacheDirPath = b6Var.getCacheDirPath();
        if (cacheDirPath != null) {
            b6Var.getRuntimeManager().b(new c4(new File(cacheDirPath), 1));
            if (b6Var.getEnvelopeDiskCache() instanceof io.sentry.transport.i) {
                Charset charset = io.sentry.cache.c.f16240i;
                String cacheDirPath2 = b6Var.getCacheDirPath();
                int maxCacheItems = b6Var.getMaxCacheItems();
                if (cacheDirPath2 == null) {
                    b6Var.getLogger().h(b5.WARNING, "cacheDirPath is null, returning NoOpEnvelopeCache", new Object[0]);
                    cVar = io.sentry.transport.i.f17133a;
                } else {
                    cVar = new io.sentry.cache.c(b6Var, cacheDirPath2, maxCacheItems);
                }
                b6Var.setEnvelopeDiskCache(cVar);
            }
        }
        String profilingTracesDirPath = b6Var.getProfilingTracesDirPath();
        if ((b6Var.isProfilingEnabled() || b6Var.isContinuousProfilingEnabled()) && profilingTracesDirPath != null) {
            File file = new File(profilingTracesDirPath);
            b6Var.getRuntimeManager().b(new c4(file, 2));
            try {
                b6Var.getExecutorService().submit(new aa.c(26, file));
            } catch (RejectedExecutionException e7) {
                b6Var.getLogger().e(b5.ERROR, "Failed to call the executor. Old profiles will not be deleted. Did you call Sentry.close()?", e7);
            }
        }
        io.sentry.internal.modules.a modulesLoader = b6Var.getModulesLoader();
        if (!b6Var.isSendModules()) {
            b6Var.setModulesLoader(io.sentry.internal.modules.e.f16532a);
        } else if (modulesLoader instanceof io.sentry.internal.modules.e) {
            b6Var.setModulesLoader(new io.sentry.internal.modules.f(Arrays.asList(new io.sentry.internal.modules.c(b6Var.getLogger()), new io.sentry.internal.modules.f(b6Var.getLogger())), b6Var.getLogger()));
        }
        if (b6Var.getDebugMetaLoader() instanceof io.sentry.internal.debugmeta.b) {
            b6Var.setDebugMetaLoader(new io.sentry.internal.debugmeta.c(b6Var.getLogger()));
        }
        List<Properties> d10 = b6Var.getDebugMetaLoader().d();
        if (d10 != null) {
            if (b6Var.getBundleIds().isEmpty()) {
                Iterator it3 = d10.iterator();
                while (it3.hasNext()) {
                    String property = ((Properties) it3.next()).getProperty("io.sentry.bundle-ids");
                    b6Var.getLogger().h(b5.DEBUG, "Bundle IDs found: %s", property);
                    if (property != null) {
                        for (String str : property.split(StringUtils.COMMA, -1)) {
                            b6Var.addBundleId(str);
                        }
                    }
                }
            }
            if (b6Var.getProguardUuid() == null) {
                Iterator it4 = d10.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        break;
                    }
                    String property2 = ((Properties) it4.next()).getProperty("io.sentry.ProguardUuids");
                    if (property2 != null) {
                        b6Var.getLogger().h(b5.DEBUG, "Proguard UUID found: %s", property2);
                        b6Var.setProguardUuid(property2);
                        break;
                    }
                }
            }
            Iterator it5 = d10.iterator();
            while (true) {
                if (!it5.hasNext()) {
                    break;
                }
                Properties properties = (Properties) it5.next();
                String property3 = properties.getProperty("io.sentry.build-tool");
                if (property3 != null) {
                    String property4 = properties.getProperty("io.sentry.build-tool-version");
                    if (property4 == null) {
                        property4 = "unknown";
                    }
                    b6Var.getLogger().h(b5.DEBUG, "Build tool found: %s, version %s", property3, property4);
                    z4.d().b(property3, property4);
                }
            }
            for (Properties properties2 : d10) {
                String property5 = properties2.getProperty("io.sentry.distribution.org-slug");
                String property6 = properties2.getProperty("io.sentry.distribution.project-slug");
                String property7 = properties2.getProperty("io.sentry.distribution.auth-token");
                String property8 = properties2.getProperty("io.sentry.distribution.build-configuration");
                if (property5 != null || property6 != null || property7 != null || property8 != null) {
                    s5 distribution = b6Var.getDistribution();
                    if (property5 != null && !property5.isEmpty() && distribution.f17084b.isEmpty()) {
                        b6Var.getLogger().h(b5.DEBUG, "Distribution org slug found: %s", property5);
                        distribution.f17084b = property5;
                    }
                    if (property6 != null && !property6.isEmpty() && distribution.f17085c.isEmpty()) {
                        b6Var.getLogger().h(b5.DEBUG, "Distribution project slug found: %s", property6);
                        distribution.f17085c = property6;
                    }
                    if (property7 != null && !property7.isEmpty() && distribution.f17083a.isEmpty()) {
                        b6Var.getLogger().h(b5.DEBUG, "Distribution org auth token found", new Object[0]);
                        distribution.f17083a = property7;
                    }
                    if (property8 != null && !property8.isEmpty() && distribution.f17086d == null) {
                        b6Var.getLogger().h(b5.DEBUG, "Distribution build configuration found: %s", property8);
                        distribution.f17086d = property8;
                    }
                }
            }
        }
        if (b6Var.getThreadChecker() instanceof io.sentry.util.thread.b) {
            b6Var.setThreadChecker(io.sentry.util.thread.c.f17189b);
        }
        if (b6Var.getPerformanceCollectors().isEmpty()) {
            b6Var.addPerformanceCollector(new r1());
        }
        if (b6Var.isEnableBackpressureHandling() && !io.sentry.util.h.f17164a) {
            if (b6Var.getBackpressureMonitor() instanceof io.sentry.backpressure.c) {
                b6Var.setBackpressureMonitor(new io.sentry.backpressure.a(b6Var));
            }
            b6Var.getBackpressureMonitor().start();
        }
        if (!io.sentry.util.h.f17164a && b6Var.isContinuousProfilingEnabled() && (b6Var.getContinuousProfiler() instanceof j2)) {
            try {
                m4.g.l(b6Var);
                logger = b6Var.getLogger();
                b6Var.getProfilingTracesHz();
                b6Var.getExecutorService();
                try {
                    it2 = ServiceLoader.load(io.sentry.profiling.a.class).iterator();
                } catch (Throwable th2) {
                    logger.e(b5.ERROR, "Failed to load continuous profiler provider, using NoOpContinuousProfiler", th2);
                }
            } catch (Exception e9) {
                b6Var.getLogger().e(b5.ERROR, "Failed to create default profiling traces directory", e9);
            }
            if ((it2.hasNext() ? it2.next() : null) != null) {
                throw new ClassCastException();
            }
            logger.h(b5.DEBUG, "No continuous profiler provider found, using NoOpContinuousProfiler", new Object[0]);
            b6Var.getLogger().h(b5.WARNING, "Could not load profiler, profiling will be disabled. If you are using Spring or Spring Boot with the OTEL Agent profiler init will be retried.", new Object[0]);
            b6Var.getContinuousProfiler();
        } else {
            b6Var.getContinuousProfiler();
        }
        if (!io.sentry.util.h.f17164a && b6Var.isContinuousProfilingEnabled() && (b6Var.getProfilerConverter() instanceof o2)) {
            ILogger logger3 = f16308c.f17063l.getLogger();
            try {
                it = ServiceLoader.load(io.sentry.profiling.b.class).iterator();
            } catch (Throwable th3) {
                logger3.e(b5.ERROR, "Failed to load profile converter provider, using NoOpProfileConverter", th3);
            }
            if ((it.hasNext() ? it.next() : null) != null) {
                throw new ClassCastException();
            }
            logger3.h(b5.DEBUG, "No profile converter provider found, using NoOpProfileConverter", new Object[0]);
            b6Var.getLogger().h(b5.WARNING, "Could not load profile converter. If you are using Spring or Spring Boot with the OTEL Agent, profile converter init will be retried.", new Object[0]);
            b6Var.getProfilerConverter();
        } else {
            b6Var.getProfilerConverter();
        }
        b6Var.getLogger().h(b5.INFO, "Continuous profiler is enabled %s mode: %s", Boolean.valueOf(b6Var.isContinuousProfilingEnabled()), b6Var.getProfileLifecycle());
    }

    public static void g(b6 b6Var) {
        c1 sVar;
        Class A;
        Object newInstance;
        List list;
        n2 n2Var = n2.f16660a;
        boolean z5 = io.sentry.util.h.f17164a;
        if (!z5) {
            if (k5.AUTO.equals(b6Var.getOpenTelemetryMode())) {
                if (io.sentry.hints.j.z("io.sentry.opentelemetry.agent.AgentMarker", n2Var)) {
                    b6Var.getLogger().h(b5.DEBUG, "openTelemetryMode has been inferred from AUTO to AGENT", new Object[0]);
                    b6Var.setOpenTelemetryMode(k5.AGENT);
                } else if (io.sentry.hints.j.z("io.sentry.opentelemetry.agent.AgentlessMarker", n2Var)) {
                    b6Var.getLogger().h(b5.DEBUG, "openTelemetryMode has been inferred from AUTO to AGENTLESS", new Object[0]);
                    b6Var.setOpenTelemetryMode(k5.AGENTLESS);
                } else if (io.sentry.hints.j.z("io.sentry.opentelemetry.agent.AgentlessSpringMarker", n2Var)) {
                    b6Var.getLogger().h(b5.DEBUG, "openTelemetryMode has been inferred from AUTO to AGENTLESS_SPRING", new Object[0]);
                    b6Var.setOpenTelemetryMode(k5.AGENTLESS_SPRING);
                }
            }
        }
        k5 k5Var = k5.OFF;
        if (k5Var == b6Var.getOpenTelemetryMode()) {
            b6Var.setSpanFactory(new x2(1));
        }
        f16306a.close();
        if (k5Var == b6Var.getOpenTelemetryMode()) {
            f16306a = new s();
        } else {
            if (!z5 && io.sentry.hints.j.z("io.sentry.opentelemetry.OtelContextScopesStorage", n2Var) && (A = io.sentry.hints.j.A("io.sentry.opentelemetry.OtelContextScopesStorage", n2Var)) != null) {
                try {
                    newInstance = A.getDeclaredConstructor(null).newInstance(null);
                } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused) {
                }
                if (newInstance != null && (newInstance instanceof c1)) {
                    sVar = (c1) newInstance;
                    f16306a = sVar;
                }
            }
            sVar = new s();
            f16306a = sVar;
        }
        if (io.sentry.util.h.f17164a) {
            return;
        }
        k5 openTelemetryMode = b6Var.getOpenTelemetryMode();
        if (k5.OFF.equals(openTelemetryMode)) {
            list = Collections.EMPTY_LIST;
        } else {
            ConcurrentHashMap concurrentHashMap = io.sentry.util.k.f17170a;
            ArrayList arrayList = new ArrayList();
            k5 k5Var2 = k5.AGENT;
            if (k5Var2 == openTelemetryMode || k5.AGENTLESS_SPRING == openTelemetryMode) {
                arrayList.add("auto.http.spring_jakarta.webmvc");
                arrayList.add("auto.http.spring.webmvc");
                arrayList.add("auto.http.spring7.webmvc");
                arrayList.add("auto.spring_jakarta.webflux");
                arrayList.add("auto.spring.webflux");
                arrayList.add("auto.spring7.webflux");
                arrayList.add("auto.db.jdbc");
                arrayList.add("auto.http.spring_jakarta.webclient");
                arrayList.add("auto.http.spring.webclient");
                arrayList.add("auto.http.spring7.webclient");
                arrayList.add("auto.http.spring_jakarta.restclient");
                arrayList.add("auto.http.spring.restclient");
                arrayList.add("auto.http.spring7.restclient");
                arrayList.add("auto.http.spring_jakarta.resttemplate");
                arrayList.add("auto.http.spring.resttemplate");
                arrayList.add("auto.http.spring7.resttemplate");
                arrayList.add("auto.http.openfeign");
                arrayList.add("auto.http.ktor-client");
            }
            if (k5Var2 == openTelemetryMode) {
                arrayList.add("auto.graphql.graphql");
                arrayList.add("auto.graphql.graphql22");
            }
            list = arrayList;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b6Var.addIgnoredSpanOrigin((String) it.next());
        }
    }

    public static boolean h() {
        return d().isEnabled();
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0398 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x03c9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0390 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0382 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x036e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0360 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0285 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x012a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x011a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x017a A[LOOP:0: B:35:0x0174->B:37:0x017a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01d0 A[LOOP:1: B:45:0x01ca->B:47:0x01d0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01ec A[LOOP:2: B:50:0x01e6->B:52:0x01ec, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x024d A[LOOP:4: B:77:0x0247->B:79:0x024d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0271 A[LOOP:5: B:82:0x026b->B:84:0x0271, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean i(b6 b6Var) {
        Properties properties;
        Properties a7;
        io.sentry.config.b bVar;
        String property;
        Double valueOf;
        String property2;
        Double valueOf2;
        String property3;
        String property4;
        String property5;
        Iterator it;
        Iterator it2;
        List<String> c2;
        Iterator it3;
        Iterator it4;
        String property6;
        Long valueOf3;
        String property7;
        Long valueOf4;
        String property8;
        Long valueOf5;
        String property9;
        Long valueOf6;
        String property10;
        Long valueOf7;
        String property11;
        String property12;
        InputStream resourceAsStream;
        Properties a10;
        Properties a11;
        if (b6Var.isEnableExternalConfiguration()) {
            k2 k2Var = new k2();
            ArrayList arrayList = new ArrayList();
            arrayList.add(new io.sentry.config.e("sentry.", System.getProperties()));
            arrayList.add(new io.sentry.config.c());
            String property13 = System.getProperty("sentry.properties.file");
            if (property13 != null && (a11 = new com.google.android.gms.internal.measurement.g4(property13, k2Var, true).a()) != null) {
                arrayList.add(new io.sentry.config.e(a11));
            }
            String str = System.getenv("SENTRY_PROPERTIES_FILE");
            if (str != null && (a10 = new com.google.android.gms.internal.measurement.g4(str, k2Var, true).a()) != null) {
                arrayList.add(new io.sentry.config.e(a10));
            }
            Double d10 = null;
            try {
                resourceAsStream = com.google.android.gms.internal.measurement.d5.j(io.sentry.config.a.class.getClassLoader()).getResourceAsStream("sentry.properties");
            } catch (IOException e7) {
                k2Var.b(b5.ERROR, e7, "Failed to load Sentry configuration from classpath resource: %s", "sentry.properties");
            }
            if (resourceAsStream != null) {
                try {
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(resourceAsStream);
                    try {
                        properties = new Properties();
                        properties.load(bufferedInputStream);
                        bufferedInputStream.close();
                        resourceAsStream.close();
                        if (properties != null) {
                            arrayList.add(new io.sentry.config.e(properties));
                        }
                        a7 = new com.google.android.gms.internal.measurement.g4("sentry.properties", k2Var, false).a();
                        if (a7 != null) {
                            arrayList.add(new io.sentry.config.e(a7));
                        }
                        bVar = new io.sentry.config.b(arrayList);
                        ILogger logger = b6Var.getLogger();
                        e0 e0Var = new e0();
                        e0Var.f16339a = bVar.getProperty("dsn");
                        e0Var.f16340b = bVar.getProperty("environment");
                        e0Var.f16341c = bVar.getProperty("release");
                        e0Var.f16342d = bVar.getProperty("dist");
                        e0Var.f16343e = bVar.getProperty("servername");
                        e0Var.f16344f = bVar.b("uncaught.handler.enabled");
                        e0Var.f16358v = bVar.b("uncaught.handler.print-stacktrace");
                        property = bVar.getProperty("traces-sample-rate");
                        if (property != null) {
                            try {
                                valueOf = Double.valueOf(property);
                            } catch (NumberFormatException unused) {
                            }
                            e0Var.f16347i = valueOf;
                            property2 = bVar.getProperty("profiles-sample-rate");
                            if (property2 != null) {
                                try {
                                    valueOf2 = Double.valueOf(property2);
                                } catch (NumberFormatException unused2) {
                                }
                                e0Var.j = valueOf2;
                                e0Var.f16345g = bVar.b("debug");
                                e0Var.f16346h = bVar.b("enable-deduplication");
                                e0Var.f16359w = bVar.b("send-client-reports");
                                e0Var.K = bVar.b("force-init");
                                property3 = bVar.getProperty("max-request-body-size");
                                if (property3 != null) {
                                    e0Var.f16348k = z5.valueOf(property3.toUpperCase(Locale.ROOT));
                                }
                                for (Map.Entry entry : ((ConcurrentHashMap) bVar.a()).entrySet()) {
                                    e0Var.f16349l.put((String) entry.getKey(), (String) entry.getValue());
                                }
                                property4 = bVar.getProperty("proxy.host");
                                String property14 = bVar.getProperty("proxy.user");
                                String property15 = bVar.getProperty("proxy.pass");
                                property5 = bVar.getProperty("proxy.port");
                                if (property5 == null) {
                                    property5 = "80";
                                }
                                if (property4 != null) {
                                    y5 y5Var = new y5();
                                    y5Var.f17257a = property4;
                                    y5Var.f17258b = property5;
                                    y5Var.f17259c = property14;
                                    y5Var.f17260d = property15;
                                    e0Var.f16350m = y5Var;
                                }
                                it = bVar.c("in-app-includes").iterator();
                                while (it.hasNext()) {
                                    e0Var.f16352o.add((String) it.next());
                                }
                                it2 = bVar.c("in-app-excludes").iterator();
                                while (it2.hasNext()) {
                                    e0Var.f16351n.add((String) it2.next());
                                }
                                c2 = bVar.getProperty("trace-propagation-targets") == null ? bVar.c("trace-propagation-targets") : null;
                                if (c2 == null && bVar.getProperty("tracing-origins") != null) {
                                    c2 = bVar.c("tracing-origins");
                                }
                                if (c2 != null) {
                                    for (String str2 : c2) {
                                        if (e0Var.f16353p == null) {
                                            e0Var.f16353p = new CopyOnWriteArrayList();
                                        }
                                        if (!str2.isEmpty()) {
                                            e0Var.f16353p.add(str2);
                                        }
                                    }
                                }
                                it3 = bVar.c("context-tags").iterator();
                                while (it3.hasNext()) {
                                    e0Var.q.add((String) it3.next());
                                }
                                e0Var.f16354r = bVar.getProperty("proguard-uuid");
                                it4 = bVar.c("bundle-ids").iterator();
                                while (it4.hasNext()) {
                                    e0Var.f16360x.add((String) it4.next());
                                }
                                property6 = bVar.getProperty("idle-timeout");
                                if (property6 != null) {
                                    try {
                                        valueOf3 = Long.valueOf(property6);
                                    } catch (NumberFormatException unused3) {
                                    }
                                    e0Var.f16355s = valueOf3;
                                    String property16 = bVar.getProperty("ignored-errors");
                                    e0Var.f16357u = property16 != null ? Arrays.asList(property16.split(StringUtils.COMMA)) : null;
                                    e0Var.f16361y = bVar.b("enabled");
                                    e0Var.f16362z = bVar.b("enable-pretty-serialization-output");
                                    e0Var.G = bVar.b("send-modules");
                                    e0Var.H = bVar.b("send-default-pii");
                                    String property17 = bVar.getProperty("ignored-checkins");
                                    e0Var.E = property17 != null ? Arrays.asList(property17.split(StringUtils.COMMA)) : null;
                                    String property18 = bVar.getProperty("ignored-transactions");
                                    e0Var.F = property18 != null ? Arrays.asList(property18.split(StringUtils.COMMA)) : null;
                                    e0Var.I = bVar.b("enable-backpressure-handling");
                                    e0Var.J = bVar.b("global-hub-mode");
                                    e0Var.L = bVar.b("capture-open-telemetry-events");
                                    e0Var.B = bVar.b("logs.enabled");
                                    e0Var.C = bVar.b("metrics.enabled");
                                    for (String str3 : bVar.c("ignored-exceptions-for-type")) {
                                        try {
                                            Class<?> cls = Class.forName(str3);
                                            if (Throwable.class.isAssignableFrom(cls)) {
                                                e0Var.f16356t.add(cls);
                                            } else {
                                                logger.h(b5.WARNING, "Skipping setting %s as ignored-exception-for-type. Reason: %s does not extend Throwable", str3, str3);
                                            }
                                        } catch (ClassNotFoundException unused4) {
                                            logger.h(b5.WARNING, "Skipping setting %s as ignored-exception-for-type. Reason: %s class is not found", str3, str3);
                                        }
                                    }
                                    property7 = bVar.getProperty("cron.default-checkin-margin");
                                    if (property7 != null) {
                                        try {
                                            valueOf4 = Long.valueOf(property7);
                                        } catch (NumberFormatException unused5) {
                                        }
                                        property8 = bVar.getProperty("cron.default-max-runtime");
                                        if (property8 != null) {
                                            try {
                                                valueOf5 = Long.valueOf(property8);
                                            } catch (NumberFormatException unused6) {
                                            }
                                            String property19 = bVar.getProperty("cron.default-timezone");
                                            property9 = bVar.getProperty("cron.default-failure-issue-threshold");
                                            if (property9 != null) {
                                                try {
                                                    valueOf6 = Long.valueOf(property9);
                                                } catch (NumberFormatException unused7) {
                                                }
                                                property10 = bVar.getProperty("cron.default-recovery-threshold");
                                                if (property10 != null) {
                                                    try {
                                                        valueOf7 = Long.valueOf(property10);
                                                    } catch (NumberFormatException unused8) {
                                                    }
                                                    if (valueOf4 == null || valueOf5 != null || property19 != null || valueOf6 != null || valueOf7 != null) {
                                                        r5 r5Var = new r5();
                                                        r5Var.f16988a = valueOf4;
                                                        r5Var.f16989b = valueOf5;
                                                        r5Var.f16990c = property19;
                                                        r5Var.f16991d = valueOf6;
                                                        r5Var.f16992e = valueOf7;
                                                        e0Var.P = r5Var;
                                                    }
                                                    e0Var.A = bVar.b("enable-spotlight");
                                                    e0Var.D = bVar.getProperty("spotlight-connection-url");
                                                    property11 = bVar.getProperty("profile-session-sample-rate");
                                                    if (property11 != null) {
                                                        try {
                                                            d10 = Double.valueOf(property11);
                                                        } catch (NumberFormatException unused9) {
                                                        }
                                                    }
                                                    e0Var.M = d10;
                                                    e0Var.N = bVar.getProperty("profiling-traces-dir-path");
                                                    property12 = bVar.getProperty("profile-lifecycle");
                                                    if (property12 != null && !property12.isEmpty()) {
                                                        e0Var.O = i3.valueOf(property12.toUpperCase());
                                                    }
                                                    b6Var.merge(e0Var);
                                                }
                                                valueOf7 = null;
                                                if (valueOf4 == null) {
                                                }
                                                r5 r5Var2 = new r5();
                                                r5Var2.f16988a = valueOf4;
                                                r5Var2.f16989b = valueOf5;
                                                r5Var2.f16990c = property19;
                                                r5Var2.f16991d = valueOf6;
                                                r5Var2.f16992e = valueOf7;
                                                e0Var.P = r5Var2;
                                                e0Var.A = bVar.b("enable-spotlight");
                                                e0Var.D = bVar.getProperty("spotlight-connection-url");
                                                property11 = bVar.getProperty("profile-session-sample-rate");
                                                if (property11 != null) {
                                                }
                                                e0Var.M = d10;
                                                e0Var.N = bVar.getProperty("profiling-traces-dir-path");
                                                property12 = bVar.getProperty("profile-lifecycle");
                                                if (property12 != null) {
                                                    e0Var.O = i3.valueOf(property12.toUpperCase());
                                                }
                                                b6Var.merge(e0Var);
                                            }
                                            valueOf6 = null;
                                            property10 = bVar.getProperty("cron.default-recovery-threshold");
                                            if (property10 != null) {
                                            }
                                            valueOf7 = null;
                                            if (valueOf4 == null) {
                                            }
                                            r5 r5Var22 = new r5();
                                            r5Var22.f16988a = valueOf4;
                                            r5Var22.f16989b = valueOf5;
                                            r5Var22.f16990c = property19;
                                            r5Var22.f16991d = valueOf6;
                                            r5Var22.f16992e = valueOf7;
                                            e0Var.P = r5Var22;
                                            e0Var.A = bVar.b("enable-spotlight");
                                            e0Var.D = bVar.getProperty("spotlight-connection-url");
                                            property11 = bVar.getProperty("profile-session-sample-rate");
                                            if (property11 != null) {
                                            }
                                            e0Var.M = d10;
                                            e0Var.N = bVar.getProperty("profiling-traces-dir-path");
                                            property12 = bVar.getProperty("profile-lifecycle");
                                            if (property12 != null) {
                                            }
                                            b6Var.merge(e0Var);
                                        }
                                        valueOf5 = null;
                                        String property192 = bVar.getProperty("cron.default-timezone");
                                        property9 = bVar.getProperty("cron.default-failure-issue-threshold");
                                        if (property9 != null) {
                                        }
                                        valueOf6 = null;
                                        property10 = bVar.getProperty("cron.default-recovery-threshold");
                                        if (property10 != null) {
                                        }
                                        valueOf7 = null;
                                        if (valueOf4 == null) {
                                        }
                                        r5 r5Var222 = new r5();
                                        r5Var222.f16988a = valueOf4;
                                        r5Var222.f16989b = valueOf5;
                                        r5Var222.f16990c = property192;
                                        r5Var222.f16991d = valueOf6;
                                        r5Var222.f16992e = valueOf7;
                                        e0Var.P = r5Var222;
                                        e0Var.A = bVar.b("enable-spotlight");
                                        e0Var.D = bVar.getProperty("spotlight-connection-url");
                                        property11 = bVar.getProperty("profile-session-sample-rate");
                                        if (property11 != null) {
                                        }
                                        e0Var.M = d10;
                                        e0Var.N = bVar.getProperty("profiling-traces-dir-path");
                                        property12 = bVar.getProperty("profile-lifecycle");
                                        if (property12 != null) {
                                        }
                                        b6Var.merge(e0Var);
                                    }
                                    valueOf4 = null;
                                    property8 = bVar.getProperty("cron.default-max-runtime");
                                    if (property8 != null) {
                                    }
                                    valueOf5 = null;
                                    String property1922 = bVar.getProperty("cron.default-timezone");
                                    property9 = bVar.getProperty("cron.default-failure-issue-threshold");
                                    if (property9 != null) {
                                    }
                                    valueOf6 = null;
                                    property10 = bVar.getProperty("cron.default-recovery-threshold");
                                    if (property10 != null) {
                                    }
                                    valueOf7 = null;
                                    if (valueOf4 == null) {
                                    }
                                    r5 r5Var2222 = new r5();
                                    r5Var2222.f16988a = valueOf4;
                                    r5Var2222.f16989b = valueOf5;
                                    r5Var2222.f16990c = property1922;
                                    r5Var2222.f16991d = valueOf6;
                                    r5Var2222.f16992e = valueOf7;
                                    e0Var.P = r5Var2222;
                                    e0Var.A = bVar.b("enable-spotlight");
                                    e0Var.D = bVar.getProperty("spotlight-connection-url");
                                    property11 = bVar.getProperty("profile-session-sample-rate");
                                    if (property11 != null) {
                                    }
                                    e0Var.M = d10;
                                    e0Var.N = bVar.getProperty("profiling-traces-dir-path");
                                    property12 = bVar.getProperty("profile-lifecycle");
                                    if (property12 != null) {
                                    }
                                    b6Var.merge(e0Var);
                                }
                                valueOf3 = null;
                                e0Var.f16355s = valueOf3;
                                String property162 = bVar.getProperty("ignored-errors");
                                e0Var.f16357u = property162 != null ? Arrays.asList(property162.split(StringUtils.COMMA)) : null;
                                e0Var.f16361y = bVar.b("enabled");
                                e0Var.f16362z = bVar.b("enable-pretty-serialization-output");
                                e0Var.G = bVar.b("send-modules");
                                e0Var.H = bVar.b("send-default-pii");
                                String property172 = bVar.getProperty("ignored-checkins");
                                e0Var.E = property172 != null ? Arrays.asList(property172.split(StringUtils.COMMA)) : null;
                                String property182 = bVar.getProperty("ignored-transactions");
                                e0Var.F = property182 != null ? Arrays.asList(property182.split(StringUtils.COMMA)) : null;
                                e0Var.I = bVar.b("enable-backpressure-handling");
                                e0Var.J = bVar.b("global-hub-mode");
                                e0Var.L = bVar.b("capture-open-telemetry-events");
                                e0Var.B = bVar.b("logs.enabled");
                                e0Var.C = bVar.b("metrics.enabled");
                                while (r5.hasNext()) {
                                }
                                property7 = bVar.getProperty("cron.default-checkin-margin");
                                if (property7 != null) {
                                }
                                valueOf4 = null;
                                property8 = bVar.getProperty("cron.default-max-runtime");
                                if (property8 != null) {
                                }
                                valueOf5 = null;
                                String property19222 = bVar.getProperty("cron.default-timezone");
                                property9 = bVar.getProperty("cron.default-failure-issue-threshold");
                                if (property9 != null) {
                                }
                                valueOf6 = null;
                                property10 = bVar.getProperty("cron.default-recovery-threshold");
                                if (property10 != null) {
                                }
                                valueOf7 = null;
                                if (valueOf4 == null) {
                                }
                                r5 r5Var22222 = new r5();
                                r5Var22222.f16988a = valueOf4;
                                r5Var22222.f16989b = valueOf5;
                                r5Var22222.f16990c = property19222;
                                r5Var22222.f16991d = valueOf6;
                                r5Var22222.f16992e = valueOf7;
                                e0Var.P = r5Var22222;
                                e0Var.A = bVar.b("enable-spotlight");
                                e0Var.D = bVar.getProperty("spotlight-connection-url");
                                property11 = bVar.getProperty("profile-session-sample-rate");
                                if (property11 != null) {
                                }
                                e0Var.M = d10;
                                e0Var.N = bVar.getProperty("profiling-traces-dir-path");
                                property12 = bVar.getProperty("profile-lifecycle");
                                if (property12 != null) {
                                }
                                b6Var.merge(e0Var);
                            }
                            valueOf2 = null;
                            e0Var.j = valueOf2;
                            e0Var.f16345g = bVar.b("debug");
                            e0Var.f16346h = bVar.b("enable-deduplication");
                            e0Var.f16359w = bVar.b("send-client-reports");
                            e0Var.K = bVar.b("force-init");
                            property3 = bVar.getProperty("max-request-body-size");
                            if (property3 != null) {
                            }
                            while (r5.hasNext()) {
                            }
                            property4 = bVar.getProperty("proxy.host");
                            String property142 = bVar.getProperty("proxy.user");
                            String property152 = bVar.getProperty("proxy.pass");
                            property5 = bVar.getProperty("proxy.port");
                            if (property5 == null) {
                            }
                            if (property4 != null) {
                            }
                            it = bVar.c("in-app-includes").iterator();
                            while (it.hasNext()) {
                            }
                            it2 = bVar.c("in-app-excludes").iterator();
                            while (it2.hasNext()) {
                            }
                            if (bVar.getProperty("trace-propagation-targets") == null) {
                            }
                            if (c2 == null) {
                                c2 = bVar.c("tracing-origins");
                            }
                            if (c2 != null) {
                            }
                            it3 = bVar.c("context-tags").iterator();
                            while (it3.hasNext()) {
                            }
                            e0Var.f16354r = bVar.getProperty("proguard-uuid");
                            it4 = bVar.c("bundle-ids").iterator();
                            while (it4.hasNext()) {
                            }
                            property6 = bVar.getProperty("idle-timeout");
                            if (property6 != null) {
                            }
                            valueOf3 = null;
                            e0Var.f16355s = valueOf3;
                            String property1622 = bVar.getProperty("ignored-errors");
                            e0Var.f16357u = property1622 != null ? Arrays.asList(property1622.split(StringUtils.COMMA)) : null;
                            e0Var.f16361y = bVar.b("enabled");
                            e0Var.f16362z = bVar.b("enable-pretty-serialization-output");
                            e0Var.G = bVar.b("send-modules");
                            e0Var.H = bVar.b("send-default-pii");
                            String property1722 = bVar.getProperty("ignored-checkins");
                            e0Var.E = property1722 != null ? Arrays.asList(property1722.split(StringUtils.COMMA)) : null;
                            String property1822 = bVar.getProperty("ignored-transactions");
                            e0Var.F = property1822 != null ? Arrays.asList(property1822.split(StringUtils.COMMA)) : null;
                            e0Var.I = bVar.b("enable-backpressure-handling");
                            e0Var.J = bVar.b("global-hub-mode");
                            e0Var.L = bVar.b("capture-open-telemetry-events");
                            e0Var.B = bVar.b("logs.enabled");
                            e0Var.C = bVar.b("metrics.enabled");
                            while (r5.hasNext()) {
                            }
                            property7 = bVar.getProperty("cron.default-checkin-margin");
                            if (property7 != null) {
                            }
                            valueOf4 = null;
                            property8 = bVar.getProperty("cron.default-max-runtime");
                            if (property8 != null) {
                            }
                            valueOf5 = null;
                            String property192222 = bVar.getProperty("cron.default-timezone");
                            property9 = bVar.getProperty("cron.default-failure-issue-threshold");
                            if (property9 != null) {
                            }
                            valueOf6 = null;
                            property10 = bVar.getProperty("cron.default-recovery-threshold");
                            if (property10 != null) {
                            }
                            valueOf7 = null;
                            if (valueOf4 == null) {
                            }
                            r5 r5Var222222 = new r5();
                            r5Var222222.f16988a = valueOf4;
                            r5Var222222.f16989b = valueOf5;
                            r5Var222222.f16990c = property192222;
                            r5Var222222.f16991d = valueOf6;
                            r5Var222222.f16992e = valueOf7;
                            e0Var.P = r5Var222222;
                            e0Var.A = bVar.b("enable-spotlight");
                            e0Var.D = bVar.getProperty("spotlight-connection-url");
                            property11 = bVar.getProperty("profile-session-sample-rate");
                            if (property11 != null) {
                            }
                            e0Var.M = d10;
                            e0Var.N = bVar.getProperty("profiling-traces-dir-path");
                            property12 = bVar.getProperty("profile-lifecycle");
                            if (property12 != null) {
                            }
                            b6Var.merge(e0Var);
                        }
                        valueOf = null;
                        e0Var.f16347i = valueOf;
                        property2 = bVar.getProperty("profiles-sample-rate");
                        if (property2 != null) {
                        }
                        valueOf2 = null;
                        e0Var.j = valueOf2;
                        e0Var.f16345g = bVar.b("debug");
                        e0Var.f16346h = bVar.b("enable-deduplication");
                        e0Var.f16359w = bVar.b("send-client-reports");
                        e0Var.K = bVar.b("force-init");
                        property3 = bVar.getProperty("max-request-body-size");
                        if (property3 != null) {
                        }
                        while (r5.hasNext()) {
                        }
                        property4 = bVar.getProperty("proxy.host");
                        String property1422 = bVar.getProperty("proxy.user");
                        String property1522 = bVar.getProperty("proxy.pass");
                        property5 = bVar.getProperty("proxy.port");
                        if (property5 == null) {
                        }
                        if (property4 != null) {
                        }
                        it = bVar.c("in-app-includes").iterator();
                        while (it.hasNext()) {
                        }
                        it2 = bVar.c("in-app-excludes").iterator();
                        while (it2.hasNext()) {
                        }
                        if (bVar.getProperty("trace-propagation-targets") == null) {
                        }
                        if (c2 == null) {
                        }
                        if (c2 != null) {
                        }
                        it3 = bVar.c("context-tags").iterator();
                        while (it3.hasNext()) {
                        }
                        e0Var.f16354r = bVar.getProperty("proguard-uuid");
                        it4 = bVar.c("bundle-ids").iterator();
                        while (it4.hasNext()) {
                        }
                        property6 = bVar.getProperty("idle-timeout");
                        if (property6 != null) {
                        }
                        valueOf3 = null;
                        e0Var.f16355s = valueOf3;
                        String property16222 = bVar.getProperty("ignored-errors");
                        e0Var.f16357u = property16222 != null ? Arrays.asList(property16222.split(StringUtils.COMMA)) : null;
                        e0Var.f16361y = bVar.b("enabled");
                        e0Var.f16362z = bVar.b("enable-pretty-serialization-output");
                        e0Var.G = bVar.b("send-modules");
                        e0Var.H = bVar.b("send-default-pii");
                        String property17222 = bVar.getProperty("ignored-checkins");
                        e0Var.E = property17222 != null ? Arrays.asList(property17222.split(StringUtils.COMMA)) : null;
                        String property18222 = bVar.getProperty("ignored-transactions");
                        e0Var.F = property18222 != null ? Arrays.asList(property18222.split(StringUtils.COMMA)) : null;
                        e0Var.I = bVar.b("enable-backpressure-handling");
                        e0Var.J = bVar.b("global-hub-mode");
                        e0Var.L = bVar.b("capture-open-telemetry-events");
                        e0Var.B = bVar.b("logs.enabled");
                        e0Var.C = bVar.b("metrics.enabled");
                        while (r5.hasNext()) {
                        }
                        property7 = bVar.getProperty("cron.default-checkin-margin");
                        if (property7 != null) {
                        }
                        valueOf4 = null;
                        property8 = bVar.getProperty("cron.default-max-runtime");
                        if (property8 != null) {
                        }
                        valueOf5 = null;
                        String property1922222 = bVar.getProperty("cron.default-timezone");
                        property9 = bVar.getProperty("cron.default-failure-issue-threshold");
                        if (property9 != null) {
                        }
                        valueOf6 = null;
                        property10 = bVar.getProperty("cron.default-recovery-threshold");
                        if (property10 != null) {
                        }
                        valueOf7 = null;
                        if (valueOf4 == null) {
                        }
                        r5 r5Var2222222 = new r5();
                        r5Var2222222.f16988a = valueOf4;
                        r5Var2222222.f16989b = valueOf5;
                        r5Var2222222.f16990c = property1922222;
                        r5Var2222222.f16991d = valueOf6;
                        r5Var2222222.f16992e = valueOf7;
                        e0Var.P = r5Var2222222;
                        e0Var.A = bVar.b("enable-spotlight");
                        e0Var.D = bVar.getProperty("spotlight-connection-url");
                        property11 = bVar.getProperty("profile-session-sample-rate");
                        if (property11 != null) {
                        }
                        e0Var.M = d10;
                        e0Var.N = bVar.getProperty("profiling-traces-dir-path");
                        property12 = bVar.getProperty("profile-lifecycle");
                        if (property12 != null) {
                        }
                        b6Var.merge(e0Var);
                    } finally {
                    }
                } finally {
                }
            } else {
                if (resourceAsStream != null) {
                    resourceAsStream.close();
                }
                properties = null;
                if (properties != null) {
                }
                a7 = new com.google.android.gms.internal.measurement.g4("sentry.properties", k2Var, false).a();
                if (a7 != null) {
                }
                bVar = new io.sentry.config.b(arrayList);
                ILogger logger2 = b6Var.getLogger();
                e0 e0Var2 = new e0();
                e0Var2.f16339a = bVar.getProperty("dsn");
                e0Var2.f16340b = bVar.getProperty("environment");
                e0Var2.f16341c = bVar.getProperty("release");
                e0Var2.f16342d = bVar.getProperty("dist");
                e0Var2.f16343e = bVar.getProperty("servername");
                e0Var2.f16344f = bVar.b("uncaught.handler.enabled");
                e0Var2.f16358v = bVar.b("uncaught.handler.print-stacktrace");
                property = bVar.getProperty("traces-sample-rate");
                if (property != null) {
                }
                valueOf = null;
                e0Var2.f16347i = valueOf;
                property2 = bVar.getProperty("profiles-sample-rate");
                if (property2 != null) {
                }
                valueOf2 = null;
                e0Var2.j = valueOf2;
                e0Var2.f16345g = bVar.b("debug");
                e0Var2.f16346h = bVar.b("enable-deduplication");
                e0Var2.f16359w = bVar.b("send-client-reports");
                e0Var2.K = bVar.b("force-init");
                property3 = bVar.getProperty("max-request-body-size");
                if (property3 != null) {
                }
                while (r5.hasNext()) {
                }
                property4 = bVar.getProperty("proxy.host");
                String property14222 = bVar.getProperty("proxy.user");
                String property15222 = bVar.getProperty("proxy.pass");
                property5 = bVar.getProperty("proxy.port");
                if (property5 == null) {
                }
                if (property4 != null) {
                }
                it = bVar.c("in-app-includes").iterator();
                while (it.hasNext()) {
                }
                it2 = bVar.c("in-app-excludes").iterator();
                while (it2.hasNext()) {
                }
                if (bVar.getProperty("trace-propagation-targets") == null) {
                }
                if (c2 == null) {
                }
                if (c2 != null) {
                }
                it3 = bVar.c("context-tags").iterator();
                while (it3.hasNext()) {
                }
                e0Var2.f16354r = bVar.getProperty("proguard-uuid");
                it4 = bVar.c("bundle-ids").iterator();
                while (it4.hasNext()) {
                }
                property6 = bVar.getProperty("idle-timeout");
                if (property6 != null) {
                }
                valueOf3 = null;
                e0Var2.f16355s = valueOf3;
                String property162222 = bVar.getProperty("ignored-errors");
                e0Var2.f16357u = property162222 != null ? Arrays.asList(property162222.split(StringUtils.COMMA)) : null;
                e0Var2.f16361y = bVar.b("enabled");
                e0Var2.f16362z = bVar.b("enable-pretty-serialization-output");
                e0Var2.G = bVar.b("send-modules");
                e0Var2.H = bVar.b("send-default-pii");
                String property172222 = bVar.getProperty("ignored-checkins");
                e0Var2.E = property172222 != null ? Arrays.asList(property172222.split(StringUtils.COMMA)) : null;
                String property182222 = bVar.getProperty("ignored-transactions");
                e0Var2.F = property182222 != null ? Arrays.asList(property182222.split(StringUtils.COMMA)) : null;
                e0Var2.I = bVar.b("enable-backpressure-handling");
                e0Var2.J = bVar.b("global-hub-mode");
                e0Var2.L = bVar.b("capture-open-telemetry-events");
                e0Var2.B = bVar.b("logs.enabled");
                e0Var2.C = bVar.b("metrics.enabled");
                while (r5.hasNext()) {
                }
                property7 = bVar.getProperty("cron.default-checkin-margin");
                if (property7 != null) {
                }
                valueOf4 = null;
                property8 = bVar.getProperty("cron.default-max-runtime");
                if (property8 != null) {
                }
                valueOf5 = null;
                String property19222222 = bVar.getProperty("cron.default-timezone");
                property9 = bVar.getProperty("cron.default-failure-issue-threshold");
                if (property9 != null) {
                }
                valueOf6 = null;
                property10 = bVar.getProperty("cron.default-recovery-threshold");
                if (property10 != null) {
                }
                valueOf7 = null;
                if (valueOf4 == null) {
                }
                r5 r5Var22222222 = new r5();
                r5Var22222222.f16988a = valueOf4;
                r5Var22222222.f16989b = valueOf5;
                r5Var22222222.f16990c = property19222222;
                r5Var22222222.f16991d = valueOf6;
                r5Var22222222.f16992e = valueOf7;
                e0Var2.P = r5Var22222222;
                e0Var2.A = bVar.b("enable-spotlight");
                e0Var2.D = bVar.getProperty("spotlight-connection-url");
                property11 = bVar.getProperty("profile-session-sample-rate");
                if (property11 != null) {
                }
                e0Var2.M = d10;
                e0Var2.N = bVar.getProperty("profiling-traces-dir-path");
                property12 = bVar.getProperty("profile-lifecycle");
                if (property12 != null) {
                }
                b6Var.merge(e0Var2);
            }
        }
        String dsn = b6Var.getDsn();
        if (!b6Var.isEnabled() || (dsn != null && dsn.isEmpty())) {
            b();
            return false;
        }
        if (dsn == null) {
            throw new IllegalArgumentException("DSN is required. Use empty string or set enabled to false in SentryOptions to disable SDK.");
        }
        b6Var.retrieveParsedDsn();
        return true;
    }

    public static void j(String str, String str2) {
        d().f(str, str2);
    }
}
