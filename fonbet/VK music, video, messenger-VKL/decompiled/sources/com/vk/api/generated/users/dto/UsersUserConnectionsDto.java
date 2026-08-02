package com.vk.api.generated.users.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: UsersUserConnectionsDto.kt */
/* loaded from: classes15.dex */
public final class UsersUserConnectionsDto implements Parcelable {
    public static final Parcelable.Creator<UsersUserConnectionsDto> CREATOR = new a();

    @pmi0("facebook")
    private final String facebook;

    @pmi0("facebook_name")
    private final String facebookName;

    @pmi0("instagram")
    private final String instagram;

    @pmi0("livejournal")
    private final String livejournal;

    @pmi0("skype")
    private final String skype;

    @pmi0("twitter")
    private final String twitter;

    /* compiled from: UsersUserConnectionsDto.kt */
    public static final class a implements Parcelable.Creator<UsersUserConnectionsDto> {
        @Override // android.os.Parcelable.Creator
        public final UsersUserConnectionsDto createFromParcel(Parcel parcel) {
            return new UsersUserConnectionsDto(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final UsersUserConnectionsDto[] newArray(int i) {
            return new UsersUserConnectionsDto[i];
        }
    }

    public UsersUserConnectionsDto(String str, String str2, String str3, String str4, String str5, String str6) {
        this.skype = str;
        this.facebook = str2;
        this.twitter = str3;
        this.instagram = str4;
        this.facebookName = str5;
        this.livejournal = str6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UsersUserConnectionsDto)) {
            return false;
        }
        UsersUserConnectionsDto usersUserConnectionsDto = (UsersUserConnectionsDto) obj;
        return epx.f(this.skype, usersUserConnectionsDto.skype) && epx.f(this.facebook, usersUserConnectionsDto.facebook) && epx.f(this.twitter, usersUserConnectionsDto.twitter) && epx.f(this.instagram, usersUserConnectionsDto.instagram) && epx.f(this.facebookName, usersUserConnectionsDto.facebookName) && epx.f(this.livejournal, usersUserConnectionsDto.livejournal);
    }

    public final int hashCode() {
        int a2 = urd0.a(urd0.a(urd0.a(this.skype.hashCode() * 31, 31, this.facebook), 31, this.twitter), 31, this.instagram);
        String str = this.facebookName;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.livejournal;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UsersUserConnectionsDto(skype=");
        sb.append(this.skype);
        sb.append(", facebook=");
        sb.append(this.facebook);
        sb.append(", twitter=");
        sb.append(this.twitter);
        sb.append(", instagram=");
        sb.append(this.instagram);
        sb.append(", facebookName=");
        sb.append(this.facebookName);
        sb.append(", livejournal=");
        return ho8.a(sb, this.livejournal, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.skype);
        parcel.writeString(this.facebook);
        parcel.writeString(this.twitter);
        parcel.writeString(this.instagram);
        parcel.writeString(this.facebookName);
        parcel.writeString(this.livejournal);
    }

    public /* synthetic */ UsersUserConnectionsDto(String str, String str2, String str3, String str4, String str5, String str6, int i, zcl zclVar) {
        this(str, str2, str3, str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6);
    }
}
