package com.vk.sdk.api.friends.dto;

import com.vk.sdk.api.users.dto.UsersUserFullDto;
import java.util.List;
import xsna.epx;
import xsna.pmi0;
import xsna.pn;

/* compiled from: FriendsSearchResponseDto.kt */
/* loaded from: classes5.dex */
public final class FriendsSearchResponseDto {

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<UsersUserFullDto> items;

    public FriendsSearchResponseDto(int i, List<UsersUserFullDto> list) {
        this.count = i;
        this.items = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FriendsSearchResponseDto)) {
            return false;
        }
        FriendsSearchResponseDto friendsSearchResponseDto = (FriendsSearchResponseDto) obj;
        return this.count == friendsSearchResponseDto.count && epx.f(this.items, friendsSearchResponseDto.items);
    }

    public final int hashCode() {
        return this.items.hashCode() + (Integer.hashCode(this.count) * 31);
    }

    public final String toString() {
        return pn.c(this.count, "FriendsSearchResponseDto(count=", ", items=", ")", this.items);
    }
}
