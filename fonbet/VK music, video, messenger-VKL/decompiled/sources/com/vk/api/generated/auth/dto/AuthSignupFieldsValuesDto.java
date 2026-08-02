package com.vk.api.generated.auth.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: AuthSignupFieldsValuesDto.kt */
/* loaded from: classes14.dex */
public final class AuthSignupFieldsValuesDto implements Parcelable {
    public static final Parcelable.Creator<AuthSignupFieldsValuesDto> CREATOR = new a();

    @pmi0("avatar")
    private final String avatar;

    @pmi0("birthday")
    private final AuthBirthdayDto birthday;

    @pmi0("email")
    private final String email;

    @pmi0("first_name")
    private final String firstName;

    @pmi0("gender")
    private final GenderDto gender;

    @pmi0("last_name")
    private final String lastName;

    @pmi0("middle_name")
    private final String middleName;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AuthSignupFieldsValuesDto.kt */
    public static final class GenderDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ GenderDto[] $VALUES;
        public static final Parcelable.Creator<GenderDto> CREATOR;

        @pmi0("1")
        public static final GenderDto FEMALE;

        @pmi0("2")
        public static final GenderDto MALE;
        private final int value;

        /* compiled from: AuthSignupFieldsValuesDto.kt */
        public static final class a implements Parcelable.Creator<GenderDto> {
            @Override // android.os.Parcelable.Creator
            public final GenderDto createFromParcel(Parcel parcel) {
                return GenderDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final GenderDto[] newArray(int i) {
                return new GenderDto[i];
            }
        }

        static {
            GenderDto genderDto = new GenderDto("FEMALE", 0, 1);
            FEMALE = genderDto;
            GenderDto genderDto2 = new GenderDto("MALE", 1, 2);
            MALE = genderDto2;
            GenderDto[] genderDtoArr = {genderDto, genderDto2};
            $VALUES = genderDtoArr;
            $ENTRIES = new asp(genderDtoArr);
            CREATOR = new a();
        }

        private GenderDto(String str, int i, int i2) {
            this.value = i2;
        }

        public static GenderDto valueOf(String str) {
            return (GenderDto) Enum.valueOf(GenderDto.class, str);
        }

        public static GenderDto[] values() {
            return (GenderDto[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final int i() {
            return this.value;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* compiled from: AuthSignupFieldsValuesDto.kt */
    public static final class a implements Parcelable.Creator<AuthSignupFieldsValuesDto> {
        @Override // android.os.Parcelable.Creator
        public final AuthSignupFieldsValuesDto createFromParcel(Parcel parcel) {
            return new AuthSignupFieldsValuesDto(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : GenderDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AuthBirthdayDto.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AuthSignupFieldsValuesDto[] newArray(int i) {
            return new AuthSignupFieldsValuesDto[i];
        }
    }

    public AuthSignupFieldsValuesDto() {
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
        if (!(obj instanceof AuthSignupFieldsValuesDto)) {
            return false;
        }
        AuthSignupFieldsValuesDto authSignupFieldsValuesDto = (AuthSignupFieldsValuesDto) obj;
        return epx.f(this.firstName, authSignupFieldsValuesDto.firstName) && epx.f(this.lastName, authSignupFieldsValuesDto.lastName) && epx.f(this.middleName, authSignupFieldsValuesDto.middleName) && this.gender == authSignupFieldsValuesDto.gender && epx.f(this.birthday, authSignupFieldsValuesDto.birthday) && epx.f(this.avatar, authSignupFieldsValuesDto.avatar) && epx.f(this.email, authSignupFieldsValuesDto.email);
    }

    public final String f() {
        return this.email;
    }

    public final String g() {
        return this.firstName;
    }

    public final int hashCode() {
        String str = this.firstName;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.lastName;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.middleName;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        GenderDto genderDto = this.gender;
        int hashCode4 = (hashCode3 + (genderDto == null ? 0 : genderDto.hashCode())) * 31;
        AuthBirthdayDto authBirthdayDto = this.birthday;
        int hashCode5 = (hashCode4 + (authBirthdayDto == null ? 0 : authBirthdayDto.hashCode())) * 31;
        String str4 = this.avatar;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.email;
        return hashCode6 + (str5 != null ? str5.hashCode() : 0);
    }

    public final GenderDto i() {
        return this.gender;
    }

    public final String j() {
        return this.lastName;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthSignupFieldsValuesDto(firstName=");
        sb.append(this.firstName);
        sb.append(", lastName=");
        sb.append(this.lastName);
        sb.append(", middleName=");
        sb.append(this.middleName);
        sb.append(", gender=");
        sb.append(this.gender);
        sb.append(", birthday=");
        sb.append(this.birthday);
        sb.append(", avatar=");
        sb.append(this.avatar);
        sb.append(", email=");
        return ho8.a(sb, this.email, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.firstName);
        parcel.writeString(this.lastName);
        parcel.writeString(this.middleName);
        GenderDto genderDto = this.gender;
        if (genderDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            genderDto.writeToParcel(parcel, i);
        }
        AuthBirthdayDto authBirthdayDto = this.birthday;
        if (authBirthdayDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            authBirthdayDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.avatar);
        parcel.writeString(this.email);
    }

    public AuthSignupFieldsValuesDto(String str, String str2, String str3, GenderDto genderDto, AuthBirthdayDto authBirthdayDto, String str4, String str5) {
        this.firstName = str;
        this.lastName = str2;
        this.middleName = str3;
        this.gender = genderDto;
        this.birthday = authBirthdayDto;
        this.avatar = str4;
        this.email = str5;
    }

    public /* synthetic */ AuthSignupFieldsValuesDto(String str, String str2, String str3, GenderDto genderDto, AuthBirthdayDto authBirthdayDto, String str4, String str5, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : genderDto, (i & 16) != 0 ? null : authBirthdayDto, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5);
    }
}
