package com.vk.sdk.api.market.dto;

import java.util.List;
import xsna.epx;
import xsna.pmi0;
import xsna.pn;

/* compiled from: MarketGetOrdersResponseDto.kt */
/* loaded from: classes5.dex */
public final class MarketGetOrdersResponseDto {

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<MarketOrderDto> items;

    public MarketGetOrdersResponseDto(int i, List<MarketOrderDto> list) {
        this.count = i;
        this.items = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketGetOrdersResponseDto)) {
            return false;
        }
        MarketGetOrdersResponseDto marketGetOrdersResponseDto = (MarketGetOrdersResponseDto) obj;
        return this.count == marketGetOrdersResponseDto.count && epx.f(this.items, marketGetOrdersResponseDto.items);
    }

    public final int hashCode() {
        return this.items.hashCode() + (Integer.hashCode(this.count) * 31);
    }

    public final String toString() {
        return pn.c(this.count, "MarketGetOrdersResponseDto(count=", ", items=", ")", this.items);
    }
}
