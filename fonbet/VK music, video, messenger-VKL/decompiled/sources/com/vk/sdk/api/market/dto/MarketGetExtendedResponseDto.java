package com.vk.sdk.api.market.dto;

import java.util.List;
import xsna.epx;
import xsna.fw3;
import xsna.pmi0;
import xsna.vp;
import xsna.zcl;
import xsna.zn;

/* compiled from: MarketGetExtendedResponseDto.kt */
/* loaded from: classes5.dex */
public final class MarketGetExtendedResponseDto {

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<MarketMarketItemFullDto> items;

    @pmi0("variants")
    private final List<MarketMarketItemFullDto> variants;

    public MarketGetExtendedResponseDto(int i, List<MarketMarketItemFullDto> list, List<MarketMarketItemFullDto> list2) {
        this.count = i;
        this.items = list;
        this.variants = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketGetExtendedResponseDto)) {
            return false;
        }
        MarketGetExtendedResponseDto marketGetExtendedResponseDto = (MarketGetExtendedResponseDto) obj;
        return this.count == marketGetExtendedResponseDto.count && epx.f(this.items, marketGetExtendedResponseDto.items) && epx.f(this.variants, marketGetExtendedResponseDto.variants);
    }

    public final int hashCode() {
        int a = fw3.a(Integer.hashCode(this.count) * 31, 31, this.items);
        List<MarketMarketItemFullDto> list = this.variants;
        return a + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        int i = this.count;
        List<MarketMarketItemFullDto> list = this.items;
        return vp.b(")", zn.c(i, "MarketGetExtendedResponseDto(count=", ", items=", ", variants=", list), this.variants);
    }

    public /* synthetic */ MarketGetExtendedResponseDto(int i, List list, List list2, int i2, zcl zclVar) {
        this(i, list, (i2 & 4) != 0 ? null : list2);
    }
}
