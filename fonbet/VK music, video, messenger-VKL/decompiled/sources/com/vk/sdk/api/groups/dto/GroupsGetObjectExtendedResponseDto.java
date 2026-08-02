package com.vk.sdk.api.groups.dto;

import java.util.List;
import xsna.epx;
import xsna.pmi0;
import xsna.pn;

/* compiled from: GroupsGetObjectExtendedResponseDto.kt */
/* loaded from: classes5.dex */
public final class GroupsGetObjectExtendedResponseDto {

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<GroupsGroupFullDto> items;

    public GroupsGetObjectExtendedResponseDto(int i, List<GroupsGroupFullDto> list) {
        this.count = i;
        this.items = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsGetObjectExtendedResponseDto)) {
            return false;
        }
        GroupsGetObjectExtendedResponseDto groupsGetObjectExtendedResponseDto = (GroupsGetObjectExtendedResponseDto) obj;
        return this.count == groupsGetObjectExtendedResponseDto.count && epx.f(this.items, groupsGetObjectExtendedResponseDto.items);
    }

    public final int hashCode() {
        return this.items.hashCode() + (Integer.hashCode(this.count) * 31);
    }

    public final String toString() {
        return pn.c(this.count, "GroupsGetObjectExtendedResponseDto(count=", ", items=", ")", this.items);
    }
}
