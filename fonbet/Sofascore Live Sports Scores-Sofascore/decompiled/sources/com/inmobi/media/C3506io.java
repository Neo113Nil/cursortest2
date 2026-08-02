package com.inmobi.media;

import com.inmobi.media.core.config.models.AdConfig;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.io, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3506io {
    public final int a;
    public final int b;
    public final H5 c;

    public C3506io(AdConfig.VideoPlayerViewabilityConfig videoPlayerViewabilityConfig) {
        videoPlayerViewabilityConfig.getClass();
        this.a = videoPlayerViewabilityConfig.getMinPercentageVisible();
        this.b = videoPlayerViewabilityConfig.getPollingInterval();
        this.c = Gl.a(videoPlayerViewabilityConfig.getMinDimensions());
    }
}
