package com.inmobi.media;

import com.inmobi.media.core.config.models.AdConfig;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.a4, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3280a4 extends C3310b8 {
    public final int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3280a4(AdConfig.ViewabilityConfig viewabilityConfig, InterfaceC3880x9 interfaceC3880x9) {
        super(viewabilityConfig, (byte) 1, interfaceC3880x9);
        C3904y7.k.getClass();
        this.n = 500;
    }

    @Override // com.inmobi.media.C3310b8, com.inmobi.media.AbstractC3765so
    public final int c() {
        AdConfig.ViewabilityConfig viewabilityConfig = this.l;
        return viewabilityConfig != null ? viewabilityConfig.getCompanionVisibilityThrottleMillis() : this.n;
    }
}
