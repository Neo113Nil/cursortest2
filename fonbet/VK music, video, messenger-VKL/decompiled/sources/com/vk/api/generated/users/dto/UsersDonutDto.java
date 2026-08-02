package com.vk.api.generated.users.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.zcl;

/* compiled from: UsersDonutDto.kt */
/* loaded from: classes15.dex */
public final class UsersDonutDto implements Parcelable {
    public static final Parcelable.Creator<UsersDonutDto> CREATOR = new a();

    @pmi0("goals")
    private final Boolean goals;

    @pmi0("is_available")
    private final boolean isAvailable;

    @pmi0("one_time")
    private final Boolean oneTime;

    @pmi0("regular")
    private final Boolean regular;

    /* compiled from: UsersDonutDto.kt */
    public static final class a implements Parcelable.Creator<UsersDonutDto> {
        @Override // android.os.Parcelable.Creator
        public final UsersDonutDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
            boolean z = parcel.readInt() != 0;
            Boolean bool = null;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new UsersDonutDto(z, valueOf, valueOf2, bool);
        }

        @Override // android.os.Parcelable.Creator
        public final UsersDonutDto[] newArray(int i) {
            return new UsersDonutDto[i];
        }
    }

    public UsersDonutDto(boolean z, Boolean bool, Boolean bool2, Boolean bool3) {
        this.isAvailable = z;
        this.regular = bool;
        this.oneTime = bool2;
        this.goals = bool3;
    }

    public final Boolean d() {
        return this.goals;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Boolean e() {
        return this.oneTime;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UsersDonutDto)) {
            return false;
        }
        UsersDonutDto usersDonutDto = (UsersDonutDto) obj;
        return this.isAvailable == usersDonutDto.isAvailable && epx.f(this.regular, usersDonutDto.regular) && epx.f(this.oneTime, usersDonutDto.oneTime) && epx.f(this.goals, usersDonutDto.goals);
    }

    public final Boolean f() {
        return this.regular;
    }

    public final boolean g() {
        return this.isAvailable;
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.isAvailable) * 31;
        Boolean bool = this.regular;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.oneTime;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.goals;
        return hashCode3 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UsersDonutDto(isAvailable=");
        sb.append(this.isAvailable);
        sb.append(", regular=");
        sb.append(this.regular);
        sb.append(", oneTime=");
        sb.append(this.oneTime);
        sb.append(", goals=");
        return tn.a(sb, this.goals, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.isAvailable ? 1 : 0);
        Boolean bool = this.regular;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.oneTime;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        Boolean bool3 = this.goals;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool3);
        }
    }

    public /* synthetic */ UsersDonutDto(boolean z, Boolean bool, Boolean bool2, Boolean bool3, int i, zcl zclVar) {
        this(z, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : bool2, (i & 8) != 0 ? null : bool3);
    }
}
