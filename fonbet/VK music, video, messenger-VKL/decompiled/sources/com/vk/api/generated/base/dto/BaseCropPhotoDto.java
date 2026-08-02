package com.vk.api.generated.base.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.photos.dto.PhotosPhotoDto;
import xsna.epx;
import xsna.pmi0;

/* compiled from: BaseCropPhotoDto.kt */
/* loaded from: classes14.dex */
public final class BaseCropPhotoDto implements Parcelable {
    public static final Parcelable.Creator<BaseCropPhotoDto> CREATOR = new a();

    @pmi0("crop")
    private final BaseCropPhotoCropDto crop;

    @pmi0("photo")
    private final PhotosPhotoDto photo;

    @pmi0("rect")
    private final BaseCropPhotoRectDto rect;

    /* compiled from: BaseCropPhotoDto.kt */
    public static final class a implements Parcelable.Creator<BaseCropPhotoDto> {
        @Override // android.os.Parcelable.Creator
        public final BaseCropPhotoDto createFromParcel(Parcel parcel) {
            return new BaseCropPhotoDto(PhotosPhotoDto.CREATOR.createFromParcel(parcel), BaseCropPhotoCropDto.CREATOR.createFromParcel(parcel), BaseCropPhotoRectDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final BaseCropPhotoDto[] newArray(int i) {
            return new BaseCropPhotoDto[i];
        }
    }

    public BaseCropPhotoDto(PhotosPhotoDto photosPhotoDto, BaseCropPhotoCropDto baseCropPhotoCropDto, BaseCropPhotoRectDto baseCropPhotoRectDto) {
        this.photo = photosPhotoDto;
        this.crop = baseCropPhotoCropDto;
        this.rect = baseCropPhotoRectDto;
    }

    public final BaseCropPhotoCropDto d() {
        return this.crop;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final PhotosPhotoDto e() {
        return this.photo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BaseCropPhotoDto)) {
            return false;
        }
        BaseCropPhotoDto baseCropPhotoDto = (BaseCropPhotoDto) obj;
        return epx.f(this.photo, baseCropPhotoDto.photo) && epx.f(this.crop, baseCropPhotoDto.crop) && epx.f(this.rect, baseCropPhotoDto.rect);
    }

    public final int hashCode() {
        return this.rect.hashCode() + ((this.crop.hashCode() + (this.photo.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "BaseCropPhotoDto(photo=" + this.photo + ", crop=" + this.crop + ", rect=" + this.rect + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.photo.writeToParcel(parcel, i);
        this.crop.writeToParcel(parcel, i);
        this.rect.writeToParcel(parcel, i);
    }
}
