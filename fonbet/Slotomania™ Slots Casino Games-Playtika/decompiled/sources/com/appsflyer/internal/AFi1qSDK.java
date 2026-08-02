package com.appsflyer.internal;

import android.app.Activity;
import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes8.dex */
public final class AFi1qSDK implements AFi1rSDK {
    private String getMediationNetwork;

    @Override // com.appsflyer.internal.AFi1rSDK
    public final void getMonetizationNetwork(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        String str = this.getMediationNetwork;
        if (str == null || str.length() == 0) {
            this.getMediationNetwork = AFAdRevenueData(activity);
        }
    }

    @Override // com.appsflyer.internal.AFi1rSDK
    public final String getRevenue(Activity activity) {
        String str = this.getMediationNetwork;
        this.getMediationNetwork = null;
        String str2 = str;
        return (str2 == null || str2.length() == 0) ? AFAdRevenueData(activity) : str;
    }

    private static String AFAdRevenueData(Activity activity) {
        Uri j_ = AFb1rSDK.j_(activity != null ? activity.getIntent() : null);
        String obj = j_ != null ? j_.toString() : null;
        if (obj == null) {
            obj = "";
        }
        if (AFAdRevenueData(obj)) {
            return null;
        }
        return obj;
    }

    private static boolean AFAdRevenueData(String str) {
        return StringsKt.startsWith$default(str, "android-app://", false, 2, (Object) null);
    }

    @Override // com.appsflyer.internal.AFi1rSDK
    public final String getMediationNetwork(Activity activity) {
        Uri referrer = (activity == null || activity.getIntent() == null) ? null : activity.getReferrer();
        String obj = referrer != null ? referrer.toString() : null;
        return obj == null ? "" : obj;
    }
}
