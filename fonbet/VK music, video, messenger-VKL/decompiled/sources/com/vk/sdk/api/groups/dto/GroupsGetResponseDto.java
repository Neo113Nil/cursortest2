package com.vk.sdk.api.groups.dto;

import com.vk.dto.common.id.UserId;
import java.util.List;
import xsna.epx;
import xsna.pmi0;
import xsna.pn;

/* compiled from: GroupsGetResponseDto.kt */
/* loaded from: classes5.dex */
public final class GroupsGetResponseDto {

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<UserId> items;

    public GroupsGetResponseDto(int i, List<UserId> list) {
        this.count = i;
        this.items = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsGetResponseDto)) {
            return false;
        }
        GroupsGetResponseDto groupsGetResponseDto = (GroupsGetResponseDto) obj;
        return this.count == groupsGetResponseDto.count && epx.f(this.items, groupsGetResponseDto.items);
    }

    public final int hashCode() {
        return this.items.hashCode() + (Integer.hashCode(this.count) * 31);
    }

    public final String toString() {
        return pn.c(this.count, "GroupsGetResponseDto(count=", ", items=", ")", this.items);
    }
}
