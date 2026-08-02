package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VideoCreateCommentScreenModeDto.kt */
/* loaded from: classes15.dex */
public final class VideoCreateCommentScreenModeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VideoCreateCommentScreenModeDto[] $VALUES;
    public static final Parcelable.Creator<VideoCreateCommentScreenModeDto> CREATOR;

    @pmi0("discovery")
    public static final VideoCreateCommentScreenModeDto DISCOVERY;

    @pmi0("fullscreen_landscape")
    public static final VideoCreateCommentScreenModeDto FULLSCREEN_LANDSCAPE;

    @pmi0("fullscreen_portrait")
    public static final VideoCreateCommentScreenModeDto FULLSCREEN_PORTRAIT;
    private final String value;

    /* compiled from: VideoCreateCommentScreenModeDto.kt */
    public static final class a implements Parcelable.Creator<VideoCreateCommentScreenModeDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoCreateCommentScreenModeDto createFromParcel(Parcel parcel) {
            return VideoCreateCommentScreenModeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoCreateCommentScreenModeDto[] newArray(int i) {
            return new VideoCreateCommentScreenModeDto[i];
        }
    }

    static {
        VideoCreateCommentScreenModeDto videoCreateCommentScreenModeDto = new VideoCreateCommentScreenModeDto("DISCOVERY", 0, "discovery");
        DISCOVERY = videoCreateCommentScreenModeDto;
        VideoCreateCommentScreenModeDto videoCreateCommentScreenModeDto2 = new VideoCreateCommentScreenModeDto("FULLSCREEN_LANDSCAPE", 1, "fullscreen_landscape");
        FULLSCREEN_LANDSCAPE = videoCreateCommentScreenModeDto2;
        VideoCreateCommentScreenModeDto videoCreateCommentScreenModeDto3 = new VideoCreateCommentScreenModeDto("FULLSCREEN_PORTRAIT", 2, "fullscreen_portrait");
        FULLSCREEN_PORTRAIT = videoCreateCommentScreenModeDto3;
        VideoCreateCommentScreenModeDto[] videoCreateCommentScreenModeDtoArr = {videoCreateCommentScreenModeDto, videoCreateCommentScreenModeDto2, videoCreateCommentScreenModeDto3};
        $VALUES = videoCreateCommentScreenModeDtoArr;
        $ENTRIES = new asp(videoCreateCommentScreenModeDtoArr);
        CREATOR = new a();
    }

    private VideoCreateCommentScreenModeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static VideoCreateCommentScreenModeDto valueOf(String str) {
        return (VideoCreateCommentScreenModeDto) Enum.valueOf(VideoCreateCommentScreenModeDto.class, str);
    }

    public static VideoCreateCommentScreenModeDto[] values() {
        return (VideoCreateCommentScreenModeDto[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String i() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
