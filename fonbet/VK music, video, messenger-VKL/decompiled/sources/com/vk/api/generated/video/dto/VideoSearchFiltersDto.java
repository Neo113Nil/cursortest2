package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VideoSearchFiltersDto.kt */
/* loaded from: classes15.dex */
public final class VideoSearchFiltersDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VideoSearchFiltersDto[] $VALUES;
    public static final Parcelable.Creator<VideoSearchFiltersDto> CREATOR;

    @pmi0("long")
    public static final VideoSearchFiltersDto LONG;

    @pmi0("short")
    public static final VideoSearchFiltersDto SHORT;

    @pmi0("vimeo")
    public static final VideoSearchFiltersDto VIMEO;

    @pmi0("vk")
    public static final VideoSearchFiltersDto VK;

    @pmi0("youtube")
    public static final VideoSearchFiltersDto YOUTUBE;
    private final String value;

    /* compiled from: VideoSearchFiltersDto.kt */
    public static final class a implements Parcelable.Creator<VideoSearchFiltersDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoSearchFiltersDto createFromParcel(Parcel parcel) {
            return VideoSearchFiltersDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoSearchFiltersDto[] newArray(int i) {
            return new VideoSearchFiltersDto[i];
        }
    }

    static {
        VideoSearchFiltersDto videoSearchFiltersDto = new VideoSearchFiltersDto("LONG", 0, "long");
        LONG = videoSearchFiltersDto;
        VideoSearchFiltersDto videoSearchFiltersDto2 = new VideoSearchFiltersDto("SHORT", 1, "short");
        SHORT = videoSearchFiltersDto2;
        VideoSearchFiltersDto videoSearchFiltersDto3 = new VideoSearchFiltersDto("VIMEO", 2, "vimeo");
        VIMEO = videoSearchFiltersDto3;
        VideoSearchFiltersDto videoSearchFiltersDto4 = new VideoSearchFiltersDto("VK", 3, "vk");
        VK = videoSearchFiltersDto4;
        VideoSearchFiltersDto videoSearchFiltersDto5 = new VideoSearchFiltersDto("YOUTUBE", 4, "youtube");
        YOUTUBE = videoSearchFiltersDto5;
        VideoSearchFiltersDto[] videoSearchFiltersDtoArr = {videoSearchFiltersDto, videoSearchFiltersDto2, videoSearchFiltersDto3, videoSearchFiltersDto4, videoSearchFiltersDto5};
        $VALUES = videoSearchFiltersDtoArr;
        $ENTRIES = new asp(videoSearchFiltersDtoArr);
        CREATOR = new a();
    }

    private VideoSearchFiltersDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static VideoSearchFiltersDto valueOf(String str) {
        return (VideoSearchFiltersDto) Enum.valueOf(VideoSearchFiltersDto.class, str);
    }

    public static VideoSearchFiltersDto[] values() {
        return (VideoSearchFiltersDto[]) $VALUES.clone();
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
