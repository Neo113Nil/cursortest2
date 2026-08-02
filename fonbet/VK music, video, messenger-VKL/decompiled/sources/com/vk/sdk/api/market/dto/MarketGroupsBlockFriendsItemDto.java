package com.vk.sdk.api.market.dto;

import com.vk.dto.common.id.UserId;
import com.vk.sdk.api.base.dto.BaseImageDto;
import java.util.List;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MarketGroupsBlockFriendsItemDto.kt */
/* loaded from: classes5.dex */
public final class MarketGroupsBlockFriendsItemDto {

    @pmi0("id")
    private final UserId id;

    @pmi0("photo")
    private final List<BaseImageDto> photo;

    public MarketGroupsBlockFriendsItemDto(UserId userId, List<BaseImageDto> list) {
        this.id = userId;
        this.photo = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketGroupsBlockFriendsItemDto)) {
            return false;
        }
        MarketGroupsBlockFriendsItemDto marketGroupsBlockFriendsItemDto = (MarketGroupsBlockFriendsItemDto) obj;
        return epx.f(this.id, marketGroupsBlockFriendsItemDto.id) && epx.f(this.photo, marketGroupsBlockFriendsItemDto.photo);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.id.b) * 31;
        List<BaseImageDto> list = this.photo;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "MarketGroupsBlockFriendsItemDto(id=" + this.id + ", photo=" + this.photo + ")";
    }

    public /* synthetic */ MarketGroupsBlockFriendsItemDto(UserId userId, List list, int i, zcl zclVar) {
        this(userId, (i & 2) != 0 ? null : list);
    }
}
