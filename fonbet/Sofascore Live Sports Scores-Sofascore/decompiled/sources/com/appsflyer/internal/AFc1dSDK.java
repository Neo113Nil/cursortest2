package com.appsflyer.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import android.os.SystemClock;
import android.view.View;
import android.widget.ExpandableListView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.PurchaseHandler;
import com.appsflyer.exception_manager.ExceptionManager;
import com.appsflyer.exception_manager.ExceptionManagerImpl;
import com.appsflyer.exception_manager.SdkData;
import com.appsflyer.sdk_base.exception_manager.ExceptionManagerConfiguration;
import com.appsflyer.sdk_base.logger.LogTag;
import com.appsflyer.sdk_base.logger.LoggerDelegate;
import com.appsflyer.sdk_base.util.OptionalFeaturesValidator;
import com.appsflyer.sdk_base.util.SupportedOptionalFeatures;
import com.appsflyer.share.AppsFlyerConversionListener;
import defpackage.a70;
import java.lang.reflect.Constructor;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class AFc1dSDK implements AFc1aSDK {
    private static final int AFLogger = 30000;
    private ExecutorService AFKeystoreWrapper;
    private SharedPreferences AFLoggerLogLevel;
    private AFe1ySDK AppsFlyerLib;
    private AFf1bSDK afDebugLog;
    private AppsFlyerProperties afErrorLog;
    private AFf1cSDK afInfoLog;
    private AFg1fSDK afWarnLog;
    private ExecutorService d;
    private AFc1hSDK e;
    private ExceptionManager enableTCFDataCollection;
    private PurchaseHandler force;
    private AFi1rSDK getEntries;
    private AFf1oSDK getInstance;
    private AFi1jSDK getLevel;
    private AFb1gSDK getOutOfStore;
    private LoggerDelegate getSdkVersion;
    private AFd1wSDK i;
    private AFf1iSDK init;
    private AFc1sSDK onPause;
    private AFg1aSDK sendPushNotificationData;
    private AFg1dSDK setAdditionalData;
    private AFj1ySDK setAndroidIdData;
    private AFi1hSDK setAppId;
    private AFa1aSDK setAppInviteOneLink;

    @Nullable
    private AFi1wSDK setCollectAndroidID;
    private AFi1zSDK setCustomerUserId;
    private AFd1hSDK setDebugLog;
    private AFh1fSDK setImeiData;
    private AFg1xSDK setOaidData;
    private AFc1gSDK setOneLinkCustomDomain;
    private AFa1mSDK setOutOfStore;
    private AFg1ySDK setPhoneNumber;
    private AFa1kSDK setResolveDeepLinkURLs;
    private AFf1qSDK setUserEmails;
    private AFd1eSDK start;
    private OptionalFeaturesValidator stop;
    private ScheduledExecutorService unregisterClient;
    private AFj1mSDK updateServerUninstallToken;
    private AFf1uSDK v;
    private AFi1lSDK valueOf;
    private AFd1ySDK values;
    private AFc1iSDK w;
    public final AFc1cSDK registerClient = new AFc1cSDK();

    @Nullable
    private volatile AppsFlyerConversionListener collectDataFromLauncherActivity = null;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class AFa1ySDK implements ThreadFactory {
        private static final AtomicInteger unregisterClient = new AtomicInteger();
        private final AtomicInteger AFKeystoreWrapper = new AtomicInteger();

        public AFa1ySDK() {
            unregisterClient.incrementAndGet();
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            int i = unregisterClient.get();
            int incrementAndGet = this.AFKeystoreWrapper.incrementAndGet();
            StringBuilder sb = new StringBuilder("queue-");
            sb.append(i);
            sb.append("-");
            sb.append(incrementAndGet);
            return new Thread(runnable, sb.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String init() {
        return String.format(Locale.US, AFj1ySDK.w, AppsFlyerLib.getInstance().getHostPrefix(), AFa1zSDK.d().getHostName());
    }

    private SharedPreferences s_(Context context) {
        if (this.AFLoggerLogLevel == null) {
            StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
            try {
                this.AFLoggerLogLevel = context.getApplicationContext().getSharedPreferences("appsflyer-data", 0);
            } finally {
                StrictMode.setThreadPolicy(allowThreadDiskReads);
            }
        }
        return this.AFLoggerLogLevel;
    }

    @NonNull
    private synchronized ScheduledExecutorService sendPushNotificationData() {
        ScheduledExecutorService scheduledExecutorService;
        scheduledExecutorService = this.unregisterClient;
        if (scheduledExecutorService == null) {
            scheduledExecutorService = AFc1qSDK.AFLogger();
            this.unregisterClient = scheduledExecutorService;
        }
        return scheduledExecutorService;
    }

    @NonNull
    private synchronized ScheduledExecutorService setAdditionalData() {
        ScheduledExecutorService scheduledExecutorService;
        scheduledExecutorService = this.unregisterClient;
        if (scheduledExecutorService == null) {
            scheduledExecutorService = AFc1qSDK.AFKeystoreWrapper();
            this.unregisterClient = scheduledExecutorService;
        }
        return scheduledExecutorService;
    }

    @NonNull
    private synchronized AFj1ySDK setAppId() {
        AFj1ySDK aFj1ySDK;
        aFj1ySDK = this.setAndroidIdData;
        if (aFj1ySDK == null) {
            aFj1ySDK = new AFj1ySDK(AFKeystoreWrapper());
            this.setAndroidIdData = aFj1ySDK;
        }
        return aFj1ySDK;
    }

    @NonNull
    private synchronized ExecutorService setCollectAndroidID() {
        ExecutorService executorService;
        executorService = this.AFKeystoreWrapper;
        if (executorService == null) {
            executorService = AFc1qSDK.registerClient();
            this.AFKeystoreWrapper = executorService;
        }
        return executorService;
    }

    @NonNull
    private synchronized AFf1iSDK setOneLinkCustomDomain() {
        AFf1iSDK aFf1iSDK;
        aFf1iSDK = this.init;
        if (aFf1iSDK == null) {
            aFf1iSDK = new AFf1iSDK(valueOf(), AFKeystoreWrapper());
            this.init = aFf1iSDK;
        }
        return aFf1iSDK;
    }

    @NonNull
    private synchronized AFd1wSDK setResolveDeepLinkURLs() {
        AFd1wSDK aFd1wSDK;
        aFd1wSDK = this.i;
        if (aFd1wSDK == null) {
            aFd1wSDK = new AFd1wSDK(new AFd1nSDK(AFLogger), unregisterClient());
            this.i = aFd1wSDK;
        }
        return aFd1wSDK;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Nullable
    public ExceptionManagerConfiguration start() {
        AFh1rSDK aFh1rSDK;
        AFh1lSDK aFh1lSDK = w().AFKeystoreWrapper.registerClient;
        if (aFh1lSDK == null || (aFh1rSDK = aFh1lSDK.AFKeystoreWrapper) == null) {
            return null;
        }
        return aFh1rSDK.d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ SharedPreferences t_() {
        Context context = this.registerClient.d;
        if (context != null) {
            return s_(context);
        }
        a70.r("Context must be set via setContext method before calling this dependency.");
        return null;
    }

    @Override // com.appsflyer.internal.AFc1aSDK
    @NonNull
    public final synchronized AFc1hSDK AFKeystoreWrapper() {
        AFc1hSDK aFc1hSDK;
        try {
            aFc1hSDK = this.e;
            if (aFc1hSDK == null) {
                AFc1cSDK valueOf = valueOf();
                AFc1pSDK registerClient = registerClient();
                AFc1gSDK aFc1gSDK = this.setOneLinkCustomDomain;
                if (aFc1gSDK == null) {
                    aFc1gSDK = new AFc1gSDK();
                    this.setOneLinkCustomDomain = aFc1gSDK;
                }
                aFc1hSDK = new AFc1hSDK(valueOf, registerClient, aFc1gSDK, unregisterClient());
                this.e = aFc1hSDK;
            }
        } catch (Throwable th) {
            throw th;
        }
        return aFc1hSDK;
    }

    @Override // com.appsflyer.internal.AFc1aSDK
    @NonNull
    public final synchronized AppsFlyerProperties AFLogger() {
        AppsFlyerProperties appsFlyerProperties;
        appsFlyerProperties = this.afErrorLog;
        if (appsFlyerProperties == null) {
            appsFlyerProperties = new AFa1vSDK(registerClient());
            this.afErrorLog = appsFlyerProperties;
        }
        return appsFlyerProperties;
    }

    @Override // com.appsflyer.internal.AFc1aSDK
    @NonNull
    public final synchronized AFd1ySDK AFLoggerLogLevel() {
        AFd1ySDK aFd1ySDK;
        aFd1ySDK = this.values;
        if (aFd1ySDK == null) {
            aFd1ySDK = new AFd1xSDK(this);
            this.values = aFd1ySDK;
        }
        return aFd1ySDK;
    }

    @Override // com.appsflyer.internal.AFc1aSDK
    @NonNull
    public final synchronized AFd1hSDK AppsFlyerLib() {
        AFd1hSDK aFd1hSDK;
        aFd1hSDK = this.setDebugLog;
        if (aFd1hSDK == null) {
            aFd1hSDK = new AFd1hSDK(AFKeystoreWrapper(), registerClient());
            this.setDebugLog = aFd1hSDK;
        }
        return aFd1hSDK;
    }

    @Override // com.appsflyer.internal.AFc1aSDK
    @NonNull
    public final synchronized AFi1lSDK afDebugLog() {
        AFi1lSDK aFi1lSDK;
        try {
            aFi1lSDK = this.valueOf;
            if (aFi1lSDK == null) {
                AFi1rSDK aFi1rSDK = this.getEntries;
                if (aFi1rSDK == null) {
                    aFi1rSDK = new AFi1nSDK();
                    this.getEntries = aFi1rSDK;
                }
                aFi1lSDK = new AFi1lSDK(this, aFi1rSDK);
                this.valueOf = aFi1lSDK;
            }
        } catch (Throwable th) {
            throw th;
        }
        return aFi1lSDK;
    }

    @Override // com.appsflyer.internal.AFc1aSDK
    @NonNull
    public final AFi1jSDK afErrorLog() {
        AFi1jSDK aFi1jSDK = this.getLevel;
        if (aFi1jSDK != null) {
            return aFi1jSDK;
        }
        Context context = this.registerClient.d;
        if (context == null) {
            a70.r("Context must be set via setContext method before calling this dependency.");
            return null;
        }
        AFi1iSDK aFi1iSDK = new AFi1iSDK(context, setCollectAndroidID());
        this.getLevel = aFi1iSDK;
        return aFi1iSDK;
    }

    @Override // com.appsflyer.internal.AFc1aSDK
    @NonNull
    public final LoggerDelegate afInfoLog() {
        LoggerDelegate loggerDelegate = this.getSdkVersion;
        if (loggerDelegate != null) {
            return loggerDelegate;
        }
        LoggerDelegate loggerDelegate2 = new LoggerDelegate(AFLogger.INSTANCE);
        this.getSdkVersion = loggerDelegate2;
        return loggerDelegate2;
    }

    @Override // com.appsflyer.internal.AFc1aSDK
    @NonNull
    public final synchronized AFe1ySDK afWarnLog() {
        AFe1ySDK aFe1ySDK;
        aFe1ySDK = this.AppsFlyerLib;
        if (aFe1ySDK == null) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 6, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>() { // from class: com.appsflyer.internal.AFc1dSDK.2
                @Override // java.util.concurrent.LinkedBlockingQueue, java.util.Queue, java.util.concurrent.BlockingQueue
                public final /* synthetic */ boolean offer(Object obj) {
                    Runnable runnable = (Runnable) obj;
                    if (isEmpty()) {
                        return super.offer(runnable);
                    }
                    return false;
                }
            }, new AFa1ySDK());
            threadPoolExecutor.setRejectedExecutionHandler(new j());
            aFe1ySDK = new AFe1ySDK(threadPoolExecutor);
            this.AppsFlyerLib = aFe1ySDK;
        }
        return aFe1ySDK;
    }

    @Override // com.appsflyer.internal.AFc1aSDK
    @NonNull
    public final AFd1tSDK d() {
        AFd1wSDK resolveDeepLinkURLs = setResolveDeepLinkURLs();
        AFc1hSDK AFKeystoreWrapper = AFKeystoreWrapper();
        AFd1hSDK AppsFlyerLib = AppsFlyerLib();
        AFj1ySDK appId = setAppId();
        AFj1mSDK aFj1mSDK = this.updateServerUninstallToken;
        if (aFj1mSDK == null) {
            aFj1mSDK = new AFj1lSDK();
            this.updateServerUninstallToken = aFj1mSDK;
        }
        return new AFd1tSDK(resolveDeepLinkURLs, AFKeystoreWrapper, AppsFlyerLib, appId, aFj1mSDK, values());
    }

    @Override // com.appsflyer.internal.AFc1aSDK
    @NonNull
    public final synchronized PurchaseHandler e() {
        PurchaseHandler purchaseHandler;
        purchaseHandler = this.force;
        if (purchaseHandler == null) {
            purchaseHandler = new PurchaseHandler(this);
            this.force = purchaseHandler;
        }
        return purchaseHandler;
    }

    @Override // com.appsflyer.internal.AFc1aSDK
    @NonNull
    public final AFh1fSDK enableTCFDataCollection() {
        AFh1fSDK aFh1fSDK = this.setImeiData;
        if (aFh1fSDK != null) {
            return aFh1fSDK;
        }
        Context context = this.registerClient.d;
        if (context == null) {
            a70.r("Context must be set via setContext method before calling this dependency.");
            return null;
        }
        AFh1fSDK aFh1fSDK2 = new AFh1fSDK(context);
        this.setImeiData = aFh1fSDK2;
        return aFh1fSDK2;
    }

    @Override // com.appsflyer.internal.AFc1aSDK
    @NonNull
    public final synchronized AFg1fSDK force() {
        AFg1fSDK aFg1fSDK;
        aFg1fSDK = this.afWarnLog;
        if (aFg1fSDK == null) {
            aFg1fSDK = new AFg1fSDK(registerClient(), AFKeystoreWrapper());
            this.afWarnLog = aFg1fSDK;
        }
        return aFg1fSDK;
    }

    @Override // com.appsflyer.internal.AFc1aSDK
    @NonNull
    public final synchronized AFc1sSDK getEntries() {
        AFc1sSDK aFc1sSDK;
        aFc1sSDK = this.onPause;
        if (aFc1sSDK == null) {
            aFc1sSDK = new AFc1tSDK(valueOf(), registerClient());
            this.onPause = aFc1sSDK;
        }
        return aFc1sSDK;
    }

    @Override // com.appsflyer.internal.AFc1aSDK
    @NonNull
    public final AFj1mSDK getInstance() {
        AFj1mSDK aFj1mSDK = this.updateServerUninstallToken;
        if (aFj1mSDK != null) {
            return aFj1mSDK;
        }
        AFj1lSDK aFj1lSDK = new AFj1lSDK();
        this.updateServerUninstallToken = aFj1lSDK;
        return aFj1lSDK;
    }

    @Override // com.appsflyer.internal.AFc1aSDK
    @Nullable
    public final synchronized ExceptionManager getLevel() {
        try {
            OptionalFeaturesValidator optionalFeaturesValidator = this.stop;
            if (optionalFeaturesValidator == null) {
                optionalFeaturesValidator = new AFj1qSDK();
                this.stop = optionalFeaturesValidator;
            }
            if (optionalFeaturesValidator.isOptionalFeaturePresent(SupportedOptionalFeatures.EXCEPTION_MANAGER) && this.enableTCFDataCollection == null) {
                AFf1oSDK values = values();
                String str = (String) AFf1oSDK.AFLogger(new Object[]{values}, 343398987, -343398985, System.identityHashCode(values));
                com.appsflyer.c cVar = new com.appsflyer.c(2);
                AFKeystoreWrapper();
                String d = AFc1hSDK.d();
                String unregisterClient = AFb1mSDK.unregisterClient(AFKeystoreWrapper().AFKeystoreWrapper);
                String packageName = AFKeystoreWrapper().registerClient.d.getPackageName();
                AFj1mSDK aFj1mSDK = this.updateServerUninstallToken;
                if (aFj1mSDK == null) {
                    aFj1mSDK = new AFj1lSDK();
                    this.updateServerUninstallToken = aFj1mSDK;
                }
                SdkData sdkData = new SdkData(str, cVar, d, unregisterClient, packageName, aFj1mSDK.d());
                Context context = this.registerClient.d;
                if (context == null) {
                    throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
                }
                this.enableTCFDataCollection = new ExceptionManagerImpl(sdkData, context, unregisterClient(), registerClient().p_(), new k(this, 3), new a(6));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.enableTCFDataCollection;
    }

    @Override // com.appsflyer.internal.AFc1aSDK
    @NonNull
    public final AFa1kSDK getOutOfStore() {
        AFa1kSDK aFa1kSDK = this.setResolveDeepLinkURLs;
        if (aFa1kSDK != null) {
            return aFa1kSDK;
        }
        AFa1jSDK aFa1jSDK = new AFa1jSDK(registerClient());
        this.setResolveDeepLinkURLs = aFa1jSDK;
        return aFa1jSDK;
    }

    @Override // com.appsflyer.internal.AFc1aSDK
    @NonNull
    public final AFi1zSDK getSdkVersion() {
        AFi1zSDK aFi1zSDK = this.setCustomerUserId;
        if (aFi1zSDK != null) {
            return aFi1zSDK;
        }
        AFh1bSDK aFh1bSDK = new AFh1bSDK();
        this.setCustomerUserId = aFh1bSDK;
        return aFh1bSDK;
    }

    @Override // com.appsflyer.internal.AFc1aSDK
    @NonNull
    public final AFf1bSDK i() {
        AFf1bSDK aFf1bSDK = this.afDebugLog;
        if (aFf1bSDK == null) {
            Context context = this.registerClient.d;
            aFf1bSDK = null;
            if (context != null) {
                AFj1mSDK aFj1mSDK = this.updateServerUninstallToken;
                if (aFj1mSDK == null) {
                    aFj1mSDK = new AFj1lSDK();
                    this.updateServerUninstallToken = aFj1mSDK;
                }
                AFg1xSDK aFg1xSDK = this.setOaidData;
                if (aFg1xSDK == null) {
                    aFg1xSDK = new AFg1zSDK();
                    this.setOaidData = aFg1xSDK;
                }
                AFi1jSDK aFi1jSDK = this.getLevel;
                if (aFi1jSDK == null) {
                    Context context2 = this.registerClient.d;
                    if (context2 == null) {
                        a70.r("Context must be set via setContext method before calling this dependency.");
                        return null;
                    }
                    aFi1jSDK = new AFi1iSDK(context2, setCollectAndroidID());
                    this.getLevel = aFi1jSDK;
                }
                AFg1ySDK aFg1ySDK = this.setPhoneNumber;
                if (aFg1ySDK == null) {
                    aFg1ySDK = new AFf1aSDK();
                    this.setPhoneNumber = aFg1ySDK;
                }
                AFg1fSDK force = force();
                AFj1mSDK aFj1mSDK2 = aFj1mSDK;
                AFg1xSDK aFg1xSDK2 = aFg1xSDK;
                AFi1jSDK aFi1jSDK2 = aFi1jSDK;
                AFg1ySDK aFg1ySDK2 = aFg1ySDK;
                AFc1pSDK registerClient = registerClient();
                AFc1hSDK AFKeystoreWrapper = AFKeystoreWrapper();
                AFh1fSDK aFh1fSDK = this.setImeiData;
                if (aFh1fSDK == null) {
                    Context context3 = this.registerClient.d;
                    if (context3 == null) {
                        a70.r("Context must be set via setContext method before calling this dependency.");
                        return null;
                    }
                    aFh1fSDK = new AFh1fSDK(context3);
                    this.setImeiData = aFh1fSDK;
                }
                AFh1fSDK aFh1fSDK2 = aFh1fSDK;
                AFf1oSDK values = values();
                AFc1cSDK valueOf = valueOf();
                AFf1iSDK oneLinkCustomDomain = setOneLinkCustomDomain();
                AFc1gSDK aFc1gSDK = this.setOneLinkCustomDomain;
                if (aFc1gSDK == null) {
                    aFc1gSDK = new AFc1gSDK();
                    this.setOneLinkCustomDomain = aFc1gSDK;
                }
                AFg1uSDK aFg1uSDK = new AFg1uSDK(context, aFj1mSDK2, aFg1xSDK2, aFi1jSDK2, aFg1ySDK2, force, registerClient, AFKeystoreWrapper, aFh1fSDK2, values, valueOf, oneLinkCustomDomain, aFc1gSDK, AFLogger());
                this.afDebugLog = aFg1uSDK;
                return aFg1uSDK;
            }
            a70.r("Context must be set via setContext method before calling this dependency.");
        }
        return aFf1bSDK;
    }

    @Override // com.appsflyer.internal.AFc1aSDK
    @NonNull
    public final synchronized AFa1mSDK onPause() {
        AFa1mSDK aFa1mSDK;
        aFa1mSDK = this.setOutOfStore;
        if (aFa1mSDK == null) {
            aFa1mSDK = new AFa1mSDK(this);
            this.setOutOfStore = aFa1mSDK;
        }
        return aFa1mSDK;
    }

    @Override // com.appsflyer.internal.AFc1aSDK
    @NonNull
    public final AFc1pSDK registerClient() {
        AFc1iSDK aFc1iSDK = this.w;
        if (aFc1iSDK != null) {
            return aFc1iSDK;
        }
        AFc1iSDK aFc1iSDK2 = new AFc1iSDK(new AFd1zSDK(new k(this, 2)));
        this.w = aFc1iSDK2;
        return aFc1iSDK2;
    }

    @Override // com.appsflyer.internal.AFc1aSDK
    @NonNull
    public final AFg1dSDK setAndroidIdData() {
        AFg1dSDK aFg1dSDK = this.setAdditionalData;
        if (aFg1dSDK != null) {
            return aFg1dSDK;
        }
        AFg1eSDK aFg1eSDK = new AFg1eSDK(this);
        this.setAdditionalData = aFg1eSDK;
        return aFg1eSDK;
    }

    @Override // com.appsflyer.internal.AFc1aSDK
    @Nullable
    public final AFg1aSDK setAppInviteOneLink() {
        if (AFg1bSDK.unregisterClient() && this.sendPushNotificationData == null) {
            this.sendPushNotificationData = new AFh1ySDK(AFKeystoreWrapper(), afDebugLog());
        }
        return this.sendPushNotificationData;
    }

    @Override // com.appsflyer.internal.AFc1aSDK
    @NonNull
    public final synchronized AFe1xSDK setCustomerUserId() {
        AFd1eSDK aFd1eSDK;
        aFd1eSDK = this.start;
        if (aFd1eSDK == null) {
            aFd1eSDK = new AFd1eSDK(registerClient(), AFLogger(), afWarnLog(), this);
            this.start = aFd1eSDK;
        }
        return aFd1eSDK;
    }

    @Override // com.appsflyer.internal.AFc1aSDK
    @Nullable
    public final AFi1wSDK setDebugLog() {
        try {
            if (this.setCollectAndroidID == null) {
                try {
                    Object[] objArr = {AFKeystoreWrapper(), valueOf(), values()};
                    Map map = AFi1ySDK.stop;
                    Object obj = map.get(57368837);
                    if (obj == null) {
                        obj = ((Class) AFi1ySDK.d((char) (6756 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), 35 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), View.combineMeasuredStates(0, 0))).getDeclaredConstructor(AFc1hSDK.class, AFc1cSDK.class, AFf1oSDK.class);
                        map.put(57368837, obj);
                    }
                    this.setCollectAndroidID = (AFi1wSDK) ((Constructor) obj).newInstance(objArr);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            AFLogger.INSTANCE.e(LogTag.PLAY_INTEGRITY_API, th2.getMessage() != null ? th2.getMessage() : "", th2, false, false);
        }
        return this.setCollectAndroidID;
    }

    @Override // com.appsflyer.internal.AFc1aSDK
    @NonNull
    public final AFc1gSDK setImeiData() {
        AFc1gSDK aFc1gSDK = this.setOneLinkCustomDomain;
        if (aFc1gSDK != null) {
            return aFc1gSDK;
        }
        AFc1gSDK aFc1gSDK2 = new AFc1gSDK();
        this.setOneLinkCustomDomain = aFc1gSDK2;
        return aFc1gSDK2;
    }

    @Override // com.appsflyer.internal.AFc1aSDK
    @NonNull
    public final AFb1gSDK setOaidData() {
        AFb1gSDK aFb1gSDK = this.getOutOfStore;
        if (aFb1gSDK != null) {
            return aFb1gSDK;
        }
        AFb1aSDK aFb1aSDK = new AFb1aSDK(setAdditionalData(), onPause());
        this.getOutOfStore = aFb1aSDK;
        return aFb1aSDK;
    }

    @Override // com.appsflyer.internal.AFc1aSDK
    @Nullable
    public final AppsFlyerConversionListener setOutOfStore() {
        return this.collectDataFromLauncherActivity;
    }

    @Override // com.appsflyer.internal.AFc1aSDK
    @NonNull
    public final AFb1cSDK setPhoneNumber() {
        AFc1gSDK aFc1gSDK = this.setOneLinkCustomDomain;
        if (aFc1gSDK == null) {
            aFc1gSDK = new AFc1gSDK();
            this.setOneLinkCustomDomain = aFc1gSDK;
        }
        return new AFc1uSDK(aFc1gSDK, valueOf(), values());
    }

    @Override // com.appsflyer.internal.AFc1aSDK
    @NonNull
    public final synchronized AFi1hSDK setUserEmails() {
        AFi1hSDK aFi1hSDK;
        aFi1hSDK = this.setAppId;
        if (aFi1hSDK == null) {
            aFi1hSDK = new AFi1gSDK(new AFd1zSDK(new k(this, 0)), new AFd1zSDK(new k(this, 1)));
            this.setAppId = aFi1hSDK;
        }
        return aFi1hSDK;
    }

    @Override // com.appsflyer.internal.AFc1aSDK
    @NonNull
    public final synchronized AFa1aSDK stop() {
        AFa1aSDK aFa1aSDK;
        aFa1aSDK = this.setAppInviteOneLink;
        if (aFa1aSDK == null) {
            aFa1aSDK = new AFb1uSDK(valueOf());
            this.setAppInviteOneLink = aFa1aSDK;
        }
        return aFa1aSDK;
    }

    @Override // com.appsflyer.internal.AFc1aSDK
    @NonNull
    public final synchronized ExecutorService unregisterClient() {
        ExecutorService executorService;
        executorService = this.d;
        if (executorService == null) {
            executorService = AFc1qSDK.d();
            this.d = executorService;
        }
        return executorService;
    }

    @Override // com.appsflyer.internal.AFc1aSDK
    @NonNull
    public final AFf1qSDK updateServerUninstallToken() {
        AFf1qSDK aFf1qSDK = this.setUserEmails;
        if (aFf1qSDK != null) {
            return aFf1qSDK;
        }
        Context context = this.registerClient.d;
        if (context == null) {
            a70.r("Context must be set via setContext method before calling this dependency.");
            return null;
        }
        AFc1gSDK aFc1gSDK = this.setOneLinkCustomDomain;
        if (aFc1gSDK == null) {
            aFc1gSDK = new AFc1gSDK();
            this.setOneLinkCustomDomain = aFc1gSDK;
        }
        AFf1hSDK aFf1hSDK = new AFf1hSDK(context, aFc1gSDK);
        AFc1gSDK aFc1gSDK2 = this.setOneLinkCustomDomain;
        if (aFc1gSDK2 == null) {
            aFc1gSDK2 = new AFc1gSDK();
            this.setOneLinkCustomDomain = aFc1gSDK2;
        }
        AFf1kSDK aFf1kSDK = new AFf1kSDK(aFf1hSDK, aFc1gSDK2);
        this.setUserEmails = aFf1kSDK;
        return aFf1kSDK;
    }

    @Override // com.appsflyer.internal.AFc1aSDK
    @NonNull
    public final AFf1cSDK v() {
        AFf1cSDK aFf1cSDK = this.afInfoLog;
        if (aFf1cSDK != null) {
            return aFf1cSDK;
        }
        AFa1aSDK stop = stop();
        AFi1lSDK afDebugLog = afDebugLog();
        AFc1hSDK AFKeystoreWrapper = AFKeystoreWrapper();
        AFc1gSDK aFc1gSDK = this.setOneLinkCustomDomain;
        if (aFc1gSDK == null) {
            aFc1gSDK = new AFc1gSDK();
            this.setOneLinkCustomDomain = aFc1gSDK;
        }
        AFf1dSDK aFf1dSDK = new AFf1dSDK(this, stop, afDebugLog, AFKeystoreWrapper, aFc1gSDK, valueOf(), i(), values(), AFLogger(), sendPushNotificationData());
        this.afInfoLog = aFf1dSDK;
        return aFf1dSDK;
    }

    @Override // com.appsflyer.internal.AFc1aSDK
    @NonNull
    public final synchronized AFc1cSDK valueOf() {
        return this.registerClient;
    }

    @Override // com.appsflyer.internal.AFc1aSDK
    @NonNull
    public final synchronized AFf1oSDK values() {
        AFf1oSDK aFf1oSDK;
        try {
            aFf1oSDK = this.getInstance;
            if (aFf1oSDK == null) {
                AFc1cSDK valueOf = valueOf();
                OptionalFeaturesValidator optionalFeaturesValidator = this.stop;
                if (optionalFeaturesValidator == null) {
                    optionalFeaturesValidator = new AFj1qSDK();
                    this.stop = optionalFeaturesValidator;
                }
                aFf1oSDK = new AFf1oSDK(valueOf, optionalFeaturesValidator);
                this.getInstance = aFf1oSDK;
            }
        } catch (Throwable th) {
            throw th;
        }
        return aFf1oSDK;
    }

    @Override // com.appsflyer.internal.AFc1aSDK
    @NonNull
    public final synchronized AFf1uSDK w() {
        AFf1uSDK aFf1uSDK;
        try {
            aFf1uSDK = this.v;
            if (aFf1uSDK == null) {
                AFf1tSDK aFf1tSDK = new AFf1tSDK(registerClient());
                AFc1hSDK AFKeystoreWrapper = AFKeystoreWrapper();
                AFc1gSDK aFc1gSDK = this.setOneLinkCustomDomain;
                if (aFc1gSDK == null) {
                    aFc1gSDK = new AFc1gSDK();
                    this.setOneLinkCustomDomain = aFc1gSDK;
                }
                AFf1vSDK aFf1vSDK = new AFf1vSDK(AFKeystoreWrapper, aFf1tSDK, aFc1gSDK);
                AFf1rSDK aFf1rSDK = new AFf1rSDK();
                AFc1hSDK AFKeystoreWrapper2 = AFKeystoreWrapper();
                AFf1oSDK values = values();
                AFd1tSDK d = d();
                AFc1gSDK aFc1gSDK2 = this.setOneLinkCustomDomain;
                if (aFc1gSDK2 == null) {
                    aFc1gSDK2 = new AFc1gSDK();
                    this.setOneLinkCustomDomain = aFc1gSDK2;
                }
                AFf1uSDK aFf1uSDK2 = new AFf1uSDK(aFf1rSDK, AFKeystoreWrapper2, values, aFf1tSDK, d, aFf1vSDK, aFc1gSDK2, afWarnLog());
                this.v = aFf1uSDK2;
                aFf1uSDK = aFf1uSDK2;
            }
        } catch (Throwable th) {
            throw th;
        }
        return aFf1uSDK;
    }

    @Override // com.appsflyer.internal.AFc1aSDK
    public final void AFLogger(@Nullable AppsFlyerConversionListener appsFlyerConversionListener) {
        this.collectDataFromLauncherActivity = appsFlyerConversionListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Unit d(String str) {
        AFLogger.INSTANCE.d(LogTag.EXCEPTION_MANAGER, str);
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        try {
            threadPoolExecutor.getQueue().put(runnable);
        } catch (InterruptedException e) {
            AFLogger.INSTANCE.e(LogTag.GENERAL, "Could not create executor for queue", e, false, false);
            Thread.currentThread().interrupt();
        }
    }
}
