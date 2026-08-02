package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFj1qSDK;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
public final class AFj1sSDK {
    public final AFd1kSDK getCurrencyIso4217Code;
    public final List<AFj1qSDK> getMediationNetwork = new ArrayList();

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void getMediationNetwork() {
    }

    public AFj1sSDK(AFd1kSDK aFd1kSDK) {
        this.getCurrencyIso4217Code = aFd1kSDK;
    }

    public final synchronized void getMonetizationNetwork(AFj1qSDK aFj1qSDK) {
        this.getMediationNetwork.add(aFj1qSDK);
    }

    public final synchronized AFj1qSDK[] AFAdRevenueData() {
        return (AFj1qSDK[]) this.getMediationNetwork.toArray(new AFj1qSDK[0]);
    }

    public final void getCurrencyIso4217Code(final Runnable runnable) {
        getMonetizationNetwork(new AFj1vSDK(this.getCurrencyIso4217Code.getCurrencyIso4217Code(), this.getCurrencyIso4217Code.getMonetizationNetwork(), AFj1ySDK.FACEBOOK, runnable, new Runnable() { // from class: com.appsflyer.internal.AFj1sSDK$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                AFj1sSDK.this.areAllFieldsValid(runnable);
            }
        }));
    }

    public final AFi1eSDK AFAdRevenueData(final Runnable runnable) {
        return new AFi1eSDK(new Runnable() { // from class: com.appsflyer.internal.AFj1sSDK$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                AFj1sSDK.this.getMonetizationNetwork(runnable);
            }
        }, this.getCurrencyIso4217Code.getMonetizationNetwork(), this.getCurrencyIso4217Code.getCurrencyIso4217Code());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void getMonetizationNetwork(final Runnable runnable) {
        AFj1jSDK.getRevenue(this.getCurrencyIso4217Code.getRevenue(), new Runnable() { // from class: com.appsflyer.internal.AFj1sSDK$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                AFj1sSDK.this.getMediationNetwork(runnable);
            }
        }, 0L, TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void getMediationNetwork(Runnable runnable) {
        try {
            if (getMediationNetwork(new AFh1mSDK())) {
                runnable.run();
            }
        } catch (Throwable th) {
            AFLogger.afErrorLog(th.getMessage(), th);
        }
    }

    public final boolean getMediationNetwork(AFa1mSDK aFa1mSDK) {
        int AFAdRevenueData = this.getCurrencyIso4217Code.getCurrencyIso4217Code().getRevenue.AFAdRevenueData("appsFlyerCount", 0);
        return (!this.getCurrencyIso4217Code.getMediationNetwork().AFAdRevenueData(AppsFlyerProperties.NEW_REFERRER_SENT) && AFAdRevenueData == 1) || (AFAdRevenueData == 1 && !(aFa1mSDK instanceof AFh1mSDK));
    }

    public final Runnable getMediationNetwork(final AFi1eSDK aFi1eSDK, final Runnable runnable) {
        return new Runnable() { // from class: com.appsflyer.internal.AFj1sSDK$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                AFj1sSDK.this.AFAdRevenueData(aFi1eSDK, runnable);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void AFAdRevenueData(AFi1eSDK aFi1eSDK, Runnable runnable) {
        AFd1pSDK mediationNetwork = this.getCurrencyIso4217Code.getMediationNetwork();
        int AFAdRevenueData = this.getCurrencyIso4217Code.getCurrencyIso4217Code().getRevenue.AFAdRevenueData("appsFlyerCount", 0);
        boolean AFAdRevenueData2 = mediationNetwork.AFAdRevenueData(AppsFlyerProperties.NEW_REFERRER_SENT);
        boolean z = aFi1eSDK.component2 == AFj1qSDK.AFa1vSDK.NOT_STARTED;
        if (AFAdRevenueData == 1) {
            if (z || AFAdRevenueData2) {
                runnable.run();
            }
        }
    }

    public final boolean getCurrencyIso4217Code() {
        return this.getCurrencyIso4217Code.getCurrencyIso4217Code().getRevenue("AF_PREINSTALL_DISABLED");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void getRevenue(Runnable runnable) {
        AFj1vSDK aFj1vSDK = new AFj1vSDK(this.getCurrencyIso4217Code.getCurrencyIso4217Code(), this.getCurrencyIso4217Code.getMonetizationNetwork(), AFj1ySDK.FACEBOOK_LITE, runnable, new Runnable() { // from class: com.appsflyer.internal.AFj1sSDK$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                AFj1sSDK.getMediationNetwork();
            }
        });
        getMonetizationNetwork(aFj1vSDK);
        aFj1vSDK.getMonetizationNetwork(this.getCurrencyIso4217Code.AFInAppEventParameterName().getCurrencyIso4217Code);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void areAllFieldsValid(final Runnable runnable) {
        AFj1vSDK aFj1vSDK = new AFj1vSDK(this.getCurrencyIso4217Code.getCurrencyIso4217Code(), this.getCurrencyIso4217Code.getMonetizationNetwork(), AFj1ySDK.INSTAGRAM, runnable, new Runnable() { // from class: com.appsflyer.internal.AFj1sSDK$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                AFj1sSDK.this.getRevenue(runnable);
            }
        });
        getMonetizationNetwork(aFj1vSDK);
        aFj1vSDK.getMonetizationNetwork(this.getCurrencyIso4217Code.AFInAppEventParameterName().getCurrencyIso4217Code);
    }
}
