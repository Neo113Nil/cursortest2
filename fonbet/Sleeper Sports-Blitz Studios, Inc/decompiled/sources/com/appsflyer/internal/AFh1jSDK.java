package com.appsflyer.internal;

import android.app.Activity;
import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class AFh1jSDK {
    public final String AFAdRevenueData;
    public final Intent getMediationNetwork;
    public final String getRevenue;

    public AFh1jSDK(Activity activity, AFi1nSDK aFi1nSDK) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(aFi1nSDK, "");
        this.getMediationNetwork = activity.getIntent();
        this.getRevenue = aFi1nSDK.getRevenue(activity);
        this.AFAdRevenueData = aFi1nSDK.getMonetizationNetwork(activity);
    }
}
