package com.appsflyer.internal;

import android.app.Activity;
import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes6.dex */
public final class AFi1mSDK implements AFi1nSDK {
    private String getRevenue;

    @Override // com.appsflyer.internal.AFi1nSDK
    public final void getCurrencyIso4217Code(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        String str = this.getRevenue;
        if (str == null || str.length() == 0) {
            this.getRevenue = AFAdRevenueData(activity);
        }
    }

    @Override // com.appsflyer.internal.AFi1nSDK
    public final String getMonetizationNetwork(Activity activity) {
        String str = this.getRevenue;
        this.getRevenue = null;
        String str2 = str;
        return (str2 == null || str2.length() == 0) ? AFAdRevenueData(activity) : str;
    }

    private static String AFAdRevenueData(Activity activity) {
        Uri s_ = AFc1bSDK.s_(activity != null ? activity.getIntent() : null);
        String obj = s_ != null ? s_.toString() : null;
        if (obj == null) {
            obj = "";
        }
        if (getRevenue(obj)) {
            return null;
        }
        return obj;
    }

    private static boolean getRevenue(String str) {
        return StringsKt.startsWith$default(str, "android-app://", false, 2, (Object) null);
    }

    @Override // com.appsflyer.internal.AFi1nSDK
    public final String getRevenue(Activity activity) {
        Uri referrer = (activity == null || activity.getIntent() == null) ? null : activity.getReferrer();
        String obj = referrer != null ? referrer.toString() : null;
        return obj == null ? "" : obj;
    }
}
