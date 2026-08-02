package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VideoDeleteCommentScreenModeDto.kt */
/* loaded from: classes15.dex */
public final class VideoDeleteCommentScreenModeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VideoDeleteCommentScreenModeDto[] $VALUES;
    public static final Parcelable.Creator<VideoDeleteCommentScreenModeDto> CREATOR;

    @pmi0("discovery")
    public static final VideoDeleteCommentScreenModeDto DISCOVERY;

    @pmi0("fullscreen_landscape")
    public static final VideoDeleteCommentScreenModeDto FULLSCREEN_LANDSCAPE;

    @pmi0("fullscreen_portrait")
    public static final VideoDeleteCommentScreenModeDto FULLSCREEN_PORTRAIT;
    private final String value;

    /* compiled from: VideoDeleteCommentScreenModeDto.kt */
    public static final class a implements Parcelable.Creator<VideoDeleteCommentScreenModeDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoDeleteCommentScreenModeDto createFromParcel(Parcel parcel) {
            return VideoDeleteCommentScreenModeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoDeleteCommentScreenModeDto[] newArray(int i) {
            return new VideoDeleteCommentScreenModeDto[i];
        }
    }

    static {
        VideoDeleteCommentScreenModeDto videoDeleteCommentScreenModeDto = new VideoDeleteCommentScreenModeDto("DISCOVERY", 0, "discovery");
        DISCOVERY = videoDeleteCommentScreenModeDto;
        VideoDeleteCommentScreenModeDto videoDeleteCommentScreenModeDto2 = new VideoDeleteCommentScreenModeDto("FULLSCREEN_LANDSCAPE", 1, "fullscreen_landscape");
        FULLSCREEN_LANDSCAPE = videoDeleteCommentScreenModeDto2;
        VideoDeleteCommentScreenModeDto videoDeleteCommentScreenModeDto3 = new VideoDeleteCommentScreenModeDto("FULLSCREEN_PORTRAIT", 2, "fullscreen_portrait");
        FULLSCREEN_PORTRAIT = videoDeleteCommentScreenModeDto3;
        VideoDeleteCommentScreenModeDto[] videoDeleteCommentScreenModeDtoArr = {videoDeleteCommentScreenModeDto, videoDeleteCommentScreenModeDto2, videoDeleteCommentScreenModeDto3};
        $VALUES = videoDeleteCommentScreenModeDtoArr;
        $ENTRIES = new asp(videoDeleteCommentScreenModeDtoArr);
        CREATOR = new a();
    }

    private VideoDeleteCommentScreenModeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static VideoDeleteCommentScreenModeDto valueOf(String str) {
        return (VideoDeleteCommentScreenModeDto) Enum.valueOf(VideoDeleteCommentScreenModeDto.class, str);
    }

    public static VideoDeleteCommentScreenModeDto[] values() {
        return (VideoDeleteCommentScreenModeDto[]) $VALUES.clone();
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
