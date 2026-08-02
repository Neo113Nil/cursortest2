package com.vk.sdk.api.apps.dto;

import com.vk.sdk.api.users.dto.UsersUserFullDto;
import java.util.List;
import xsna.epx;
import xsna.pmi0;
import xsna.pn;

/* compiled from: AppsGetFriendsListExtendedResponseDto.kt */
/* loaded from: classes5.dex */
public final class AppsGetFriendsListExtendedResponseDto {

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<UsersUserFullDto> items;

    public AppsGetFriendsListExtendedResponseDto(int i, List<UsersUserFullDto> list) {
        this.count = i;
        this.items = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsGetFriendsListExtendedResponseDto)) {
            return false;
        }
        AppsGetFriendsListExtendedResponseDto appsGetFriendsListExtendedResponseDto = (AppsGetFriendsListExtendedResponseDto) obj;
        return this.count == appsGetFriendsListExtendedResponseDto.count && epx.f(this.items, appsGetFriendsListExtendedResponseDto.items);
    }

    public final int hashCode() {
        return this.items.hashCode() + (Integer.hashCode(this.count) * 31);
    }

    public final String toString() {
        return pn.c(this.count, "AppsGetFriendsListExtendedResponseDto(count=", ", items=", ")", this.items);
    }
}
