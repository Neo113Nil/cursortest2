package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VideoSearchExtendedSortDto.kt */
/* loaded from: classes15.dex */
public final class VideoSearchExtendedSortDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VideoSearchExtendedSortDto[] $VALUES;
    public static final Parcelable.Creator<VideoSearchExtendedSortDto> CREATOR;

    @pmi0("0")
    public static final VideoSearchExtendedSortDto DATE_ADDED;

    @pmi0("1")
    public static final VideoSearchExtendedSortDto DURATION;

    @pmi0("2")
    public static final VideoSearchExtendedSortDto RELEVANCE;
    private final int value;

    /* compiled from: VideoSearchExtendedSortDto.kt */
    public static final class a implements Parcelable.Creator<VideoSearchExtendedSortDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoSearchExtendedSortDto createFromParcel(Parcel parcel) {
            return VideoSearchExtendedSortDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoSearchExtendedSortDto[] newArray(int i) {
            return new VideoSearchExtendedSortDto[i];
        }
    }

    static {
        VideoSearchExtendedSortDto videoSearchExtendedSortDto = new VideoSearchExtendedSortDto("DURATION", 0, 1);
        DURATION = videoSearchExtendedSortDto;
        VideoSearchExtendedSortDto videoSearchExtendedSortDto2 = new VideoSearchExtendedSortDto("RELEVANCE", 1, 2);
        RELEVANCE = videoSearchExtendedSortDto2;
        VideoSearchExtendedSortDto videoSearchExtendedSortDto3 = new VideoSearchExtendedSortDto("DATE_ADDED", 2, 0);
        DATE_ADDED = videoSearchExtendedSortDto3;
        VideoSearchExtendedSortDto[] videoSearchExtendedSortDtoArr = {videoSearchExtendedSortDto, videoSearchExtendedSortDto2, videoSearchExtendedSortDto3};
        $VALUES = videoSearchExtendedSortDtoArr;
        $ENTRIES = new asp(videoSearchExtendedSortDtoArr);
        CREATOR = new a();
    }

    private VideoSearchExtendedSortDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static VideoSearchExtendedSortDto valueOf(String str) {
        return (VideoSearchExtendedSortDto) Enum.valueOf(VideoSearchExtendedSortDto.class, str);
    }

    public static VideoSearchExtendedSortDto[] values() {
        return (VideoSearchExtendedSortDto[]) $VALUES.clone();
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
