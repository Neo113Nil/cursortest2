package com.vk.sdk.api.groups.dto;

import com.vk.movika.sdk.base.model.n;
import com.vk.sdk.api.users.dto.UsersUserMinDto;
import java.util.List;
import xsna.epx;
import xsna.fw3;
import xsna.pmi0;
import xsna.zn;

/* compiled from: GroupsGetInvitesExtendedResponseDto.kt */
/* loaded from: classes5.dex */
public final class GroupsGetInvitesExtendedResponseDto {

    @pmi0("count")
    private final int count;

    @pmi0("groups")
    private final List<GroupsGroupFullDto> groups;

    @pmi0("items")
    private final List<GroupsGroupFullDto> items;

    @pmi0("profiles")
    private final List<UsersUserMinDto> profiles;

    public GroupsGetInvitesExtendedResponseDto(int i, List<GroupsGroupFullDto> list, List<UsersUserMinDto> list2, List<GroupsGroupFullDto> list3) {
        this.count = i;
        this.items = list;
        this.profiles = list2;
        this.groups = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsGetInvitesExtendedResponseDto)) {
            return false;
        }
        GroupsGetInvitesExtendedResponseDto groupsGetInvitesExtendedResponseDto = (GroupsGetInvitesExtendedResponseDto) obj;
        return this.count == groupsGetInvitesExtendedResponseDto.count && epx.f(this.items, groupsGetInvitesExtendedResponseDto.items) && epx.f(this.profiles, groupsGetInvitesExtendedResponseDto.profiles) && epx.f(this.groups, groupsGetInvitesExtendedResponseDto.groups);
    }

    public final int hashCode() {
        return this.groups.hashCode() + fw3.a(fw3.a(Integer.hashCode(this.count) * 31, 31, this.items), 31, this.profiles);
    }

    public final String toString() {
        int i = this.count;
        List<GroupsGroupFullDto> list = this.items;
        return n.b(zn.c(i, "GroupsGetInvitesExtendedResponseDto(count=", ", items=", ", profiles=", list), this.profiles, ", groups=", this.groups, ")");
    }
}
