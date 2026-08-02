package com.vk.sdk.api.groups.dto;

import com.vk.dto.common.id.UserId;
import java.util.List;
import xsna.epx;
import xsna.pmi0;
import xsna.pn;

/* compiled from: GroupsGroupsArrayDto.kt */
/* loaded from: classes5.dex */
public final class GroupsGroupsArrayDto {

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<UserId> items;

    public GroupsGroupsArrayDto(int i, List<UserId> list) {
        this.count = i;
        this.items = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsGroupsArrayDto)) {
            return false;
        }
        GroupsGroupsArrayDto groupsGroupsArrayDto = (GroupsGroupsArrayDto) obj;
        return this.count == groupsGroupsArrayDto.count && epx.f(this.items, groupsGroupsArrayDto.items);
    }

    public final int hashCode() {
        return this.items.hashCode() + (Integer.hashCode(this.count) * 31);
    }

    public final String toString() {
        return pn.c(this.count, "GroupsGroupsArrayDto(count=", ", items=", ")", this.items);
    }
}
