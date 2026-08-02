package com.inmobi.media;

import com.inmobi.media.ads.network.inmobiJson.model.VideoExperience;
import com.inmobi.media.core.config.models.AdConfig;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.pn, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3687pn {
    public final boolean a;
    public final boolean b;
    public final Wg c;
    public final S1 d;
    public final C3506io e;

    public C3687pn(boolean z, VideoExperience videoExperience, AdConfig.NativeConfig nativeConfig) {
        videoExperience.getClass();
        nativeConfig.getClass();
        this.a = z;
        Boolean loopVideoOnComplete = videoExperience.getLoopVideoOnComplete();
        this.b = loopVideoOnComplete != null ? loopVideoOnComplete.booleanValue() : nativeConfig.getVideoPlayerConfig().getLoopVideoOnComplete();
        this.c = new Wg(videoExperience, nativeConfig.getVideoPlayerConfig().getLoopVideoOnComplete(), nativeConfig.getVideoPlayerConfig().getProgressConfig());
        this.d = new S1(videoExperience, nativeConfig.getVideoPlayerConfig().getAudioConfig());
        this.e = new C3506io(nativeConfig.getVideoPlayerConfig().getViewability());
    }
}
