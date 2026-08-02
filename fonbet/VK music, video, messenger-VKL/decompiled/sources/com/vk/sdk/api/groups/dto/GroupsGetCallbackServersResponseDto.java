package com.vk.sdk.api.groups.dto;

import java.util.List;
import xsna.epx;
import xsna.pmi0;
import xsna.pn;

/* compiled from: GroupsGetCallbackServersResponseDto.kt */
/* loaded from: classes5.dex */
public final class GroupsGetCallbackServersResponseDto {

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<GroupsCallbackServerDto> items;

    public GroupsGetCallbackServersResponseDto(int i, List<GroupsCallbackServerDto> list) {
        this.count = i;
        this.items = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsGetCallbackServersResponseDto)) {
            return false;
        }
        GroupsGetCallbackServersResponseDto groupsGetCallbackServersResponseDto = (GroupsGetCallbackServersResponseDto) obj;
        return this.count == groupsGetCallbackServersResponseDto.count && epx.f(this.items, groupsGetCallbackServersResponseDto.items);
    }

    public final int hashCode() {
        return this.items.hashCode() + (Integer.hashCode(this.count) * 31);
    }

    public final String toString() {
        return pn.c(this.count, "GroupsGetCallbackServersResponseDto(count=", ", items=", ")", this.items);
    }
}
