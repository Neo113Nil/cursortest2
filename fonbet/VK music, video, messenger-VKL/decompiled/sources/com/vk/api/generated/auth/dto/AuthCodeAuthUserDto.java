package com.vk.api.generated.auth.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AuthCodeAuthUserDto.kt */
/* loaded from: classes14.dex */
public final class AuthCodeAuthUserDto implements Parcelable {
    public static final Parcelable.Creator<AuthCodeAuthUserDto> CREATOR = new a();

    @pmi0("first_name")
    private final String firstName;

    @pmi0("last_name")
    private final String lastName;

    @pmi0("phone")
    private final String phone;

    @pmi0("photo_200")
    private final String photo200;

    @pmi0("photo_50")
    private final String photo50;

    /* compiled from: AuthCodeAuthUserDto.kt */
    public static final class a implements Parcelable.Creator<AuthCodeAuthUserDto> {
        @Override // android.os.Parcelable.Creator
        public final AuthCodeAuthUserDto createFromParcel(Parcel parcel) {
            return new AuthCodeAuthUserDto(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AuthCodeAuthUserDto[] newArray(int i) {
            return new AuthCodeAuthUserDto[i];
        }
    }

    public AuthCodeAuthUserDto() {
        this(null, null, null, null, null, 31, null);
    }

    public final String d() {
        return this.firstName;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.lastName;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthCodeAuthUserDto)) {
            return false;
        }
        AuthCodeAuthUserDto authCodeAuthUserDto = (AuthCodeAuthUserDto) obj;
        return epx.f(this.phone, authCodeAuthUserDto.phone) && epx.f(this.photo50, authCodeAuthUserDto.photo50) && epx.f(this.photo200, authCodeAuthUserDto.photo200) && epx.f(this.firstName, authCodeAuthUserDto.firstName) && epx.f(this.lastName, authCodeAuthUserDto.lastName);
    }

    public final String f() {
        return this.phone;
    }

    public final String g() {
        return this.photo50;
    }

    public final int hashCode() {
        String str = this.phone;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.photo50;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.photo200;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.firstName;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.lastName;
        return hashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthCodeAuthUserDto(phone=");
        sb.append(this.phone);
        sb.append(", photo50=");
        sb.append(this.photo50);
        sb.append(", photo200=");
        sb.append(this.photo200);
        sb.append(", firstName=");
        sb.append(this.firstName);
        sb.append(", lastName=");
        return ho8.a(sb, this.lastName, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.phone);
        parcel.writeString(this.photo50);
        parcel.writeString(this.photo200);
        parcel.writeString(this.firstName);
        parcel.writeString(this.lastName);
    }

    public AuthCodeAuthUserDto(String str, String str2, String str3, String str4, String str5) {
        this.phone = str;
        this.photo50 = str2;
        this.photo200 = str3;
        this.firstName = str4;
        this.lastName = str5;
    }

    public /* synthetic */ AuthCodeAuthUserDto(String str, String str2, String str3, String str4, String str5, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5);
    }
}
