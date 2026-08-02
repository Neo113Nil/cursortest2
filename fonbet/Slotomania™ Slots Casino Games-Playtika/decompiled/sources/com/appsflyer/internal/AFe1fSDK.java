package com.appsflyer.internal;

import android.net.Uri;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFe1sSDK.AnonymousClass3;

/* loaded from: classes7.dex */
public final class AFe1fSDK extends AFe1tSDK<Boolean> {
    private static volatile boolean component4;
    private final AFc1fSDK areAllFieldsValid;
    private Boolean component1;
    private final AFe1sSDK component2;
    private final AFc1tSDK component3;

    @Override // com.appsflyer.internal.AFe1tSDK
    public final boolean getMonetizationNetwork() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1tSDK
    public final long getRevenue() {
        return 30000L;
    }

    public AFe1fSDK(AFc1fSDK aFc1fSDK) {
        super(AFe1uSDK.LOAD_CACHE, new AFe1uSDK[0], "LoadCachedRequests");
        this.component3 = aFc1fSDK.registerClient();
        this.component2 = aFc1fSDK.equals();
        this.areAllFieldsValid = aFc1fSDK;
    }

    public static boolean component1() {
        return component4;
    }

    @Override // com.appsflyer.internal.AFe1tSDK
    public final AFe1rSDK AFAdRevenueData() throws Exception {
        for (AFc1uSDK aFc1uSDK : this.component3.getRevenue()) {
            AFLogger.INSTANCE.i(AFh1zSDK.CACHE, new StringBuilder("resending request: ").append(aFc1uSDK.getCurrencyIso4217Code).toString());
            try {
                AFh1rSDK aFh1rSDK = new AFh1rSDK(getMediationNetwork(aFc1uSDK), aFc1uSDK.getCurrencyIso4217Code(), aFc1uSDK.getMediationNetwork, aFc1uSDK.getMonetizationNetwork);
                AFe1sSDK aFe1sSDK = this.component2;
                aFe1sSDK.getRevenue.execute(aFe1sSDK.new AnonymousClass3(new AFf1ySDK(aFh1rSDK, this.areAllFieldsValid)));
            } catch (Exception e) {
                AFLogger.INSTANCE.e(AFh1zSDK.QUEUE, "Failed to resend cached request", e);
            }
        }
        this.component1 = Boolean.TRUE;
        component4 = true;
        return AFe1rSDK.SUCCESS;
    }

    private static String getMediationNetwork(AFc1uSDK aFc1uSDK) {
        long currentTimeMillis = System.currentTimeMillis();
        long parseLong = Long.parseLong(aFc1uSDK.getMediationNetwork, 10);
        String str = aFc1uSDK.getCurrencyIso4217Code;
        try {
            return Uri.parse(str).buildUpon().appendQueryParameter("isCachedRequest", "true").appendQueryParameter("timeincache", String.valueOf((currentTimeMillis - parseLong) / 1000)).toString();
        } catch (Exception e) {
            AFLogger.afErrorLogForExcManagerOnly("Couldn't parse the uri", e);
            return str;
        }
    }
}
