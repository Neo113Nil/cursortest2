package com.vk.sdk.api.market.dto;

import java.util.List;
import xsna.epx;
import xsna.pmi0;

/* compiled from: MarketGroupsBlockFriendsDto.kt */
/* loaded from: classes5.dex */
public final class MarketGroupsBlockFriendsDto {

    @pmi0("items")
    private final List<MarketGroupsBlockFriendsItemDto> items;

    @pmi0("text")
    private final String text;

    public MarketGroupsBlockFriendsDto(String str, List<MarketGroupsBlockFriendsItemDto> list) {
        this.text = str;
        this.items = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketGroupsBlockFriendsDto)) {
            return false;
        }
        MarketGroupsBlockFriendsDto marketGroupsBlockFriendsDto = (MarketGroupsBlockFriendsDto) obj;
        return epx.f(this.text, marketGroupsBlockFriendsDto.text) && epx.f(this.items, marketGroupsBlockFriendsDto.items);
    }

    public final int hashCode() {
        return this.items.hashCode() + (this.text.hashCode() * 31);
    }

    public final String toString() {
        return "MarketGroupsBlockFriendsDto(text=" + this.text + ", items=" + this.items + ")";
    }
}
