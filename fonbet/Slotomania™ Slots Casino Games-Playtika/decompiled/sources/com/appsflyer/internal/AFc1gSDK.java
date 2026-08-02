package com.appsflyer.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Process;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.PurchaseHandler;
import java.lang.reflect.Constructor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class AFc1gSDK implements AFc1fSDK {
    private static final int getMonetizationNetwork = (int) TimeUnit.SECONDS.toMillis(30);
    private AFf1iSDK AFInAppEventParameterName;
    private AFc1tSDK AFInAppEventType;
    private AFe1ySDK AFKeystoreWrapper;
    private AFc1dSDK AFLogger;
    private AFb1zSDK afDebugLog;
    private AFi1rSDK afErrorLog;
    private AFg1bSDK afErrorLogForExcManagerOnly;
    private AFg1vSDK afInfoLog;
    private AFf1eSDK afLogForce;
    private AFe1vSDK afVerboseLog;
    private AFi1kSDK afWarnLog;
    private AFf1mSDK areAllFieldsValid;
    private AFc1qSDK component1;
    private PurchaseHandler component2;
    private AFd1nSDK component3;
    private AFc1kSDK component4;
    private AFd1sSDK copy;
    private AFe1sSDK copydefault;
    private AFi1ySDK d;
    private AFi1sSDK e;
    private AFj1rSDK equals;
    private AFa1oSDK force;
    private ExecutorService getCurrencyIso4217Code;
    private AFg1ySDK getLevel;
    private ScheduledExecutorService getMediationNetwork;
    private ExecutorService getRevenue;
    private AFh1uSDK hashCode;
    private AFj1kSDK i;
    private AFj1zSDK registerClient;
    private AFg1tSDK toString;
    private AFf1aSDK unregisterClient;
    private AFa1lSDK v;
    private AFc1oSDK values;
    private AFb1aSDK w;
    private String afRDLog = null;
    public final AFc1hSDK AFAdRevenueData = new AFc1hSDK();

    @Override // com.appsflyer.internal.AFc1fSDK
    public final AFe1vSDK getCurrencyIso4217Code() {
        if (this.afVerboseLog == null) {
            this.afVerboseLog = new AFe1vSDK(component1(), AFLogger(), getRevenue(), AFAdRevenueData(), component3(), AFKeystoreWrapper(), equals());
        }
        return this.afVerboseLog;
    }

    @Override // com.appsflyer.internal.AFc1fSDK
    public final AFd1lSDK getMediationNetwork() {
        return new AFd1lSDK(afWarnLog(), getRevenue(), AppsFlyerProperties.getInstance(), AFInAppEventType(), AFPurchaseDetails());
    }

    private synchronized AFd1nSDK afWarnLog() {
        if (this.component3 == null) {
            this.component3 = new AFd1nSDK(new AFd1jSDK(getMonetizationNetwork), AFAdRevenueData());
        }
        return this.component3;
    }

    private String afVerboseLog() {
        if (this.afRDLog == null) {
            this.afRDLog = new AFa1ySDK().getMediationNetwork();
        }
        return this.afRDLog;
    }

    @Override // com.appsflyer.internal.AFc1fSDK
    public final synchronized ExecutorService AFAdRevenueData() {
        if (this.getCurrencyIso4217Code == null) {
            this.getCurrencyIso4217Code = new AFc1vSDK(0, 5, 60L, TimeUnit.SECONDS, new SynchronousQueue(), null, 32, null);
        }
        return this.getCurrencyIso4217Code;
    }

    private synchronized ExecutorService valueOf() {
        if (this.getRevenue == null) {
            ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
            Intrinsics.checkNotNullExpressionValue(newSingleThreadExecutor, "");
            this.getRevenue = newSingleThreadExecutor;
        }
        return this.getRevenue;
    }

    @Override // com.appsflyer.internal.AFc1fSDK
    public final synchronized ScheduledExecutorService getMonetizationNetwork() {
        if (this.getMediationNetwork == null) {
            ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(2);
            Intrinsics.checkNotNullExpressionValue(newScheduledThreadPool, "");
            this.getMediationNetwork = newScheduledThreadPool;
        }
        return this.getMediationNetwork;
    }

    @Override // com.appsflyer.internal.AFc1fSDK
    public final synchronized AFc1kSDK getRevenue() {
        if (this.component4 == null) {
            AFc1hSDK AFLogger = AFLogger();
            AFc1sSDK component1 = component1();
            if (this.values == null) {
                this.values = new AFc1oSDK();
            }
            this.component4 = new AFc1kSDK(AFLogger, component1, this.values, AFAdRevenueData());
        }
        return this.component4;
    }

    @Override // com.appsflyer.internal.AFc1fSDK
    public final AFc1sSDK component1() {
        if (this.component1 == null) {
            this.component1 = new AFc1qSDK(new AFc1iSDK(new Function0() { // from class: com.appsflyer.internal.AFc1gSDK$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    SharedPreferences m_;
                    m_ = AFc1gSDK.this.m_();
                    return m_;
                }
            }));
        }
        return this.component1;
    }

    @Override // com.appsflyer.internal.AFc1fSDK
    public final synchronized PurchaseHandler areAllFieldsValid() {
        if (this.component2 == null) {
            this.component2 = new PurchaseHandler(this);
        }
        return this.component2;
    }

    @Override // com.appsflyer.internal.AFc1fSDK
    public final synchronized AFf1mSDK component4() {
        if (this.areAllFieldsValid == null) {
            AFf1nSDK aFf1nSDK = new AFf1nSDK(component1());
            this.areAllFieldsValid = new AFf1mSDK(new AFf1oSDK(), getRevenue(), AFKeystoreWrapper(), aFf1nSDK, new AFd1lSDK(afWarnLog(), getRevenue(), AppsFlyerProperties.getInstance(), AFInAppEventType(), AFPurchaseDetails()), new AFf1pSDK(getRevenue(), aFf1nSDK), equals());
        }
        return this.areAllFieldsValid;
    }

    private synchronized AFg1ySDK AFLoggerLogLevel() {
        if (this.getLevel == null) {
            this.getLevel = new AFg1ySDK(AFLogger(), getRevenue());
        }
        return this.getLevel;
    }

    @Override // com.appsflyer.internal.AFc1fSDK
    public final synchronized AFh1uSDK component2() {
        if (this.hashCode == null) {
            this.hashCode = new AFh1uSDK(component1());
        }
        return this.hashCode;
    }

    @Override // com.appsflyer.internal.AFc1fSDK
    public final AFg1tSDK component3() {
        if (this.toString == null) {
            String afVerboseLog = afVerboseLog();
            Context context = this.AFAdRevenueData.getMonetizationNetwork;
            if (context == null) {
                throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
            }
            if (this.e == null) {
                this.e = new AFi1pSDK();
            }
            AFi1sSDK aFi1sSDK = this.e;
            if (this.unregisterClient == null) {
                this.unregisterClient = new AFg1sSDK();
            }
            AFf1aSDK aFf1aSDK = this.unregisterClient;
            if (this.equals == null) {
                Context context2 = this.AFAdRevenueData.getMonetizationNetwork;
                if (context2 != null) {
                    this.equals = new AFj1uSDK(context2, valueOf());
                } else {
                    throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
                }
            }
            AFj1rSDK aFj1rSDK = this.equals;
            if (this.afInfoLog == null) {
                this.afInfoLog = new AFg1wSDK();
            }
            AFg1vSDK aFg1vSDK = this.afInfoLog;
            AFh1uSDK component2 = component2();
            AFc1sSDK component1 = component1();
            AFc1kSDK revenue = getRevenue();
            if (this.d == null) {
                Context context3 = this.AFAdRevenueData.getMonetizationNetwork;
                if (context3 != null) {
                    this.d = new AFi1ySDK(context3);
                } else {
                    throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
                }
            }
            AFi1ySDK aFi1ySDK = this.d;
            AFf1iSDK AFKeystoreWrapper = AFKeystoreWrapper();
            AFc1hSDK AFLogger = AFLogger();
            AFg1ySDK AFLoggerLogLevel = AFLoggerLogLevel();
            if (this.values == null) {
                this.values = new AFc1oSDK();
            }
            this.toString = new AFg1uSDK(afVerboseLog, context, aFi1sSDK, aFf1aSDK, aFj1rSDK, aFg1vSDK, component2, component1, revenue, aFi1ySDK, AFKeystoreWrapper, AFLogger, AFLoggerLogLevel, this.values);
        }
        return this.toString;
    }

    @Override // com.appsflyer.internal.AFc1fSDK
    public final AFj1rSDK copydefault() {
        if (this.equals == null) {
            Context context = this.AFAdRevenueData.getMonetizationNetwork;
            if (context != null) {
                this.equals = new AFj1uSDK(context, valueOf());
            } else {
                throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
            }
        }
        return this.equals;
    }

    @Override // com.appsflyer.internal.AFc1fSDK
    public final synchronized AFe1sSDK equals() {
        if (this.copydefault == null) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 6, 300L, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>() { // from class: com.appsflyer.internal.AFc1gSDK.4
                /* JADX INFO: Access modifiers changed from: private */
                @Override // java.util.concurrent.LinkedBlockingQueue, java.util.Queue, java.util.concurrent.BlockingQueue
                /* renamed from: getRevenue, reason: merged with bridge method [inline-methods] */
                public boolean offer(Runnable runnable) {
                    if (isEmpty()) {
                        return super.offer(runnable);
                    }
                    return false;
                }
            }, new AFa1zSDK());
            threadPoolExecutor.setRejectedExecutionHandler(new RejectedExecutionHandler() { // from class: com.appsflyer.internal.AFc1gSDK$$ExternalSyntheticLambda1
                @Override // java.util.concurrent.RejectedExecutionHandler
                public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor2) {
                    AFc1gSDK.getMediationNetwork(runnable, threadPoolExecutor2);
                }
            });
            this.copydefault = new AFe1sSDK(threadPoolExecutor);
        }
        return this.copydefault;
    }

    @Override // com.appsflyer.internal.AFc1fSDK
    public final synchronized AFd1sSDK copy() {
        if (this.copy == null) {
            this.copy = new AFd1tSDK(this);
        }
        return this.copy;
    }

    @Override // com.appsflyer.internal.AFc1fSDK
    public final synchronized AFj1zSDK AFInAppEventParameterName() {
        if (this.registerClient == null) {
            this.registerClient = new AFj1zSDK(this);
        }
        return this.registerClient;
    }

    @Override // com.appsflyer.internal.AFc1fSDK
    public final synchronized AFf1iSDK AFKeystoreWrapper() {
        if (this.AFInAppEventParameterName == null) {
            this.AFInAppEventParameterName = new AFf1iSDK(AFLogger(), new AFf1lSDK());
        }
        return this.AFInAppEventParameterName;
    }

    @Override // com.appsflyer.internal.AFc1fSDK
    public final synchronized AFc1hSDK AFLogger() {
        return this.AFAdRevenueData;
    }

    @Override // com.appsflyer.internal.AFc1fSDK
    public final synchronized AFc1tSDK registerClient() {
        if (this.AFInAppEventType == null) {
            this.AFInAppEventType = new AFc1rSDK(AFLogger());
        }
        return this.AFInAppEventType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.appsflyer.internal.AFc1fSDK
    /* renamed from: getLevel, reason: merged with bridge method [inline-methods] */
    public synchronized AFc1dSDK afRDLog() {
        if (this.AFLogger == null) {
            this.AFLogger = new AFc1dSDK(this);
        }
        return this.AFLogger;
    }

    @Override // com.appsflyer.internal.AFc1fSDK
    public final synchronized AFe1ySDK AFInAppEventType() {
        if (this.AFKeystoreWrapper == null) {
            this.AFKeystoreWrapper = new AFe1ySDK(getRevenue(), component1());
        }
        return this.AFKeystoreWrapper;
    }

    private synchronized AFj1kSDK AFPurchaseDetails() {
        if (this.i == null) {
            this.i = new AFj1kSDK(getRevenue());
        }
        return this.i;
    }

    @Override // com.appsflyer.internal.AFc1fSDK
    public final AFi1sSDK i() {
        if (this.e == null) {
            this.e = new AFi1pSDK();
        }
        return this.e;
    }

    @Override // com.appsflyer.internal.AFc1fSDK
    public final synchronized AFa1oSDK e() {
        if (this.force == null) {
            this.force = new AFa1oSDK(this);
        }
        return this.force;
    }

    @Override // com.appsflyer.internal.AFc1fSDK
    public final synchronized AFb1zSDK d() {
        if (this.afDebugLog == null) {
            this.afDebugLog = new AFa1aSDK(AFLogger());
        }
        return this.afDebugLog;
    }

    @Override // com.appsflyer.internal.AFc1fSDK
    public final AFi1ySDK w() {
        if (this.d == null) {
            Context context = this.AFAdRevenueData.getMonetizationNetwork;
            if (context != null) {
                this.d = new AFi1ySDK(context);
            } else {
                throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
            }
        }
        return this.d;
    }

    @Override // com.appsflyer.internal.AFc1fSDK
    public final AFi1rSDK unregisterClient() {
        if (this.afErrorLog == null) {
            this.afErrorLog = new AFi1qSDK();
        }
        return this.afErrorLog;
    }

    @Override // com.appsflyer.internal.AFc1fSDK
    public final AFc1oSDK afErrorLog() {
        if (this.values == null) {
            this.values = new AFc1oSDK();
        }
        return this.values;
    }

    @Override // com.appsflyer.internal.AFc1fSDK
    public final AFb1aSDK afDebugLog() {
        if (this.w == null) {
            ExecutorService valueOf = valueOf();
            ScheduledExecutorService monetizationNetwork = getMonetizationNetwork();
            AFa1oSDK e = e();
            if (this.afErrorLog == null) {
                this.afErrorLog = new AFi1qSDK();
            }
            this.w = new AFb1gSDK(valueOf, monetizationNetwork, e, this.afErrorLog);
        }
        return this.w;
    }

    @Override // com.appsflyer.internal.AFc1fSDK
    public final AFg1bSDK force() {
        if (this.afErrorLogForExcManagerOnly == null) {
            this.afErrorLogForExcManagerOnly = new AFh1ySDK(this);
        }
        return this.afErrorLogForExcManagerOnly;
    }

    @Override // com.appsflyer.internal.AFc1fSDK
    public final AFf1eSDK v() {
        if (this.afLogForce == null) {
            Context context = this.AFAdRevenueData.getMonetizationNetwork;
            if (context != null) {
                AFf1gSDK aFf1gSDK = new AFf1gSDK(context, AppsFlyerProperties.getInstance());
                if (this.values == null) {
                    this.values = new AFc1oSDK();
                }
                this.afLogForce = new AFf1dSDK(aFf1gSDK, this.values, AppsFlyerProperties.getInstance());
            } else {
                throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
            }
        }
        return this.afLogForce;
    }

    @Override // com.appsflyer.internal.AFc1fSDK
    public final AFi1kSDK afInfoLog() {
        try {
            if (this.afWarnLog == null) {
                try {
                    Object[] objArr = {getRevenue(), AFLogger(), AFKeystoreWrapper()};
                    Object obj = AFi1mSDK.d.get(119728278);
                    if (obj == null) {
                        obj = ((Class) AFi1mSDK.getRevenue((char) (ViewConfiguration.getWindowTouchSlop() >> 8), (-1) - Process.getGidForName(""), TextUtils.getCapsMode("", 0, 0) + 37)).getDeclaredConstructor(AFc1kSDK.class, AFc1hSDK.class, AFf1iSDK.class);
                        AFi1mSDK.d.put(119728278, obj);
                    }
                    this.afWarnLog = (AFi1kSDK) ((Constructor) obj).newInstance(objArr);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            AFLogger.INSTANCE.e(AFh1zSDK.PLAY_INTEGRITY_API, th2.getMessage() != null ? th2.getMessage() : "", th2, false, false);
        }
        return this.afWarnLog;
    }

    @Override // com.appsflyer.internal.AFc1fSDK
    public final AFa1lSDK afErrorLogForExcManagerOnly() {
        if (this.v == null) {
            this.v = new AFa1jSDK(component1());
        }
        return this.v;
    }

    @Override // com.appsflyer.internal.AFc1fSDK
    public final AFb1hSDK afLogForce() {
        if (this.values == null) {
            this.values = new AFc1oSDK();
        }
        return new AFb1bSDK(this.values, AFLogger(), AFKeystoreWrapper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void getMediationNetwork(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        try {
            threadPoolExecutor.getQueue().put(runnable);
        } catch (InterruptedException e) {
            AFLogger.afErrorLogForExcManagerOnly("could not create executor for queue", e);
            Thread.currentThread().interrupt();
        }
    }

    static class AFa1zSDK implements ThreadFactory {
        private static final AtomicInteger getCurrencyIso4217Code = new AtomicInteger();
        private final AtomicInteger getMonetizationNetwork = new AtomicInteger();

        public AFa1zSDK() {
            getCurrencyIso4217Code.incrementAndGet();
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            int i = getCurrencyIso4217Code.get();
            return new Thread(runnable, new StringBuilder("queue-").append(i).append("-").append(this.getMonetizationNetwork.incrementAndGet()).toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ SharedPreferences m_() {
        Context context = this.AFAdRevenueData.getMonetizationNetwork;
        if (context != null) {
            return com.appsflyer.internal.AFa1zSDK.c_(context);
        }
        throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
    }
}
