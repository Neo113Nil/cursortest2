package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.IronSourceNetwork;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.lc, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4183lc implements InterfaceC4165kc {
    @Override // com.ironsource.InterfaceC4165kc
    public void a(@NotNull J9 j9) {
        j9.getClass();
        try {
            IronSourceNetwork.destroyAd(j9);
        } catch (Exception e) {
            C4157k4.d().a(e);
            IronLog.ADAPTER_API.verbose("destroy ad with identifier: " + j9.e() + " failed. error: " + e.getMessage());
        }
    }
}
