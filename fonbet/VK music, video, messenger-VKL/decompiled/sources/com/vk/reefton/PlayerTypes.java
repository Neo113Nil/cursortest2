package com.vk.reefton;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vk.reefton.dto.ReefContentQuality;
import one.video.player.model.FrameSize;
import ru.ok.proto.PublisherConfiguration;
import xsna.asp;
import xsna.zrp;

/* compiled from: PlayerTypes.kt */
/* loaded from: classes5.dex */
public final class PlayerTypes {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PlayerTypes.kt */
    public static final class QUALITIES {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ QUALITIES[] $VALUES;
        public static final a Companion;
        public static final QUALITIES P1080;
        public static final QUALITIES P1440;
        public static final QUALITIES P2160;
        public static final QUALITIES P240;
        public static final QUALITIES P360;
        public static final QUALITIES P480;
        public static final QUALITIES P720;
        private final FrameSize frameSize;
        private final int value;

        /* compiled from: PlayerTypes.kt */
        public static final class a {
        }

        static {
            QUALITIES qualities = new QUALITIES("P240", 0, FrameSize._240p, PsExtractor.VIDEO_STREAM_MASK);
            P240 = qualities;
            QUALITIES qualities2 = new QUALITIES("P360", 1, FrameSize._360p, 360);
            P360 = qualities2;
            QUALITIES qualities3 = new QUALITIES("P480", 2, FrameSize._480p, 480);
            P480 = qualities3;
            QUALITIES qualities4 = new QUALITIES("P720", 3, FrameSize._720p, PublisherConfiguration.DEFAULT_MAX_RES);
            P720 = qualities4;
            QUALITIES qualities5 = new QUALITIES("P1080", 4, FrameSize._1080p, 1080);
            P1080 = qualities5;
            QUALITIES qualities6 = new QUALITIES("P1440", 5, FrameSize._1440p, 1440);
            P1440 = qualities6;
            QUALITIES qualities7 = new QUALITIES("P2160", 6, FrameSize._2160p, 2160);
            P2160 = qualities7;
            QUALITIES[] qualitiesArr = {qualities, qualities2, qualities3, qualities4, qualities5, qualities6, qualities7};
            $VALUES = qualitiesArr;
            $ENTRIES = new asp(qualitiesArr);
            Companion = new a();
        }

        public QUALITIES(String str, int i, FrameSize frameSize, int i2) {
            this.frameSize = frameSize;
            this.value = i2;
        }

        public static QUALITIES valueOf(String str) {
            return (QUALITIES) Enum.valueOf(QUALITIES.class, str);
        }

        public static QUALITIES[] values() {
            return (QUALITIES[]) $VALUES.clone();
        }

        public final FrameSize h() {
            return this.frameSize;
        }

        public final int i() {
            return this.value;
        }
    }

    public static final ReefContentQuality a(int i) {
        return i != -4 ? i != -3 ? i != -2 ? i != -1 ? i != 240 ? i != 360 ? i != 480 ? i != 720 ? i != 1080 ? i != 1440 ? i != 2160 ? ReefContentQuality.UNKNOWN : ReefContentQuality.P2160 : ReefContentQuality.P1440 : ReefContentQuality.P1080 : ReefContentQuality.P720 : ReefContentQuality.P480 : ReefContentQuality.P360 : ReefContentQuality.P240 : ReefContentQuality.UNKNOWN : ReefContentQuality.AUTO : ReefContentQuality.UNKNOWN : ReefContentQuality.AUTO;
    }

    public static final int b(int i, int i2) {
        for (QUALITIES qualities : QUALITIES.values()) {
            if (i <= qualities.h().getWidth() && i2 <= qualities.h().getHeight()) {
                return qualities.i();
            }
        }
        return -1;
    }
}
