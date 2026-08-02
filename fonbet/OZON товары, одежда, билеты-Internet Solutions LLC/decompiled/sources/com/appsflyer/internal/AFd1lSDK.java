package com.appsflyer.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.PurchaseHandler;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class AFd1lSDK implements AFd1mSDK {
    private static final int values = (int) TimeUnit.SECONDS.toMillis(30);
    public final AFd1kSDK AFInAppEventParameterName = new AFd1kSDK();
    private ExecutorService AFInAppEventType;
    private ScheduledExecutorService AFKeystoreWrapper;
    private AFd1sSDK AFLogger;
    private AFh1aSDK AFLogger$LogLevel;
    private AFd1uSDK AFVersionDeclaration;
    private AFc1oSDK AppsFlyer2dXConversionCallback;
    private AFi1qSDK afDebugLog;
    private AFg1xSDK afErrorLog;
    private AFd1xSDK afErrorLogForExcManagerOnly;
    private AFe1fSDK afInfoLog;
    private AFc1hSDK afLogForce;
    private AFd1hSDK afRDLog;
    private AFb1vSDK afVerboseLog;
    private AFe1gSDK afWarnLog;

    /* renamed from: d, reason: collision with root package name */
    private AFe1vSDK f57387d;

    /* renamed from: e, reason: collision with root package name */
    private AFf1bSDK f57388e;
    private AFg1qSDK force;
    private AFc1uSDK getLevel;

    /* renamed from: i, reason: collision with root package name */
    private AFb1bSDK f57389i;
    private AFg1fSDK init;
    private AFi1ySDK onAppOpenAttributionNative;
    private AFg1pSDK onDeepLinkingNative;
    private AFb1ySDK onInstallConversionDataLoadedNative;
    private AFg1vSDK onInstallConversionFailureNative;
    private AFd1qSDK onResponseNative;
    private AFg1cSDK registerClient;
    private PurchaseHandler unregisterClient;

    /* renamed from: v, reason: collision with root package name */
    private AFi1iSDK f57390v;
    private ExecutorService valueOf;

    /* renamed from: w, reason: collision with root package name */
    private AFi1dSDK f57391w;

    static class AFa1vSDK implements ThreadFactory {
        private static final AtomicInteger values = new AtomicInteger();
        private final AtomicInteger AFInAppEventType = new AtomicInteger();

        public AFa1vSDK() {
            values.incrementAndGet();
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            int i11 = values.get();
            int incrementAndGet = this.AFInAppEventType.incrementAndGet();
            StringBuilder sb2 = new StringBuilder("queue-");
            sb2.append(i11);
            sb2.append("-");
            sb2.append(incrementAndGet);
            return new Thread(runnable, sb2.toString());
        }
    }

    @NonNull
    private synchronized AFe1vSDK init() {
        try {
            if (this.f57387d == null) {
                this.f57387d = new AFe1vSDK(new AFe1sSDK(values), AFInAppEventParameterName());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f57387d;
    }

    @NonNull
    private synchronized AFg1pSDK onConversionDataSuccess() {
        try {
            if (this.onDeepLinkingNative == null) {
                this.onDeepLinkingNative = new AFg1pSDK(w(), AFInAppEventType());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.onDeepLinkingNative;
    }

    @NonNull
    private synchronized ExecutorService onInstallConversionDataLoadedNative() {
        try {
            if (this.valueOf == null) {
                ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
                Intrinsics.checkNotNullExpressionValue(newSingleThreadExecutor, "");
                this.valueOf = newSingleThreadExecutor;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.valueOf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.appsflyer.internal.AFd1mSDK
    @NonNull
    /* renamed from: onResponseNative, reason: merged with bridge method [inline-methods] */
    public synchronized AFd1hSDK onAppOpenAttributionNative() {
        try {
            if (this.afRDLog == null) {
                this.afRDLog = new AFd1hSDK(this);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.afRDLog;
    }

    @Override // com.appsflyer.internal.AFd1mSDK
    @NonNull
    public final synchronized ExecutorService AFInAppEventParameterName() {
        try {
            if (this.AFInAppEventType == null) {
                this.AFInAppEventType = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.AFInAppEventType;
    }

    @Override // com.appsflyer.internal.AFd1mSDK
    @NonNull
    public final synchronized AFd1sSDK AFInAppEventType() {
        try {
            if (this.AFLogger == null) {
                AFd1kSDK w11 = w();
                Context context = this.AFInAppEventParameterName.valueOf;
                if (context == null) {
                    throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
                }
                AFd1pSDK aFd1pSDK = new AFd1pSDK(AFb1tSDK.AFInAppEventType(context));
                if (this.onResponseNative == null) {
                    this.onResponseNative = new AFd1qSDK();
                }
                this.AFLogger = new AFd1sSDK(w11, aFd1pSDK, this.onResponseNative);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.AFLogger;
    }

    @Override // com.appsflyer.internal.AFd1mSDK
    @NonNull
    public final AFe1wSDK AFKeystoreWrapper() {
        return new AFe1wSDK(init(), AFInAppEventType(), AppsFlyerProperties.getInstance(), afVerboseLog());
    }

    @Override // com.appsflyer.internal.AFd1mSDK
    @NonNull
    public final synchronized AFg1cSDK AFLogger() {
        try {
            if (this.registerClient == null) {
                this.registerClient = new AFg1cSDK(values());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.registerClient;
    }

    @Override // com.appsflyer.internal.AFd1mSDK
    @NonNull
    public final AFd1xSDK AFLogger$LogLevel() {
        if (this.afErrorLogForExcManagerOnly == null) {
            ExecutorService onInstallConversionDataLoadedNative = onInstallConversionDataLoadedNative();
            ScheduledExecutorService valueOf = valueOf();
            AFc1uSDK afWarnLog = afWarnLog();
            if (this.onAppOpenAttributionNative == null) {
                this.onAppOpenAttributionNative = new AFi1xSDK();
            }
            this.afErrorLogForExcManagerOnly = new AFd1vSDK(onInstallConversionDataLoadedNative, valueOf, afWarnLog, this.onAppOpenAttributionNative);
        }
        return this.afErrorLogForExcManagerOnly;
    }

    @Override // com.appsflyer.internal.AFd1mSDK
    @NonNull
    public final AFi1ySDK AFVersionDeclaration() {
        if (this.onAppOpenAttributionNative == null) {
            this.onAppOpenAttributionNative = new AFi1xSDK();
        }
        return this.onAppOpenAttributionNative;
    }

    @Override // com.appsflyer.internal.AFd1mSDK
    @NonNull
    public final AFc1oSDK AppsFlyer2dXConversionCallback() {
        if (this.AppsFlyer2dXConversionCallback == null) {
            this.AppsFlyer2dXConversionCallback = new AFc1eSDK(values());
        }
        return this.AppsFlyer2dXConversionCallback;
    }

    @Override // com.appsflyer.internal.AFd1mSDK
    @NonNull
    public final AFi1qSDK afDebugLog() {
        if (this.afDebugLog == null) {
            this.afDebugLog = new AFi1pSDK();
        }
        return this.afDebugLog;
    }

    @Override // com.appsflyer.internal.AFd1mSDK
    @NonNull
    public final synchronized AFc1hSDK afErrorLog() {
        try {
            if (this.afLogForce == null) {
                this.afLogForce = new AFd1zSDK(w());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.afLogForce;
    }

    @Override // com.appsflyer.internal.AFd1mSDK
    @NonNull
    public final AFd1qSDK afErrorLogForExcManagerOnly() {
        if (this.onResponseNative == null) {
            this.onResponseNative = new AFd1qSDK();
        }
        return this.onResponseNative;
    }

    @Override // com.appsflyer.internal.AFd1mSDK
    @NonNull
    public final synchronized AFe1fSDK afInfoLog() {
        try {
            if (this.afInfoLog == null) {
                ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 6, 300L, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>() { // from class: com.appsflyer.internal.AFd1lSDK.1
                    /* JADX INFO: Access modifiers changed from: private */
                    @Override // java.util.concurrent.LinkedBlockingQueue, java.util.Queue, java.util.concurrent.BlockingQueue
                    /* renamed from: AFKeystoreWrapper, reason: merged with bridge method [inline-methods] */
                    public boolean offer(Runnable runnable) {
                        if (isEmpty()) {
                            return super.offer(runnable);
                        }
                        return false;
                    }
                }, new AFa1vSDK());
                threadPoolExecutor.setRejectedExecutionHandler(new i());
                this.afInfoLog = new AFe1fSDK(threadPoolExecutor);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.afInfoLog;
    }

    @Override // com.appsflyer.internal.AFd1mSDK
    @NonNull
    public final AFg1fSDK afLogForce() {
        if (this.init == null) {
            this.init = new AFh1ySDK(this);
        }
        return this.init;
    }

    @Override // com.appsflyer.internal.AFd1mSDK
    @NonNull
    public final synchronized AFb1vSDK afRDLog() {
        try {
            if (this.afVerboseLog == null) {
                this.afVerboseLog = new AFb1iSDK(w());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.afVerboseLog;
    }

    @Override // com.appsflyer.internal.AFd1mSDK
    @NonNull
    public final synchronized AFe1gSDK afVerboseLog() {
        try {
            if (this.afWarnLog == null) {
                this.afWarnLog = new AFe1gSDK(AFInAppEventType(), values());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.afWarnLog;
    }

    @Override // com.appsflyer.internal.AFd1mSDK
    @NonNull
    public final synchronized AFc1uSDK afWarnLog() {
        try {
            if (this.getLevel == null) {
                this.getLevel = new AFc1uSDK(this);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.getLevel;
    }

    @Override // com.appsflyer.internal.AFd1mSDK
    @NonNull
    public final synchronized AFf1bSDK d() {
        try {
            if (this.f57388e == null) {
                AFg1ySDK aFg1ySDK = new AFg1ySDK(values());
                this.f57388e = new AFf1bSDK(new AFf1eSDK(), AFInAppEventType(), force(), aFg1ySDK, new AFe1wSDK(init(), AFInAppEventType(), AppsFlyerProperties.getInstance(), afVerboseLog()), new AFf1aSDK(AFInAppEventType(), aFg1ySDK), afInfoLog());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f57388e;
    }

    @Override // com.appsflyer.internal.AFd1mSDK
    @NonNull
    public final synchronized PurchaseHandler e() {
        try {
            if (this.unregisterClient == null) {
                this.unregisterClient = new PurchaseHandler(this);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.unregisterClient;
    }

    @Override // com.appsflyer.internal.AFd1mSDK
    @NonNull
    public final synchronized AFg1xSDK force() {
        try {
            if (this.afErrorLog == null) {
                this.afErrorLog = new AFg1xSDK(w(), new AFg1zSDK());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.afErrorLog;
    }

    @Override // com.appsflyer.internal.AFd1mSDK
    @NonNull
    public final AFh1aSDK getLevel() {
        if (this.AFLogger$LogLevel == null) {
            Context context = this.AFInAppEventParameterName.valueOf;
            if (context == null) {
                throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
            }
            this.AFLogger$LogLevel = new AFh1aSDK(context);
        }
        return this.AFLogger$LogLevel;
    }

    @Override // com.appsflyer.internal.AFd1mSDK
    @NonNull
    public final synchronized AFb1bSDK i() {
        try {
            if (this.f57389i == null) {
                this.f57389i = new AFb1aSDK(this);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f57389i;
    }

    @Override // com.appsflyer.internal.AFd1mSDK
    @NonNull
    public final AFg1vSDK onInstallConversionFailureNative() {
        if (this.onInstallConversionFailureNative == null) {
            Context context = this.AFInAppEventParameterName.valueOf;
            if (context == null) {
                throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
            }
            AFg1wSDK aFg1wSDK = new AFg1wSDK(context, AppsFlyerProperties.getInstance());
            if (this.onResponseNative == null) {
                this.onResponseNative = new AFd1qSDK();
            }
            this.onInstallConversionFailureNative = new AFg1uSDK(aFg1wSDK, this.onResponseNative, AppsFlyerProperties.getInstance());
        }
        return this.onInstallConversionFailureNative;
    }

    @Override // com.appsflyer.internal.AFd1mSDK
    @NonNull
    public final AFi1dSDK registerClient() {
        if (this.f57391w == null) {
            Context context = this.AFInAppEventParameterName.valueOf;
            if (context == null) {
                throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
            }
            this.f57391w = new AFi1bSDK(context, onInstallConversionDataLoadedNative());
        }
        return this.f57391w;
    }

    @Override // com.appsflyer.internal.AFd1mSDK
    @NonNull
    public final AFg1qSDK unregisterClient() {
        if (this.force == null) {
            Context context = this.AFInAppEventParameterName.valueOf;
            if (context == null) {
                throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
            }
            if (this.afDebugLog == null) {
                this.afDebugLog = new AFi1pSDK();
            }
            AFi1qSDK aFi1qSDK = this.afDebugLog;
            if (this.AFVersionDeclaration == null) {
                this.AFVersionDeclaration = new AFa1tSDK();
            }
            AFd1uSDK aFd1uSDK = this.AFVersionDeclaration;
            if (this.f57391w == null) {
                Context context2 = this.AFInAppEventParameterName.valueOf;
                if (context2 == null) {
                    throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
                }
                this.f57391w = new AFi1bSDK(context2, onInstallConversionDataLoadedNative());
            }
            AFi1dSDK aFi1dSDK = this.f57391w;
            if (this.onInstallConversionDataLoadedNative == null) {
                this.onInstallConversionDataLoadedNative = new AFa1aSDK();
            }
            AFb1ySDK aFb1ySDK = this.onInstallConversionDataLoadedNative;
            AFg1cSDK AFLogger = AFLogger();
            AFd1tSDK values2 = values();
            AFd1sSDK AFInAppEventType = AFInAppEventType();
            if (this.AFLogger$LogLevel == null) {
                Context context3 = this.AFInAppEventParameterName.valueOf;
                if (context3 == null) {
                    throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
                }
                this.AFLogger$LogLevel = new AFh1aSDK(context3);
            }
            AFh1aSDK aFh1aSDK = this.AFLogger$LogLevel;
            AFg1xSDK force = force();
            AFb1cSDK aFb1cSDK = new AFb1cSDK();
            AFd1kSDK w11 = w();
            AFg1pSDK onConversionDataSuccess = onConversionDataSuccess();
            if (this.onResponseNative == null) {
                this.onResponseNative = new AFd1qSDK();
            }
            this.force = new AFg1lSDK(context, aFi1qSDK, aFd1uSDK, aFi1dSDK, aFb1ySDK, AFLogger, values2, AFInAppEventType, aFh1aSDK, force, aFb1cSDK, w11, onConversionDataSuccess, this.onResponseNative);
        }
        return this.force;
    }

    @Override // com.appsflyer.internal.AFd1mSDK
    @NonNull
    public final synchronized AFi1iSDK v() {
        try {
            if (this.f57390v == null) {
                this.f57390v = new AFi1iSDK(this);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f57390v;
    }

    @Override // com.appsflyer.internal.AFd1mSDK
    @NonNull
    public final synchronized ScheduledExecutorService valueOf() {
        try {
            if (this.AFKeystoreWrapper == null) {
                ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(2);
                Intrinsics.checkNotNullExpressionValue(newScheduledThreadPool, "");
                this.AFKeystoreWrapper = newScheduledThreadPool;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.AFKeystoreWrapper;
    }

    @Override // com.appsflyer.internal.AFd1mSDK
    @NonNull
    public final AFd1tSDK values() {
        Context context = this.AFInAppEventParameterName.valueOf;
        if (context != null) {
            return new AFd1pSDK(AFb1tSDK.AFInAppEventType(context));
        }
        throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
    }

    @Override // com.appsflyer.internal.AFd1mSDK
    @NonNull
    public final synchronized AFd1kSDK w() {
        return this.AFInAppEventParameterName;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void values(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        try {
            threadPoolExecutor.getQueue().put(runnable);
        } catch (InterruptedException e11) {
            AFLogger.afErrorLogForExcManagerOnly("could not create executor for queue", e11);
            Thread.currentThread().interrupt();
        }
    }
}
