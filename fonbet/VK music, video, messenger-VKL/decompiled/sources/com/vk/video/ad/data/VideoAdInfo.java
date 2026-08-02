package com.vk.video.ad.data;

import com.vk.dto.common.VideoAdData;
import defpackage.q0;
import java.io.Serializable;
import xsna.epx;
import xsna.yg5;

/* compiled from: VideoAdInfo.kt */
/* loaded from: classes5.dex */
public final class VideoAdInfo implements Serializable {
    private final yg5 autoPlay;
    private final boolean isVertical;
    private final VideoAdData videoAdData;

    public VideoAdInfo(yg5 yg5Var, VideoAdData videoAdData, boolean z) {
        this.autoPlay = yg5Var;
        this.videoAdData = videoAdData;
        this.isVertical = z;
    }

    public final yg5 d() {
        return this.autoPlay;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoAdInfo)) {
            return false;
        }
        VideoAdInfo videoAdInfo = (VideoAdInfo) obj;
        return epx.f(this.autoPlay, videoAdInfo.autoPlay) && epx.f(this.videoAdData, videoAdInfo.videoAdData) && this.isVertical == videoAdInfo.isVertical;
    }

    public final VideoAdData g() {
        return this.videoAdData;
    }

    public final boolean h() {
        return this.isVertical;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isVertical) + ((this.videoAdData.hashCode() + (this.autoPlay.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoAdInfo(autoPlay=");
        sb.append(this.autoPlay);
        sb.append(", videoAdData=");
        sb.append(this.videoAdData);
        sb.append(", isVertical=");
        return q0.a(sb, this.isVertical, ')');
    }
}
