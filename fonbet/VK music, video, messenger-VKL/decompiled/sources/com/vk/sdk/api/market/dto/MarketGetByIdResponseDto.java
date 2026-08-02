package com.vk.sdk.api.market.dto;

import java.util.List;
import xsna.epx;
import xsna.pmi0;
import xsna.pn;

/* compiled from: MarketGetByIdResponseDto.kt */
/* loaded from: classes5.dex */
public final class MarketGetByIdResponseDto {

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<MarketMarketItemDto> items;

    public MarketGetByIdResponseDto(int i, List<MarketMarketItemDto> list) {
        this.count = i;
        this.items = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketGetByIdResponseDto)) {
            return false;
        }
        MarketGetByIdResponseDto marketGetByIdResponseDto = (MarketGetByIdResponseDto) obj;
        return this.count == marketGetByIdResponseDto.count && epx.f(this.items, marketGetByIdResponseDto.items);
    }

    public final int hashCode() {
        return this.items.hashCode() + (Integer.hashCode(this.count) * 31);
    }

    public final String toString() {
        return pn.c(this.count, "MarketGetByIdResponseDto(count=", ", items=", ")", this.items);
    }
}
