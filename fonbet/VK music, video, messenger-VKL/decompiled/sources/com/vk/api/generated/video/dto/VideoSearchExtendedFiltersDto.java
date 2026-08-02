package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VideoSearchExtendedFiltersDto.kt */
/* loaded from: classes15.dex */
public final class VideoSearchExtendedFiltersDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VideoSearchExtendedFiltersDto[] $VALUES;
    public static final Parcelable.Creator<VideoSearchExtendedFiltersDto> CREATOR;

    @pmi0("long")
    public static final VideoSearchExtendedFiltersDto LONG;

    @pmi0("short")
    public static final VideoSearchExtendedFiltersDto SHORT;

    @pmi0("vimeo")
    public static final VideoSearchExtendedFiltersDto VIMEO;

    @pmi0("vk")
    public static final VideoSearchExtendedFiltersDto VK;

    @pmi0("youtube")
    public static final VideoSearchExtendedFiltersDto YOUTUBE;
    private final String value;

    /* compiled from: VideoSearchExtendedFiltersDto.kt */
    public static final class a implements Parcelable.Creator<VideoSearchExtendedFiltersDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoSearchExtendedFiltersDto createFromParcel(Parcel parcel) {
            return VideoSearchExtendedFiltersDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoSearchExtendedFiltersDto[] newArray(int i) {
            return new VideoSearchExtendedFiltersDto[i];
        }
    }

    static {
        VideoSearchExtendedFiltersDto videoSearchExtendedFiltersDto = new VideoSearchExtendedFiltersDto("LONG", 0, "long");
        LONG = videoSearchExtendedFiltersDto;
        VideoSearchExtendedFiltersDto videoSearchExtendedFiltersDto2 = new VideoSearchExtendedFiltersDto("SHORT", 1, "short");
        SHORT = videoSearchExtendedFiltersDto2;
        VideoSearchExtendedFiltersDto videoSearchExtendedFiltersDto3 = new VideoSearchExtendedFiltersDto("VIMEO", 2, "vimeo");
        VIMEO = videoSearchExtendedFiltersDto3;
        VideoSearchExtendedFiltersDto videoSearchExtendedFiltersDto4 = new VideoSearchExtendedFiltersDto("VK", 3, "vk");
        VK = videoSearchExtendedFiltersDto4;
        VideoSearchExtendedFiltersDto videoSearchExtendedFiltersDto5 = new VideoSearchExtendedFiltersDto("YOUTUBE", 4, "youtube");
        YOUTUBE = videoSearchExtendedFiltersDto5;
        VideoSearchExtendedFiltersDto[] videoSearchExtendedFiltersDtoArr = {videoSearchExtendedFiltersDto, videoSearchExtendedFiltersDto2, videoSearchExtendedFiltersDto3, videoSearchExtendedFiltersDto4, videoSearchExtendedFiltersDto5};
        $VALUES = videoSearchExtendedFiltersDtoArr;
        $ENTRIES = new asp(videoSearchExtendedFiltersDtoArr);
        CREATOR = new a();
    }

    private VideoSearchExtendedFiltersDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static VideoSearchExtendedFiltersDto valueOf(String str) {
        return (VideoSearchExtendedFiltersDto) Enum.valueOf(VideoSearchExtendedFiltersDto.class, str);
    }

    public static VideoSearchExtendedFiltersDto[] values() {
        return (VideoSearchExtendedFiltersDto[]) $VALUES.clone();
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
