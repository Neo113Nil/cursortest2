package com.vk.api.generated.esia.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: EsiaEsiaUserInfoDto.kt */
/* loaded from: classes14.dex */
public final class EsiaEsiaUserInfoDto implements Parcelable {
    public static final Parcelable.Creator<EsiaEsiaUserInfoDto> CREATOR = new a();

    @pmi0("bdate")
    private final String bdate;

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
    /* compiled from: EsiaEsiaUserInfoDto.kt */
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

        /* compiled from: EsiaEsiaUserInfoDto.kt */
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

    /* compiled from: EsiaEsiaUserInfoDto.kt */
    public static final class a implements Parcelable.Creator<EsiaEsiaUserInfoDto> {
        @Override // android.os.Parcelable.Creator
        public final EsiaEsiaUserInfoDto createFromParcel(Parcel parcel) {
            return new EsiaEsiaUserInfoDto(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : SexDto.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final EsiaEsiaUserInfoDto[] newArray(int i) {
            return new EsiaEsiaUserInfoDto[i];
        }
    }

    public EsiaEsiaUserInfoDto() {
        this(null, null, null, null, null, null, 63, null);
    }

    public final String d() {
        return this.bdate;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.firstName;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EsiaEsiaUserInfoDto)) {
            return false;
        }
        EsiaEsiaUserInfoDto esiaEsiaUserInfoDto = (EsiaEsiaUserInfoDto) obj;
        return epx.f(this.firstName, esiaEsiaUserInfoDto.firstName) && epx.f(this.lastName, esiaEsiaUserInfoDto.lastName) && epx.f(this.middleName, esiaEsiaUserInfoDto.middleName) && epx.f(this.bdate, esiaEsiaUserInfoDto.bdate) && this.sex == esiaEsiaUserInfoDto.sex && epx.f(this.phone, esiaEsiaUserInfoDto.phone);
    }

    public final String f() {
        return this.lastName;
    }

    public final String g() {
        return this.middleName;
    }

    public final int hashCode() {
        String str = this.firstName;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.lastName;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.middleName;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.bdate;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        SexDto sexDto = this.sex;
        int hashCode5 = (hashCode4 + (sexDto == null ? 0 : sexDto.hashCode())) * 31;
        String str5 = this.phone;
        return hashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String i() {
        return this.phone;
    }

    public final SexDto j() {
        return this.sex;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EsiaEsiaUserInfoDto(firstName=");
        sb.append(this.firstName);
        sb.append(", lastName=");
        sb.append(this.lastName);
        sb.append(", middleName=");
        sb.append(this.middleName);
        sb.append(", bdate=");
        sb.append(this.bdate);
        sb.append(", sex=");
        sb.append(this.sex);
        sb.append(", phone=");
        return ho8.a(sb, this.phone, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.firstName);
        parcel.writeString(this.lastName);
        parcel.writeString(this.middleName);
        parcel.writeString(this.bdate);
        SexDto sexDto = this.sex;
        if (sexDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            sexDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.phone);
    }

    public EsiaEsiaUserInfoDto(String str, String str2, String str3, String str4, SexDto sexDto, String str5) {
        this.firstName = str;
        this.lastName = str2;
        this.middleName = str3;
        this.bdate = str4;
        this.sex = sexDto;
        this.phone = str5;
    }

    public /* synthetic */ EsiaEsiaUserInfoDto(String str, String str2, String str3, String str4, SexDto sexDto, String str5, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : sexDto, (i & 32) != 0 ? null : str5);
    }
}
