package com.vk.sdk.api.groups.dto;

import java.util.List;
import xsna.epx;
import xsna.pmi0;
import xsna.pn;

/* compiled from: GroupsGetAddressesResponseDto.kt */
/* loaded from: classes5.dex */
public final class GroupsGetAddressesResponseDto {

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<GroupsAddressDto> items;

    public GroupsGetAddressesResponseDto(int i, List<GroupsAddressDto> list) {
        this.count = i;
        this.items = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsGetAddressesResponseDto)) {
            return false;
        }
        GroupsGetAddressesResponseDto groupsGetAddressesResponseDto = (GroupsGetAddressesResponseDto) obj;
        return this.count == groupsGetAddressesResponseDto.count && epx.f(this.items, groupsGetAddressesResponseDto.items);
    }

    public final int hashCode() {
        return this.items.hashCode() + (Integer.hashCode(this.count) * 31);
    }

    public final String toString() {
        return pn.c(this.count, "GroupsGetAddressesResponseDto(count=", ", items=", ")", this.items);
    }
}
