package com.vk.api.generated.users.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.push.core.analytics.AnalyticsBaseParamsConstantsKt;
import xsna.asp;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;
import xsna.zrp;

/* compiled from: UsersOccupationDto.kt */
/* loaded from: classes15.dex */
public final class UsersOccupationDto implements Parcelable {
    public static final Parcelable.Creator<UsersOccupationDto> CREATOR = new a();

    @pmi0("city_id")
    private final Integer cityId;

    @pmi0(AnalyticsBaseParamsConstantsKt.COUNTRY_ID)
    private final Integer countryId;

    @pmi0("graduate_year")
    private final Integer graduateYear;

    @pmi0("id")
    private final Integer id;

    @pmi0("name")
    private final String name;

    @pmi0("type")
    private final TypeDto type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: UsersOccupationDto.kt */
    public static final class TypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;
        public static final Parcelable.Creator<TypeDto> CREATOR;

        @pmi0("school")
        public static final TypeDto SCHOOL;

        @pmi0("university")
        public static final TypeDto UNIVERSITY;

        @pmi0("work")
        public static final TypeDto WORK;
        private final String value;

        /* compiled from: UsersOccupationDto.kt */
        public static final class a implements Parcelable.Creator<TypeDto> {
            @Override // android.os.Parcelable.Creator
            public final TypeDto createFromParcel(Parcel parcel) {
                return TypeDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final TypeDto[] newArray(int i) {
                return new TypeDto[i];
            }
        }

        static {
            TypeDto typeDto = new TypeDto("SCHOOL", 0, "school");
            SCHOOL = typeDto;
            TypeDto typeDto2 = new TypeDto("UNIVERSITY", 1, "university");
            UNIVERSITY = typeDto2;
            TypeDto typeDto3 = new TypeDto("WORK", 2, "work");
            WORK = typeDto3;
            TypeDto[] typeDtoArr = {typeDto, typeDto2, typeDto3};
            $VALUES = typeDtoArr;
            $ENTRIES = new asp(typeDtoArr);
            CREATOR = new a();
        }

        private TypeDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static TypeDto valueOf(String str) {
            return (TypeDto) Enum.valueOf(TypeDto.class, str);
        }

        public static TypeDto[] values() {
            return (TypeDto[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String i() {
            return this.value;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* compiled from: UsersOccupationDto.kt */
    public static final class a implements Parcelable.Creator<UsersOccupationDto> {
        @Override // android.os.Parcelable.Creator
        public final UsersOccupationDto createFromParcel(Parcel parcel) {
            Integer valueOf;
            Integer num;
            TypeDto typeDto;
            Integer num2;
            Integer num3;
            Integer valueOf2;
            if (parcel.readInt() == 0) {
                valueOf = null;
                num = null;
            } else {
                valueOf = Integer.valueOf(parcel.readInt());
                num = null;
            }
            String readString = parcel.readString();
            TypeDto typeDto2 = (TypeDto) (parcel.readInt() == 0 ? num : TypeDto.CREATOR.createFromParcel(parcel));
            Integer valueOf3 = parcel.readInt() == 0 ? num : Integer.valueOf(parcel.readInt());
            Integer valueOf4 = parcel.readInt() == 0 ? num : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                Integer num4 = valueOf4;
                valueOf2 = num;
                typeDto = typeDto2;
                num2 = valueOf3;
                num3 = num4;
            } else {
                typeDto = typeDto2;
                num2 = valueOf3;
                num3 = valueOf4;
                valueOf2 = Integer.valueOf(parcel.readInt());
            }
            return new UsersOccupationDto(valueOf, readString, typeDto, num2, num3, valueOf2);
        }

        @Override // android.os.Parcelable.Creator
        public final UsersOccupationDto[] newArray(int i) {
            return new UsersOccupationDto[i];
        }
    }

    public UsersOccupationDto() {
        this(null, null, null, null, null, null, 63, null);
    }

    public final Integer d() {
        return this.graduateYear;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Integer e() {
        return this.id;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UsersOccupationDto)) {
            return false;
        }
        UsersOccupationDto usersOccupationDto = (UsersOccupationDto) obj;
        return epx.f(this.id, usersOccupationDto.id) && epx.f(this.name, usersOccupationDto.name) && this.type == usersOccupationDto.type && epx.f(this.graduateYear, usersOccupationDto.graduateYear) && epx.f(this.countryId, usersOccupationDto.countryId) && epx.f(this.cityId, usersOccupationDto.cityId);
    }

    public final String f() {
        return this.name;
    }

    public final TypeDto g() {
        return this.type;
    }

    public final int hashCode() {
        Integer num = this.id;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.name;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        TypeDto typeDto = this.type;
        int hashCode3 = (hashCode2 + (typeDto == null ? 0 : typeDto.hashCode())) * 31;
        Integer num2 = this.graduateYear;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.countryId;
        int hashCode5 = (hashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.cityId;
        return hashCode5 + (num4 != null ? num4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UsersOccupationDto(id=");
        sb.append(this.id);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", graduateYear=");
        sb.append(this.graduateYear);
        sb.append(", countryId=");
        sb.append(this.countryId);
        sb.append(", cityId=");
        return uqi.b(sb, this.cityId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.id;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.name);
        TypeDto typeDto = this.type;
        if (typeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            typeDto.writeToParcel(parcel, i);
        }
        Integer num2 = this.graduateYear;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        Integer num3 = this.countryId;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num3);
        }
        Integer num4 = this.cityId;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num4);
        }
    }

    public UsersOccupationDto(Integer num, String str, TypeDto typeDto, Integer num2, Integer num3, Integer num4) {
        this.id = num;
        this.name = str;
        this.type = typeDto;
        this.graduateYear = num2;
        this.countryId = num3;
        this.cityId = num4;
    }

    public /* synthetic */ UsersOccupationDto(Integer num, String str, TypeDto typeDto, Integer num2, Integer num3, Integer num4, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : typeDto, (i & 8) != 0 ? null : num2, (i & 16) != 0 ? null : num3, (i & 32) != 0 ? null : num4);
    }
}
