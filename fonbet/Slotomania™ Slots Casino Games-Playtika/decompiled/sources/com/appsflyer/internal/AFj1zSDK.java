package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFj1ySDK;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final class AFj1zSDK {
    public final List<AFj1ySDK> AFAdRevenueData = new ArrayList();
    public final AFc1fSDK getMonetizationNetwork;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void getMonetizationNetwork() {
    }

    public AFj1zSDK(AFc1fSDK aFc1fSDK) {
        this.getMonetizationNetwork = aFc1fSDK;
    }

    public final synchronized void getMonetizationNetwork(AFj1ySDK aFj1ySDK) {
        this.AFAdRevenueData.add(aFj1ySDK);
    }

    public final synchronized AFj1ySDK[] getRevenue() {
        return (AFj1ySDK[]) this.AFAdRevenueData.toArray(new AFj1ySDK[0]);
    }

    public final void getMediationNetwork(final Runnable runnable) {
        getMonetizationNetwork(new AFi1cSDK(this.getMonetizationNetwork.getRevenue(), this.getMonetizationNetwork.AFAdRevenueData(), AFi1eSDK.FACEBOOK, runnable, new Runnable() { // from class: com.appsflyer.internal.AFj1zSDK$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                AFj1zSDK.this.component2(runnable);
            }
        }));
    }

    public final AFi1iSDK getMonetizationNetwork(final Runnable runnable) {
        return new AFi1iSDK(new Runnable() { // from class: com.appsflyer.internal.AFj1zSDK$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                AFj1zSDK.this.getRevenue(runnable);
            }
        }, this.getMonetizationNetwork.AFAdRevenueData(), this.getMonetizationNetwork.getRevenue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void getRevenue(final Runnable runnable) {
        AFj1gSDK.getMediationNetwork(this.getMonetizationNetwork.getMonetizationNetwork(), new Runnable() { // from class: com.appsflyer.internal.AFj1zSDK$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                AFj1zSDK.this.getCurrencyIso4217Code(runnable);
            }
        }, 0L, TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void getCurrencyIso4217Code(Runnable runnable) {
        try {
            if (getRevenue(new AFh1oSDK())) {
                runnable.run();
            }
        } catch (Throwable th) {
            AFLogger.afErrorLog(th.getMessage(), th);
        }
    }

    public final boolean getRevenue(AFh1tSDK aFh1tSDK) {
        int AFAdRevenueData = this.getMonetizationNetwork.getRevenue().getRevenue.AFAdRevenueData("appsFlyerCount", 0);
        return (!this.getMonetizationNetwork.component1().AFAdRevenueData(AppsFlyerProperties.NEW_REFERRER_SENT, false) && AFAdRevenueData == 1) || (AFAdRevenueData == 1 && !(aFh1tSDK instanceof AFh1oSDK));
    }

    public final Runnable getMediationNetwork(final AFi1iSDK aFi1iSDK, final Runnable runnable) {
        return new Runnable() { // from class: com.appsflyer.internal.AFj1zSDK$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                AFj1zSDK.this.AFAdRevenueData(aFi1iSDK, runnable);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void AFAdRevenueData(AFi1iSDK aFi1iSDK, Runnable runnable) {
        AFc1sSDK component1 = this.getMonetizationNetwork.component1();
        int AFAdRevenueData = this.getMonetizationNetwork.getRevenue().getRevenue.AFAdRevenueData("appsFlyerCount", 0);
        boolean AFAdRevenueData2 = component1.AFAdRevenueData(AppsFlyerProperties.NEW_REFERRER_SENT, false);
        boolean z = aFi1iSDK.component1 == AFj1ySDK.AFa1vSDK.NOT_STARTED;
        if (AFAdRevenueData == 1) {
            if (z || AFAdRevenueData2) {
                runnable.run();
            }
        }
    }

    public final boolean getMediationNetwork() {
        return this.getMonetizationNetwork.getRevenue().getRevenue("AF_PREINSTALL_DISABLED", false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void AFAdRevenueData(Runnable runnable) {
        AFi1cSDK aFi1cSDK = new AFi1cSDK(this.getMonetizationNetwork.getRevenue(), this.getMonetizationNetwork.AFAdRevenueData(), AFi1eSDK.FACEBOOK_LITE, runnable, new Runnable() { // from class: com.appsflyer.internal.AFj1zSDK$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                AFj1zSDK.getMonetizationNetwork();
            }
        });
        getMonetizationNetwork(aFi1cSDK);
        aFi1cSDK.getRevenue(this.getMonetizationNetwork.AFLogger().getMonetizationNetwork);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void component2(final Runnable runnable) {
        AFi1cSDK aFi1cSDK = new AFi1cSDK(this.getMonetizationNetwork.getRevenue(), this.getMonetizationNetwork.AFAdRevenueData(), AFi1eSDK.INSTAGRAM, runnable, new Runnable() { // from class: com.appsflyer.internal.AFj1zSDK$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                AFj1zSDK.this.AFAdRevenueData(runnable);
            }
        });
        getMonetizationNetwork(aFi1cSDK);
        aFi1cSDK.getRevenue(this.getMonetizationNetwork.AFLogger().getMonetizationNetwork);
    }
}
