package com.vk.libvideo.models.videofile;

import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VideoFilePlaybackDo.kt */
/* loaded from: classes3.dex */
public final class VideoTypeDo {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VideoTypeDo[] $VALUES;
    public static final VideoTypeDo CLIP;
    public static final VideoTypeDo COVER;
    public static final VideoTypeDo GIF;
    public static final VideoTypeDo LIVE;
    public static final VideoTypeDo MESSAGE;
    public static final VideoTypeDo STORY;
    public static final VideoTypeDo VIDEO;

    static {
        VideoTypeDo videoTypeDo = new VideoTypeDo("GIF", 0);
        GIF = videoTypeDo;
        VideoTypeDo videoTypeDo2 = new VideoTypeDo(SignalingProtocol.MEDIA_OPTION_VIDEO, 1);
        VIDEO = videoTypeDo2;
        VideoTypeDo videoTypeDo3 = new VideoTypeDo("LIVE", 2);
        LIVE = videoTypeDo3;
        VideoTypeDo videoTypeDo4 = new VideoTypeDo("CLIP", 3);
        CLIP = videoTypeDo4;
        VideoTypeDo videoTypeDo5 = new VideoTypeDo("COVER", 4);
        COVER = videoTypeDo5;
        VideoTypeDo videoTypeDo6 = new VideoTypeDo("MESSAGE", 5);
        MESSAGE = videoTypeDo6;
        VideoTypeDo videoTypeDo7 = new VideoTypeDo("STORY", 6);
        STORY = videoTypeDo7;
        VideoTypeDo[] videoTypeDoArr = {videoTypeDo, videoTypeDo2, videoTypeDo3, videoTypeDo4, videoTypeDo5, videoTypeDo6, videoTypeDo7};
        $VALUES = videoTypeDoArr;
        $ENTRIES = new asp(videoTypeDoArr);
    }

    public VideoTypeDo() {
        throw null;
    }

    public static VideoTypeDo valueOf(String str) {
        return (VideoTypeDo) Enum.valueOf(VideoTypeDo.class, str);
    }

    public static VideoTypeDo[] values() {
        return (VideoTypeDo[]) $VALUES.clone();
    }
}
