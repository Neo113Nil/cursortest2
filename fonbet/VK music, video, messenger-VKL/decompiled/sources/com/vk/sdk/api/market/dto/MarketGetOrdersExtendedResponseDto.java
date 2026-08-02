package com.vk.sdk.api.market.dto;

import com.vk.sdk.api.groups.dto.GroupsGroupFullDto;
import java.util.List;
import xsna.epx;
import xsna.fw3;
import xsna.pmi0;
import xsna.vp;
import xsna.zcl;
import xsna.zn;

/* compiled from: MarketGetOrdersExtendedResponseDto.kt */
/* loaded from: classes5.dex */
public final class MarketGetOrdersExtendedResponseDto {

    @pmi0("count")
    private final int count;

    @pmi0("groups")
    private final List<GroupsGroupFullDto> groups;

    @pmi0("items")
    private final List<MarketOrderDto> items;

    public MarketGetOrdersExtendedResponseDto(int i, List<MarketOrderDto> list, List<GroupsGroupFullDto> list2) {
        this.count = i;
        this.items = list;
        this.groups = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketGetOrdersExtendedResponseDto)) {
            return false;
        }
        MarketGetOrdersExtendedResponseDto marketGetOrdersExtendedResponseDto = (MarketGetOrdersExtendedResponseDto) obj;
        return this.count == marketGetOrdersExtendedResponseDto.count && epx.f(this.items, marketGetOrdersExtendedResponseDto.items) && epx.f(this.groups, marketGetOrdersExtendedResponseDto.groups);
    }

    public final int hashCode() {
        int a = fw3.a(Integer.hashCode(this.count) * 31, 31, this.items);
        List<GroupsGroupFullDto> list = this.groups;
        return a + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        int i = this.count;
        List<MarketOrderDto> list = this.items;
        return vp.b(")", zn.c(i, "MarketGetOrdersExtendedResponseDto(count=", ", items=", ", groups=", list), this.groups);
    }

    public /* synthetic */ MarketGetOrdersExtendedResponseDto(int i, List list, List list2, int i2, zcl zclVar) {
        this(i, list, (i2 & 4) != 0 ? null : list2);
    }
}
