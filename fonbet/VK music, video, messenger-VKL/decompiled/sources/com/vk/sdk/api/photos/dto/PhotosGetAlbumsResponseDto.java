package com.vk.sdk.api.photos.dto;

import java.util.List;
import xsna.epx;
import xsna.pmi0;
import xsna.pn;

/* compiled from: PhotosGetAlbumsResponseDto.kt */
/* loaded from: classes5.dex */
public final class PhotosGetAlbumsResponseDto {

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<PhotosPhotoAlbumFullDto> items;

    public PhotosGetAlbumsResponseDto(int i, List<PhotosPhotoAlbumFullDto> list) {
        this.count = i;
        this.items = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhotosGetAlbumsResponseDto)) {
            return false;
        }
        PhotosGetAlbumsResponseDto photosGetAlbumsResponseDto = (PhotosGetAlbumsResponseDto) obj;
        return this.count == photosGetAlbumsResponseDto.count && epx.f(this.items, photosGetAlbumsResponseDto.items);
    }

    public final int hashCode() {
        return this.items.hashCode() + (Integer.hashCode(this.count) * 31);
    }

    public final String toString() {
        return pn.c(this.count, "PhotosGetAlbumsResponseDto(count=", ", items=", ")", this.items);
    }
}
