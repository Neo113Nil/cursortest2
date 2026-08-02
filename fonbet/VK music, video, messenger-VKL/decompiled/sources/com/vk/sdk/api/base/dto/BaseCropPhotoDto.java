package com.vk.sdk.api.base.dto;

import com.vk.sdk.api.photos.dto.PhotosPhotoDto;
import xsna.epx;
import xsna.pmi0;

/* compiled from: BaseCropPhotoDto.kt */
/* loaded from: classes5.dex */
public final class BaseCropPhotoDto {

    @pmi0("crop")
    private final BaseCropPhotoCropDto crop;

    @pmi0("photo")
    private final PhotosPhotoDto photo;

    @pmi0("rect")
    private final BaseCropPhotoRectDto rect;

    public BaseCropPhotoDto(PhotosPhotoDto photosPhotoDto, BaseCropPhotoCropDto baseCropPhotoCropDto, BaseCropPhotoRectDto baseCropPhotoRectDto) {
        this.photo = photosPhotoDto;
        this.crop = baseCropPhotoCropDto;
        this.rect = baseCropPhotoRectDto;
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
        return "BaseCropPhotoDto(photo=" + this.photo + ", crop=" + this.crop + ", rect=" + this.rect + ")";
    }
}
