package com.vk.sdk.api.groups.dto;

import xsna.epx;
import xsna.pmi0;
import xsna.sq;
import xsna.tq;
import xsna.zcl;

/* compiled from: GroupsBanInfoDto.kt */
/* loaded from: classes5.dex */
public final class GroupsBanInfoDto {

    @pmi0("admin_id")
    private final Integer adminId;

    @pmi0("comment")
    private final String comment;

    @pmi0("comment_visible")
    private final Boolean commentVisible;

    @pmi0("date")
    private final Integer date;

    @pmi0("end_date")
    private final Integer endDate;

    @pmi0("is_closed")
    private final Boolean isClosed;

    @pmi0("reason")
    private final GroupsBanInfoReasonDto reason;

    public GroupsBanInfoDto() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsBanInfoDto)) {
            return false;
        }
        GroupsBanInfoDto groupsBanInfoDto = (GroupsBanInfoDto) obj;
        return epx.f(this.adminId, groupsBanInfoDto.adminId) && epx.f(this.comment, groupsBanInfoDto.comment) && epx.f(this.commentVisible, groupsBanInfoDto.commentVisible) && epx.f(this.isClosed, groupsBanInfoDto.isClosed) && epx.f(this.date, groupsBanInfoDto.date) && epx.f(this.endDate, groupsBanInfoDto.endDate) && this.reason == groupsBanInfoDto.reason;
    }

    public final int hashCode() {
        Integer num = this.adminId;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.comment;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.commentVisible;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isClosed;
        int hashCode4 = (hashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num2 = this.date;
        int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.endDate;
        int hashCode6 = (hashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        GroupsBanInfoReasonDto groupsBanInfoReasonDto = this.reason;
        return hashCode6 + (groupsBanInfoReasonDto != null ? groupsBanInfoReasonDto.hashCode() : 0);
    }

    public final String toString() {
        Integer num = this.adminId;
        String str = this.comment;
        Boolean bool = this.commentVisible;
        Boolean bool2 = this.isClosed;
        Integer num2 = this.date;
        Integer num3 = this.endDate;
        GroupsBanInfoReasonDto groupsBanInfoReasonDto = this.reason;
        StringBuilder sb = new StringBuilder("GroupsBanInfoDto(adminId=");
        sb.append(num);
        sb.append(", comment=");
        sb.append(str);
        sb.append(", commentVisible=");
        tq.i(sb, bool, ", isClosed=", bool2, ", date=");
        sq.b(sb, num2, ", endDate=", num3, ", reason=");
        sb.append(groupsBanInfoReasonDto);
        sb.append(")");
        return sb.toString();
    }

    public GroupsBanInfoDto(Integer num, String str, Boolean bool, Boolean bool2, Integer num2, Integer num3, GroupsBanInfoReasonDto groupsBanInfoReasonDto) {
        this.adminId = num;
        this.comment = str;
        this.commentVisible = bool;
        this.isClosed = bool2;
        this.date = num2;
        this.endDate = num3;
        this.reason = groupsBanInfoReasonDto;
    }

    public /* synthetic */ GroupsBanInfoDto(Integer num, String str, Boolean bool, Boolean bool2, Integer num2, Integer num3, GroupsBanInfoReasonDto groupsBanInfoReasonDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : bool2, (i & 16) != 0 ? null : num2, (i & 32) != 0 ? null : num3, (i & 64) != 0 ? null : groupsBanInfoReasonDto);
    }
}
