package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.photos.dto.PhotosPhotoDto;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MarketUploadPhotoDataDto.kt */
/* loaded from: classes15.dex */
public final class MarketUploadPhotoDataDto implements Parcelable {
    public static final Parcelable.Creator<MarketUploadPhotoDataDto> CREATOR = new a();

    @pmi0("photo")
    private final PhotosPhotoDto photo;

    @pmi0("photo_id")
    private final int photoId;

    /* compiled from: MarketUploadPhotoDataDto.kt */
    public static final class a implements Parcelable.Creator<MarketUploadPhotoDataDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketUploadPhotoDataDto createFromParcel(Parcel parcel) {
            return new MarketUploadPhotoDataDto(parcel.readInt(), (PhotosPhotoDto) parcel.readParcelable(MarketUploadPhotoDataDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final MarketUploadPhotoDataDto[] newArray(int i) {
            return new MarketUploadPhotoDataDto[i];
        }
    }

    public MarketUploadPhotoDataDto(int i, PhotosPhotoDto photosPhotoDto) {
        this.photoId = i;
        this.photo = photosPhotoDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketUploadPhotoDataDto)) {
            return false;
        }
        MarketUploadPhotoDataDto marketUploadPhotoDataDto = (MarketUploadPhotoDataDto) obj;
        return this.photoId == marketUploadPhotoDataDto.photoId && epx.f(this.photo, marketUploadPhotoDataDto.photo);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.photoId) * 31;
        PhotosPhotoDto photosPhotoDto = this.photo;
        return hashCode + (photosPhotoDto == null ? 0 : photosPhotoDto.hashCode());
    }

    public final String toString() {
        return "MarketUploadPhotoDataDto(photoId=" + this.photoId + ", photo=" + this.photo + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.photoId);
        parcel.writeParcelable(this.photo, i);
    }

    public /* synthetic */ MarketUploadPhotoDataDto(int i, PhotosPhotoDto photosPhotoDto, int i2, zcl zclVar) {
        this(i, (i2 & 2) != 0 ? null : photosPhotoDto);
    }
}
