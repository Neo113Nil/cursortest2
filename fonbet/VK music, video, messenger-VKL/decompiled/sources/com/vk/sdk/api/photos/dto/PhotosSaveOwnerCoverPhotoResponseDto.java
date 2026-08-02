package com.vk.sdk.api.photos.dto;

import com.vk.sdk.api.base.dto.BaseImageDto;
import java.util.List;
import xsna.epx;
import xsna.pmi0;
import xsna.wq;
import xsna.zcl;

/* compiled from: PhotosSaveOwnerCoverPhotoResponseDto.kt */
/* loaded from: classes5.dex */
public final class PhotosSaveOwnerCoverPhotoResponseDto {

    @pmi0("images")
    private final List<BaseImageDto> images;

    /* JADX WARN: Multi-variable type inference failed */
    public PhotosSaveOwnerCoverPhotoResponseDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PhotosSaveOwnerCoverPhotoResponseDto) && epx.f(this.images, ((PhotosSaveOwnerCoverPhotoResponseDto) obj).images);
    }

    public final int hashCode() {
        List<BaseImageDto> list = this.images;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return wq.c("PhotosSaveOwnerCoverPhotoResponseDto(images=", ")", this.images);
    }

    public PhotosSaveOwnerCoverPhotoResponseDto(List<BaseImageDto> list) {
        this.images = list;
    }

    public /* synthetic */ PhotosSaveOwnerCoverPhotoResponseDto(List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list);
    }
}
