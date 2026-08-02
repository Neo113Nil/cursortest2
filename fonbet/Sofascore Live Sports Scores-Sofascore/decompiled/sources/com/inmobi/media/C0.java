package com.inmobi.media;

import com.inmobi.media.core.config.models.AdConfig;
import com.inmobi.media.core.config.models.Config;
import defpackage.ku3;
import defpackage.s9a;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class C0 implements A4 {
    @Override // com.inmobi.media.A4
    public final void a(Config config) {
        B0 b0;
        config.getClass();
        if ((config instanceof AdConfig) && (b0 = F0.b) != null) {
            AdConfig adConfig = (AdConfig) config;
            if (!b0.a.get()) {
                if (adConfig.getAdQuality().getEnabled() && !b0.a.get() && ((AdConfig) AbstractC3435g4.a.a(AdConfig.class)).getAdQuality().getEnabled()) {
                    b0.a();
                    return;
                }
                return;
            }
            if (adConfig.getAdQuality().getEnabled()) {
                return;
            }
            b0.a.set(false);
            ku3 ku3Var = F0.f;
            if (ku3Var != null) {
                s9a.o(ku3Var, new CancellationException("Shutdown"));
            }
            F0.f = null;
        }
    }
}
