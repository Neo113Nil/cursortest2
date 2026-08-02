package com.vk.api.generated.users.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: UsersRightsLocationDto.kt */
/* loaded from: classes15.dex */
public final class UsersRightsLocationDto implements Parcelable {
    public static final Parcelable.Creator<UsersRightsLocationDto> CREATOR = new a();

    @pmi0("data_center")
    private final String dataCenter;

    @pmi0("office")
    private final String office;

    @pmi0("remote")
    private final String remote;

    /* compiled from: UsersRightsLocationDto.kt */
    public static final class a implements Parcelable.Creator<UsersRightsLocationDto> {
        @Override // android.os.Parcelable.Creator
        public final UsersRightsLocationDto createFromParcel(Parcel parcel) {
            return new UsersRightsLocationDto(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final UsersRightsLocationDto[] newArray(int i) {
            return new UsersRightsLocationDto[i];
        }
    }

    public UsersRightsLocationDto() {
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
        if (!(obj instanceof UsersRightsLocationDto)) {
            return false;
        }
        UsersRightsLocationDto usersRightsLocationDto = (UsersRightsLocationDto) obj;
        return epx.f(this.office, usersRightsLocationDto.office) && epx.f(this.remote, usersRightsLocationDto.remote) && epx.f(this.dataCenter, usersRightsLocationDto.dataCenter);
    }

    public final int hashCode() {
        String str = this.office;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.remote;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.dataCenter;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UsersRightsLocationDto(office=");
        sb.append(this.office);
        sb.append(", remote=");
        sb.append(this.remote);
        sb.append(", dataCenter=");
        return ho8.a(sb, this.dataCenter, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.office);
        parcel.writeString(this.remote);
        parcel.writeString(this.dataCenter);
    }

    public UsersRightsLocationDto(String str, String str2, String str3) {
        this.office = str;
        this.remote = str2;
        this.dataCenter = str3;
    }

    public /* synthetic */ UsersRightsLocationDto(String str, String str2, String str3, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
