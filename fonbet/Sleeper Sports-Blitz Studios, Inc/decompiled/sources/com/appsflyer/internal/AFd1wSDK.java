package com.appsflyer.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFd1vSDK;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
final class AFd1wSDK implements Application.ActivityLifecycleCallbacks {
    private final ScheduledExecutorService AFAdRevenueData;
    private boolean areAllFieldsValid;
    private boolean component3;
    private final AFc1kSDK getCurrencyIso4217Code;
    private final Executor getMediationNetwork;
    private final AFi1nSDK getMonetizationNetwork;
    final AFd1vSDK.AFa1uSDK getRevenue;

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

    public AFd1wSDK(Executor executor, ScheduledExecutorService scheduledExecutorService, AFc1kSDK aFc1kSDK, AFi1nSDK aFi1nSDK, AFd1vSDK.AFa1uSDK aFa1uSDK) {
        Intrinsics.checkNotNullParameter(executor, "");
        Intrinsics.checkNotNullParameter(scheduledExecutorService, "");
        Intrinsics.checkNotNullParameter(aFc1kSDK, "");
        Intrinsics.checkNotNullParameter(aFi1nSDK, "");
        Intrinsics.checkNotNullParameter(aFa1uSDK, "");
        this.getMediationNetwork = executor;
        this.AFAdRevenueData = scheduledExecutorService;
        this.getCurrencyIso4217Code = aFc1kSDK;
        this.getMonetizationNetwork = aFi1nSDK;
        this.getRevenue = aFa1uSDK;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        final AFh1jSDK aFh1jSDK = new AFh1jSDK(activity, this.getMonetizationNetwork);
        this.getMediationNetwork.execute(new Runnable() { // from class: com.appsflyer.internal.AFd1wSDK$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                AFd1wSDK.getMonetizationNetwork(AFd1wSDK.this, aFh1jSDK);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getMonetizationNetwork(AFd1wSDK aFd1wSDK, AFh1jSDK aFh1jSDK) {
        Intrinsics.checkNotNullParameter(aFd1wSDK, "");
        Intrinsics.checkNotNullParameter(aFh1jSDK, "");
        if (!aFd1wSDK.areAllFieldsValid) {
            try {
                aFd1wSDK.getRevenue.getCurrencyIso4217Code(aFh1jSDK);
            } catch (Exception e) {
                AFLogger.afErrorLog("Listener thrown an exception: ", e, true);
            }
        }
        aFd1wSDK.component3 = false;
        aFd1wSDK.areAllFieldsValid = true;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        this.getMediationNetwork.execute(new Runnable() { // from class: com.appsflyer.internal.AFd1wSDK$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                AFd1wSDK.getMonetizationNetwork(AFd1wSDK.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getMonetizationNetwork(final AFd1wSDK aFd1wSDK) {
        Intrinsics.checkNotNullParameter(aFd1wSDK, "");
        aFd1wSDK.component3 = true;
        try {
            ScheduledExecutorService scheduledExecutorService = aFd1wSDK.AFAdRevenueData;
            Runnable runnable = new Runnable() { // from class: com.appsflyer.internal.AFd1wSDK$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    AFd1wSDK.getMediationNetwork(AFd1wSDK.this);
                }
            };
            AFd1vSDK.Companion companion = AFd1vSDK.INSTANCE;
            scheduledExecutorService.schedule(runnable, AFd1vSDK.Companion.getRevenue(), TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            AFLogger.afErrorLog("Background task failed with a throwable: ", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getMediationNetwork(AFd1wSDK aFd1wSDK) {
        Intrinsics.checkNotNullParameter(aFd1wSDK, "");
        if (aFd1wSDK.areAllFieldsValid && aFd1wSDK.component3) {
            aFd1wSDK.areAllFieldsValid = false;
            try {
                aFd1wSDK.getRevenue.getRevenue();
            } catch (Exception e) {
                AFLogger.afErrorLog("Listener threw exception! ", e);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "");
        AFc1kSDK aFc1kSDK = this.getCurrencyIso4217Code;
        Intent intent = activity.getIntent();
        if (((intent == null || !"android.intent.action.VIEW".equals(intent.getAction())) ? null : intent.getData()) != null && intent != aFc1kSDK.getRevenue) {
            aFc1kSDK.getRevenue = intent;
        }
        this.getMonetizationNetwork.getCurrencyIso4217Code(activity);
    }
}
