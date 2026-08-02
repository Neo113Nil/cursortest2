package com.vk.sdk.api.photos.dto;

import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: PhotosImageDto.kt */
/* loaded from: classes5.dex */
public final class PhotosImageDto {

    @pmi0("height")
    private final Integer height;

    @pmi0("type")
    private final PhotosImageTypeDto type;

    @pmi0("url")
    private final String url;

    @pmi0("width")
    private final Integer width;

    public PhotosImageDto() {
        this(null, null, null, null, 15, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhotosImageDto)) {
            return false;
        }
        PhotosImageDto photosImageDto = (PhotosImageDto) obj;
        return epx.f(this.height, photosImageDto.height) && this.type == photosImageDto.type && epx.f(this.url, photosImageDto.url) && epx.f(this.width, photosImageDto.width);
    }

    public final int hashCode() {
        Integer num = this.height;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        PhotosImageTypeDto photosImageTypeDto = this.type;
        int hashCode2 = (hashCode + (photosImageTypeDto == null ? 0 : photosImageTypeDto.hashCode())) * 31;
        String str = this.url;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.width;
        return hashCode3 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return "PhotosImageDto(height=" + this.height + ", type=" + this.type + ", url=" + this.url + ", width=" + this.width + ")";
    }

    public PhotosImageDto(Integer num, PhotosImageTypeDto photosImageTypeDto, String str, Integer num2) {
        this.height = num;
        this.type = photosImageTypeDto;
        this.url = str;
        this.width = num2;
    }

    public /* synthetic */ PhotosImageDto(Integer num, PhotosImageTypeDto photosImageTypeDto, String str, Integer num2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : photosImageTypeDto, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : num2);
    }
}
