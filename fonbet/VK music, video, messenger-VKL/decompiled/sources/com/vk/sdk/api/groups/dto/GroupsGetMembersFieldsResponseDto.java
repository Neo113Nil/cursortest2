package com.vk.sdk.api.groups.dto;

import java.util.List;
import xsna.epx;
import xsna.fw3;
import xsna.i5s;
import xsna.pmi0;
import xsna.zcl;
import xsna.zn;

/* compiled from: GroupsGetMembersFieldsResponseDto.kt */
/* loaded from: classes5.dex */
public final class GroupsGetMembersFieldsResponseDto {

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<GroupsUserXtrRoleDto> items;

    @pmi0("next_from")
    private final String nextFrom;

    public GroupsGetMembersFieldsResponseDto(int i, List<GroupsUserXtrRoleDto> list, String str) {
        this.count = i;
        this.items = list;
        this.nextFrom = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsGetMembersFieldsResponseDto)) {
            return false;
        }
        GroupsGetMembersFieldsResponseDto groupsGetMembersFieldsResponseDto = (GroupsGetMembersFieldsResponseDto) obj;
        return this.count == groupsGetMembersFieldsResponseDto.count && epx.f(this.items, groupsGetMembersFieldsResponseDto.items) && epx.f(this.nextFrom, groupsGetMembersFieldsResponseDto.nextFrom);
    }

    public final int hashCode() {
        int a = fw3.a(Integer.hashCode(this.count) * 31, 31, this.items);
        String str = this.nextFrom;
        return a + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        int i = this.count;
        List<GroupsUserXtrRoleDto> list = this.items;
        return i5s.a(zn.c(i, "GroupsGetMembersFieldsResponseDto(count=", ", items=", ", nextFrom=", list), this.nextFrom, ")");
    }

    public /* synthetic */ GroupsGetMembersFieldsResponseDto(int i, List list, String str, int i2, zcl zclVar) {
        this(i, list, (i2 & 4) != 0 ? null : str);
    }
}
