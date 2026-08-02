package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.IronSourceNetwork;

/* renamed from: com.ironsource.mc, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4442mc implements InterfaceC4424lc {
    @Override // com.ironsource.InterfaceC4424lc
    public void a(K9 k9) {
        try {
            IronSourceNetwork.destroyAd(k9);
        } catch (Exception e) {
            C4452n4.d().a(e);
            IronLog.ADAPTER_API.verbose("destroy ad with identifier: " + k9.e() + " failed. error: " + e.getMessage());
        }
    }
}
