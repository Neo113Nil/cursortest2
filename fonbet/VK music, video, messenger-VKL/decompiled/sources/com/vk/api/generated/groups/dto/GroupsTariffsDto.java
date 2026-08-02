package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.gp;
import xsna.pmi0;
import xsna.qoy;

/* compiled from: GroupsTariffsDto.kt */
/* loaded from: classes14.dex */
public final class GroupsTariffsDto implements Parcelable {
    public static final Parcelable.Creator<GroupsTariffsDto> CREATOR = new a();

    @pmi0("buyer_user_id")
    private final UserId buyerUserId;

    @pmi0("is_activated")
    private final boolean isActivated;

    @pmi0("is_enabled")
    private final boolean isEnabled;

    /* compiled from: GroupsTariffsDto.kt */
    public static final class a implements Parcelable.Creator<GroupsTariffsDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsTariffsDto createFromParcel(Parcel parcel) {
            return new GroupsTariffsDto(parcel.readInt() != 0, parcel.readInt() != 0, (UserId) parcel.readParcelable(GroupsTariffsDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsTariffsDto[] newArray(int i) {
            return new GroupsTariffsDto[i];
        }
    }

    public GroupsTariffsDto(boolean z, boolean z2, UserId userId) {
        this.isEnabled = z;
        this.isActivated = z2;
        this.buyerUserId = userId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsTariffsDto)) {
            return false;
        }
        GroupsTariffsDto groupsTariffsDto = (GroupsTariffsDto) obj;
        return this.isEnabled == groupsTariffsDto.isEnabled && this.isActivated == groupsTariffsDto.isActivated && epx.f(this.buyerUserId, groupsTariffsDto.buyerUserId);
    }

    public final int hashCode() {
        return Long.hashCode(this.buyerUserId.b) + qoy.b(Boolean.hashCode(this.isEnabled) * 31, 31, this.isActivated);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupsTariffsDto(isEnabled=");
        sb.append(this.isEnabled);
        sb.append(", isActivated=");
        sb.append(this.isActivated);
        sb.append(", buyerUserId=");
        return gp.b(sb, this.buyerUserId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.isEnabled ? 1 : 0);
        parcel.writeInt(this.isActivated ? 1 : 0);
        parcel.writeParcelable(this.buyerUserId, i);
    }
}
