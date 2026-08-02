package com.vk.sdk.api.users.dto;

import java.util.List;
import xsna.epx;
import xsna.pmi0;
import xsna.pn;

/* compiled from: UsersGetSubscriptionsExtendedResponseDto.kt */
/* loaded from: classes5.dex */
public final class UsersGetSubscriptionsExtendedResponseDto {

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<UsersSubscriptionsItemDto> items;

    /* JADX WARN: Multi-variable type inference failed */
    public UsersGetSubscriptionsExtendedResponseDto(int i, List<? extends UsersSubscriptionsItemDto> list) {
        this.count = i;
        this.items = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UsersGetSubscriptionsExtendedResponseDto)) {
            return false;
        }
        UsersGetSubscriptionsExtendedResponseDto usersGetSubscriptionsExtendedResponseDto = (UsersGetSubscriptionsExtendedResponseDto) obj;
        return this.count == usersGetSubscriptionsExtendedResponseDto.count && epx.f(this.items, usersGetSubscriptionsExtendedResponseDto.items);
    }

    public final int hashCode() {
        return this.items.hashCode() + (Integer.hashCode(this.count) * 31);
    }

    public final String toString() {
        return pn.c(this.count, "UsersGetSubscriptionsExtendedResponseDto(count=", ", items=", ")", this.items);
    }
}
