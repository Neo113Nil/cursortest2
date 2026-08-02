package com.inmobi.media;

import com.inmobi.media.core.config.models.Config;
import com.inmobi.media.core.config.models.TelemetryConfig;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.uk, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3813uk implements A4 {
    @Override // com.inmobi.media.A4
    public final void a(Config config) {
        config.getClass();
        if (config instanceof TelemetryConfig) {
            TelemetryConfig b = C3839vk.b();
            C3839vk.h = new Ik(new C3891xk(b.getEnabled(), b.getAssetReporting().isImageEnabled(), b.getAssetReporting().isGifEnabled(), b.getAssetReporting().isVideoEnabled(), b.getDisableAllGeneralEvents(), b.getPriorityEventsList(), b.getSamplingFactor()), CollectionsKt.S0(C3839vk.d));
            Ek ek = C3839vk.j;
            if (ek != null) {
                TelemetryConfig b2 = C3839vk.b();
                b2.getClass();
                ek.a = b2;
            }
        }
    }
}
