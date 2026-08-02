package com.appsflyer.internal;

import android.util.Base64;
import com.appsflyer.AFLogger;
import java.nio.charset.Charset;

/* loaded from: classes6.dex */
public final class AFg1vSDK {
    public long getCurrencyIso4217Code;
    public final AFd1pSDK getMediationNetwork;
    public long getRevenue;
    public AFi1ySDK AFAdRevenueData = null;
    public AFi1ySDK getMonetizationNetwork = getRevenue();

    public AFg1vSDK(AFd1pSDK aFd1pSDK) {
        this.getMediationNetwork = aFd1pSDK;
        this.getCurrencyIso4217Code = aFd1pSDK.getRevenue("af_rc_timestamp", 0L);
        this.getRevenue = aFd1pSDK.getRevenue("af_rc_max_age", 0L);
    }

    private AFi1ySDK getRevenue() {
        String AFAdRevenueData = this.getMediationNetwork.AFAdRevenueData("af_remote_config", (String) null);
        if (AFAdRevenueData == null) {
            AFLogger.INSTANCE.d(AFh1xSDK.REMOTE_CONTROL, "No configuration found in cache");
            return null;
        }
        try {
            return new AFi1ySDK(new String(Base64.decode(AFAdRevenueData, 2), Charset.defaultCharset()));
        } catch (Exception e) {
            AFLogger.INSTANCE.e(AFh1xSDK.REMOTE_CONTROL, "Error reading malformed configuration from cache, requires fetching from remote again", e, true);
            return null;
        }
    }
}
