package com.vk.api.generated.photos.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.audio.dto.AudioPhotoDto;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: PhotosSaveAudioPlaylistCoverResponseDto.kt */
/* loaded from: classes15.dex */
public final class PhotosSaveAudioPlaylistCoverResponseDto implements Parcelable {
    public static final Parcelable.Creator<PhotosSaveAudioPlaylistCoverResponseDto> CREATOR = new a();

    @pmi0("hash")
    private final String hash;

    @pmi0("photo")
    private final AudioPhotoDto photo;

    /* compiled from: PhotosSaveAudioPlaylistCoverResponseDto.kt */
    public static final class a implements Parcelable.Creator<PhotosSaveAudioPlaylistCoverResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final PhotosSaveAudioPlaylistCoverResponseDto createFromParcel(Parcel parcel) {
            return new PhotosSaveAudioPlaylistCoverResponseDto((AudioPhotoDto) parcel.readParcelable(PhotosSaveAudioPlaylistCoverResponseDto.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PhotosSaveAudioPlaylistCoverResponseDto[] newArray(int i) {
            return new PhotosSaveAudioPlaylistCoverResponseDto[i];
        }
    }

    public PhotosSaveAudioPlaylistCoverResponseDto(AudioPhotoDto audioPhotoDto, String str) {
        this.photo = audioPhotoDto;
        this.hash = str;
    }

    public final String d() {
        return this.hash;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final AudioPhotoDto e() {
        return this.photo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhotosSaveAudioPlaylistCoverResponseDto)) {
            return false;
        }
        PhotosSaveAudioPlaylistCoverResponseDto photosSaveAudioPlaylistCoverResponseDto = (PhotosSaveAudioPlaylistCoverResponseDto) obj;
        return epx.f(this.photo, photosSaveAudioPlaylistCoverResponseDto.photo) && epx.f(this.hash, photosSaveAudioPlaylistCoverResponseDto.hash);
    }

    public final int hashCode() {
        return this.hash.hashCode() + (this.photo.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PhotosSaveAudioPlaylistCoverResponseDto(photo=");
        sb.append(this.photo);
        sb.append(", hash=");
        return ho8.a(sb, this.hash, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.photo, i);
        parcel.writeString(this.hash);
    }
}
