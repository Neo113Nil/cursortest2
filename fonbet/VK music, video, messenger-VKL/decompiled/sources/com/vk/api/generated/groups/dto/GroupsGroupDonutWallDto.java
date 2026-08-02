package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.sn;
import xsna.zcl;

/* compiled from: GroupsGroupDonutWallDto.kt */
/* loaded from: classes14.dex */
public final class GroupsGroupDonutWallDto implements Parcelable {
    public static final Parcelable.Creator<GroupsGroupDonutWallDto> CREATOR = new a();

    @pmi0("available")
    private final Boolean available;

    @pmi0("is_enabled")
    private final boolean isEnabled;

    @pmi0("widget")
    private final GroupsGroupDonutWallWidgetDto widget;

    /* compiled from: GroupsGroupDonutWallDto.kt */
    public static final class a implements Parcelable.Creator<GroupsGroupDonutWallDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsGroupDonutWallDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            boolean z = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new GroupsGroupDonutWallDto(z, valueOf, parcel.readInt() != 0 ? GroupsGroupDonutWallWidgetDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsGroupDonutWallDto[] newArray(int i) {
            return new GroupsGroupDonutWallDto[i];
        }
    }

    public GroupsGroupDonutWallDto(boolean z, Boolean bool, GroupsGroupDonutWallWidgetDto groupsGroupDonutWallWidgetDto) {
        this.isEnabled = z;
        this.available = bool;
        this.widget = groupsGroupDonutWallWidgetDto;
    }

    public final Boolean d() {
        return this.available;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final GroupsGroupDonutWallWidgetDto e() {
        return this.widget;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsGroupDonutWallDto)) {
            return false;
        }
        GroupsGroupDonutWallDto groupsGroupDonutWallDto = (GroupsGroupDonutWallDto) obj;
        return this.isEnabled == groupsGroupDonutWallDto.isEnabled && epx.f(this.available, groupsGroupDonutWallDto.available) && epx.f(this.widget, groupsGroupDonutWallDto.widget);
    }

    public final boolean f() {
        return this.isEnabled;
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.isEnabled) * 31;
        Boolean bool = this.available;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        GroupsGroupDonutWallWidgetDto groupsGroupDonutWallWidgetDto = this.widget;
        return hashCode2 + (groupsGroupDonutWallWidgetDto != null ? groupsGroupDonutWallWidgetDto.hashCode() : 0);
    }

    public final String toString() {
        return "GroupsGroupDonutWallDto(isEnabled=" + this.isEnabled + ", available=" + this.available + ", widget=" + this.widget + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.isEnabled ? 1 : 0);
        Boolean bool = this.available;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        GroupsGroupDonutWallWidgetDto groupsGroupDonutWallWidgetDto = this.widget;
        if (groupsGroupDonutWallWidgetDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsGroupDonutWallWidgetDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ GroupsGroupDonutWallDto(boolean z, Boolean bool, GroupsGroupDonutWallWidgetDto groupsGroupDonutWallWidgetDto, int i, zcl zclVar) {
        this(z, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : groupsGroupDonutWallWidgetDto);
    }
}
