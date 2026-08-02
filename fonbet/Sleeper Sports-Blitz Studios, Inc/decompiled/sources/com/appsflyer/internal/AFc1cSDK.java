package com.appsflyer.internal;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public final class AFc1cSDK {
    public final Map<String, Object> getMediationNetwork = new HashMap();
    public Map<String, Object> getRevenue = new HashMap();

    public final void getRevenue(Map<String, Object> map) {
        if (!this.getMediationNetwork.isEmpty()) {
            map.put("partner_data", this.getMediationNetwork);
        }
        if (this.getRevenue.isEmpty()) {
            return;
        }
        AFb1rSDK.getRevenue(map).put("partner_data", this.getRevenue);
        this.getRevenue = new HashMap();
    }
}
