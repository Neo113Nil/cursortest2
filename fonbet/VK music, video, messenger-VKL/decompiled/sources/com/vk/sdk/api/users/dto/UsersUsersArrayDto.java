package com.vk.sdk.api.users.dto;

import com.vk.dto.common.id.UserId;
import java.util.List;
import xsna.epx;
import xsna.pmi0;
import xsna.pn;

/* compiled from: UsersUsersArrayDto.kt */
/* loaded from: classes5.dex */
public final class UsersUsersArrayDto {

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<UserId> items;

    public UsersUsersArrayDto(int i, List<UserId> list) {
        this.count = i;
        this.items = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UsersUsersArrayDto)) {
            return false;
        }
        UsersUsersArrayDto usersUsersArrayDto = (UsersUsersArrayDto) obj;
        return this.count == usersUsersArrayDto.count && epx.f(this.items, usersUsersArrayDto.items);
    }

    public final int hashCode() {
        return this.items.hashCode() + (Integer.hashCode(this.count) * 31);
    }

    public final String toString() {
        return pn.c(this.count, "UsersUsersArrayDto(count=", ", items=", ")", this.items);
    }
}
