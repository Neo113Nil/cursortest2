package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VideoSearchSortDto.kt */
/* loaded from: classes15.dex */
public final class VideoSearchSortDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VideoSearchSortDto[] $VALUES;
    public static final Parcelable.Creator<VideoSearchSortDto> CREATOR;

    @pmi0("0")
    public static final VideoSearchSortDto DATE_ADDED;

    @pmi0("1")
    public static final VideoSearchSortDto DURATION;

    @pmi0("2")
    public static final VideoSearchSortDto RELEVANCE;
    private final int value;

    /* compiled from: VideoSearchSortDto.kt */
    public static final class a implements Parcelable.Creator<VideoSearchSortDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoSearchSortDto createFromParcel(Parcel parcel) {
            return VideoSearchSortDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoSearchSortDto[] newArray(int i) {
            return new VideoSearchSortDto[i];
        }
    }

    static {
        VideoSearchSortDto videoSearchSortDto = new VideoSearchSortDto("DURATION", 0, 1);
        DURATION = videoSearchSortDto;
        VideoSearchSortDto videoSearchSortDto2 = new VideoSearchSortDto("RELEVANCE", 1, 2);
        RELEVANCE = videoSearchSortDto2;
        VideoSearchSortDto videoSearchSortDto3 = new VideoSearchSortDto("DATE_ADDED", 2, 0);
        DATE_ADDED = videoSearchSortDto3;
        VideoSearchSortDto[] videoSearchSortDtoArr = {videoSearchSortDto, videoSearchSortDto2, videoSearchSortDto3};
        $VALUES = videoSearchSortDtoArr;
        $ENTRIES = new asp(videoSearchSortDtoArr);
        CREATOR = new a();
    }

    private VideoSearchSortDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static VideoSearchSortDto valueOf(String str) {
        return (VideoSearchSortDto) Enum.valueOf(VideoSearchSortDto.class, str);
    }

    public static VideoSearchSortDto[] values() {
        return (VideoSearchSortDto[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int i() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
