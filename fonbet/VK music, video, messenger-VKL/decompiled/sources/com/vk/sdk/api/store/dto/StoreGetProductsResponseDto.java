package com.vk.sdk.api.store.dto;

import java.util.List;
import xsna.epx;
import xsna.pmi0;

/* compiled from: StoreGetProductsResponseDto.kt */
/* loaded from: classes5.dex */
public final class StoreGetProductsResponseDto {

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<StoreProductDto> items;

    public StoreGetProductsResponseDto(List<StoreProductDto> list, int i) {
        this.items = list;
        this.count = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoreGetProductsResponseDto)) {
            return false;
        }
        StoreGetProductsResponseDto storeGetProductsResponseDto = (StoreGetProductsResponseDto) obj;
        return epx.f(this.items, storeGetProductsResponseDto.items) && this.count == storeGetProductsResponseDto.count;
    }

    public final int hashCode() {
        return Integer.hashCode(this.count) + (this.items.hashCode() * 31);
    }

    public final String toString() {
        return "StoreGetProductsResponseDto(items=" + this.items + ", count=" + this.count + ")";
    }
}
