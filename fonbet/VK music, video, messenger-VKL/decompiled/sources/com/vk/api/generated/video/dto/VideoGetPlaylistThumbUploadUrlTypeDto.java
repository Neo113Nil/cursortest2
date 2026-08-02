package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VideoGetPlaylistThumbUploadUrlTypeDto.kt */
/* loaded from: classes15.dex */
public final class VideoGetPlaylistThumbUploadUrlTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VideoGetPlaylistThumbUploadUrlTypeDto[] $VALUES;
    public static final Parcelable.Creator<VideoGetPlaylistThumbUploadUrlTypeDto> CREATOR;

    @pmi0("1")
    public static final VideoGetPlaylistThumbUploadUrlTypeDto DEFAULT;

    @pmi0("2")
    public static final VideoGetPlaylistThumbUploadUrlTypeDto VERTICAL;
    private final int value;

    /* compiled from: VideoGetPlaylistThumbUploadUrlTypeDto.kt */
    public static final class a implements Parcelable.Creator<VideoGetPlaylistThumbUploadUrlTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoGetPlaylistThumbUploadUrlTypeDto createFromParcel(Parcel parcel) {
            return VideoGetPlaylistThumbUploadUrlTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoGetPlaylistThumbUploadUrlTypeDto[] newArray(int i) {
            return new VideoGetPlaylistThumbUploadUrlTypeDto[i];
        }
    }

    static {
        VideoGetPlaylistThumbUploadUrlTypeDto videoGetPlaylistThumbUploadUrlTypeDto = new VideoGetPlaylistThumbUploadUrlTypeDto("DEFAULT", 0, 1);
        DEFAULT = videoGetPlaylistThumbUploadUrlTypeDto;
        VideoGetPlaylistThumbUploadUrlTypeDto videoGetPlaylistThumbUploadUrlTypeDto2 = new VideoGetPlaylistThumbUploadUrlTypeDto("VERTICAL", 1, 2);
        VERTICAL = videoGetPlaylistThumbUploadUrlTypeDto2;
        VideoGetPlaylistThumbUploadUrlTypeDto[] videoGetPlaylistThumbUploadUrlTypeDtoArr = {videoGetPlaylistThumbUploadUrlTypeDto, videoGetPlaylistThumbUploadUrlTypeDto2};
        $VALUES = videoGetPlaylistThumbUploadUrlTypeDtoArr;
        $ENTRIES = new asp(videoGetPlaylistThumbUploadUrlTypeDtoArr);
        CREATOR = new a();
    }

    private VideoGetPlaylistThumbUploadUrlTypeDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static VideoGetPlaylistThumbUploadUrlTypeDto valueOf(String str) {
        return (VideoGetPlaylistThumbUploadUrlTypeDto) Enum.valueOf(VideoGetPlaylistThumbUploadUrlTypeDto.class, str);
    }

    public static VideoGetPlaylistThumbUploadUrlTypeDto[] values() {
        return (VideoGetPlaylistThumbUploadUrlTypeDto[]) $VALUES.clone();
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
