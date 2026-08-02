package com.vk.sdk.api.users.dto;

import xsna.epx;
import xsna.kr;
import xsna.mq;
import xsna.pmi0;
import xsna.sq;
import xsna.zcl;

/* compiled from: UsersUniversityDto.kt */
/* loaded from: classes5.dex */
public final class UsersUniversityDto {

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

    public UsersUniversityDto() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
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

    public final String toString() {
        Integer num = this.chair;
        String str = this.chairName;
        Integer num2 = this.city;
        Integer num3 = this.country;
        String str2 = this.educationForm;
        Integer num4 = this.educationFormId;
        String str3 = this.educationStatus;
        Integer num5 = this.educationStatusId;
        Integer num6 = this.faculty;
        String str4 = this.facultyName;
        Integer num7 = this.graduation;
        Integer num8 = this.id;
        String str5 = this.name;
        Integer num9 = this.universityGroupId;
        StringBuilder sb = new StringBuilder("UsersUniversityDto(chair=");
        sb.append(num);
        sb.append(", chairName=");
        sb.append(str);
        sb.append(", city=");
        sq.b(sb, num2, ", country=", num3, ", educationForm=");
        kr.b(num4, str2, ", educationFormId=", ", educationStatus=", sb);
        kr.b(num5, str3, ", educationStatusId=", ", faculty=", sb);
        mq.b(num6, ", facultyName=", str4, ", graduation=", sb);
        sq.b(sb, num7, ", id=", num8, ", name=");
        sb.append(str5);
        sb.append(", universityGroupId=");
        sb.append(num9);
        sb.append(")");
        return sb.toString();
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
