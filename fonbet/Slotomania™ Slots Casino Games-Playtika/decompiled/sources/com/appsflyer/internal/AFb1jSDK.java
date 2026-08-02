package com.appsflyer.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFb1aSDK;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
final class AFb1jSDK implements Application.ActivityLifecycleCallbacks {
    private final Executor AFAdRevenueData;
    private boolean component2;
    private boolean component3;
    private final AFi1rSDK getCurrencyIso4217Code;
    private final ScheduledExecutorService getMediationNetwork;
    final AFb1aSDK.AFa1uSDK getMonetizationNetwork;
    private final AFa1oSDK getRevenue;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(bundle, "");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
    }

    public AFb1jSDK(Executor executor, ScheduledExecutorService scheduledExecutorService, AFa1oSDK aFa1oSDK, AFi1rSDK aFi1rSDK, AFb1aSDK.AFa1uSDK aFa1uSDK) {
        Intrinsics.checkNotNullParameter(executor, "");
        Intrinsics.checkNotNullParameter(scheduledExecutorService, "");
        Intrinsics.checkNotNullParameter(aFa1oSDK, "");
        Intrinsics.checkNotNullParameter(aFi1rSDK, "");
        Intrinsics.checkNotNullParameter(aFa1uSDK, "");
        this.AFAdRevenueData = executor;
        this.getMediationNetwork = scheduledExecutorService;
        this.getRevenue = aFa1oSDK;
        this.getCurrencyIso4217Code = aFi1rSDK;
        this.getMonetizationNetwork = aFa1uSDK;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        final AFh1vSDK aFh1vSDK = new AFh1vSDK(activity, this.getCurrencyIso4217Code);
        this.AFAdRevenueData.execute(new Runnable() { // from class: com.appsflyer.internal.AFb1jSDK$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                AFb1jSDK.getMediationNetwork(AFb1jSDK.this, aFh1vSDK);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getMediationNetwork(AFb1jSDK aFb1jSDK, AFh1vSDK aFh1vSDK) {
        Intrinsics.checkNotNullParameter(aFb1jSDK, "");
        Intrinsics.checkNotNullParameter(aFh1vSDK, "");
        if (!aFb1jSDK.component3) {
            try {
                aFb1jSDK.getMonetizationNetwork.getMonetizationNetwork(aFh1vSDK);
            } catch (Exception e) {
                AFLogger.afErrorLog("Listener thrown an exception: ", e, true);
            }
        }
        aFb1jSDK.component2 = false;
        aFb1jSDK.component3 = true;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        this.AFAdRevenueData.execute(new Runnable() { // from class: com.appsflyer.internal.AFb1jSDK$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                AFb1jSDK.AFAdRevenueData(AFb1jSDK.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AFAdRevenueData(final AFb1jSDK aFb1jSDK) {
        Intrinsics.checkNotNullParameter(aFb1jSDK, "");
        aFb1jSDK.component2 = true;
        try {
            ScheduledExecutorService scheduledExecutorService = aFb1jSDK.getMediationNetwork;
            Runnable runnable = new Runnable() { // from class: com.appsflyer.internal.AFb1jSDK$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    AFb1jSDK.getMonetizationNetwork(AFb1jSDK.this);
                }
            };
            AFb1aSDK.Companion companion = AFb1aSDK.INSTANCE;
            scheduledExecutorService.schedule(runnable, AFb1aSDK.Companion.getCurrencyIso4217Code(), TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            AFLogger.afErrorLog("Background task failed with a throwable: ", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getMonetizationNetwork(AFb1jSDK aFb1jSDK) {
        Intrinsics.checkNotNullParameter(aFb1jSDK, "");
        if (aFb1jSDK.component3 && aFb1jSDK.component2) {
            aFb1jSDK.component3 = false;
            try {
                aFb1jSDK.getMonetizationNetwork.getRevenue();
            } catch (Exception e) {
                AFLogger.afErrorLog("Listener threw exception! ", e);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "");
        AFa1oSDK aFa1oSDK = this.getRevenue;
        Intent intent = activity.getIntent();
        if (((intent == null || !"android.intent.action.VIEW".equals(intent.getAction())) ? null : intent.getData()) != null && intent != aFa1oSDK.getCurrencyIso4217Code) {
            aFa1oSDK.getCurrencyIso4217Code = intent;
        }
        this.getCurrencyIso4217Code.getMonetizationNetwork(activity);
    }
}
