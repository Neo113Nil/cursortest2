package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VideoVideoTypeDto.kt */
/* loaded from: classes15.dex */
public final class VideoVideoTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VideoVideoTypeDto[] $VALUES;
    public static final Parcelable.Creator<VideoVideoTypeDto> CREATOR;

    @pmi0("interactive")
    public static final VideoVideoTypeDto INTERACTIVE;

    @pmi0("live")
    public static final VideoVideoTypeDto LIVE;

    @pmi0("movie")
    public static final VideoVideoTypeDto MOVIE;

    @pmi0("music_video")
    public static final VideoVideoTypeDto MUSIC_VIDEO;

    @pmi0("short_video")
    public static final VideoVideoTypeDto SHORT_VIDEO;

    @pmi0("story")
    public static final VideoVideoTypeDto STORY;

    @pmi0("tv_channel")
    public static final VideoVideoTypeDto TV_CHANNEL;

    @pmi0("ugc_music_video")
    public static final VideoVideoTypeDto UGC_MUSIC_VIDEO;

    @pmi0("video")
    public static final VideoVideoTypeDto VIDEO;

    @pmi0("video_message")
    public static final VideoVideoTypeDto VIDEO_MESSAGE;
    private final String value;

    /* compiled from: VideoVideoTypeDto.kt */
    public static final class a implements Parcelable.Creator<VideoVideoTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoVideoTypeDto createFromParcel(Parcel parcel) {
            return VideoVideoTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoVideoTypeDto[] newArray(int i) {
            return new VideoVideoTypeDto[i];
        }
    }

    static {
        VideoVideoTypeDto videoVideoTypeDto = new VideoVideoTypeDto("INTERACTIVE", 0, "interactive");
        INTERACTIVE = videoVideoTypeDto;
        VideoVideoTypeDto videoVideoTypeDto2 = new VideoVideoTypeDto(SignalingProtocol.MEDIA_OPTION_VIDEO, 1, "video");
        VIDEO = videoVideoTypeDto2;
        VideoVideoTypeDto videoVideoTypeDto3 = new VideoVideoTypeDto("MUSIC_VIDEO", 2, "music_video");
        MUSIC_VIDEO = videoVideoTypeDto3;
        VideoVideoTypeDto videoVideoTypeDto4 = new VideoVideoTypeDto(SignalingProtocol.KEY_STREAM_TYPE_MOVIE, 3, "movie");
        MOVIE = videoVideoTypeDto4;
        VideoVideoTypeDto videoVideoTypeDto5 = new VideoVideoTypeDto("LIVE", 4, "live");
        LIVE = videoVideoTypeDto5;
        VideoVideoTypeDto videoVideoTypeDto6 = new VideoVideoTypeDto("SHORT_VIDEO", 5, "short_video");
        SHORT_VIDEO = videoVideoTypeDto6;
        VideoVideoTypeDto videoVideoTypeDto7 = new VideoVideoTypeDto("STORY", 6, "story");
        STORY = videoVideoTypeDto7;
        VideoVideoTypeDto videoVideoTypeDto8 = new VideoVideoTypeDto("VIDEO_MESSAGE", 7, "video_message");
        VIDEO_MESSAGE = videoVideoTypeDto8;
        VideoVideoTypeDto videoVideoTypeDto9 = new VideoVideoTypeDto("TV_CHANNEL", 8, "tv_channel");
        TV_CHANNEL = videoVideoTypeDto9;
        VideoVideoTypeDto videoVideoTypeDto10 = new VideoVideoTypeDto("UGC_MUSIC_VIDEO", 9, "ugc_music_video");
        UGC_MUSIC_VIDEO = videoVideoTypeDto10;
        VideoVideoTypeDto[] videoVideoTypeDtoArr = {videoVideoTypeDto, videoVideoTypeDto2, videoVideoTypeDto3, videoVideoTypeDto4, videoVideoTypeDto5, videoVideoTypeDto6, videoVideoTypeDto7, videoVideoTypeDto8, videoVideoTypeDto9, videoVideoTypeDto10};
        $VALUES = videoVideoTypeDtoArr;
        $ENTRIES = new asp(videoVideoTypeDtoArr);
        CREATOR = new a();
    }

    private VideoVideoTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static VideoVideoTypeDto valueOf(String str) {
        return (VideoVideoTypeDto) Enum.valueOf(VideoVideoTypeDto.class, str);
    }

    public static VideoVideoTypeDto[] values() {
        return (VideoVideoTypeDto[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
