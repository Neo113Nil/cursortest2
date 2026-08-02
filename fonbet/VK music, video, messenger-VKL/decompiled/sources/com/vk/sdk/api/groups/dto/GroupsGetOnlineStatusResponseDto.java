package com.vk.sdk.api.groups.dto;

import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: GroupsGetOnlineStatusResponseDto.kt */
/* loaded from: classes5.dex */
public final class GroupsGetOnlineStatusResponseDto {

    @pmi0("minutes")
    private final Integer minutes;

    @pmi0("status")
    private final GroupsOnlineStatusTypeDto status;

    public GroupsGetOnlineStatusResponseDto(GroupsOnlineStatusTypeDto groupsOnlineStatusTypeDto, Integer num) {
        this.status = groupsOnlineStatusTypeDto;
        this.minutes = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsGetOnlineStatusResponseDto)) {
            return false;
        }
        GroupsGetOnlineStatusResponseDto groupsGetOnlineStatusResponseDto = (GroupsGetOnlineStatusResponseDto) obj;
        return this.status == groupsGetOnlineStatusResponseDto.status && epx.f(this.minutes, groupsGetOnlineStatusResponseDto.minutes);
    }

    public final int hashCode() {
        int hashCode = this.status.hashCode() * 31;
        Integer num = this.minutes;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "GroupsGetOnlineStatusResponseDto(status=" + this.status + ", minutes=" + this.minutes + ")";
    }

    public /* synthetic */ GroupsGetOnlineStatusResponseDto(GroupsOnlineStatusTypeDto groupsOnlineStatusTypeDto, Integer num, int i, zcl zclVar) {
        this(groupsOnlineStatusTypeDto, (i & 2) != 0 ? null : num);
    }
}
