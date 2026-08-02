package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.IronSourceNetwork;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.lc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C2528lc implements InterfaceC2510kc {
    @Override // com.ironsource.InterfaceC2510kc
    public void a(J9 adInstance) {
        Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        try {
            IronSourceNetwork.destroyAd(adInstance);
        } catch (Exception e) {
            C2556n4.d().a(e);
            IronLog.ADAPTER_API.verbose("destroy ad with identifier: " + adInstance.e() + " failed. error: " + e.getMessage());
        }
    }
}
