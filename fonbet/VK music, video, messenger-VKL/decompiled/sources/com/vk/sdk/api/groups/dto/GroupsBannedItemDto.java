package com.vk.sdk.api.groups.dto;

import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.sdk.api.users.dto.UsersUserDto;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: GroupsBannedItemDto.kt */
/* loaded from: classes5.dex */
public final class GroupsBannedItemDto {

    @pmi0("ban_info")
    private final GroupsBanInfoDto banInfo;

    @pmi0("group")
    private final GroupsGroupDto group;

    @pmi0(CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE)
    private final UsersUserDto profile;

    @pmi0("type")
    private final GroupsOwnerXtrBanInfoTypeDto type;

    public GroupsBannedItemDto() {
        this(null, null, null, null, 15, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsBannedItemDto)) {
            return false;
        }
        GroupsBannedItemDto groupsBannedItemDto = (GroupsBannedItemDto) obj;
        return epx.f(this.banInfo, groupsBannedItemDto.banInfo) && epx.f(this.group, groupsBannedItemDto.group) && epx.f(this.profile, groupsBannedItemDto.profile) && this.type == groupsBannedItemDto.type;
    }

    public final int hashCode() {
        GroupsBanInfoDto groupsBanInfoDto = this.banInfo;
        int hashCode = (groupsBanInfoDto == null ? 0 : groupsBanInfoDto.hashCode()) * 31;
        GroupsGroupDto groupsGroupDto = this.group;
        int hashCode2 = (hashCode + (groupsGroupDto == null ? 0 : groupsGroupDto.hashCode())) * 31;
        UsersUserDto usersUserDto = this.profile;
        int hashCode3 = (hashCode2 + (usersUserDto == null ? 0 : usersUserDto.hashCode())) * 31;
        GroupsOwnerXtrBanInfoTypeDto groupsOwnerXtrBanInfoTypeDto = this.type;
        return hashCode3 + (groupsOwnerXtrBanInfoTypeDto != null ? groupsOwnerXtrBanInfoTypeDto.hashCode() : 0);
    }

    public final String toString() {
        return "GroupsBannedItemDto(banInfo=" + this.banInfo + ", group=" + this.group + ", profile=" + this.profile + ", type=" + this.type + ")";
    }

    public GroupsBannedItemDto(GroupsBanInfoDto groupsBanInfoDto, GroupsGroupDto groupsGroupDto, UsersUserDto usersUserDto, GroupsOwnerXtrBanInfoTypeDto groupsOwnerXtrBanInfoTypeDto) {
        this.banInfo = groupsBanInfoDto;
        this.group = groupsGroupDto;
        this.profile = usersUserDto;
        this.type = groupsOwnerXtrBanInfoTypeDto;
    }

    public /* synthetic */ GroupsBannedItemDto(GroupsBanInfoDto groupsBanInfoDto, GroupsGroupDto groupsGroupDto, UsersUserDto usersUserDto, GroupsOwnerXtrBanInfoTypeDto groupsOwnerXtrBanInfoTypeDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : groupsBanInfoDto, (i & 2) != 0 ? null : groupsGroupDto, (i & 4) != 0 ? null : usersUserDto, (i & 8) != 0 ? null : groupsOwnerXtrBanInfoTypeDto);
    }
}
