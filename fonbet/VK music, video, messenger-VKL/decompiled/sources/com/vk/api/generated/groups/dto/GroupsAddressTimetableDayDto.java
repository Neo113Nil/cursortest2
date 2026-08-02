package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.shy;
import xsna.uqi;
import xsna.zcl;

/* compiled from: GroupsAddressTimetableDayDto.kt */
/* loaded from: classes14.dex */
public final class GroupsAddressTimetableDayDto implements Parcelable {
    public static final Parcelable.Creator<GroupsAddressTimetableDayDto> CREATOR = new a();

    @pmi0("break_close_time")
    private final Integer breakCloseTime;

    @pmi0("break_open_time")
    private final Integer breakOpenTime;

    @pmi0("close_time")
    private final int closeTime;

    @pmi0("open_time")
    private final int openTime;

    /* compiled from: GroupsAddressTimetableDayDto.kt */
    public static final class a implements Parcelable.Creator<GroupsAddressTimetableDayDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsAddressTimetableDayDto createFromParcel(Parcel parcel) {
            return new GroupsAddressTimetableDayDto(parcel.readInt(), parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsAddressTimetableDayDto[] newArray(int i) {
            return new GroupsAddressTimetableDayDto[i];
        }
    }

    public GroupsAddressTimetableDayDto(int i, int i2, Integer num, Integer num2) {
        this.closeTime = i;
        this.openTime = i2;
        this.breakCloseTime = num;
        this.breakOpenTime = num2;
    }

    public final Integer d() {
        return this.breakCloseTime;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Integer e() {
        return this.breakOpenTime;
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

    public final int f() {
        return this.closeTime;
    }

    public final int g() {
        return this.openTime;
    }

    public final int hashCode() {
        int a2 = shy.a(this.openTime, Integer.hashCode(this.closeTime) * 31, 31);
        Integer num = this.breakCloseTime;
        int hashCode = (a2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.breakOpenTime;
        return hashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupsAddressTimetableDayDto(closeTime=");
        sb.append(this.closeTime);
        sb.append(", openTime=");
        sb.append(this.openTime);
        sb.append(", breakCloseTime=");
        sb.append(this.breakCloseTime);
        sb.append(", breakOpenTime=");
        return uqi.b(sb, this.breakOpenTime, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.closeTime);
        parcel.writeInt(this.openTime);
        Integer num = this.breakCloseTime;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.breakOpenTime;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
    }

    public /* synthetic */ GroupsAddressTimetableDayDto(int i, int i2, Integer num, Integer num2, int i3, zcl zclVar) {
        this(i, i2, (i3 & 4) != 0 ? null : num, (i3 & 8) != 0 ? null : num2);
    }
}
