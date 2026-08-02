package com.vk.sdk.api.groups.dto;

import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: GroupsOnlineStatusDto.kt */
/* loaded from: classes5.dex */
public final class GroupsOnlineStatusDto {

    @pmi0("minutes")
    private final Integer minutes;

    @pmi0("status")
    private final GroupsOnlineStatusTypeDto status;

    public GroupsOnlineStatusDto(GroupsOnlineStatusTypeDto groupsOnlineStatusTypeDto, Integer num) {
        this.status = groupsOnlineStatusTypeDto;
        this.minutes = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsOnlineStatusDto)) {
            return false;
        }
        GroupsOnlineStatusDto groupsOnlineStatusDto = (GroupsOnlineStatusDto) obj;
        return this.status == groupsOnlineStatusDto.status && epx.f(this.minutes, groupsOnlineStatusDto.minutes);
    }

    public final int hashCode() {
        int hashCode = this.status.hashCode() * 31;
        Integer num = this.minutes;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "GroupsOnlineStatusDto(status=" + this.status + ", minutes=" + this.minutes + ")";
    }

    public /* synthetic */ GroupsOnlineStatusDto(GroupsOnlineStatusTypeDto groupsOnlineStatusTypeDto, Integer num, int i, zcl zclVar) {
        this(groupsOnlineStatusTypeDto, (i & 2) != 0 ? null : num);
    }
}
