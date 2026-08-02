package io.sentry.react;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.util.SparseIntArray;
import androidx.core.app.FrameMetricsAggregator;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.media3.common.MimeTypes;
import androidx.media3.datasource.cache.CacheDataSink;
import com.facebook.hermes.instrumentation.HermesSamplingProfiler;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.WritableNativeMap;
import io.sentry.Breadcrumb;
import io.sentry.ILogger;
import io.sentry.IScope;
import io.sentry.ISentryExecutorService;
import io.sentry.ProfilingTraceData;
import io.sentry.ScopeCallback;
import io.sentry.ScopesAdapter;
import io.sentry.Sentry;
import io.sentry.SentryDateProvider;
import io.sentry.SentryExecutorService;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.android.core.AndroidLogger;
import io.sentry.android.core.AndroidProfiler;
import io.sentry.android.core.BuildInfoProvider;
import io.sentry.android.core.InternalSentrySdk;
import io.sentry.android.core.SentryAndroidDateProvider;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.ViewHierarchyEventProcessor;
import io.sentry.android.core.internal.debugmeta.AssetsDebugMetaLoader;
import io.sentry.android.core.internal.util.ScreenshotUtils;
import io.sentry.android.core.internal.util.SentryFrameMetricsCollector;
import io.sentry.android.core.performance.AppStartMetrics;
import io.sentry.cache.EnvelopeCache;
import io.sentry.protocol.Geo;
import io.sentry.protocol.OperatingSystem;
import io.sentry.protocol.SdkVersion;
import io.sentry.protocol.SentryId;
import io.sentry.protocol.User;
import io.sentry.protocol.ViewHierarchy;
import io.sentry.util.DebugMetaPropertiesApplier;
import io.sentry.util.FileUtils;
import io.sentry.util.JsonSerializationUtils;
import io.sentry.util.LazyEvaluator;
import io.sentry.util.LoadClass;
import io.sentry.vendor.Base64;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Queue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* loaded from: classes9.dex */
public class RNSentryModuleImpl {
    private static final int FROZEN_FRAME_THRESHOLD = 700;
    public static final String NAME = "RNSentry";
    private static final int SCREENSHOT_TIMEOUT_SECONDS = 2;
    private static final int SLOW_FRAME_THRESHOLD = 16;
    private static final Charset UTF_8;
    private static final BuildInfoProvider buildInfo;
    static long lastStartTimestampMs = 0;
    private static final ILogger logger;
    private static final String modulesPath = "modules.json";
    private static boolean wroteCrashMarkerThisLaunch;
    private boolean androidXAvailable;
    private final PackageInfo packageInfo;
    private final ReactApplicationContext reactApplicationContext;
    private FrameMetricsAggregator frameMetricsAggregator = null;
    private int profilingTracesHz = 101;
    private AndroidProfiler androidProfiler = null;
    private boolean isProguardDebugMetaLoaded = false;
    private String proguardUuid = null;
    private String cacheDirPath = null;
    private ISentryExecutorService executorService = null;
    private long maxTraceFileSize = CacheDataSink.DEFAULT_FRAGMENT_SIZE;
    private final Runnable emitNewFrameEvent = createEmitNewFrameEvent();
    private final SentryDateProvider dateProvider = new SentryAndroidDateProvider();
    private final LoadClass loadClass = new LoadClass();

    public void setAttribute(String str, String str2) {
    }

    public void setAttributes(ReadableMap readableMap) {
    }

    static {
        AndroidLogger androidLogger = new AndroidLogger("RNSentry");
        logger = androidLogger;
        buildInfo = new BuildInfoProvider(androidLogger);
        UTF_8 = Charset.forName("UTF-8");
        lastStartTimestampMs = -1L;
        wroteCrashMarkerThisLaunch = false;
    }

    public RNSentryModuleImpl(ReactApplicationContext reactApplicationContext) {
        this.packageInfo = getPackageInfo(reactApplicationContext);
        this.reactApplicationContext = reactApplicationContext;
    }

    private ReactApplicationContext getReactApplicationContext() {
        return this.reactApplicationContext;
    }

    private Activity getCurrentActivity() {
        return this.reactApplicationContext.getCurrentActivity();
    }

    private Runnable createEmitNewFrameEvent() {
        return new Runnable() { // from class: io.sentry.react.RNSentryModuleImpl$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                RNSentryModuleImpl.this.lambda$createEmitNewFrameEvent$0();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createEmitNewFrameEvent$0() {
        RNSentryTimeToDisplay.putTimeToInitialDisplayForActiveSpan(Double.valueOf(this.dateProvider.now().nanoTimestamp() / 1.0E9d));
    }

    private void initFragmentInitialFrameTracking() {
        FragmentManager supportFragmentManager;
        RNSentryReactFragmentLifecycleTracer rNSentryReactFragmentLifecycleTracer = new RNSentryReactFragmentLifecycleTracer(buildInfo, this.emitNewFrameEvent, logger);
        FragmentActivity fragmentActivity = (FragmentActivity) getCurrentActivity();
        if (fragmentActivity == null || (supportFragmentManager = fragmentActivity.getSupportFragmentManager()) == null) {
            return;
        }
        supportFragmentManager.registerFragmentLifecycleCallbacks(rNSentryReactFragmentLifecycleTracer, true);
    }

    public void initNativeReactNavigationNewFrameTracking(Promise promise) {
        initFragmentInitialFrameTracking();
    }

    public void initNativeSdk(ReadableMap readableMap, Promise promise) {
        RNSentryStart.startWithOptions(getApplicationContext(), readableMap, getCurrentActivity(), logger);
        promise.resolve(true);
    }

    protected Context getApplicationContext() {
        Context applicationContext = getReactApplicationContext().getApplicationContext();
        if (applicationContext != null) {
            return applicationContext;
        }
        logger.log(SentryLevel.ERROR, "ApplicationContext is null, using ReactApplicationContext fallback.", new Object[0]);
        return getReactApplicationContext();
    }

    public void crash() {
        throw new RuntimeException("TEST - Sentry Client Crash (only works in release mode)");
    }

    public void addListener(String str) {
        logger.log(SentryLevel.ERROR, "addListener of NativeEventEmitter can't be used on Android!", new Object[0]);
    }

    public void removeListeners(double d) {
        logger.log(SentryLevel.ERROR, "removeListeners of NativeEventEmitter can't be used on Android!", new Object[0]);
    }

    public void fetchModules(Promise promise) {
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(getReactApplicationContext().getResources().getAssets().open(modulesPath));
            try {
                byte[] bArr = new byte[bufferedInputStream.available()];
                bufferedInputStream.read(bArr);
                bufferedInputStream.close();
                promise.resolve(new String(bArr, UTF_8));
                bufferedInputStream.close();
            } catch (Throwable th) {
                try {
                    bufferedInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (FileNotFoundException unused) {
            promise.resolve(null);
        } catch (Throwable unused2) {
            logger.log(SentryLevel.WARNING, "Fetching JS Modules failed.", new Object[0]);
            promise.resolve(null);
        }
    }

    public void fetchNativeRelease(Promise promise) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("id", this.packageInfo.packageName);
        createMap.putString("version", this.packageInfo.versionName);
        createMap.putString("build", String.valueOf(this.packageInfo.versionCode));
        promise.resolve(createMap);
    }

    public void fetchNativeAppStart(Promise promise) {
        fetchNativeAppStart(promise, AppStartMetrics.getInstance(), InternalSentrySdk.getAppStartMeasurement(), logger);
    }

    protected void fetchNativeAppStart(Promise promise, AppStartMetrics appStartMetrics, Map<String, Object> map, ILogger iLogger) {
        if (!appStartMetrics.isAppLaunchedInForeground()) {
            iLogger.log(SentryLevel.WARNING, "Invalid app start data: app not launched in foreground.", new Object[0]);
            promise.resolve(null);
            return;
        }
        WritableMap writableMap = (WritableMap) RNSentryMapConverter.convertToWritable(map);
        long startTimestampMs = appStartMetrics.getAppStartTimeSpan().getStartTimestampMs();
        long j = lastStartTimestampMs;
        boolean z = j > 0 && j == startTimestampMs;
        writableMap.putBoolean("has_fetched", z);
        if (lastStartTimestampMs < 0) {
            iLogger.log(SentryLevel.DEBUG, "App Start data reported to the RN layer for the first time.", new Object[0]);
        } else if (z) {
            iLogger.log(SentryLevel.DEBUG, "App Start data already fetched from native before.", new Object[0]);
        } else {
            iLogger.log(SentryLevel.DEBUG, "App Start data updated, reporting to the RN layer again.", new Object[0]);
        }
        lastStartTimestampMs = startTimestampMs;
        appStartMetrics.onAppStartSpansSent();
        promise.resolve(writableMap);
    }

    public void fetchNativeFrames(Promise promise) {
        int i;
        int i2;
        int i3;
        SparseIntArray sparseIntArray;
        if (!isFrameMetricsAggregatorAvailable()) {
            promise.resolve(null);
            return;
        }
        try {
            SparseIntArray[] metrics = this.frameMetricsAggregator.getMetrics();
            if (metrics == null || (sparseIntArray = metrics[0]) == null) {
                i = 0;
                i2 = 0;
                i3 = 0;
            } else {
                i = 0;
                i2 = 0;
                i3 = 0;
                for (int i4 = 0; i4 < sparseIntArray.size(); i4++) {
                    int keyAt = sparseIntArray.keyAt(i4);
                    int valueAt = sparseIntArray.valueAt(i4);
                    i += valueAt;
                    if (keyAt > 700) {
                        i3 += valueAt;
                    } else if (keyAt > 16) {
                        i2 += valueAt;
                    }
                }
            }
            WritableMap createMap = Arguments.createMap();
            createMap.putInt("totalFrames", i);
            createMap.putInt("slowFrames", i2);
            createMap.putInt("frozenFrames", i3);
            promise.resolve(createMap);
        } catch (Throwable unused) {
            logger.log(SentryLevel.WARNING, "Error fetching native frames.", new Object[0]);
            promise.resolve(null);
        }
    }

    public void captureReplay(boolean z, Promise promise) {
        Sentry.getCurrentScopes().getOptions().getReplayController().captureReplay(Boolean.valueOf(z));
        promise.resolve(getCurrentReplayId());
    }

    public String getCurrentReplayId() {
        SentryId replayId;
        IScope currentScope = InternalSentrySdk.getCurrentScope();
        if (currentScope == null || (replayId = currentScope.getReplayId()) == SentryId.EMPTY_ID) {
            return null;
        }
        return replayId.toString();
    }

    public void captureEnvelope(String str, ReadableMap readableMap, Promise promise) {
        byte[] decode = Base64.decode(str, 0);
        try {
            boolean z = readableMap.hasKey("hardCrashed") && readableMap.getBoolean("hardCrashed");
            InternalSentrySdk.captureEnvelope(decode, !z);
            if (!z) {
                String str2 = new String(decode, StandardCharsets.UTF_8);
                z = str2.contains("\"type\":\"event\"") && str2.contains("\"level\":\"fatal\"") && str2.contains("\"type\":\"onerror\"") && str2.contains("\"handled\":false");
            }
            if (z && !wroteCrashMarkerThisLaunch) {
                SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) Sentry.getCurrentScopes().getOptions();
                String cacheDirPath = sentryAndroidOptions != null ? sentryAndroidOptions.getCacheDirPath() : null;
                if (cacheDirPath != null) {
                    File file = new File(cacheDirPath, ".sentry-native");
                    if (!file.exists()) {
                        file.mkdirs();
                    }
                    File file2 = new File(file, EnvelopeCache.CRASH_MARKER_FILE);
                    if (!file2.exists()) {
                        file2.createNewFile();
                    }
                    wroteCrashMarkerThisLaunch = true;
                }
            }
        } catch (Throwable unused) {
            logger.log(SentryLevel.ERROR, "Error while capturing envelope", new Object[0]);
            promise.resolve(false);
        }
        promise.resolve(true);
    }

    public void captureScreenshot(Promise promise) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            logger.log(SentryLevel.WARNING, "CurrentActivity is null, can't capture screenshot.", new Object[0]);
            promise.resolve(null);
            return;
        }
        byte[] takeScreenshotOnUiThread = takeScreenshotOnUiThread(currentActivity);
        if (takeScreenshotOnUiThread == null || takeScreenshotOnUiThread.length == 0) {
            logger.log(SentryLevel.WARNING, "Screenshot is null, screen was not captured.", new Object[0]);
            promise.resolve(null);
            return;
        }
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        for (byte b : takeScreenshotOnUiThread) {
            writableNativeArray.pushInt(b);
        }
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString("contentType", MimeTypes.IMAGE_PNG);
        writableNativeMap.putArray("data", writableNativeArray);
        writableNativeMap.putString("filename", "screenshot.png");
        WritableNativeArray writableNativeArray2 = new WritableNativeArray();
        writableNativeArray2.pushMap(writableNativeMap);
        promise.resolve(writableNativeArray2);
    }

    private static byte[] takeScreenshotOnUiThread(final Activity activity) {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final byte[][] bArr = {new byte[0]};
        Runnable runnable = new Runnable() { // from class: io.sentry.react.RNSentryModuleImpl$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                RNSentryModuleImpl.lambda$takeScreenshotOnUiThread$1(bArr, activity, countDownLatch);
            }
        };
        if (UiThreadUtil.isOnUiThread()) {
            runnable.run();
        } else {
            UiThreadUtil.runOnUiThread(runnable);
        }
        try {
            countDownLatch.await(2L, TimeUnit.SECONDS);
            return bArr[0];
        } catch (InterruptedException unused) {
            logger.log(SentryLevel.ERROR, "Screenshot process was interrupted.", new Object[0]);
            return new byte[0];
        }
    }

    static /* synthetic */ void lambda$takeScreenshotOnUiThread$1(byte[][] bArr, Activity activity, CountDownLatch countDownLatch) {
        bArr[0] = ScreenshotUtils.takeScreenshot(activity, logger, buildInfo);
        countDownLatch.countDown();
    }

    public void fetchViewHierarchy(Promise promise) {
        Activity currentActivity = getCurrentActivity();
        ILogger iLogger = logger;
        ViewHierarchy snapshotViewHierarchy = ViewHierarchyEventProcessor.snapshotViewHierarchy(currentActivity, iLogger);
        if (snapshotViewHierarchy == null) {
            iLogger.log(SentryLevel.ERROR, "Could not get ViewHierarchy.", new Object[0]);
            promise.resolve(null);
            return;
        }
        byte[] bytesFrom = JsonSerializationUtils.bytesFrom(ScopesAdapter.getInstance().getOptions().getSerializer(), iLogger, snapshotViewHierarchy);
        if (bytesFrom == null) {
            iLogger.log(SentryLevel.ERROR, "Could not serialize ViewHierarchy.", new Object[0]);
            promise.resolve(null);
        } else {
            if (bytesFrom.length < 1) {
                iLogger.log(SentryLevel.ERROR, "Got empty bytes array after serializing ViewHierarchy.", new Object[0]);
                promise.resolve(null);
                return;
            }
            WritableNativeArray writableNativeArray = new WritableNativeArray();
            for (byte b : bytesFrom) {
                writableNativeArray.pushInt(b);
            }
            promise.resolve(writableNativeArray);
        }
    }

    private static PackageInfo getPackageInfo(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException unused) {
            logger.log(SentryLevel.WARNING, "Error getting package info.", new Object[0]);
            return null;
        }
    }

    public void setUser(final ReadableMap readableMap, final ReadableMap readableMap2) {
        Sentry.configureScope(new ScopeCallback() { // from class: io.sentry.react.RNSentryModuleImpl$$ExternalSyntheticLambda1
            @Override // io.sentry.ScopeCallback
            public final void run(IScope iScope) {
                RNSentryModuleImpl.lambda$setUser$2(ReadableMap.this, readableMap2, iScope);
            }
        });
    }

    static /* synthetic */ void lambda$setUser$2(ReadableMap readableMap, ReadableMap readableMap2, IScope iScope) {
        ReadableMap map;
        if (readableMap == null && readableMap2 == null) {
            iScope.setUser(null);
            return;
        }
        User user = new User();
        if (readableMap != null) {
            if (readableMap.hasKey("email")) {
                user.setEmail(readableMap.getString("email"));
            }
            if (readableMap.hasKey("id")) {
                user.setId(readableMap.getString("id"));
            }
            if (readableMap.hasKey("username")) {
                user.setUsername(readableMap.getString("username"));
            }
            if (readableMap.hasKey("ip_address")) {
                user.setIpAddress(readableMap.getString("ip_address"));
            }
            if (readableMap.hasKey(User.JsonKeys.GEO) && (map = readableMap.getMap(User.JsonKeys.GEO)) != null) {
                Geo geo = new Geo();
                if (map.hasKey("city")) {
                    geo.setCity(map.getString("city"));
                }
                if (map.hasKey(Geo.JsonKeys.COUNTRY_CODE)) {
                    geo.setCountryCode(map.getString(Geo.JsonKeys.COUNTRY_CODE));
                }
                if (map.hasKey("region")) {
                    geo.setRegion(map.getString("region"));
                }
                user.setGeo(geo);
            }
        }
        if (readableMap2 != null) {
            HashMap hashMap = new HashMap();
            ReadableMapKeySetIterator keySetIterator = readableMap2.keySetIterator();
            while (keySetIterator.hasNextKey()) {
                String nextKey = keySetIterator.nextKey();
                String string = readableMap2.getString(nextKey);
                if (string != null) {
                    hashMap.put(nextKey, string);
                }
            }
            user.setData(hashMap);
        }
        iScope.setUser(user);
    }

    public void addBreadcrumb(final ReadableMap readableMap) {
        Sentry.configureScope(new ScopeCallback() { // from class: io.sentry.react.RNSentryModuleImpl$$ExternalSyntheticLambda9
            @Override // io.sentry.ScopeCallback
            public final void run(IScope iScope) {
                RNSentryModuleImpl.lambda$addBreadcrumb$3(ReadableMap.this, iScope);
            }
        });
    }

    static /* synthetic */ void lambda$addBreadcrumb$3(ReadableMap readableMap, IScope iScope) {
        iScope.addBreadcrumb(RNSentryBreadcrumb.fromMap(readableMap));
        String currentScreenFrom = RNSentryBreadcrumb.getCurrentScreenFrom(readableMap);
        if (currentScreenFrom != null) {
            iScope.setScreen(currentScreenFrom);
        }
    }

    public void clearBreadcrumbs() {
        Sentry.configureScope(new ScopeCallback() { // from class: io.sentry.react.RNSentryModuleImpl$$ExternalSyntheticLambda5
            @Override // io.sentry.ScopeCallback
            public final void run(IScope iScope) {
                iScope.clearBreadcrumbs();
            }
        });
    }

    public void popTimeToDisplayFor(String str, Promise promise) {
        if (str != null) {
            promise.resolve(RNSentryTimeToDisplay.popTimeToDisplayFor(str));
        } else {
            promise.resolve(null);
        }
    }

    public boolean setActiveSpanId(String str) {
        RNSentryTimeToDisplay.setActiveSpanId(str);
        return true;
    }

    public void setExtra(final String str, final String str2) {
        if (str == null || str2 == null) {
            logger.log(SentryLevel.ERROR, "RNSentry.setExtra called with null key or value, can't change extra.", new Object[0]);
        } else {
            Sentry.configureScope(new ScopeCallback() { // from class: io.sentry.react.RNSentryModuleImpl$$ExternalSyntheticLambda3
                @Override // io.sentry.ScopeCallback
                public final void run(IScope iScope) {
                    iScope.setExtra(str, str2);
                }
            });
        }
    }

    public void setContext(final String str, final ReadableMap readableMap) {
        if (str == null) {
            logger.log(SentryLevel.ERROR, "RNSentry.setContext called with null key, can't change context.", new Object[0]);
        } else {
            Sentry.configureScope(new ScopeCallback() { // from class: io.sentry.react.RNSentryModuleImpl$$ExternalSyntheticLambda8
                @Override // io.sentry.ScopeCallback
                public final void run(IScope iScope) {
                    RNSentryModuleImpl.lambda$setContext$6(ReadableMap.this, str, iScope);
                }
            });
        }
    }

    static /* synthetic */ void lambda$setContext$6(ReadableMap readableMap, String str, IScope iScope) {
        if (readableMap == null) {
            iScope.removeContexts(str);
        } else {
            iScope.setContexts(str, readableMap.toHashMap());
        }
    }

    public void setTag(final String str, final String str2) {
        Sentry.configureScope(new ScopeCallback() { // from class: io.sentry.react.RNSentryModuleImpl$$ExternalSyntheticLambda4
            @Override // io.sentry.ScopeCallback
            public final void run(IScope iScope) {
                iScope.setTag(str, str2);
            }
        });
    }

    public void closeNativeSdk(Promise promise) {
        Sentry.close();
        disableNativeFramesTracking();
        promise.resolve(true);
    }

    public void enableNativeFramesTracking() {
        boolean checkAndroidXAvailability = checkAndroidXAvailability();
        this.androidXAvailable = checkAndroidXAvailability;
        if (checkAndroidXAvailability) {
            this.frameMetricsAggregator = new FrameMetricsAggregator();
            Activity currentActivity = getCurrentActivity();
            FrameMetricsAggregator frameMetricsAggregator = this.frameMetricsAggregator;
            if (frameMetricsAggregator != null && currentActivity != null) {
                try {
                    frameMetricsAggregator.add(currentActivity);
                    logger.log(SentryLevel.INFO, "FrameMetricsAggregator installed.", new Object[0]);
                    return;
                } catch (Throwable unused) {
                    logger.log(SentryLevel.ERROR, "Error adding Activity to frameMetricsAggregator.", new Object[0]);
                    return;
                }
            }
            logger.log(SentryLevel.INFO, "currentActivity isn't available.", new Object[0]);
            return;
        }
        logger.log(SentryLevel.WARNING, "androidx.core' isn't available as a dependency.", new Object[0]);
    }

    public void disableNativeFramesTracking() {
        if (isFrameMetricsAggregatorAvailable()) {
            this.frameMetricsAggregator.stop();
            this.frameMetricsAggregator = null;
        }
    }

    public void getNewScreenTimeToDisplay(Promise promise) {
        RNSentryTimeToDisplay.getTimeToDisplay(promise, this.dateProvider);
    }

    private String getProfilingTracesDirPath() {
        if (this.cacheDirPath == null) {
            this.cacheDirPath = new File(getReactApplicationContext().getCacheDir(), "sentry/react").getAbsolutePath();
        }
        File file = new File(this.cacheDirPath, "profiling_trace");
        file.mkdirs();
        return file.getAbsolutePath();
    }

    private void initializeAndroidProfiler() {
        if (this.executorService == null) {
            this.executorService = new SentryExecutorService();
        }
        String profilingTracesDirPath = getProfilingTracesDirPath();
        int micros = ((int) TimeUnit.SECONDS.toMicros(1L)) / this.profilingTracesHz;
        ReactApplicationContext reactApplicationContext = this.reactApplicationContext;
        ILogger iLogger = logger;
        this.androidProfiler = new AndroidProfiler(profilingTracesDirPath, micros, new SentryFrameMetricsCollector(reactApplicationContext, iLogger, buildInfo), new LazyEvaluator.Evaluator() { // from class: io.sentry.react.RNSentryModuleImpl$$ExternalSyntheticLambda2
            @Override // io.sentry.util.LazyEvaluator.Evaluator
            public final Object evaluate() {
                ISentryExecutorService lambda$initializeAndroidProfiler$8;
                lambda$initializeAndroidProfiler$8 = RNSentryModuleImpl.this.lambda$initializeAndroidProfiler$8();
                return lambda$initializeAndroidProfiler$8;
            }
        }, iLogger);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ISentryExecutorService lambda$initializeAndroidProfiler$8() {
        return this.executorService;
    }

    public WritableMap startProfiling(boolean z) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        if (this.androidProfiler == null && z) {
            initializeAndroidProfiler();
        }
        try {
            HermesSamplingProfiler.enable();
            AndroidProfiler androidProfiler = this.androidProfiler;
            if (androidProfiler != null) {
                androidProfiler.start();
            }
            writableNativeMap.putBoolean("started", true);
            return writableNativeMap;
        } catch (Throwable th) {
            writableNativeMap.putBoolean("started", false);
            writableNativeMap.putString("error", th.toString());
            return writableNativeMap;
        }
    }

    public WritableMap stopProfiling() {
        boolean isDebug = ScopesAdapter.getInstance().getOptions().isDebug();
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        File file = null;
        try {
            AndroidProfiler androidProfiler = this.androidProfiler;
            AndroidProfiler.ProfileEndData endAndCollect = androidProfiler != null ? androidProfiler.endAndCollect(false, null) : null;
            HermesSamplingProfiler.disable();
            file = File.createTempFile("sampling-profiler-trace", ".cpuprofile", this.reactApplicationContext.getCacheDir());
            if (isDebug) {
                logger.log(SentryLevel.INFO, "Profile saved to: " + file.getAbsolutePath(), new Object[0]);
            }
            HermesSamplingProfiler.dumpSampledTraceToFile(file.getPath());
            writableNativeMap.putString("profile", readStringFromFile(file));
            if (endAndCollect != null) {
                WritableNativeMap writableNativeMap2 = new WritableNativeMap();
                writableNativeMap2.putString("sampled_profile", Base64.encodeToString(FileUtils.readBytesFromFile(endAndCollect.traceFile.getPath(), this.maxTraceFileSize), 3));
                writableNativeMap2.putInt(ProfilingTraceData.JsonKeys.ANDROID_API_LEVEL, buildInfo.getSdkInfoVersion());
                writableNativeMap2.putString(ProfilingTraceData.JsonKeys.BUILD_ID, getProguardUuid());
                writableNativeMap.putMap("androidProfile", writableNativeMap2);
            }
            if (file != null) {
                try {
                    if (!file.delete()) {
                        logger.log(SentryLevel.WARNING, "Profile not deleted from:" + file.getAbsolutePath(), new Object[0]);
                        return writableNativeMap;
                    }
                } catch (Throwable unused) {
                    logger.log(SentryLevel.WARNING, "Profile not deleted from:" + file.getAbsolutePath(), new Object[0]);
                }
            }
        } catch (Throwable th) {
            try {
                writableNativeMap.putString("error", th.toString());
                if (file != null) {
                    try {
                        if (!file.delete()) {
                            logger.log(SentryLevel.WARNING, "Profile not deleted from:" + file.getAbsolutePath(), new Object[0]);
                        }
                    } catch (Throwable unused2) {
                        logger.log(SentryLevel.WARNING, "Profile not deleted from:" + file.getAbsolutePath(), new Object[0]);
                    }
                }
            } catch (Throwable th2) {
                if (file != null) {
                    try {
                        if (!file.delete()) {
                            logger.log(SentryLevel.WARNING, "Profile not deleted from:" + file.getAbsolutePath(), new Object[0]);
                        }
                    } catch (Throwable unused3) {
                        logger.log(SentryLevel.WARNING, "Profile not deleted from:" + file.getAbsolutePath(), new Object[0]);
                    }
                }
                throw th2;
            }
        }
        return writableNativeMap;
    }

    private String getProguardUuid() {
        if (this.isProguardDebugMetaLoaded) {
            return this.proguardUuid;
        }
        this.isProguardDebugMetaLoaded = true;
        List<Properties> loadDebugMeta = new AssetsDebugMetaLoader(getReactApplicationContext(), logger).loadDebugMeta();
        if (loadDebugMeta == null) {
            return null;
        }
        Iterator<Properties> it = loadDebugMeta.iterator();
        while (it.hasNext()) {
            String proguardUuid = DebugMetaPropertiesApplier.getProguardUuid(it.next());
            this.proguardUuid = proguardUuid;
            if (proguardUuid != null) {
                logger.log(SentryLevel.INFO, "Proguard uuid found: " + this.proguardUuid, new Object[0]);
                return this.proguardUuid;
            }
        }
        logger.log(SentryLevel.WARNING, "No proguard uuid found in debug meta properties file!", new Object[0]);
        return null;
    }

    private String readStringFromFile(File file) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        try {
            StringBuilder sb = new StringBuilder();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb.append(readLine);
                    sb.append('\n');
                } else {
                    String sb2 = sb.toString();
                    bufferedReader.close();
                    return sb2;
                }
            }
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public void fetchNativeLogAttributes(Promise promise) {
        fetchNativeLogContexts(promise, ScopesAdapter.getInstance().getOptions(), getReactApplicationContext().getApplicationContext(), InternalSentrySdk.getCurrentScope());
    }

    public void fetchNativeDeviceContexts(Promise promise) {
        fetchNativeDeviceContexts(promise, ScopesAdapter.getInstance().getOptions(), getReactApplicationContext().getApplicationContext(), InternalSentrySdk.getCurrentScope());
    }

    protected void fetchNativeDeviceContexts(Promise promise, SentryOptions sentryOptions, Context context, IScope iScope) {
        if (!(sentryOptions instanceof SentryAndroidOptions)) {
            promise.resolve(null);
            return;
        }
        if (context == null) {
            promise.resolve(null);
            return;
        }
        if (iScope != null) {
            Iterator<Breadcrumb> it = iScope.getBreadcrumbs().iterator();
            while (it.hasNext()) {
                if ("react-native".equals(it.next().getOrigin())) {
                    it.remove();
                }
            }
        }
        promise.resolve(RNSentryMapConverter.convertToWritable(InternalSentrySdk.serializeScope(context, (SentryAndroidOptions) sentryOptions, iScope)));
    }

    protected void fetchNativeLogContexts(Promise promise, SentryOptions sentryOptions, Context context, IScope iScope) {
        if (!(sentryOptions instanceof SentryAndroidOptions) || context == null) {
            promise.resolve(null);
            return;
        }
        Object obj = InternalSentrySdk.serializeScope(context, (SentryAndroidOptions) sentryOptions, iScope).get("contexts");
        if (!(obj instanceof Map)) {
            promise.resolve(null);
            return;
        }
        Map map = (Map) obj;
        HashMap hashMap = new HashMap();
        if (map.containsKey(OperatingSystem.TYPE)) {
            hashMap.put(OperatingSystem.TYPE, map.get(OperatingSystem.TYPE));
        }
        if (map.containsKey("device")) {
            hashMap.put("device", map.get("device"));
        }
        hashMap.put("release", sentryOptions.getRelease());
        HashMap hashMap2 = new HashMap();
        hashMap2.put("contexts", hashMap);
        promise.resolve(RNSentryMapConverter.convertToWritable(hashMap2));
    }

    public void fetchNativeSdkInfo(Promise promise) {
        SdkVersion sdkVersion = ScopesAdapter.getInstance().getOptions().getSdkVersion();
        if (sdkVersion == null) {
            promise.resolve(null);
            return;
        }
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString("name", sdkVersion.getName());
        writableNativeMap.putString("version", sdkVersion.getVersion());
        promise.resolve(writableNativeMap);
    }

    public String fetchNativePackageName() {
        return this.packageInfo.packageName;
    }

    public void getDataFromUri(String str, Promise promise) {
        try {
            InputStream openInputStream = getReactApplicationContext().getContentResolver().openInputStream(Uri.parse(str));
            try {
                if (openInputStream == null) {
                    String str2 = "File not found for uri: " + str;
                    logger.log(SentryLevel.ERROR, str2, new Object[0]);
                    promise.reject(new Exception(str2));
                    if (openInputStream == null) {
                        return;
                    }
                } else {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = openInputStream.read(bArr);
                        if (read == -1) {
                            break;
                        } else {
                            byteArrayOutputStream.write(bArr, 0, read);
                        }
                    }
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    WritableArray createArray = Arguments.createArray();
                    for (byte b : byteArray) {
                        createArray.pushInt(b & 255);
                    }
                    promise.resolve(createArray);
                    if (openInputStream == null) {
                        return;
                    }
                }
                openInputStream.close();
            } finally {
            }
        } catch (IOException e) {
            String str3 = "Error reading uri: " + str + ": " + e.getMessage();
            logger.log(SentryLevel.ERROR, str3, new Object[0]);
            promise.reject(new Exception(str3));
        }
    }

    public void encodeToBase64(ReadableArray readableArray, Promise promise) {
        byte[] bArr = new byte[readableArray.size()];
        for (int i = 0; i < readableArray.size(); i++) {
            bArr[i] = (byte) readableArray.getInt(i);
        }
        promise.resolve(android.util.Base64.encodeToString(bArr, 0));
    }

    public void crashedLastRun(Promise promise) {
        promise.resolve(Sentry.isCrashedLastRun());
    }

    public void getBreadcrumbs(final Promise promise) {
        try {
            Sentry.configureScope(new ScopeCallback() { // from class: io.sentry.react.RNSentryModuleImpl$$ExternalSyntheticLambda0
                @Override // io.sentry.ScopeCallback
                public final void run(IScope iScope) {
                    RNSentryModuleImpl.this.lambda$getBreadcrumbs$9(promise, iScope);
                }
            });
        } catch (Exception e) {
            promise.reject("General error", e.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getBreadcrumbs$9(Promise promise, IScope iScope) {
        try {
            Queue<Breadcrumb> breadcrumbs = iScope.getBreadcrumbs();
            WritableArray createArray = Arguments.createArray();
            for (Breadcrumb breadcrumb : breadcrumbs) {
                WritableMap createMap = Arguments.createMap();
                createMap.putString("message", breadcrumb.getMessage());
                createMap.putString("category", breadcrumb.getCategory());
                createMap.putString("type", breadcrumb.getType());
                createMap.putMap("data", convertBreadcrumbDataToWritableMap(breadcrumb.getData()));
                createMap.putString("level", breadcrumb.getLevel() != null ? breadcrumb.getLevel().toString() : null);
                createArray.pushMap(createMap);
            }
            promise.resolve(createArray);
        } catch (Exception e) {
            promise.reject("Breadcrumb error", e.getMessage());
        }
    }

    private WritableMap convertBreadcrumbDataToWritableMap(Map<String, Object> map) {
        WritableMap createMap = Arguments.createMap();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof String) {
                createMap.putString(entry.getKey(), (String) value);
            } else if (value instanceof Boolean) {
                createMap.putBoolean(entry.getKey(), ((Boolean) value).booleanValue());
            } else if (value instanceof Double) {
                createMap.putDouble(entry.getKey(), ((Double) value).doubleValue());
            } else if (value instanceof Integer) {
                createMap.putInt(entry.getKey(), ((Integer) value).intValue());
            } else if (value instanceof Map) {
                createMap.putMap(entry.getKey(), convertBreadcrumbDataToWritableMap((Map) value));
            } else if (value == null) {
                createMap.putNull(entry.getKey());
            }
        }
        return createMap;
    }

    private boolean checkAndroidXAvailability() {
        try {
            Class.forName("androidx.core.app.FrameMetricsAggregator");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    private boolean isFrameMetricsAggregatorAvailable() {
        return this.androidXAvailable && this.frameMetricsAggregator != null;
    }

    public static String getURLFromDSN(String str) {
        if (str == null) {
            return null;
        }
        try {
            URI uri = new URI(str);
            return uri.getScheme() + "://" + uri.getHost();
        } catch (URISyntaxException unused) {
            return null;
        }
    }

    protected void trySetIgnoreErrors(SentryAndroidOptions sentryAndroidOptions, ReadableMap readableMap) {
        ReadableArray array = readableMap.hasKey("ignoreErrorsRegex") ? readableMap.getArray("ignoreErrorsRegex") : null;
        ReadableArray array2 = readableMap.hasKey("ignoreErrorsStr") ? readableMap.getArray("ignoreErrorsStr") : null;
        if (array == null && array2 == null) {
            return;
        }
        ArrayList arrayList = new ArrayList((array != null ? array.size() : 0) + (array2 != null ? array2.size() : 0));
        if (array != null) {
            for (int i = 0; i < array.size(); i++) {
                arrayList.add(array.getString(i));
            }
        }
        if (array2 != null) {
            for (int i2 = 0; i2 < array2.size(); i2++) {
                arrayList.add(SentryOptions.DEFAULT_PROPAGATION_TARGETS + Pattern.quote(array2.getString(i2)) + SentryOptions.DEFAULT_PROPAGATION_TARGETS);
            }
        }
        sentryAndroidOptions.setIgnoredErrors(arrayList);
    }
}
