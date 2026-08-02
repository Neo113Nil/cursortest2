package com.vk.sdk.api.groups.dto;

import xsna.epx;
import xsna.odj;
import xsna.pmi0;
import xsna.shy;
import xsna.zcl;

/* compiled from: GroupsAddressTimetableDayDto.kt */
/* loaded from: classes5.dex */
public final class GroupsAddressTimetableDayDto {

    @pmi0("break_close_time")
    private final Integer breakCloseTime;

    @pmi0("break_open_time")
    private final Integer breakOpenTime;

    @pmi0("close_time")
    private final int closeTime;

    @pmi0("open_time")
    private final int openTime;

    public GroupsAddressTimetableDayDto(int i, int i2, Integer num, Integer num2) {
        this.closeTime = i;
        this.openTime = i2;
        this.breakCloseTime = num;
        this.breakOpenTime = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsAddressTimetableDayDto)) {
            return false;
        }
        GroupsAddressTimetableDayDto groupsAddressTimetableDayDto = (GroupsAddressTimetableDayDto) obj;
        return this.closeTime == groupsAddressTimetableDayDto.closeTime && this.openTime == groupsAddressTimetableDayDto.openTime && epx.f(this.breakCloseTime, groupsAddressTimetableDayDto.breakCloseTime) && epx.f(this.breakOpenTime, groupsAddressTimetableDayDto.breakOpenTime);
    }

    public final int hashCode() {
        int a = shy.a(this.openTime, Integer.hashCode(this.closeTime) * 31, 31);
        Integer num = this.breakCloseTime;
        int hashCode = (a + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.breakOpenTime;
        return hashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        int i = this.closeTime;
        int i2 = this.openTime;
        Integer num = this.breakCloseTime;
        Integer num2 = this.breakOpenTime;
        StringBuilder a = odj.a(i, i2, "GroupsAddressTimetableDayDto(closeTime=", ", openTime=", ", breakCloseTime=");
        a.append(num);
        a.append(", breakOpenTime=");
        a.append(num2);
        a.append(")");
        return a.toString();
    }

    public /* synthetic */ GroupsAddressTimetableDayDto(int i, int i2, Integer num, Integer num2, int i3, zcl zclVar) {
        this(i, i2, (i3 & 4) != 0 ? null : num, (i3 & 8) != 0 ? null : num2);
    }
}
