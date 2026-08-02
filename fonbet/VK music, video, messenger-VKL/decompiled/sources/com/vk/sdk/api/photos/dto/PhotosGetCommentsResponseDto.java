package com.vk.sdk.api.photos.dto;

import com.vk.sdk.api.wall.dto.WallWallCommentDto;
import java.util.List;
import xsna.epx;
import xsna.fw3;
import xsna.oq;
import xsna.pmi0;
import xsna.zcl;
import xsna.zn;

/* compiled from: PhotosGetCommentsResponseDto.kt */
/* loaded from: classes5.dex */
public final class PhotosGetCommentsResponseDto {

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<WallWallCommentDto> items;

    @pmi0("real_offset")
    private final Integer realOffset;

    public PhotosGetCommentsResponseDto(int i, List<WallWallCommentDto> list, Integer num) {
        this.count = i;
        this.items = list;
        this.realOffset = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhotosGetCommentsResponseDto)) {
            return false;
        }
        PhotosGetCommentsResponseDto photosGetCommentsResponseDto = (PhotosGetCommentsResponseDto) obj;
        return this.count == photosGetCommentsResponseDto.count && epx.f(this.items, photosGetCommentsResponseDto.items) && epx.f(this.realOffset, photosGetCommentsResponseDto.realOffset);
    }

    public final int hashCode() {
        int a = fw3.a(Integer.hashCode(this.count) * 31, 31, this.items);
        Integer num = this.realOffset;
        return a + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        int i = this.count;
        List<WallWallCommentDto> list = this.items;
        return oq.b(zn.c(i, "PhotosGetCommentsResponseDto(count=", ", items=", ", realOffset=", list), this.realOffset, ")");
    }

    public /* synthetic */ PhotosGetCommentsResponseDto(int i, List list, Integer num, int i2, zcl zclVar) {
        this(i, list, (i2 & 4) != 0 ? null : num);
    }
}
