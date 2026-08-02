package com.appsflyer.internal;

import android.app.Activity;
import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class AFh1vSDK {
    public final String AFAdRevenueData;
    public final Intent getCurrencyIso4217Code;
    public final String getMediationNetwork;

    public AFh1vSDK(Activity activity, AFi1rSDK aFi1rSDK) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(aFi1rSDK, "");
        this.getCurrencyIso4217Code = activity.getIntent();
        this.getMediationNetwork = aFi1rSDK.getMediationNetwork(activity);
        this.AFAdRevenueData = aFi1rSDK.getRevenue(activity);
    }
}
