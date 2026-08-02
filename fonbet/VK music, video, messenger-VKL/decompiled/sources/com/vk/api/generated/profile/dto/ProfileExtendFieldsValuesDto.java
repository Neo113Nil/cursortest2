package com.vk.api.generated.profile.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.auth.dto.AuthBirthdayDto;
import xsna.epx;
import xsna.ho8;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: ProfileExtendFieldsValuesDto.kt */
/* loaded from: classes15.dex */
public final class ProfileExtendFieldsValuesDto implements Parcelable {
    public static final Parcelable.Creator<ProfileExtendFieldsValuesDto> CREATOR = new a();

    @pmi0("avatar")
    private final String avatar;

    @pmi0("birthday")
    private final AuthBirthdayDto birthday;

    @pmi0("email")
    private final String email;

    @pmi0("first_name")
    private final String firstName;

    @pmi0("gender")
    private final Integer gender;

    @pmi0("last_name")
    private final String lastName;

    @pmi0("name")
    private final String name;

    /* compiled from: ProfileExtendFieldsValuesDto.kt */
    public static final class a implements Parcelable.Creator<ProfileExtendFieldsValuesDto> {
        @Override // android.os.Parcelable.Creator
        public final ProfileExtendFieldsValuesDto createFromParcel(Parcel parcel) {
            return new ProfileExtendFieldsValuesDto(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : AuthBirthdayDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ProfileExtendFieldsValuesDto[] newArray(int i) {
            return new ProfileExtendFieldsValuesDto[i];
        }
    }

    public ProfileExtendFieldsValuesDto() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public final String d() {
        return this.avatar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final AuthBirthdayDto e() {
        return this.birthday;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileExtendFieldsValuesDto)) {
            return false;
        }
        ProfileExtendFieldsValuesDto profileExtendFieldsValuesDto = (ProfileExtendFieldsValuesDto) obj;
        return epx.f(this.name, profileExtendFieldsValuesDto.name) && epx.f(this.firstName, profileExtendFieldsValuesDto.firstName) && epx.f(this.lastName, profileExtendFieldsValuesDto.lastName) && epx.f(this.birthday, profileExtendFieldsValuesDto.birthday) && epx.f(this.gender, profileExtendFieldsValuesDto.gender) && epx.f(this.avatar, profileExtendFieldsValuesDto.avatar) && epx.f(this.email, profileExtendFieldsValuesDto.email);
    }

    public final String f() {
        return this.email;
    }

    public final String g() {
        return this.firstName;
    }

    public final int hashCode() {
        String str = this.name;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.firstName;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.lastName;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        AuthBirthdayDto authBirthdayDto = this.birthday;
        int hashCode4 = (hashCode3 + (authBirthdayDto == null ? 0 : authBirthdayDto.hashCode())) * 31;
        Integer num = this.gender;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.avatar;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.email;
        return hashCode6 + (str5 != null ? str5.hashCode() : 0);
    }

    public final Integer i() {
        return this.gender;
    }

    public final String j() {
        return this.lastName;
    }

    public final String k() {
        return this.name;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProfileExtendFieldsValuesDto(name=");
        sb.append(this.name);
        sb.append(", firstName=");
        sb.append(this.firstName);
        sb.append(", lastName=");
        sb.append(this.lastName);
        sb.append(", birthday=");
        sb.append(this.birthday);
        sb.append(", gender=");
        sb.append(this.gender);
        sb.append(", avatar=");
        sb.append(this.avatar);
        sb.append(", email=");
        return ho8.a(sb, this.email, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
        parcel.writeString(this.firstName);
        parcel.writeString(this.lastName);
        AuthBirthdayDto authBirthdayDto = this.birthday;
        if (authBirthdayDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            authBirthdayDto.writeToParcel(parcel, i);
        }
        Integer num = this.gender;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.avatar);
        parcel.writeString(this.email);
    }

    public ProfileExtendFieldsValuesDto(String str, String str2, String str3, AuthBirthdayDto authBirthdayDto, Integer num, String str4, String str5) {
        this.name = str;
        this.firstName = str2;
        this.lastName = str3;
        this.birthday = authBirthdayDto;
        this.gender = num;
        this.avatar = str4;
        this.email = str5;
    }

    public /* synthetic */ ProfileExtendFieldsValuesDto(String str, String str2, String str3, AuthBirthdayDto authBirthdayDto, Integer num, String str4, String str5, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : authBirthdayDto, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5);
    }
}
