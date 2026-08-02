package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q0;
import xsna.pmi0;

/* compiled from: GroupsTabTabletConfigDto.kt */
/* loaded from: classes14.dex */
public final class GroupsTabTabletConfigDto implements Parcelable {
    public static final Parcelable.Creator<GroupsTabTabletConfigDto> CREATOR = new a();

    @pmi0("can_add")
    private final boolean canAdd;

    @pmi0("is_shown")
    private final boolean isShown;

    /* compiled from: GroupsTabTabletConfigDto.kt */
    public static final class a implements Parcelable.Creator<GroupsTabTabletConfigDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsTabTabletConfigDto createFromParcel(Parcel parcel) {
            return new GroupsTabTabletConfigDto(parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsTabTabletConfigDto[] newArray(int i) {
            return new GroupsTabTabletConfigDto[i];
        }
    }

    public GroupsTabTabletConfigDto(boolean z, boolean z2) {
        this.isShown = z;
        this.canAdd = z2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsTabTabletConfigDto)) {
            return false;
        }
        GroupsTabTabletConfigDto groupsTabTabletConfigDto = (GroupsTabTabletConfigDto) obj;
        return this.isShown == groupsTabTabletConfigDto.isShown && this.canAdd == groupsTabTabletConfigDto.canAdd;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.canAdd) + (Boolean.hashCode(this.isShown) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupsTabTabletConfigDto(isShown=");
        sb.append(this.isShown);
        sb.append(", canAdd=");
        return q0.a(sb, this.canAdd, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.isShown ? 1 : 0);
        parcel.writeInt(this.canAdd ? 1 : 0);
    }
}
