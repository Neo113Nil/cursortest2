package com.vk.api.generated.users.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: UsersExportsDto.kt */
/* loaded from: classes15.dex */
public final class UsersExportsDto implements Parcelable {
    public static final Parcelable.Creator<UsersExportsDto> CREATOR = new a();

    @pmi0("facebook")
    private final Integer facebook;

    @pmi0("livejournal")
    private final Integer livejournal;

    @pmi0("twitter")
    private final Integer twitter;

    /* compiled from: UsersExportsDto.kt */
    public static final class a implements Parcelable.Creator<UsersExportsDto> {
        @Override // android.os.Parcelable.Creator
        public final UsersExportsDto createFromParcel(Parcel parcel) {
            return new UsersExportsDto(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final UsersExportsDto[] newArray(int i) {
            return new UsersExportsDto[i];
        }
    }

    public UsersExportsDto() {
        this(null, null, null, 7, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UsersExportsDto)) {
            return false;
        }
        UsersExportsDto usersExportsDto = (UsersExportsDto) obj;
        return epx.f(this.facebook, usersExportsDto.facebook) && epx.f(this.livejournal, usersExportsDto.livejournal) && epx.f(this.twitter, usersExportsDto.twitter);
    }

    public final int hashCode() {
        Integer num = this.facebook;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.livejournal;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.twitter;
        return hashCode2 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UsersExportsDto(facebook=");
        sb.append(this.facebook);
        sb.append(", livejournal=");
        sb.append(this.livejournal);
        sb.append(", twitter=");
        return uqi.b(sb, this.twitter, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.facebook;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.livejournal;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        Integer num3 = this.twitter;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num3);
        }
    }

    public UsersExportsDto(Integer num, Integer num2, Integer num3) {
        this.facebook = num;
        this.livejournal = num2;
        this.twitter = num3;
    }

    public /* synthetic */ UsersExportsDto(Integer num, Integer num2, Integer num3, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : num3);
    }
}
