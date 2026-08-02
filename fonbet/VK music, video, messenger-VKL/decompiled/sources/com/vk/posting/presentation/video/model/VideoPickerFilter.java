package com.vk.posting.presentation.video.model;

import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VideoPickerFilter.kt */
/* loaded from: classes5.dex */
public final class VideoPickerFilter {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VideoPickerFilter[] $VALUES;
    public static final VideoPickerFilter PLAYLIST;
    public static final VideoPickerFilter VIDEO;

    static {
        VideoPickerFilter videoPickerFilter = new VideoPickerFilter(SignalingProtocol.MEDIA_OPTION_VIDEO, 0);
        VIDEO = videoPickerFilter;
        VideoPickerFilter videoPickerFilter2 = new VideoPickerFilter("PLAYLIST", 1);
        PLAYLIST = videoPickerFilter2;
        VideoPickerFilter[] videoPickerFilterArr = {videoPickerFilter, videoPickerFilter2};
        $VALUES = videoPickerFilterArr;
        $ENTRIES = new asp(videoPickerFilterArr);
    }

    public VideoPickerFilter() {
        throw null;
    }

    public static VideoPickerFilter valueOf(String str) {
        return (VideoPickerFilter) Enum.valueOf(VideoPickerFilter.class, str);
    }

    public static VideoPickerFilter[] values() {
        return (VideoPickerFilter[]) $VALUES.clone();
    }
}
