package com.vk.sdk.api.photos.dto;

import java.util.List;
import xsna.epx;
import xsna.pmi0;
import xsna.pn;

/* compiled from: PhotosGetNewTagsResponseDto.kt */
/* loaded from: classes5.dex */
public final class PhotosGetNewTagsResponseDto {

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<PhotosPhotoXtrTagInfoDto> items;

    public PhotosGetNewTagsResponseDto(int i, List<PhotosPhotoXtrTagInfoDto> list) {
        this.count = i;
        this.items = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhotosGetNewTagsResponseDto)) {
            return false;
        }
        PhotosGetNewTagsResponseDto photosGetNewTagsResponseDto = (PhotosGetNewTagsResponseDto) obj;
        return this.count == photosGetNewTagsResponseDto.count && epx.f(this.items, photosGetNewTagsResponseDto.items);
    }

    public final int hashCode() {
        return this.items.hashCode() + (Integer.hashCode(this.count) * 31);
    }

    public final String toString() {
        return pn.c(this.count, "PhotosGetNewTagsResponseDto(count=", ", items=", ")", this.items);
    }
}
