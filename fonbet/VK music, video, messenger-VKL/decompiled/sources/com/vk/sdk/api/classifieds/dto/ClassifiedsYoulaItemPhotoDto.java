package com.vk.sdk.api.classifieds.dto;

import com.vk.sdk.api.photos.dto.PhotosPhotoDto;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: ClassifiedsYoulaItemPhotoDto.kt */
/* loaded from: classes5.dex */
public final class ClassifiedsYoulaItemPhotoDto {

    @pmi0("photo")
    private final PhotosPhotoDto photo;

    @pmi0("url")
    private final String url;

    /* JADX WARN: Multi-variable type inference failed */
    public ClassifiedsYoulaItemPhotoDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClassifiedsYoulaItemPhotoDto)) {
            return false;
        }
        ClassifiedsYoulaItemPhotoDto classifiedsYoulaItemPhotoDto = (ClassifiedsYoulaItemPhotoDto) obj;
        return epx.f(this.photo, classifiedsYoulaItemPhotoDto.photo) && epx.f(this.url, classifiedsYoulaItemPhotoDto.url);
    }

    public final int hashCode() {
        PhotosPhotoDto photosPhotoDto = this.photo;
        int hashCode = (photosPhotoDto == null ? 0 : photosPhotoDto.hashCode()) * 31;
        String str = this.url;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "ClassifiedsYoulaItemPhotoDto(photo=" + this.photo + ", url=" + this.url + ")";
    }

    public ClassifiedsYoulaItemPhotoDto(PhotosPhotoDto photosPhotoDto, String str) {
        this.photo = photosPhotoDto;
        this.url = str;
    }

    public /* synthetic */ ClassifiedsYoulaItemPhotoDto(PhotosPhotoDto photosPhotoDto, String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : photosPhotoDto, (i & 2) != 0 ? null : str);
    }
}
