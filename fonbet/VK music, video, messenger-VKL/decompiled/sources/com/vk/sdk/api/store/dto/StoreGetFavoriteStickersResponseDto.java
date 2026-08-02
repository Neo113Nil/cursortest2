package com.vk.sdk.api.store.dto;

import com.vk.sdk.api.base.dto.BaseStickerNewDto;
import java.util.List;
import xsna.epx;
import xsna.pmi0;
import xsna.pn;

/* compiled from: StoreGetFavoriteStickersResponseDto.kt */
/* loaded from: classes5.dex */
public final class StoreGetFavoriteStickersResponseDto {

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<BaseStickerNewDto> items;

    public StoreGetFavoriteStickersResponseDto(int i, List<BaseStickerNewDto> list) {
        this.count = i;
        this.items = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoreGetFavoriteStickersResponseDto)) {
            return false;
        }
        StoreGetFavoriteStickersResponseDto storeGetFavoriteStickersResponseDto = (StoreGetFavoriteStickersResponseDto) obj;
        return this.count == storeGetFavoriteStickersResponseDto.count && epx.f(this.items, storeGetFavoriteStickersResponseDto.items);
    }

    public final int hashCode() {
        return this.items.hashCode() + (Integer.hashCode(this.count) * 31);
    }

    public final String toString() {
        return pn.c(this.count, "StoreGetFavoriteStickersResponseDto(count=", ", items=", ")", this.items);
    }
}
