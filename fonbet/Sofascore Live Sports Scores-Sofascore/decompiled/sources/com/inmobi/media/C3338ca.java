package com.inmobi.media;

import com.inmobi.media.core.config.models.CrashConfig;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.ca, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3338ca {
    public final C3347cj a;
    public final C3347cj b;
    public final C3347cj c;
    public final C3347cj d;

    public C3338ca(CrashConfig crashConfig) {
        crashConfig.getClass();
        this.a = new C3347cj(crashConfig.getCrashConfig().getSamplingPercent());
        this.b = new C3347cj(crashConfig.getCatchConfig().getSamplingPercent());
        this.c = new C3347cj(crashConfig.getAnr().getWatchdog().getSamplingPercent());
        this.d = new C3347cj(crashConfig.getAnr().getAppExitReason().getSamplingPercent());
    }
}
