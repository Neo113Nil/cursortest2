package com.vk.sdk.api.groups.dto;

import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: GroupsAddressTimetableDto.kt */
/* loaded from: classes5.dex */
public final class GroupsAddressTimetableDto {

    @pmi0("fri")
    private final GroupsAddressTimetableDayDto fri;

    @pmi0("mon")
    private final GroupsAddressTimetableDayDto mon;

    @pmi0("sat")
    private final GroupsAddressTimetableDayDto sat;

    @pmi0("sun")
    private final GroupsAddressTimetableDayDto sun;

    @pmi0("thu")
    private final GroupsAddressTimetableDayDto thu;

    @pmi0("tue")
    private final GroupsAddressTimetableDayDto tue;

    @pmi0("wed")
    private final GroupsAddressTimetableDayDto wed;

    public GroupsAddressTimetableDto() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsAddressTimetableDto)) {
            return false;
        }
        GroupsAddressTimetableDto groupsAddressTimetableDto = (GroupsAddressTimetableDto) obj;
        return epx.f(this.fri, groupsAddressTimetableDto.fri) && epx.f(this.mon, groupsAddressTimetableDto.mon) && epx.f(this.sat, groupsAddressTimetableDto.sat) && epx.f(this.sun, groupsAddressTimetableDto.sun) && epx.f(this.thu, groupsAddressTimetableDto.thu) && epx.f(this.tue, groupsAddressTimetableDto.tue) && epx.f(this.wed, groupsAddressTimetableDto.wed);
    }

    public final int hashCode() {
        GroupsAddressTimetableDayDto groupsAddressTimetableDayDto = this.fri;
        int hashCode = (groupsAddressTimetableDayDto == null ? 0 : groupsAddressTimetableDayDto.hashCode()) * 31;
        GroupsAddressTimetableDayDto groupsAddressTimetableDayDto2 = this.mon;
        int hashCode2 = (hashCode + (groupsAddressTimetableDayDto2 == null ? 0 : groupsAddressTimetableDayDto2.hashCode())) * 31;
        GroupsAddressTimetableDayDto groupsAddressTimetableDayDto3 = this.sat;
        int hashCode3 = (hashCode2 + (groupsAddressTimetableDayDto3 == null ? 0 : groupsAddressTimetableDayDto3.hashCode())) * 31;
        GroupsAddressTimetableDayDto groupsAddressTimetableDayDto4 = this.sun;
        int hashCode4 = (hashCode3 + (groupsAddressTimetableDayDto4 == null ? 0 : groupsAddressTimetableDayDto4.hashCode())) * 31;
        GroupsAddressTimetableDayDto groupsAddressTimetableDayDto5 = this.thu;
        int hashCode5 = (hashCode4 + (groupsAddressTimetableDayDto5 == null ? 0 : groupsAddressTimetableDayDto5.hashCode())) * 31;
        GroupsAddressTimetableDayDto groupsAddressTimetableDayDto6 = this.tue;
        int hashCode6 = (hashCode5 + (groupsAddressTimetableDayDto6 == null ? 0 : groupsAddressTimetableDayDto6.hashCode())) * 31;
        GroupsAddressTimetableDayDto groupsAddressTimetableDayDto7 = this.wed;
        return hashCode6 + (groupsAddressTimetableDayDto7 != null ? groupsAddressTimetableDayDto7.hashCode() : 0);
    }

    public final String toString() {
        return "GroupsAddressTimetableDto(fri=" + this.fri + ", mon=" + this.mon + ", sat=" + this.sat + ", sun=" + this.sun + ", thu=" + this.thu + ", tue=" + this.tue + ", wed=" + this.wed + ")";
    }

    public GroupsAddressTimetableDto(GroupsAddressTimetableDayDto groupsAddressTimetableDayDto, GroupsAddressTimetableDayDto groupsAddressTimetableDayDto2, GroupsAddressTimetableDayDto groupsAddressTimetableDayDto3, GroupsAddressTimetableDayDto groupsAddressTimetableDayDto4, GroupsAddressTimetableDayDto groupsAddressTimetableDayDto5, GroupsAddressTimetableDayDto groupsAddressTimetableDayDto6, GroupsAddressTimetableDayDto groupsAddressTimetableDayDto7) {
        this.fri = groupsAddressTimetableDayDto;
        this.mon = groupsAddressTimetableDayDto2;
        this.sat = groupsAddressTimetableDayDto3;
        this.sun = groupsAddressTimetableDayDto4;
        this.thu = groupsAddressTimetableDayDto5;
        this.tue = groupsAddressTimetableDayDto6;
        this.wed = groupsAddressTimetableDayDto7;
    }

    public /* synthetic */ GroupsAddressTimetableDto(GroupsAddressTimetableDayDto groupsAddressTimetableDayDto, GroupsAddressTimetableDayDto groupsAddressTimetableDayDto2, GroupsAddressTimetableDayDto groupsAddressTimetableDayDto3, GroupsAddressTimetableDayDto groupsAddressTimetableDayDto4, GroupsAddressTimetableDayDto groupsAddressTimetableDayDto5, GroupsAddressTimetableDayDto groupsAddressTimetableDayDto6, GroupsAddressTimetableDayDto groupsAddressTimetableDayDto7, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : groupsAddressTimetableDayDto, (i & 2) != 0 ? null : groupsAddressTimetableDayDto2, (i & 4) != 0 ? null : groupsAddressTimetableDayDto3, (i & 8) != 0 ? null : groupsAddressTimetableDayDto4, (i & 16) != 0 ? null : groupsAddressTimetableDayDto5, (i & 32) != 0 ? null : groupsAddressTimetableDayDto6, (i & 64) != 0 ? null : groupsAddressTimetableDayDto7);
    }
}
