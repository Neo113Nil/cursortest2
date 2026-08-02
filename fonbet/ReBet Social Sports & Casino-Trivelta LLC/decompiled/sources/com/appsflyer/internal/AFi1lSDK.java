package com.appsflyer.internal;

import android.app.Activity;
import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes.dex */
public final class AFi1lSDK implements AFi1oSDK {

    @Nullable
    private String getCurrencyIso4217Code;

    private static String AFAdRevenueData(Activity activity) {
        Uri k_ = AFb1qSDK.k_(activity != null ? activity.getIntent() : null);
        String obj = k_ != null ? k_.toString() : null;
        if (obj == null) {
            obj = "";
        }
        if (getMediationNetwork(obj)) {
            return null;
        }
        return obj;
    }

    private static boolean getMediationNetwork(String str) {
        return StringsKt.startsWith$default(str, "android-app://", false, 2, (Object) null);
    }

    @Override // com.appsflyer.internal.AFi1oSDK
    public final void getMonetizationNetwork(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        String str = this.getCurrencyIso4217Code;
        if (str == null || str.length() == 0) {
            this.getCurrencyIso4217Code = AFAdRevenueData(activity);
        }
    }

    @Override // com.appsflyer.internal.AFi1oSDK
    @Nullable
    public final String getRevenue(@Nullable Activity activity) {
        String str = this.getCurrencyIso4217Code;
        this.getCurrencyIso4217Code = null;
        return (str == null || str.length() == 0) ? AFAdRevenueData(activity) : str;
    }

    @Override // com.appsflyer.internal.AFi1oSDK
    @NotNull
    public final String getMediationNetwork(@Nullable Activity activity) {
        Uri referrer = (activity == null || activity.getIntent() == null) ? null : activity.getReferrer();
        String obj = referrer != null ? referrer.toString() : null;
        return obj == null ? "" : obj;
    }
}
