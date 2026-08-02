package com.vk.sdk.api.friends.dto;

import com.vk.sdk.api.users.dto.UsersUserFullDto;
import java.util.List;
import xsna.epx;
import xsna.pmi0;
import xsna.pn;

/* compiled from: FriendsGetSuggestionsResponseDto.kt */
/* loaded from: classes5.dex */
public final class FriendsGetSuggestionsResponseDto {

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<UsersUserFullDto> items;

    public FriendsGetSuggestionsResponseDto(int i, List<UsersUserFullDto> list) {
        this.count = i;
        this.items = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FriendsGetSuggestionsResponseDto)) {
            return false;
        }
        FriendsGetSuggestionsResponseDto friendsGetSuggestionsResponseDto = (FriendsGetSuggestionsResponseDto) obj;
        return this.count == friendsGetSuggestionsResponseDto.count && epx.f(this.items, friendsGetSuggestionsResponseDto.items);
    }

    public final int hashCode() {
        return this.items.hashCode() + (Integer.hashCode(this.count) * 31);
    }

    public final String toString() {
        return pn.c(this.count, "FriendsGetSuggestionsResponseDto(count=", ", items=", ")", this.items);
    }
}
