package com.vk.sdk.api.photos.dto;

import java.util.List;
import xsna.epx;
import xsna.pmi0;
import xsna.pn;

/* compiled from: PhotosGetResponseDto.kt */
/* loaded from: classes5.dex */
public final class PhotosGetResponseDto {

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<PhotosPhotoDto> items;

    public PhotosGetResponseDto(int i, List<PhotosPhotoDto> list) {
        this.count = i;
        this.items = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhotosGetResponseDto)) {
            return false;
        }
        PhotosGetResponseDto photosGetResponseDto = (PhotosGetResponseDto) obj;
        return this.count == photosGetResponseDto.count && epx.f(this.items, photosGetResponseDto.items);
    }

    public final int hashCode() {
        return this.items.hashCode() + (Integer.hashCode(this.count) * 31);
    }

    public final String toString() {
        return pn.c(this.count, "PhotosGetResponseDto(count=", ", items=", ")", this.items);
    }
}
