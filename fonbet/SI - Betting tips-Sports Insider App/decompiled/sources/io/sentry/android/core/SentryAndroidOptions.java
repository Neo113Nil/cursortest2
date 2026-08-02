package io.sentry.android.core;

import io.sentry.b6;
import io.sentry.z4;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class SentryAndroidOptions extends b6 {
    private boolean anrEnabled;
    private boolean anrReportInDebug;
    private long anrTimeoutIntervalMillis;
    private boolean attachAnrThreadDump;
    private boolean attachScreenshot;
    private boolean attachViewHierarchy;

    @Nullable
    private e1 beforeScreenshotCaptureCallback;

    @Nullable
    private e1 beforeViewHierarchyCaptureCallback;
    private boolean collectAdditionalContext;
    private boolean collectExternalStorageContext;

    @NotNull
    private t0 debugImagesLoader;
    private boolean enableActivityLifecycleBreadcrumbs;
    private boolean enableActivityLifecycleTracingAutoFinish;
    private boolean enableAppComponentBreadcrumbs;
    private boolean enableAppLifecycleBreadcrumbs;
    private boolean enableAutoActivityLifecycleTracing;
    private boolean enableAutoTraceIdGeneration;
    private boolean enableFramesTracking;
    private boolean enableNdk;
    private boolean enableNetworkEventBreadcrumbs;
    private boolean enablePerformanceV2;
    private boolean enableRootCheck;
    private boolean enableScopeSync;
    private boolean enableSystemEventBreadcrumbs;
    private boolean enableSystemEventBreadcrumbsExtras;
    private boolean enableTombstone;

    @Nullable
    private io.sentry.android.core.internal.util.p frameMetricsCollector;

    @Nullable
    private String nativeSdkName;

    @NotNull
    private x0 ndkHandlerStrategy;
    private boolean reportHistoricalAnrs;
    private boolean reportHistoricalTombstones;
    private final long startupCrashDurationThresholdMillis;
    private long startupCrashFlushTimeoutMillis;

    public SentryAndroidOptions() {
        super(false);
        this.anrEnabled = true;
        this.anrTimeoutIntervalMillis = 5000L;
        this.anrReportInDebug = false;
        this.enableActivityLifecycleBreadcrumbs = true;
        this.enableAppLifecycleBreadcrumbs = true;
        this.enableSystemEventBreadcrumbs = true;
        this.enableAppComponentBreadcrumbs = true;
        this.enableNetworkEventBreadcrumbs = true;
        this.enableAutoActivityLifecycleTracing = true;
        this.enableActivityLifecycleTracingAutoFinish = true;
        this.debugImagesLoader = v.f15863c;
        this.collectAdditionalContext = true;
        this.collectExternalStorageContext = false;
        this.startupCrashFlushTimeoutMillis = 5000L;
        this.startupCrashDurationThresholdMillis = 2000L;
        this.enableFramesTracking = true;
        this.nativeSdkName = null;
        this.enableRootCheck = true;
        this.enableNdk = true;
        this.ndkHandlerStrategy = x0.SENTRY_HANDLER_STRATEGY_DEFAULT;
        this.enableScopeSync = true;
        this.enableAutoTraceIdGeneration = true;
        this.enableSystemEventBreadcrumbsExtras = false;
        this.reportHistoricalAnrs = false;
        this.reportHistoricalTombstones = false;
        this.attachAnrThreadDump = false;
        this.enablePerformanceV2 = true;
        this.enableTombstone = false;
        setSentryClientName("sentry.java.android/8.30.0");
        setSdkVersion(createSdkVersion());
        setAttachServerName(false);
    }

    @NotNull
    private io.sentry.protocol.t createSdkVersion() {
        io.sentry.protocol.t sdkVersion = getSdkVersion();
        if (sdkVersion == null) {
            sdkVersion = new io.sentry.protocol.t("sentry.java.android", "8.30.0");
        } else {
            sdkVersion.f16910a = "sentry.java.android";
            sdkVersion.f16911b = "8.30.0";
        }
        z4.d().b("maven:io.sentry:sentry-android-core", "8.30.0");
        return sdkVersion;
    }

    public void enableAllAutoBreadcrumbs(boolean z5) {
        this.enableActivityLifecycleBreadcrumbs = z5;
        this.enableAppComponentBreadcrumbs = z5;
        this.enableSystemEventBreadcrumbs = z5;
        this.enableAppLifecycleBreadcrumbs = z5;
        this.enableNetworkEventBreadcrumbs = z5;
        setEnableUserInteractionBreadcrumbs(z5);
    }

    public long getAnrTimeoutIntervalMillis() {
        return this.anrTimeoutIntervalMillis;
    }

    @Nullable
    public e1 getBeforeScreenshotCaptureCallback() {
        return null;
    }

    @Nullable
    public e1 getBeforeViewHierarchyCaptureCallback() {
        return null;
    }

    @NotNull
    public t0 getDebugImagesLoader() {
        return this.debugImagesLoader;
    }

    @Nullable
    public io.sentry.android.core.internal.util.p getFrameMetricsCollector() {
        return this.frameMetricsCollector;
    }

    @Nullable
    public String getNativeSdkName() {
        return this.nativeSdkName;
    }

    public int getNdkHandlerStrategy() {
        return this.ndkHandlerStrategy.getValue();
    }

    public long getStartupCrashDurationThresholdMillis() {
        return 2000L;
    }

    public long getStartupCrashFlushTimeoutMillis() {
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

    public void setAnrEnabled(boolean z5) {
        this.anrEnabled = z5;
    }

    public void setAnrReportInDebug(boolean z5) {
        this.anrReportInDebug = z5;
    }

    public void setAnrTimeoutIntervalMillis(long j) {
        this.anrTimeoutIntervalMillis = j;
    }

    public void setAttachAnrThreadDump(boolean z5) {
        this.attachAnrThreadDump = z5;
    }

    public void setAttachScreenshot(boolean z5) {
        this.attachScreenshot = z5;
    }

    public void setAttachViewHierarchy(boolean z5) {
        this.attachViewHierarchy = z5;
    }

    public void setCollectAdditionalContext(boolean z5) {
        this.collectAdditionalContext = z5;
    }

    public void setCollectExternalStorageContext(boolean z5) {
        this.collectExternalStorageContext = z5;
    }

    public void setDebugImagesLoader(@NotNull t0 t0Var) {
        if (t0Var == null) {
            t0Var = v.f15863c;
        }
        this.debugImagesLoader = t0Var;
    }

    public void setEnableActivityLifecycleBreadcrumbs(boolean z5) {
        this.enableActivityLifecycleBreadcrumbs = z5;
    }

    public void setEnableActivityLifecycleTracingAutoFinish(boolean z5) {
        this.enableActivityLifecycleTracingAutoFinish = z5;
    }

    public void setEnableAppComponentBreadcrumbs(boolean z5) {
        this.enableAppComponentBreadcrumbs = z5;
    }

    public void setEnableAppLifecycleBreadcrumbs(boolean z5) {
        this.enableAppLifecycleBreadcrumbs = z5;
    }

    public void setEnableAutoActivityLifecycleTracing(boolean z5) {
        this.enableAutoActivityLifecycleTracing = z5;
    }

    public void setEnableAutoTraceIdGeneration(boolean z5) {
        this.enableAutoTraceIdGeneration = z5;
    }

    public void setEnableFramesTracking(boolean z5) {
        this.enableFramesTracking = z5;
    }

    public void setEnableNdk(boolean z5) {
        this.enableNdk = z5;
    }

    public void setEnableNetworkEventBreadcrumbs(boolean z5) {
        this.enableNetworkEventBreadcrumbs = z5;
    }

    public void setEnablePerformanceV2(boolean z5) {
        this.enablePerformanceV2 = z5;
    }

    public void setEnableRootCheck(boolean z5) {
        this.enableRootCheck = z5;
    }

    public void setEnableScopeSync(boolean z5) {
        this.enableScopeSync = z5;
    }

    public void setEnableSystemEventBreadcrumbs(boolean z5) {
        this.enableSystemEventBreadcrumbs = z5;
    }

    public void setEnableSystemEventBreadcrumbsExtras(boolean z5) {
        this.enableSystemEventBreadcrumbsExtras = z5;
    }

    public void setFrameMetricsCollector(@Nullable io.sentry.android.core.internal.util.p pVar) {
        this.frameMetricsCollector = pVar;
    }

    public void setNativeHandlerStrategy(@NotNull x0 x0Var) {
        this.ndkHandlerStrategy = x0Var;
    }

    public void setNativeSdkName(@Nullable String str) {
        this.nativeSdkName = str;
    }

    public void setReportHistoricalAnrs(boolean z5) {
        this.reportHistoricalAnrs = z5;
    }

    public void setReportHistoricalTombstones(boolean z5) {
        this.reportHistoricalTombstones = z5;
    }

    public void setStartupCrashFlushTimeoutMillis(long j) {
        this.startupCrashFlushTimeoutMillis = j;
    }

    public void setTombstoneEnabled(boolean z5) {
        this.enableTombstone = z5;
    }

    public void setBeforeScreenshotCaptureCallback(@NotNull e1 e1Var) {
    }

    public void setBeforeViewHierarchyCaptureCallback(@NotNull e1 e1Var) {
    }
}
