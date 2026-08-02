package com.vk.sdk.api.market.dto;

import com.vk.movika.sdk.base.model.n;
import java.util.List;
import xsna.epx;
import xsna.fw3;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MarketSearchExtendedResponseDto.kt */
/* loaded from: classes5.dex */
public final class MarketSearchExtendedResponseDto {

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<MarketMarketItemFullDto> items;

    @pmi0("variants")
    private final List<MarketMarketItemFullDto> variants;

    @pmi0("view_type")
    private final MarketServicesViewTypeDto viewType;

    public MarketSearchExtendedResponseDto(int i, MarketServicesViewTypeDto marketServicesViewTypeDto, List<MarketMarketItemFullDto> list, List<MarketMarketItemFullDto> list2) {
        this.count = i;
        this.viewType = marketServicesViewTypeDto;
        this.items = list;
        this.variants = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketSearchExtendedResponseDto)) {
            return false;
        }
        MarketSearchExtendedResponseDto marketSearchExtendedResponseDto = (MarketSearchExtendedResponseDto) obj;
        return this.count == marketSearchExtendedResponseDto.count && this.viewType == marketSearchExtendedResponseDto.viewType && epx.f(this.items, marketSearchExtendedResponseDto.items) && epx.f(this.variants, marketSearchExtendedResponseDto.variants);
    }

    public final int hashCode() {
        int a = fw3.a((this.viewType.hashCode() + (Integer.hashCode(this.count) * 31)) * 31, 31, this.items);
        List<MarketMarketItemFullDto> list = this.variants;
        return a + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        int i = this.count;
        MarketServicesViewTypeDto marketServicesViewTypeDto = this.viewType;
        List<MarketMarketItemFullDto> list = this.items;
        List<MarketMarketItemFullDto> list2 = this.variants;
        StringBuilder sb = new StringBuilder("MarketSearchExtendedResponseDto(count=");
        sb.append(i);
        sb.append(", viewType=");
        sb.append(marketServicesViewTypeDto);
        sb.append(", items=");
        return n.b(sb, list, ", variants=", list2, ")");
    }

    public /* synthetic */ MarketSearchExtendedResponseDto(int i, MarketServicesViewTypeDto marketServicesViewTypeDto, List list, List list2, int i2, zcl zclVar) {
        this(i, marketServicesViewTypeDto, list, (i2 & 8) != 0 ? null : list2);
    }
}
