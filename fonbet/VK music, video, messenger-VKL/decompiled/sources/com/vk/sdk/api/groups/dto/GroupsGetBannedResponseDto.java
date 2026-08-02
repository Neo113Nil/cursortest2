package com.vk.sdk.api.groups.dto;

import java.util.List;
import xsna.epx;
import xsna.pmi0;
import xsna.pn;

/* compiled from: GroupsGetBannedResponseDto.kt */
/* loaded from: classes5.dex */
public final class GroupsGetBannedResponseDto {

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<GroupsBannedItemDto> items;

    public GroupsGetBannedResponseDto(int i, List<GroupsBannedItemDto> list) {
        this.count = i;
        this.items = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsGetBannedResponseDto)) {
            return false;
        }
        GroupsGetBannedResponseDto groupsGetBannedResponseDto = (GroupsGetBannedResponseDto) obj;
        return this.count == groupsGetBannedResponseDto.count && epx.f(this.items, groupsGetBannedResponseDto.items);
    }

    public final int hashCode() {
        return this.items.hashCode() + (Integer.hashCode(this.count) * 31);
    }

    public final String toString() {
        return pn.c(this.count, "GroupsGetBannedResponseDto(count=", ", items=", ")", this.items);
    }
}
