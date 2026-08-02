package io.sentry;

import io.sentry.C4748f3;
import io.sentry.util.C4843a;
import io.sentry.util.p;
import java.io.File;
import java.net.Proxy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.net.ssl.SSLSocketFactory;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.TestOnly;

/* loaded from: classes3.dex */
public class F3 {
    static final EnumC4788n3 DEFAULT_DIAGNOSTIC_LEVEL = EnumC4788n3.DEBUG;
    private static final String DEFAULT_ENVIRONMENT = "production";

    @ApiStatus.Internal
    @NotNull
    public static final String DEFAULT_PROPAGATION_TARGETS = ".*";
    public static final long MAX_EVENT_SIZE_BYTES = 1048576;

    @NotNull
    private O appStartExtender;
    private boolean attachServerName;
    private boolean attachStacktrace;
    private boolean attachThreads;

    @ApiStatus.Experimental
    @NotNull
    private io.sentry.backpressure.b backpressureMonitor;

    @Nullable
    private a beforeBreadcrumb;

    @Nullable
    private b beforeEnvelopeCallback;

    @Nullable
    private c beforeSend;

    @Nullable
    private c beforeSendFeedback;

    @Nullable
    private d beforeSendReplay;

    @Nullable
    private e beforeSendTransaction;

    @NotNull
    private final Set<String> bundleIds;

    @Nullable
    private String cacheDirPath;

    @ApiStatus.Experimental
    private boolean captureOpenTelemetryEvents;

    @NotNull
    io.sentry.clientreport.h clientReportRecorder;

    @NotNull
    private InterfaceC4764j compositePerformanceCollector;

    @NotNull
    private P connectionStatusProvider;
    private int connectionTimeoutMillis;

    @NotNull
    private final List<String> contextTags;

    @NotNull
    private Q continuousProfiler;

    @ApiStatus.Experimental
    @Nullable
    private f cron;

    @ApiStatus.Internal
    @NotNull
    private final io.sentry.util.p dateProvider;
    private long deadlineTimeout;
    private boolean debug;

    @NotNull
    private io.sentry.internal.debugmeta.a debugMetaLoader;

    @NotNull
    private P1 defaultScopeType;

    @NotNull
    private final List<String> defaultTracePropagationTargets;

    @NotNull
    private EnumC4788n3 diagnosticLevel;

    @Nullable
    private String dist;

    @Nullable
    private String distinctId;

    @NotNull
    private g distribution;

    @NotNull
    private S distributionController;

    @Nullable
    private String dsn;

    @Nullable
    private String dsnHash;
    private boolean enableAppStartProfiling;
    private boolean enableAutoSessionTracking;
    private boolean enableBackpressureHandling;
    private boolean enableCacheTracing;
    private boolean enableDatabaseTransactionTracing;
    private boolean enableDeduplication;
    private boolean enableEventSizeLimiting;
    private boolean enableExternalConfiguration;
    private boolean enablePrettySerializationOutput;
    private boolean enableQueueTracing;
    private boolean enableScopePersistence;

    @ApiStatus.Experimental
    private boolean enableScreenTracking;
    private boolean enableShutdownHook;
    private boolean enableSpotlight;
    private boolean enableTimeToFullDisplayTracing;
    private boolean enableUncaughtExceptionHandler;
    private boolean enableUserInteractionBreadcrumbs;
    private boolean enableUserInteractionTracing;
    private boolean enabled;

    @NotNull
    private io.sentry.cache.g envelopeDiskCache;

    @NotNull
    private final io.sentry.util.p envelopeReader;

    @Nullable
    private String environment;

    @NotNull
    private final List<D> eventProcessors;

    @NotNull
    private InterfaceC4760i0 executorService;

    @NotNull
    private final E experimental;

    @ApiStatus.Experimental
    @NotNull
    private ILogger fatalLogger;

    @NotNull
    private C4748f3 feedbackOptions;
    private long flushTimeoutMillis;
    private boolean forceInit;

    @NotNull
    private I fullyDisplayedReporter;

    @NotNull
    private final List<io.sentry.internal.gestures.a> gestureTargetLocators;

    @Nullable
    private Boolean globalHubMode;

    @Nullable
    private Long idleTimeout;

    @ApiStatus.Experimental
    @Nullable
    private List<H> ignoredCheckIns;

    @Nullable
    private List<H> ignoredErrors;

    @NotNull
    private final Set<Class<? extends Throwable>> ignoredExceptionsForType;

    @ApiStatus.Experimental
    @Nullable
    private List<H> ignoredSpanOrigins;

    @Nullable
    private List<H> ignoredTransactions;

    @NotNull
    private final List<String> inAppExcludes;

    @NotNull
    private final List<String> inAppIncludes;

    @NotNull
    private EnumC4827s0 initPriority;

    @NotNull
    private EnumC4832t0 instrumenter;

    @NotNull
    private final List<InterfaceC4839u0> integrations;

    @Nullable
    private volatile k4 internalTracesSampler;

    @NotNull
    protected final C4843a lock;

    @NotNull
    private ILogger logger;

    @NotNull
    private h logs;
    private long maxAttachmentSize;
    private int maxBreadcrumbs;
    private int maxCacheItems;
    private int maxDepth;
    private int maxFeatureFlags;
    private int maxQueueSize;

    @NotNull
    private n maxRequestBodySize;
    private int maxSpans;
    private long maxTraceFileSize;

    @NotNull
    private i metrics;

    @NotNull
    private io.sentry.internal.modules.b modulesLoader;

    @NotNull
    private final List<InterfaceC4735d0> observers;

    @Nullable
    private j onDiscard;

    @Nullable
    private k onOversizedEvent;

    @NotNull
    private EnumC4877z3 openTelemetryMode;

    @NotNull
    private final List<X> optionsObservers;

    @Nullable
    private String orgId;

    @NotNull
    private final io.sentry.util.p parsedDsn;

    @NotNull
    private final List<Y> performanceCollectors;
    private boolean printUncaughtStackTrace;

    @NotNull
    private A1 profileLifecycle;

    @Nullable
    private Double profileSessionSampleRate;

    @NotNull
    private InterfaceC4725b0 profilerConverter;

    @Nullable
    private Double profilesSampleRate;

    @Nullable
    private l profilesSampler;

    @Nullable
    private String profilingTracesDirPath;
    private int profilingTracesHz;

    @Nullable
    private String proguardUuid;
    private boolean propagateTraceparent;

    @Nullable
    private m proxy;
    private int readTimeoutMillis;

    @Nullable
    private String release;

    @NotNull
    private G1 replayController;

    @Nullable
    private Double sampleRate;

    @Nullable
    private InterfaceC4750g0 scopesStorageFactory;

    @Nullable
    private io.sentry.protocol.s sdkVersion;
    private boolean sendClientReports;
    private boolean sendDefaultPii;
    private boolean sendModules;

    @Nullable
    private String sentryClientName;

    @NotNull
    private final io.sentry.util.p serializer;

    @Nullable
    private String serverName;
    private long sessionFlushTimeoutMillis;

    @NotNull
    private H3 sessionReplay;
    private long sessionTrackingIntervalMillis;
    private long shutdownTimeoutMillis;

    @NotNull
    private InterfaceC4775l0 socketTagger;

    @NotNull
    private InterfaceC4785n0 spanFactory;

    @Nullable
    private String spotlightConnectionUrl;

    @NotNull
    private final AtomicBoolean spotlightIntegrationLoaded;

    @Nullable
    private SSLSocketFactory sslSocketFactory;
    private boolean startProfilerOnAppStart;
    private boolean strictTraceContinuation;

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
    private o tracesSampler;

    @NotNull
    private InterfaceC4795p0 transactionProfiler;

    @NotNull
    private InterfaceC4808q0 transportFactory;

    @NotNull
    private io.sentry.transport.q transportGate;

    @NotNull
    private InterfaceC4812r0 versionDetector;

    @NotNull
    private final List<Object> viewHierarchyExporters;

    public interface a {
        C4744f a(C4744f c4744f, J j10);
    }

    public interface b {
    }

    public interface c {
        C4733c3 a(C4733c3 c4733c3, J j10);
    }

    public interface d {
    }

    public interface e {
    }

    public static final class f {

        /* renamed from: a, reason: collision with root package name */
        public Long f50319a;

        /* renamed from: b, reason: collision with root package name */
        public Long f50320b;

        /* renamed from: c, reason: collision with root package name */
        public String f50321c;

        /* renamed from: d, reason: collision with root package name */
        public Long f50322d;

        /* renamed from: e, reason: collision with root package name */
        public Long f50323e;

        public Long a() {
            return this.f50319a;
        }

        public Long b() {
            return this.f50322d;
        }

        public Long c() {
            return this.f50320b;
        }

        public Long d() {
            return this.f50323e;
        }

        public String e() {
            return this.f50321c;
        }

        public void f(Long l10) {
            this.f50319a = l10;
        }

        public void g(Long l10) {
            this.f50322d = l10;
        }

        public void h(Long l10) {
            this.f50320b = l10;
        }

        public void i(Long l10) {
            this.f50323e = l10;
        }

        public void j(String str) {
            this.f50321c = str;
        }
    }

    public static final class g {

        /* renamed from: a, reason: collision with root package name */
        public String f50324a = "";

        /* renamed from: b, reason: collision with root package name */
        public String f50325b = "";

        /* renamed from: c, reason: collision with root package name */
        public String f50326c = "";

        /* renamed from: d, reason: collision with root package name */
        public String f50327d = "https://sentry.io";

        /* renamed from: e, reason: collision with root package name */
        public String f50328e = null;

        /* renamed from: f, reason: collision with root package name */
        public List f50329f = null;
    }

    public static final class h {

        /* renamed from: a, reason: collision with root package name */
        public boolean f50330a = false;

        /* renamed from: b, reason: collision with root package name */
        public io.sentry.logger.d f50331b = new io.sentry.logger.a();

        public io.sentry.logger.d a() {
            return this.f50331b;
        }

        public boolean b() {
            return this.f50330a;
        }

        public void c(boolean z10) {
            this.f50330a = z10;
        }

        public void d(io.sentry.logger.d dVar) {
            this.f50331b = dVar;
        }
    }

    public static final class i {

        /* renamed from: a, reason: collision with root package name */
        public boolean f50332a = true;

        /* renamed from: b, reason: collision with root package name */
        public io.sentry.metrics.d f50333b = new io.sentry.metrics.a();

        public io.sentry.metrics.d a() {
            return this.f50333b;
        }

        public boolean b() {
            return this.f50332a;
        }

        public void c(boolean z10) {
            this.f50332a = z10;
        }

        public void d(io.sentry.metrics.d dVar) {
            this.f50333b = dVar;
        }
    }

    public interface j {
    }

    public interface k {
    }

    public interface l {
    }

    public static final class m {

        /* renamed from: a, reason: collision with root package name */
        public String f50334a;

        /* renamed from: b, reason: collision with root package name */
        public String f50335b;

        /* renamed from: c, reason: collision with root package name */
        public String f50336c;

        /* renamed from: d, reason: collision with root package name */
        public String f50337d;

        /* renamed from: e, reason: collision with root package name */
        public Proxy.Type f50338e;

        public m(String str, String str2, String str3, String str4) {
            this(str, str2, null, str3, str4);
        }

        public String a() {
            return this.f50334a;
        }

        public String b() {
            return this.f50337d;
        }

        public String c() {
            return this.f50335b;
        }

        public Proxy.Type d() {
            return this.f50338e;
        }

        public String e() {
            return this.f50336c;
        }

        public m(String str, String str2, Proxy.Type type, String str3, String str4) {
            this.f50334a = str;
            this.f50335b = str2;
            this.f50338e = type;
            this.f50336c = str3;
            this.f50337d = str4;
        }
    }

    public enum n {
        NONE,
        SMALL,
        MEDIUM,
        ALWAYS
    }

    public interface o {
    }

    public F3() {
        this(false);
    }

    public static /* synthetic */ InterfaceC4861w2 a() {
        return new C4797p2();
    }

    public static /* synthetic */ C4858w b(F3 f32) {
        f32.getClass();
        return new C4858w(f32.dsn);
    }

    public static /* synthetic */ T c(F3 f32) {
        f32.getClass();
        return new C4868y((InterfaceC4770k0) f32.serializer.a());
    }

    public static /* synthetic */ InterfaceC4770k0 d(F3 f32) {
        f32.getClass();
        return new H0(f32);
    }

    @ApiStatus.Internal
    @NotNull
    public static F3 empty() {
        return new F3(true);
    }

    @ApiStatus.Internal
    public void activate() {
        if (this.executorService instanceof C4756h1) {
            this.executorService = new C4743e3(this);
        }
        if (this.spotlightIntegrationLoaded.compareAndSet(false, true)) {
            try {
                this.integrations.add((InterfaceC4839u0) Class.forName("io.sentry.spotlight.SpotlightIntegration").getConstructor(null).newInstance(null));
            } catch (Throwable unused) {
            }
        }
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

    public void addEventProcessor(@NotNull D d10) {
        this.eventProcessors.add(d10);
    }

    @ApiStatus.Experimental
    public void addIgnoredCheckIn(String str) {
        if (this.ignoredCheckIns == null) {
            this.ignoredCheckIns = new ArrayList();
        }
        this.ignoredCheckIns.add(new H(str));
    }

    public void addIgnoredError(@NotNull String str) {
        if (this.ignoredErrors == null) {
            this.ignoredErrors = new ArrayList();
        }
        this.ignoredErrors.add(new H(str));
    }

    public void addIgnoredExceptionForType(@NotNull Class<? extends Throwable> cls) {
        this.ignoredExceptionsForType.add(cls);
    }

    @ApiStatus.Experimental
    public void addIgnoredSpanOrigin(String str) {
        if (this.ignoredSpanOrigins == null) {
            this.ignoredSpanOrigins = new ArrayList();
        }
        this.ignoredSpanOrigins.add(new H(str));
    }

    @ApiStatus.Experimental
    public void addIgnoredTransaction(String str) {
        if (this.ignoredTransactions == null) {
            this.ignoredTransactions = new ArrayList();
        }
        this.ignoredTransactions.add(new H(str));
    }

    public void addInAppExclude(@NotNull String str) {
        this.inAppExcludes.add(str);
    }

    public void addInAppInclude(@NotNull String str) {
        this.inAppIncludes.add(str);
    }

    public void addIntegration(@NotNull InterfaceC4839u0 interfaceC4839u0) {
        this.integrations.add(interfaceC4839u0);
    }

    public void addOptionsObserver(@NotNull X x10) {
        this.optionsObservers.add(x10);
    }

    @ApiStatus.Internal
    public void addPerformanceCollector(@NotNull Y y10) {
        this.performanceCollectors.add(y10);
    }

    public void addScopeObserver(@NotNull InterfaceC4735d0 interfaceC4735d0) {
        this.observers.add(interfaceC4735d0);
    }

    public boolean containsIgnoredExceptionForType(@NotNull Throwable th2) {
        return this.ignoredExceptionsForType.contains(th2.getClass());
    }

    public final io.sentry.protocol.s createSdkVersion() {
        io.sentry.protocol.s sVar = new io.sentry.protocol.s("sentry.java", "8.48.0");
        sVar.j("8.48.0");
        return sVar;
    }

    public final void e() {
        C4778l3.d().b("maven:io.sentry:sentry", "8.48.0");
    }

    @ApiStatus.Internal
    @Nullable
    public io.sentry.cache.t findPersistingScopeObserver() {
        for (InterfaceC4735d0 interfaceC4735d0 : this.observers) {
            if (interfaceC4735d0 instanceof io.sentry.cache.t) {
                return (io.sentry.cache.t) interfaceC4735d0;
            }
        }
        return null;
    }

    @ApiStatus.Internal
    @NotNull
    public O getAppStartExtender() {
        return this.appStartExtender;
    }

    @ApiStatus.Internal
    @NotNull
    public io.sentry.backpressure.b getBackpressureMonitor() {
        return this.backpressureMonitor;
    }

    @Nullable
    public a getBeforeBreadcrumb() {
        return this.beforeBreadcrumb;
    }

    @ApiStatus.Internal
    @Nullable
    public b getBeforeEnvelopeCallback() {
        return null;
    }

    @Nullable
    public c getBeforeSend() {
        return this.beforeSend;
    }

    @Nullable
    public c getBeforeSendFeedback() {
        return this.beforeSendFeedback;
    }

    @Nullable
    public d getBeforeSendReplay() {
        return null;
    }

    @Nullable
    public e getBeforeSendTransaction() {
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

    @ApiStatus.Internal
    @NotNull
    public io.sentry.clientreport.h getClientReportRecorder() {
        return this.clientReportRecorder;
    }

    @ApiStatus.Internal
    @NotNull
    public InterfaceC4764j getCompositePerformanceCollector() {
        return this.compositePerformanceCollector;
    }

    @NotNull
    public P getConnectionStatusProvider() {
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
    public Q getContinuousProfiler() {
        return this.continuousProfiler;
    }

    @Nullable
    public f getCron() {
        return this.cron;
    }

    @ApiStatus.Internal
    @NotNull
    public InterfaceC4861w2 getDateProvider() {
        return (InterfaceC4861w2) this.dateProvider.a();
    }

    public long getDeadlineTimeout() {
        return this.deadlineTimeout;
    }

    @ApiStatus.Internal
    @NotNull
    public io.sentry.internal.debugmeta.a getDebugMetaLoader() {
        return this.debugMetaLoader;
    }

    @NotNull
    public P1 getDefaultScopeType() {
        return this.defaultScopeType;
    }

    @NotNull
    public EnumC4788n3 getDiagnosticLevel() {
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

    @ApiStatus.Experimental
    @NotNull
    public g getDistribution() {
        return this.distribution;
    }

    @ApiStatus.Experimental
    @NotNull
    public S getDistributionController() {
        return this.distributionController;
    }

    @Nullable
    public String getDsn() {
        return this.dsn;
    }

    @ApiStatus.Internal
    @Nullable
    public String getEffectiveOrgId() {
        String str = this.orgId;
        if (str != null) {
            String trim = str.trim();
            if (!trim.isEmpty()) {
                return trim;
            }
        }
        try {
            return retrieveParsedDsn().d();
        } catch (Throwable unused) {
            return null;
        }
    }

    @NotNull
    public io.sentry.cache.g getEnvelopeDiskCache() {
        return this.envelopeDiskCache;
    }

    @NotNull
    public T getEnvelopeReader() {
        return (T) this.envelopeReader.a();
    }

    @Nullable
    public String getEnvironment() {
        String str = this.environment;
        return str != null ? str : DEFAULT_ENVIRONMENT;
    }

    @NotNull
    public List<D> getEventProcessors() {
        return this.eventProcessors;
    }

    @ApiStatus.Internal
    @NotNull
    public InterfaceC4760i0 getExecutorService() {
        return this.executorService;
    }

    @NotNull
    public E getExperimental() {
        return this.experimental;
    }

    @ApiStatus.Experimental
    @NotNull
    public ILogger getFatalLogger() {
        return this.fatalLogger;
    }

    @NotNull
    public C4748f3 getFeedbackOptions() {
        return this.feedbackOptions;
    }

    public long getFlushTimeoutMillis() {
        return this.flushTimeoutMillis;
    }

    @ApiStatus.Internal
    @NotNull
    public I getFullyDisplayedReporter() {
        return this.fullyDisplayedReporter;
    }

    public List<io.sentry.internal.gestures.a> getGestureTargetLocators() {
        return this.gestureTargetLocators;
    }

    @Nullable
    public Long getIdleTimeout() {
        return this.idleTimeout;
    }

    @ApiStatus.Experimental
    @Nullable
    public List<H> getIgnoredCheckIns() {
        return this.ignoredCheckIns;
    }

    @Nullable
    public List<H> getIgnoredErrors() {
        return this.ignoredErrors;
    }

    @NotNull
    public Set<Class<? extends Throwable>> getIgnoredExceptionsForType() {
        return this.ignoredExceptionsForType;
    }

    @ApiStatus.Experimental
    @Nullable
    public List<H> getIgnoredSpanOrigins() {
        return this.ignoredSpanOrigins;
    }

    @Nullable
    public List<H> getIgnoredTransactions() {
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

    @ApiStatus.Internal
    @NotNull
    public EnumC4827s0 getInitPriority() {
        return this.initPriority;
    }

    @NotNull
    public EnumC4832t0 getInstrumenter() {
        return this.instrumenter;
    }

    @NotNull
    public List<InterfaceC4839u0> getIntegrations() {
        return this.integrations;
    }

    @ApiStatus.Internal
    @NotNull
    public k4 getInternalTracesSampler() {
        if (this.internalTracesSampler == null) {
            InterfaceC4765j0 d10 = this.lock.d();
            try {
                if (this.internalTracesSampler == null) {
                    this.internalTracesSampler = new k4(this);
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
        return this.internalTracesSampler;
    }

    @NotNull
    public ILogger getLogger() {
        return this.logger;
    }

    @ApiStatus.Experimental
    @NotNull
    public h getLogs() {
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
    public n getMaxRequestBodySize() {
        return this.maxRequestBodySize;
    }

    @ApiStatus.Experimental
    public int getMaxSpans() {
        return this.maxSpans;
    }

    public long getMaxTraceFileSize() {
        return this.maxTraceFileSize;
    }

    @NotNull
    public i getMetrics() {
        return this.metrics;
    }

    @ApiStatus.Internal
    @NotNull
    public io.sentry.internal.modules.b getModulesLoader() {
        return this.modulesLoader;
    }

    @Nullable
    public j getOnDiscard() {
        return null;
    }

    @Nullable
    public k getOnOversizedEvent() {
        return null;
    }

    @NotNull
    public EnumC4877z3 getOpenTelemetryMode() {
        return this.openTelemetryMode;
    }

    @NotNull
    public List<X> getOptionsObservers() {
        return this.optionsObservers;
    }

    @Nullable
    public String getOrgId() {
        return this.orgId;
    }

    @Nullable
    public String getOutboxPath() {
        String cacheDirPath = getCacheDirPath();
        if (cacheDirPath == null) {
            return null;
        }
        return new File(cacheDirPath, "outbox").getAbsolutePath();
    }

    @ApiStatus.Internal
    @NotNull
    public List<Y> getPerformanceCollectors() {
        return this.performanceCollectors;
    }

    @NotNull
    public A1 getProfileLifecycle() {
        return this.profileLifecycle;
    }

    @Nullable
    public Double getProfileSessionSampleRate() {
        return this.profileSessionSampleRate;
    }

    @NotNull
    public InterfaceC4725b0 getProfilerConverter() {
        return this.profilerConverter;
    }

    @Nullable
    public Double getProfilesSampleRate() {
        return this.profilesSampleRate;
    }

    @Nullable
    public l getProfilesSampler() {
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

    @ApiStatus.Internal
    public int getProfilingTracesHz() {
        return this.profilingTracesHz;
    }

    @Nullable
    public String getProguardUuid() {
        return this.proguardUuid;
    }

    @Nullable
    public m getProxy() {
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
    public G1 getReplayController() {
        return this.replayController;
    }

    @Nullable
    public Double getSampleRate() {
        return this.sampleRate;
    }

    @NotNull
    public List<InterfaceC4735d0> getScopeObservers() {
        return this.observers;
    }

    @ApiStatus.Experimental
    @Nullable
    public InterfaceC4750g0 getScopesStorageFactory() {
        return null;
    }

    @Nullable
    public io.sentry.protocol.s getSdkVersion() {
        return this.sdkVersion;
    }

    @Nullable
    public String getSentryClientName() {
        return this.sentryClientName;
    }

    @NotNull
    public InterfaceC4770k0 getSerializer() {
        return (InterfaceC4770k0) this.serializer.a();
    }

    @Nullable
    public String getServerName() {
        return this.serverName;
    }

    @ApiStatus.Internal
    public long getSessionFlushTimeoutMillis() {
        return this.sessionFlushTimeoutMillis;
    }

    @NotNull
    public H3 getSessionReplay() {
        return this.sessionReplay;
    }

    public long getSessionTrackingIntervalMillis() {
        return this.sessionTrackingIntervalMillis;
    }

    public long getShutdownTimeoutMillis() {
        return this.shutdownTimeoutMillis;
    }

    @NotNull
    public InterfaceC4775l0 getSocketTagger() {
        return this.socketTagger;
    }

    @ApiStatus.Internal
    @NotNull
    public InterfaceC4785n0 getSpanFactory() {
        return this.spanFactory;
    }

    @ApiStatus.Experimental
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
    public o getTracesSampler() {
        return null;
    }

    @NotNull
    public InterfaceC4795p0 getTransactionProfiler() {
        return this.transactionProfiler;
    }

    @NotNull
    public InterfaceC4808q0 getTransportFactory() {
        return this.transportFactory;
    }

    @NotNull
    public io.sentry.transport.q getTransportGate() {
        return this.transportGate;
    }

    @ApiStatus.Internal
    @NotNull
    public InterfaceC4812r0 getVersionDetector() {
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

    @ApiStatus.Experimental
    public boolean isCaptureOpenTelemetryEvents() {
        return this.captureOpenTelemetryEvents;
    }

    @ApiStatus.Internal
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

    @ApiStatus.Experimental
    public boolean isEnableBackpressureHandling() {
        return this.enableBackpressureHandling;
    }

    public boolean isEnableCacheTracing() {
        return this.enableCacheTracing;
    }

    public boolean isEnableDatabaseTransactionTracing() {
        return this.enableDatabaseTransactionTracing;
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

    public boolean isEnableQueueTracing() {
        return this.enableQueueTracing;
    }

    public boolean isEnableScopePersistence() {
        return this.enableScopePersistence;
    }

    @ApiStatus.Experimental
    public boolean isEnableScreenTracking() {
        return this.enableScreenTracking;
    }

    public boolean isEnableShutdownHook() {
        return this.enableShutdownHook;
    }

    @ApiStatus.Experimental
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

    public boolean isStrictTraceContinuation() {
        return this.strictTraceContinuation;
    }

    public boolean isTraceOptionsRequests() {
        return this.traceOptionsRequests;
    }

    @ApiStatus.Experimental
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

    public void merge(@NotNull F f10) {
        if (f10.m() != null) {
            setDsn(f10.m());
        }
        if (f10.p() != null) {
            setEnvironment(f10.p());
        }
        if (f10.G() != null) {
            setRelease(f10.G());
        }
        if (f10.l() != null) {
            setDist(f10.l());
        }
        if (f10.J() != null) {
            setServerName(f10.J());
        }
        if (f10.F() != null) {
            setProxy(f10.F());
        }
        if (f10.o() != null) {
            setEnableUncaughtExceptionHandler(f10.o().booleanValue());
        }
        if (f10.z() != null) {
            setPrintUncaughtStackTrace(f10.z().booleanValue());
        }
        if (f10.H() != null) {
            setSampleRate(f10.H());
        }
        if (f10.P() != null) {
            setTracesSampleRate(f10.P());
        }
        if (f10.C() != null) {
            setProfilesSampleRate(f10.C());
        }
        if (f10.k() != null) {
            setDebug(f10.k().booleanValue());
        }
        if (f10.n() != null) {
            setEnableDeduplication(f10.n().booleanValue());
        }
        if (f10.I() != null) {
            setSendClientReports(f10.I().booleanValue());
        }
        if (f10.a0() != null) {
            setForceInit(f10.a0().booleanValue());
        }
        for (Map.Entry entry : new HashMap(f10.N()).entrySet()) {
            this.tags.put((String) entry.getKey(), (String) entry.getValue());
        }
        Iterator it = new ArrayList(f10.w()).iterator();
        while (it.hasNext()) {
            addInAppInclude((String) it.next());
        }
        Iterator it2 = new ArrayList(f10.v()).iterator();
        while (it2.hasNext()) {
            addInAppExclude((String) it2.next());
        }
        Iterator it3 = new HashSet(f10.t()).iterator();
        while (it3.hasNext()) {
            addIgnoredExceptionForType((Class) it3.next());
        }
        if (f10.O() != null) {
            setTracePropagationTargets(new ArrayList(f10.O()));
        }
        Iterator it4 = new ArrayList(f10.i()).iterator();
        while (it4.hasNext()) {
            addContextTag((String) it4.next());
        }
        if (f10.E() != null) {
            setProguardUuid(f10.E());
        }
        if (f10.q() != null) {
            setIdleTimeout(f10.q());
        }
        if (f10.L() != null) {
            setShutdownTimeoutMillis(f10.L().longValue());
        }
        if (f10.K() != null) {
            setSessionFlushTimeoutMillis(f10.K().longValue());
        }
        Iterator it5 = f10.h().iterator();
        while (it5.hasNext()) {
            addBundleId((String) it5.next());
        }
        if (f10.Z() != null) {
            setEnabled(f10.Z().booleanValue());
        }
        if (f10.W() != null) {
            setEnablePrettySerializationOutput(f10.W().booleanValue());
        }
        if (f10.d0() != null) {
            setSendModules(f10.d0().booleanValue());
        }
        if (f10.r() != null) {
            setIgnoredCheckIns(new ArrayList(f10.r()));
        }
        if (f10.u() != null) {
            setIgnoredTransactions(new ArrayList(f10.u()));
        }
        if (f10.s() != null) {
            setIgnoredErrors(new ArrayList(f10.s()));
        }
        if (f10.R() != null) {
            setEnableBackpressureHandling(f10.R().booleanValue());
        }
        if (f10.T() != null) {
            setEnableDatabaseTransactionTracing(f10.T().booleanValue());
        }
        if (f10.S() != null) {
            setEnableCacheTracing(f10.S().booleanValue());
        }
        if (f10.X() != null) {
            setEnableQueueTracing(f10.X().booleanValue());
        }
        if (f10.x() != null) {
            setMaxRequestBodySize(f10.x());
        }
        if (f10.c0() != null) {
            setSendDefaultPii(f10.c0().booleanValue());
        }
        if (f10.Q() != null) {
            setCaptureOpenTelemetryEvents(f10.Q().booleanValue());
        }
        if (f10.Y() != null) {
            setEnableSpotlight(f10.Y().booleanValue());
        }
        if (f10.M() != null) {
            setSpotlightConnectionUrl(f10.M());
        }
        if (f10.b0() != null) {
            setGlobalHubMode(f10.b0());
        }
        if (f10.j() != null) {
            if (getCron() == null) {
                setCron(f10.j());
            } else {
                if (f10.j().a() != null) {
                    getCron().f(f10.j().a());
                }
                if (f10.j().c() != null) {
                    getCron().h(f10.j().c());
                }
                if (f10.j().e() != null) {
                    getCron().j(f10.j().e());
                }
                if (f10.j().b() != null) {
                    getCron().g(f10.j().b());
                }
                if (f10.j().d() != null) {
                    getCron().i(f10.j().d());
                }
            }
        }
        if (f10.U() != null) {
            getLogs().c(f10.U().booleanValue());
        }
        if (f10.V() != null) {
            getMetrics().c(f10.V().booleanValue());
        }
        if (f10.B() != null) {
            setProfileSessionSampleRate(f10.B());
        }
        if (f10.D() != null) {
            setProfilingTracesDirPath(f10.D());
        }
        if (f10.A() != null) {
            setProfileLifecycle(f10.A());
        }
        if (f10.e0() != null) {
            setStrictTraceContinuation(f10.e0().booleanValue());
        }
        if (f10.y() != null) {
            setOrgId(f10.y());
        }
    }

    @ApiStatus.Internal
    @NotNull
    public C4858w retrieveParsedDsn() {
        return (C4858w) this.parsedDsn.a();
    }

    @ApiStatus.Internal
    public void setAppStartExtender(@Nullable O o10) {
        if (o10 == null) {
            o10 = M0.a();
        }
        this.appStartExtender = o10;
    }

    public void setAttachServerName(boolean z10) {
        this.attachServerName = z10;
    }

    public void setAttachStacktrace(boolean z10) {
        this.attachStacktrace = z10;
    }

    public void setAttachThreads(boolean z10) {
        this.attachThreads = z10;
    }

    @ApiStatus.Internal
    public void setBackpressureMonitor(@NotNull io.sentry.backpressure.b bVar) {
        this.backpressureMonitor = bVar;
    }

    public void setBeforeBreadcrumb(@Nullable a aVar) {
        this.beforeBreadcrumb = aVar;
    }

    @ApiStatus.Internal
    public void setBeforeEnvelopeCallback(@Nullable b bVar) {
    }

    public void setBeforeSend(@Nullable c cVar) {
        this.beforeSend = cVar;
    }

    public void setBeforeSendFeedback(@Nullable c cVar) {
        this.beforeSendFeedback = cVar;
    }

    public void setBeforeSendReplay(@Nullable d dVar) {
    }

    public void setBeforeSendTransaction(@Nullable e eVar) {
    }

    public void setCacheDirPath(@Nullable String str) {
        this.cacheDirPath = str;
    }

    @ApiStatus.Experimental
    public void setCaptureOpenTelemetryEvents(boolean z10) {
        this.captureOpenTelemetryEvents = z10;
    }

    @ApiStatus.Internal
    public void setCompositePerformanceCollector(@NotNull InterfaceC4764j interfaceC4764j) {
        this.compositePerformanceCollector = interfaceC4764j;
    }

    public void setConnectionStatusProvider(@NotNull P p10) {
        this.connectionStatusProvider = p10;
    }

    public void setConnectionTimeoutMillis(int i10) {
        this.connectionTimeoutMillis = i10;
    }

    public void setContinuousProfiler(@Nullable Q q10) {
        if (this.continuousProfiler != P0.g() || q10 == null) {
            return;
        }
        this.continuousProfiler = q10;
    }

    @ApiStatus.Experimental
    public void setCron(@Nullable f fVar) {
        this.cron = fVar;
    }

    @ApiStatus.Internal
    public void setDateProvider(@NotNull InterfaceC4861w2 interfaceC4861w2) {
        this.dateProvider.c(interfaceC4861w2);
    }

    public void setDeadlineTimeout(long j10) {
        this.deadlineTimeout = j10;
    }

    public void setDebug(boolean z10) {
        this.debug = z10;
    }

    @ApiStatus.Internal
    public void setDebugMetaLoader(@Nullable io.sentry.internal.debugmeta.a aVar) {
        if (aVar == null) {
            aVar = io.sentry.internal.debugmeta.b.b();
        }
        this.debugMetaLoader = aVar;
    }

    public void setDefaultScopeType(@NotNull P1 p12) {
        this.defaultScopeType = p12;
    }

    public void setDiagnosticLevel(@Nullable EnumC4788n3 enumC4788n3) {
        if (enumC4788n3 == null) {
            enumC4788n3 = DEFAULT_DIAGNOSTIC_LEVEL;
        }
        this.diagnosticLevel = enumC4788n3;
    }

    public void setDist(@Nullable String str) {
        this.dist = str;
    }

    public void setDistinctId(@Nullable String str) {
        this.distinctId = str;
    }

    @ApiStatus.Experimental
    public void setDistribution(@NotNull g gVar) {
        if (gVar == null) {
            gVar = new g();
        }
        this.distribution = gVar;
    }

    @ApiStatus.Experimental
    public void setDistributionController(@Nullable S s10) {
        if (s10 == null) {
            s10 = Q0.a();
        }
        this.distributionController = s10;
    }

    public void setDsn(@Nullable String str) {
        this.dsn = str != null ? str.trim() : null;
        this.parsedDsn.b();
        this.dsnHash = io.sentry.util.D.a(this.dsn, this.logger);
    }

    public void setEnableAppStartProfiling(boolean z10) {
        this.enableAppStartProfiling = z10;
    }

    public void setEnableAutoSessionTracking(boolean z10) {
        this.enableAutoSessionTracking = z10;
    }

    @ApiStatus.Experimental
    public void setEnableBackpressureHandling(boolean z10) {
        this.enableBackpressureHandling = z10;
    }

    public void setEnableCacheTracing(boolean z10) {
        this.enableCacheTracing = z10;
    }

    public void setEnableDatabaseTransactionTracing(boolean z10) {
        this.enableDatabaseTransactionTracing = z10;
    }

    public void setEnableDeduplication(boolean z10) {
        this.enableDeduplication = z10;
    }

    public void setEnableEventSizeLimiting(boolean z10) {
        this.enableEventSizeLimiting = z10;
    }

    public void setEnableExternalConfiguration(boolean z10) {
        this.enableExternalConfiguration = z10;
    }

    public void setEnablePrettySerializationOutput(boolean z10) {
        this.enablePrettySerializationOutput = z10;
    }

    public void setEnableQueueTracing(boolean z10) {
        this.enableQueueTracing = z10;
    }

    public void setEnableScopePersistence(boolean z10) {
        this.enableScopePersistence = z10;
    }

    @ApiStatus.Experimental
    public void setEnableScreenTracking(boolean z10) {
        this.enableScreenTracking = z10;
    }

    public void setEnableShutdownHook(boolean z10) {
        this.enableShutdownHook = z10;
    }

    @ApiStatus.Experimental
    public void setEnableSpotlight(boolean z10) {
        this.enableSpotlight = z10;
    }

    public void setEnableTimeToFullDisplayTracing(boolean z10) {
        this.enableTimeToFullDisplayTracing = z10;
    }

    public void setEnableUncaughtExceptionHandler(boolean z10) {
        this.enableUncaughtExceptionHandler = z10;
    }

    public void setEnableUserInteractionBreadcrumbs(boolean z10) {
        this.enableUserInteractionBreadcrumbs = z10;
    }

    public void setEnableUserInteractionTracing(boolean z10) {
        this.enableUserInteractionTracing = z10;
    }

    public void setEnabled(boolean z10) {
        this.enabled = z10;
    }

    public void setEnvelopeDiskCache(@Nullable io.sentry.cache.g gVar) {
        if (gVar == null) {
            gVar = io.sentry.transport.r.a();
        }
        this.envelopeDiskCache = gVar;
    }

    public void setEnvelopeReader(@Nullable T t10) {
        io.sentry.util.p pVar = this.envelopeReader;
        if (t10 == null) {
            t10 = R0.b();
        }
        pVar.c(t10);
    }

    public void setEnvironment(@Nullable String str) {
        this.environment = str;
    }

    @TestOnly
    @ApiStatus.Internal
    public void setExecutorService(@NotNull InterfaceC4760i0 interfaceC4760i0) {
        if (interfaceC4760i0 != null) {
            this.executorService = interfaceC4760i0;
        }
    }

    @ApiStatus.Experimental
    public void setFatalLogger(@Nullable ILogger iLogger) {
        if (iLogger == null) {
            iLogger = U0.e();
        }
        this.fatalLogger = iLogger;
    }

    public void setFeedbackOptions(@NotNull C4748f3 c4748f3) {
        this.feedbackOptions = c4748f3;
    }

    public void setFlushTimeoutMillis(long j10) {
        this.flushTimeoutMillis = j10;
    }

    public void setForceInit(boolean z10) {
        this.forceInit = z10;
    }

    @TestOnly
    @ApiStatus.Internal
    public void setFullyDisplayedReporter(@NotNull I i10) {
        this.fullyDisplayedReporter = i10;
    }

    public void setGestureTargetLocators(@NotNull List<io.sentry.internal.gestures.a> list) {
        this.gestureTargetLocators.clear();
        this.gestureTargetLocators.addAll(list);
    }

    public void setGlobalHubMode(@Nullable Boolean bool) {
        this.globalHubMode = bool;
    }

    public void setIdleTimeout(@Nullable Long l10) {
        this.idleTimeout = l10;
    }

    @ApiStatus.Experimental
    public void setIgnoredCheckIns(@Nullable List<String> list) {
        if (list == null) {
            this.ignoredCheckIns = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (!str.isEmpty()) {
                arrayList.add(new H(str));
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
                arrayList.add(new H(str));
            }
        }
        this.ignoredErrors = arrayList;
    }

    @ApiStatus.Experimental
    public void setIgnoredSpanOrigins(@Nullable List<String> list) {
        if (list == null) {
            this.ignoredSpanOrigins = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (str != null && !str.isEmpty()) {
                arrayList.add(new H(str));
            }
        }
        this.ignoredSpanOrigins = arrayList;
    }

    @ApiStatus.Experimental
    public void setIgnoredTransactions(@Nullable List<String> list) {
        if (list == null) {
            this.ignoredTransactions = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (str != null && !str.isEmpty()) {
                arrayList.add(new H(str));
            }
        }
        this.ignoredTransactions = arrayList;
    }

    @ApiStatus.Internal
    public void setInitPriority(@NotNull EnumC4827s0 enumC4827s0) {
        this.initPriority = enumC4827s0;
    }

    @Deprecated
    public void setInstrumenter(@NotNull EnumC4832t0 enumC4832t0) {
        this.instrumenter = enumC4832t0;
    }

    public void setLogger(@Nullable ILogger iLogger) {
        this.logger = iLogger == null ? U0.e() : new C4826s(this, iLogger);
    }

    @ApiStatus.Experimental
    public void setLogs(@NotNull h hVar) {
        this.logs = hVar;
    }

    public void setMaxAttachmentSize(long j10) {
        this.maxAttachmentSize = j10;
    }

    public void setMaxBreadcrumbs(int i10) {
        this.maxBreadcrumbs = i10;
    }

    public void setMaxCacheItems(int i10) {
        this.maxCacheItems = i10;
    }

    public void setMaxDepth(int i10) {
        this.maxDepth = i10;
    }

    public void setMaxFeatureFlags(int i10) {
        this.maxFeatureFlags = i10;
    }

    public void setMaxQueueSize(int i10) {
        if (i10 > 0) {
            this.maxQueueSize = i10;
        }
    }

    public void setMaxRequestBodySize(@NotNull n nVar) {
        this.maxRequestBodySize = nVar;
    }

    @ApiStatus.Experimental
    public void setMaxSpans(int i10) {
        this.maxSpans = i10;
    }

    public void setMaxTraceFileSize(long j10) {
        this.maxTraceFileSize = j10;
    }

    public void setMetrics(@NotNull i iVar) {
        this.metrics = iVar;
    }

    @ApiStatus.Internal
    public void setModulesLoader(@Nullable io.sentry.internal.modules.b bVar) {
        if (bVar == null) {
            bVar = io.sentry.internal.modules.e.b();
        }
        this.modulesLoader = bVar;
    }

    public void setOnDiscard(@Nullable j jVar) {
    }

    public void setOnOversizedEvent(@Nullable k kVar) {
    }

    public void setOpenTelemetryMode(@NotNull EnumC4877z3 enumC4877z3) {
        this.openTelemetryMode = enumC4877z3;
    }

    public void setOrgId(@Nullable String str) {
        this.orgId = str;
    }

    public void setPrintUncaughtStackTrace(boolean z10) {
        this.printUncaughtStackTrace = z10;
    }

    public void setProfileLifecycle(@NotNull A1 a12) {
        this.profileLifecycle = a12;
        if (a12 != A1.TRACE || isTracingEnabled()) {
            return;
        }
        this.logger.c(EnumC4788n3.WARNING, "Profiling lifecycle is set to TRACE but tracing is disabled. Profiling will not be started automatically.", new Object[0]);
    }

    public void setProfileSessionSampleRate(@Nullable Double d10) {
        if (io.sentry.util.A.c(d10)) {
            this.profileSessionSampleRate = d10;
            return;
        }
        throw new IllegalArgumentException("The value " + d10 + " is not valid. Use values between 0.0 and 1.0.");
    }

    public void setProfilerConverter(@NotNull InterfaceC4725b0 interfaceC4725b0) {
        this.profilerConverter = interfaceC4725b0;
    }

    public void setProfilesSampleRate(@Nullable Double d10) {
        if (io.sentry.util.A.d(d10)) {
            this.profilesSampleRate = d10;
            return;
        }
        throw new IllegalArgumentException("The value " + d10 + " is not valid. Use null to disable or values between 0.0 and 1.0.");
    }

    public void setProfilesSampler(@Nullable l lVar) {
    }

    public void setProfilingTracesDirPath(@Nullable String str) {
        this.profilingTracesDirPath = str;
    }

    @ApiStatus.Internal
    public void setProfilingTracesHz(int i10) {
        this.profilingTracesHz = i10;
    }

    public void setProguardUuid(@Nullable String str) {
        this.proguardUuid = str;
    }

    public void setPropagateTraceparent(boolean z10) {
        this.propagateTraceparent = z10;
    }

    public void setProxy(@Nullable m mVar) {
        this.proxy = mVar;
    }

    public void setReadTimeoutMillis(int i10) {
        this.readTimeoutMillis = i10;
    }

    public void setRelease(@Nullable String str) {
        this.release = str;
    }

    public void setReplayController(@Nullable G1 g12) {
        if (g12 == null) {
            g12 = X0.a();
        }
        this.replayController = g12;
    }

    public void setSampleRate(@Nullable Double d10) {
        if (io.sentry.util.A.f(d10)) {
            this.sampleRate = d10;
            return;
        }
        throw new IllegalArgumentException("The value " + d10 + " is not valid. Use null to disable or values >= 0.0 and <= 1.0.");
    }

    @ApiStatus.Experimental
    public void setScopesStorageFactory(@Nullable InterfaceC4750g0 interfaceC4750g0) {
    }

    @ApiStatus.Internal
    public void setSdkVersion(@Nullable io.sentry.protocol.s sVar) {
        io.sentry.protocol.s x10 = getSessionReplay().x();
        io.sentry.protocol.s sVar2 = this.sdkVersion;
        if (sVar2 != null && x10 != null && sVar2.equals(x10)) {
            getSessionReplay().R(sVar);
        }
        this.sdkVersion = sVar;
    }

    public void setSendClientReports(boolean z10) {
        this.sendClientReports = z10;
        if (z10) {
            this.clientReportRecorder = new io.sentry.clientreport.e(this);
        } else {
            this.clientReportRecorder = new io.sentry.clientreport.j();
        }
    }

    public void setSendDefaultPii(boolean z10) {
        this.sendDefaultPii = z10;
    }

    public void setSendModules(boolean z10) {
        this.sendModules = z10;
    }

    public void setSentryClientName(@Nullable String str) {
        this.sentryClientName = str;
    }

    public void setSerializer(@Nullable InterfaceC4770k0 interfaceC4770k0) {
        io.sentry.util.p pVar = this.serializer;
        if (interfaceC4770k0 == null) {
            interfaceC4770k0 = C4761i1.g();
        }
        pVar.c(interfaceC4770k0);
    }

    public void setServerName(@Nullable String str) {
        this.serverName = str;
    }

    @ApiStatus.Internal
    public void setSessionFlushTimeoutMillis(long j10) {
        this.sessionFlushTimeoutMillis = j10;
    }

    public void setSessionReplay(@NotNull H3 h32) {
        this.sessionReplay = h32;
    }

    public void setSessionTrackingIntervalMillis(long j10) {
        this.sessionTrackingIntervalMillis = j10;
    }

    public void setShutdownTimeoutMillis(long j10) {
        this.shutdownTimeoutMillis = j10;
    }

    public void setSocketTagger(@Nullable InterfaceC4775l0 interfaceC4775l0) {
        if (interfaceC4775l0 == null) {
            interfaceC4775l0 = C4766j1.c();
        }
        this.socketTagger = interfaceC4775l0;
    }

    @ApiStatus.Internal
    public void setSpanFactory(@NotNull InterfaceC4785n0 interfaceC4785n0) {
        this.spanFactory = interfaceC4785n0;
    }

    @ApiStatus.Experimental
    public void setSpotlightConnectionUrl(@Nullable String str) {
        this.spotlightConnectionUrl = str;
    }

    public void setSslSocketFactory(@Nullable SSLSocketFactory sSLSocketFactory) {
        this.sslSocketFactory = sSLSocketFactory;
    }

    public void setStartProfilerOnAppStart(boolean z10) {
        this.startProfilerOnAppStart = z10;
    }

    public void setStrictTraceContinuation(boolean z10) {
        this.strictTraceContinuation = z10;
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

    public void setTraceOptionsRequests(boolean z10) {
        this.traceOptionsRequests = z10;
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
    public void setTraceSampling(boolean z10) {
        this.traceSampling = z10;
    }

    public void setTracesSampleRate(@Nullable Double d10) {
        if (io.sentry.util.A.g(d10)) {
            this.tracesSampleRate = d10;
            return;
        }
        throw new IllegalArgumentException("The value " + d10 + " is not valid. Use null to disable or values between 0.0 and 1.0.");
    }

    public void setTracesSampler(@Nullable o oVar) {
    }

    public void setTransactionProfiler(@Nullable InterfaceC4795p0 interfaceC4795p0) {
        if (this.transactionProfiler != C4786n1.c() || interfaceC4795p0 == null) {
            return;
        }
        this.transactionProfiler = interfaceC4795p0;
    }

    public void setTransportFactory(@Nullable InterfaceC4808q0 interfaceC4808q0) {
        if (interfaceC4808q0 == null) {
            interfaceC4808q0 = C4791o1.b();
        }
        this.transportFactory = interfaceC4808q0;
    }

    public void setTransportGate(@Nullable io.sentry.transport.q qVar) {
        if (qVar == null) {
            qVar = io.sentry.transport.t.a();
        }
        this.transportGate = qVar;
    }

    @ApiStatus.Internal
    public void setVersionDetector(@NotNull InterfaceC4812r0 interfaceC4812r0) {
        this.versionDetector = interfaceC4812r0;
    }

    public void setViewHierarchyExporters(@NotNull List<Object> list) {
        this.viewHierarchyExporters.clear();
        this.viewHierarchyExporters.addAll(list);
    }

    public F3(boolean z10) {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.eventProcessors = copyOnWriteArrayList;
        this.ignoredExceptionsForType = new CopyOnWriteArraySet();
        this.ignoredErrors = null;
        CopyOnWriteArrayList copyOnWriteArrayList2 = new CopyOnWriteArrayList();
        this.integrations = copyOnWriteArrayList2;
        this.bundleIds = new CopyOnWriteArraySet();
        this.parsedDsn = new io.sentry.util.p(new p.a() { // from class: io.sentry.A3
            @Override // io.sentry.util.p.a
            public final Object a() {
                return F3.b(F3.this);
            }
        });
        this.shutdownTimeoutMillis = 2000L;
        this.flushTimeoutMillis = 15000L;
        this.sessionFlushTimeoutMillis = 15000L;
        this.logger = U0.e();
        this.fatalLogger = U0.e();
        this.diagnosticLevel = DEFAULT_DIAGNOSTIC_LEVEL;
        this.serializer = new io.sentry.util.p(new p.a() { // from class: io.sentry.B3
            @Override // io.sentry.util.p.a
            public final Object a() {
                return F3.d(F3.this);
            }
        });
        this.envelopeReader = new io.sentry.util.p(new p.a() { // from class: io.sentry.C3
            @Override // io.sentry.util.p.a
            public final Object a() {
                return F3.c(F3.this);
            }
        });
        this.maxDepth = 100;
        this.maxCacheItems = 30;
        this.maxQueueSize = 30;
        this.maxBreadcrumbs = 100;
        this.maxFeatureFlags = 100;
        this.inAppExcludes = new CopyOnWriteArrayList();
        this.inAppIncludes = new CopyOnWriteArrayList();
        this.transportFactory = C4791o1.b();
        this.transportGate = io.sentry.transport.t.a();
        this.attachStacktrace = true;
        this.enableAutoSessionTracking = true;
        this.sessionTrackingIntervalMillis = 30000L;
        this.attachServerName = true;
        this.enableUncaughtExceptionHandler = true;
        this.printUncaughtStackTrace = false;
        this.executorService = C4756h1.e();
        this.spotlightIntegrationLoaded = new AtomicBoolean(false);
        this.connectionTimeoutMillis = 30000;
        this.readTimeoutMillis = 30000;
        this.envelopeDiskCache = io.sentry.transport.r.a();
        this.sendDefaultPii = false;
        this.observers = new CopyOnWriteArrayList();
        this.optionsObservers = new CopyOnWriteArrayList();
        this.tags = new ConcurrentHashMap();
        this.maxAttachmentSize = 20971520L;
        this.enableDeduplication = true;
        this.enableEventSizeLimiting = false;
        this.maxSpans = 1000;
        this.enableShutdownHook = true;
        this.maxRequestBodySize = n.NONE;
        this.traceSampling = true;
        this.maxTraceFileSize = 5242880L;
        this.transactionProfiler = C4786n1.c();
        this.continuousProfiler = P0.g();
        this.profilerConverter = V0.b();
        this.tracePropagationTargets = null;
        this.defaultTracePropagationTargets = Collections.singletonList(DEFAULT_PROPAGATION_TARGETS);
        this.propagateTraceparent = false;
        this.strictTraceContinuation = false;
        this.idleTimeout = 3000L;
        this.contextTags = new CopyOnWriteArrayList();
        this.sendClientReports = true;
        this.clientReportRecorder = new io.sentry.clientreport.e(this);
        this.modulesLoader = io.sentry.internal.modules.e.b();
        this.debugMetaLoader = io.sentry.internal.debugmeta.b.b();
        this.enableUserInteractionTracing = false;
        this.enableUserInteractionBreadcrumbs = true;
        this.instrumenter = EnumC4832t0.SENTRY;
        this.gestureTargetLocators = new ArrayList();
        this.viewHierarchyExporters = new ArrayList();
        this.threadChecker = io.sentry.util.thread.b.d();
        this.traceOptionsRequests = true;
        this.enableDatabaseTransactionTracing = false;
        this.enableCacheTracing = false;
        this.enableQueueTracing = false;
        this.dateProvider = new io.sentry.util.p(new p.a() { // from class: io.sentry.D3
            @Override // io.sentry.util.p.a
            public final Object a() {
                return F3.a();
            }
        });
        this.performanceCollectors = new ArrayList();
        this.compositePerformanceCollector = N0.g();
        this.enableTimeToFullDisplayTracing = false;
        this.fullyDisplayedReporter = I.a();
        this.appStartExtender = M0.a();
        this.connectionStatusProvider = new O0();
        this.enabled = true;
        this.enablePrettySerializationOutput = true;
        this.sendModules = true;
        this.enableSpotlight = false;
        this.enableScopePersistence = true;
        this.ignoredCheckIns = null;
        this.ignoredSpanOrigins = null;
        this.ignoredTransactions = null;
        this.backpressureMonitor = io.sentry.backpressure.c.b();
        this.enableBackpressureHandling = true;
        this.enableAppStartProfiling = false;
        this.spanFactory = C4776l1.b();
        this.profilingTracesHz = 101;
        this.cron = null;
        this.replayController = X0.a();
        this.distributionController = Q0.a();
        this.enableScreenTracking = true;
        this.defaultScopeType = P1.ISOLATION;
        this.initPriority = EnumC4827s0.MEDIUM;
        this.forceInit = false;
        this.globalHubMode = null;
        this.lock = new C4843a();
        this.openTelemetryMode = EnumC4877z3.AUTO;
        this.captureOpenTelemetryEvents = false;
        this.versionDetector = C4796p1.b();
        this.profileLifecycle = A1.MANUAL;
        this.startProfilerOnAppStart = false;
        this.deadlineTimeout = 30000L;
        this.logs = new h();
        this.metrics = new i();
        this.socketTagger = C4766j1.c();
        this.distribution = new g();
        io.sentry.protocol.s createSdkVersion = createSdkVersion();
        this.experimental = new E(z10, createSdkVersion);
        this.sessionReplay = new H3(z10, createSdkVersion);
        this.feedbackOptions = new C4748f3(new C4748f3.a() { // from class: io.sentry.E3
        });
        if (z10) {
            return;
        }
        setSpanFactory(b4.a(new io.sentry.util.s(), U0.e()));
        copyOnWriteArrayList2.add(new UncaughtExceptionHandlerIntegration());
        copyOnWriteArrayList2.add(new ShutdownHookIntegration());
        copyOnWriteArrayList.add(new I0(this));
        copyOnWriteArrayList.add(new C4863x(this));
        if (io.sentry.util.y.c()) {
            copyOnWriteArrayList.add(new I3());
        }
        setSentryClientName("sentry.java/8.48.0");
        setSdkVersion(createSdkVersion);
        e();
    }
}
