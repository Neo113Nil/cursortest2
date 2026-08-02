package com.inmobi.media;

import com.inmobi.media.core.config.models.AdConfig;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.b8, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3310b8 extends Og {
    public final int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3310b8(AdConfig.ViewabilityConfig viewabilityConfig, byte b, InterfaceC3880x9 interfaceC3880x9) {
        super(viewabilityConfig, b, interfaceC3880x9);
        C3904y7.k.getClass();
        this.m = 1000;
    }

    @Override // com.inmobi.media.AbstractC3765so
    public int c() {
        AdConfig.ViewabilityConfig viewabilityConfig = this.l;
        return viewabilityConfig != null ? viewabilityConfig.getWebVisibilityThrottleMillis() : this.m;
    }
}
