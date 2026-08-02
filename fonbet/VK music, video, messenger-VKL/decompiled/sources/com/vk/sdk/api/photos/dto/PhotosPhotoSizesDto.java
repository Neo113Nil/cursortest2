package com.vk.sdk.api.photos.dto;

import xsna.epx;
import xsna.i5s;
import xsna.jax0;
import xsna.pmi0;
import xsna.shy;
import xsna.zcl;

/* compiled from: PhotosPhotoSizesDto.kt */
/* loaded from: classes5.dex */
public final class PhotosPhotoSizesDto {

    @pmi0("height")
    private final int height;

    @pmi0("src")
    private final String src;

    @pmi0("type")
    private final PhotosPhotoSizesTypeDto type;

    @pmi0("url")
    private final String url;

    @pmi0("width")
    private final int width;

    public PhotosPhotoSizesDto(int i, PhotosPhotoSizesTypeDto photosPhotoSizesTypeDto, int i2, String str, String str2) {
        this.height = i;
        this.type = photosPhotoSizesTypeDto;
        this.width = i2;
        this.url = str;
        this.src = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhotosPhotoSizesDto)) {
            return false;
        }
        PhotosPhotoSizesDto photosPhotoSizesDto = (PhotosPhotoSizesDto) obj;
        return this.height == photosPhotoSizesDto.height && this.type == photosPhotoSizesDto.type && this.width == photosPhotoSizesDto.width && epx.f(this.url, photosPhotoSizesDto.url) && epx.f(this.src, photosPhotoSizesDto.src);
    }

    public final int hashCode() {
        int a = shy.a(this.width, (this.type.hashCode() + (Integer.hashCode(this.height) * 31)) * 31, 31);
        String str = this.url;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.src;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        int i = this.height;
        PhotosPhotoSizesTypeDto photosPhotoSizesTypeDto = this.type;
        int i2 = this.width;
        String str = this.url;
        String str2 = this.src;
        StringBuilder sb = new StringBuilder("PhotosPhotoSizesDto(height=");
        sb.append(i);
        sb.append(", type=");
        sb.append(photosPhotoSizesTypeDto);
        sb.append(", width=");
        jax0.a(i2, ", url=", str, ", src=", sb);
        return i5s.a(sb, str2, ")");
    }

    public /* synthetic */ PhotosPhotoSizesDto(int i, PhotosPhotoSizesTypeDto photosPhotoSizesTypeDto, int i2, String str, String str2, int i3, zcl zclVar) {
        this(i, photosPhotoSizesTypeDto, i2, (i3 & 8) != 0 ? null : str, (i3 & 16) != 0 ? null : str2);
    }
}
