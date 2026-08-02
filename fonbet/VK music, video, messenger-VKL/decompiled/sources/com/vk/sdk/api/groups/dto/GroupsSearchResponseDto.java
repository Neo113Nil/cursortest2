package com.vk.sdk.api.groups.dto;

import java.util.List;
import xsna.epx;
import xsna.pmi0;
import xsna.pn;

/* compiled from: GroupsSearchResponseDto.kt */
/* loaded from: classes5.dex */
public final class GroupsSearchResponseDto {

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<GroupsGroupFullDto> items;

    public GroupsSearchResponseDto(int i, List<GroupsGroupFullDto> list) {
        this.count = i;
        this.items = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsSearchResponseDto)) {
            return false;
        }
        GroupsSearchResponseDto groupsSearchResponseDto = (GroupsSearchResponseDto) obj;
        return this.count == groupsSearchResponseDto.count && epx.f(this.items, groupsSearchResponseDto.items);
    }

    public final int hashCode() {
        return this.items.hashCode() + (Integer.hashCode(this.count) * 31);
    }

    public final String toString() {
        return pn.c(this.count, "GroupsSearchResponseDto(count=", ", items=", ")", this.items);
    }
}
