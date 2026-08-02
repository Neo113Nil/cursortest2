package com.vk.sdk.api.market.dto;

import java.util.List;
import xsna.epx;
import xsna.fw3;
import xsna.pmi0;
import xsna.vp;
import xsna.zcl;
import xsna.zn;

/* compiled from: MarketGetResponseDto.kt */
/* loaded from: classes5.dex */
public final class MarketGetResponseDto {

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<MarketMarketItemDto> items;

    @pmi0("variants")
    private final List<MarketMarketItemDto> variants;

    public MarketGetResponseDto(int i, List<MarketMarketItemDto> list, List<MarketMarketItemDto> list2) {
        this.count = i;
        this.items = list;
        this.variants = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketGetResponseDto)) {
            return false;
        }
        MarketGetResponseDto marketGetResponseDto = (MarketGetResponseDto) obj;
        return this.count == marketGetResponseDto.count && epx.f(this.items, marketGetResponseDto.items) && epx.f(this.variants, marketGetResponseDto.variants);
    }

    public final int hashCode() {
        int a = fw3.a(Integer.hashCode(this.count) * 31, 31, this.items);
        List<MarketMarketItemDto> list = this.variants;
        return a + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        int i = this.count;
        List<MarketMarketItemDto> list = this.items;
        return vp.b(")", zn.c(i, "MarketGetResponseDto(count=", ", items=", ", variants=", list), this.variants);
    }

    public /* synthetic */ MarketGetResponseDto(int i, List list, List list2, int i2, zcl zclVar) {
        this(i, list, (i2 & 4) != 0 ? null : list2);
    }
}
