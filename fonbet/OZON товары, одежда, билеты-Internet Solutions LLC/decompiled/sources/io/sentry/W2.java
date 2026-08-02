package io.sentry;

import Am.C2438a;
import io.sentry.D2;
import io.sentry.android.core.C7115p;
import io.sentry.android.core.C7117s;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
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
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public class W2 {
    static final I2 DEFAULT_DIAGNOSTIC_LEVEL = I2.DEBUG;
    private static final String DEFAULT_ENVIRONMENT = "production";

    @NotNull
    public static final String DEFAULT_PROPAGATION_TARGETS = ".*";
    public static final long MAX_EVENT_SIZE_BYTES = 1048576;
    private boolean attachServerName;
    private boolean attachStacktrace;
    private boolean attachThreads;

    @NotNull
    private io.sentry.backpressure.b backpressureMonitor;
    private a beforeBreadcrumb;
    private b beforeEnvelopeCallback;
    private c beforeSend;
    private c beforeSendFeedback;
    private d beforeSendReplay;
    private e beforeSendTransaction;

    @NotNull
    private final Set<String> bundleIds;
    private String cacheDirPath;
    private boolean captureOpenTelemetryEvents;

    @NotNull
    io.sentry.clientreport.h clientReportRecorder;

    @NotNull
    private InterfaceC7157j compositePerformanceCollector;

    @NotNull
    private J connectionStatusProvider;
    private int connectionTimeoutMillis;

    @NotNull
    private final List<String> contextTags;

    @NotNull
    private K continuousProfiler;
    private f cron;

    @NotNull
    private final io.sentry.util.l<U1> dateProvider;
    private long deadlineTimeout;
    private boolean debug;

    @NotNull
    private io.sentry.internal.debugmeta.a debugMetaLoader;

    @NotNull
    private EnumC7225y1 defaultScopeType;

    @NotNull
    private final List<String> defaultTracePropagationTargets;

    @NotNull
    private I2 diagnosticLevel;
    private String dist;
    private String distinctId;

    @NotNull
    private g distribution;

    @NotNull
    private L distributionController;
    private String dsn;
    private String dsnHash;
    private boolean enableAppStartProfiling;
    private boolean enableAutoSessionTracking;
    private boolean enableBackpressureHandling;
    private boolean enableDatabaseTransactionTracing;
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
    private io.sentry.cache.g envelopeDiskCache;

    @NotNull
    private final io.sentry.util.l<M> envelopeReader;
    private String environment;

    @NotNull
    private final List<InterfaceC7227z> eventProcessors;

    @NotNull
    private Z executorService;

    @NotNull
    private final A experimental;

    @NotNull
    private ILogger fatalLogger;

    @NotNull
    private D2 feedbackOptions;
    private long flushTimeoutMillis;
    private boolean forceInit;

    @NotNull
    private D fullyDisplayedReporter;

    @NotNull
    private final List<io.sentry.internal.gestures.a> gestureTargetLocators;
    private Boolean globalHubMode;
    private Long idleTimeout;
    private List<C> ignoredCheckIns;
    private List<C> ignoredErrors;

    @NotNull
    private final Set<Class<? extends Throwable>> ignoredExceptionsForType;
    private List<C> ignoredSpanOrigins;
    private List<C> ignoredTransactions;

    @NotNull
    private final List<String> inAppExcludes;

    @NotNull
    private final List<String> inAppIncludes;

    @NotNull
    private EnumC7158j0 initPriority;

    @NotNull
    private EnumC7162k0 instrumenter;

    @NotNull
    private final List<InterfaceC7166l0> integrations;
    private volatile r3 internalTracesSampler;

    @NotNull
    protected final io.sentry.util.a lock;

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
    private final List<V> observers;
    private j onDiscard;
    private k onOversizedEvent;

    @NotNull
    private U2 openTelemetryMode;

    @NotNull
    private final List<O> optionsObservers;

    @NotNull
    private final io.sentry.util.l<C7211v> parsedDsn;

    @NotNull
    private final List<P> performanceCollectors;
    private boolean printUncaughtStackTrace;

    @NotNull
    private EnumC7159j1 profileLifecycle;
    private Double profileSessionSampleRate;

    @NotNull
    private T profilerConverter;
    private Double profilesSampleRate;
    private l profilesSampler;
    private String profilingTracesDirPath;
    private int profilingTracesHz;
    private String proguardUuid;
    private boolean propagateTraceparent;
    private m proxy;
    private int readTimeoutMillis;
    private String release;

    @NotNull
    private InterfaceC7183p1 replayController;
    private Double sampleRate;
    private io.sentry.protocol.r sdkVersion;
    private boolean sendClientReports;
    private boolean sendDefaultPii;
    private boolean sendModules;
    private String sentryClientName;

    @NotNull
    private final io.sentry.util.l<InterfaceC7126b0> serializer;
    private String serverName;
    private long sessionFlushTimeoutMillis;

    @NotNull
    private Y2 sessionReplay;
    private long sessionTrackingIntervalMillis;
    private long shutdownTimeoutMillis;

    @NotNull
    private InterfaceC7130c0 socketTagger;

    @NotNull
    private InterfaceC7138e0 spanFactory;
    private String spotlightConnectionUrl;

    @NotNull
    private final AtomicBoolean spotlightIntegrationLoaded;
    private SSLSocketFactory sslSocketFactory;
    private boolean startProfilerOnAppStart;

    @NotNull
    private final Map<String, String> tags;

    @NotNull
    private io.sentry.util.thread.a threadChecker;
    private boolean traceOptionsRequests;
    private List<String> tracePropagationTargets;
    private boolean traceSampling;
    private Double tracesSampleRate;
    private o tracesSampler;

    @NotNull
    private InterfaceC7146g0 transactionProfiler;

    @NotNull
    private InterfaceC7150h0 transportFactory;

    @NotNull
    private io.sentry.transport.g transportGate;

    @NotNull
    private InterfaceC7154i0 versionDetector;

    @NotNull
    private final List<io.sentry.internal.viewhierarchy.a> viewHierarchyExporters;

    public interface a {
        C7141f a(@NotNull C7141f c7141f, @NotNull E e11);
    }

    /* loaded from: classes10.dex */
    public interface b {
    }

    /* loaded from: classes10.dex */
    public interface c {
    }

    /* loaded from: classes10.dex */
    public interface d {
    }

    /* loaded from: classes10.dex */
    public interface e {
    }

    /* loaded from: classes10.dex */
    public static final class f {

        /* renamed from: a, reason: collision with root package name */
        private Long f66763a;

        /* renamed from: b, reason: collision with root package name */
        private Long f66764b;

        /* renamed from: c, reason: collision with root package name */
        private String f66765c;

        /* renamed from: d, reason: collision with root package name */
        private Long f66766d;

        /* renamed from: e, reason: collision with root package name */
        private Long f66767e;

        public final Long a() {
            return this.f66763a;
        }

        public final Long b() {
            return this.f66766d;
        }

        public final Long c() {
            return this.f66764b;
        }

        public final Long d() {
            return this.f66767e;
        }

        public final String e() {
            return this.f66765c;
        }

        public final void f(Long l11) {
            this.f66763a = l11;
        }

        public final void g(Long l11) {
            this.f66766d = l11;
        }

        public final void h(Long l11) {
            this.f66764b = l11;
        }

        public final void i(Long l11) {
            this.f66767e = l11;
        }

        public final void j(String str) {
            this.f66765c = str;
        }
    }

    public static final class g {

        /* renamed from: a, reason: collision with root package name */
        public String f66768a = "";

        /* renamed from: b, reason: collision with root package name */
        public String f66769b = "";

        /* renamed from: c, reason: collision with root package name */
        public String f66770c = "";

        /* renamed from: d, reason: collision with root package name */
        public String f66771d = null;

        /* renamed from: e, reason: collision with root package name */
        public ArrayList f66772e = null;
    }

    public static final class h {

        /* renamed from: a, reason: collision with root package name */
        private boolean f66773a = false;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private io.sentry.logger.c f66774b = new io.sentry.logger.a();

        @NotNull
        public final io.sentry.logger.c a() {
            return this.f66774b;
        }

        public final boolean b() {
            return this.f66773a;
        }

        public final void c(boolean z11) {
            this.f66773a = z11;
        }

        public final void d(@NotNull C7115p c7115p) {
            this.f66774b = c7115p;
        }
    }

    public static final class i {

        /* renamed from: a, reason: collision with root package name */
        private boolean f66775a = true;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private io.sentry.metrics.c f66776b = new io.sentry.metrics.a();

        @NotNull
        public final io.sentry.metrics.c a() {
            return this.f66776b;
        }

        public final boolean b() {
            return this.f66775a;
        }

        public final void c(boolean z11) {
            this.f66775a = z11;
        }

        public final void d(@NotNull C7117s c7117s) {
            this.f66776b = c7117s;
        }
    }

    /* loaded from: classes10.dex */
    public interface j {
    }

    /* loaded from: classes10.dex */
    public interface k {
    }

    /* loaded from: classes10.dex */
    public interface l {
    }

    /* loaded from: classes10.dex */
    public static final class m {

        /* renamed from: a, reason: collision with root package name */
        private String f66777a;

        /* renamed from: b, reason: collision with root package name */
        private String f66778b;

        /* renamed from: c, reason: collision with root package name */
        private String f66779c;

        /* renamed from: d, reason: collision with root package name */
        private String f66780d;

        public m(String str, String str2, String str3, String str4) {
            this.f66777a = str;
            this.f66778b = str2;
            this.f66779c = str3;
            this.f66780d = str4;
        }

        public final String a() {
            return this.f66777a;
        }

        public final String b() {
            return this.f66780d;
        }

        public final String c() {
            return this.f66778b;
        }

        public final String d() {
            return this.f66779c;
        }
    }

    public enum n {
        NONE,
        SMALL,
        MEDIUM,
        ALWAYS
    }

    /* loaded from: classes10.dex */
    public interface o {
    }

    public W2() {
        this(false);
    }

    private void addPackageInfo() {
        G2.d().b("maven:io.sentry:sentry", "8.34.1");
    }

    @NotNull
    private io.sentry.protocol.r createSdkVersion() {
        io.sentry.protocol.r rVar = new io.sentry.protocol.r("sentry.java", "8.34.1");
        rVar.g("8.34.1");
        return rVar;
    }

    @NotNull
    public static W2 empty() {
        return new W2(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ C7211v lambda$new$0() {
        return new C7211v(this.dsn);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ InterfaceC7126b0 lambda$new$1() {
        return new C7224y0(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ M lambda$new$2() {
        return new C7219x(this.serializer.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ U1 lambda$new$3() {
        return new N1();
    }

    private /* synthetic */ void lambda$new$4(io.sentry.protocol.t tVar, D2.a aVar) {
        this.logger.c(I2.WARNING, "showDialog() can only be called in Android.", new Object[0]);
    }

    public void activate() {
        if (this.executorService instanceof T0) {
            C2 c22 = new C2(this);
            this.executorService = c22;
            c22.a();
        }
        if (this.spotlightIntegrationLoaded.compareAndSet(false, true)) {
            try {
                this.integrations.add((InterfaceC7166l0) Class.forName("io.sentry.spotlight.SpotlightIntegration").getConstructor(new Class[0]).newInstance(new Object[0]));
            } catch (Throwable unused) {
            }
        }
    }

    public void addBundleId(String str) {
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

    public void addEventProcessor(@NotNull InterfaceC7227z interfaceC7227z) {
        this.eventProcessors.add(interfaceC7227z);
    }

    public void addIgnoredCheckIn(String str) {
        if (this.ignoredCheckIns == null) {
            this.ignoredCheckIns = new ArrayList();
        }
        this.ignoredCheckIns.add(new C(str));
    }

    public void addIgnoredError(@NotNull String str) {
        if (this.ignoredErrors == null) {
            this.ignoredErrors = new ArrayList();
        }
        this.ignoredErrors.add(new C(str));
    }

    public void addIgnoredExceptionForType(@NotNull Class<? extends Throwable> cls) {
        this.ignoredExceptionsForType.add(cls);
    }

    public void addIgnoredSpanOrigin(String str) {
        if (this.ignoredSpanOrigins == null) {
            this.ignoredSpanOrigins = new ArrayList();
        }
        this.ignoredSpanOrigins.add(new C(str));
    }

    public void addIgnoredTransaction(String str) {
        if (this.ignoredTransactions == null) {
            this.ignoredTransactions = new ArrayList();
        }
        this.ignoredTransactions.add(new C(str));
    }

    public void addInAppExclude(@NotNull String str) {
        this.inAppExcludes.add(str);
    }

    public void addInAppInclude(@NotNull String str) {
        this.inAppIncludes.add(str);
    }

    public void addIntegration(@NotNull InterfaceC7166l0 interfaceC7166l0) {
        this.integrations.add(interfaceC7166l0);
    }

    public void addOptionsObserver(@NotNull O o11) {
        this.optionsObservers.add(o11);
    }

    public void addPerformanceCollector(@NotNull P p11) {
        this.performanceCollectors.add(p11);
    }

    public void addScopeObserver(@NotNull V v11) {
        this.observers.add(v11);
    }

    boolean containsIgnoredExceptionForType(@NotNull Throwable th2) {
        return this.ignoredExceptionsForType.contains(th2.getClass());
    }

    public io.sentry.cache.l findPersistingScopeObserver() {
        for (V v11 : this.observers) {
            if (v11 instanceof io.sentry.cache.l) {
                return (io.sentry.cache.l) v11;
            }
        }
        return null;
    }

    @NotNull
    public io.sentry.backpressure.b getBackpressureMonitor() {
        return this.backpressureMonitor;
    }

    public a getBeforeBreadcrumb() {
        return this.beforeBreadcrumb;
    }

    public b getBeforeEnvelopeCallback() {
        return null;
    }

    public c getBeforeSend() {
        return this.beforeSend;
    }

    public c getBeforeSendFeedback() {
        return this.beforeSendFeedback;
    }

    public d getBeforeSendReplay() {
        return null;
    }

    public e getBeforeSendTransaction() {
        return null;
    }

    @NotNull
    public Set<String> getBundleIds() {
        return this.bundleIds;
    }

    public String getCacheDirPath() {
        String str = this.cacheDirPath;
        if (str == null || str.isEmpty()) {
            return null;
        }
        return this.dsnHash != null ? new File(this.cacheDirPath, this.dsnHash).getAbsolutePath() : this.cacheDirPath;
    }

    String getCacheDirPathWithoutDsn() {
        String str = this.cacheDirPath;
        if (str == null || str.isEmpty()) {
            return null;
        }
        return this.cacheDirPath;
    }

    @NotNull
    public io.sentry.clientreport.h getClientReportRecorder() {
        return this.clientReportRecorder;
    }

    @NotNull
    public InterfaceC7157j getCompositePerformanceCollector() {
        return this.compositePerformanceCollector;
    }

    @NotNull
    public J getConnectionStatusProvider() {
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
    public K getContinuousProfiler() {
        return this.continuousProfiler;
    }

    public f getCron() {
        return this.cron;
    }

    @NotNull
    public U1 getDateProvider() {
        return this.dateProvider.a();
    }

    public long getDeadlineTimeout() {
        return this.deadlineTimeout;
    }

    @NotNull
    public io.sentry.internal.debugmeta.a getDebugMetaLoader() {
        return this.debugMetaLoader;
    }

    @NotNull
    public EnumC7225y1 getDefaultScopeType() {
        return this.defaultScopeType;
    }

    @NotNull
    public I2 getDiagnosticLevel() {
        return this.diagnosticLevel;
    }

    public String getDist() {
        return this.dist;
    }

    public String getDistinctId() {
        return this.distinctId;
    }

    @NotNull
    public g getDistribution() {
        return this.distribution;
    }

    @NotNull
    public L getDistributionController() {
        return this.distributionController;
    }

    public String getDsn() {
        return this.dsn;
    }

    @NotNull
    public io.sentry.cache.g getEnvelopeDiskCache() {
        return this.envelopeDiskCache;
    }

    @NotNull
    public M getEnvelopeReader() {
        return this.envelopeReader.a();
    }

    public String getEnvironment() {
        String str = this.environment;
        return str != null ? str : DEFAULT_ENVIRONMENT;
    }

    @NotNull
    public List<InterfaceC7227z> getEventProcessors() {
        return this.eventProcessors;
    }

    @NotNull
    public Z getExecutorService() {
        return this.executorService;
    }

    @NotNull
    public A getExperimental() {
        return this.experimental;
    }

    @NotNull
    public ILogger getFatalLogger() {
        return this.fatalLogger;
    }

    @NotNull
    public D2 getFeedbackOptions() {
        return this.feedbackOptions;
    }

    public long getFlushTimeoutMillis() {
        return this.flushTimeoutMillis;
    }

    @NotNull
    public D getFullyDisplayedReporter() {
        return this.fullyDisplayedReporter;
    }

    public List<io.sentry.internal.gestures.a> getGestureTargetLocators() {
        return this.gestureTargetLocators;
    }

    public Long getIdleTimeout() {
        return this.idleTimeout;
    }

    public List<C> getIgnoredCheckIns() {
        return this.ignoredCheckIns;
    }

    public List<C> getIgnoredErrors() {
        return this.ignoredErrors;
    }

    @NotNull
    public Set<Class<? extends Throwable>> getIgnoredExceptionsForType() {
        return this.ignoredExceptionsForType;
    }

    public List<C> getIgnoredSpanOrigins() {
        return this.ignoredSpanOrigins;
    }

    public List<C> getIgnoredTransactions() {
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
    public EnumC7158j0 getInitPriority() {
        return this.initPriority;
    }

    @NotNull
    public EnumC7162k0 getInstrumenter() {
        return this.instrumenter;
    }

    @NotNull
    public List<InterfaceC7166l0> getIntegrations() {
        return this.integrations;
    }

    @NotNull
    public r3 getInternalTracesSampler() {
        if (this.internalTracesSampler == null) {
            InterfaceC7097a0 a11 = this.lock.a();
            try {
                if (this.internalTracesSampler == null) {
                    this.internalTracesSampler = new r3(this);
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
        return this.internalTracesSampler;
    }

    @NotNull
    public ILogger getLogger() {
        return this.logger;
    }

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

    @NotNull
    public io.sentry.internal.modules.b getModulesLoader() {
        return this.modulesLoader;
    }

    public j getOnDiscard() {
        return null;
    }

    public k getOnOversizedEvent() {
        return null;
    }

    @NotNull
    public U2 getOpenTelemetryMode() {
        return this.openTelemetryMode;
    }

    @NotNull
    public List<O> getOptionsObservers() {
        return this.optionsObservers;
    }

    public String getOutboxPath() {
        String cacheDirPath = getCacheDirPath();
        if (cacheDirPath == null) {
            return null;
        }
        return new File(cacheDirPath, "outbox").getAbsolutePath();
    }

    @NotNull
    public List<P> getPerformanceCollectors() {
        return this.performanceCollectors;
    }

    @NotNull
    public EnumC7159j1 getProfileLifecycle() {
        return this.profileLifecycle;
    }

    public Double getProfileSessionSampleRate() {
        return this.profileSessionSampleRate;
    }

    @NotNull
    public T getProfilerConverter() {
        return this.profilerConverter;
    }

    public Double getProfilesSampleRate() {
        return this.profilesSampleRate;
    }

    public l getProfilesSampler() {
        return null;
    }

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

    public String getProguardUuid() {
        return this.proguardUuid;
    }

    public m getProxy() {
        return this.proxy;
    }

    public int getReadTimeoutMillis() {
        return this.readTimeoutMillis;
    }

    public String getRelease() {
        return this.release;
    }

    @NotNull
    public InterfaceC7183p1 getReplayController() {
        return this.replayController;
    }

    public Double getSampleRate() {
        return this.sampleRate;
    }

    @NotNull
    public List<V> getScopeObservers() {
        return this.observers;
    }

    public io.sentry.protocol.r getSdkVersion() {
        return this.sdkVersion;
    }

    public String getSentryClientName() {
        return this.sentryClientName;
    }

    @NotNull
    public InterfaceC7126b0 getSerializer() {
        return this.serializer.a();
    }

    public String getServerName() {
        return this.serverName;
    }

    public long getSessionFlushTimeoutMillis() {
        return this.sessionFlushTimeoutMillis;
    }

    @NotNull
    public Y2 getSessionReplay() {
        return this.sessionReplay;
    }

    public long getSessionTrackingIntervalMillis() {
        return this.sessionTrackingIntervalMillis;
    }

    public long getShutdownTimeoutMillis() {
        return this.shutdownTimeoutMillis;
    }

    @NotNull
    public InterfaceC7130c0 getSocketTagger() {
        return this.socketTagger;
    }

    @NotNull
    public InterfaceC7138e0 getSpanFactory() {
        return this.spanFactory;
    }

    public String getSpotlightConnectionUrl() {
        return this.spotlightConnectionUrl;
    }

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

    public Double getTracesSampleRate() {
        return this.tracesSampleRate;
    }

    public o getTracesSampler() {
        return null;
    }

    @NotNull
    public InterfaceC7146g0 getTransactionProfiler() {
        return this.transactionProfiler;
    }

    @NotNull
    public InterfaceC7150h0 getTransportFactory() {
        return this.transportFactory;
    }

    @NotNull
    public io.sentry.transport.g getTransportGate() {
        return this.transportGate;
    }

    @NotNull
    public InterfaceC7154i0 getVersionDetector() {
        return this.versionDetector;
    }

    @NotNull
    public final List<io.sentry.internal.viewhierarchy.a> getViewHierarchyExporters() {
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
        Double d11;
        return this.profilesSampleRate == null && (d11 = this.profileSessionSampleRate) != null && d11.doubleValue() > 0.0d;
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

    public Boolean isGlobalHubMode() {
        return this.globalHubMode;
    }

    public boolean isPrintUncaughtStackTrace() {
        return this.printUncaughtStackTrace;
    }

    public boolean isProfilingEnabled() {
        Double d11 = this.profilesSampleRate;
        return d11 != null && d11.doubleValue() > 0.0d;
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

    void loadLazyFields() {
        getSerializer();
        retrieveParsedDsn();
        getEnvelopeReader();
        getDateProvider();
    }

    public void merge(@NotNull B b11) {
        if (b11.g() != null) {
            setDsn(b11.g());
        }
        if (b11.j() != null) {
            setEnvironment(b11.j());
        }
        if (b11.z() != null) {
            setRelease(b11.z());
        }
        if (b11.f() != null) {
            setDist(b11.f());
        }
        if (b11.C() != null) {
            setServerName(b11.C());
        }
        if (b11.y() != null) {
            setProxy(b11.y());
        }
        if (b11.i() != null) {
            setEnableUncaughtExceptionHandler(b11.i().booleanValue());
        }
        if (b11.s() != null) {
            setPrintUncaughtStackTrace(b11.s().booleanValue());
        }
        if (b11.A() != null) {
            setSampleRate(b11.A());
        }
        if (b11.I() != null) {
            setTracesSampleRate(b11.I());
        }
        if (b11.v() != null) {
            setProfilesSampleRate(b11.v());
        }
        if (b11.e() != null) {
            setDebug(b11.e().booleanValue());
        }
        if (b11.h() != null) {
            setEnableDeduplication(b11.h().booleanValue());
        }
        if (b11.B() != null) {
            setSendClientReports(b11.B().booleanValue());
        }
        if (b11.R() != null) {
            setForceInit(b11.R().booleanValue());
        }
        for (Map.Entry entry : new HashMap(b11.G()).entrySet()) {
            this.tags.put((String) entry.getKey(), (String) entry.getValue());
        }
        Iterator it = new ArrayList(b11.q()).iterator();
        while (it.hasNext()) {
            addInAppInclude((String) it.next());
        }
        Iterator it2 = new ArrayList(b11.p()).iterator();
        while (it2.hasNext()) {
            addInAppExclude((String) it2.next());
        }
        Iterator it3 = new HashSet(b11.n()).iterator();
        while (it3.hasNext()) {
            addIgnoredExceptionForType((Class) it3.next());
        }
        if (b11.H() != null) {
            setTracePropagationTargets(new ArrayList(b11.H()));
        }
        Iterator it4 = new ArrayList(b11.c()).iterator();
        while (it4.hasNext()) {
            addContextTag((String) it4.next());
        }
        if (b11.x() != null) {
            setProguardUuid(b11.x());
        }
        if (b11.k() != null) {
            setIdleTimeout(b11.k());
        }
        if (b11.E() != null) {
            setShutdownTimeoutMillis(b11.E().longValue());
        }
        if (b11.D() != null) {
            setSessionFlushTimeoutMillis(b11.D().longValue());
        }
        Iterator it5 = b11.b().iterator();
        while (it5.hasNext()) {
            addBundleId((String) it5.next());
        }
        if (b11.Q() != null) {
            setEnabled(b11.Q().booleanValue());
        }
        if (b11.O() != null) {
            setEnablePrettySerializationOutput(b11.O().booleanValue());
        }
        if (b11.U() != null) {
            setSendModules(b11.U().booleanValue());
        }
        if (b11.l() != null) {
            setIgnoredCheckIns(new ArrayList(b11.l()));
        }
        if (b11.o() != null) {
            setIgnoredTransactions(new ArrayList(b11.o()));
        }
        if (b11.m() != null) {
            setIgnoredErrors(new ArrayList(b11.m()));
        }
        if (b11.K() != null) {
            setEnableBackpressureHandling(b11.K().booleanValue());
        }
        if (b11.L() != null) {
            setEnableDatabaseTransactionTracing(b11.L().booleanValue());
        }
        if (b11.r() != null) {
            setMaxRequestBodySize(b11.r());
        }
        if (b11.T() != null) {
            setSendDefaultPii(b11.T().booleanValue());
        }
        if (b11.J() != null) {
            setCaptureOpenTelemetryEvents(b11.J().booleanValue());
        }
        if (b11.P() != null) {
            setEnableSpotlight(b11.P().booleanValue());
        }
        if (b11.F() != null) {
            setSpotlightConnectionUrl(b11.F());
        }
        if (b11.S() != null) {
            setGlobalHubMode(b11.S());
        }
        if (b11.d() != null) {
            if (getCron() == null) {
                setCron(b11.d());
            } else {
                if (b11.d().a() != null) {
                    getCron().f(b11.d().a());
                }
                if (b11.d().c() != null) {
                    getCron().h(b11.d().c());
                }
                if (b11.d().e() != null) {
                    getCron().j(b11.d().e());
                }
                if (b11.d().b() != null) {
                    getCron().g(b11.d().b());
                }
                if (b11.d().d() != null) {
                    getCron().i(b11.d().d());
                }
            }
        }
        if (b11.M() != null) {
            getLogs().c(b11.M().booleanValue());
        }
        if (b11.N() != null) {
            getMetrics().c(b11.N().booleanValue());
        }
        if (b11.u() != null) {
            setProfileSessionSampleRate(b11.u());
        }
        if (b11.w() != null) {
            setProfilingTracesDirPath(b11.w());
        }
        if (b11.t() != null) {
            setProfileLifecycle(b11.t());
        }
    }

    @NotNull
    C7211v retrieveParsedDsn() throws IllegalArgumentException {
        return this.parsedDsn.a();
    }

    public void setAttachServerName(boolean z11) {
        this.attachServerName = z11;
    }

    public void setAttachStacktrace(boolean z11) {
        this.attachStacktrace = z11;
    }

    public void setAttachThreads(boolean z11) {
        this.attachThreads = z11;
    }

    public void setBackpressureMonitor(@NotNull io.sentry.backpressure.b bVar) {
        this.backpressureMonitor = bVar;
    }

    public void setBeforeBreadcrumb(a aVar) {
        this.beforeBreadcrumb = aVar;
    }

    public void setBeforeEnvelopeCallback(b bVar) {
    }

    public void setBeforeSend(c cVar) {
        this.beforeSend = cVar;
    }

    public void setBeforeSendFeedback(c cVar) {
        this.beforeSendFeedback = cVar;
    }

    public void setBeforeSendReplay(d dVar) {
    }

    public void setBeforeSendTransaction(e eVar) {
    }

    public void setCacheDirPath(String str) {
        this.cacheDirPath = str;
    }

    public void setCaptureOpenTelemetryEvents(boolean z11) {
        this.captureOpenTelemetryEvents = z11;
    }

    public void setCompositePerformanceCollector(@NotNull InterfaceC7157j interfaceC7157j) {
        this.compositePerformanceCollector = interfaceC7157j;
    }

    public void setConnectionStatusProvider(@NotNull J j11) {
        this.connectionStatusProvider = j11;
    }

    public void setConnectionTimeoutMillis(int i11) {
        this.connectionTimeoutMillis = i11;
    }

    public void setContinuousProfiler(K k11) {
        if (this.continuousProfiler != F0.f() || k11 == null) {
            return;
        }
        this.continuousProfiler = k11;
    }

    public void setCron(f fVar) {
        this.cron = fVar;
    }

    public void setDateProvider(@NotNull U1 u12) {
        this.dateProvider.c(u12);
    }

    public void setDeadlineTimeout(long j11) {
        this.deadlineTimeout = j11;
    }

    public void setDebug(boolean z11) {
        this.debug = z11;
    }

    public void setDebugMetaLoader(io.sentry.internal.debugmeta.a aVar) {
        if (aVar == null) {
            aVar = io.sentry.internal.debugmeta.b.b();
        }
        this.debugMetaLoader = aVar;
    }

    public void setDefaultScopeType(@NotNull EnumC7225y1 enumC7225y1) {
        this.defaultScopeType = enumC7225y1;
    }

    public void setDiagnosticLevel(I2 i22) {
        if (i22 == null) {
            i22 = DEFAULT_DIAGNOSTIC_LEVEL;
        }
        this.diagnosticLevel = i22;
    }

    public void setDist(String str) {
        this.dist = str;
    }

    public void setDistinctId(String str) {
        this.distinctId = str;
    }

    public void setDistribution(@NotNull g gVar) {
        if (gVar == null) {
            gVar = new g();
        }
        this.distribution = gVar;
    }

    public void setDistributionController(L l11) {
        if (l11 == null) {
            l11 = G0.a();
        }
        this.distributionController = l11;
    }

    public void setDsn(String str) {
        this.dsn = str != null ? str.trim() : null;
        this.parsedDsn.b();
        this.dsnHash = io.sentry.util.w.a(this.dsn, this.logger);
    }

    public void setEnableAppStartProfiling(boolean z11) {
        this.enableAppStartProfiling = z11;
    }

    public void setEnableAutoSessionTracking(boolean z11) {
        this.enableAutoSessionTracking = z11;
    }

    public void setEnableBackpressureHandling(boolean z11) {
        this.enableBackpressureHandling = z11;
    }

    public void setEnableDatabaseTransactionTracing(boolean z11) {
        this.enableDatabaseTransactionTracing = z11;
    }

    public void setEnableDeduplication(boolean z11) {
        this.enableDeduplication = z11;
    }

    public void setEnableEventSizeLimiting(boolean z11) {
        this.enableEventSizeLimiting = z11;
    }

    public void setEnableExternalConfiguration(boolean z11) {
        this.enableExternalConfiguration = z11;
    }

    public void setEnablePrettySerializationOutput(boolean z11) {
        this.enablePrettySerializationOutput = z11;
    }

    public void setEnableScopePersistence(boolean z11) {
        this.enableScopePersistence = z11;
    }

    public void setEnableScreenTracking(boolean z11) {
        this.enableScreenTracking = z11;
    }

    public void setEnableShutdownHook(boolean z11) {
        this.enableShutdownHook = z11;
    }

    public void setEnableSpotlight(boolean z11) {
        this.enableSpotlight = z11;
    }

    public void setEnableTimeToFullDisplayTracing(boolean z11) {
        this.enableTimeToFullDisplayTracing = z11;
    }

    public void setEnableUncaughtExceptionHandler(boolean z11) {
        this.enableUncaughtExceptionHandler = z11;
    }

    public void setEnableUserInteractionBreadcrumbs(boolean z11) {
        this.enableUserInteractionBreadcrumbs = z11;
    }

    public void setEnableUserInteractionTracing(boolean z11) {
        this.enableUserInteractionTracing = z11;
    }

    public void setEnabled(boolean z11) {
        this.enabled = z11;
    }

    public void setEnvelopeDiskCache(io.sentry.cache.g gVar) {
        if (gVar == null) {
            gVar = io.sentry.transport.h.a();
        }
        this.envelopeDiskCache = gVar;
    }

    public void setEnvelopeReader(M m11) {
        io.sentry.util.l<M> lVar = this.envelopeReader;
        if (m11 == null) {
            m11 = H0.b();
        }
        lVar.c(m11);
    }

    public void setEnvironment(String str) {
        this.environment = str;
    }

    public void setExecutorService(@NotNull Z z11) {
        if (z11 != null) {
            this.executorService = z11;
        }
    }

    public void setFatalLogger(ILogger iLogger) {
        if (iLogger == null) {
            iLogger = J0.e();
        }
        this.fatalLogger = iLogger;
    }

    public void setFeedbackOptions(@NotNull D2 d22) {
        this.feedbackOptions = d22;
    }

    public void setFlushTimeoutMillis(long j11) {
        this.flushTimeoutMillis = j11;
    }

    public void setForceInit(boolean z11) {
        this.forceInit = z11;
    }

    public void setFullyDisplayedReporter(@NotNull D d11) {
        this.fullyDisplayedReporter = d11;
    }

    public void setGestureTargetLocators(@NotNull List<io.sentry.internal.gestures.a> list) {
        this.gestureTargetLocators.clear();
        this.gestureTargetLocators.addAll(list);
    }

    public void setGlobalHubMode(Boolean bool) {
        this.globalHubMode = bool;
    }

    public void setIdleTimeout(Long l11) {
        this.idleTimeout = l11;
    }

    public void setIgnoredCheckIns(List<String> list) {
        if (list == null) {
            this.ignoredCheckIns = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (!str.isEmpty()) {
                arrayList.add(new C(str));
            }
        }
        this.ignoredCheckIns = arrayList;
    }

    public void setIgnoredErrors(List<String> list) {
        if (list == null) {
            this.ignoredErrors = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (str != null && !str.isEmpty()) {
                arrayList.add(new C(str));
            }
        }
        this.ignoredErrors = arrayList;
    }

    public void setIgnoredSpanOrigins(List<String> list) {
        if (list == null) {
            this.ignoredSpanOrigins = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (str != null && !str.isEmpty()) {
                arrayList.add(new C(str));
            }
        }
        this.ignoredSpanOrigins = arrayList;
    }

    public void setIgnoredTransactions(List<String> list) {
        if (list == null) {
            this.ignoredTransactions = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (str != null && !str.isEmpty()) {
                arrayList.add(new C(str));
            }
        }
        this.ignoredTransactions = arrayList;
    }

    public void setInitPriority(@NotNull EnumC7158j0 enumC7158j0) {
        this.initPriority = enumC7158j0;
    }

    @Deprecated
    public void setInstrumenter(@NotNull EnumC7162k0 enumC7162k0) {
        this.instrumenter = enumC7162k0;
    }

    public void setLogger(ILogger iLogger) {
        this.logger = iLogger == null ? J0.e() : new r(this, iLogger);
    }

    public void setLogs(@NotNull h hVar) {
        this.logs = hVar;
    }

    public void setMaxAttachmentSize(long j11) {
        this.maxAttachmentSize = j11;
    }

    public void setMaxBreadcrumbs(int i11) {
        this.maxBreadcrumbs = i11;
    }

    public void setMaxCacheItems(int i11) {
        this.maxCacheItems = i11;
    }

    public void setMaxDepth(int i11) {
        this.maxDepth = i11;
    }

    public void setMaxFeatureFlags(int i11) {
        this.maxFeatureFlags = i11;
    }

    public void setMaxQueueSize(int i11) {
        if (i11 > 0) {
            this.maxQueueSize = i11;
        }
    }

    public void setMaxRequestBodySize(@NotNull n nVar) {
        this.maxRequestBodySize = nVar;
    }

    public void setMaxSpans(int i11) {
        this.maxSpans = i11;
    }

    public void setMaxTraceFileSize(long j11) {
        this.maxTraceFileSize = j11;
    }

    public void setMetrics(@NotNull i iVar) {
        this.metrics = iVar;
    }

    public void setModulesLoader(io.sentry.internal.modules.b bVar) {
        if (bVar == null) {
            bVar = io.sentry.internal.modules.e.b();
        }
        this.modulesLoader = bVar;
    }

    public void setOnDiscard(j jVar) {
    }

    public void setOnOversizedEvent(k kVar) {
    }

    public void setOpenTelemetryMode(@NotNull U2 u22) {
        this.openTelemetryMode = u22;
    }

    public void setPrintUncaughtStackTrace(boolean z11) {
        this.printUncaughtStackTrace = z11;
    }

    public void setProfileLifecycle(@NotNull EnumC7159j1 enumC7159j1) {
        this.profileLifecycle = enumC7159j1;
        if (enumC7159j1 != EnumC7159j1.TRACE || isTracingEnabled()) {
            return;
        }
        this.logger.c(I2.WARNING, "Profiling lifecycle is set to TRACE but tracing is disabled. Profiling will not be started automatically.", new Object[0]);
    }

    public void setProfileSessionSampleRate(Double d11) {
        if (io.sentry.util.t.c(d11)) {
            this.profileSessionSampleRate = d11;
            return;
        }
        throw new IllegalArgumentException("The value " + d11 + " is not valid. Use values between 0.0 and 1.0.");
    }

    public void setProfilerConverter(@NotNull T t2) {
        this.profilerConverter = t2;
    }

    public void setProfilesSampleRate(Double d11) {
        if (io.sentry.util.t.d(d11)) {
            this.profilesSampleRate = d11;
            return;
        }
        throw new IllegalArgumentException("The value " + d11 + " is not valid. Use null to disable or values between 0.0 and 1.0.");
    }

    public void setProfilesSampler(l lVar) {
    }

    public void setProfilingTracesDirPath(String str) {
        this.profilingTracesDirPath = str;
    }

    public void setProfilingTracesHz(int i11) {
        this.profilingTracesHz = i11;
    }

    public void setProguardUuid(String str) {
        this.proguardUuid = str;
    }

    public void setPropagateTraceparent(boolean z11) {
        this.propagateTraceparent = z11;
    }

    public void setProxy(m mVar) {
        this.proxy = mVar;
    }

    public void setReadTimeoutMillis(int i11) {
        this.readTimeoutMillis = i11;
    }

    public void setRelease(String str) {
        this.release = str;
    }

    public void setReplayController(InterfaceC7183p1 interfaceC7183p1) {
        if (interfaceC7183p1 == null) {
            interfaceC7183p1 = M0.a();
        }
        this.replayController = interfaceC7183p1;
    }

    public void setSampleRate(Double d11) {
        if (io.sentry.util.t.f(d11)) {
            this.sampleRate = d11;
            return;
        }
        throw new IllegalArgumentException("The value " + d11 + " is not valid. Use null to disable or values >= 0.0 and <= 1.0.");
    }

    public void setSdkVersion(io.sentry.protocol.r rVar) {
        io.sentry.protocol.r q11 = getSessionReplay().q();
        io.sentry.protocol.r rVar2 = this.sdkVersion;
        if (rVar2 != null && q11 != null && rVar2.equals(q11)) {
            getSessionReplay().H(rVar);
        }
        this.sdkVersion = rVar;
    }

    public void setSendClientReports(boolean z11) {
        this.sendClientReports = z11;
        if (z11) {
            this.clientReportRecorder = new io.sentry.clientreport.e(this);
        } else {
            this.clientReportRecorder = new io.sentry.clientreport.j();
        }
    }

    public void setSendDefaultPii(boolean z11) {
        this.sendDefaultPii = z11;
    }

    public void setSendModules(boolean z11) {
        this.sendModules = z11;
    }

    public void setSentryClientName(String str) {
        this.sentryClientName = str;
    }

    public void setSerializer(InterfaceC7126b0 interfaceC7126b0) {
        io.sentry.util.l<InterfaceC7126b0> lVar = this.serializer;
        if (interfaceC7126b0 == null) {
            interfaceC7126b0 = U0.f();
        }
        lVar.c(interfaceC7126b0);
    }

    public void setServerName(String str) {
        this.serverName = str;
    }

    public void setSessionFlushTimeoutMillis(long j11) {
        this.sessionFlushTimeoutMillis = j11;
    }

    public void setSessionReplay(@NotNull Y2 y22) {
        this.sessionReplay = y22;
    }

    public void setSessionTrackingIntervalMillis(long j11) {
        this.sessionTrackingIntervalMillis = j11;
    }

    public void setShutdownTimeoutMillis(long j11) {
        this.shutdownTimeoutMillis = j11;
    }

    public void setSocketTagger(InterfaceC7130c0 interfaceC7130c0) {
        if (interfaceC7130c0 == null) {
            interfaceC7130c0 = V0.c();
        }
        this.socketTagger = interfaceC7130c0;
    }

    public void setSpanFactory(@NotNull InterfaceC7138e0 interfaceC7138e0) {
        this.spanFactory = interfaceC7138e0;
    }

    public void setSpotlightConnectionUrl(String str) {
        this.spotlightConnectionUrl = str;
    }

    public void setSslSocketFactory(SSLSocketFactory sSLSocketFactory) {
        this.sslSocketFactory = sSLSocketFactory;
    }

    public void setStartProfilerOnAppStart(boolean z11) {
        this.startProfilerOnAppStart = z11;
    }

    public void setTag(String str, String str2) {
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

    public void setTraceOptionsRequests(boolean z11) {
        this.traceOptionsRequests = z11;
    }

    public void setTracePropagationTargets(List<String> list) {
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
    public void setTraceSampling(boolean z11) {
        this.traceSampling = z11;
    }

    public void setTracesSampleRate(Double d11) {
        if (io.sentry.util.t.g(d11)) {
            this.tracesSampleRate = d11;
            return;
        }
        throw new IllegalArgumentException("The value " + d11 + " is not valid. Use null to disable or values between 0.0 and 1.0.");
    }

    public void setTracesSampler(o oVar) {
    }

    public void setTransactionProfiler(InterfaceC7146g0 interfaceC7146g0) {
        if (this.transactionProfiler != Z0.d() || interfaceC7146g0 == null) {
            return;
        }
        this.transactionProfiler = interfaceC7146g0;
    }

    public void setTransportFactory(InterfaceC7150h0 interfaceC7150h0) {
        if (interfaceC7150h0 == null) {
            interfaceC7150h0 = C7098a1.b();
        }
        this.transportFactory = interfaceC7150h0;
    }

    public void setTransportGate(io.sentry.transport.g gVar) {
        if (gVar == null) {
            gVar = io.sentry.transport.j.a();
        }
        this.transportGate = gVar;
    }

    public void setVersionDetector(@NotNull InterfaceC7154i0 interfaceC7154i0) {
        this.versionDetector = interfaceC7154i0;
    }

    public void setViewHierarchyExporters(@NotNull List<io.sentry.internal.viewhierarchy.a> list) {
        this.viewHierarchyExporters.clear();
        this.viewHierarchyExporters.addAll(list);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0261  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private W2(boolean z11) {
        InterfaceC7138e0 c7181p;
        Class c11;
        Object newInstance;
        this.eventProcessors = new CopyOnWriteArrayList();
        this.ignoredExceptionsForType = new CopyOnWriteArraySet();
        this.ignoredErrors = null;
        this.integrations = new CopyOnWriteArrayList();
        this.bundleIds = new CopyOnWriteArraySet();
        this.parsedDsn = new io.sentry.util.l<>(new I8.a(this));
        this.shutdownTimeoutMillis = 2000L;
        this.flushTimeoutMillis = 15000L;
        this.sessionFlushTimeoutMillis = 15000L;
        this.logger = J0.e();
        this.fatalLogger = J0.e();
        this.diagnosticLevel = DEFAULT_DIAGNOSTIC_LEVEL;
        this.serializer = new io.sentry.util.l<>(new V2(this, 0));
        this.envelopeReader = new io.sentry.util.l<>(new com.google.firebase.messaging.b0(this));
        this.maxDepth = 100;
        this.maxCacheItems = 30;
        this.maxQueueSize = 30;
        this.maxBreadcrumbs = 100;
        this.maxFeatureFlags = 100;
        this.inAppExcludes = new CopyOnWriteArrayList();
        this.inAppIncludes = new CopyOnWriteArrayList();
        this.transportFactory = C7098a1.b();
        this.transportGate = io.sentry.transport.j.a();
        this.attachStacktrace = true;
        this.enableAutoSessionTracking = true;
        this.sessionTrackingIntervalMillis = 30000L;
        this.attachServerName = true;
        this.enableUncaughtExceptionHandler = true;
        this.printUncaughtStackTrace = false;
        this.executorService = T0.d();
        this.spotlightIntegrationLoaded = new AtomicBoolean(false);
        this.connectionTimeoutMillis = 30000;
        this.readTimeoutMillis = 30000;
        this.envelopeDiskCache = io.sentry.transport.h.a();
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
        this.transactionProfiler = Z0.d();
        this.continuousProfiler = F0.f();
        this.profilerConverter = K0.a();
        this.tracePropagationTargets = null;
        this.defaultTracePropagationTargets = Collections.singletonList(DEFAULT_PROPAGATION_TARGETS);
        this.propagateTraceparent = false;
        this.idleTimeout = 3000L;
        this.contextTags = new CopyOnWriteArrayList();
        this.sendClientReports = true;
        this.clientReportRecorder = new io.sentry.clientreport.e(this);
        this.modulesLoader = io.sentry.internal.modules.e.b();
        this.debugMetaLoader = io.sentry.internal.debugmeta.b.b();
        this.enableUserInteractionTracing = false;
        this.enableUserInteractionBreadcrumbs = true;
        this.instrumenter = EnumC7162k0.SENTRY;
        this.gestureTargetLocators = new ArrayList();
        this.viewHierarchyExporters = new ArrayList();
        this.threadChecker = io.sentry.util.thread.b.d();
        this.traceOptionsRequests = true;
        this.enableDatabaseTransactionTracing = false;
        this.dateProvider = new io.sentry.util.l<>(new C2438a());
        this.performanceCollectors = new ArrayList();
        this.compositePerformanceCollector = D0.g();
        this.enableTimeToFullDisplayTracing = false;
        this.fullyDisplayedReporter = D.a();
        this.connectionStatusProvider = new E0();
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
        this.spanFactory = X0.b();
        this.profilingTracesHz = 101;
        this.cron = null;
        this.replayController = M0.a();
        this.distributionController = G0.a();
        this.enableScreenTracking = true;
        this.defaultScopeType = EnumC7225y1.ISOLATION;
        this.initPriority = EnumC7158j0.MEDIUM;
        this.forceInit = false;
        this.globalHubMode = null;
        this.lock = new io.sentry.util.a();
        this.openTelemetryMode = U2.AUTO;
        this.captureOpenTelemetryEvents = false;
        this.versionDetector = C7127b1.b();
        this.profileLifecycle = EnumC7159j1.MANUAL;
        this.startProfilerOnAppStart = false;
        this.deadlineTimeout = 30000L;
        this.logs = new h();
        this.metrics = new i();
        this.socketTagger = V0.c();
        this.distribution = new g();
        io.sentry.protocol.r createSdkVersion = createSdkVersion();
        this.experimental = new A();
        this.sessionReplay = new Y2(z11, createSdkVersion);
        this.feedbackOptions = new D2();
        if (z11) {
            return;
        }
        J0 e11 = J0.e();
        if (io.sentry.util.r.c() && io.sentry.util.m.b("io.sentry.opentelemetry.OtelSpanFactory", e11) && (c11 = io.sentry.util.m.c("io.sentry.opentelemetry.OtelSpanFactory", e11)) != null) {
            try {
                newInstance = c11.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused) {
            }
            if (newInstance != null && (newInstance instanceof InterfaceC7138e0)) {
                c7181p = (InterfaceC7138e0) newInstance;
                setSpanFactory(c7181p);
                this.integrations.add(new UncaughtExceptionHandlerIntegration());
                this.integrations.add(new ShutdownHookIntegration());
                this.eventProcessors.add(new C7228z0(this));
                this.eventProcessors.add(new C7215w(this));
                if (io.sentry.util.r.c()) {
                    this.eventProcessors.add(new Z2());
                }
                setSentryClientName("sentry.java/8.34.1");
                setSdkVersion(createSdkVersion);
                addPackageInfo();
            }
        }
        c7181p = new C7181p();
        setSpanFactory(c7181p);
        this.integrations.add(new UncaughtExceptionHandlerIntegration());
        this.integrations.add(new ShutdownHookIntegration());
        this.eventProcessors.add(new C7228z0(this));
        this.eventProcessors.add(new C7215w(this));
        if (io.sentry.util.r.c()) {
        }
        setSentryClientName("sentry.java/8.34.1");
        setSdkVersion(createSdkVersion);
        addPackageInfo();
    }
}
