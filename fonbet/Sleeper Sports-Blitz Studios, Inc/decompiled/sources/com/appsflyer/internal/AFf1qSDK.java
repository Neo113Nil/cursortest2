package com.appsflyer.internal;

import android.net.Uri;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFf1zSDK.AnonymousClass3;

/* loaded from: classes6.dex */
public final class AFf1qSDK extends AFe1bSDK<Boolean> {
    private static volatile boolean component3 = false;
    private final AFf1zSDK areAllFieldsValid;
    private final AFd1kSDK component1;
    private Boolean component2;
    private final AFb1vSDK component4;

    @Override // com.appsflyer.internal.AFe1bSDK
    public final long getMediationNetwork() {
        return 30000L;
    }

    @Override // com.appsflyer.internal.AFe1bSDK
    public final boolean getMonetizationNetwork() {
        return false;
    }

    public AFf1qSDK(AFd1kSDK aFd1kSDK) {
        super(AFf1wSDK.LOAD_CACHE, new AFf1wSDK[0], "LoadCachedRequests");
        this.component4 = aFd1kSDK.AFKeystoreWrapper();
        this.areAllFieldsValid = aFd1kSDK.copydefault();
        this.component1 = aFd1kSDK;
    }

    public static boolean component1() {
        return component3;
    }

    @Override // com.appsflyer.internal.AFe1bSDK
    public final AFe1dSDK AFAdRevenueData() throws Exception {
        for (AFb1iSDK aFb1iSDK : this.component4.AFAdRevenueData()) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFh1xSDK aFh1xSDK = AFh1xSDK.CACHE;
            StringBuilder sb = new StringBuilder("resending request: ");
            sb.append(aFb1iSDK.AFAdRevenueData);
            aFLogger.i(aFh1xSDK, sb.toString());
            try {
                AFh1eSDK aFh1eSDK = new AFh1eSDK(getRevenue(aFb1iSDK), aFb1iSDK.getCurrencyIso4217Code(), aFb1iSDK.getMonetizationNetwork, aFb1iSDK.getRevenue);
                AFf1zSDK aFf1zSDK = this.areAllFieldsValid;
                aFf1zSDK.getRevenue.execute(aFf1zSDK.new AnonymousClass3(new AFf1eSDK(aFh1eSDK, this.component1)));
            } catch (Exception e) {
                AFLogger.INSTANCE.e(AFh1xSDK.QUEUE, "Failed to resend cached request", e);
            }
        }
        this.component2 = Boolean.TRUE;
        component3 = true;
        return AFe1dSDK.SUCCESS;
    }

    private static String getRevenue(AFb1iSDK aFb1iSDK) {
        long currentTimeMillis = System.currentTimeMillis();
        long parseLong = Long.parseLong(aFb1iSDK.getMonetizationNetwork, 10);
        String str = aFb1iSDK.AFAdRevenueData;
        try {
            return Uri.parse(str).buildUpon().appendQueryParameter("isCachedRequest", "true").appendQueryParameter("timeincache", String.valueOf((currentTimeMillis - parseLong) / 1000)).toString();
        } catch (Exception e) {
            AFLogger.afErrorLogForExcManagerOnly("Couldn't parse the uri", e);
            return str;
        }
    }
}
