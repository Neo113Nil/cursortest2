package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.zcl;

/* compiled from: GroupsVkAdminStatusDto.kt */
/* loaded from: classes14.dex */
public final class GroupsVkAdminStatusDto implements Parcelable {
    public static final Parcelable.Creator<GroupsVkAdminStatusDto> CREATOR = new a();

    @pmi0("can_see_banner")
    private final boolean canSeeBanner;

    @pmi0("is_installed")
    private final Boolean isInstalled;

    /* compiled from: GroupsVkAdminStatusDto.kt */
    public static final class a implements Parcelable.Creator<GroupsVkAdminStatusDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsVkAdminStatusDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            boolean z = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new GroupsVkAdminStatusDto(z, valueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsVkAdminStatusDto[] newArray(int i) {
            return new GroupsVkAdminStatusDto[i];
        }
    }

    public GroupsVkAdminStatusDto(boolean z, Boolean bool) {
        this.canSeeBanner = z;
        this.isInstalled = bool;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsVkAdminStatusDto)) {
            return false;
        }
        GroupsVkAdminStatusDto groupsVkAdminStatusDto = (GroupsVkAdminStatusDto) obj;
        return this.canSeeBanner == groupsVkAdminStatusDto.canSeeBanner && epx.f(this.isInstalled, groupsVkAdminStatusDto.isInstalled);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.canSeeBanner) * 31;
        Boolean bool = this.isInstalled;
        return hashCode + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupsVkAdminStatusDto(canSeeBanner=");
        sb.append(this.canSeeBanner);
        sb.append(", isInstalled=");
        return tn.a(sb, this.isInstalled, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.canSeeBanner ? 1 : 0);
        Boolean bool = this.isInstalled;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
    }

    public /* synthetic */ GroupsVkAdminStatusDto(boolean z, Boolean bool, int i, zcl zclVar) {
        this(z, (i & 2) != 0 ? null : bool);
    }
}
