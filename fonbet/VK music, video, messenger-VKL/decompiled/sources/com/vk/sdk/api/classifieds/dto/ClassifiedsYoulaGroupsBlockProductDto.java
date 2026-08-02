package com.vk.sdk.api.classifieds.dto;

import com.vk.sdk.api.photos.dto.PhotosPhotoDto;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: ClassifiedsYoulaGroupsBlockProductDto.kt */
/* loaded from: classes5.dex */
public final class ClassifiedsYoulaGroupsBlockProductDto {

    @pmi0("id")
    private final String id;

    @pmi0("photo")
    private final PhotosPhotoDto photo;

    public ClassifiedsYoulaGroupsBlockProductDto(String str, PhotosPhotoDto photosPhotoDto) {
        this.id = str;
        this.photo = photosPhotoDto;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClassifiedsYoulaGroupsBlockProductDto)) {
            return false;
        }
        ClassifiedsYoulaGroupsBlockProductDto classifiedsYoulaGroupsBlockProductDto = (ClassifiedsYoulaGroupsBlockProductDto) obj;
        return epx.f(this.id, classifiedsYoulaGroupsBlockProductDto.id) && epx.f(this.photo, classifiedsYoulaGroupsBlockProductDto.photo);
    }

    public final int hashCode() {
        int hashCode = this.id.hashCode() * 31;
        PhotosPhotoDto photosPhotoDto = this.photo;
        return hashCode + (photosPhotoDto == null ? 0 : photosPhotoDto.hashCode());
    }

    public final String toString() {
        return "ClassifiedsYoulaGroupsBlockProductDto(id=" + this.id + ", photo=" + this.photo + ")";
    }

    public /* synthetic */ ClassifiedsYoulaGroupsBlockProductDto(String str, PhotosPhotoDto photosPhotoDto, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : photosPhotoDto);
    }
}
