package com.vk.sdk.api.market.dto;

import java.util.List;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MarketGroupsBlockDto.kt */
/* loaded from: classes5.dex */
public final class MarketGroupsBlockDto {

    @pmi0("friends")
    private final MarketGroupsBlockFriendsDto friends;

    @pmi0("groups")
    private final List<MarketGroupsBlockGroupDto> groups;

    public MarketGroupsBlockDto(List<MarketGroupsBlockGroupDto> list, MarketGroupsBlockFriendsDto marketGroupsBlockFriendsDto) {
        this.groups = list;
        this.friends = marketGroupsBlockFriendsDto;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketGroupsBlockDto)) {
            return false;
        }
        MarketGroupsBlockDto marketGroupsBlockDto = (MarketGroupsBlockDto) obj;
        return epx.f(this.groups, marketGroupsBlockDto.groups) && epx.f(this.friends, marketGroupsBlockDto.friends);
    }

    public final int hashCode() {
        int hashCode = this.groups.hashCode() * 31;
        MarketGroupsBlockFriendsDto marketGroupsBlockFriendsDto = this.friends;
        return hashCode + (marketGroupsBlockFriendsDto == null ? 0 : marketGroupsBlockFriendsDto.hashCode());
    }

    public final String toString() {
        return "MarketGroupsBlockDto(groups=" + this.groups + ", friends=" + this.friends + ")";
    }

    public /* synthetic */ MarketGroupsBlockDto(List list, MarketGroupsBlockFriendsDto marketGroupsBlockFriendsDto, int i, zcl zclVar) {
        this(list, (i & 2) != 0 ? null : marketGroupsBlockFriendsDto);
    }
}
