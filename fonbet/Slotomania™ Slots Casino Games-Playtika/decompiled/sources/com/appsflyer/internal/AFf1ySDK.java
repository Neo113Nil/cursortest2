package com.appsflyer.internal;

import android.util.Base64;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import java.net.MalformedURLException;
import java.net.URL;

/* loaded from: classes7.dex */
public final class AFf1ySDK extends AFe1kSDK<String> {
    private final AFh1rSDK component1;

    @Override // com.appsflyer.internal.AFe1kSDK
    protected final boolean copydefault() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1kSDK
    protected final AFd1mSDK<String> getMediationNetwork(String str) {
        String encodeToString = Base64.encodeToString(this.component1.getRevenue(), 2);
        AFLogger.afInfoLog("cached data: ".concat(String.valueOf(encodeToString)));
        this.component3.getCurrencyIso4217Code(this.component1.component2, encodeToString);
        return ((AFe1kSDK) this).areAllFieldsValid.getCurrencyIso4217Code(this.component1);
    }

    @Override // com.appsflyer.internal.AFe1kSDK, com.appsflyer.internal.AFe1tSDK
    public final boolean getMonetizationNetwork() {
        AFe1uSDK aFe1uSDK;
        AFh1rSDK aFh1rSDK = this.component1;
        if (aFh1rSDK.toString != null) {
            aFe1uSDK = aFh1rSDK.toString;
        } else {
            aFe1uSDK = AFe1uSDK.CACHED_EVENT;
        }
        return (aFe1uSDK == AFe1uSDK.ARS_VALIDATE && ((AFe1kSDK) this).component2 != null && ((AFe1kSDK) this).component2.getStatusCode() == 424) || super.getMonetizationNetwork();
    }

    @Override // com.appsflyer.internal.AFe1kSDK
    protected final AppsFlyerRequestListener component2() {
        return this.component1.AFAdRevenueData;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AFf1ySDK(AFh1rSDK aFh1rSDK, AFc1fSDK aFc1fSDK) {
        super(r0, new AFe1uSDK[]{AFe1uSDK.RC_CDN}, aFc1fSDK, new StringBuilder().append(aFh1rSDK.getCurrencyIso4217Code).append("-").append(getMediationNetwork(aFh1rSDK)).toString(), aFh1rSDK.getCurrencyIso4217Code);
        AFe1uSDK aFe1uSDK;
        if (aFh1rSDK.toString != null) {
            aFe1uSDK = aFh1rSDK.toString;
        } else {
            aFe1uSDK = AFe1uSDK.CACHED_EVENT;
        }
        this.component1 = aFh1rSDK;
    }

    private static String getMediationNetwork(AFh1rSDK aFh1rSDK) {
        try {
            return new URL(aFh1rSDK.component2).getHost();
        } catch (MalformedURLException unused) {
            return "";
        }
    }
}
