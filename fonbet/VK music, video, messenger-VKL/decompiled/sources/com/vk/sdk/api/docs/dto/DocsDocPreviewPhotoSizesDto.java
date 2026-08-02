package com.vk.sdk.api.docs.dto;

import com.vk.sdk.api.photos.dto.PhotosPhotoSizesTypeDto;
import xsna.epx;
import xsna.pmi0;
import xsna.shy;
import xsna.xy6;

/* compiled from: DocsDocPreviewPhotoSizesDto.kt */
/* loaded from: classes5.dex */
public final class DocsDocPreviewPhotoSizesDto {

    @pmi0("height")
    private final int height;

    @pmi0("src")
    private final String src;

    @pmi0("type")
    private final PhotosPhotoSizesTypeDto type;

    @pmi0("width")
    private final int width;

    public DocsDocPreviewPhotoSizesDto(String str, int i, int i2, PhotosPhotoSizesTypeDto photosPhotoSizesTypeDto) {
        this.src = str;
        this.width = i;
        this.height = i2;
        this.type = photosPhotoSizesTypeDto;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DocsDocPreviewPhotoSizesDto)) {
            return false;
        }
        DocsDocPreviewPhotoSizesDto docsDocPreviewPhotoSizesDto = (DocsDocPreviewPhotoSizesDto) obj;
        return epx.f(this.src, docsDocPreviewPhotoSizesDto.src) && this.width == docsDocPreviewPhotoSizesDto.width && this.height == docsDocPreviewPhotoSizesDto.height && this.type == docsDocPreviewPhotoSizesDto.type;
    }

    public final int hashCode() {
        return this.type.hashCode() + shy.a(this.height, shy.a(this.width, this.src.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        String str = this.src;
        int i = this.width;
        int i2 = this.height;
        PhotosPhotoSizesTypeDto photosPhotoSizesTypeDto = this.type;
        StringBuilder b = xy6.b(i, "DocsDocPreviewPhotoSizesDto(src=", str, ", width=", ", height=");
        b.append(i2);
        b.append(", type=");
        b.append(photosPhotoSizesTypeDto);
        b.append(")");
        return b.toString();
    }
}
