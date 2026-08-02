package com.vk.api.generated.users.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: UsersUniversityDto.kt */
/* loaded from: classes15.dex */
public final class UsersUniversityDto implements Parcelable {
    public static final Parcelable.Creator<UsersUniversityDto> CREATOR = new a();

    @pmi0("chair")
    private final Integer chair;

    @pmi0("chair_name")
    private final String chairName;

    @pmi0("city")
    private final Integer city;

    @pmi0("country")
    private final Integer country;

    @pmi0("education_form")
    private final String educationForm;

    @pmi0("education_form_id")
    private final Integer educationFormId;

    @pmi0("education_status")
    private final String educationStatus;

    @pmi0("education_status_id")
    private final Integer educationStatusId;

    @pmi0("faculty")
    private final Integer faculty;

    @pmi0("faculty_name")
    private final String facultyName;

    @pmi0("graduation")
    private final Integer graduation;

    @pmi0("id")
    private final Integer id;

    @pmi0("name")
    private final String name;

    @pmi0("university_group_id")
    private final Integer universityGroupId;

    /* compiled from: UsersUniversityDto.kt */
    public static final class a implements Parcelable.Creator<UsersUniversityDto> {
        @Override // android.os.Parcelable.Creator
        public final UsersUniversityDto createFromParcel(Parcel parcel) {
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
            Integer valueOf4 = parcel.readInt() == 0 ? num : Integer.valueOf(parcel.readInt());
            String readString3 = parcel.readString();
            Integer valueOf5 = parcel.readInt() == 0 ? num : Integer.valueOf(parcel.readInt());
            Integer valueOf6 = parcel.readInt() == 0 ? num : Integer.valueOf(parcel.readInt());
            String readString4 = parcel.readString();
            Integer valueOf7 = parcel.readInt() == 0 ? num : Integer.valueOf(parcel.readInt());
            Integer valueOf8 = parcel.readInt() == 0 ? num : Integer.valueOf(parcel.readInt());
            String readString5 = parcel.readString();
            if (parcel.readInt() != 0) {
                num = Integer.valueOf(parcel.readInt());
            }
            return new UsersUniversityDto(valueOf, readString, valueOf2, valueOf3, readString2, valueOf4, readString3, valueOf5, valueOf6, readString4, valueOf7, valueOf8, readString5, num);
        }

        @Override // android.os.Parcelable.Creator
        public final UsersUniversityDto[] newArray(int i) {
            return new UsersUniversityDto[i];
        }
    }

    public UsersUniversityDto() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
    }

    public final String d() {
        return this.chairName;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Integer e() {
        return this.city;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UsersUniversityDto)) {
            return false;
        }
        UsersUniversityDto usersUniversityDto = (UsersUniversityDto) obj;
        return epx.f(this.chair, usersUniversityDto.chair) && epx.f(this.chairName, usersUniversityDto.chairName) && epx.f(this.city, usersUniversityDto.city) && epx.f(this.country, usersUniversityDto.country) && epx.f(this.educationForm, usersUniversityDto.educationForm) && epx.f(this.educationFormId, usersUniversityDto.educationFormId) && epx.f(this.educationStatus, usersUniversityDto.educationStatus) && epx.f(this.educationStatusId, usersUniversityDto.educationStatusId) && epx.f(this.faculty, usersUniversityDto.faculty) && epx.f(this.facultyName, usersUniversityDto.facultyName) && epx.f(this.graduation, usersUniversityDto.graduation) && epx.f(this.id, usersUniversityDto.id) && epx.f(this.name, usersUniversityDto.name) && epx.f(this.universityGroupId, usersUniversityDto.universityGroupId);
    }

    public final Integer f() {
        return this.country;
    }

    public final String g() {
        return this.facultyName;
    }

    public final int hashCode() {
        Integer num = this.chair;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.chairName;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.city;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.country;
        int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str2 = this.educationForm;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num4 = this.educationFormId;
        int hashCode6 = (hashCode5 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str3 = this.educationStatus;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num5 = this.educationStatusId;
        int hashCode8 = (hashCode7 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.faculty;
        int hashCode9 = (hashCode8 + (num6 == null ? 0 : num6.hashCode())) * 31;
        String str4 = this.facultyName;
        int hashCode10 = (hashCode9 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num7 = this.graduation;
        int hashCode11 = (hashCode10 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.id;
        int hashCode12 = (hashCode11 + (num8 == null ? 0 : num8.hashCode())) * 31;
        String str5 = this.name;
        int hashCode13 = (hashCode12 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num9 = this.universityGroupId;
        return hashCode13 + (num9 != null ? num9.hashCode() : 0);
    }

    public final Integer i() {
        return this.graduation;
    }

    public final String j() {
        return this.name;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UsersUniversityDto(chair=");
        sb.append(this.chair);
        sb.append(", chairName=");
        sb.append(this.chairName);
        sb.append(", city=");
        sb.append(this.city);
        sb.append(", country=");
        sb.append(this.country);
        sb.append(", educationForm=");
        sb.append(this.educationForm);
        sb.append(", educationFormId=");
        sb.append(this.educationFormId);
        sb.append(", educationStatus=");
        sb.append(this.educationStatus);
        sb.append(", educationStatusId=");
        sb.append(this.educationStatusId);
        sb.append(", faculty=");
        sb.append(this.faculty);
        sb.append(", facultyName=");
        sb.append(this.facultyName);
        sb.append(", graduation=");
        sb.append(this.graduation);
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", universityGroupId=");
        return uqi.b(sb, this.universityGroupId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.chair;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.chairName);
        Integer num2 = this.city;
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
        parcel.writeString(this.educationForm);
        Integer num4 = this.educationFormId;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num4);
        }
        parcel.writeString(this.educationStatus);
        Integer num5 = this.educationStatusId;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num5);
        }
        Integer num6 = this.faculty;
        if (num6 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num6);
        }
        parcel.writeString(this.facultyName);
        Integer num7 = this.graduation;
        if (num7 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num7);
        }
        Integer num8 = this.id;
        if (num8 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num8);
        }
        parcel.writeString(this.name);
        Integer num9 = this.universityGroupId;
        if (num9 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num9);
        }
    }

    public UsersUniversityDto(Integer num, String str, Integer num2, Integer num3, String str2, Integer num4, String str3, Integer num5, Integer num6, String str4, Integer num7, Integer num8, String str5, Integer num9) {
        this.chair = num;
        this.chairName = str;
        this.city = num2;
        this.country = num3;
        this.educationForm = str2;
        this.educationFormId = num4;
        this.educationStatus = str3;
        this.educationStatusId = num5;
        this.faculty = num6;
        this.facultyName = str4;
        this.graduation = num7;
        this.id = num8;
        this.name = str5;
        this.universityGroupId = num9;
    }

    public /* synthetic */ UsersUniversityDto(Integer num, String str, Integer num2, Integer num3, String str2, Integer num4, String str3, Integer num5, Integer num6, String str4, Integer num7, Integer num8, String str5, Integer num9, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? null : num3, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : num4, (i & 64) != 0 ? null : str3, (i & 128) != 0 ? null : num5, (i & 256) != 0 ? null : num6, (i & 512) != 0 ? null : str4, (i & 1024) != 0 ? null : num7, (i & 2048) != 0 ? null : num8, (i & 4096) != 0 ? null : str5, (i & 8192) != 0 ? null : num9);
    }
}
