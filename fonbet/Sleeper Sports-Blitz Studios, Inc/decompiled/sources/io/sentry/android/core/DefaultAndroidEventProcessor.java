package io.sentry.android.core;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import io.sentry.DateUtils;
import io.sentry.EventProcessor;
import io.sentry.Hint;
import io.sentry.IpAddressUtils;
import io.sentry.NoOpLogger;
import io.sentry.SentryAttributeType;
import io.sentry.SentryBaseEvent;
import io.sentry.SentryEvent;
import io.sentry.SentryLevel;
import io.sentry.SentryLogEvent;
import io.sentry.SentryLogEventAttributeValue;
import io.sentry.SentryMetricsEvent;
import io.sentry.SentryReplayEvent;
import io.sentry.android.core.ContextUtils;
import io.sentry.android.core.internal.util.AndroidThreadChecker;
import io.sentry.android.core.performance.AppStartMetrics;
import io.sentry.android.core.performance.TimeSpan;
import io.sentry.protocol.App;
import io.sentry.protocol.OperatingSystem;
import io.sentry.protocol.SentryException;
import io.sentry.protocol.SentryStackFrame;
import io.sentry.protocol.SentryStackTrace;
import io.sentry.protocol.SentryThread;
import io.sentry.protocol.SentryTransaction;
import io.sentry.protocol.User;
import io.sentry.util.HintUtils;
import io.sentry.util.LazyEvaluator;
import io.sentry.util.Objects;
import io.sentry.util.runtime.IRuntimeManager;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes9.dex */
final class DefaultAndroidEventProcessor implements EventProcessor {
    private final BuildInfoProvider buildInfoProvider;
    final Context context;
    private final LazyEvaluator<String> deviceFamily = new LazyEvaluator<>(new LazyEvaluator.Evaluator() { // from class: io.sentry.android.core.DefaultAndroidEventProcessor$$ExternalSyntheticLambda0
        @Override // io.sentry.util.LazyEvaluator.Evaluator
        public final Object evaluate() {
            String family;
            family = ContextUtils.getFamily(NoOpLogger.getInstance());
            return family;
        }
    });
    final Future<DeviceInfoUtil> deviceInfoUtil;
    private final SentryAndroidOptions options;

    public DefaultAndroidEventProcessor(Context context, BuildInfoProvider buildInfoProvider, final SentryAndroidOptions sentryAndroidOptions) {
        Future<DeviceInfoUtil> future;
        this.context = (Context) Objects.requireNonNull(ContextUtils.getApplicationContext(context), "The application context is required.");
        this.buildInfoProvider = (BuildInfoProvider) Objects.requireNonNull(buildInfoProvider, "The BuildInfoProvider is required.");
        this.options = (SentryAndroidOptions) Objects.requireNonNull(sentryAndroidOptions, "The options object is required.");
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        try {
            future = newSingleThreadExecutor.submit(new Callable() { // from class: io.sentry.android.core.DefaultAndroidEventProcessor$$ExternalSyntheticLambda1
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return DefaultAndroidEventProcessor.this.m13364lambda$new$1$iosentryandroidcoreDefaultAndroidEventProcessor(sentryAndroidOptions);
                }
            });
        } catch (RejectedExecutionException e) {
            sentryAndroidOptions.getLogger().log(SentryLevel.WARNING, "Device info caching task rejected.", e);
            future = null;
        }
        this.deviceInfoUtil = future;
        newSingleThreadExecutor.shutdown();
    }

    /* renamed from: lambda$new$1$io-sentry-android-core-DefaultAndroidEventProcessor, reason: not valid java name */
    /* synthetic */ DeviceInfoUtil m13364lambda$new$1$iosentryandroidcoreDefaultAndroidEventProcessor(SentryAndroidOptions sentryAndroidOptions) throws Exception {
        return DeviceInfoUtil.getInstance(this.context, sentryAndroidOptions);
    }

    @Override // io.sentry.EventProcessor
    public SentryEvent process(SentryEvent sentryEvent, Hint hint) {
        boolean shouldApplyScopeData = shouldApplyScopeData(sentryEvent, hint);
        if (shouldApplyScopeData) {
            processNonCachedEvent(sentryEvent, hint);
            setThreads(sentryEvent, hint);
        }
        setCommons(sentryEvent, true, shouldApplyScopeData);
        fixExceptionOrder(sentryEvent);
        return sentryEvent;
    }

    @Override // io.sentry.EventProcessor
    public SentryLogEvent process(SentryLogEvent sentryLogEvent) {
        setDevice(sentryLogEvent);
        setOs(sentryLogEvent);
        return sentryLogEvent;
    }

    @Override // io.sentry.EventProcessor
    public SentryMetricsEvent process(SentryMetricsEvent sentryMetricsEvent, Hint hint) {
        setDevice(sentryMetricsEvent);
        setOs(sentryMetricsEvent);
        return sentryMetricsEvent;
    }

    private static void fixExceptionOrder(SentryEvent sentryEvent) {
        SentryStackTrace stacktrace;
        List<SentryStackFrame> frames;
        List<SentryException> exceptions = sentryEvent.getExceptions();
        if (exceptions == null || exceptions.size() <= 1) {
            return;
        }
        SentryException sentryException = exceptions.get(exceptions.size() - 1);
        if (!"java.lang".equals(sentryException.getModule()) || (stacktrace = sentryException.getStacktrace()) == null || (frames = stacktrace.getFrames()) == null) {
            return;
        }
        Iterator<SentryStackFrame> it = frames.iterator();
        while (it.hasNext()) {
            if ("com.android.internal.os.RuntimeInit$MethodAndArgsCaller".equals(it.next().getModule())) {
                Collections.reverse(exceptions);
                return;
            }
        }
    }

    private void setCommons(SentryBaseEvent sentryBaseEvent, boolean z, boolean z2) {
        mergeUser(sentryBaseEvent);
        setDevice(sentryBaseEvent, z, z2);
        setSideLoadedInfo(sentryBaseEvent);
    }

    private boolean shouldApplyScopeData(SentryBaseEvent sentryBaseEvent, Hint hint) {
        if (HintUtils.shouldApplyScopeData(hint)) {
            return true;
        }
        this.options.getLogger().log(SentryLevel.DEBUG, "Event was cached so not applying data relevant to the current app execution/version: %s", sentryBaseEvent.getEventId());
        return false;
    }

    private void mergeUser(SentryBaseEvent sentryBaseEvent) {
        User user = sentryBaseEvent.getUser();
        if (user == null) {
            user = new User();
            sentryBaseEvent.setUser(user);
        }
        if (user.getId() == null) {
            user.setId((String) this.options.getRuntimeManager().runWithRelaxedPolicy(new IRuntimeManager.IRuntimeManagerCallback() { // from class: io.sentry.android.core.DefaultAndroidEventProcessor$$ExternalSyntheticLambda3
                @Override // io.sentry.util.runtime.IRuntimeManager.IRuntimeManagerCallback
                public final Object run() {
                    return DefaultAndroidEventProcessor.this.m13363x50632e9f();
                }
            }));
        }
        if (user.getIpAddress() == null && this.options.isSendDefaultPii()) {
            user.setIpAddress(IpAddressUtils.DEFAULT_IP_ADDRESS);
        }
    }

    /* renamed from: lambda$mergeUser$2$io-sentry-android-core-DefaultAndroidEventProcessor, reason: not valid java name */
    /* synthetic */ String m13363x50632e9f() {
        return Installation.id(this.context);
    }

    private void setDevice(SentryBaseEvent sentryBaseEvent, boolean z, boolean z2) {
        if (sentryBaseEvent.getContexts().getDevice() == null) {
            if (this.deviceInfoUtil != null) {
                try {
                    sentryBaseEvent.getContexts().setDevice(this.deviceInfoUtil.get().collectDeviceInformation(z, z2));
                } catch (Throwable th) {
                    this.options.getLogger().log(SentryLevel.ERROR, "Failed to retrieve device info", th);
                }
            } else {
                this.options.getLogger().log(SentryLevel.ERROR, "Failed to retrieve device info", new Object[0]);
            }
            mergeOS(sentryBaseEvent);
        }
    }

    private void mergeOS(SentryBaseEvent sentryBaseEvent) {
        String str;
        OperatingSystem operatingSystem = sentryBaseEvent.getContexts().getOperatingSystem();
        Future<DeviceInfoUtil> future = this.deviceInfoUtil;
        if (future != null) {
            try {
                sentryBaseEvent.getContexts().setOperatingSystem(future.get().getOperatingSystem());
            } catch (Throwable th) {
                this.options.getLogger().log(SentryLevel.ERROR, "Failed to retrieve os system", th);
            }
        } else {
            this.options.getLogger().log(SentryLevel.ERROR, "Failed to retrieve device info", new Object[0]);
        }
        if (operatingSystem != null) {
            String name = operatingSystem.getName();
            if (name != null && !name.isEmpty()) {
                str = "os_" + name.trim().toLowerCase(Locale.ROOT);
            } else {
                str = "os_1";
            }
            sentryBaseEvent.getContexts().put(str, operatingSystem);
        }
    }

    private void setDevice(SentryLogEvent sentryLogEvent) {
        try {
            sentryLogEvent.setAttribute("device.brand", new SentryLogEventAttributeValue(SentryAttributeType.STRING, Build.BRAND));
            sentryLogEvent.setAttribute("device.model", new SentryLogEventAttributeValue(SentryAttributeType.STRING, Build.MODEL));
            sentryLogEvent.setAttribute("device.family", new SentryLogEventAttributeValue(SentryAttributeType.STRING, this.deviceFamily.getValue()));
        } catch (Throwable th) {
            this.options.getLogger().log(SentryLevel.ERROR, "Failed to retrieve device info", th);
        }
    }

    private void setOs(SentryLogEvent sentryLogEvent) {
        try {
            sentryLogEvent.setAttribute("os.name", new SentryLogEventAttributeValue(SentryAttributeType.STRING, "Android"));
            sentryLogEvent.setAttribute("os.version", new SentryLogEventAttributeValue(SentryAttributeType.STRING, Build.VERSION.RELEASE));
        } catch (Throwable th) {
            this.options.getLogger().log(SentryLevel.ERROR, "Failed to retrieve os system", th);
        }
    }

    private void setDevice(SentryMetricsEvent sentryMetricsEvent) {
        try {
            sentryMetricsEvent.setAttribute("device.brand", new SentryLogEventAttributeValue(SentryAttributeType.STRING, Build.BRAND));
            sentryMetricsEvent.setAttribute("device.model", new SentryLogEventAttributeValue(SentryAttributeType.STRING, Build.MODEL));
            sentryMetricsEvent.setAttribute("device.family", new SentryLogEventAttributeValue(SentryAttributeType.STRING, this.deviceFamily.getValue()));
        } catch (Throwable th) {
            this.options.getLogger().log(SentryLevel.ERROR, "Failed to retrieve device info", th);
        }
    }

    private void setOs(SentryMetricsEvent sentryMetricsEvent) {
        try {
            sentryMetricsEvent.setAttribute("os.name", new SentryLogEventAttributeValue(SentryAttributeType.STRING, "Android"));
            sentryMetricsEvent.setAttribute("os.version", new SentryLogEventAttributeValue(SentryAttributeType.STRING, Build.VERSION.RELEASE));
        } catch (Throwable th) {
            this.options.getLogger().log(SentryLevel.ERROR, "Failed to retrieve os system", th);
        }
    }

    private void processNonCachedEvent(SentryBaseEvent sentryBaseEvent, Hint hint) {
        App app = sentryBaseEvent.getContexts().getApp();
        if (app == null) {
            app = new App();
        }
        setAppExtras(app, hint);
        setPackageInfo(sentryBaseEvent, app);
        sentryBaseEvent.getContexts().setApp(app);
    }

    private void setThreads(SentryEvent sentryEvent, Hint hint) {
        if (sentryEvent.getThreads() != null) {
            boolean isFromHybridSdk = HintUtils.isFromHybridSdk(hint);
            for (SentryThread sentryThread : sentryEvent.getThreads()) {
                boolean isMainThread = AndroidThreadChecker.getInstance().isMainThread(sentryThread);
                if (sentryThread.isCurrent() == null) {
                    sentryThread.setCurrent(Boolean.valueOf(isMainThread));
                }
                if (!isFromHybridSdk && sentryThread.isMain() == null) {
                    sentryThread.setMain(Boolean.valueOf(isMainThread));
                }
            }
        }
    }

    private void setPackageInfo(SentryBaseEvent sentryBaseEvent, App app) {
        DeviceInfoUtil deviceInfoUtil;
        PackageInfo packageInfo = ContextUtils.getPackageInfo(this.context, 4096, this.options.getLogger(), this.buildInfoProvider);
        if (packageInfo != null) {
            setDist(sentryBaseEvent, ContextUtils.getVersionCode(packageInfo, this.buildInfoProvider));
            Future<DeviceInfoUtil> future = this.deviceInfoUtil;
            if (future != null) {
                try {
                    deviceInfoUtil = future.get();
                } catch (Throwable th) {
                    this.options.getLogger().log(SentryLevel.ERROR, "Failed to retrieve device info", th);
                }
                ContextUtils.setAppPackageInfo(packageInfo, this.buildInfoProvider, deviceInfoUtil, app);
            }
            this.options.getLogger().log(SentryLevel.ERROR, "Failed to retrieve device info", new Object[0]);
            deviceInfoUtil = null;
            ContextUtils.setAppPackageInfo(packageInfo, this.buildInfoProvider, deviceInfoUtil, app);
        }
    }

    private void setDist(SentryBaseEvent sentryBaseEvent, String str) {
        if (sentryBaseEvent.getDist() == null) {
            sentryBaseEvent.setDist(str);
        }
    }

    private void setAppExtras(App app, Hint hint) {
        Boolean isInBackground;
        app.setAppName(ContextUtils.getApplicationName(this.context));
        TimeSpan appStartTimeSpanWithFallback = AppStartMetrics.getInstance().getAppStartTimeSpanWithFallback(this.options);
        if (appStartTimeSpanWithFallback.hasStarted()) {
            app.setAppStartTime(DateUtils.toUtilDate(appStartTimeSpanWithFallback.getStartTimestamp()));
        }
        if (HintUtils.isFromHybridSdk(hint) || app.getInForeground() != null || (isInBackground = AppState.getInstance().isInBackground()) == null) {
            return;
        }
        app.setInForeground(Boolean.valueOf(!isInBackground.booleanValue()));
    }

    public User getDefaultUser(final Context context) {
        User user = new User();
        user.setId((String) this.options.getRuntimeManager().runWithRelaxedPolicy(new IRuntimeManager.IRuntimeManagerCallback() { // from class: io.sentry.android.core.DefaultAndroidEventProcessor$$ExternalSyntheticLambda2
            @Override // io.sentry.util.runtime.IRuntimeManager.IRuntimeManagerCallback
            public final Object run() {
                String id;
                id = Installation.id(context);
                return id;
            }
        }));
        return user;
    }

    private void setSideLoadedInfo(SentryBaseEvent sentryBaseEvent) {
        Future<DeviceInfoUtil> future = this.deviceInfoUtil;
        if (future != null) {
            try {
                ContextUtils.SideLoadedInfo sideLoadedInfo = future.get().getSideLoadedInfo();
                if (sideLoadedInfo != null) {
                    for (Map.Entry<String, String> entry : sideLoadedInfo.asTags().entrySet()) {
                        sentryBaseEvent.setTag(entry.getKey(), entry.getValue());
                    }
                    return;
                }
                return;
            } catch (Throwable th) {
                this.options.getLogger().log(SentryLevel.ERROR, "Error getting side loaded info.", th);
                return;
            }
        }
        this.options.getLogger().log(SentryLevel.ERROR, "Failed to retrieve device info", new Object[0]);
    }

    @Override // io.sentry.EventProcessor
    public SentryTransaction process(SentryTransaction sentryTransaction, Hint hint) {
        boolean shouldApplyScopeData = shouldApplyScopeData(sentryTransaction, hint);
        if (shouldApplyScopeData) {
            processNonCachedEvent(sentryTransaction, hint);
        }
        setCommons(sentryTransaction, false, shouldApplyScopeData);
        return sentryTransaction;
    }

    @Override // io.sentry.EventProcessor
    public SentryReplayEvent process(SentryReplayEvent sentryReplayEvent, Hint hint) {
        boolean shouldApplyScopeData = shouldApplyScopeData(sentryReplayEvent, hint);
        if (shouldApplyScopeData) {
            processNonCachedEvent(sentryReplayEvent, hint);
        }
        setCommons(sentryReplayEvent, false, shouldApplyScopeData);
        return sentryReplayEvent;
    }

    @Override // io.sentry.EventProcessor
    public Long getOrder() {
        return 8000L;
    }
}
