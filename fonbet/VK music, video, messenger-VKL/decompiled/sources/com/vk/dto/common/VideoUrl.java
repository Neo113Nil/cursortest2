package com.vk.dto.common;

import com.ironsource.D1;
import com.ironsource.Z3;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.util.List;
import ru.ok.android.api.core.ApiInvocationException;
import ru.ok.proto.PublisherConfiguration;
import xsna.asp;
import xsna.e43;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VideoUrl.kt */
/* loaded from: classes18.dex */
public final class VideoUrl {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VideoUrl[] $VALUES;
    public static final a Companion;
    public static final VideoUrl DASH_AV1;
    public static final VideoUrl DASH_LIVE_ON_DEMAND_URL;
    public static final VideoUrl DASH_ONDEMAND_URL;
    public static final VideoUrl DASH_STREAMS;
    public static final VideoUrl DASH_URL;
    public static final VideoUrl DASH_WEBM_URL;
    public static final VideoUrl EMBED_URL;
    public static final VideoUrl EXTERNAL_URL;
    public static final VideoUrl FMP4_HLS;
    public static final VideoUrl HLS_LIVE;
    public static final VideoUrl HLS_LIVE_PAYBACK_URL;
    public static final VideoUrl HLS_ONDEMAND_LIVE_URL;
    public static final VideoUrl HLS_ONDEMAND_URL;
    public static final VideoUrl HLS_URL;
    private static final List<VideoUrl> MP4_URLS;
    public static final VideoUrl OKMP_URL;
    public static final VideoUrl RTMP_URL;
    public static final VideoUrl URL_1080;
    public static final VideoUrl URL_1440;
    public static final VideoUrl URL_2160;
    public static final VideoUrl URL_240;
    public static final VideoUrl URL_360;
    public static final VideoUrl URL_480;
    public static final VideoUrl URL_720;
    private final String additionalParseKey;
    private final VideoContentType contentType;
    private final boolean isAV1;
    private final boolean isExternal;
    private final boolean isLive;
    private final boolean isOndemand;
    private final boolean isPlayback;
    private final boolean isWebm;
    private final String parseKey;
    private final int quality;

    /* compiled from: VideoUrl.kt */
    public static final class a {
    }

    static {
        VideoUrl videoUrl = new VideoUrl("DASH_URL", 0, "dash_sep", VideoContentType.DASH_SEP, -4, null, Z3.l);
        DASH_URL = videoUrl;
        VideoUrl videoUrl2 = new VideoUrl("DASH_ONDEMAND_URL", 1, "dash_ondemand", VideoContentType.ONDEMAND_DASH, -4, null, 1008);
        DASH_ONDEMAND_URL = videoUrl2;
        VideoUrl videoUrl3 = new VideoUrl("DASH_WEBM_URL", 2, "dash_webm", VideoContentType.WEBM, -4, null, 1000);
        DASH_WEBM_URL = videoUrl3;
        VideoUrl videoUrl4 = new VideoUrl("DASH_LIVE_ON_DEMAND_URL", 3, "cmaf", VideoContentType.ONDEMAND_DASH_LIVE, -4, null, 752);
        DASH_LIVE_ON_DEMAND_URL = videoUrl4;
        VideoUrl videoUrl5 = new VideoUrl("DASH_STREAMS", 4, "dash_streams", VideoContentType.MULTI_DASH, -4, null, Z3.l);
        DASH_STREAMS = videoUrl5;
        VideoUrl videoUrl6 = new VideoUrl("DASH_AV1", 5, "dash_webm_av1", VideoContentType.AV1, -4, null, 888);
        DASH_AV1 = videoUrl6;
        VideoUrl videoUrl7 = new VideoUrl("FMP4_HLS", 6, "hls_fmp4", VideoContentType.FMP4_HLS, -2, null, Z3.l);
        FMP4_HLS = videoUrl7;
        VideoContentType videoContentType = VideoContentType.HLS;
        VideoUrl videoUrl8 = new VideoUrl("HLS_URL", 7, "hls", videoContentType, -2, "live", ApiInvocationException.ErrorCodes.PHOTO_IMAGE_CORRUPTED);
        HLS_URL = videoUrl8;
        VideoUrl videoUrl9 = new VideoUrl("HLS_ONDEMAND_URL", 8, "hls_ondemand", VideoContentType.ONDEMAND_HLS, -2, null, 1008);
        HLS_ONDEMAND_URL = videoUrl9;
        VideoUrl videoUrl10 = new VideoUrl("HLS_ONDEMAND_LIVE_URL", 9, "hls_live_ondemand", VideoContentType.ONDEMAND_HLS_LIVE, -2, null, 752);
        HLS_ONDEMAND_LIVE_URL = videoUrl10;
        VideoUrl videoUrl11 = new VideoUrl("HLS_LIVE_PAYBACK_URL", 10, "hls_live_playback", videoContentType, -2, null, 696);
        HLS_LIVE_PAYBACK_URL = videoUrl11;
        VideoUrl videoUrl12 = new VideoUrl("HLS_LIVE", 11, "hls_live", videoContentType, -2, null, 760);
        HLS_LIVE = videoUrl12;
        VideoContentType videoContentType2 = VideoContentType.MP4;
        VideoUrl videoUrl13 = new VideoUrl("URL_240", 12, "mp4_240", videoContentType2, PsExtractor.VIDEO_STREAM_MASK, "src", ApiInvocationException.ErrorCodes.PHOTO_IMAGE_CORRUPTED);
        URL_240 = videoUrl13;
        VideoUrl videoUrl14 = new VideoUrl("URL_360", 13, "mp4_360", videoContentType2, 360, null, Z3.l);
        URL_360 = videoUrl14;
        VideoUrl videoUrl15 = new VideoUrl("URL_480", 14, "mp4_480", videoContentType2, 480, null, Z3.l);
        URL_480 = videoUrl15;
        VideoUrl videoUrl16 = new VideoUrl("URL_720", 15, "mp4_720", videoContentType2, PublisherConfiguration.DEFAULT_MAX_RES, null, Z3.l);
        URL_720 = videoUrl16;
        VideoUrl videoUrl17 = new VideoUrl("URL_1080", 16, "mp4_1080", videoContentType2, 1080, null, Z3.l);
        URL_1080 = videoUrl17;
        VideoUrl videoUrl18 = new VideoUrl("URL_1440", 17, "mp4_1440", videoContentType2, 1440, null, Z3.l);
        URL_1440 = videoUrl18;
        VideoUrl videoUrl19 = new VideoUrl("URL_2160", 18, "mp4_2160", videoContentType2, 2160, null, Z3.l);
        URL_2160 = videoUrl19;
        VideoContentType videoContentType3 = VideoContentType.RTMP;
        VideoUrl videoUrl20 = new VideoUrl("RTMP_URL", 19, "rtmp", videoContentType3, -5, null, 760);
        RTMP_URL = videoUrl20;
        VideoUrl videoUrl21 = new VideoUrl("OKMP_URL", 20, "okmp_rtmp", videoContentType3, -3, null, 760);
        OKMP_URL = videoUrl21;
        VideoUrl videoUrl22 = new VideoUrl("EXTERNAL_URL", 21, D1.e, VideoContentType.EMBED, -1, null, 984);
        EXTERNAL_URL = videoUrl22;
        VideoUrl videoUrl23 = new VideoUrl("EMBED_URL", 22, "player", VideoContentType.UNKNOWN, -1, null, 984);
        EMBED_URL = videoUrl23;
        VideoUrl[] videoUrlArr = {videoUrl, videoUrl2, videoUrl3, videoUrl4, videoUrl5, videoUrl6, videoUrl7, videoUrl8, videoUrl9, videoUrl10, videoUrl11, videoUrl12, videoUrl13, videoUrl14, videoUrl15, videoUrl16, videoUrl17, videoUrl18, videoUrl19, videoUrl20, videoUrl21, videoUrl22, videoUrl23};
        $VALUES = videoUrlArr;
        $ENTRIES = new asp(videoUrlArr);
        Companion = new a();
        MP4_URLS = e43.l(videoUrl19, videoUrl18, videoUrl17, videoUrl16, videoUrl15, videoUrl14, videoUrl13);
    }

    public VideoUrl() {
        throw null;
    }

    public VideoUrl(String str, int i, String str2, VideoContentType videoContentType, int i2, String str3, int i3) {
        boolean z = (i3 & 8) == 0;
        boolean z2 = (i3 & 16) == 0;
        boolean z3 = (i3 & 32) == 0;
        boolean z4 = (i3 & 64) == 0;
        boolean z5 = (i3 & 128) == 0;
        boolean z6 = (i3 & 256) == 0;
        str3 = (i3 & 512) != 0 ? null : str3;
        this.parseKey = str2;
        this.contentType = videoContentType;
        this.quality = i2;
        this.isOndemand = z;
        this.isWebm = z2;
        this.isExternal = z3;
        this.isPlayback = z4;
        this.isAV1 = z5;
        this.isLive = z6;
        this.additionalParseKey = str3;
    }

    public static zrp<VideoUrl> k() {
        return $ENTRIES;
    }

    public static VideoUrl valueOf(String str) {
        return (VideoUrl) Enum.valueOf(VideoUrl.class, str);
    }

    public static VideoUrl[] values() {
        return (VideoUrl[]) $VALUES.clone();
    }

    public final String i() {
        return this.additionalParseKey;
    }

    public final VideoContentType j() {
        return this.contentType;
    }

    public final String l() {
        return this.parseKey;
    }

    public final int m() {
        return this.quality;
    }

    public final boolean n() {
        return this.isAV1;
    }

    public final boolean o() {
        return this.isExternal;
    }

    public final boolean p() {
        return this.isLive;
    }

    public final boolean q() {
        return this.isOndemand;
    }

    public final boolean r() {
        return this.isPlayback;
    }

    public final boolean s() {
        return this.isWebm;
    }
}
