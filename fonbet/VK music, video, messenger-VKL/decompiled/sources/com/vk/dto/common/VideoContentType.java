package com.vk.dto.common;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import ru.ok.android.webrtc.PeerVideoSettingsBitrateTable;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VideoContentType.kt */
/* loaded from: classes18.dex */
public final class VideoContentType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VideoContentType[] $VALUES;
    public static final VideoContentType AV1;
    public static final VideoContentType DASH_SEP;
    public static final VideoContentType EMBED;
    public static final VideoContentType FMP4_HLS;
    public static final VideoContentType HLS;
    public static final VideoContentType MP4;
    public static final VideoContentType MULTI_DASH;
    public static final VideoContentType ONDEMAND_DASH;
    public static final VideoContentType ONDEMAND_DASH_LIVE;
    public static final VideoContentType ONDEMAND_HLS;
    public static final VideoContentType ONDEMAND_HLS_LIVE;
    public static final VideoContentType RTMP;
    public static final VideoContentType UNKNOWN;
    public static final VideoContentType WEBM;
    private final String value;

    static {
        VideoContentType videoContentType = new VideoContentType("DASH_SEP", 0, "dash_sep");
        DASH_SEP = videoContentType;
        VideoContentType videoContentType2 = new VideoContentType("ONDEMAND_DASH", 1, "ondemand_dash");
        ONDEMAND_DASH = videoContentType2;
        VideoContentType videoContentType3 = new VideoContentType("WEBM", 2, "webm");
        WEBM = videoContentType3;
        VideoContentType videoContentType4 = new VideoContentType("ONDEMAND_DASH_LIVE", 3, "ondemand_dash_live");
        ONDEMAND_DASH_LIVE = videoContentType4;
        VideoContentType videoContentType5 = new VideoContentType("MULTI_DASH", 4, "multi_dash");
        MULTI_DASH = videoContentType5;
        VideoContentType videoContentType6 = new VideoContentType("AV1", 5, PeerVideoSettingsBitrateTable.CODEC_AV1);
        AV1 = videoContentType6;
        VideoContentType videoContentType7 = new VideoContentType("FMP4_HLS", 6, "fmp4_hls");
        FMP4_HLS = videoContentType7;
        VideoContentType videoContentType8 = new VideoContentType("HLS", 7, "hls");
        HLS = videoContentType8;
        VideoContentType videoContentType9 = new VideoContentType("ONDEMAND_HLS", 8, "ondemand_hls");
        ONDEMAND_HLS = videoContentType9;
        VideoContentType videoContentType10 = new VideoContentType("ONDEMAND_HLS_LIVE", 9, "ondemand_hls_live");
        ONDEMAND_HLS_LIVE = videoContentType10;
        VideoContentType videoContentType11 = new VideoContentType("MP4", 10, "mp4");
        MP4 = videoContentType11;
        VideoContentType videoContentType12 = new VideoContentType("RTMP", 11, "rtmp");
        RTMP = videoContentType12;
        VideoContentType videoContentType13 = new VideoContentType("EMBED", 12, "embed");
        EMBED = videoContentType13;
        VideoContentType videoContentType14 = new VideoContentType(GrsBaseInfo.CountryCodeSource.UNKNOWN, 13, "unknown");
        UNKNOWN = videoContentType14;
        VideoContentType[] videoContentTypeArr = {videoContentType, videoContentType2, videoContentType3, videoContentType4, videoContentType5, videoContentType6, videoContentType7, videoContentType8, videoContentType9, videoContentType10, videoContentType11, videoContentType12, videoContentType13, videoContentType14};
        $VALUES = videoContentTypeArr;
        $ENTRIES = new asp(videoContentTypeArr);
    }

    public VideoContentType(String str, int i, String str2) {
        this.value = str2;
    }

    public static VideoContentType valueOf(String str) {
        return (VideoContentType) Enum.valueOf(VideoContentType.class, str);
    }

    public static VideoContentType[] values() {
        return (VideoContentType[]) $VALUES.clone();
    }

    public final String h() {
        return this.value;
    }
}
