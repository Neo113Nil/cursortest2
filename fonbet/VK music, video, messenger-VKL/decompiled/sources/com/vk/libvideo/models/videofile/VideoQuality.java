package com.vk.libvideo.models.videofile;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.util.Iterator;
import ru.ok.proto.PublisherConfiguration;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VideoFilePlaybackDo.kt */
/* loaded from: classes3.dex */
public final class VideoQuality {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VideoQuality[] $VALUES;
    public static final a Companion;
    public static final VideoQuality QUALITY_1080;
    public static final VideoQuality QUALITY_144;
    public static final VideoQuality QUALITY_1440;
    public static final VideoQuality QUALITY_2160;
    public static final VideoQuality QUALITY_240;
    public static final VideoQuality QUALITY_360;
    public static final VideoQuality QUALITY_4320;
    public static final VideoQuality QUALITY_480;
    public static final VideoQuality QUALITY_720;
    public static final VideoQuality QUALITY_DASH;
    public static final VideoQuality QUALITY_HLS;
    public static final VideoQuality QUALITY_OKMP_RTMP;
    public static final VideoQuality QUALITY_RTMP;
    public static final VideoQuality QUALITY_UNKNOWN;
    public static final VideoQuality SOUND_ONLY;
    private final int value;

    /* compiled from: VideoFilePlaybackDo.kt */
    public static final class a {
        public static VideoQuality a(int i) {
            Object obj;
            Iterator<E> it = VideoQuality.h().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((VideoQuality) obj).i() == i) {
                    break;
                }
            }
            VideoQuality videoQuality = (VideoQuality) obj;
            return videoQuality == null ? VideoQuality.SOUND_ONLY : videoQuality;
        }
    }

    static {
        VideoQuality videoQuality = new VideoQuality("SOUND_ONLY", 0, -6);
        SOUND_ONLY = videoQuality;
        VideoQuality videoQuality2 = new VideoQuality("QUALITY_RTMP", 1, -5);
        QUALITY_RTMP = videoQuality2;
        VideoQuality videoQuality3 = new VideoQuality("QUALITY_DASH", 2, -4);
        QUALITY_DASH = videoQuality3;
        VideoQuality videoQuality4 = new VideoQuality("QUALITY_OKMP_RTMP", 3, -3);
        QUALITY_OKMP_RTMP = videoQuality4;
        VideoQuality videoQuality5 = new VideoQuality("QUALITY_HLS", 4, -2);
        QUALITY_HLS = videoQuality5;
        VideoQuality videoQuality6 = new VideoQuality("QUALITY_UNKNOWN", 5, -1);
        QUALITY_UNKNOWN = videoQuality6;
        VideoQuality videoQuality7 = new VideoQuality("QUALITY_144", 6, 144);
        QUALITY_144 = videoQuality7;
        VideoQuality videoQuality8 = new VideoQuality("QUALITY_240", 7, PsExtractor.VIDEO_STREAM_MASK);
        QUALITY_240 = videoQuality8;
        VideoQuality videoQuality9 = new VideoQuality("QUALITY_360", 8, 360);
        QUALITY_360 = videoQuality9;
        VideoQuality videoQuality10 = new VideoQuality("QUALITY_480", 9, 480);
        QUALITY_480 = videoQuality10;
        VideoQuality videoQuality11 = new VideoQuality("QUALITY_720", 10, PublisherConfiguration.DEFAULT_MAX_RES);
        QUALITY_720 = videoQuality11;
        VideoQuality videoQuality12 = new VideoQuality("QUALITY_1080", 11, 1080);
        QUALITY_1080 = videoQuality12;
        VideoQuality videoQuality13 = new VideoQuality("QUALITY_1440", 12, 1440);
        QUALITY_1440 = videoQuality13;
        VideoQuality videoQuality14 = new VideoQuality("QUALITY_2160", 13, 2160);
        QUALITY_2160 = videoQuality14;
        VideoQuality videoQuality15 = new VideoQuality("QUALITY_4320", 14, 4320);
        QUALITY_4320 = videoQuality15;
        VideoQuality[] videoQualityArr = {videoQuality, videoQuality2, videoQuality3, videoQuality4, videoQuality5, videoQuality6, videoQuality7, videoQuality8, videoQuality9, videoQuality10, videoQuality11, videoQuality12, videoQuality13, videoQuality14, videoQuality15};
        $VALUES = videoQualityArr;
        $ENTRIES = new asp(videoQualityArr);
        Companion = new a();
    }

    public VideoQuality(String str, int i, int i2) {
        this.value = i2;
    }

    public static zrp<VideoQuality> h() {
        return $ENTRIES;
    }

    public static VideoQuality valueOf(String str) {
        return (VideoQuality) Enum.valueOf(VideoQuality.class, str);
    }

    public static VideoQuality[] values() {
        return (VideoQuality[]) $VALUES.clone();
    }

    public final int i() {
        return this.value;
    }
}
