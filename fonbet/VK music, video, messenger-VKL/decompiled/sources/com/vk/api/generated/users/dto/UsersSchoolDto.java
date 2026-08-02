package com.vk.api.generated.users.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: UsersSchoolDto.kt */
/* loaded from: classes15.dex */
public final class UsersSchoolDto implements Parcelable {
    public static final Parcelable.Creator<UsersSchoolDto> CREATOR = new a();

    @pmi0("city")
    private final Integer city;

    /* renamed from: class, reason: not valid java name */
    @pmi0("class")
    private final String f26class;

    @pmi0("class_id")
    private final Integer classId;

    @pmi0("country")
    private final Integer country;

    @pmi0("id")
    private final String id;

    @pmi0("name")
    private final String name;

    @pmi0("speciality")
    private final String speciality;

    @pmi0("type")
    private final Integer type;

    @pmi0("type_str")
    private final String typeStr;

    @pmi0("year_from")
    private final Integer yearFrom;

    @pmi0("year_graduated")
    private final Integer yearGraduated;

    @pmi0("year_to")
    private final Integer yearTo;

    /* compiled from: UsersSchoolDto.kt */
    public static final class a implements Parcelable.Creator<UsersSchoolDto> {
        @Override // android.os.Parcelable.Creator
        public final UsersSchoolDto createFromParcel(Parcel parcel) {
            Integer valueOf;
            Integer num;
            if (parcel.readInt() == 0) {
                valueOf = null;
                num = null;
            } else {
                valueOf = Integer.valueOf(parcel.readInt());
                num = null;
            }
            String readString = parcel.readString();
            Integer valueOf2 = parcel.readInt() == 0 ? num : Integer.valueOf(parcel.readInt());
            Integer valueOf3 = parcel.readInt() == 0 ? num : Integer.valueOf(parcel.readInt());
            String readString2 = parcel.readString();
            Integer num2 = num;
            Integer num3 = valueOf2;
            Integer num4 = valueOf3;
            String readString3 = parcel.readString();
            Integer valueOf4 = parcel.readInt() == 0 ? num2 : Integer.valueOf(parcel.readInt());
            String readString4 = parcel.readString();
            Integer valueOf5 = parcel.readInt() == 0 ? num2 : Integer.valueOf(parcel.readInt());
            Integer valueOf6 = parcel.readInt() == 0 ? num2 : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() != 0) {
                num2 = Integer.valueOf(parcel.readInt());
            }
            return new UsersSchoolDto(valueOf, readString, num3, num4, readString2, readString3, valueOf4, readString4, valueOf5, valueOf6, num2, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final UsersSchoolDto[] newArray(int i) {
            return new UsersSchoolDto[i];
        }
    }

    public UsersSchoolDto() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
    }

    public final Integer d() {
        return this.city;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.f26class;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UsersSchoolDto)) {
            return false;
        }
        UsersSchoolDto usersSchoolDto = (UsersSchoolDto) obj;
        return epx.f(this.city, usersSchoolDto.city) && epx.f(this.f26class, usersSchoolDto.f26class) && epx.f(this.classId, usersSchoolDto.classId) && epx.f(this.country, usersSchoolDto.country) && epx.f(this.id, usersSchoolDto.id) && epx.f(this.name, usersSchoolDto.name) && epx.f(this.type, usersSchoolDto.type) && epx.f(this.typeStr, usersSchoolDto.typeStr) && epx.f(this.yearFrom, usersSchoolDto.yearFrom) && epx.f(this.yearGraduated, usersSchoolDto.yearGraduated) && epx.f(this.yearTo, usersSchoolDto.yearTo) && epx.f(this.speciality, usersSchoolDto.speciality);
    }

    public final Integer f() {
        return this.country;
    }

    public final String g() {
        return this.name;
    }

    public final int hashCode() {
        Integer num = this.city;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f26class;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.classId;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.country;
        int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str2 = this.id;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.name;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num4 = this.type;
        int hashCode7 = (hashCode6 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str4 = this.typeStr;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num5 = this.yearFrom;
        int hashCode9 = (hashCode8 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.yearGraduated;
        int hashCode10 = (hashCode9 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.yearTo;
        int hashCode11 = (hashCode10 + (num7 == null ? 0 : num7.hashCode())) * 31;
        String str5 = this.speciality;
        return hashCode11 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String i() {
        return this.speciality;
    }

    public final String j() {
        return this.typeStr;
    }

    public final Integer k() {
        return this.yearFrom;
    }

    public final Integer l() {
        return this.yearGraduated;
    }

    public final Integer n() {
        return this.yearTo;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UsersSchoolDto(city=");
        sb.append(this.city);
        sb.append(", class=");
        sb.append(this.f26class);
        sb.append(", classId=");
        sb.append(this.classId);
        sb.append(", country=");
        sb.append(this.country);
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", typeStr=");
        sb.append(this.typeStr);
        sb.append(", yearFrom=");
        sb.append(this.yearFrom);
        sb.append(", yearGraduated=");
        sb.append(this.yearGraduated);
        sb.append(", yearTo=");
        sb.append(this.yearTo);
        sb.append(", speciality=");
        return ho8.a(sb, this.speciality, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.city;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.f26class);
        Integer num2 = this.classId;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        Integer num3 = this.country;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num3);
        }
        parcel.writeString(this.id);
        parcel.writeString(this.name);
        Integer num4 = this.type;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num4);
        }
        parcel.writeString(this.typeStr);
        Integer num5 = this.yearFrom;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num5);
        }
        Integer num6 = this.yearGraduated;
        if (num6 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num6);
        }
        Integer num7 = this.yearTo;
        if (num7 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num7);
        }
        parcel.writeString(this.speciality);
    }

    public UsersSchoolDto(Integer num, String str, Integer num2, Integer num3, String str2, String str3, Integer num4, String str4, Integer num5, Integer num6, Integer num7, String str5) {
        this.city = num;
        this.f26class = str;
        this.classId = num2;
        this.country = num3;
        this.id = str2;
        this.name = str3;
        this.type = num4;
        this.typeStr = str4;
        this.yearFrom = num5;
        this.yearGraduated = num6;
        this.yearTo = num7;
        this.speciality = str5;
    }

    public /* synthetic */ UsersSchoolDto(Integer num, String str, Integer num2, Integer num3, String str2, String str3, Integer num4, String str4, Integer num5, Integer num6, Integer num7, String str5, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? null : num3, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : num4, (i & 128) != 0 ? null : str4, (i & 256) != 0 ? null : num5, (i & 512) != 0 ? null : num6, (i & 1024) != 0 ? null : num7, (i & 2048) != 0 ? null : str5);
    }
}
