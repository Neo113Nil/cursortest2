package com.vk.sdk.api.bugtracker.dto;

import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.pmi0;

/* compiled from: BugtrackerAddCompanyGroupsMembersErrorDto.kt */
/* loaded from: classes5.dex */
public final class BugtrackerAddCompanyGroupsMembersErrorDto {

    @pmi0("group_id")
    private final UserId groupId;

    @pmi0("user_id")
    private final UserId userId;

    public BugtrackerAddCompanyGroupsMembersErrorDto(UserId userId, UserId userId2) {
        this.groupId = userId;
        this.userId = userId2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BugtrackerAddCompanyGroupsMembersErrorDto)) {
            return false;
        }
        BugtrackerAddCompanyGroupsMembersErrorDto bugtrackerAddCompanyGroupsMembersErrorDto = (BugtrackerAddCompanyGroupsMembersErrorDto) obj;
        return epx.f(this.groupId, bugtrackerAddCompanyGroupsMembersErrorDto.groupId) && epx.f(this.userId, bugtrackerAddCompanyGroupsMembersErrorDto.userId);
    }

    public final int hashCode() {
        return Long.hashCode(this.userId.b) + (Long.hashCode(this.groupId.b) * 31);
    }

    public final String toString() {
        return "BugtrackerAddCompanyGroupsMembersErrorDto(groupId=" + this.groupId + ", userId=" + this.userId + ")";
    }
}
