package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: GroupsTabSpecialValuesDto.kt */
/* loaded from: classes14.dex */
public final class GroupsTabSpecialValuesDto implements Parcelable {
    public static final Parcelable.Creator<GroupsTabSpecialValuesDto> CREATOR = new a();

    @pmi0("co_owner_invitations_count")
    private final Integer coOwnerInvitationsCount;

    /* compiled from: GroupsTabSpecialValuesDto.kt */
    public static final class a implements Parcelable.Creator<GroupsTabSpecialValuesDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsTabSpecialValuesDto createFromParcel(Parcel parcel) {
            return new GroupsTabSpecialValuesDto(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsTabSpecialValuesDto[] newArray(int i) {
            return new GroupsTabSpecialValuesDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GroupsTabSpecialValuesDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final Integer d() {
        return this.coOwnerInvitationsCount;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GroupsTabSpecialValuesDto) && epx.f(this.coOwnerInvitationsCount, ((GroupsTabSpecialValuesDto) obj).coOwnerInvitationsCount);
    }

    public final int hashCode() {
        Integer num = this.coOwnerInvitationsCount;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        return uqi.b(new StringBuilder("GroupsTabSpecialValuesDto(coOwnerInvitationsCount="), this.coOwnerInvitationsCount, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.coOwnerInvitationsCount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public GroupsTabSpecialValuesDto(Integer num) {
        this.coOwnerInvitationsCount = num;
    }

    public /* synthetic */ GroupsTabSpecialValuesDto(Integer num, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num);
    }
}
