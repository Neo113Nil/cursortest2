package com.vk.sdk.api.photos.dto;

import com.vk.sdk.api.wall.dto.WallWallCommentDto;
import java.util.List;
import xsna.epx;
import xsna.pmi0;
import xsna.pn;

/* compiled from: PhotosGetAllCommentsResponseDto.kt */
/* loaded from: classes5.dex */
public final class PhotosGetAllCommentsResponseDto {

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<WallWallCommentDto> items;

    public PhotosGetAllCommentsResponseDto(int i, List<WallWallCommentDto> list) {
        this.count = i;
        this.items = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhotosGetAllCommentsResponseDto)) {
            return false;
        }
        PhotosGetAllCommentsResponseDto photosGetAllCommentsResponseDto = (PhotosGetAllCommentsResponseDto) obj;
        return this.count == photosGetAllCommentsResponseDto.count && epx.f(this.items, photosGetAllCommentsResponseDto.items);
    }

    public final int hashCode() {
        return this.items.hashCode() + (Integer.hashCode(this.count) * 31);
    }

    public final String toString() {
        return pn.c(this.count, "PhotosGetAllCommentsResponseDto(count=", ", items=", ")", this.items);
    }
}
