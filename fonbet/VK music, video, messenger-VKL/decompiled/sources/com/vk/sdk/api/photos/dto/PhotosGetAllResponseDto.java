package com.vk.sdk.api.photos.dto;

import com.vk.sdk.api.base.dto.BaseBoolIntDto;
import java.util.List;
import xsna.epx;
import xsna.fw3;
import xsna.pmi0;
import xsna.zcl;
import xsna.zn;

/* compiled from: PhotosGetAllResponseDto.kt */
/* loaded from: classes5.dex */
public final class PhotosGetAllResponseDto {

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<PhotosPhotoDto> items;

    @pmi0("more")
    private final BaseBoolIntDto more;

    public PhotosGetAllResponseDto(int i, List<PhotosPhotoDto> list, BaseBoolIntDto baseBoolIntDto) {
        this.count = i;
        this.items = list;
        this.more = baseBoolIntDto;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhotosGetAllResponseDto)) {
            return false;
        }
        PhotosGetAllResponseDto photosGetAllResponseDto = (PhotosGetAllResponseDto) obj;
        return this.count == photosGetAllResponseDto.count && epx.f(this.items, photosGetAllResponseDto.items) && this.more == photosGetAllResponseDto.more;
    }

    public final int hashCode() {
        int a = fw3.a(Integer.hashCode(this.count) * 31, 31, this.items);
        BaseBoolIntDto baseBoolIntDto = this.more;
        return a + (baseBoolIntDto == null ? 0 : baseBoolIntDto.hashCode());
    }

    public final String toString() {
        int i = this.count;
        List<PhotosPhotoDto> list = this.items;
        BaseBoolIntDto baseBoolIntDto = this.more;
        StringBuilder c = zn.c(i, "PhotosGetAllResponseDto(count=", ", items=", ", more=", list);
        c.append(baseBoolIntDto);
        c.append(")");
        return c.toString();
    }

    public /* synthetic */ PhotosGetAllResponseDto(int i, List list, BaseBoolIntDto baseBoolIntDto, int i2, zcl zclVar) {
        this(i, list, (i2 & 4) != 0 ? null : baseBoolIntDto);
    }
}
