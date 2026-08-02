package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VideoGetSortAlbumDto.kt */
/* loaded from: classes15.dex */
public final class VideoGetSortAlbumDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VideoGetSortAlbumDto[] $VALUES;
    public static final Parcelable.Creator<VideoGetSortAlbumDto> CREATOR;

    @pmi0("0")
    public static final VideoGetSortAlbumDto TYPE_0;

    @pmi0("1")
    public static final VideoGetSortAlbumDto TYPE_1;
    private final int value;

    /* compiled from: VideoGetSortAlbumDto.kt */
    public static final class a implements Parcelable.Creator<VideoGetSortAlbumDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoGetSortAlbumDto createFromParcel(Parcel parcel) {
            return VideoGetSortAlbumDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoGetSortAlbumDto[] newArray(int i) {
            return new VideoGetSortAlbumDto[i];
        }
    }

    static {
        VideoGetSortAlbumDto videoGetSortAlbumDto = new VideoGetSortAlbumDto("TYPE_0", 0, 0);
        TYPE_0 = videoGetSortAlbumDto;
        VideoGetSortAlbumDto videoGetSortAlbumDto2 = new VideoGetSortAlbumDto("TYPE_1", 1, 1);
        TYPE_1 = videoGetSortAlbumDto2;
        VideoGetSortAlbumDto[] videoGetSortAlbumDtoArr = {videoGetSortAlbumDto, videoGetSortAlbumDto2};
        $VALUES = videoGetSortAlbumDtoArr;
        $ENTRIES = new asp(videoGetSortAlbumDtoArr);
        CREATOR = new a();
    }

    private VideoGetSortAlbumDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static VideoGetSortAlbumDto valueOf(String str) {
        return (VideoGetSortAlbumDto) Enum.valueOf(VideoGetSortAlbumDto.class, str);
    }

    public static VideoGetSortAlbumDto[] values() {
        return (VideoGetSortAlbumDto[]) $VALUES.clone();
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
