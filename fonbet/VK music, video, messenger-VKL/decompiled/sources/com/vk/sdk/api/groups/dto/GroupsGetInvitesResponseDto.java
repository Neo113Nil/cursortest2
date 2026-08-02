package com.vk.sdk.api.groups.dto;

import java.util.List;
import xsna.epx;
import xsna.pmi0;
import xsna.pn;

/* compiled from: GroupsGetInvitesResponseDto.kt */
/* loaded from: classes5.dex */
public final class GroupsGetInvitesResponseDto {

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<GroupsGroupFullDto> items;

    public GroupsGetInvitesResponseDto(int i, List<GroupsGroupFullDto> list) {
        this.count = i;
        this.items = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsGetInvitesResponseDto)) {
            return false;
        }
        GroupsGetInvitesResponseDto groupsGetInvitesResponseDto = (GroupsGetInvitesResponseDto) obj;
        return this.count == groupsGetInvitesResponseDto.count && epx.f(this.items, groupsGetInvitesResponseDto.items);
    }

    public final int hashCode() {
        return this.items.hashCode() + (Integer.hashCode(this.count) * 31);
    }

    public final String toString() {
        return pn.c(this.count, "GroupsGetInvitesResponseDto(count=", ", items=", ")", this.items);
    }
}
