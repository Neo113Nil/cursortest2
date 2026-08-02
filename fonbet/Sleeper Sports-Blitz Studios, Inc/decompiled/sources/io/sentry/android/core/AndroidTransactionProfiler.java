package io.sentry.android.core;

import android.content.Context;
import android.os.Build;
import com.facebook.appevents.AppEventsConstants;
import io.sentry.DateUtils;
import io.sentry.ILogger;
import io.sentry.ISentryExecutorService;
import io.sentry.ISentryLifecycleToken;
import io.sentry.ITransaction;
import io.sentry.ITransactionProfiler;
import io.sentry.PerformanceCollectionData;
import io.sentry.ProfilingTraceData;
import io.sentry.ProfilingTransactionData;
import io.sentry.ScopesAdapter;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.android.core.AndroidProfiler;
import io.sentry.android.core.internal.util.CpuInfoUtils;
import io.sentry.android.core.internal.util.SentryFrameMetricsCollector;
import io.sentry.util.AutoClosableReentrantLock;
import io.sentry.util.LazyEvaluator;
import io.sentry.util.Objects;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes9.dex */
final class AndroidTransactionProfiler implements ITransactionProfiler {
    private final BuildInfoProvider buildInfoProvider;
    private final Context context;
    private volatile ProfilingTransactionData currentProfilingTransactionData;
    private final LazyEvaluator.Evaluator<ISentryExecutorService> executorServiceSupplier;
    private final SentryFrameMetricsCollector frameMetricsCollector;
    private boolean isInitialized;
    private final boolean isProfilingEnabled;
    private final AtomicBoolean isRunning;
    private final AutoClosableReentrantLock lock;
    private final ILogger logger;
    private long profileStartCpuMillis;
    private long profileStartNanos;
    private Date profileStartTimestamp;
    private volatile AndroidProfiler profiler;
    private final String profilingTracesDirPath;
    private final int profilingTracesHz;

    static /* synthetic */ ISentryExecutorService lambda$new$1(ISentryExecutorService iSentryExecutorService) {
        return iSentryExecutorService;
    }

    public AndroidTransactionProfiler(Context context, final SentryAndroidOptions sentryAndroidOptions, BuildInfoProvider buildInfoProvider, SentryFrameMetricsCollector sentryFrameMetricsCollector) {
        this(context, buildInfoProvider, sentryFrameMetricsCollector, sentryAndroidOptions.getLogger(), sentryAndroidOptions.getProfilingTracesDirPath(), sentryAndroidOptions.isProfilingEnabled(), sentryAndroidOptions.getProfilingTracesHz(), (LazyEvaluator.Evaluator<ISentryExecutorService>) new LazyEvaluator.Evaluator() { // from class: io.sentry.android.core.AndroidTransactionProfiler$$ExternalSyntheticLambda0
            @Override // io.sentry.util.LazyEvaluator.Evaluator
            public final Object evaluate() {
                ISentryExecutorService executorService;
                executorService = SentryAndroidOptions.this.getExecutorService();
                return executorService;
            }
        });
    }

    public AndroidTransactionProfiler(Context context, BuildInfoProvider buildInfoProvider, SentryFrameMetricsCollector sentryFrameMetricsCollector, ILogger iLogger, String str, boolean z, int i, final ISentryExecutorService iSentryExecutorService) {
        this(context, buildInfoProvider, sentryFrameMetricsCollector, iLogger, str, z, i, (LazyEvaluator.Evaluator<ISentryExecutorService>) new LazyEvaluator.Evaluator() { // from class: io.sentry.android.core.AndroidTransactionProfiler$$ExternalSyntheticLambda2
            @Override // io.sentry.util.LazyEvaluator.Evaluator
            public final Object evaluate() {
                return AndroidTransactionProfiler.lambda$new$1(ISentryExecutorService.this);
            }
        });
    }

    public AndroidTransactionProfiler(Context context, BuildInfoProvider buildInfoProvider, SentryFrameMetricsCollector sentryFrameMetricsCollector, ILogger iLogger, String str, boolean z, int i, LazyEvaluator.Evaluator<ISentryExecutorService> evaluator) {
        this.isInitialized = false;
        this.isRunning = new AtomicBoolean(false);
        this.profiler = null;
        this.lock = new AutoClosableReentrantLock();
        this.context = (Context) Objects.requireNonNull(ContextUtils.getApplicationContext(context), "The application context is required");
        this.logger = (ILogger) Objects.requireNonNull(iLogger, "ILogger is required");
        this.frameMetricsCollector = (SentryFrameMetricsCollector) Objects.requireNonNull(sentryFrameMetricsCollector, "SentryFrameMetricsCollector is required");
        this.buildInfoProvider = (BuildInfoProvider) Objects.requireNonNull(buildInfoProvider, "The BuildInfoProvider is required.");
        this.profilingTracesDirPath = str;
        this.isProfilingEnabled = z;
        this.profilingTracesHz = i;
        this.executorServiceSupplier = (LazyEvaluator.Evaluator) Objects.requireNonNull(evaluator, "A supplier for ISentryExecutorService is required.");
        this.profileStartTimestamp = DateUtils.getCurrentDateTime();
    }

    private void init() {
        if (this.isInitialized) {
            return;
        }
        this.isInitialized = true;
        if (!this.isProfilingEnabled) {
            this.logger.log(SentryLevel.INFO, "Profiling is disabled in options.", new Object[0]);
            return;
        }
        if (this.profilingTracesDirPath == null) {
            this.logger.log(SentryLevel.WARNING, "Disabling profiling because no profiling traces dir path is defined in options.", new Object[0]);
        } else if (this.profilingTracesHz <= 0) {
            this.logger.log(SentryLevel.WARNING, "Disabling profiling because trace rate is set to %d", Integer.valueOf(this.profilingTracesHz));
        } else {
            this.profiler = new AndroidProfiler(this.profilingTracesDirPath, ((int) TimeUnit.SECONDS.toMicros(1L)) / this.profilingTracesHz, this.frameMetricsCollector, this.executorServiceSupplier, this.logger);
        }
    }

    @Override // io.sentry.ITransactionProfiler
    public void start() {
        if (this.buildInfoProvider.getSdkInfoVersion() >= 22 && !this.isRunning.getAndSet(true)) {
            init();
            if (onFirstStart()) {
                this.logger.log(SentryLevel.DEBUG, "Profiler started.", new Object[0]);
                return;
            }
            if (this.profiler != null && this.profiler.isRunning()) {
                this.logger.log(SentryLevel.WARNING, "A profile is already running. This profile will be ignored.", new Object[0]);
                return;
            }
            ISentryLifecycleToken acquire = this.lock.acquire();
            try {
                this.currentProfilingTransactionData = null;
                if (acquire != null) {
                    acquire.close();
                }
                this.isRunning.set(false);
            } catch (Throwable th) {
                if (acquire != null) {
                    try {
                        acquire.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
    }

    private boolean onFirstStart() {
        AndroidProfiler.ProfileStartData start;
        if (this.profiler == null || (start = this.profiler.start()) == null) {
            return false;
        }
        this.profileStartNanos = start.startNanos;
        this.profileStartCpuMillis = start.startCpuMillis;
        this.profileStartTimestamp = start.startTimestamp;
        return true;
    }

    @Override // io.sentry.ITransactionProfiler
    public void bindTransaction(ITransaction iTransaction) {
        if (this.isRunning.get() && this.currentProfilingTransactionData == null) {
            ISentryLifecycleToken acquire = this.lock.acquire();
            try {
                if (this.isRunning.get() && this.currentProfilingTransactionData == null) {
                    this.currentProfilingTransactionData = new ProfilingTransactionData(iTransaction, Long.valueOf(this.profileStartNanos), Long.valueOf(this.profileStartCpuMillis));
                }
                if (acquire != null) {
                    acquire.close();
                }
            } catch (Throwable th) {
                if (acquire != null) {
                    try {
                        acquire.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
    }

    @Override // io.sentry.ITransactionProfiler
    public ProfilingTraceData onTransactionFinish(ITransaction iTransaction, List<PerformanceCollectionData> list, SentryOptions sentryOptions) {
        return onTransactionFinish(iTransaction.getName(), iTransaction.getEventId().toString(), iTransaction.getSpanContext().getTraceId().toString(), false, list, sentryOptions);
    }

    private ProfilingTraceData onTransactionFinish(String str, String str2, String str3, boolean z, List<PerformanceCollectionData> list, SentryOptions sentryOptions) {
        String str4;
        String str5;
        if (this.buildInfoProvider.getSdkInfoVersion() < 22 || this.profiler == null) {
            return null;
        }
        ISentryLifecycleToken acquire = this.lock.acquire();
        try {
            ProfilingTransactionData profilingTransactionData = this.currentProfilingTransactionData;
            if (profilingTransactionData != null && profilingTransactionData.getId().equals(str2)) {
                this.currentProfilingTransactionData = null;
                if (acquire != null) {
                    acquire.close();
                }
                this.logger.log(SentryLevel.DEBUG, "Transaction %s (%s) finished.", str, str3);
                AndroidProfiler.ProfileEndData endAndCollect = this.profiler.endAndCollect(false, list);
                this.isRunning.set(false);
                if (endAndCollect == null) {
                    return null;
                }
                long j = endAndCollect.endNanos - this.profileStartNanos;
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(profilingTransactionData);
                profilingTransactionData.notifyFinish(Long.valueOf(endAndCollect.endNanos), Long.valueOf(this.profileStartNanos), Long.valueOf(endAndCollect.endCpuMillis), Long.valueOf(this.profileStartCpuMillis));
                Long totalMemory = sentryOptions instanceof SentryAndroidOptions ? DeviceInfoUtil.getInstance(this.context, (SentryAndroidOptions) sentryOptions).getTotalMemory() : null;
                if (totalMemory == null) {
                    str4 = AppEventsConstants.EVENT_PARAM_VALUE_NO;
                } else {
                    str4 = Long.toString(totalMemory.longValue());
                }
                String str6 = str4;
                String[] strArr = Build.SUPPORTED_ABIS;
                File file = endAndCollect.traceFile;
                Date date = this.profileStartTimestamp;
                String l = Long.toString(j);
                int sdkInfoVersion = this.buildInfoProvider.getSdkInfoVersion();
                String str7 = (strArr == null || strArr.length <= 0) ? "" : strArr[0];
                Callable callable = new Callable() { // from class: io.sentry.android.core.AndroidTransactionProfiler$$ExternalSyntheticLambda1
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        List readMaxFrequencies;
                        readMaxFrequencies = CpuInfoUtils.getInstance().readMaxFrequencies();
                        return readMaxFrequencies;
                    }
                };
                String manufacturer = this.buildInfoProvider.getManufacturer();
                String model = this.buildInfoProvider.getModel();
                String versionRelease = this.buildInfoProvider.getVersionRelease();
                Boolean isEmulator = this.buildInfoProvider.isEmulator();
                String proguardUuid = sentryOptions.getProguardUuid();
                String release = sentryOptions.getRelease();
                String environment = sentryOptions.getEnvironment();
                if (endAndCollect.didTimeout || z) {
                    str5 = "timeout";
                } else {
                    str5 = ProfilingTraceData.TRUNCATION_REASON_NORMAL;
                }
                return new ProfilingTraceData(file, date, arrayList, str, str2, str3, l, sdkInfoVersion, str7, callable, manufacturer, model, versionRelease, isEmulator, str6, proguardUuid, release, environment, str5, endAndCollect.measurementsMap);
            }
            this.logger.log(SentryLevel.INFO, "Transaction %s (%s) finished, but was not currently being profiled. Skipping", str, str3);
            if (acquire != null) {
                acquire.close();
            }
            return null;
        } finally {
        }
    }

    @Override // io.sentry.ITransactionProfiler
    public boolean isRunning() {
        return this.isRunning.get();
    }

    @Override // io.sentry.ITransactionProfiler
    public void close() {
        AndroidTransactionProfiler androidTransactionProfiler;
        ProfilingTransactionData profilingTransactionData = this.currentProfilingTransactionData;
        if (profilingTransactionData != null) {
            androidTransactionProfiler = this;
            androidTransactionProfiler.onTransactionFinish(profilingTransactionData.getName(), profilingTransactionData.getId(), profilingTransactionData.getTraceId(), true, null, ScopesAdapter.getInstance().getOptions());
        } else {
            androidTransactionProfiler = this;
        }
        androidTransactionProfiler.isRunning.set(false);
        if (androidTransactionProfiler.profiler != null) {
            androidTransactionProfiler.profiler.close();
        }
    }
}
