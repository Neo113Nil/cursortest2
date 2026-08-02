package com.vk.api.generated.tinkoff.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.zcl;
import xsna.zrp;

/* compiled from: TinkoffTinkoffUserInfoDto.kt */
/* loaded from: classes15.dex */
public final class TinkoffTinkoffUserInfoDto implements Parcelable {
    public static final Parcelable.Creator<TinkoffTinkoffUserInfoDto> CREATOR = new a();

    @pmi0("bdate")
    private final String bdate;

    @pmi0("first_name")
    private final String firstName;

    @pmi0("is_identified")
    private final Boolean isIdentified;

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
    /* compiled from: TinkoffTinkoffUserInfoDto.kt */
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

        /* compiled from: TinkoffTinkoffUserInfoDto.kt */
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

    /* compiled from: TinkoffTinkoffUserInfoDto.kt */
    public static final class a implements Parcelable.Creator<TinkoffTinkoffUserInfoDto> {
        @Override // android.os.Parcelable.Creator
        public final TinkoffTinkoffUserInfoDto createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            SexDto createFromParcel = parcel.readInt() == 0 ? null : SexDto.CREATOR.createFromParcel(parcel);
            Boolean bool = null;
            String readString5 = parcel.readString();
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new TinkoffTinkoffUserInfoDto(readString, readString2, readString3, readString4, createFromParcel, readString5, bool);
        }

        @Override // android.os.Parcelable.Creator
        public final TinkoffTinkoffUserInfoDto[] newArray(int i) {
            return new TinkoffTinkoffUserInfoDto[i];
        }
    }

    public TinkoffTinkoffUserInfoDto() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TinkoffTinkoffUserInfoDto)) {
            return false;
        }
        TinkoffTinkoffUserInfoDto tinkoffTinkoffUserInfoDto = (TinkoffTinkoffUserInfoDto) obj;
        return epx.f(this.firstName, tinkoffTinkoffUserInfoDto.firstName) && epx.f(this.lastName, tinkoffTinkoffUserInfoDto.lastName) && epx.f(this.middleName, tinkoffTinkoffUserInfoDto.middleName) && epx.f(this.bdate, tinkoffTinkoffUserInfoDto.bdate) && this.sex == tinkoffTinkoffUserInfoDto.sex && epx.f(this.phone, tinkoffTinkoffUserInfoDto.phone) && epx.f(this.isIdentified, tinkoffTinkoffUserInfoDto.isIdentified);
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
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool = this.isIdentified;
        return hashCode6 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TinkoffTinkoffUserInfoDto(firstName=");
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
        sb.append(this.phone);
        sb.append(", isIdentified=");
        return tn.a(sb, this.isIdentified, ')');
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
        Boolean bool = this.isIdentified;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
    }

    public TinkoffTinkoffUserInfoDto(String str, String str2, String str3, String str4, SexDto sexDto, String str5, Boolean bool) {
        this.firstName = str;
        this.lastName = str2;
        this.middleName = str3;
        this.bdate = str4;
        this.sex = sexDto;
        this.phone = str5;
        this.isIdentified = bool;
    }

    public /* synthetic */ TinkoffTinkoffUserInfoDto(String str, String str2, String str3, String str4, SexDto sexDto, String str5, Boolean bool, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : sexDto, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : bool);
    }
}
