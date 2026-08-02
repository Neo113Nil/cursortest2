package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VideoEditCommentScreenModeDto.kt */
/* loaded from: classes15.dex */
public final class VideoEditCommentScreenModeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VideoEditCommentScreenModeDto[] $VALUES;
    public static final Parcelable.Creator<VideoEditCommentScreenModeDto> CREATOR;

    @pmi0("discovery")
    public static final VideoEditCommentScreenModeDto DISCOVERY;

    @pmi0("fullscreen_landscape")
    public static final VideoEditCommentScreenModeDto FULLSCREEN_LANDSCAPE;

    @pmi0("fullscreen_portrait")
    public static final VideoEditCommentScreenModeDto FULLSCREEN_PORTRAIT;
    private final String value;

    /* compiled from: VideoEditCommentScreenModeDto.kt */
    public static final class a implements Parcelable.Creator<VideoEditCommentScreenModeDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoEditCommentScreenModeDto createFromParcel(Parcel parcel) {
            return VideoEditCommentScreenModeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoEditCommentScreenModeDto[] newArray(int i) {
            return new VideoEditCommentScreenModeDto[i];
        }
    }

    static {
        VideoEditCommentScreenModeDto videoEditCommentScreenModeDto = new VideoEditCommentScreenModeDto("DISCOVERY", 0, "discovery");
        DISCOVERY = videoEditCommentScreenModeDto;
        VideoEditCommentScreenModeDto videoEditCommentScreenModeDto2 = new VideoEditCommentScreenModeDto("FULLSCREEN_LANDSCAPE", 1, "fullscreen_landscape");
        FULLSCREEN_LANDSCAPE = videoEditCommentScreenModeDto2;
        VideoEditCommentScreenModeDto videoEditCommentScreenModeDto3 = new VideoEditCommentScreenModeDto("FULLSCREEN_PORTRAIT", 2, "fullscreen_portrait");
        FULLSCREEN_PORTRAIT = videoEditCommentScreenModeDto3;
        VideoEditCommentScreenModeDto[] videoEditCommentScreenModeDtoArr = {videoEditCommentScreenModeDto, videoEditCommentScreenModeDto2, videoEditCommentScreenModeDto3};
        $VALUES = videoEditCommentScreenModeDtoArr;
        $ENTRIES = new asp(videoEditCommentScreenModeDtoArr);
        CREATOR = new a();
    }

    private VideoEditCommentScreenModeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static VideoEditCommentScreenModeDto valueOf(String str) {
        return (VideoEditCommentScreenModeDto) Enum.valueOf(VideoEditCommentScreenModeDto.class, str);
    }

    public static VideoEditCommentScreenModeDto[] values() {
        return (VideoEditCommentScreenModeDto[]) $VALUES.clone();
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
