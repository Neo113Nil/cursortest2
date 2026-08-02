package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.google.common.net.HttpHeaders;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;

/* loaded from: classes6.dex */
public final class AFe1jSDK extends AFe1kSDK<String> {
    private final String component1;
    private final AFk1wSDK copy;
    private final AFc1kSDK hashCode;

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, "com.appsflyer");
        p0.startActivity(p1);
    }

    @Override // com.appsflyer.internal.AFe1kSDK
    protected final AppsFlyerRequestListener component2() {
        return null;
    }

    @Override // com.appsflyer.internal.AFe1kSDK
    protected final boolean copydefault() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1kSDK, com.appsflyer.internal.AFe1tSDK
    public final boolean getMonetizationNetwork() {
        return false;
    }

    public AFe1jSDK(AFc1fSDK aFc1fSDK, String str, AFk1wSDK aFk1wSDK) {
        super(AFe1uSDK.IMPRESSIONS, new AFe1uSDK[]{AFe1uSDK.RC_CDN, AFe1uSDK.FETCH_ADVERTISING_ID}, aFc1fSDK, str);
        this.component1 = str;
        this.copy = aFk1wSDK;
        this.hashCode = aFc1fSDK.getRevenue();
    }

    @Override // com.appsflyer.internal.AFe1kSDK
    protected final AFd1mSDK<String> getMediationNetwork(String str) {
        String obj;
        AFd1lSDK aFd1lSDK = ((AFe1kSDK) this).areAllFieldsValid;
        String currencyIso4217Code = this.hashCode.getCurrencyIso4217Code();
        if (AFj1eSDK.getCurrencyIso4217Code(currencyIso4217Code)) {
            obj = this.component1;
        } else {
            obj = Uri.parse(this.component1).buildUpon().appendQueryParameter("advertising_id", currencyIso4217Code).build().toString();
        }
        return aFd1lSDK.getMediationNetwork(obj);
    }

    @Override // com.appsflyer.internal.AFe1kSDK, com.appsflyer.internal.AFe1tSDK
    public final void getCurrencyIso4217Code() {
        super.getCurrencyIso4217Code();
        AFd1cSDK<Result> aFd1cSDK = ((AFe1kSDK) this).component2;
        if (aFd1cSDK != 0) {
            int statusCode = aFd1cSDK.getStatusCode();
            if (statusCode == 200) {
                AFLogger.afInfoLog(new StringBuilder("Cross promotion impressions success: ").append(this.component1).toString(), false);
                return;
            }
            if (statusCode == 301 || statusCode == 302) {
                AFLogger.afInfoLog(new StringBuilder("Cross promotion redirection success: ").append(this.component1).toString(), false);
                String revenue = aFd1cSDK.getRevenue(HttpHeaders.LOCATION);
                AFk1wSDK aFk1wSDK = this.copy;
                if (aFk1wSDK == null || revenue == null) {
                    return;
                }
                aFk1wSDK.AFAdRevenueData = revenue;
                AFk1wSDK aFk1wSDK2 = this.copy;
                Context context = aFk1wSDK2.getMonetizationNetwork.get();
                if (context != null) {
                    try {
                        if (aFk1wSDK2.AFAdRevenueData != null) {
                            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, new Intent("android.intent.action.VIEW", Uri.parse(aFk1wSDK2.AFAdRevenueData)).setFlags(268435456));
                            return;
                        }
                        return;
                    } catch (Exception e) {
                        AFLogger.afErrorLog("Failed to open cross promotion url, does OS have browser installed?".concat(String.valueOf(e)), e);
                        return;
                    }
                }
                return;
            }
            AFLogger.afInfoLog(new StringBuilder("call to ").append(this.component1).append(" failed: ").append(statusCode).toString());
        }
    }
}
