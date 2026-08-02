package com.vk.sdk.api.bugtracker.dto;

import com.vk.dto.common.id.UserId;
import com.vk.sdk.api.users.dto.UsersUserFullDto;
import java.util.List;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: BugtrackerGetCompanyGroupMembersResponseDto.kt */
/* loaded from: classes5.dex */
public final class BugtrackerGetCompanyGroupMembersResponseDto {

    @pmi0("profiles")
    private final List<UsersUserFullDto> profiles;

    @pmi0("user_ids")
    private final List<UserId> userIds;

    public BugtrackerGetCompanyGroupMembersResponseDto(List<UserId> list, List<UsersUserFullDto> list2) {
        this.userIds = list;
        this.profiles = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BugtrackerGetCompanyGroupMembersResponseDto)) {
            return false;
        }
        BugtrackerGetCompanyGroupMembersResponseDto bugtrackerGetCompanyGroupMembersResponseDto = (BugtrackerGetCompanyGroupMembersResponseDto) obj;
        return epx.f(this.userIds, bugtrackerGetCompanyGroupMembersResponseDto.userIds) && epx.f(this.profiles, bugtrackerGetCompanyGroupMembersResponseDto.profiles);
    }

    public final int hashCode() {
        int hashCode = this.userIds.hashCode() * 31;
        List<UsersUserFullDto> list = this.profiles;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "BugtrackerGetCompanyGroupMembersResponseDto(userIds=" + this.userIds + ", profiles=" + this.profiles + ")";
    }

    public /* synthetic */ BugtrackerGetCompanyGroupMembersResponseDto(List list, List list2, int i, zcl zclVar) {
        this(list, (i & 2) != 0 ? null : list2);
    }
}
