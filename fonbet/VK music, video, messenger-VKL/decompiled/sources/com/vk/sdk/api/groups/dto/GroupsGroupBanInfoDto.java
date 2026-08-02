package com.vk.sdk.api.groups.dto;

import xsna.epx;
import xsna.jq;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: GroupsGroupBanInfoDto.kt */
/* loaded from: classes5.dex */
public final class GroupsGroupBanInfoDto {

    @pmi0("comment")
    private final String comment;

    @pmi0("end_date")
    private final Integer endDate;

    @pmi0("reason")
    private final GroupsBanInfoReasonDto reason;

    public GroupsGroupBanInfoDto() {
        this(null, null, null, 7, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsGroupBanInfoDto)) {
            return false;
        }
        GroupsGroupBanInfoDto groupsGroupBanInfoDto = (GroupsGroupBanInfoDto) obj;
        return epx.f(this.comment, groupsGroupBanInfoDto.comment) && epx.f(this.endDate, groupsGroupBanInfoDto.endDate) && this.reason == groupsGroupBanInfoDto.reason;
    }

    public final int hashCode() {
        String str = this.comment;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.endDate;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        GroupsBanInfoReasonDto groupsBanInfoReasonDto = this.reason;
        return hashCode2 + (groupsBanInfoReasonDto != null ? groupsBanInfoReasonDto.hashCode() : 0);
    }

    public final String toString() {
        String str = this.comment;
        Integer num = this.endDate;
        GroupsBanInfoReasonDto groupsBanInfoReasonDto = this.reason;
        StringBuilder d = jq.d(num, "GroupsGroupBanInfoDto(comment=", str, ", endDate=", ", reason=");
        d.append(groupsBanInfoReasonDto);
        d.append(")");
        return d.toString();
    }

    public GroupsGroupBanInfoDto(String str, Integer num, GroupsBanInfoReasonDto groupsBanInfoReasonDto) {
        this.comment = str;
        this.endDate = num;
        this.reason = groupsBanInfoReasonDto;
    }

    public /* synthetic */ GroupsGroupBanInfoDto(String str, Integer num, GroupsBanInfoReasonDto groupsBanInfoReasonDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : groupsBanInfoReasonDto);
    }
}
