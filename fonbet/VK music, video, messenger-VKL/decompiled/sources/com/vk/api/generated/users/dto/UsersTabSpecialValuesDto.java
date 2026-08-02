package com.vk.api.generated.users.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: UsersTabSpecialValuesDto.kt */
/* loaded from: classes15.dex */
public final class UsersTabSpecialValuesDto implements Parcelable {
    public static final Parcelable.Creator<UsersTabSpecialValuesDto> CREATOR = new a();

    @pmi0("co_owner_invitations_count")
    private final Integer coOwnerInvitationsCount;

    /* compiled from: UsersTabSpecialValuesDto.kt */
    public static final class a implements Parcelable.Creator<UsersTabSpecialValuesDto> {
        @Override // android.os.Parcelable.Creator
        public final UsersTabSpecialValuesDto createFromParcel(Parcel parcel) {
            return new UsersTabSpecialValuesDto(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final UsersTabSpecialValuesDto[] newArray(int i) {
            return new UsersTabSpecialValuesDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UsersTabSpecialValuesDto() {
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
        return (obj instanceof UsersTabSpecialValuesDto) && epx.f(this.coOwnerInvitationsCount, ((UsersTabSpecialValuesDto) obj).coOwnerInvitationsCount);
    }

    public final int hashCode() {
        Integer num = this.coOwnerInvitationsCount;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        return uqi.b(new StringBuilder("UsersTabSpecialValuesDto(coOwnerInvitationsCount="), this.coOwnerInvitationsCount, ')');
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

    public UsersTabSpecialValuesDto(Integer num) {
        this.coOwnerInvitationsCount = num;
    }

    public /* synthetic */ UsersTabSpecialValuesDto(Integer num, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num);
    }
}
