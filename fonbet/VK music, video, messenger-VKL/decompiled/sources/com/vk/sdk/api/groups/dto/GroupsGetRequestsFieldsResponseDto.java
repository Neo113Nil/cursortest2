package com.vk.sdk.api.groups.dto;

import com.vk.sdk.api.users.dto.UsersUserFullDto;
import java.util.List;
import xsna.epx;
import xsna.pmi0;
import xsna.pn;

/* compiled from: GroupsGetRequestsFieldsResponseDto.kt */
/* loaded from: classes5.dex */
public final class GroupsGetRequestsFieldsResponseDto {

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<UsersUserFullDto> items;

    public GroupsGetRequestsFieldsResponseDto(int i, List<UsersUserFullDto> list) {
        this.count = i;
        this.items = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsGetRequestsFieldsResponseDto)) {
            return false;
        }
        GroupsGetRequestsFieldsResponseDto groupsGetRequestsFieldsResponseDto = (GroupsGetRequestsFieldsResponseDto) obj;
        return this.count == groupsGetRequestsFieldsResponseDto.count && epx.f(this.items, groupsGetRequestsFieldsResponseDto.items);
    }

    public final int hashCode() {
        return this.items.hashCode() + (Integer.hashCode(this.count) * 31);
    }

    public final String toString() {
        return pn.c(this.count, "GroupsGetRequestsFieldsResponseDto(count=", ", items=", ")", this.items);
    }
}
