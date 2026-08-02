package com.vk.sdk.api.market.dto;

import com.vk.sdk.api.groups.dto.GroupsGroupFullDto;
import java.util.List;
import xsna.epx;
import xsna.fw3;
import xsna.pmi0;
import xsna.vq;
import xsna.zcl;

/* compiled from: MarketSearchResponseDto.kt */
/* loaded from: classes5.dex */
public final class MarketSearchResponseDto {

    @pmi0("count")
    private final int count;

    @pmi0("filters")
    private final MarketGlobalSearchFiltersDto filters;

    @pmi0("groups")
    private final List<GroupsGroupFullDto> groups;

    @pmi0("items")
    private final List<MarketMarketItemDto> items;

    @pmi0("variants")
    private final List<MarketMarketItemDto> variants;

    @pmi0("view_type")
    private final MarketServicesViewTypeDto viewType;

    public MarketSearchResponseDto(int i, MarketServicesViewTypeDto marketServicesViewTypeDto, List<MarketMarketItemDto> list, List<MarketMarketItemDto> list2, List<GroupsGroupFullDto> list3, MarketGlobalSearchFiltersDto marketGlobalSearchFiltersDto) {
        this.count = i;
        this.viewType = marketServicesViewTypeDto;
        this.items = list;
        this.variants = list2;
        this.groups = list3;
        this.filters = marketGlobalSearchFiltersDto;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketSearchResponseDto)) {
            return false;
        }
        MarketSearchResponseDto marketSearchResponseDto = (MarketSearchResponseDto) obj;
        return this.count == marketSearchResponseDto.count && this.viewType == marketSearchResponseDto.viewType && epx.f(this.items, marketSearchResponseDto.items) && epx.f(this.variants, marketSearchResponseDto.variants) && epx.f(this.groups, marketSearchResponseDto.groups) && epx.f(this.filters, marketSearchResponseDto.filters);
    }

    public final int hashCode() {
        int a = fw3.a((this.viewType.hashCode() + (Integer.hashCode(this.count) * 31)) * 31, 31, this.items);
        List<MarketMarketItemDto> list = this.variants;
        int hashCode = (a + (list == null ? 0 : list.hashCode())) * 31;
        List<GroupsGroupFullDto> list2 = this.groups;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        MarketGlobalSearchFiltersDto marketGlobalSearchFiltersDto = this.filters;
        return hashCode2 + (marketGlobalSearchFiltersDto != null ? marketGlobalSearchFiltersDto.hashCode() : 0);
    }

    public final String toString() {
        int i = this.count;
        MarketServicesViewTypeDto marketServicesViewTypeDto = this.viewType;
        List<MarketMarketItemDto> list = this.items;
        List<MarketMarketItemDto> list2 = this.variants;
        List<GroupsGroupFullDto> list3 = this.groups;
        MarketGlobalSearchFiltersDto marketGlobalSearchFiltersDto = this.filters;
        StringBuilder sb = new StringBuilder("MarketSearchResponseDto(count=");
        sb.append(i);
        sb.append(", viewType=");
        sb.append(marketServicesViewTypeDto);
        sb.append(", items=");
        vq.d(sb, list, ", variants=", list2, ", groups=");
        sb.append(list3);
        sb.append(", filters=");
        sb.append(marketGlobalSearchFiltersDto);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ MarketSearchResponseDto(int i, MarketServicesViewTypeDto marketServicesViewTypeDto, List list, List list2, List list3, MarketGlobalSearchFiltersDto marketGlobalSearchFiltersDto, int i2, zcl zclVar) {
        this(i, marketServicesViewTypeDto, list, (i2 & 8) != 0 ? null : list2, (i2 & 16) != 0 ? null : list3, (i2 & 32) != 0 ? null : marketGlobalSearchFiltersDto);
    }
}
