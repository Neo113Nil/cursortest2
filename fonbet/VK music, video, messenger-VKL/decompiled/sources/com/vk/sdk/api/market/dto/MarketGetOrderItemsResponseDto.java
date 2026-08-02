package com.vk.sdk.api.market.dto;

import java.util.List;
import xsna.epx;
import xsna.pmi0;
import xsna.pn;

/* compiled from: MarketGetOrderItemsResponseDto.kt */
/* loaded from: classes5.dex */
public final class MarketGetOrderItemsResponseDto {

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<MarketOrderItemDto> items;

    public MarketGetOrderItemsResponseDto(int i, List<MarketOrderItemDto> list) {
        this.count = i;
        this.items = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketGetOrderItemsResponseDto)) {
            return false;
        }
        MarketGetOrderItemsResponseDto marketGetOrderItemsResponseDto = (MarketGetOrderItemsResponseDto) obj;
        return this.count == marketGetOrderItemsResponseDto.count && epx.f(this.items, marketGetOrderItemsResponseDto.items);
    }

    public final int hashCode() {
        return this.items.hashCode() + (Integer.hashCode(this.count) * 31);
    }

    public final String toString() {
        return pn.c(this.count, "MarketGetOrderItemsResponseDto(count=", ", items=", ")", this.items);
    }
}
