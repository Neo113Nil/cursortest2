package com.vk.sdk.api.market.dto;

import java.util.List;
import xsna.epx;
import xsna.pmi0;
import xsna.wq;

/* compiled from: MarketGetCategoriesNewResponseDto.kt */
/* loaded from: classes5.dex */
public final class MarketGetCategoriesNewResponseDto {

    @pmi0("items")
    private final List<MarketMarketCategoryTreeDto> items;

    public MarketGetCategoriesNewResponseDto(List<MarketMarketCategoryTreeDto> list) {
        this.items = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MarketGetCategoriesNewResponseDto) && epx.f(this.items, ((MarketGetCategoriesNewResponseDto) obj).items);
    }

    public final int hashCode() {
        return this.items.hashCode();
    }

    public final String toString() {
        return wq.c("MarketGetCategoriesNewResponseDto(items=", ")", this.items);
    }
}
