package com.inmobi.media;

import com.inmobi.media.ads.network.inmobiJson.model.VideoExperience;
import com.inmobi.media.core.config.models.AdConfig;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Wg {
    public final boolean a;
    public final boolean b;
    public final int[] c;
    public final int[] d;
    public final int e;
    public final long f;

    public Wg(VideoExperience videoExperience, boolean z, AdConfig.VideoPlayerProgressConfig videoPlayerProgressConfig) {
        videoExperience.getClass();
        videoPlayerProgressConfig.getClass();
        Boolean showProgress = videoExperience.getProgress().getShowProgress();
        this.a = showProgress != null ? showProgress.booleanValue() : videoPlayerProgressConfig.getShowProgress();
        this.b = !(videoExperience.getLoopVideoOnComplete() != null ? r0.booleanValue() : z);
        int[] color = videoExperience.getProgress().getColor();
        this.c = color == null ? CollectionsKt.R0(videoPlayerProgressConfig.getForegroundColor()) : color;
        this.d = CollectionsKt.R0(videoPlayerProgressConfig.getBackgroundColor());
        Integer height = videoExperience.getProgress().getHeight();
        this.e = height != null ? height.intValue() : videoPlayerProgressConfig.getHeight();
        this.f = videoPlayerProgressConfig.getProgressPolling();
    }
}
