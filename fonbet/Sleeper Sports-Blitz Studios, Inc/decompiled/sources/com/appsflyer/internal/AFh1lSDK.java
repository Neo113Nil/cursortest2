package com.appsflyer.internal;

import com.appsflyer.AFAdRevenueData;
import java.util.Map;

/* loaded from: classes6.dex */
public final class AFh1lSDK extends AFa1mSDK {
    public final Map<String, Object> equals;
    public final AFAdRevenueData toString;

    public AFh1lSDK(AFAdRevenueData aFAdRevenueData, Map<String, Object> map) {
        super("adrevenue_generic", null, Boolean.TRUE);
        this.toString = aFAdRevenueData;
        this.equals = map;
    }

    @Override // com.appsflyer.internal.AFa1mSDK
    public final AFf1wSDK AFAdRevenueData() {
        return AFf1wSDK.ADREVENUE;
    }
}
