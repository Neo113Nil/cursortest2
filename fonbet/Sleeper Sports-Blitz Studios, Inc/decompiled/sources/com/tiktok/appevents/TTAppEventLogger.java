package com.tiktok.appevents;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.socure.docv.capturesdk.common.analytics.AnalyticsConstantsKt;
import com.tiktok.TikTokBusinessSdk;
import com.tiktok.appevents.TTAppEvent;
import com.tiktok.appevents.contents.TTContentsEventConstants;
import com.tiktok.appevents.edp.EDPConfig;
import com.tiktok.appevents.edp.TTEDPEventTrack;
import com.tiktok.unity.TTUnityBridge;
import com.tiktok.util.SystemInfoUtil;
import com.tiktok.util.TTConst;
import com.tiktok.util.TTHandlerUtil;
import com.tiktok.util.TTLogger;
import com.tiktok.util.TTUtil;
import io.sentry.rrweb.RRWebVideoEvent;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public class TTAppEventLogger {
    public static final String NETWORK_IS_TURNED_OFF = "SDK can't send tracking events to server, it will be cached locally, and will be sent in batches only after startTracking";
    static final String SKIP_FLUSHING_BECAUSE_GLOBAL_CONFIG_IS_NOT_FETCHED = "Skip flushing because global config is not fetched";
    static final String SKIP_FLUSHING_BECAUSE_GLOBAL_SWITCH_IS_TURNED_OFF = "Skip flushing because global switch is turned off";
    static final String TAG = "com.tiktok.appevents.TTAppEventLogger";
    static final int THRESHOLD = 100;
    private static int TIME_BUFFER = 0;
    public static boolean autoTrackPaymentEnable = true;
    public static boolean autoTrackRetentionEnable = true;
    static int totalDumped;
    final TTAutoEventsManager autoEventsManager;
    int counter;
    final List<TTConst.AutoEvents> disabledEvents;
    Lifecycle lifecycle;
    final boolean lifecycleTrackEnable;
    static ScheduledExecutorService eventLoop = Executors.newSingleThreadScheduledExecutor(new TTThreadFactory());
    static ScheduledExecutorService timerService = Executors.newSingleThreadScheduledExecutor(new TTThreadFactory());
    static boolean metricsEnabled = true;
    private static final TTLifecycleListener mLifecycleListener = new TTLifecycleListener();
    int flushId = 0;
    ScheduledFuture<?> future = null;
    ScheduledFuture<?> timeFuture = null;
    private final Runnable batchFlush = new Runnable() { // from class: com.tiktok.appevents.TTAppEventLogger$$ExternalSyntheticLambda14
        @Override // java.lang.Runnable
        public final void run() {
            TTAppEventLogger.this.m11610lambda$new$0$comtiktokappeventsTTAppEventLogger();
        }
    };
    Handler uiThreadHandler = new Handler(Looper.getMainLooper());
    private Runnable heartRunnable = new Runnable() { // from class: com.tiktok.appevents.TTAppEventLogger.1
        @Override // java.lang.Runnable
        public void run() {
            try {
                TTAppEventLogger.this.m11609lambda$initConfig$1$comtiktokappeventsTTAppEventLogger();
                if (!TTActivityLifecycleCallbacksListener.isBackground() && TikTokBusinessSdk.isGlobalConfigFetched().booleanValue() && TikTokBusinessSdk.isSystemActivated()) {
                    TikTokBusinessSdk.getAppEventLogger().monitorMetric("session_activity", TTUtil.getMetaWithTS(Long.valueOf(System.currentTimeMillis())), null);
                }
            } catch (Throwable unused) {
            }
        }
    };
    TTLogger logger = new TTLogger(TAG, TikTokBusinessSdk.getLogLevel());

    public enum FlushReason {
        THRESHOLD,
        TIMER,
        START_UP,
        FORCE_FLUSH,
        IDENTIFY,
        LOGOUT
    }

    /* renamed from: lambda$new$0$com-tiktok-appevents-TTAppEventLogger, reason: not valid java name */
    /* synthetic */ void m11610lambda$new$0$comtiktokappeventsTTAppEventLogger() {
        m11608lambda$flushWithReason$7$comtiktokappeventsTTAppEventLogger(FlushReason.TIMER);
    }

    public static List<TTAppEvent> getSuccessfulEvents() {
        return TTRequest.getSuccessfullySentRequests();
    }

    public TTAppEventLogger(boolean lifecycleTrackEnable, List<TTConst.AutoEvents> disabledEvents, int flushTime, boolean monitorDisable) {
        this.lifecycleTrackEnable = lifecycleTrackEnable;
        this.disabledEvents = disabledEvents;
        TIME_BUFFER = flushTime;
        this.counter = flushTime;
        this.lifecycle = ProcessLifecycleOwner.get().getLifecycleRegistry();
        if (monitorDisable) {
            metricsEnabled = false;
        }
        final TTActivityLifecycleCallbacksListener tTActivityLifecycleCallbacksListener = new TTActivityLifecycleCallbacksListener(this);
        try {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                this.lifecycle.addObserver(tTActivityLifecycleCallbacksListener);
            } else {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.tiktok.appevents.TTAppEventLogger.2
                    @Override // java.lang.Runnable
                    public void run() {
                        TTAppEventLogger.this.lifecycle.addObserver(tTActivityLifecycleCallbacksListener);
                    }
                });
            }
            TikTokBusinessSdk.getApplicationContext().registerActivityLifecycleCallbacks(mLifecycleListener);
        } catch (Throwable unused) {
        }
        this.autoEventsManager = new TTAutoEventsManager(this);
    }

    public void initConfig(long initTimeMS, final TikTokBusinessSdk.TTInitCallback callback, final AtomicBoolean sdkInitialized) {
        addToQ(new Runnable() { // from class: com.tiktok.appevents.TTAppEventLogger$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                TTAppEventLogger.this.m11609lambda$initConfig$1$comtiktokappeventsTTAppEventLogger();
            }
        });
        addToQ(new Runnable() { // from class: com.tiktok.appevents.TTAppEventLogger$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                SystemInfoUtil.initAppSessionId();
            }
        });
        addToQ(new Runnable() { // from class: com.tiktok.appevents.TTAppEventLogger$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                SystemInfoUtil.initInstallReferrer();
            }
        });
        addToQ(new Runnable() { // from class: com.tiktok.appevents.TTAppEventLogger$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                SystemInfoUtil.updateSensigInfo();
            }
        });
        addToQ(new Runnable() { // from class: com.tiktok.appevents.TTAppEventLogger$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                SystemInfoUtil.initUserAgent();
            }
        });
        addToQ(new Runnable() { // from class: com.tiktok.appevents.TTAppEventLogger$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                TTAppEventsQueue.clearAll();
            }
        });
        addToQ(new Runnable() { // from class: com.tiktok.appevents.TTAppEventLogger$$ExternalSyntheticLambda8
            @Override // java.lang.Runnable
            public final void run() {
                TTEdpAppEventsQueue.clearAll();
            }
        });
        addToQ(new Runnable() { // from class: com.tiktok.appevents.TTAppEventLogger$$ExternalSyntheticLambda9
            @Override // java.lang.Runnable
            public final void run() {
                TTAppEventLogger.lambda$initConfig$2(TikTokBusinessSdk.TTInitCallback.this, sdkInitialized);
            }
        });
        fetchGlobalConfig(0);
        monitorMetric("init_start", TTUtil.getMetaWithTS(Long.valueOf(initTimeMS)), null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0021, code lost:
    
        r1.fail(-2, com.tiktok.util.TTConst.ERROR_MESSAGE_INVALID_ID);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0027, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ void lambda$initConfig$2(final TikTokBusinessSdk.TTInitCallback callback, final AtomicBoolean sdkInitialized) {
        try {
            if (!TextUtils.isEmpty(TikTokBusinessSdk.getTTAppId()) && !TextUtils.isEmpty(TikTokBusinessSdk.getAppId())) {
                sdkInitialized.set(true);
                if (callback != null) {
                    callback.success();
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    void persistEvents() {
        addToQ(new Runnable() { // from class: com.tiktok.appevents.TTAppEventLogger$$ExternalSyntheticLambda19
            @Override // java.lang.Runnable
            public final void run() {
                TTAppEventStorage.persist(null);
            }
        });
    }

    public void trackPurchase(final List<TTPurchaseInfo> purchaseInfos) {
        if (!TikTokBusinessSdk.isSystemActivated()) {
            this.logger.info("Global switch is off, ignore track purchase", new Object[0]);
        } else {
            addToQ(new Runnable() { // from class: com.tiktok.appevents.TTAppEventLogger$$ExternalSyntheticLambda11
                @Override // java.lang.Runnable
                public final void run() {
                    TTAppEventLogger.this.m11611lambda$trackPurchase$4$comtiktokappeventsTTAppEventLogger(purchaseInfos);
                }
            });
        }
    }

    /* renamed from: lambda$trackPurchase$4$com-tiktok-appevents-TTAppEventLogger, reason: not valid java name */
    /* synthetic */ void m11611lambda$trackPurchase$4$comtiktokappeventsTTAppEventLogger(final List purchaseInfos) {
        if (purchaseInfos.isEmpty()) {
            return;
        }
        Iterator it = purchaseInfos.iterator();
        while (it.hasNext()) {
            TTPurchaseInfo tTPurchaseInfo = (TTPurchaseInfo) it.next();
            JSONObject purchaseProps = TTInAppPurchaseManager.getPurchaseProps(tTPurchaseInfo);
            if (purchaseProps != null) {
                track(TTContentsEventConstants.ContentsEventName.EVENT_NAME_PURCHASE, purchaseProps, tTPurchaseInfo.getEventId());
            }
        }
    }

    /* renamed from: startHeart, reason: merged with bridge method [inline-methods] */
    public void m11609lambda$initConfig$1$comtiktokappeventsTTAppEventLogger() {
        TTHandlerUtil.getInstance().removeCallbacks(this.heartRunnable);
        TTHandlerUtil.getInstance().postDelayed(this.heartRunnable, 60000L);
    }

    public void closeHeart() {
        TTHandlerUtil.getInstance().removeCallbacks(this.heartRunnable);
    }

    void startScheduler() {
        int i = TIME_BUFFER;
        if (i != 0) {
            doStartScheduler(i, false);
        }
    }

    void restartScheduler() {
        int i = TIME_BUFFER;
        if (i != 0) {
            doStartScheduler(i, true);
        }
    }

    private void doStartScheduler(final int interval, boolean immediate) {
        try {
            if (this.future == null) {
                this.future = eventLoop.scheduleAtFixedRate(this.batchFlush, immediate ? 0L : interval, interval, TimeUnit.SECONDS);
            }
            if (this.timeFuture != null || TikTokBusinessSdk.nextTimeFlushListener == null) {
                return;
            }
            this.counter = interval;
            this.timeFuture = timerService.scheduleAtFixedRate(new Runnable() { // from class: com.tiktok.appevents.TTAppEventLogger$$ExternalSyntheticLambda13
                @Override // java.lang.Runnable
                public final void run() {
                    TTAppEventLogger.this.m11606lambda$doStartScheduler$5$comtiktokappeventsTTAppEventLogger(interval);
                }
            }, 0L, 1L, TimeUnit.SECONDS);
        } catch (Throwable unused) {
            TikTokBusinessSdk.setSdkGlobalSwitch(false);
        }
    }

    /* renamed from: lambda$doStartScheduler$5$com-tiktok-appevents-TTAppEventLogger, reason: not valid java name */
    /* synthetic */ void m11606lambda$doStartScheduler$5$comtiktokappeventsTTAppEventLogger(final int interval) {
        TikTokBusinessSdk.nextTimeFlushListener.timeLeft(this.counter);
        if (this.counter == 0) {
            this.counter = interval;
        }
        this.counter--;
    }

    void stopScheduler() {
        try {
            ScheduledFuture<?> scheduledFuture = this.future;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                this.future = null;
            }
            ScheduledFuture<?> scheduledFuture2 = this.timeFuture;
            if (scheduledFuture2 != null) {
                scheduledFuture2.cancel(false);
                this.timeFuture = null;
            }
        } catch (Throwable th) {
            this.logger.error(th, "stop scheduler exception", new Object[0]);
        }
    }

    public boolean identify(String externalId, String externalUserName, String phoneNumber, String email) {
        TTUserInfo tTUserInfo = TTUserInfo.sharedInstance;
        if (tTUserInfo.isIdentified()) {
            this.logger.warn("SDK is already identified, if you want to switch to anotheruser account, plz call TiktokBusinessSDK.logout() first and then identify", new Object[0]);
            return false;
        }
        tTUserInfo.setIdentified();
        if (!TextUtils.isEmpty(externalId)) {
            tTUserInfo.setExternalId(externalId);
        }
        if (!TextUtils.isEmpty(externalUserName)) {
            tTUserInfo.setExternalUserName(externalUserName);
        }
        if (!TextUtils.isEmpty(phoneNumber)) {
            tTUserInfo.setPhoneNumber(phoneNumber);
        }
        if (!TextUtils.isEmpty(email)) {
            tTUserInfo.setEmail(email);
        }
        trackEvent(TTAppEvent.TTAppEventType.identify, null, null, null, false);
        flushWithReason(FlushReason.IDENTIFY);
        return true;
    }

    public void logout() {
        TTUserInfo.reset(TikTokBusinessSdk.getApplicationContext(), true);
        flushWithReason(FlushReason.LOGOUT);
    }

    public void track(String event, JSONObject props) {
        trackEvent(TTAppEvent.TTAppEventType.track, event, props, null, false);
    }

    public void track(String event, JSONObject props, String eventId) {
        trackEvent(TTAppEvent.TTAppEventType.track, event, props, eventId, false);
    }

    public void trackEdp(String event, JSONObject props, String eventId) {
        trackEvent(TTAppEvent.TTAppEventType.track, event, props, eventId, true);
    }

    private void trackEvent(final TTAppEvent.TTAppEventType type, final String event, JSONObject props, final String eventId, final boolean edp) {
        if (!TikTokBusinessSdk.isSystemActivated() || TextUtils.isEmpty(TikTokBusinessSdk.getAppId())) {
            return;
        }
        try {
            if ("enhanced_data_postback".equals(props.optString("monitor_type", ""))) {
                TTEDPEventTrack.trackUnityEvent(event, props);
                return;
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (props == null) {
            props = new JSONObject();
        }
        final JSONObject jSONObject = props;
        if (TikTokBusinessSdk.isEnableDebugMode().booleanValue()) {
            this.uiThreadHandler.post(new Runnable() { // from class: com.tiktok.appevents.TTAppEventLogger.3
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (edp) {
                            jSONObject.put("track_source", "edp");
                        }
                        TTAppEvent tTAppEvent = new TTAppEvent(type, event, jSONObject.toString(), eventId, TikTokBusinessSdk.getTTAppIds());
                        tTAppEvent.setScreenShot();
                        TTAppEventLogger.this.addToTask(tTAppEvent, null, null, null, null, edp);
                    } catch (Throwable unused) {
                    }
                }
            });
        } else {
            addToTask(null, type, event, jSONObject, eventId, edp);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addToTask(final TTAppEvent appEvent, final TTAppEvent.TTAppEventType type, final String event, final JSONObject props, final String eventId, final boolean edp) {
        addToQ(new Runnable() { // from class: com.tiktok.appevents.TTAppEventLogger$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                TTAppEventLogger.this.m11605lambda$addToTask$6$comtiktokappeventsTTAppEventLogger(appEvent, edp, props, type, event, eventId);
            }
        });
    }

    /* renamed from: lambda$addToTask$6$com-tiktok-appevents-TTAppEventLogger, reason: not valid java name */
    /* synthetic */ void m11605lambda$addToTask$6$comtiktokappeventsTTAppEventLogger(final TTAppEvent appEvent, final boolean edp, final JSONObject props, final TTAppEvent.TTAppEventType type, final String event, final String eventId) {
        if (appEvent == null) {
            if (edp) {
                try {
                    props.put("track_source", "edp");
                } catch (Throwable unused) {
                    return;
                }
            }
            appEvent = new TTAppEvent(type, event, props.toString(), eventId, TikTokBusinessSdk.getTTAppIds());
        }
        if (edp) {
            TTEdpAppEventsQueue.addEvent(appEvent);
        } else {
            TTAppEventsQueue.addEvent(appEvent);
        }
        if (TTAppEventsQueue.size() + TTEdpAppEventsQueue.size() > 100) {
            m11608lambda$flushWithReason$7$comtiktokappeventsTTAppEventLogger(FlushReason.THRESHOLD);
        }
    }

    public void forceFlush() {
        flushWithReason(FlushReason.FORCE_FLUSH);
    }

    public void flushWithReason(final FlushReason reason) {
        this.logger.debug(reason.name() + " triggered flush", new Object[0]);
        addToQ(new Runnable() { // from class: com.tiktok.appevents.TTAppEventLogger$$ExternalSyntheticLambda17
            @Override // java.lang.Runnable
            public final void run() {
                TTAppEventLogger.this.m11608lambda$flushWithReason$7$comtiktokappeventsTTAppEventLogger(reason);
            }
        });
    }

    private void activateSdk() {
        this.autoEventsManager.trackOnAppOpenEvents();
        startScheduler();
        m11608lambda$flushWithReason$7$comtiktokappeventsTTAppEventLogger(FlushReason.START_UP);
        TTEDPEventTrack.trackFirstAppLaunch();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00cf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: flush, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m11608lambda$flushWithReason$7$comtiktokappeventsTTAppEventLogger(FlushReason reason) {
        int i;
        Throwable th;
        long currentTimeMillis = System.currentTimeMillis();
        TTUtil.checkThread(TAG);
        int i2 = 0;
        if (!TikTokBusinessSdk.isGlobalConfigFetched().booleanValue()) {
            this.logger.info(SKIP_FLUSHING_BECAUSE_GLOBAL_CONFIG_IS_NOT_FETCHED, new Object[0]);
            return;
        }
        if (!TikTokBusinessSdk.isSystemActivated()) {
            this.logger.info(SKIP_FLUSHING_BECAUSE_GLOBAL_SWITCH_IS_TURNED_OFF, new Object[0]);
            return;
        }
        try {
        } catch (Throwable th2) {
            i = 0;
            th = th2;
        }
        if (TikTokBusinessSdk.getNetworkSwitch()) {
            this.logger.debug("Start flush, version %d reason is %s", Integer.valueOf(this.flushId), reason.name());
            TTAppEventPersist readFromDisk = TTAppEventStorage.readFromDisk();
            readFromDisk.addEvents(TTAppEventsQueue.exportAllEvents());
            i = readFromDisk.getAppEvents().size() + TTEdpAppEventsQueue.size();
            try {
                List<TTAppEvent> reportAppEvent = TTRequest.reportAppEvent(TTRequestBuilder.getBasePayloadWithTs(), readFromDisk.getAppEvents(), false);
                TTRequest.reportAppEvent(TTRequestBuilder.getBasePayloadWithTs(), TTEdpAppEventsQueue.exportAllEvents(), true);
                if (!reportAppEvent.isEmpty()) {
                    this.logger.debug("Failed to send %d events, will save to disk", Integer.valueOf(reportAppEvent.size()));
                    TTAppEventStorage.persist(reportAppEvent);
                }
                this.logger.debug("END flush, version %d reason is %s", Integer.valueOf(this.flushId), reason.name());
                this.flushId++;
            } catch (Throwable th3) {
                th = th3;
                TTEdpAppEventsQueue.clearAll();
                TTCrashHandler.handleCrash(TAG, th, 2);
                i2 = i;
                if (i2 != 0) {
                }
                addToQ(new Runnable() { // from class: com.tiktok.appevents.TTAppEventLogger$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        TTCrashHandler.initCrashReporter();
                    }
                });
            }
            i2 = i;
            if (i2 != 0) {
                try {
                    monitorMetric("flush", TTUtil.getMetaWithTS(Long.valueOf(currentTimeMillis)).put("latency", System.currentTimeMillis() - currentTimeMillis).put("type", reason.name()).put("interval", TIME_BUFFER).put(RRWebVideoEvent.JsonKeys.SIZE, i2), null);
                } catch (Exception unused) {
                }
            }
            addToQ(new Runnable() { // from class: com.tiktok.appevents.TTAppEventLogger$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    TTCrashHandler.initCrashReporter();
                }
            });
        }
        this.logger.info(NETWORK_IS_TURNED_OFF, new Object[0]);
        TTAppEventStorage.persist(null);
        if (i2 != 0) {
        }
        addToQ(new Runnable() { // from class: com.tiktok.appevents.TTAppEventLogger$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                TTCrashHandler.initCrashReporter();
            }
        });
    }

    public void destroy() {
        TTAppEventsQueue.clearAll();
        TTEdpAppEventsQueue.clearAll();
        stopScheduler();
    }

    public void addToQ(Runnable task) {
        try {
            eventLoop.execute(task);
        } catch (Throwable th) {
            onExecuteFailed(task, th);
        }
    }

    private void onExecuteFailed(Runnable runnable, Throwable e) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            runnable.run();
        } else {
            this.logger.error(e, "Runnable execute error", new Object[0]);
        }
    }

    private void addToLater(Runnable task, int seconds) {
        try {
            eventLoop.schedule(task, seconds, TimeUnit.SECONDS);
        } catch (Throwable th) {
            onExecuteFailed(task, th);
        }
    }

    public void clearAll() {
        addToQ(new Runnable() { // from class: com.tiktok.appevents.TTAppEventLogger$$ExternalSyntheticLambda12
            @Override // java.lang.Runnable
            public final void run() {
                TTAppEventLogger.this.clearAllImmediately();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAllImmediately() {
        TTAppEventsQueue.clearAll();
        TTEdpAppEventsQueue.clearAll();
        TTAppEventStorage.clearAll();
    }

    public void fetchGlobalConfig(int delaySeconds) {
        addToLater(new Runnable() { // from class: com.tiktok.appevents.TTAppEventLogger$$ExternalSyntheticLambda16
            @Override // java.lang.Runnable
            public final void run() {
                TTAppEventLogger.this.m11607lambda$fetchGlobalConfig$8$comtiktokappeventsTTAppEventLogger();
            }
        }, delaySeconds);
    }

    /* renamed from: lambda$fetchGlobalConfig$8$com-tiktok-appevents-TTAppEventLogger, reason: not valid java name */
    /* synthetic */ void m11607lambda$fetchGlobalConfig$8$comtiktokappeventsTTAppEventLogger() {
        try {
            try {
                this.logger.info("Fetching global config....", new Object[0]);
                JSONObject businessSDKConfig = TTRequest.getBusinessSDKConfig();
                if (businessSDKConfig == null) {
                    this.logger.info("Opt out of initGlobalConfig because global config is null, api returns error", new Object[0]);
                    if (!TikTokBusinessSdk.isSystemActivated() || TikTokBusinessSdk.isActivatedLogicRun) {
                        return;
                    }
                } else {
                    JSONObject jSONObject = (JSONObject) businessSDKConfig.get("business_sdk_config");
                    boolean z = jSONObject.getBoolean(EDPConfig.ConfigConst.ENABLE_SDK);
                    Boolean valueOf = Boolean.valueOf(z);
                    String string = jSONObject.getString("available_version");
                    String string2 = jSONObject.getString("domain");
                    boolean optBoolean = jSONObject.optBoolean("enable_debug_mode", false);
                    TikTokBusinessSdk.setSdkGlobalSwitch(valueOf);
                    this.logger.debug("enable_sdk=" + valueOf, new Object[0]);
                    valueOf.getClass();
                    if (!z) {
                        this.logger.info("Clear all events and stop timers because global switch is not turned on", new Object[0]);
                        clearAllImmediately();
                    }
                    if (optBoolean) {
                        TikTokBusinessSdk.enableDebugMode();
                    } else {
                        TikTokBusinessSdk.disableDebugMode();
                    }
                    TikTokBusinessSdk.setApiAvailableVersion(string);
                    TikTokBusinessSdk.setApiTrackDomain(string2);
                    this.logger.debug("available_version=" + string, new Object[0]);
                    TikTokBusinessSdk.setGlobalConfigFetched();
                    autoTrackRetentionEnable = jSONObject.optBoolean("auto_track_Retention_enable");
                    autoTrackPaymentEnable = jSONObject.optBoolean("auto_track_Payment_enable");
                    TTUnityBridge.setConfigCallback(businessSDKConfig);
                    EDPConfig.optConfig(jSONObject.optJSONObject(EDPConfig.ConfigConst.EDP_NATIVE_SDK_CONFIG));
                    if (!TikTokBusinessSdk.isSystemActivated() || TikTokBusinessSdk.isActivatedLogicRun) {
                        return;
                    }
                }
                TikTokBusinessSdk.isActivatedLogicRun = true;
                activateSdk();
            } catch (JSONException e) {
                e.printStackTrace();
                this.logger.warn("Errors happened during initGlobalConfig because the structure of api result is not correct", new Object[0]);
                if (!TikTokBusinessSdk.isSystemActivated() || TikTokBusinessSdk.isActivatedLogicRun) {
                    return;
                }
                TikTokBusinessSdk.isActivatedLogicRun = true;
                activateSdk();
            } catch (Exception e2) {
                this.logger.warn("Errors occurred during initGlobalConfig because of " + e2.getMessage(), new Object[0]);
                e2.printStackTrace();
                if (!TikTokBusinessSdk.isSystemActivated() || TikTokBusinessSdk.isActivatedLogicRun) {
                    return;
                }
                TikTokBusinessSdk.isActivatedLogicRun = true;
                activateSdk();
            }
        } catch (Throwable th) {
            if (TikTokBusinessSdk.isSystemActivated() && !TikTokBusinessSdk.isActivatedLogicRun) {
                TikTokBusinessSdk.isActivatedLogicRun = true;
                activateSdk();
            }
            throw th;
        }
    }

    public void monitorMetric(final String name, final JSONObject meta, final JSONObject extra) {
        if (metricsEnabled) {
            addToQ(new Runnable() { // from class: com.tiktok.appevents.TTAppEventLogger$$ExternalSyntheticLambda15
                @Override // java.lang.Runnable
                public final void run() {
                    TTAppEventLogger.lambda$monitorMetric$9(name, meta, extra);
                }
            });
        }
    }

    static /* synthetic */ void lambda$monitorMetric$9(final String name, final JSONObject meta, final JSONObject extra) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject = TTRequestBuilder.getHealthMonitorBase();
        } catch (Exception unused) {
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("type", AnalyticsConstantsKt.METRIC);
            jSONObject2.put("name", name);
            if (meta != null) {
                jSONObject2.put("meta", meta);
            }
            if (extra != null) {
                jSONObject2.put("extra", extra);
            }
            jSONObject.put("monitor", jSONObject2);
        } catch (Exception unused2) {
        }
        TTCrashHandler.retryLater(jSONObject);
    }

    public void fetchDeferredDeeplinkWithCompletion(final TikTokBusinessSdk.FetchDeferredDeeplinkCompletion callback) {
        addToQ(new Runnable() { // from class: com.tiktok.appevents.TTAppEventLogger$$ExternalSyntheticLambda10
            @Override // java.lang.Runnable
            public final void run() {
                TTAppEventLogger.lambda$fetchDeferredDeeplinkWithCompletion$10(TikTokBusinessSdk.FetchDeferredDeeplinkCompletion.this);
            }
        });
    }

    static /* synthetic */ void lambda$fetchDeferredDeeplinkWithCompletion$10(final TikTokBusinessSdk.FetchDeferredDeeplinkCompletion callback) {
        try {
            JSONObject jSONObject = new JSONObject(TTRequest.fetchDeferredDeeplinkWithCompletion());
            int optInt = jSONObject.optInt("code");
            String optString = jSONObject.optJSONObject("data").optString("ddl");
            if (optInt != 0 || TextUtils.isEmpty(optString)) {
                callback.completion("", new ErrorData(optInt, jSONObject.optString("message", "")));
            } else {
                callback.completion(optString, null);
            }
        } catch (Throwable unused) {
            callback.completion("", new ErrorData(-2, ErrorData.TT_DDL_MSG_HTTP_ERROR));
        }
    }

    void persistMonitor() {
        addToQ(new Runnable() { // from class: com.tiktok.appevents.TTAppEventLogger$$ExternalSyntheticLambda18
            @Override // java.lang.Runnable
            public final void run() {
                TTCrashHandler.persistToFile();
            }
        });
    }
}
