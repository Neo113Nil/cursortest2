package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.foundation.entity.b;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VideoSaveTargetDto.kt */
/* loaded from: classes15.dex */
public final class VideoSaveTargetDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VideoSaveTargetDto[] $VALUES;

    @pmi0(b.JSON_KEY_ADS)
    public static final VideoSaveTargetDto ADS;

    @pmi0("article")
    public static final VideoSaveTargetDto ARTICLE;

    @pmi0("board")
    public static final VideoSaveTargetDto BOARD;

    @pmi0("channel")
    public static final VideoSaveTargetDto CHANNEL;

    @pmi0("channel_comment")
    public static final VideoSaveTargetDto CHANNEL_COMMENT;

    @pmi0("comment")
    public static final VideoSaveTargetDto COMMENT;
    public static final Parcelable.Creator<VideoSaveTargetDto> CREATOR;

    @pmi0("hidden_ads")
    public static final VideoSaveTargetDto HIDDEN_ADS;

    @pmi0("message")
    public static final VideoSaveTargetDto MESSAGE;

    @pmi0("messages")
    public static final VideoSaveTargetDto MESSAGES;

    @pmi0("micro_landing")
    public static final VideoSaveTargetDto MICRO_LANDING;

    @pmi0("post")
    public static final VideoSaveTargetDto POST;

    @pmi0("video")
    public static final VideoSaveTargetDto VIDEO;

    @pmi0("wall")
    public static final VideoSaveTargetDto WALL;
    private final String value;

    /* compiled from: VideoSaveTargetDto.kt */
    public static final class a implements Parcelable.Creator<VideoSaveTargetDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoSaveTargetDto createFromParcel(Parcel parcel) {
            return VideoSaveTargetDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoSaveTargetDto[] newArray(int i) {
            return new VideoSaveTargetDto[i];
        }
    }

    static {
        VideoSaveTargetDto videoSaveTargetDto = new VideoSaveTargetDto("ADS", 0, b.JSON_KEY_ADS);
        ADS = videoSaveTargetDto;
        VideoSaveTargetDto videoSaveTargetDto2 = new VideoSaveTargetDto("ARTICLE", 1, "article");
        ARTICLE = videoSaveTargetDto2;
        VideoSaveTargetDto videoSaveTargetDto3 = new VideoSaveTargetDto("BOARD", 2, "board");
        BOARD = videoSaveTargetDto3;
        VideoSaveTargetDto videoSaveTargetDto4 = new VideoSaveTargetDto("CHANNEL", 3, "channel");
        CHANNEL = videoSaveTargetDto4;
        VideoSaveTargetDto videoSaveTargetDto5 = new VideoSaveTargetDto("CHANNEL_COMMENT", 4, "channel_comment");
        CHANNEL_COMMENT = videoSaveTargetDto5;
        VideoSaveTargetDto videoSaveTargetDto6 = new VideoSaveTargetDto("COMMENT", 5, "comment");
        COMMENT = videoSaveTargetDto6;
        VideoSaveTargetDto videoSaveTargetDto7 = new VideoSaveTargetDto("HIDDEN_ADS", 6, "hidden_ads");
        HIDDEN_ADS = videoSaveTargetDto7;
        VideoSaveTargetDto videoSaveTargetDto8 = new VideoSaveTargetDto("MESSAGE", 7, "message");
        MESSAGE = videoSaveTargetDto8;
        VideoSaveTargetDto videoSaveTargetDto9 = new VideoSaveTargetDto("MESSAGES", 8, "messages");
        MESSAGES = videoSaveTargetDto9;
        VideoSaveTargetDto videoSaveTargetDto10 = new VideoSaveTargetDto("MICRO_LANDING", 9, "micro_landing");
        MICRO_LANDING = videoSaveTargetDto10;
        VideoSaveTargetDto videoSaveTargetDto11 = new VideoSaveTargetDto("POST", 10, "post");
        POST = videoSaveTargetDto11;
        VideoSaveTargetDto videoSaveTargetDto12 = new VideoSaveTargetDto(SignalingProtocol.MEDIA_OPTION_VIDEO, 11, "video");
        VIDEO = videoSaveTargetDto12;
        VideoSaveTargetDto videoSaveTargetDto13 = new VideoSaveTargetDto("WALL", 12, "wall");
        WALL = videoSaveTargetDto13;
        VideoSaveTargetDto[] videoSaveTargetDtoArr = {videoSaveTargetDto, videoSaveTargetDto2, videoSaveTargetDto3, videoSaveTargetDto4, videoSaveTargetDto5, videoSaveTargetDto6, videoSaveTargetDto7, videoSaveTargetDto8, videoSaveTargetDto9, videoSaveTargetDto10, videoSaveTargetDto11, videoSaveTargetDto12, videoSaveTargetDto13};
        $VALUES = videoSaveTargetDtoArr;
        $ENTRIES = new asp(videoSaveTargetDtoArr);
        CREATOR = new a();
    }

    private VideoSaveTargetDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static VideoSaveTargetDto valueOf(String str) {
        return (VideoSaveTargetDto) Enum.valueOf(VideoSaveTargetDto.class, str);
    }

    public static VideoSaveTargetDto[] values() {
        return (VideoSaveTargetDto[]) $VALUES.clone();
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
