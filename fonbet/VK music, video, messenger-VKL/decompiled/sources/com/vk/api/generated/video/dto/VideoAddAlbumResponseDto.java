package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.pmi0;
import xsna.vu5;

/* compiled from: VideoAddAlbumResponseDto.kt */
/* loaded from: classes15.dex */
public final class VideoAddAlbumResponseDto implements Parcelable {
    public static final Parcelable.Creator<VideoAddAlbumResponseDto> CREATOR = new a();

    @pmi0("album_id")
    private final int albumId;

    /* compiled from: VideoAddAlbumResponseDto.kt */
    public static final class a implements Parcelable.Creator<VideoAddAlbumResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoAddAlbumResponseDto createFromParcel(Parcel parcel) {
            return new VideoAddAlbumResponseDto(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoAddAlbumResponseDto[] newArray(int i) {
            return new VideoAddAlbumResponseDto[i];
        }
    }

    public VideoAddAlbumResponseDto(int i) {
        this.albumId = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof VideoAddAlbumResponseDto) && this.albumId == ((VideoAddAlbumResponseDto) obj).albumId;
    }

    public final int hashCode() {
        return Integer.hashCode(this.albumId);
    }

    public final String toString() {
        return vu5.b(new StringBuilder("VideoAddAlbumResponseDto(albumId="), this.albumId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.albumId);
    }
}
