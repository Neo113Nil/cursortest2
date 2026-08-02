package com.vk.sdk.api.market.dto;

import java.util.List;
import xsna.epx;
import xsna.pmi0;
import xsna.pn;

/* compiled from: MarketGetByIdExtendedResponseDto.kt */
/* loaded from: classes5.dex */
public final class MarketGetByIdExtendedResponseDto {

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<MarketMarketItemFullDto> items;

    public MarketGetByIdExtendedResponseDto(int i, List<MarketMarketItemFullDto> list) {
        this.count = i;
        this.items = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketGetByIdExtendedResponseDto)) {
            return false;
        }
        MarketGetByIdExtendedResponseDto marketGetByIdExtendedResponseDto = (MarketGetByIdExtendedResponseDto) obj;
        return this.count == marketGetByIdExtendedResponseDto.count && epx.f(this.items, marketGetByIdExtendedResponseDto.items);
    }

    public final int hashCode() {
        return this.items.hashCode() + (Integer.hashCode(this.count) * 31);
    }

    public final String toString() {
        return pn.c(this.count, "MarketGetByIdExtendedResponseDto(count=", ", items=", ")", this.items);
    }
}
