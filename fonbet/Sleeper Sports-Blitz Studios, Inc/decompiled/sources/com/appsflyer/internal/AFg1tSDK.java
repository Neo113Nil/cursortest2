package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.lvl.AppsFlyerLVL;

/* loaded from: classes6.dex */
public final class AFg1tSDK {

    interface AFa1vSDK {
        void getMediationNetwork(String str, Exception exc);

        void getMonetizationNetwork(String str, String str2);
    }

    public final boolean AFAdRevenueData(long j, Context context, final AFa1vSDK aFa1vSDK) {
        try {
            AppsFlyerLVL.checkLicense(j, context, new AppsFlyerLVL.resultListener() { // from class: com.appsflyer.internal.AFg1tSDK.1
                public final void onLvlResult(String str, String str2) {
                    if (str != null && str2 != null) {
                        aFa1vSDK.getMonetizationNetwork(str, str2);
                    } else if (str2 == null) {
                        aFa1vSDK.getMediationNetwork("onLvlResult with error", new Exception("AFLVL Invalid signature"));
                    } else {
                        aFa1vSDK.getMediationNetwork("onLvlResult with error", new Exception("AFLVL Invalid signedData"));
                    }
                }

                public final void onLvlFailure(Exception exc) {
                    aFa1vSDK.getMediationNetwork("onLvlFailure with exception", exc);
                }
            });
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
