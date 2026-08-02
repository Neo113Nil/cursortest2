package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VideoGetFromAlbumSortAlbumDto.kt */
/* loaded from: classes15.dex */
public final class VideoGetFromAlbumSortAlbumDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VideoGetFromAlbumSortAlbumDto[] $VALUES;
    public static final Parcelable.Creator<VideoGetFromAlbumSortAlbumDto> CREATOR;

    @pmi0("0")
    public static final VideoGetFromAlbumSortAlbumDto TYPE_0;

    @pmi0("1")
    public static final VideoGetFromAlbumSortAlbumDto TYPE_1;
    private final int value;

    /* compiled from: VideoGetFromAlbumSortAlbumDto.kt */
    public static final class a implements Parcelable.Creator<VideoGetFromAlbumSortAlbumDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoGetFromAlbumSortAlbumDto createFromParcel(Parcel parcel) {
            return VideoGetFromAlbumSortAlbumDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoGetFromAlbumSortAlbumDto[] newArray(int i) {
            return new VideoGetFromAlbumSortAlbumDto[i];
        }
    }

    static {
        VideoGetFromAlbumSortAlbumDto videoGetFromAlbumSortAlbumDto = new VideoGetFromAlbumSortAlbumDto("TYPE_0", 0, 0);
        TYPE_0 = videoGetFromAlbumSortAlbumDto;
        VideoGetFromAlbumSortAlbumDto videoGetFromAlbumSortAlbumDto2 = new VideoGetFromAlbumSortAlbumDto("TYPE_1", 1, 1);
        TYPE_1 = videoGetFromAlbumSortAlbumDto2;
        VideoGetFromAlbumSortAlbumDto[] videoGetFromAlbumSortAlbumDtoArr = {videoGetFromAlbumSortAlbumDto, videoGetFromAlbumSortAlbumDto2};
        $VALUES = videoGetFromAlbumSortAlbumDtoArr;
        $ENTRIES = new asp(videoGetFromAlbumSortAlbumDtoArr);
        CREATOR = new a();
    }

    private VideoGetFromAlbumSortAlbumDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static VideoGetFromAlbumSortAlbumDto valueOf(String str) {
        return (VideoGetFromAlbumSortAlbumDto) Enum.valueOf(VideoGetFromAlbumSortAlbumDto.class, str);
    }

    public static VideoGetFromAlbumSortAlbumDto[] values() {
        return (VideoGetFromAlbumSortAlbumDto[]) $VALUES.clone();
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
