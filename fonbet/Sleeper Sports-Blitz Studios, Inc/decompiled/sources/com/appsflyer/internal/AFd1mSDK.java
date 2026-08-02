package com.appsflyer.internal;

import android.content.Context;
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
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class AFd1mSDK implements AFd1kSDK {
    private static final int getRevenue = (int) TimeUnit.SECONDS.toMillis(30);
    private ExecutorService AFAdRevenueData;
    private AFd1fSDK AFInAppEventParameterName;
    private AFg1uSDK AFInAppEventType;
    private AFb1vSDK AFKeystoreWrapper;
    private AFc1kSDK AFLogger;
    private AFg1nSDK afDebugLog;
    private AFi1jSDK afErrorLog;
    private AFb1zSDK afInfoLog;
    private AFd1tSDK afRDLog;
    private AFg1fSDK afVerboseLog;
    private AFe1vSDK areAllFieldsValid;
    private PurchaseHandler component1;
    private AFh1sSDK component2;
    private AFg1xSDK component3;
    private AFd1rSDK component4;
    private AFg1iSDK copy;
    private AFj1sSDK copydefault;
    private AFd1vSDK d;
    private AFi1sSDK e;
    private AFj1oSDK equals;
    private AFh1uSDK force;
    private ExecutorService getCurrencyIso4217Code;
    private ScheduledExecutorService getMediationNetwork;
    private AFb1aSDK hashCode;
    private AFc1gSDK i;
    private AFc1hSDK registerClient;
    private AFf1zSDK toString;
    private AFd1ySDK unregisterClient;
    private AFg1sSDK v;
    private AFi1lSDK valueOf;
    private AFe1gSDK values;
    private AFi1nSDK w;
    private String afWarnLog = null;
    public final AFd1lSDK getMonetizationNetwork = new AFd1lSDK();

    @Override // com.appsflyer.internal.AFd1kSDK
    public final AFe1qSDK AFAdRevenueData() {
        return new AFe1qSDK(afErrorLog(), getCurrencyIso4217Code(), AppsFlyerProperties.getInstance(), values());
    }

    private synchronized AFe1vSDK afErrorLog() {
        if (this.areAllFieldsValid == null) {
            this.areAllFieldsValid = new AFe1vSDK(new AFe1lSDK(getRevenue), getMonetizationNetwork());
        }
        return this.areAllFieldsValid;
    }

    private String afRDLog() {
        if (this.afWarnLog == null) {
            this.afWarnLog = new AFb1cSDK().getRevenue();
        }
        return this.afWarnLog;
    }

    @Override // com.appsflyer.internal.AFd1kSDK
    public final synchronized ExecutorService getMonetizationNetwork() {
        if (this.getCurrencyIso4217Code == null) {
            this.getCurrencyIso4217Code = AFd1uSDK.AFAdRevenueData();
        }
        return this.getCurrencyIso4217Code;
    }

    private synchronized ExecutorService afDebugLog() {
        if (this.AFAdRevenueData == null) {
            ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
            Intrinsics.checkNotNullExpressionValue(newSingleThreadExecutor, "");
            this.AFAdRevenueData = newSingleThreadExecutor;
        }
        return this.AFAdRevenueData;
    }

    @Override // com.appsflyer.internal.AFd1kSDK
    public final synchronized ScheduledExecutorService getRevenue() {
        if (this.getMediationNetwork == null) {
            ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(2);
            Intrinsics.checkNotNullExpressionValue(newScheduledThreadPool, "");
            this.getMediationNetwork = newScheduledThreadPool;
        }
        return this.getMediationNetwork;
    }

    @Override // com.appsflyer.internal.AFd1kSDK
    public final synchronized AFd1rSDK getCurrencyIso4217Code() {
        if (this.component4 == null) {
            AFd1lSDK AFInAppEventParameterName = AFInAppEventParameterName();
            Context context = this.getMonetizationNetwork.getCurrencyIso4217Code;
            if (context != null) {
                AFd1sSDK aFd1sSDK = new AFd1sSDK(AFb1rSDK.h_(context));
                if (this.afRDLog == null) {
                    this.afRDLog = new AFd1tSDK();
                }
                this.component4 = new AFd1rSDK(AFInAppEventParameterName, aFd1sSDK, this.afRDLog);
            } else {
                throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
            }
        }
        return this.component4;
    }

    @Override // com.appsflyer.internal.AFd1kSDK
    public final AFd1pSDK getMediationNetwork() {
        Context context = this.getMonetizationNetwork.getCurrencyIso4217Code;
        if (context != null) {
            return new AFd1sSDK(AFb1rSDK.h_(context));
        }
        throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
    }

    @Override // com.appsflyer.internal.AFd1kSDK
    public final synchronized PurchaseHandler component3() {
        if (this.component1 == null) {
            this.component1 = new PurchaseHandler(this);
        }
        return this.component1;
    }

    @Override // com.appsflyer.internal.AFd1kSDK
    public final synchronized AFg1xSDK component1() {
        if (this.component3 == null) {
            AFg1vSDK aFg1vSDK = new AFg1vSDK(getMediationNetwork());
            this.component3 = new AFg1xSDK(new AFg1zSDK(), getCurrencyIso4217Code(), AFInAppEventType(), aFg1vSDK, new AFe1qSDK(afErrorLog(), getCurrencyIso4217Code(), AppsFlyerProperties.getInstance(), values()), new AFg1wSDK(getCurrencyIso4217Code(), aFg1vSDK), copydefault());
        }
        return this.component3;
    }

    private synchronized AFg1nSDK afLogForce() {
        if (this.afDebugLog == null) {
            this.afDebugLog = new AFg1nSDK(AFInAppEventParameterName(), getCurrencyIso4217Code());
        }
        return this.afDebugLog;
    }

    @Override // com.appsflyer.internal.AFd1kSDK
    public final synchronized AFh1sSDK component4() {
        if (this.component2 == null) {
            this.component2 = new AFh1sSDK(getMediationNetwork());
        }
        return this.component2;
    }

    @Override // com.appsflyer.internal.AFd1kSDK
    public final AFg1iSDK component2() {
        if (this.copy == null) {
            String afRDLog = afRDLog();
            Context context = this.getMonetizationNetwork.getCurrencyIso4217Code;
            if (context == null) {
                throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
            }
            if (this.valueOf == null) {
                this.valueOf = new AFi1oSDK();
            }
            AFi1lSDK aFi1lSDK = this.valueOf;
            if (this.unregisterClient == null) {
                this.unregisterClient = new AFa1zSDK();
            }
            AFd1ySDK aFd1ySDK = this.unregisterClient;
            if (this.equals == null) {
                Context context2 = this.getMonetizationNetwork.getCurrencyIso4217Code;
                if (context2 != null) {
                    this.equals = new AFj1lSDK(context2, afDebugLog());
                } else {
                    throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
                }
            }
            AFj1oSDK aFj1oSDK = this.equals;
            if (this.afInfoLog == null) {
                this.afInfoLog = new AFa1aSDK();
            }
            AFb1zSDK aFb1zSDK = this.afInfoLog;
            AFh1sSDK component4 = component4();
            AFd1pSDK mediationNetwork = getMediationNetwork();
            AFd1rSDK currencyIso4217Code = getCurrencyIso4217Code();
            if (this.e == null) {
                Context context3 = this.getMonetizationNetwork.getCurrencyIso4217Code;
                if (context3 != null) {
                    this.e = new AFi1sSDK(context3);
                } else {
                    throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
                }
            }
            AFi1sSDK aFi1sSDK = this.e;
            AFg1uSDK AFInAppEventType = AFInAppEventType();
            AFd1lSDK AFInAppEventParameterName = AFInAppEventParameterName();
            AFg1nSDK afLogForce = afLogForce();
            if (this.afRDLog == null) {
                this.afRDLog = new AFd1tSDK();
            }
            this.copy = new AFg1jSDK(afRDLog, context, aFi1lSDK, aFd1ySDK, aFj1oSDK, aFb1zSDK, component4, mediationNetwork, currencyIso4217Code, aFi1sSDK, AFInAppEventType, AFInAppEventParameterName, afLogForce, this.afRDLog);
        }
        return this.copy;
    }

    @Override // com.appsflyer.internal.AFd1kSDK
    public final AFj1oSDK areAllFieldsValid() {
        if (this.equals == null) {
            Context context = this.getMonetizationNetwork.getCurrencyIso4217Code;
            if (context != null) {
                this.equals = new AFj1lSDK(context, afDebugLog());
            } else {
                throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
            }
        }
        return this.equals;
    }

    @Override // com.appsflyer.internal.AFd1kSDK
    public final synchronized AFf1zSDK copydefault() {
        if (this.toString == null) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 6, 300L, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>() { // from class: com.appsflyer.internal.AFd1mSDK.3
                /* JADX INFO: Access modifiers changed from: private */
                @Override // java.util.concurrent.LinkedBlockingQueue, java.util.Queue, java.util.concurrent.BlockingQueue
                /* renamed from: getMonetizationNetwork, reason: merged with bridge method [inline-methods] */
                public boolean offer(Runnable runnable) {
                    if (isEmpty()) {
                        return super.offer(runnable);
                    }
                    return false;
                }
            }, new AFa1uSDK());
            threadPoolExecutor.setRejectedExecutionHandler(new RejectedExecutionHandler() { // from class: com.appsflyer.internal.AFd1mSDK$$ExternalSyntheticLambda0
                @Override // java.util.concurrent.RejectedExecutionHandler
                public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor2) {
                    AFd1mSDK.getMonetizationNetwork(runnable, threadPoolExecutor2);
                }
            });
            this.toString = new AFf1zSDK(threadPoolExecutor);
        }
        return this.toString;
    }

    @Override // com.appsflyer.internal.AFd1kSDK
    public final synchronized AFb1aSDK equals() {
        if (this.hashCode == null) {
            this.hashCode = new AFb1bSDK(this);
        }
        return this.hashCode;
    }

    @Override // com.appsflyer.internal.AFd1kSDK
    public final synchronized AFj1sSDK copy() {
        if (this.copydefault == null) {
            this.copydefault = new AFj1sSDK(this);
        }
        return this.copydefault;
    }

    @Override // com.appsflyer.internal.AFd1kSDK
    public final synchronized AFg1uSDK AFInAppEventType() {
        if (this.AFInAppEventType == null) {
            this.AFInAppEventType = new AFg1uSDK(AFInAppEventParameterName(), new AFg1tSDK());
        }
        return this.AFInAppEventType;
    }

    @Override // com.appsflyer.internal.AFd1kSDK
    public final synchronized AFd1lSDK AFInAppEventParameterName() {
        return this.getMonetizationNetwork;
    }

    @Override // com.appsflyer.internal.AFd1kSDK
    public final synchronized AFb1vSDK AFKeystoreWrapper() {
        if (this.AFKeystoreWrapper == null) {
            this.AFKeystoreWrapper = new AFb1jSDK(AFInAppEventParameterName());
        }
        return this.AFKeystoreWrapper;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.appsflyer.internal.AFd1kSDK
    /* renamed from: getLevel, reason: merged with bridge method [inline-methods] */
    public synchronized AFd1fSDK afWarnLog() {
        if (this.AFInAppEventParameterName == null) {
            this.AFInAppEventParameterName = new AFd1fSDK(this);
        }
        return this.AFInAppEventParameterName;
    }

    @Override // com.appsflyer.internal.AFd1kSDK
    public final synchronized AFe1gSDK values() {
        if (this.values == null) {
            this.values = new AFe1gSDK(getCurrencyIso4217Code(), getMediationNetwork());
        }
        return this.values;
    }

    @Override // com.appsflyer.internal.AFd1kSDK
    public final AFi1lSDK valueOf() {
        if (this.valueOf == null) {
            this.valueOf = new AFi1oSDK();
        }
        return this.valueOf;
    }

    @Override // com.appsflyer.internal.AFd1kSDK
    public final synchronized AFc1kSDK d() {
        if (this.AFLogger == null) {
            this.AFLogger = new AFc1kSDK(this);
        }
        return this.AFLogger;
    }

    @Override // com.appsflyer.internal.AFd1kSDK
    public final synchronized AFc1hSDK AFLogger() {
        if (this.registerClient == null) {
            this.registerClient = new AFc1iSDK(AFInAppEventParameterName());
        }
        return this.registerClient;
    }

    @Override // com.appsflyer.internal.AFd1kSDK
    public final AFi1sSDK registerClient() {
        if (this.e == null) {
            Context context = this.getMonetizationNetwork.getCurrencyIso4217Code;
            if (context != null) {
                this.e = new AFi1sSDK(context);
            } else {
                throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
            }
        }
        return this.e;
    }

    @Override // com.appsflyer.internal.AFd1kSDK
    public final AFi1nSDK unregisterClient() {
        if (this.w == null) {
            this.w = new AFi1mSDK();
        }
        return this.w;
    }

    @Override // com.appsflyer.internal.AFd1kSDK
    public final AFd1tSDK e() {
        if (this.afRDLog == null) {
            this.afRDLog = new AFd1tSDK();
        }
        return this.afRDLog;
    }

    @Override // com.appsflyer.internal.AFd1kSDK
    public final AFd1vSDK afInfoLog() {
        if (this.d == null) {
            ExecutorService afDebugLog = afDebugLog();
            ScheduledExecutorService revenue = getRevenue();
            AFc1kSDK d = d();
            if (this.w == null) {
                this.w = new AFi1mSDK();
            }
            this.d = new AFd1xSDK(afDebugLog, revenue, d, this.w);
        }
        return this.d;
    }

    @Override // com.appsflyer.internal.AFd1kSDK
    public final AFh1uSDK w() {
        if (this.force == null) {
            this.force = new AFh1tSDK(this);
        }
        return this.force;
    }

    @Override // com.appsflyer.internal.AFd1kSDK
    public final AFg1sSDK v() {
        if (this.v == null) {
            Context context = this.getMonetizationNetwork.getCurrencyIso4217Code;
            if (context != null) {
                AFg1qSDK aFg1qSDK = new AFg1qSDK(context, AppsFlyerProperties.getInstance());
                if (this.afRDLog == null) {
                    this.afRDLog = new AFd1tSDK();
                }
                this.v = new AFg1pSDK(aFg1qSDK, this.afRDLog, AppsFlyerProperties.getInstance());
            } else {
                throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
            }
        }
        return this.v;
    }

    @Override // com.appsflyer.internal.AFd1kSDK
    public final AFi1jSDK i() {
        try {
            if (this.afErrorLog == null) {
                try {
                    Object[] objArr = {getCurrencyIso4217Code(), AFInAppEventParameterName(), AFInAppEventType()};
                    Object obj = AFi1fSDK.registerClient.get(-11150545);
                    if (obj == null) {
                        obj = ((Class) AFi1fSDK.AFAdRevenueData(36 - TextUtils.indexOf((CharSequence) "", '0'), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1, (char) (ViewConfiguration.getFadingEdgeLength() >> 16))).getDeclaredConstructor(AFd1rSDK.class, AFd1lSDK.class, AFg1uSDK.class);
                        AFi1fSDK.registerClient.put(-11150545, obj);
                    }
                    this.afErrorLog = (AFi1jSDK) ((Constructor) obj).newInstance(objArr);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            AFLogger.INSTANCE.e(AFh1xSDK.PLAY_INTEGRITY_API, th2.getMessage() != null ? th2.getMessage() : "", th2, false, false);
        }
        return this.afErrorLog;
    }

    @Override // com.appsflyer.internal.AFd1kSDK
    public final AFc1gSDK force() {
        if (this.i == null) {
            this.i = new AFc1eSDK(getMediationNetwork());
        }
        return this.i;
    }

    @Override // com.appsflyer.internal.AFd1kSDK
    public final AFg1fSDK afVerboseLog() {
        if (this.afVerboseLog == null) {
            this.afVerboseLog = new AFg1hSDK(new AFg1eSDK(getMediationNetwork()));
        }
        return this.afVerboseLog;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void getMonetizationNetwork(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        try {
            threadPoolExecutor.getQueue().put(runnable);
        } catch (InterruptedException e) {
            AFLogger.afErrorLogForExcManagerOnly("could not create executor for queue", e);
            Thread.currentThread().interrupt();
        }
    }

    static class AFa1uSDK implements ThreadFactory {
        private static final AtomicInteger AFAdRevenueData = new AtomicInteger();
        private final AtomicInteger getCurrencyIso4217Code = new AtomicInteger();

        public AFa1uSDK() {
            AFAdRevenueData.incrementAndGet();
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            int i = AFAdRevenueData.get();
            int incrementAndGet = this.getCurrencyIso4217Code.incrementAndGet();
            StringBuilder sb = new StringBuilder("queue-");
            sb.append(i);
            sb.append("-");
            sb.append(incrementAndGet);
            return new Thread(runnable, sb.toString());
        }
    }
}
