package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.zcl;

/* compiled from: GroupsLoginConfirmationStatusDto.kt */
/* loaded from: classes14.dex */
public final class GroupsLoginConfirmationStatusDto implements Parcelable {
    public static final Parcelable.Creator<GroupsLoginConfirmationStatusDto> CREATOR = new a();

    @pmi0("can_change")
    private final Boolean canChange;

    @pmi0("is_enabled")
    private final Boolean isEnabled;

    /* compiled from: GroupsLoginConfirmationStatusDto.kt */
    public static final class a implements Parcelable.Creator<GroupsLoginConfirmationStatusDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsLoginConfirmationStatusDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean bool = null;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new GroupsLoginConfirmationStatusDto(valueOf, bool);
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsLoginConfirmationStatusDto[] newArray(int i) {
            return new GroupsLoginConfirmationStatusDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GroupsLoginConfirmationStatusDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsLoginConfirmationStatusDto)) {
            return false;
        }
        GroupsLoginConfirmationStatusDto groupsLoginConfirmationStatusDto = (GroupsLoginConfirmationStatusDto) obj;
        return epx.f(this.canChange, groupsLoginConfirmationStatusDto.canChange) && epx.f(this.isEnabled, groupsLoginConfirmationStatusDto.isEnabled);
    }

    public final int hashCode() {
        Boolean bool = this.canChange;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.isEnabled;
        return hashCode + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupsLoginConfirmationStatusDto(canChange=");
        sb.append(this.canChange);
        sb.append(", isEnabled=");
        return tn.a(sb, this.isEnabled, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Boolean bool = this.canChange;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.isEnabled;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
    }

    public GroupsLoginConfirmationStatusDto(Boolean bool, Boolean bool2) {
        this.canChange = bool;
        this.isEnabled = bool2;
    }

    public /* synthetic */ GroupsLoginConfirmationStatusDto(Boolean bool, Boolean bool2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2);
    }
}
