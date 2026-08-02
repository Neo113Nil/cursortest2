package com.vk.repository.internal.repos.stickers.database.converters.dto;

import java.util.ArrayList;
import java.util.List;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: ImageListDto.kt */
/* loaded from: classes5.dex */
public final class ImageListDto {

    @pmi0("images")
    private final List<ImageSizeDto> images;

    /* JADX WARN: Multi-variable type inference failed */
    public ImageListDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final List<ImageSizeDto> a() {
        return this.images;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ImageListDto) && epx.f(this.images, ((ImageListDto) obj).images);
    }

    public final int hashCode() {
        return this.images.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("ImageListDto(images="), this.images);
    }

    public ImageListDto(List<ImageSizeDto> list) {
        this.images = list;
    }

    public /* synthetic */ ImageListDto(List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? new ArrayList() : list);
    }
}
