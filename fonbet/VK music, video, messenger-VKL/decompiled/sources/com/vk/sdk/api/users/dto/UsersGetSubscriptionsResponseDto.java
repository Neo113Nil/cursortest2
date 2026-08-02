package com.vk.sdk.api.users.dto;

import com.vk.sdk.api.groups.dto.GroupsGroupsArrayDto;
import xsna.epx;
import xsna.pmi0;

/* compiled from: UsersGetSubscriptionsResponseDto.kt */
/* loaded from: classes5.dex */
public final class UsersGetSubscriptionsResponseDto {

    @pmi0("groups")
    private final GroupsGroupsArrayDto groups;

    @pmi0("users")
    private final UsersUsersArrayDto users;

    public UsersGetSubscriptionsResponseDto(UsersUsersArrayDto usersUsersArrayDto, GroupsGroupsArrayDto groupsGroupsArrayDto) {
        this.users = usersUsersArrayDto;
        this.groups = groupsGroupsArrayDto;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UsersGetSubscriptionsResponseDto)) {
            return false;
        }
        UsersGetSubscriptionsResponseDto usersGetSubscriptionsResponseDto = (UsersGetSubscriptionsResponseDto) obj;
        return epx.f(this.users, usersGetSubscriptionsResponseDto.users) && epx.f(this.groups, usersGetSubscriptionsResponseDto.groups);
    }

    public final int hashCode() {
        return this.groups.hashCode() + (this.users.hashCode() * 31);
    }

    public final String toString() {
        return "UsersGetSubscriptionsResponseDto(users=" + this.users + ", groups=" + this.groups + ")";
    }
}
