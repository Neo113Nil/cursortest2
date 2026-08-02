package com.inmobi.media;

import com.inmobi.media.core.config.models.Config;
import com.inmobi.media.core.config.models.CrashConfig;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Z9 implements A4 {
    @Override // com.inmobi.media.A4
    public final void a(Config config) {
        config.getClass();
        if (config instanceof CrashConfig) {
            Xa xa = AbstractC3286aa.d;
            CrashConfig crashConfig = (CrashConfig) config;
            xa.getClass();
            xa.a = crashConfig;
            C3338ca c3338ca = xa.c;
            c3338ca.getClass();
            c3338ca.a.a = crashConfig.getCrashConfig().getSamplingPercent();
            c3338ca.b.a = crashConfig.getCatchConfig().getSamplingPercent();
            c3338ca.c.a = crashConfig.getAnr().getWatchdog().getSamplingPercent();
            c3338ca.d.a = crashConfig.getAnr().getAppExitReason().getSamplingPercent();
            C3773t6 c3773t6 = xa.b;
            if (c3773t6 != null) {
                C3540k6 eventConfig = crashConfig.getEventConfig();
                eventConfig.getClass();
                c3773t6.i = eventConfig;
            }
            C5 c5 = AbstractC3286aa.c;
            if (c5 != null) {
                c5.a = crashConfig;
            }
        }
    }
}
