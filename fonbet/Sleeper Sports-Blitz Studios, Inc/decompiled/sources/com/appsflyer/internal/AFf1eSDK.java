package com.appsflyer.internal;

import android.util.Base64;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import java.net.MalformedURLException;
import java.net.URL;

/* loaded from: classes6.dex */
public final class AFf1eSDK extends AFf1pSDK<String> {
    private final AFh1eSDK component3;

    @Override // com.appsflyer.internal.AFf1pSDK
    protected final boolean copydefault() {
        return false;
    }

    @Override // com.appsflyer.internal.AFf1pSDK
    protected final AFe1rSDK<String> getMonetizationNetwork(String str) {
        String encodeToString = Base64.encodeToString(this.component3.getMediationNetwork(), 2);
        AFLogger.afInfoLog("cached data: ".concat(String.valueOf(encodeToString)));
        ((AFf1pSDK) this).component1.getRevenue(this.component3.component1, encodeToString);
        return this.component2.getMonetizationNetwork(this.component3);
    }

    @Override // com.appsflyer.internal.AFf1pSDK, com.appsflyer.internal.AFe1bSDK
    public final boolean getMonetizationNetwork() {
        AFf1wSDK aFf1wSDK;
        AFh1eSDK aFh1eSDK = this.component3;
        if (aFh1eSDK.copydefault != null) {
            aFf1wSDK = aFh1eSDK.copydefault;
        } else {
            aFf1wSDK = AFf1wSDK.CACHED_EVENT;
        }
        return (aFf1wSDK == AFf1wSDK.ARS_VALIDATE && ((AFf1pSDK) this).areAllFieldsValid != null && ((AFf1pSDK) this).areAllFieldsValid.getStatusCode() == 424) || super.getMonetizationNetwork();
    }

    @Override // com.appsflyer.internal.AFf1pSDK
    protected final AppsFlyerRequestListener component1() {
        return this.component3.getMediationNetwork;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AFf1eSDK(AFh1eSDK aFh1eSDK, AFd1kSDK aFd1kSDK) {
        super(r2, r3, aFd1kSDK, r0.toString(), aFh1eSDK.getRevenue);
        AFf1wSDK aFf1wSDK;
        if (aFh1eSDK.copydefault != null) {
            aFf1wSDK = aFh1eSDK.copydefault;
        } else {
            aFf1wSDK = AFf1wSDK.CACHED_EVENT;
        }
        AFf1wSDK aFf1wSDK2 = aFf1wSDK;
        AFf1wSDK[] aFf1wSDKArr = {AFf1wSDK.RC_CDN};
        StringBuilder sb = new StringBuilder();
        sb.append(aFh1eSDK.getRevenue);
        sb.append("-");
        sb.append(getMonetizationNetwork(aFh1eSDK));
        this.component3 = aFh1eSDK;
    }

    private static String getMonetizationNetwork(AFh1eSDK aFh1eSDK) {
        try {
            return new URL(aFh1eSDK.component1).getHost();
        } catch (MalformedURLException unused) {
            return "";
        }
    }
}
