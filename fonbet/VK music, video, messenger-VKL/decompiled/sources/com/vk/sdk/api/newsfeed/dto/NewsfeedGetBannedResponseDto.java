package com.vk.sdk.api.newsfeed.dto;

import com.vk.dto.common.id.UserId;
import java.util.List;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: NewsfeedGetBannedResponseDto.kt */
/* loaded from: classes5.dex */
public final class NewsfeedGetBannedResponseDto {

    @pmi0("groups")
    private final List<UserId> groups;

    @pmi0("members")
    private final List<UserId> members;

    /* JADX WARN: Multi-variable type inference failed */
    public NewsfeedGetBannedResponseDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsfeedGetBannedResponseDto)) {
            return false;
        }
        NewsfeedGetBannedResponseDto newsfeedGetBannedResponseDto = (NewsfeedGetBannedResponseDto) obj;
        return epx.f(this.groups, newsfeedGetBannedResponseDto.groups) && epx.f(this.members, newsfeedGetBannedResponseDto.members);
    }

    public final int hashCode() {
        List<UserId> list = this.groups;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<UserId> list2 = this.members;
        return hashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        return "NewsfeedGetBannedResponseDto(groups=" + this.groups + ", members=" + this.members + ")";
    }

    public NewsfeedGetBannedResponseDto(List<UserId> list, List<UserId> list2) {
        this.groups = list;
        this.members = list2;
    }

    public /* synthetic */ NewsfeedGetBannedResponseDto(List list, List list2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2);
    }
}
