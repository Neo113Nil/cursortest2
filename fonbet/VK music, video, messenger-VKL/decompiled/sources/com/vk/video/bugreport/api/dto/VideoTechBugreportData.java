package com.vk.video.bugreport.api.dto;

import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.cz4;
import xsna.epx;
import xsna.jlt0;
import xsna.lgq;
import xsna.v0b0;
import xsna.wsk0;
import xsna.zrp;

/* compiled from: VideoTechBugreportData.kt */
/* loaded from: classes5.dex */
public final class VideoTechBugreportData {
    public final VideoType a;
    public final wsk0 b;
    public final v0b0 c;
    public final jlt0 d;
    public final cz4 e;
    public final DecodersDebugInfo f;
    public final lgq g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VideoTechBugreportData.kt */
    public static final class VideoType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ VideoType[] $VALUES;
        public static final VideoType CLIP;
        public static final VideoType INTERACTIVE;
        public static final VideoType VIDEO;

        static {
            VideoType videoType = new VideoType(SignalingProtocol.MEDIA_OPTION_VIDEO, 0);
            VIDEO = videoType;
            VideoType videoType2 = new VideoType("CLIP", 1);
            CLIP = videoType2;
            VideoType videoType3 = new VideoType("INTERACTIVE", 2);
            INTERACTIVE = videoType3;
            VideoType[] videoTypeArr = {videoType, videoType2, videoType3};
            $VALUES = videoTypeArr;
            $ENTRIES = new asp(videoTypeArr);
        }

        public VideoType() {
            throw null;
        }

        public static VideoType valueOf(String str) {
            return (VideoType) Enum.valueOf(VideoType.class, str);
        }

        public static VideoType[] values() {
            return (VideoType[]) $VALUES.clone();
        }
    }

    public VideoTechBugreportData(VideoType videoType, wsk0 wsk0Var, v0b0 v0b0Var, jlt0 jlt0Var, cz4 cz4Var, DecodersDebugInfo decodersDebugInfo, lgq lgqVar) {
        this.a = videoType;
        this.b = wsk0Var;
        this.c = v0b0Var;
        this.d = jlt0Var;
        this.e = cz4Var;
        this.f = decodersDebugInfo;
        this.g = lgqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoTechBugreportData)) {
            return false;
        }
        VideoTechBugreportData videoTechBugreportData = (VideoTechBugreportData) obj;
        return this.a == videoTechBugreportData.a && epx.f(this.b, videoTechBugreportData.b) && epx.f(this.c, videoTechBugreportData.c) && epx.f(this.d, videoTechBugreportData.d) && epx.f(this.e, videoTechBugreportData.e) && epx.f(this.f, videoTechBugreportData.f) && epx.f(this.g, videoTechBugreportData.g);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        jlt0 jlt0Var = this.d;
        int hashCode2 = (hashCode + (jlt0Var == null ? 0 : jlt0Var.hashCode())) * 31;
        cz4 cz4Var = this.e;
        return this.g.hashCode() + ((this.f.hashCode() + ((hashCode2 + (cz4Var != null ? cz4Var.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        return "VideoTechBugreportData(type=" + this.a + ", statInfo=" + this.b + ", playerInfo=" + this.c + ", videoTrackInfo=" + this.d + ", audioTrackInfo=" + this.e + ", decodersInfo=" + this.f + ", extraVideoDebugInfo=" + this.g + ')';
    }
}
