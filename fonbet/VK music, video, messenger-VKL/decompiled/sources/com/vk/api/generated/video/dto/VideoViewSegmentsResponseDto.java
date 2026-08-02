package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VideoViewSegmentsResponseDto.kt */
/* loaded from: classes15.dex */
public final class VideoViewSegmentsResponseDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VideoViewSegmentsResponseDto[] $VALUES;
    public static final Parcelable.Creator<VideoViewSegmentsResponseDto> CREATOR;

    @pmi0("1")
    public static final VideoViewSegmentsResponseDto LOGGED;

    @pmi0("2")
    public static final VideoViewSegmentsResponseDto MODEL_UPDATED;

    @pmi0("0")
    public static final VideoViewSegmentsResponseDto NOT_LOGGED;
    private final int value;

    /* compiled from: VideoViewSegmentsResponseDto.kt */
    public static final class a implements Parcelable.Creator<VideoViewSegmentsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoViewSegmentsResponseDto createFromParcel(Parcel parcel) {
            return VideoViewSegmentsResponseDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoViewSegmentsResponseDto[] newArray(int i) {
            return new VideoViewSegmentsResponseDto[i];
        }
    }

    static {
        VideoViewSegmentsResponseDto videoViewSegmentsResponseDto = new VideoViewSegmentsResponseDto("NOT_LOGGED", 0, 0);
        NOT_LOGGED = videoViewSegmentsResponseDto;
        VideoViewSegmentsResponseDto videoViewSegmentsResponseDto2 = new VideoViewSegmentsResponseDto("LOGGED", 1, 1);
        LOGGED = videoViewSegmentsResponseDto2;
        VideoViewSegmentsResponseDto videoViewSegmentsResponseDto3 = new VideoViewSegmentsResponseDto("MODEL_UPDATED", 2, 2);
        MODEL_UPDATED = videoViewSegmentsResponseDto3;
        VideoViewSegmentsResponseDto[] videoViewSegmentsResponseDtoArr = {videoViewSegmentsResponseDto, videoViewSegmentsResponseDto2, videoViewSegmentsResponseDto3};
        $VALUES = videoViewSegmentsResponseDtoArr;
        $ENTRIES = new asp(videoViewSegmentsResponseDtoArr);
        CREATOR = new a();
    }

    private VideoViewSegmentsResponseDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static VideoViewSegmentsResponseDto valueOf(String str) {
        return (VideoViewSegmentsResponseDto) Enum.valueOf(VideoViewSegmentsResponseDto.class, str);
    }

    public static VideoViewSegmentsResponseDto[] values() {
        return (VideoViewSegmentsResponseDto[]) $VALUES.clone();
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
