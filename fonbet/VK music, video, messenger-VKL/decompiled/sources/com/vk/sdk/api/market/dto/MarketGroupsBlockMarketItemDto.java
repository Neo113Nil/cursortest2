package com.vk.sdk.api.market.dto;

import com.vk.sdk.api.photos.dto.PhotosPhotoDto;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MarketGroupsBlockMarketItemDto.kt */
/* loaded from: classes5.dex */
public final class MarketGroupsBlockMarketItemDto {

    @pmi0("photo")
    private final PhotosPhotoDto photo;

    /* JADX WARN: Multi-variable type inference failed */
    public MarketGroupsBlockMarketItemDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MarketGroupsBlockMarketItemDto) && epx.f(this.photo, ((MarketGroupsBlockMarketItemDto) obj).photo);
    }

    public final int hashCode() {
        PhotosPhotoDto photosPhotoDto = this.photo;
        if (photosPhotoDto == null) {
            return 0;
        }
        return photosPhotoDto.hashCode();
    }

    public final String toString() {
        return "MarketGroupsBlockMarketItemDto(photo=" + this.photo + ")";
    }

    public MarketGroupsBlockMarketItemDto(PhotosPhotoDto photosPhotoDto) {
        this.photo = photosPhotoDto;
    }

    public /* synthetic */ MarketGroupsBlockMarketItemDto(PhotosPhotoDto photosPhotoDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : photosPhotoDto);
    }
}
