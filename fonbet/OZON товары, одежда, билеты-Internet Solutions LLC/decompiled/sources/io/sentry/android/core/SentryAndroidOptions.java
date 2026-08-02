package io.sentry.android.core;

import io.sentry.G2;
import io.sentry.W2;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class SentryAndroidOptions extends W2 {
    private boolean attachScreenshot;
    private boolean attachViewHierarchy;
    private a beforeScreenshotCaptureCallback;
    private a beforeViewHierarchyCaptureCallback;
    private io.sentry.android.core.internal.util.v frameMetricsCollector;
    private boolean anrEnabled = true;
    private long anrTimeoutIntervalMillis = 5000;
    private boolean anrReportInDebug = false;
    private boolean enableActivityLifecycleBreadcrumbs = true;
    private boolean enableAppLifecycleBreadcrumbs = true;
    private boolean enableSystemEventBreadcrumbs = true;
    private boolean enableAppComponentBreadcrumbs = true;
    private boolean enableNetworkEventBreadcrumbs = true;
    private boolean enableAutoActivityLifecycleTracing = true;
    private boolean enableActivityLifecycleTracingAutoFinish = true;

    @NotNull
    private U debugImagesLoader = e0.a();
    private boolean collectAdditionalContext = true;
    private boolean collectExternalStorageContext = false;
    private long startupCrashFlushTimeoutMillis = 5000;
    private final long startupCrashDurationThresholdMillis = 2000;
    private boolean enableFramesTracking = true;
    private String nativeSdkName = null;
    private boolean enableRootCheck = true;
    private boolean enableNdk = true;

    @NotNull
    private c0 ndkHandlerStrategy = c0.SENTRY_HANDLER_STRATEGY_DEFAULT;
    private boolean enableScopeSync = true;
    private boolean enableAutoTraceIdGeneration = true;
    private boolean enableSystemEventBreadcrumbsExtras = false;
    private boolean reportHistoricalAnrs = false;
    private boolean reportHistoricalTombstones = false;
    private boolean attachAnrThreadDump = false;
    private boolean enablePerformanceV2 = true;
    private boolean enableTombstone = false;

    @NotNull
    private final n0 screenshot = new n0();

    /* loaded from: classes10.dex */
    public interface a {
    }

    public SentryAndroidOptions() {
        setSentryClientName("sentry.java.android/8.34.1");
        setSdkVersion(createSdkVersion());
        setAttachServerName(false);
    }

    @NotNull
    private io.sentry.protocol.r createSdkVersion() {
        io.sentry.protocol.r sdkVersion = getSdkVersion();
        if (sdkVersion == null) {
            sdkVersion = new io.sentry.protocol.r("sentry.java.android", "8.34.1");
        } else {
            sdkVersion.e("sentry.java.android");
            sdkVersion.g("8.34.1");
        }
        G2.d().b("maven:io.sentry:sentry-android-core", "8.34.1");
        return sdkVersion;
    }

    public void enableAllAutoBreadcrumbs(boolean z11) {
        this.enableActivityLifecycleBreadcrumbs = z11;
        this.enableAppComponentBreadcrumbs = z11;
        this.enableSystemEventBreadcrumbs = z11;
        this.enableAppLifecycleBreadcrumbs = z11;
        this.enableNetworkEventBreadcrumbs = z11;
        setEnableUserInteractionBreadcrumbs(z11);
    }

    public long getAnrTimeoutIntervalMillis() {
        return this.anrTimeoutIntervalMillis;
    }

    public a getBeforeScreenshotCaptureCallback() {
        return null;
    }

    public a getBeforeViewHierarchyCaptureCallback() {
        return null;
    }

    @NotNull
    public U getDebugImagesLoader() {
        return this.debugImagesLoader;
    }

    public io.sentry.android.core.internal.util.v getFrameMetricsCollector() {
        return this.frameMetricsCollector;
    }

    public String getNativeSdkName() {
        return this.nativeSdkName;
    }

    public int getNdkHandlerStrategy() {
        return this.ndkHandlerStrategy.getValue();
    }

    @NotNull
    public n0 getScreenshot() {
        return this.screenshot;
    }

    public long getStartupCrashDurationThresholdMillis() {
        return 2000L;
    }

    long getStartupCrashFlushTimeoutMillis() {
        return this.startupCrashFlushTimeoutMillis;
    }

    public boolean isAnrEnabled() {
        return this.anrEnabled;
    }

    public boolean isAnrReportInDebug() {
        return this.anrReportInDebug;
    }

    public boolean isAttachAnrThreadDump() {
        return this.attachAnrThreadDump;
    }

    public boolean isAttachScreenshot() {
        return this.attachScreenshot;
    }

    public boolean isAttachViewHierarchy() {
        return this.attachViewHierarchy;
    }

    public boolean isCollectAdditionalContext() {
        return this.collectAdditionalContext;
    }

    public boolean isCollectExternalStorageContext() {
        return this.collectExternalStorageContext;
    }

    public boolean isEnableActivityLifecycleBreadcrumbs() {
        return this.enableActivityLifecycleBreadcrumbs;
    }

    public boolean isEnableActivityLifecycleTracingAutoFinish() {
        return this.enableActivityLifecycleTracingAutoFinish;
    }

    public boolean isEnableAppComponentBreadcrumbs() {
        return this.enableAppComponentBreadcrumbs;
    }

    public boolean isEnableAppLifecycleBreadcrumbs() {
        return this.enableAppLifecycleBreadcrumbs;
    }

    public boolean isEnableAutoActivityLifecycleTracing() {
        return this.enableAutoActivityLifecycleTracing;
    }

    public boolean isEnableAutoTraceIdGeneration() {
        return this.enableAutoTraceIdGeneration;
    }

    public boolean isEnableFramesTracking() {
        return this.enableFramesTracking;
    }

    public boolean isEnableNdk() {
        return this.enableNdk;
    }

    public boolean isEnableNetworkEventBreadcrumbs() {
        return this.enableNetworkEventBreadcrumbs;
    }

    public boolean isEnablePerformanceV2() {
        return this.enablePerformanceV2;
    }

    public boolean isEnableRootCheck() {
        return this.enableRootCheck;
    }

    public boolean isEnableScopeSync() {
        return this.enableScopeSync;
    }

    public boolean isEnableSystemEventBreadcrumbs() {
        return this.enableSystemEventBreadcrumbs;
    }

    public boolean isEnableSystemEventBreadcrumbsExtras() {
        return this.enableSystemEventBreadcrumbsExtras;
    }

    public boolean isReportHistoricalAnrs() {
        return this.reportHistoricalAnrs;
    }

    public boolean isReportHistoricalTombstones() {
        return this.reportHistoricalTombstones;
    }

    public boolean isTombstoneEnabled() {
        return this.enableTombstone;
    }

    public void setAnrEnabled(boolean z11) {
        this.anrEnabled = z11;
    }

    public void setAnrReportInDebug(boolean z11) {
        this.anrReportInDebug = z11;
    }

    public void setAnrTimeoutIntervalMillis(long j11) {
        this.anrTimeoutIntervalMillis = j11;
    }

    public void setAttachAnrThreadDump(boolean z11) {
        this.attachAnrThreadDump = z11;
    }

    public void setAttachScreenshot(boolean z11) {
        this.attachScreenshot = z11;
    }

    public void setAttachViewHierarchy(boolean z11) {
        this.attachViewHierarchy = z11;
    }

    public void setBeforeScreenshotCaptureCallback(@NotNull a aVar) {
    }

    public void setBeforeViewHierarchyCaptureCallback(@NotNull a aVar) {
    }

    public void setCollectAdditionalContext(boolean z11) {
        this.collectAdditionalContext = z11;
    }

    public void setCollectExternalStorageContext(boolean z11) {
        this.collectExternalStorageContext = z11;
    }

    public void setDebugImagesLoader(@NotNull U u11) {
        if (u11 == null) {
            u11 = e0.a();
        }
        this.debugImagesLoader = u11;
    }

    public void setEnableActivityLifecycleBreadcrumbs(boolean z11) {
        this.enableActivityLifecycleBreadcrumbs = z11;
    }

    public void setEnableActivityLifecycleTracingAutoFinish(boolean z11) {
        this.enableActivityLifecycleTracingAutoFinish = z11;
    }

    public void setEnableAppComponentBreadcrumbs(boolean z11) {
        this.enableAppComponentBreadcrumbs = z11;
    }

    public void setEnableAppLifecycleBreadcrumbs(boolean z11) {
        this.enableAppLifecycleBreadcrumbs = z11;
    }

    public void setEnableAutoActivityLifecycleTracing(boolean z11) {
        this.enableAutoActivityLifecycleTracing = z11;
    }

    public void setEnableAutoTraceIdGeneration(boolean z11) {
        this.enableAutoTraceIdGeneration = z11;
    }

    public void setEnableFramesTracking(boolean z11) {
        this.enableFramesTracking = z11;
    }

    public void setEnableNdk(boolean z11) {
        this.enableNdk = z11;
    }

    public void setEnableNetworkEventBreadcrumbs(boolean z11) {
        this.enableNetworkEventBreadcrumbs = z11;
    }

    public void setEnablePerformanceV2(boolean z11) {
        this.enablePerformanceV2 = z11;
    }

    public void setEnableRootCheck(boolean z11) {
        this.enableRootCheck = z11;
    }

    public void setEnableScopeSync(boolean z11) {
        this.enableScopeSync = z11;
    }

    public void setEnableSystemEventBreadcrumbs(boolean z11) {
        this.enableSystemEventBreadcrumbs = z11;
    }

    public void setEnableSystemEventBreadcrumbsExtras(boolean z11) {
        this.enableSystemEventBreadcrumbsExtras = z11;
    }

    public void setFrameMetricsCollector(io.sentry.android.core.internal.util.v vVar) {
        this.frameMetricsCollector = vVar;
    }

    public void setNativeHandlerStrategy(@NotNull c0 c0Var) {
        this.ndkHandlerStrategy = c0Var;
    }

    public void setNativeSdkName(String str) {
        this.nativeSdkName = str;
    }

    public void setReportHistoricalAnrs(boolean z11) {
        this.reportHistoricalAnrs = z11;
    }

    public void setReportHistoricalTombstones(boolean z11) {
        this.reportHistoricalTombstones = z11;
    }

    void setStartupCrashFlushTimeoutMillis(long j11) {
        this.startupCrashFlushTimeoutMillis = j11;
    }

    public void setTombstoneEnabled(boolean z11) {
        this.enableTombstone = z11;
    }
}
