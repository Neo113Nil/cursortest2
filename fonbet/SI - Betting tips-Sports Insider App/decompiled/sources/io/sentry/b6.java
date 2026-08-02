package io.sentry;

import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.impl.ap;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import javax.net.ssl.SSLSocketFactory;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class b6 {
    static final b5 DEFAULT_DIAGNOSTIC_LEVEL = b5.DEBUG;
    private static final String DEFAULT_ENVIRONMENT = "production";

    @NotNull
    public static final String DEFAULT_PROPAGATION_TARGETS = ".*";
    public static final long MAX_EVENT_SIZE_BYTES = 1048576;
    private boolean attachServerName;
    private boolean attachStacktrace;
    private boolean attachThreads;

    @NotNull
    private io.sentry.backpressure.b backpressureMonitor;

    @Nullable
    private m5 beforeBreadcrumb;

    @Nullable
    private n5 beforeEnvelopeCallback;

    @Nullable
    private o5 beforeSend;

    @Nullable
    private o5 beforeSendFeedback;

    @Nullable
    private p5 beforeSendReplay;

    @Nullable
    private q5 beforeSendTransaction;

    @Nullable
    private String cacheDirPath;
    private boolean captureOpenTelemetryEvents;

    @NotNull
    io.sentry.clientreport.g clientReportRecorder;

    @NotNull
    private k compositePerformanceCollector;

    @NotNull
    private p0 connectionStatusProvider;
    private int connectionTimeoutMillis;

    @NotNull
    private final List<String> contextTags;

    @NotNull
    private q0 continuousProfiler;

    @Nullable
    private r5 cron;

    @NotNull
    private final io.sentry.util.f dateProvider;
    private long deadlineTimeout;
    private boolean debug;

    @NotNull
    private io.sentry.internal.debugmeta.a debugMetaLoader;

    @NotNull
    private w3 defaultScopeType;

    @NotNull
    private final List<String> defaultTracePropagationTargets;

    @NotNull
    private b5 diagnosticLevel;

    @Nullable
    private String dist;

    @Nullable
    private String distinctId;

    @NotNull
    private s5 distribution;

    @NotNull
    private r0 distributionController;

    @Nullable
    private String dsn;

    @Nullable
    private String dsnHash;
    private boolean enableAppStartProfiling;
    private boolean enableAutoSessionTracking;
    private boolean enableBackpressureHandling;
    private boolean enableDeduplication;
    private boolean enableEventSizeLimiting;
    private boolean enableExternalConfiguration;
    private boolean enablePrettySerializationOutput;
    private boolean enableScopePersistence;
    private boolean enableScreenTracking;
    private boolean enableShutdownHook;
    private boolean enableSpotlight;
    private boolean enableTimeToFullDisplayTracing;
    private boolean enableUncaughtExceptionHandler;
    private boolean enableUserInteractionBreadcrumbs;
    private boolean enableUserInteractionTracing;
    private boolean enabled;

    @NotNull
    private io.sentry.cache.d envelopeDiskCache;

    @NotNull
    private final io.sentry.util.f envelopeReader;

    @Nullable
    private String environment;

    @NotNull
    private e1 executorService;

    @NotNull
    private final d0 experimental;

    @NotNull
    private ILogger fatalLogger;

    @NotNull
    private w4 feedbackOptions;
    private boolean forceInit;

    @NotNull
    private g0 fullyDisplayedReporter;

    @NotNull
    private final List<io.sentry.android.core.internal.gestures.a> gestureTargetLocators;

    @Nullable
    private Boolean globalHubMode;

    @Nullable
    private Long idleTimeout;

    @Nullable
    private List<f0> ignoredCheckIns;

    @Nullable
    private List<f0> ignoredSpanOrigins;

    @Nullable
    private List<f0> ignoredTransactions;

    @NotNull
    private final List<String> inAppExcludes;

    @NotNull
    private final List<String> inAppIncludes;

    @NotNull
    private o1 initPriority;

    @NotNull
    private p1 instrumenter;

    @Nullable
    private volatile u6 internalTracesSampler;

    @NotNull
    protected final io.sentry.util.a lock;

    @NotNull
    private ILogger logger;

    @NotNull
    private t5 logs;
    private long maxAttachmentSize;
    private int maxBreadcrumbs;
    private int maxCacheItems;
    private int maxDepth;
    private int maxFeatureFlags;
    private int maxQueueSize;

    @NotNull
    private z5 maxRequestBodySize;
    private int maxSpans;
    private long maxTraceFileSize;

    @NotNull
    private u5 metrics;

    @NotNull
    private io.sentry.internal.modules.a modulesLoader;

    @NotNull
    private final List<a1> observers;

    @Nullable
    private v5 onDiscard;

    @Nullable
    private w5 onOversizedEvent;

    @NotNull
    private k5 openTelemetryMode;

    @NotNull
    private final List<u0> optionsObservers;

    @NotNull
    private final List<v0> performanceCollectors;
    private boolean printUncaughtStackTrace;

    @NotNull
    private i3 profileLifecycle;

    @Nullable
    private Double profileSessionSampleRate;

    @NotNull
    private y0 profilerConverter;

    @Nullable
    private Double profilesSampleRate;

    @Nullable
    private x5 profilesSampler;

    @Nullable
    private String profilingTracesDirPath;
    private int profilingTracesHz;

    @Nullable
    private String proguardUuid;
    private boolean propagateTraceparent;

    @Nullable
    private y5 proxy;
    private int readTimeoutMillis;

    @Nullable
    private String release;

    @NotNull
    private m3 replayController;

    @NotNull
    private io.sentry.util.runtime.b runtimeManager;

    @Nullable
    private Double sampleRate;

    @Nullable
    private io.sentry.protocol.t sdkVersion;
    private boolean sendClientReports;
    private boolean sendDefaultPii;
    private boolean sendModules;

    @Nullable
    private String sentryClientName;

    @NotNull
    private final io.sentry.util.f serializer;

    @Nullable
    private String serverName;

    @NotNull
    private f6 sessionReplay;
    private long sessionTrackingIntervalMillis;

    @NotNull
    private h1 socketTagger;

    @NotNull
    private j1 spanFactory;

    @Nullable
    private String spotlightConnectionUrl;

    @Nullable
    private SSLSocketFactory sslSocketFactory;
    private boolean startProfilerOnAppStart;

    @NotNull
    private final Map<String, String> tags;

    @NotNull
    private io.sentry.util.thread.a threadChecker;
    private boolean traceOptionsRequests;

    @Nullable
    private List<String> tracePropagationTargets;
    private boolean traceSampling;

    @Nullable
    private Double tracesSampleRate;

    @Nullable
    private a6 tracesSampler;

    @NotNull
    private l1 transactionProfiler;

    @NotNull
    private m1 transportFactory;

    @NotNull
    private io.sentry.transport.h transportGate;

    @NotNull
    private n1 versionDetector;

    @NotNull
    private final List<Object> viewHierarchyExporters;

    @NotNull
    private final List<c0> eventProcessors = new CopyOnWriteArrayList();

    @NotNull
    private final Set<Class<? extends Throwable>> ignoredExceptionsForType = new CopyOnWriteArraySet();

    @Nullable
    private List<f0> ignoredErrors = null;

    @NotNull
    private final List<q1> integrations = new CopyOnWriteArrayList();

    @NotNull
    private final Set<String> bundleIds = new CopyOnWriteArraySet();

    @NotNull
    private final io.sentry.util.f parsedDsn = new io.sentry.util.f(new l5(this, 0));
    private long shutdownTimeoutMillis = 2000;
    private long flushTimeoutMillis = 15000;
    private long sessionFlushTimeoutMillis = 15000;

    /* JADX WARN: Removed duplicated region for block: B:20:0x02cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b6(boolean z5) {
        j1 x2Var;
        Class A;
        Object newInstance;
        n2 n2Var = n2.f16660a;
        this.logger = n2Var;
        this.fatalLogger = n2Var;
        this.diagnosticLevel = DEFAULT_DIAGNOSTIC_LEVEL;
        this.serializer = new io.sentry.util.f(new l5(this, 1));
        this.envelopeReader = new io.sentry.util.f(new l5(this, 2));
        this.maxDepth = 100;
        this.maxCacheItems = 30;
        this.maxQueueSize = 30;
        this.maxBreadcrumbs = 100;
        this.maxFeatureFlags = 100;
        this.inAppExcludes = new CopyOnWriteArrayList();
        this.inAppIncludes = new CopyOnWriteArrayList();
        this.transportFactory = z2.f17270a;
        this.transportGate = io.sentry.transport.k.f17135a;
        this.attachStacktrace = true;
        this.enableAutoSessionTracking = true;
        this.sessionTrackingIntervalMillis = 30000L;
        this.attachServerName = true;
        this.enableUncaughtExceptionHandler = true;
        this.printUncaughtStackTrace = false;
        this.executorService = k2.f16595c;
        this.connectionTimeoutMillis = 30000;
        this.readTimeoutMillis = 30000;
        this.envelopeDiskCache = io.sentry.transport.i.f17133a;
        this.sendDefaultPii = false;
        this.observers = new CopyOnWriteArrayList();
        this.optionsObservers = new CopyOnWriteArrayList();
        this.tags = new ConcurrentHashMap();
        this.maxAttachmentSize = 20971520L;
        this.enableDeduplication = true;
        this.enableEventSizeLimiting = false;
        this.maxSpans = AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT;
        this.enableShutdownHook = true;
        this.maxRequestBodySize = z5.NONE;
        this.traceSampling = true;
        this.maxTraceFileSize = 5242880L;
        this.transactionProfiler = k2.f16596d;
        this.continuousProfiler = j2.f16538a;
        this.profilerConverter = o2.f16683a;
        this.tracePropagationTargets = null;
        this.defaultTracePropagationTargets = Collections.singletonList(DEFAULT_PROPAGATION_TARGETS);
        this.propagateTraceparent = false;
        this.idleTimeout = 3000L;
        this.contextTags = new CopyOnWriteArrayList();
        this.sendClientReports = true;
        this.clientReportRecorder = new l1.a(this);
        this.modulesLoader = io.sentry.internal.modules.e.f16532a;
        this.debugMetaLoader = io.sentry.internal.debugmeta.b.f16515a;
        this.enableUserInteractionTracing = false;
        this.enableUserInteractionBreadcrumbs = true;
        this.instrumenter = p1.SENTRY;
        this.gestureTargetLocators = new ArrayList();
        this.viewHierarchyExporters = new ArrayList();
        this.threadChecker = io.sentry.util.thread.b.f17187a;
        this.traceOptionsRequests = true;
        this.dateProvider = new io.sentry.util.f(new ap(13));
        this.performanceCollectors = new ArrayList();
        this.compositePerformanceCollector = h2.f16452a;
        this.enableTimeToFullDisplayTracing = false;
        this.fullyDisplayedReporter = g0.f16423b;
        this.connectionStatusProvider = new i2();
        this.enabled = true;
        this.enablePrettySerializationOutput = true;
        this.sendModules = true;
        this.enableSpotlight = false;
        this.enableScopePersistence = true;
        this.ignoredCheckIns = null;
        this.ignoredSpanOrigins = null;
        this.ignoredTransactions = null;
        this.backpressureMonitor = io.sentry.backpressure.c.f16216a;
        this.enableBackpressureHandling = true;
        this.enableAppStartProfiling = false;
        this.spanFactory = x2.f17243b;
        this.profilingTracesHz = 101;
        this.cron = null;
        this.replayController = k2.f16594b;
        this.distributionController = k2.f16593a;
        this.enableScreenTracking = true;
        this.defaultScopeType = w3.ISOLATION;
        this.initPriority = o1.MEDIUM;
        this.forceInit = false;
        this.globalHubMode = null;
        this.lock = new io.sentry.util.a();
        this.openTelemetryMode = k5.AUTO;
        this.captureOpenTelemetryEvents = false;
        this.versionDetector = a3.f15441a;
        this.profileLifecycle = i3.MANUAL;
        this.startProfilerOnAppStart = false;
        this.deadlineTimeout = 30000L;
        t5 t5Var = new t5();
        t5Var.f17101a = false;
        t5Var.f17102b = new io.sentry.logger.e();
        this.logs = t5Var;
        u5 u5Var = new u5();
        u5Var.f17151a = true;
        u5Var.f17152b = new io.sentry.metrics.c();
        this.metrics = u5Var;
        this.socketTagger = v2.f17197a;
        this.runtimeManager = new m3.f(22);
        this.distribution = new s5();
        io.sentry.protocol.t tVar = new io.sentry.protocol.t("sentry.java", "8.30.0");
        tVar.f16911b = "8.30.0";
        this.experimental = new d0();
        f6 f6Var = new f6();
        CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
        f6Var.f16402c = copyOnWriteArraySet;
        CopyOnWriteArraySet copyOnWriteArraySet2 = new CopyOnWriteArraySet();
        f6Var.f16403d = copyOnWriteArraySet2;
        f6Var.f16404e = e6.MEDIUM;
        f6Var.f16405f = 1;
        f6Var.f16406g = 30000L;
        f6Var.f16407h = 5000L;
        f6Var.f16408i = 3600000L;
        f6Var.j = true;
        f6Var.f16410l = false;
        f6Var.f16411m = z3.PIXEL_COPY;
        List list = Collections.EMPTY_LIST;
        f6Var.f16412n = list;
        f6Var.f16413o = list;
        f6Var.f16414p = true;
        List list2 = f6.f16399s;
        f6Var.q = list2;
        f6Var.f16415r = list2;
        if (!z5) {
            copyOnWriteArraySet.add("android.widget.TextView");
            copyOnWriteArraySet2.remove("android.widget.TextView");
            copyOnWriteArraySet.add("android.widget.ImageView");
            copyOnWriteArraySet2.remove("android.widget.ImageView");
            copyOnWriteArraySet.add("android.webkit.WebView");
            copyOnWriteArraySet.add("android.widget.VideoView");
            copyOnWriteArraySet.add("androidx.media3.ui.PlayerView");
            copyOnWriteArraySet.add("com.google.android.exoplayer2.ui.PlayerView");
            copyOnWriteArraySet.add("com.google.android.exoplayer2.ui.StyledPlayerView");
            f6Var.f16409k = tVar;
        }
        this.sessionReplay = f6Var;
        w4 w4Var = new w4();
        w4Var.f17231a = false;
        w4Var.f17232b = true;
        w4Var.f17233c = false;
        w4Var.f17234d = true;
        w4Var.f17235e = true;
        w4Var.f17236f = true;
        this.feedbackOptions = w4Var;
        if (z5) {
            return;
        }
        if (!io.sentry.util.h.f17164a && io.sentry.hints.j.z("io.sentry.opentelemetry.OtelSpanFactory", n2Var) && (A = io.sentry.hints.j.A("io.sentry.opentelemetry.OtelSpanFactory", n2Var)) != null) {
            try {
                newInstance = A.getDeclaredConstructor(null).newInstance(null);
            } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused) {
            }
            if (newInstance != null && (newInstance instanceof j1)) {
                x2Var = (j1) newInstance;
                setSpanFactory(x2Var);
                com.google.firebase.messaging.x xVar = new com.google.firebase.messaging.x(this);
                this.executorService = xVar;
                xVar.f();
                this.integrations.add(new UncaughtExceptionHandlerIntegration());
                this.integrations.add(new ShutdownHookIntegration());
                this.integrations.add(new SpotlightIntegration());
                this.eventProcessors.add(new e2(this));
                this.eventProcessors.add(new m(this));
                if (!io.sentry.util.h.f17164a) {
                    this.eventProcessors.add(new m());
                }
                setSentryClientName("sentry.java/8.30.0");
                setSdkVersion(tVar);
                z4.d().b("maven:io.sentry:sentry", "8.30.0");
            }
        }
        x2Var = new x2(1);
        setSpanFactory(x2Var);
        com.google.firebase.messaging.x xVar2 = new com.google.firebase.messaging.x(this);
        this.executorService = xVar2;
        xVar2.f();
        this.integrations.add(new UncaughtExceptionHandlerIntegration());
        this.integrations.add(new ShutdownHookIntegration());
        this.integrations.add(new SpotlightIntegration());
        this.eventProcessors.add(new e2(this));
        this.eventProcessors.add(new m(this));
        if (!io.sentry.util.h.f17164a) {
        }
        setSentryClientName("sentry.java/8.30.0");
        setSdkVersion(tVar);
        z4.d().b("maven:io.sentry:sentry", "8.30.0");
    }

    public static /* synthetic */ z a(b6 b6Var) {
        return new z(b6Var.dsn);
    }

    public static /* synthetic */ a0 b(b6 b6Var) {
        return new a0((g1) b6Var.serializer.a());
    }

    @NotNull
    public static b6 empty() {
        return new b6(true);
    }

    public void addBundleId(@Nullable String str) {
        if (str != null) {
            String trim = str.trim();
            if (trim.isEmpty()) {
                return;
            }
            this.bundleIds.add(trim);
        }
    }

    public void addContextTag(@NotNull String str) {
        this.contextTags.add(str);
    }

    public void addEventProcessor(@NotNull c0 c0Var) {
        this.eventProcessors.add(c0Var);
    }

    public void addIgnoredCheckIn(String str) {
        if (this.ignoredCheckIns == null) {
            this.ignoredCheckIns = new ArrayList();
        }
        this.ignoredCheckIns.add(new f0(str));
    }

    public void addIgnoredError(@NotNull String str) {
        if (this.ignoredErrors == null) {
            this.ignoredErrors = new ArrayList();
        }
        this.ignoredErrors.add(new f0(str));
    }

    public void addIgnoredExceptionForType(@NotNull Class<? extends Throwable> cls) {
        this.ignoredExceptionsForType.add(cls);
    }

    public void addIgnoredSpanOrigin(String str) {
        if (this.ignoredSpanOrigins == null) {
            this.ignoredSpanOrigins = new ArrayList();
        }
        this.ignoredSpanOrigins.add(new f0(str));
    }

    public void addIgnoredTransaction(String str) {
        if (this.ignoredTransactions == null) {
            this.ignoredTransactions = new ArrayList();
        }
        this.ignoredTransactions.add(new f0(str));
    }

    public void addInAppExclude(@NotNull String str) {
        this.inAppExcludes.add(str);
    }

    public void addInAppInclude(@NotNull String str) {
        this.inAppIncludes.add(str);
    }

    public void addIntegration(@NotNull q1 q1Var) {
        this.integrations.add(q1Var);
    }

    public void addOptionsObserver(@NotNull u0 u0Var) {
        this.optionsObservers.add(u0Var);
    }

    public void addPerformanceCollector(@NotNull v0 v0Var) {
        this.performanceCollectors.add(v0Var);
    }

    public void addScopeObserver(@NotNull a1 a1Var) {
        this.observers.add(a1Var);
    }

    public boolean containsIgnoredExceptionForType(@NotNull Throwable th2) {
        return this.ignoredExceptionsForType.contains(th2.getClass());
    }

    @Nullable
    public io.sentry.cache.g findPersistingScopeObserver() {
        for (a1 a1Var : this.observers) {
            if (a1Var instanceof io.sentry.cache.g) {
                return (io.sentry.cache.g) a1Var;
            }
        }
        return null;
    }

    @NotNull
    public io.sentry.backpressure.b getBackpressureMonitor() {
        return this.backpressureMonitor;
    }

    @Nullable
    public m5 getBeforeBreadcrumb() {
        return this.beforeBreadcrumb;
    }

    @Nullable
    public n5 getBeforeEnvelopeCallback() {
        return this.beforeEnvelopeCallback;
    }

    @Nullable
    public o5 getBeforeSend() {
        return this.beforeSend;
    }

    @Nullable
    public o5 getBeforeSendFeedback() {
        return this.beforeSendFeedback;
    }

    @Nullable
    public p5 getBeforeSendReplay() {
        return null;
    }

    @Nullable
    public q5 getBeforeSendTransaction() {
        return null;
    }

    @NotNull
    public Set<String> getBundleIds() {
        return this.bundleIds;
    }

    @Nullable
    public String getCacheDirPath() {
        String str = this.cacheDirPath;
        if (str == null || str.isEmpty()) {
            return null;
        }
        return this.dsnHash != null ? new File(this.cacheDirPath, this.dsnHash).getAbsolutePath() : this.cacheDirPath;
    }

    @Nullable
    public String getCacheDirPathWithoutDsn() {
        String str = this.cacheDirPath;
        if (str == null || str.isEmpty()) {
            return null;
        }
        return this.cacheDirPath;
    }

    @NotNull
    public io.sentry.clientreport.g getClientReportRecorder() {
        return this.clientReportRecorder;
    }

    @NotNull
    public k getCompositePerformanceCollector() {
        return this.compositePerformanceCollector;
    }

    @NotNull
    public p0 getConnectionStatusProvider() {
        return this.connectionStatusProvider;
    }

    public int getConnectionTimeoutMillis() {
        return this.connectionTimeoutMillis;
    }

    @NotNull
    public List<String> getContextTags() {
        return this.contextTags;
    }

    @NotNull
    public q0 getContinuousProfiler() {
        return this.continuousProfiler;
    }

    @Nullable
    public r5 getCron() {
        return this.cron;
    }

    @NotNull
    public l4 getDateProvider() {
        return (l4) this.dateProvider.a();
    }

    public long getDeadlineTimeout() {
        return this.deadlineTimeout;
    }

    @NotNull
    public io.sentry.internal.debugmeta.a getDebugMetaLoader() {
        return this.debugMetaLoader;
    }

    @NotNull
    public w3 getDefaultScopeType() {
        return this.defaultScopeType;
    }

    @NotNull
    public b5 getDiagnosticLevel() {
        return this.diagnosticLevel;
    }

    @Nullable
    public String getDist() {
        return this.dist;
    }

    @Nullable
    public String getDistinctId() {
        return this.distinctId;
    }

    @NotNull
    public s5 getDistribution() {
        return this.distribution;
    }

    @NotNull
    public r0 getDistributionController() {
        return this.distributionController;
    }

    @Nullable
    public String getDsn() {
        return this.dsn;
    }

    @NotNull
    public io.sentry.cache.d getEnvelopeDiskCache() {
        return this.envelopeDiskCache;
    }

    @NotNull
    public s0 getEnvelopeReader() {
        return (s0) this.envelopeReader.a();
    }

    @Nullable
    public String getEnvironment() {
        String str = this.environment;
        return str != null ? str : DEFAULT_ENVIRONMENT;
    }

    @NotNull
    public List<c0> getEventProcessors() {
        return this.eventProcessors;
    }

    @NotNull
    public e1 getExecutorService() {
        return this.executorService;
    }

    @NotNull
    public d0 getExperimental() {
        return this.experimental;
    }

    @NotNull
    public ILogger getFatalLogger() {
        return this.fatalLogger;
    }

    @NotNull
    public w4 getFeedbackOptions() {
        return this.feedbackOptions;
    }

    public long getFlushTimeoutMillis() {
        return this.flushTimeoutMillis;
    }

    @NotNull
    public g0 getFullyDisplayedReporter() {
        return this.fullyDisplayedReporter;
    }

    public List<io.sentry.android.core.internal.gestures.a> getGestureTargetLocators() {
        return this.gestureTargetLocators;
    }

    @Nullable
    public Long getIdleTimeout() {
        return this.idleTimeout;
    }

    @Nullable
    public List<f0> getIgnoredCheckIns() {
        return this.ignoredCheckIns;
    }

    @Nullable
    public List<f0> getIgnoredErrors() {
        return this.ignoredErrors;
    }

    @NotNull
    public Set<Class<? extends Throwable>> getIgnoredExceptionsForType() {
        return this.ignoredExceptionsForType;
    }

    @Nullable
    public List<f0> getIgnoredSpanOrigins() {
        return this.ignoredSpanOrigins;
    }

    @Nullable
    public List<f0> getIgnoredTransactions() {
        return this.ignoredTransactions;
    }

    @NotNull
    public List<String> getInAppExcludes() {
        return this.inAppExcludes;
    }

    @NotNull
    public List<String> getInAppIncludes() {
        return this.inAppIncludes;
    }

    @NotNull
    public o1 getInitPriority() {
        return this.initPriority;
    }

    @NotNull
    public p1 getInstrumenter() {
        return this.instrumenter;
    }

    @NotNull
    public List<q1> getIntegrations() {
        return this.integrations;
    }

    @NotNull
    public u6 getInternalTracesSampler() {
        if (this.internalTracesSampler == null) {
            r a7 = this.lock.a();
            try {
                if (this.internalTracesSampler == null) {
                    this.internalTracesSampler = new u6(this);
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
        return this.internalTracesSampler;
    }

    @NotNull
    public ILogger getLogger() {
        return this.logger;
    }

    @NotNull
    public t5 getLogs() {
        return this.logs;
    }

    public long getMaxAttachmentSize() {
        return this.maxAttachmentSize;
    }

    public int getMaxBreadcrumbs() {
        return this.maxBreadcrumbs;
    }

    public int getMaxCacheItems() {
        return this.maxCacheItems;
    }

    public int getMaxDepth() {
        return this.maxDepth;
    }

    public int getMaxFeatureFlags() {
        return this.maxFeatureFlags;
    }

    public int getMaxQueueSize() {
        return this.maxQueueSize;
    }

    @NotNull
    public z5 getMaxRequestBodySize() {
        return this.maxRequestBodySize;
    }

    public int getMaxSpans() {
        return this.maxSpans;
    }

    public long getMaxTraceFileSize() {
        return this.maxTraceFileSize;
    }

    @NotNull
    public u5 getMetrics() {
        return this.metrics;
    }

    @NotNull
    public io.sentry.internal.modules.a getModulesLoader() {
        return this.modulesLoader;
    }

    @Nullable
    public v5 getOnDiscard() {
        return null;
    }

    @Nullable
    public w5 getOnOversizedEvent() {
        return null;
    }

    @NotNull
    public k5 getOpenTelemetryMode() {
        return this.openTelemetryMode;
    }

    @NotNull
    public List<u0> getOptionsObservers() {
        return this.optionsObservers;
    }

    @Nullable
    public String getOutboxPath() {
        String cacheDirPath = getCacheDirPath();
        if (cacheDirPath == null) {
            return null;
        }
        return new File(cacheDirPath, "outbox").getAbsolutePath();
    }

    @NotNull
    public List<v0> getPerformanceCollectors() {
        return this.performanceCollectors;
    }

    @NotNull
    public i3 getProfileLifecycle() {
        return this.profileLifecycle;
    }

    @Nullable
    public Double getProfileSessionSampleRate() {
        return this.profileSessionSampleRate;
    }

    @NotNull
    public y0 getProfilerConverter() {
        return this.profilerConverter;
    }

    @Nullable
    public Double getProfilesSampleRate() {
        return this.profilesSampleRate;
    }

    @Nullable
    public x5 getProfilesSampler() {
        return null;
    }

    @Nullable
    public String getProfilingTracesDirPath() {
        String str = this.profilingTracesDirPath;
        if (str != null && !str.isEmpty()) {
            return this.dsnHash != null ? new File(this.profilingTracesDirPath, this.dsnHash).getAbsolutePath() : this.profilingTracesDirPath;
        }
        String cacheDirPath = getCacheDirPath();
        if (cacheDirPath == null) {
            return null;
        }
        return new File(cacheDirPath, "profiling_traces").getAbsolutePath();
    }

    public int getProfilingTracesHz() {
        return this.profilingTracesHz;
    }

    @Nullable
    public String getProguardUuid() {
        return this.proguardUuid;
    }

    @Nullable
    public y5 getProxy() {
        return this.proxy;
    }

    public int getReadTimeoutMillis() {
        return this.readTimeoutMillis;
    }

    @Nullable
    public String getRelease() {
        return this.release;
    }

    @NotNull
    public m3 getReplayController() {
        return this.replayController;
    }

    @NotNull
    public io.sentry.util.runtime.b getRuntimeManager() {
        return this.runtimeManager;
    }

    @Nullable
    public Double getSampleRate() {
        return this.sampleRate;
    }

    @NotNull
    public List<a1> getScopeObservers() {
        return this.observers;
    }

    @Nullable
    public io.sentry.protocol.t getSdkVersion() {
        return this.sdkVersion;
    }

    @Nullable
    public String getSentryClientName() {
        return this.sentryClientName;
    }

    @NotNull
    public g1 getSerializer() {
        return (g1) this.serializer.a();
    }

    @Nullable
    public String getServerName() {
        return this.serverName;
    }

    public long getSessionFlushTimeoutMillis() {
        return this.sessionFlushTimeoutMillis;
    }

    @NotNull
    public f6 getSessionReplay() {
        return this.sessionReplay;
    }

    public long getSessionTrackingIntervalMillis() {
        return this.sessionTrackingIntervalMillis;
    }

    public long getShutdownTimeoutMillis() {
        return this.shutdownTimeoutMillis;
    }

    @NotNull
    public h1 getSocketTagger() {
        return this.socketTagger;
    }

    @NotNull
    public j1 getSpanFactory() {
        return this.spanFactory;
    }

    @Nullable
    public String getSpotlightConnectionUrl() {
        return this.spotlightConnectionUrl;
    }

    @Nullable
    public SSLSocketFactory getSslSocketFactory() {
        return this.sslSocketFactory;
    }

    @NotNull
    public Map<String, String> getTags() {
        return this.tags;
    }

    @NotNull
    public io.sentry.util.thread.a getThreadChecker() {
        return this.threadChecker;
    }

    @NotNull
    public List<String> getTracePropagationTargets() {
        List<String> list = this.tracePropagationTargets;
        return list == null ? this.defaultTracePropagationTargets : list;
    }

    @Nullable
    public Double getTracesSampleRate() {
        return this.tracesSampleRate;
    }

    @Nullable
    public a6 getTracesSampler() {
        return null;
    }

    @NotNull
    public l1 getTransactionProfiler() {
        return this.transactionProfiler;
    }

    @NotNull
    public m1 getTransportFactory() {
        return this.transportFactory;
    }

    @NotNull
    public io.sentry.transport.h getTransportGate() {
        return this.transportGate;
    }

    @NotNull
    public n1 getVersionDetector() {
        return this.versionDetector;
    }

    @NotNull
    public final List<Object> getViewHierarchyExporters() {
        return this.viewHierarchyExporters;
    }

    public boolean isAttachServerName() {
        return this.attachServerName;
    }

    public boolean isAttachStacktrace() {
        return this.attachStacktrace;
    }

    public boolean isAttachThreads() {
        return this.attachThreads;
    }

    public boolean isCaptureOpenTelemetryEvents() {
        return this.captureOpenTelemetryEvents;
    }

    public boolean isContinuousProfilingEnabled() {
        Double d10;
        return this.profilesSampleRate == null && (d10 = this.profileSessionSampleRate) != null && d10.doubleValue() > 0.0d;
    }

    public boolean isDebug() {
        return this.debug;
    }

    public boolean isEnableAppStartProfiling() {
        return (isProfilingEnabled() || isContinuousProfilingEnabled()) && this.enableAppStartProfiling;
    }

    public boolean isEnableAutoSessionTracking() {
        return this.enableAutoSessionTracking;
    }

    public boolean isEnableBackpressureHandling() {
        return this.enableBackpressureHandling;
    }

    public boolean isEnableDeduplication() {
        return this.enableDeduplication;
    }

    public boolean isEnableEventSizeLimiting() {
        return this.enableEventSizeLimiting;
    }

    public boolean isEnableExternalConfiguration() {
        return this.enableExternalConfiguration;
    }

    public boolean isEnablePrettySerializationOutput() {
        return this.enablePrettySerializationOutput;
    }

    public boolean isEnableScopePersistence() {
        return this.enableScopePersistence;
    }

    public boolean isEnableScreenTracking() {
        return this.enableScreenTracking;
    }

    public boolean isEnableShutdownHook() {
        return this.enableShutdownHook;
    }

    public boolean isEnableSpotlight() {
        return this.enableSpotlight;
    }

    public boolean isEnableTimeToFullDisplayTracing() {
        return this.enableTimeToFullDisplayTracing;
    }

    public boolean isEnableUncaughtExceptionHandler() {
        return this.enableUncaughtExceptionHandler;
    }

    public boolean isEnableUserInteractionBreadcrumbs() {
        return this.enableUserInteractionBreadcrumbs;
    }

    public boolean isEnableUserInteractionTracing() {
        return this.enableUserInteractionTracing;
    }

    public boolean isEnabled() {
        return this.enabled;
    }

    public boolean isForceInit() {
        return this.forceInit;
    }

    @Nullable
    public Boolean isGlobalHubMode() {
        return this.globalHubMode;
    }

    public boolean isPrintUncaughtStackTrace() {
        return this.printUncaughtStackTrace;
    }

    public boolean isProfilingEnabled() {
        Double d10 = this.profilesSampleRate;
        return d10 != null && d10.doubleValue() > 0.0d;
    }

    public boolean isPropagateTraceparent() {
        return this.propagateTraceparent;
    }

    public boolean isSendClientReports() {
        return this.sendClientReports;
    }

    public boolean isSendDefaultPii() {
        return this.sendDefaultPii;
    }

    public boolean isSendModules() {
        return this.sendModules;
    }

    public boolean isStartProfilerOnAppStart() {
        return this.startProfilerOnAppStart;
    }

    public boolean isTraceOptionsRequests() {
        return this.traceOptionsRequests;
    }

    public boolean isTraceSampling() {
        return this.traceSampling;
    }

    public boolean isTracingEnabled() {
        if (getTracesSampleRate() != null) {
            return true;
        }
        getTracesSampler();
        return false;
    }

    public void loadLazyFields() {
        getSerializer();
        retrieveParsedDsn();
        getEnvelopeReader();
        getDateProvider();
    }

    public void merge(@NotNull e0 e0Var) {
        String str = e0Var.f16339a;
        if (str != null) {
            setDsn(str);
        }
        String str2 = e0Var.f16340b;
        if (str2 != null) {
            setEnvironment(str2);
        }
        String str3 = e0Var.f16341c;
        if (str3 != null) {
            setRelease(str3);
        }
        String str4 = e0Var.f16342d;
        if (str4 != null) {
            setDist(str4);
        }
        String str5 = e0Var.f16343e;
        if (str5 != null) {
            setServerName(str5);
        }
        y5 y5Var = e0Var.f16350m;
        if (y5Var != null) {
            setProxy(y5Var);
        }
        Boolean bool = e0Var.f16344f;
        if (bool != null) {
            setEnableUncaughtExceptionHandler(bool.booleanValue());
        }
        Boolean bool2 = e0Var.f16358v;
        if (bool2 != null) {
            setPrintUncaughtStackTrace(bool2.booleanValue());
        }
        Double d10 = e0Var.f16347i;
        if (d10 != null) {
            setTracesSampleRate(d10);
        }
        Double d11 = e0Var.j;
        if (d11 != null) {
            setProfilesSampleRate(d11);
        }
        Boolean bool3 = e0Var.f16345g;
        if (bool3 != null) {
            setDebug(bool3.booleanValue());
        }
        Boolean bool4 = e0Var.f16346h;
        if (bool4 != null) {
            setEnableDeduplication(bool4.booleanValue());
        }
        Boolean bool5 = e0Var.f16359w;
        if (bool5 != null) {
            setSendClientReports(bool5.booleanValue());
        }
        Boolean bool6 = e0Var.K;
        if (bool6 != null) {
            setForceInit(bool6.booleanValue());
        }
        for (Map.Entry entry : new HashMap(e0Var.f16349l).entrySet()) {
            this.tags.put((String) entry.getKey(), (String) entry.getValue());
        }
        Iterator it = new ArrayList(e0Var.f16352o).iterator();
        while (it.hasNext()) {
            addInAppInclude((String) it.next());
        }
        Iterator it2 = new ArrayList(e0Var.f16351n).iterator();
        while (it2.hasNext()) {
            addInAppExclude((String) it2.next());
        }
        Iterator it3 = new HashSet(e0Var.f16356t).iterator();
        while (it3.hasNext()) {
            addIgnoredExceptionForType((Class) it3.next());
        }
        if (e0Var.f16353p != null) {
            setTracePropagationTargets(new ArrayList(e0Var.f16353p));
        }
        Iterator it4 = new ArrayList(e0Var.q).iterator();
        while (it4.hasNext()) {
            addContextTag((String) it4.next());
        }
        String str6 = e0Var.f16354r;
        if (str6 != null) {
            setProguardUuid(str6);
        }
        Long l6 = e0Var.f16355s;
        if (l6 != null) {
            setIdleTimeout(l6);
        }
        Iterator it5 = e0Var.f16360x.iterator();
        while (it5.hasNext()) {
            addBundleId((String) it5.next());
        }
        Boolean bool7 = e0Var.f16361y;
        if (bool7 != null) {
            setEnabled(bool7.booleanValue());
        }
        Boolean bool8 = e0Var.f16362z;
        if (bool8 != null) {
            setEnablePrettySerializationOutput(bool8.booleanValue());
        }
        Boolean bool9 = e0Var.G;
        if (bool9 != null) {
            setSendModules(bool9.booleanValue());
        }
        if (e0Var.E != null) {
            setIgnoredCheckIns(new ArrayList(e0Var.E));
        }
        if (e0Var.F != null) {
            setIgnoredTransactions(new ArrayList(e0Var.F));
        }
        if (e0Var.f16357u != null) {
            setIgnoredErrors(new ArrayList(e0Var.f16357u));
        }
        Boolean bool10 = e0Var.I;
        if (bool10 != null) {
            setEnableBackpressureHandling(bool10.booleanValue());
        }
        z5 z5Var = e0Var.f16348k;
        if (z5Var != null) {
            setMaxRequestBodySize(z5Var);
        }
        Boolean bool11 = e0Var.H;
        if (bool11 != null) {
            setSendDefaultPii(bool11.booleanValue());
        }
        Boolean bool12 = e0Var.L;
        if (bool12 != null) {
            setCaptureOpenTelemetryEvents(bool12.booleanValue());
        }
        Boolean bool13 = e0Var.A;
        if (bool13 != null) {
            setEnableSpotlight(bool13.booleanValue());
        }
        String str7 = e0Var.D;
        if (str7 != null) {
            setSpotlightConnectionUrl(str7);
        }
        Boolean bool14 = e0Var.J;
        if (bool14 != null) {
            setGlobalHubMode(bool14);
        }
        if (e0Var.P != null) {
            if (getCron() == null) {
                setCron(e0Var.P);
            } else {
                if (e0Var.P.f16988a != null) {
                    getCron().f16988a = e0Var.P.f16988a;
                }
                if (e0Var.P.f16989b != null) {
                    getCron().f16989b = e0Var.P.f16989b;
                }
                if (e0Var.P.f16990c != null) {
                    getCron().f16990c = e0Var.P.f16990c;
                }
                if (e0Var.P.f16991d != null) {
                    getCron().f16991d = e0Var.P.f16991d;
                }
                if (e0Var.P.f16992e != null) {
                    getCron().f16992e = e0Var.P.f16992e;
                }
            }
        }
        if (e0Var.B != null) {
            getLogs().f17101a = e0Var.B.booleanValue();
        }
        if (e0Var.C != null) {
            getMetrics().f17151a = e0Var.C.booleanValue();
        }
        Double d12 = e0Var.M;
        if (d12 != null) {
            setProfileSessionSampleRate(d12);
        }
        String str8 = e0Var.N;
        if (str8 != null) {
            setProfilingTracesDirPath(str8);
        }
        i3 i3Var = e0Var.O;
        if (i3Var != null) {
            setProfileLifecycle(i3Var);
        }
    }

    @NotNull
    public z retrieveParsedDsn() throws IllegalArgumentException {
        return (z) this.parsedDsn.a();
    }

    public void setAttachServerName(boolean z5) {
        this.attachServerName = z5;
    }

    public void setAttachStacktrace(boolean z5) {
        this.attachStacktrace = z5;
    }

    public void setAttachThreads(boolean z5) {
        this.attachThreads = z5;
    }

    public void setBackpressureMonitor(@NotNull io.sentry.backpressure.b bVar) {
        this.backpressureMonitor = bVar;
    }

    public void setBeforeBreadcrumb(@Nullable m5 m5Var) {
        this.beforeBreadcrumb = m5Var;
    }

    public void setBeforeEnvelopeCallback(@Nullable n5 n5Var) {
        this.beforeEnvelopeCallback = n5Var;
    }

    public void setBeforeSend(@Nullable o5 o5Var) {
        this.beforeSend = o5Var;
    }

    public void setBeforeSendFeedback(@Nullable o5 o5Var) {
        this.beforeSendFeedback = o5Var;
    }

    public void setCacheDirPath(@Nullable String str) {
        this.cacheDirPath = str;
    }

    public void setCaptureOpenTelemetryEvents(boolean z5) {
        this.captureOpenTelemetryEvents = z5;
    }

    public void setCompositePerformanceCollector(@NotNull k kVar) {
        this.compositePerformanceCollector = kVar;
    }

    public void setConnectionStatusProvider(@NotNull p0 p0Var) {
        this.connectionStatusProvider = p0Var;
    }

    public void setConnectionTimeoutMillis(int i5) {
        this.connectionTimeoutMillis = i5;
    }

    public void setContinuousProfiler(@Nullable q0 q0Var) {
        if (this.continuousProfiler != j2.f16538a || q0Var == null) {
            return;
        }
        this.continuousProfiler = q0Var;
    }

    public void setCron(@Nullable r5 r5Var) {
        this.cron = r5Var;
    }

    public void setDateProvider(@NotNull l4 l4Var) {
        this.dateProvider.b(l4Var);
    }

    public void setDeadlineTimeout(long j) {
        this.deadlineTimeout = j;
    }

    public void setDebug(boolean z5) {
        this.debug = z5;
    }

    public void setDebugMetaLoader(@Nullable io.sentry.internal.debugmeta.a aVar) {
        if (aVar == null) {
            aVar = io.sentry.internal.debugmeta.b.f16515a;
        }
        this.debugMetaLoader = aVar;
    }

    public void setDefaultScopeType(@NotNull w3 w3Var) {
        this.defaultScopeType = w3Var;
    }

    public void setDiagnosticLevel(@Nullable b5 b5Var) {
        if (b5Var == null) {
            b5Var = DEFAULT_DIAGNOSTIC_LEVEL;
        }
        this.diagnosticLevel = b5Var;
    }

    public void setDist(@Nullable String str) {
        this.dist = str;
    }

    public void setDistinctId(@Nullable String str) {
        this.distinctId = str;
    }

    public void setDistribution(@NotNull s5 s5Var) {
        if (s5Var == null) {
            s5Var = new s5();
        }
        this.distribution = s5Var;
    }

    public void setDistributionController(@Nullable r0 r0Var) {
        if (r0Var == null) {
            r0Var = k2.f16593a;
        }
        this.distributionController = r0Var;
    }

    public void setDsn(@Nullable String str) {
        this.dsn = str;
        io.sentry.util.f fVar = this.parsedDsn;
        r a7 = fVar.f17161c.a();
        String str2 = null;
        try {
            fVar.f17159a = null;
            a7.close();
            String str3 = this.dsn;
            ILogger iLogger = this.logger;
            Charset charset = io.sentry.util.l.f17171a;
            if (str3 != null && !str3.isEmpty()) {
                try {
                    str2 = new StringBuilder(new BigInteger(1, MessageDigest.getInstance("SHA-1").digest(str3.getBytes(io.sentry.util.l.f17171a))).toString(16)).toString();
                } catch (NoSuchAlgorithmException e7) {
                    iLogger.e(b5.INFO, "SHA-1 isn't available to calculate the hash.", e7);
                } catch (Throwable th2) {
                    iLogger.h(b5.INFO, "string: %s could not calculate its hash", th2, str3);
                }
            }
            this.dsnHash = str2;
        } catch (Throwable th3) {
            try {
                a7.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public void setEnableAppStartProfiling(boolean z5) {
        this.enableAppStartProfiling = z5;
    }

    public void setEnableAutoSessionTracking(boolean z5) {
        this.enableAutoSessionTracking = z5;
    }

    public void setEnableBackpressureHandling(boolean z5) {
        this.enableBackpressureHandling = z5;
    }

    public void setEnableDeduplication(boolean z5) {
        this.enableDeduplication = z5;
    }

    public void setEnableEventSizeLimiting(boolean z5) {
        this.enableEventSizeLimiting = z5;
    }

    public void setEnableExternalConfiguration(boolean z5) {
        this.enableExternalConfiguration = z5;
    }

    public void setEnablePrettySerializationOutput(boolean z5) {
        this.enablePrettySerializationOutput = z5;
    }

    public void setEnableScopePersistence(boolean z5) {
        this.enableScopePersistence = z5;
    }

    public void setEnableScreenTracking(boolean z5) {
        this.enableScreenTracking = z5;
    }

    public void setEnableShutdownHook(boolean z5) {
        this.enableShutdownHook = z5;
    }

    public void setEnableSpotlight(boolean z5) {
        this.enableSpotlight = z5;
    }

    public void setEnableTimeToFullDisplayTracing(boolean z5) {
        this.enableTimeToFullDisplayTracing = z5;
    }

    public void setEnableUncaughtExceptionHandler(boolean z5) {
        this.enableUncaughtExceptionHandler = z5;
    }

    public void setEnableUserInteractionBreadcrumbs(boolean z5) {
        this.enableUserInteractionBreadcrumbs = z5;
    }

    public void setEnableUserInteractionTracing(boolean z5) {
        this.enableUserInteractionTracing = z5;
    }

    public void setEnabled(boolean z5) {
        this.enabled = z5;
    }

    public void setEnvelopeDiskCache(@Nullable io.sentry.cache.d dVar) {
        if (dVar == null) {
            dVar = io.sentry.transport.i.f17133a;
        }
        this.envelopeDiskCache = dVar;
    }

    public void setEnvelopeReader(@Nullable s0 s0Var) {
        io.sentry.util.f fVar = this.envelopeReader;
        if (s0Var == null) {
            s0Var = l2.f16607a;
        }
        fVar.b(s0Var);
    }

    public void setEnvironment(@Nullable String str) {
        this.environment = str;
    }

    public void setExecutorService(@NotNull e1 e1Var) {
        if (e1Var != null) {
            this.executorService = e1Var;
        }
    }

    public void setFatalLogger(@Nullable ILogger iLogger) {
        if (iLogger == null) {
            iLogger = n2.f16660a;
        }
        this.fatalLogger = iLogger;
    }

    public void setFeedbackOptions(@NotNull w4 w4Var) {
        this.feedbackOptions = w4Var;
    }

    public void setFlushTimeoutMillis(long j) {
        this.flushTimeoutMillis = j;
    }

    public void setForceInit(boolean z5) {
        this.forceInit = z5;
    }

    public void setFullyDisplayedReporter(@NotNull g0 g0Var) {
        this.fullyDisplayedReporter = g0Var;
    }

    public void setGestureTargetLocators(@NotNull List<io.sentry.android.core.internal.gestures.a> list) {
        this.gestureTargetLocators.clear();
        this.gestureTargetLocators.addAll(list);
    }

    public void setGlobalHubMode(@Nullable Boolean bool) {
        this.globalHubMode = bool;
    }

    public void setIdleTimeout(@Nullable Long l6) {
        this.idleTimeout = l6;
    }

    public void setIgnoredCheckIns(@Nullable List<String> list) {
        if (list == null) {
            this.ignoredCheckIns = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (!str.isEmpty()) {
                arrayList.add(new f0(str));
            }
        }
        this.ignoredCheckIns = arrayList;
    }

    public void setIgnoredErrors(@Nullable List<String> list) {
        if (list == null) {
            this.ignoredErrors = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (str != null && !str.isEmpty()) {
                arrayList.add(new f0(str));
            }
        }
        this.ignoredErrors = arrayList;
    }

    public void setIgnoredSpanOrigins(@Nullable List<String> list) {
        if (list == null) {
            this.ignoredSpanOrigins = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (str != null && !str.isEmpty()) {
                arrayList.add(new f0(str));
            }
        }
        this.ignoredSpanOrigins = arrayList;
    }

    public void setIgnoredTransactions(@Nullable List<String> list) {
        if (list == null) {
            this.ignoredTransactions = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (str != null && !str.isEmpty()) {
                arrayList.add(new f0(str));
            }
        }
        this.ignoredTransactions = arrayList;
    }

    public void setInitPriority(@NotNull o1 o1Var) {
        this.initPriority = o1Var;
    }

    @Deprecated
    public void setInstrumenter(@NotNull p1 p1Var) {
        this.instrumenter = p1Var;
    }

    public void setLogger(@Nullable ILogger iLogger) {
        this.logger = iLogger == null ? n2.f16660a : new d7.e(9, this, iLogger);
    }

    public void setLogs(@NotNull t5 t5Var) {
        this.logs = t5Var;
    }

    public void setMaxAttachmentSize(long j) {
        this.maxAttachmentSize = j;
    }

    public void setMaxBreadcrumbs(int i5) {
        this.maxBreadcrumbs = i5;
    }

    public void setMaxCacheItems(int i5) {
        this.maxCacheItems = i5;
    }

    public void setMaxDepth(int i5) {
        this.maxDepth = i5;
    }

    public void setMaxFeatureFlags(int i5) {
        this.maxFeatureFlags = i5;
    }

    public void setMaxQueueSize(int i5) {
        if (i5 > 0) {
            this.maxQueueSize = i5;
        }
    }

    public void setMaxRequestBodySize(@NotNull z5 z5Var) {
        this.maxRequestBodySize = z5Var;
    }

    public void setMaxSpans(int i5) {
        this.maxSpans = i5;
    }

    public void setMaxTraceFileSize(long j) {
        this.maxTraceFileSize = j;
    }

    public void setMetrics(@NotNull u5 u5Var) {
        this.metrics = u5Var;
    }

    public void setModulesLoader(@Nullable io.sentry.internal.modules.a aVar) {
        if (aVar == null) {
            aVar = io.sentry.internal.modules.e.f16532a;
        }
        this.modulesLoader = aVar;
    }

    public void setOpenTelemetryMode(@NotNull k5 k5Var) {
        this.openTelemetryMode = k5Var;
    }

    public void setPrintUncaughtStackTrace(boolean z5) {
        this.printUncaughtStackTrace = z5;
    }

    public void setProfileLifecycle(@NotNull i3 i3Var) {
        this.profileLifecycle = i3Var;
        if (i3Var != i3.TRACE || isTracingEnabled()) {
            return;
        }
        this.logger.h(b5.WARNING, "Profiling lifecycle is set to TRACE but tracing is disabled. Profiling will not be started automatically.", new Object[0]);
    }

    public void setProfileSessionSampleRate(@Nullable Double d10) {
        if (ci.c.I(d10, true)) {
            this.profileSessionSampleRate = d10;
            return;
        }
        throw new IllegalArgumentException("The value " + d10 + " is not valid. Use values between 0.0 and 1.0.");
    }

    public void setProfilerConverter(@NotNull y0 y0Var) {
        this.profilerConverter = y0Var;
    }

    public void setProfilesSampleRate(@Nullable Double d10) {
        if (ci.c.I(d10, true)) {
            this.profilesSampleRate = d10;
            return;
        }
        throw new IllegalArgumentException("The value " + d10 + " is not valid. Use null to disable or values between 0.0 and 1.0.");
    }

    public void setProfilingTracesDirPath(@Nullable String str) {
        this.profilingTracesDirPath = str;
    }

    public void setProfilingTracesHz(int i5) {
        this.profilingTracesHz = i5;
    }

    public void setProguardUuid(@Nullable String str) {
        this.proguardUuid = str;
    }

    public void setPropagateTraceparent(boolean z5) {
        this.propagateTraceparent = z5;
    }

    public void setProxy(@Nullable y5 y5Var) {
        this.proxy = y5Var;
    }

    public void setReadTimeoutMillis(int i5) {
        this.readTimeoutMillis = i5;
    }

    public void setRelease(@Nullable String str) {
        this.release = str;
    }

    public void setReplayController(@Nullable m3 m3Var) {
        if (m3Var == null) {
            m3Var = k2.f16594b;
        }
        this.replayController = m3Var;
    }

    public void setRuntimeManager(@NotNull io.sentry.util.runtime.b bVar) {
        this.runtimeManager = bVar;
    }

    public void setSampleRate(@Nullable Double d10) {
        if (ci.c.I(d10, true)) {
            this.sampleRate = d10;
            return;
        }
        throw new IllegalArgumentException("The value " + d10 + " is not valid. Use null to disable or values >= 0.0 and <= 1.0.");
    }

    public void setSdkVersion(@Nullable io.sentry.protocol.t tVar) {
        io.sentry.protocol.t tVar2 = getSessionReplay().f16409k;
        io.sentry.protocol.t tVar3 = this.sdkVersion;
        if (tVar3 != null && tVar2 != null && tVar3.equals(tVar2)) {
            getSessionReplay().f16409k = tVar;
        }
        this.sdkVersion = tVar;
    }

    public void setSendClientReports(boolean z5) {
        this.sendClientReports = z5;
        if (z5) {
            this.clientReportRecorder = new l1.a(this);
        } else {
            this.clientReportRecorder = new io.sentry.hints.j(21);
        }
    }

    public void setSendDefaultPii(boolean z5) {
        this.sendDefaultPii = z5;
    }

    public void setSendModules(boolean z5) {
        this.sendModules = z5;
    }

    public void setSentryClientName(@Nullable String str) {
        this.sentryClientName = str;
    }

    public void setSerializer(@Nullable g1 g1Var) {
        io.sentry.util.f fVar = this.serializer;
        if (g1Var == null) {
            g1Var = u2.f17149a;
        }
        fVar.b(g1Var);
    }

    public void setServerName(@Nullable String str) {
        this.serverName = str;
    }

    public void setSessionFlushTimeoutMillis(long j) {
        this.sessionFlushTimeoutMillis = j;
    }

    public void setSessionReplay(@NotNull f6 f6Var) {
        this.sessionReplay = f6Var;
    }

    public void setSessionTrackingIntervalMillis(long j) {
        this.sessionTrackingIntervalMillis = j;
    }

    public void setShutdownTimeoutMillis(long j) {
        this.shutdownTimeoutMillis = j;
    }

    public void setSocketTagger(@Nullable h1 h1Var) {
        if (h1Var == null) {
            h1Var = v2.f17197a;
        }
        this.socketTagger = h1Var;
    }

    public void setSpanFactory(@NotNull j1 j1Var) {
        this.spanFactory = j1Var;
    }

    public void setSpotlightConnectionUrl(@Nullable String str) {
        this.spotlightConnectionUrl = str;
    }

    public void setSslSocketFactory(@Nullable SSLSocketFactory sSLSocketFactory) {
        this.sslSocketFactory = sSLSocketFactory;
    }

    public void setStartProfilerOnAppStart(boolean z5) {
        this.startProfilerOnAppStart = z5;
    }

    public void setTag(@Nullable String str, @Nullable String str2) {
        if (str == null) {
            return;
        }
        if (str2 == null) {
            this.tags.remove(str);
        } else {
            this.tags.put(str, str2);
        }
    }

    public void setThreadChecker(@NotNull io.sentry.util.thread.a aVar) {
        this.threadChecker = aVar;
    }

    public void setTraceOptionsRequests(boolean z5) {
        this.traceOptionsRequests = z5;
    }

    public void setTracePropagationTargets(@Nullable List<String> list) {
        if (list == null) {
            this.tracePropagationTargets = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (!str.isEmpty()) {
                arrayList.add(str);
            }
        }
        this.tracePropagationTargets = arrayList;
    }

    @Deprecated
    public void setTraceSampling(boolean z5) {
        this.traceSampling = z5;
    }

    public void setTracesSampleRate(@Nullable Double d10) {
        if (ci.c.I(d10, true)) {
            this.tracesSampleRate = d10;
            return;
        }
        throw new IllegalArgumentException("The value " + d10 + " is not valid. Use null to disable or values between 0.0 and 1.0.");
    }

    public void setTransactionProfiler(@Nullable l1 l1Var) {
        if (this.transactionProfiler != k2.f16596d || l1Var == null) {
            return;
        }
        this.transactionProfiler = l1Var;
    }

    public void setTransportFactory(@Nullable m1 m1Var) {
        if (m1Var == null) {
            m1Var = z2.f17270a;
        }
        this.transportFactory = m1Var;
    }

    public void setTransportGate(@Nullable io.sentry.transport.h hVar) {
        if (hVar == null) {
            hVar = io.sentry.transport.k.f17135a;
        }
        this.transportGate = hVar;
    }

    public void setVersionDetector(@NotNull n1 n1Var) {
        this.versionDetector = n1Var;
    }

    public void setViewHierarchyExporters(@NotNull List<Object> list) {
        this.viewHierarchyExporters.clear();
        this.viewHierarchyExporters.addAll(list);
    }

    public void setBeforeSendReplay(@Nullable p5 p5Var) {
    }

    public void setBeforeSendTransaction(@Nullable q5 q5Var) {
    }

    public void setOnDiscard(@Nullable v5 v5Var) {
    }

    public void setOnOversizedEvent(@Nullable w5 w5Var) {
    }

    public void setProfilesSampler(@Nullable x5 x5Var) {
    }

    public void setTracesSampler(@Nullable a6 a6Var) {
    }
}
