package com.vk.api.generated.users.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: UsersLastSeenDto.kt */
/* loaded from: classes15.dex */
public final class UsersLastSeenDto implements Parcelable {
    public static final Parcelable.Creator<UsersLastSeenDto> CREATOR = new a();

    @pmi0("platform")
    private final Integer platform;

    @pmi0("time")
    private final Integer time;

    /* compiled from: UsersLastSeenDto.kt */
    public static final class a implements Parcelable.Creator<UsersLastSeenDto> {
        @Override // android.os.Parcelable.Creator
        public final UsersLastSeenDto createFromParcel(Parcel parcel) {
            return new UsersLastSeenDto(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final UsersLastSeenDto[] newArray(int i) {
            return new UsersLastSeenDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UsersLastSeenDto() {
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
        if (!(obj instanceof UsersLastSeenDto)) {
            return false;
        }
        UsersLastSeenDto usersLastSeenDto = (UsersLastSeenDto) obj;
        return epx.f(this.platform, usersLastSeenDto.platform) && epx.f(this.time, usersLastSeenDto.time);
    }

    public final int hashCode() {
        Integer num = this.platform;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.time;
        return hashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UsersLastSeenDto(platform=");
        sb.append(this.platform);
        sb.append(", time=");
        return uqi.b(sb, this.time, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.platform;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.time;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
    }

    public UsersLastSeenDto(Integer num, Integer num2) {
        this.platform = num;
        this.time = num2;
    }

    public /* synthetic */ UsersLastSeenDto(Integer num, Integer num2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2);
    }
}
