package com.appsflyer.internal;

import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class AFf1lSDK extends AFe1bSDK<Unit> {
    private final AFi1jSDK component1;

    @Override // com.appsflyer.internal.AFe1bSDK
    public final boolean getMonetizationNetwork() {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFf1lSDK(AFi1jSDK aFi1jSDK) {
        super(AFf1wSDK.PLAY_INTEGRITY_API, new AFf1wSDK[0], "PlayIntegrityApiTask");
        Intrinsics.checkNotNullParameter(aFi1jSDK, "");
        this.component1 = aFi1jSDK;
    }

    @Override // com.appsflyer.internal.AFe1bSDK
    public final AFe1dSDK AFAdRevenueData() {
        this.component1.AFAdRevenueData();
        return AFe1dSDK.SUCCESS;
    }

    @Override // com.appsflyer.internal.AFe1bSDK
    public final long getMediationNetwork() {
        return TimeUnit.MINUTES.toMillis(1L);
    }
}
