package io.sentry.android.core;

import android.app.Application;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.os.Process;
import android.os.SystemClock;
import io.sentry.IContinuousProfiler;
import io.sentry.ILogger;
import io.sentry.ISentryExecutorService;
import io.sentry.ISentryLifecycleToken;
import io.sentry.ITransactionProfiler;
import io.sentry.JsonSerializer;
import io.sentry.Sentry;
import io.sentry.SentryAppStartProfilingOptions;
import io.sentry.SentryExecutorService;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.TracesSampler;
import io.sentry.TracesSamplingDecision;
import io.sentry.android.core.internal.util.AndroidRuntimeManager;
import io.sentry.android.core.internal.util.SentryFrameMetricsCollector;
import io.sentry.android.core.performance.AppStartMetrics;
import io.sentry.util.AutoClosableReentrantLock;
import io.sentry.util.LazyEvaluator;
import io.sentry.util.runtime.IRuntimeManager;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

/* loaded from: classes9.dex */
public final class SentryPerformanceProvider extends EmptySecureContentProvider {
    private static final long sdkInitMillis = SystemClock.uptimeMillis();
    private Application app;
    private final BuildInfoProvider buildInfoProvider;
    private final AutoClosableReentrantLock lock = new AutoClosableReentrantLock();
    private final ILogger logger;

    static /* synthetic */ ISentryExecutorService lambda$createAndStartContinuousProfiler$1(SentryExecutorService sentryExecutorService) {
        return sentryExecutorService;
    }

    static /* synthetic */ ISentryExecutorService lambda$createAndStartTransactionProfiler$2(SentryExecutorService sentryExecutorService) {
        return sentryExecutorService;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return null;
    }

    SentryPerformanceProvider(ILogger iLogger, BuildInfoProvider buildInfoProvider) {
        this.logger = iLogger;
        this.buildInfoProvider = buildInfoProvider;
    }

    public SentryPerformanceProvider() {
        AndroidLogger androidLogger = new AndroidLogger();
        this.logger = androidLogger;
        this.buildInfoProvider = new BuildInfoProvider(androidLogger);
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        AppStartMetrics appStartMetrics = AppStartMetrics.getInstance();
        onAppLaunched(getContext(), appStartMetrics);
        launchAppStartProfiler(appStartMetrics);
        return true;
    }

    @Override // android.content.ContentProvider
    public void attachInfo(Context context, ProviderInfo providerInfo) {
        if (SentryPerformanceProvider.class.getName().equals(providerInfo.authority)) {
            throw new IllegalStateException("An applicationId is required to fulfill the manifest placeholder.");
        }
        super.attachInfo(context, providerInfo);
    }

    @Override // android.content.ContentProvider
    public void shutdown() {
        ISentryLifecycleToken acquire = AppStartMetrics.staticLock.acquire();
        try {
            ITransactionProfiler appStartProfiler = AppStartMetrics.getInstance().getAppStartProfiler();
            if (appStartProfiler != null) {
                appStartProfiler.close();
            }
            IContinuousProfiler appStartContinuousProfiler = AppStartMetrics.getInstance().getAppStartContinuousProfiler();
            if (appStartContinuousProfiler != null) {
                appStartContinuousProfiler.close(true);
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

    private void launchAppStartProfiler(AppStartMetrics appStartMetrics) {
        final Context context = getContext();
        if (context == null) {
            this.logger.log(SentryLevel.FATAL, "App. Context from ContentProvider is null", new Object[0]);
            return;
        }
        File file = new File((File) new AndroidRuntimeManager().runWithRelaxedPolicy(new IRuntimeManager.IRuntimeManagerCallback() { // from class: io.sentry.android.core.SentryPerformanceProvider$$ExternalSyntheticLambda2
            @Override // io.sentry.util.runtime.IRuntimeManager.IRuntimeManagerCallback
            public final Object run() {
                File cacheDir;
                cacheDir = AndroidOptionsInitializer.getCacheDir(context);
                return cacheDir;
            }
        }), Sentry.APP_START_PROFILING_CONFIG_FILE_NAME);
        if (file.exists() && file.canRead()) {
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
                try {
                    SentryAppStartProfilingOptions sentryAppStartProfilingOptions = (SentryAppStartProfilingOptions) new JsonSerializer(SentryOptions.empty()).deserialize(bufferedReader, SentryAppStartProfilingOptions.class);
                    if (sentryAppStartProfilingOptions == null) {
                        this.logger.log(SentryLevel.WARNING, "Unable to deserialize the SentryAppStartProfilingOptions. App start profiling will not start.", new Object[0]);
                    } else if (sentryAppStartProfilingOptions.isContinuousProfilingEnabled() && sentryAppStartProfilingOptions.isStartProfilerOnAppStart()) {
                        createAndStartContinuousProfiler(context, sentryAppStartProfilingOptions, appStartMetrics);
                    } else if (!sentryAppStartProfilingOptions.isProfilingEnabled()) {
                        this.logger.log(SentryLevel.INFO, "Profiling is not enabled. App start profiling will not start.", new Object[0]);
                    } else if (sentryAppStartProfilingOptions.isEnableAppStartProfiling()) {
                        createAndStartTransactionProfiler(context, sentryAppStartProfilingOptions, appStartMetrics);
                    }
                    bufferedReader.close();
                } catch (Throwable th) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (FileNotFoundException e) {
                this.logger.log(SentryLevel.ERROR, "App start profiling config file not found. ", e);
            } catch (Throwable th3) {
                this.logger.log(SentryLevel.ERROR, "Error reading app start profiling config file. ", th3);
            }
        }
    }

    private void createAndStartContinuousProfiler(Context context, SentryAppStartProfilingOptions sentryAppStartProfilingOptions, AppStartMetrics appStartMetrics) {
        if (!sentryAppStartProfilingOptions.isContinuousProfileSampled()) {
            this.logger.log(SentryLevel.DEBUG, "App start profiling was not sampled. It will not start.", new Object[0]);
            return;
        }
        final SentryExecutorService sentryExecutorService = new SentryExecutorService();
        AndroidContinuousProfiler androidContinuousProfiler = new AndroidContinuousProfiler(this.buildInfoProvider, new SentryFrameMetricsCollector(context.getApplicationContext(), this.logger, this.buildInfoProvider), this.logger, sentryAppStartProfilingOptions.getProfilingTracesDirPath(), sentryAppStartProfilingOptions.getProfilingTracesHz(), new LazyEvaluator.Evaluator() { // from class: io.sentry.android.core.SentryPerformanceProvider$$ExternalSyntheticLambda1
            @Override // io.sentry.util.LazyEvaluator.Evaluator
            public final Object evaluate() {
                return SentryPerformanceProvider.lambda$createAndStartContinuousProfiler$1(SentryExecutorService.this);
            }
        });
        appStartMetrics.setAppStartProfiler(null);
        appStartMetrics.setAppStartContinuousProfiler(androidContinuousProfiler);
        this.logger.log(SentryLevel.DEBUG, "App start continuous profiling started.", new Object[0]);
        SentryOptions empty = SentryOptions.empty();
        empty.setProfileSessionSampleRate(Double.valueOf(sentryAppStartProfilingOptions.isContinuousProfileSampled() ? 1.0d : 0.0d));
        androidContinuousProfiler.startProfiler(sentryAppStartProfilingOptions.getProfileLifecycle(), new TracesSampler(empty));
    }

    private void createAndStartTransactionProfiler(Context context, SentryAppStartProfilingOptions sentryAppStartProfilingOptions, AppStartMetrics appStartMetrics) {
        TracesSamplingDecision tracesSamplingDecision = new TracesSamplingDecision(Boolean.valueOf(sentryAppStartProfilingOptions.isTraceSampled()), sentryAppStartProfilingOptions.getTraceSampleRate(), Boolean.valueOf(sentryAppStartProfilingOptions.isProfileSampled()), sentryAppStartProfilingOptions.getProfileSampleRate());
        appStartMetrics.setAppStartSamplingDecision(tracesSamplingDecision);
        if (!tracesSamplingDecision.getProfileSampled().booleanValue() || !tracesSamplingDecision.getSampled().booleanValue()) {
            this.logger.log(SentryLevel.DEBUG, "App start profiling was not sampled. It will not start.", new Object[0]);
            return;
        }
        final SentryExecutorService sentryExecutorService = new SentryExecutorService();
        AndroidTransactionProfiler androidTransactionProfiler = new AndroidTransactionProfiler(context, this.buildInfoProvider, new SentryFrameMetricsCollector(context, this.logger, this.buildInfoProvider), this.logger, sentryAppStartProfilingOptions.getProfilingTracesDirPath(), sentryAppStartProfilingOptions.isProfilingEnabled(), sentryAppStartProfilingOptions.getProfilingTracesHz(), (LazyEvaluator.Evaluator<ISentryExecutorService>) new LazyEvaluator.Evaluator() { // from class: io.sentry.android.core.SentryPerformanceProvider$$ExternalSyntheticLambda0
            @Override // io.sentry.util.LazyEvaluator.Evaluator
            public final Object evaluate() {
                return SentryPerformanceProvider.lambda$createAndStartTransactionProfiler$2(SentryExecutorService.this);
            }
        });
        appStartMetrics.setAppStartContinuousProfiler(null);
        appStartMetrics.setAppStartProfiler(androidTransactionProfiler);
        this.logger.log(SentryLevel.DEBUG, "App start profiling started.", new Object[0]);
        androidTransactionProfiler.start();
    }

    private void onAppLaunched(Context context, AppStartMetrics appStartMetrics) {
        appStartMetrics.getSdkInitTimeSpan().setStartedAt(sdkInitMillis);
        if (this.buildInfoProvider.getSdkInfoVersion() >= 24) {
            appStartMetrics.getAppStartTimeSpan().setStartedAt(Process.getStartUptimeMillis());
        }
        if (context instanceof Application) {
            this.app = (Application) context;
        }
        Application application = this.app;
        if (application == null) {
            return;
        }
        appStartMetrics.registerLifecycleCallbacks(application);
    }
}
