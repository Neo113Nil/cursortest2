package com.vk.sdk.api.friends.dto;

import java.util.List;
import xsna.epx;
import xsna.pmi0;
import xsna.pn;

/* compiled from: FriendsGetListsResponseDto.kt */
/* loaded from: classes5.dex */
public final class FriendsGetListsResponseDto {

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<FriendsFriendsListDto> items;

    public FriendsGetListsResponseDto(int i, List<FriendsFriendsListDto> list) {
        this.count = i;
        this.items = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FriendsGetListsResponseDto)) {
            return false;
        }
        FriendsGetListsResponseDto friendsGetListsResponseDto = (FriendsGetListsResponseDto) obj;
        return this.count == friendsGetListsResponseDto.count && epx.f(this.items, friendsGetListsResponseDto.items);
    }

    public final int hashCode() {
        return this.items.hashCode() + (Integer.hashCode(this.count) * 31);
    }

    public final String toString() {
        return pn.c(this.count, "FriendsGetListsResponseDto(count=", ", items=", ")", this.items);
    }
}
