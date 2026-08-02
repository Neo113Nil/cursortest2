package com.appsflyer.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import com.appsflyer.internal.AFd1vSDK;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class AFd1xSDK implements AFd1vSDK {
    private final AFc1kSDK AFAdRevenueData;
    private AFd1wSDK getCurrencyIso4217Code;
    private final ScheduledExecutorService getMediationNetwork;
    private final AFi1nSDK getMonetizationNetwork;
    private final Executor getRevenue;

    public AFd1xSDK(Executor executor, ScheduledExecutorService scheduledExecutorService, AFc1kSDK aFc1kSDK, AFi1nSDK aFi1nSDK) {
        Intrinsics.checkNotNullParameter(executor, "");
        Intrinsics.checkNotNullParameter(scheduledExecutorService, "");
        Intrinsics.checkNotNullParameter(aFc1kSDK, "");
        Intrinsics.checkNotNullParameter(aFi1nSDK, "");
        this.getRevenue = executor;
        this.getMediationNetwork = scheduledExecutorService;
        this.AFAdRevenueData = aFc1kSDK;
        this.getMonetizationNetwork = aFi1nSDK;
    }

    @Override // com.appsflyer.internal.AFd1vSDK
    public final void getRevenue(Context context, AFd1vSDK.AFa1uSDK aFa1uSDK) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(aFa1uSDK, "");
        Intrinsics.checkNotNullParameter(context, "");
        if (this.getCurrencyIso4217Code != null) {
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNull(applicationContext, "");
            ((Application) applicationContext).unregisterActivityLifecycleCallbacks(this.getCurrencyIso4217Code);
        }
        this.getCurrencyIso4217Code = null;
        AFd1wSDK aFd1wSDK = new AFd1wSDK(this.getRevenue, this.getMediationNetwork, this.AFAdRevenueData, this.getMonetizationNetwork, aFa1uSDK);
        this.getCurrencyIso4217Code = aFd1wSDK;
        if (context instanceof Activity) {
            aFd1wSDK.onActivityResumed((Activity) context);
        }
        Application f_ = AFb1qSDK.f_(context);
        if (f_ != null) {
            f_.registerActivityLifecycleCallbacks(this.getCurrencyIso4217Code);
        }
    }

    @Override // com.appsflyer.internal.AFd1vSDK
    public final boolean getCurrencyIso4217Code() {
        return this.getCurrencyIso4217Code != null;
    }

    @Override // com.appsflyer.internal.AFd1vSDK
    public final void getMediationNetwork() {
        AFd1vSDK.AFa1uSDK aFa1uSDK;
        AFd1wSDK aFd1wSDK = this.getCurrencyIso4217Code;
        if (aFd1wSDK == null || (aFa1uSDK = aFd1wSDK.getRevenue) == null) {
            return;
        }
        aFa1uSDK.getRevenue();
    }
}
