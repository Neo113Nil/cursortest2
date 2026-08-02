package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: GroupsAddressTimetableDto.kt */
/* loaded from: classes14.dex */
public final class GroupsAddressTimetableDto implements Parcelable {
    public static final Parcelable.Creator<GroupsAddressTimetableDto> CREATOR = new a();

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

    /* compiled from: GroupsAddressTimetableDto.kt */
    public static final class a implements Parcelable.Creator<GroupsAddressTimetableDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsAddressTimetableDto createFromParcel(Parcel parcel) {
            return new GroupsAddressTimetableDto(parcel.readInt() == 0 ? null : GroupsAddressTimetableDayDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : GroupsAddressTimetableDayDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : GroupsAddressTimetableDayDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : GroupsAddressTimetableDayDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : GroupsAddressTimetableDayDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : GroupsAddressTimetableDayDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? GroupsAddressTimetableDayDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsAddressTimetableDto[] newArray(int i) {
            return new GroupsAddressTimetableDto[i];
        }
    }

    public GroupsAddressTimetableDto() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public final GroupsAddressTimetableDayDto d() {
        return this.fri;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final GroupsAddressTimetableDayDto e() {
        return this.mon;
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

    public final GroupsAddressTimetableDayDto f() {
        return this.sat;
    }

    public final GroupsAddressTimetableDayDto g() {
        return this.sun;
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

    public final GroupsAddressTimetableDayDto i() {
        return this.thu;
    }

    public final GroupsAddressTimetableDayDto j() {
        return this.tue;
    }

    public final GroupsAddressTimetableDayDto k() {
        return this.wed;
    }

    public final String toString() {
        return "GroupsAddressTimetableDto(fri=" + this.fri + ", mon=" + this.mon + ", sat=" + this.sat + ", sun=" + this.sun + ", thu=" + this.thu + ", tue=" + this.tue + ", wed=" + this.wed + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        GroupsAddressTimetableDayDto groupsAddressTimetableDayDto = this.fri;
        if (groupsAddressTimetableDayDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsAddressTimetableDayDto.writeToParcel(parcel, i);
        }
        GroupsAddressTimetableDayDto groupsAddressTimetableDayDto2 = this.mon;
        if (groupsAddressTimetableDayDto2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsAddressTimetableDayDto2.writeToParcel(parcel, i);
        }
        GroupsAddressTimetableDayDto groupsAddressTimetableDayDto3 = this.sat;
        if (groupsAddressTimetableDayDto3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsAddressTimetableDayDto3.writeToParcel(parcel, i);
        }
        GroupsAddressTimetableDayDto groupsAddressTimetableDayDto4 = this.sun;
        if (groupsAddressTimetableDayDto4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsAddressTimetableDayDto4.writeToParcel(parcel, i);
        }
        GroupsAddressTimetableDayDto groupsAddressTimetableDayDto5 = this.thu;
        if (groupsAddressTimetableDayDto5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsAddressTimetableDayDto5.writeToParcel(parcel, i);
        }
        GroupsAddressTimetableDayDto groupsAddressTimetableDayDto6 = this.tue;
        if (groupsAddressTimetableDayDto6 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsAddressTimetableDayDto6.writeToParcel(parcel, i);
        }
        GroupsAddressTimetableDayDto groupsAddressTimetableDayDto7 = this.wed;
        if (groupsAddressTimetableDayDto7 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsAddressTimetableDayDto7.writeToParcel(parcel, i);
        }
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
