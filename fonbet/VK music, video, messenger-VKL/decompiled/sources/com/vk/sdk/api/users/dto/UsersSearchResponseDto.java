package com.vk.sdk.api.users.dto;

import java.util.List;
import xsna.epx;
import xsna.pmi0;
import xsna.pn;

/* compiled from: UsersSearchResponseDto.kt */
/* loaded from: classes5.dex */
public final class UsersSearchResponseDto {

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<UsersUserFullDto> items;

    public UsersSearchResponseDto(int i, List<UsersUserFullDto> list) {
        this.count = i;
        this.items = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UsersSearchResponseDto)) {
            return false;
        }
        UsersSearchResponseDto usersSearchResponseDto = (UsersSearchResponseDto) obj;
        return this.count == usersSearchResponseDto.count && epx.f(this.items, usersSearchResponseDto.items);
    }

    public final int hashCode() {
        return this.items.hashCode() + (Integer.hashCode(this.count) * 31);
    }

    public final String toString() {
        return pn.c(this.count, "UsersSearchResponseDto(count=", ", items=", ")", this.items);
    }
}
