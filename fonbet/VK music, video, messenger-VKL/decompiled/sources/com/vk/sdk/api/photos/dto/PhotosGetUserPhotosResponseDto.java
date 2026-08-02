package com.vk.sdk.api.photos.dto;

import java.util.List;
import xsna.epx;
import xsna.pmi0;
import xsna.pn;

/* compiled from: PhotosGetUserPhotosResponseDto.kt */
/* loaded from: classes5.dex */
public final class PhotosGetUserPhotosResponseDto {

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<PhotosPhotoDto> items;

    public PhotosGetUserPhotosResponseDto(int i, List<PhotosPhotoDto> list) {
        this.count = i;
        this.items = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhotosGetUserPhotosResponseDto)) {
            return false;
        }
        PhotosGetUserPhotosResponseDto photosGetUserPhotosResponseDto = (PhotosGetUserPhotosResponseDto) obj;
        return this.count == photosGetUserPhotosResponseDto.count && epx.f(this.items, photosGetUserPhotosResponseDto.items);
    }

    public final int hashCode() {
        return this.items.hashCode() + (Integer.hashCode(this.count) * 31);
    }

    public final String toString() {
        return pn.c(this.count, "PhotosGetUserPhotosResponseDto(count=", ", items=", ")", this.items);
    }
}
