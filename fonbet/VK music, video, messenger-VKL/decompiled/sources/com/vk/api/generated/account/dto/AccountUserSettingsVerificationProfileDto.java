package com.vk.api.generated.account.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: AccountUserSettingsVerificationProfileDto.kt */
/* loaded from: classes14.dex */
public final class AccountUserSettingsVerificationProfileDto implements Parcelable {
    public static final Parcelable.Creator<AccountUserSettingsVerificationProfileDto> CREATOR = new a();

    @pmi0("birthdate")
    private final String birthdate;

    @pmi0("email")
    private final String email;

    @pmi0("first_name")
    private final String firstName;

    @pmi0("last_name")
    private final String lastName;

    @pmi0("middle_name")
    private final String middleName;

    @pmi0("phone")
    private final String phone;

    @pmi0("sex")
    private final SexDto sex;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AccountUserSettingsVerificationProfileDto.kt */
    public static final class SexDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ SexDto[] $VALUES;
        public static final Parcelable.Creator<SexDto> CREATOR;

        @pmi0("1")
        public static final SexDto FEMALE;

        @pmi0("2")
        public static final SexDto MALE;

        @pmi0("0")
        public static final SexDto UNDEFINED;
        private final int value;

        /* compiled from: AccountUserSettingsVerificationProfileDto.kt */
        public static final class a implements Parcelable.Creator<SexDto> {
            @Override // android.os.Parcelable.Creator
            public final SexDto createFromParcel(Parcel parcel) {
                return SexDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final SexDto[] newArray(int i) {
                return new SexDto[i];
            }
        }

        static {
            SexDto sexDto = new SexDto("UNDEFINED", 0, 0);
            UNDEFINED = sexDto;
            SexDto sexDto2 = new SexDto("FEMALE", 1, 1);
            FEMALE = sexDto2;
            SexDto sexDto3 = new SexDto("MALE", 2, 2);
            MALE = sexDto3;
            SexDto[] sexDtoArr = {sexDto, sexDto2, sexDto3};
            $VALUES = sexDtoArr;
            $ENTRIES = new asp(sexDtoArr);
            CREATOR = new a();
        }

        private SexDto(String str, int i, int i2) {
            this.value = i2;
        }

        public static SexDto valueOf(String str) {
            return (SexDto) Enum.valueOf(SexDto.class, str);
        }

        public static SexDto[] values() {
            return (SexDto[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* compiled from: AccountUserSettingsVerificationProfileDto.kt */
    public static final class a implements Parcelable.Creator<AccountUserSettingsVerificationProfileDto> {
        @Override // android.os.Parcelable.Creator
        public final AccountUserSettingsVerificationProfileDto createFromParcel(Parcel parcel) {
            return new AccountUserSettingsVerificationProfileDto(parcel.readString(), parcel.readString(), SexDto.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AccountUserSettingsVerificationProfileDto[] newArray(int i) {
            return new AccountUserSettingsVerificationProfileDto[i];
        }
    }

    public AccountUserSettingsVerificationProfileDto(String str, String str2, SexDto sexDto, String str3, String str4, String str5, String str6) {
        this.firstName = str;
        this.lastName = str2;
        this.sex = sexDto;
        this.middleName = str3;
        this.birthdate = str4;
        this.phone = str5;
        this.email = str6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountUserSettingsVerificationProfileDto)) {
            return false;
        }
        AccountUserSettingsVerificationProfileDto accountUserSettingsVerificationProfileDto = (AccountUserSettingsVerificationProfileDto) obj;
        return epx.f(this.firstName, accountUserSettingsVerificationProfileDto.firstName) && epx.f(this.lastName, accountUserSettingsVerificationProfileDto.lastName) && this.sex == accountUserSettingsVerificationProfileDto.sex && epx.f(this.middleName, accountUserSettingsVerificationProfileDto.middleName) && epx.f(this.birthdate, accountUserSettingsVerificationProfileDto.birthdate) && epx.f(this.phone, accountUserSettingsVerificationProfileDto.phone) && epx.f(this.email, accountUserSettingsVerificationProfileDto.email);
    }

    public final int hashCode() {
        int hashCode = (this.sex.hashCode() + urd0.a(this.firstName.hashCode() * 31, 31, this.lastName)) * 31;
        String str = this.middleName;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.birthdate;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.phone;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.email;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccountUserSettingsVerificationProfileDto(firstName=");
        sb.append(this.firstName);
        sb.append(", lastName=");
        sb.append(this.lastName);
        sb.append(", sex=");
        sb.append(this.sex);
        sb.append(", middleName=");
        sb.append(this.middleName);
        sb.append(", birthdate=");
        sb.append(this.birthdate);
        sb.append(", phone=");
        sb.append(this.phone);
        sb.append(", email=");
        return ho8.a(sb, this.email, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.firstName);
        parcel.writeString(this.lastName);
        this.sex.writeToParcel(parcel, i);
        parcel.writeString(this.middleName);
        parcel.writeString(this.birthdate);
        parcel.writeString(this.phone);
        parcel.writeString(this.email);
    }

    public /* synthetic */ AccountUserSettingsVerificationProfileDto(String str, String str2, SexDto sexDto, String str3, String str4, String str5, String str6, int i, zcl zclVar) {
        this(str, str2, sexDto, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6);
    }
}
