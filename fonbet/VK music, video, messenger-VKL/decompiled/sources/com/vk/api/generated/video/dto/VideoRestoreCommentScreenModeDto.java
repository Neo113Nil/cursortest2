package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VideoRestoreCommentScreenModeDto.kt */
/* loaded from: classes15.dex */
public final class VideoRestoreCommentScreenModeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VideoRestoreCommentScreenModeDto[] $VALUES;
    public static final Parcelable.Creator<VideoRestoreCommentScreenModeDto> CREATOR;

    @pmi0("discovery")
    public static final VideoRestoreCommentScreenModeDto DISCOVERY;

    @pmi0("fullscreen_landscape")
    public static final VideoRestoreCommentScreenModeDto FULLSCREEN_LANDSCAPE;

    @pmi0("fullscreen_portrait")
    public static final VideoRestoreCommentScreenModeDto FULLSCREEN_PORTRAIT;
    private final String value;

    /* compiled from: VideoRestoreCommentScreenModeDto.kt */
    public static final class a implements Parcelable.Creator<VideoRestoreCommentScreenModeDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoRestoreCommentScreenModeDto createFromParcel(Parcel parcel) {
            return VideoRestoreCommentScreenModeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoRestoreCommentScreenModeDto[] newArray(int i) {
            return new VideoRestoreCommentScreenModeDto[i];
        }
    }

    static {
        VideoRestoreCommentScreenModeDto videoRestoreCommentScreenModeDto = new VideoRestoreCommentScreenModeDto("DISCOVERY", 0, "discovery");
        DISCOVERY = videoRestoreCommentScreenModeDto;
        VideoRestoreCommentScreenModeDto videoRestoreCommentScreenModeDto2 = new VideoRestoreCommentScreenModeDto("FULLSCREEN_LANDSCAPE", 1, "fullscreen_landscape");
        FULLSCREEN_LANDSCAPE = videoRestoreCommentScreenModeDto2;
        VideoRestoreCommentScreenModeDto videoRestoreCommentScreenModeDto3 = new VideoRestoreCommentScreenModeDto("FULLSCREEN_PORTRAIT", 2, "fullscreen_portrait");
        FULLSCREEN_PORTRAIT = videoRestoreCommentScreenModeDto3;
        VideoRestoreCommentScreenModeDto[] videoRestoreCommentScreenModeDtoArr = {videoRestoreCommentScreenModeDto, videoRestoreCommentScreenModeDto2, videoRestoreCommentScreenModeDto3};
        $VALUES = videoRestoreCommentScreenModeDtoArr;
        $ENTRIES = new asp(videoRestoreCommentScreenModeDtoArr);
        CREATOR = new a();
    }

    private VideoRestoreCommentScreenModeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static VideoRestoreCommentScreenModeDto valueOf(String str) {
        return (VideoRestoreCommentScreenModeDto) Enum.valueOf(VideoRestoreCommentScreenModeDto.class, str);
    }

    public static VideoRestoreCommentScreenModeDto[] values() {
        return (VideoRestoreCommentScreenModeDto[]) $VALUES.clone();
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
