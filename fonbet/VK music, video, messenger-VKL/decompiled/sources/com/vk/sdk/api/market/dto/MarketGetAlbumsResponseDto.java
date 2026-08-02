package com.vk.sdk.api.market.dto;

import java.util.List;
import xsna.epx;
import xsna.pmi0;
import xsna.pn;

/* compiled from: MarketGetAlbumsResponseDto.kt */
/* loaded from: classes5.dex */
public final class MarketGetAlbumsResponseDto {

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<MarketMarketAlbumDto> items;

    public MarketGetAlbumsResponseDto(int i, List<MarketMarketAlbumDto> list) {
        this.count = i;
        this.items = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketGetAlbumsResponseDto)) {
            return false;
        }
        MarketGetAlbumsResponseDto marketGetAlbumsResponseDto = (MarketGetAlbumsResponseDto) obj;
        return this.count == marketGetAlbumsResponseDto.count && epx.f(this.items, marketGetAlbumsResponseDto.items);
    }

    public final int hashCode() {
        return this.items.hashCode() + (Integer.hashCode(this.count) * 31);
    }

    public final String toString() {
        return pn.c(this.count, "MarketGetAlbumsResponseDto(count=", ", items=", ")", this.items);
    }
}
