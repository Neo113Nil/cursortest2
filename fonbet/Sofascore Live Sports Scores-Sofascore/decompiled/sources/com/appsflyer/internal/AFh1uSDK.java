package com.appsflyer.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.share.AFAdRevenueData;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class AFh1uSDK extends AFh1zSDK {

    @NonNull
    public final AFAdRevenueData AFLoggerLogLevel;

    @Nullable
    public final Map<String, Object> afWarnLog;

    public AFh1uSDK(@NonNull AFAdRevenueData aFAdRevenueData, @Nullable Map<String, Object> map) {
        super("adrevenue_generic", null, Boolean.TRUE);
        this.AFLoggerLogLevel = aFAdRevenueData;
        this.afWarnLog = map;
    }

    @Override // com.appsflyer.internal.AFh1zSDK
    public final AFe1zSDK d() {
        return AFd1aSDK.AppsFlyerLib;
    }
}
