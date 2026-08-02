package com.vk.sdk.api.users.dto;

import xsna.epx;
import xsna.mq;
import xsna.n6j;
import xsna.pmi0;
import xsna.sq;
import xsna.zcl;

/* compiled from: UsersSchoolDto.kt */
/* loaded from: classes5.dex */
public final class UsersSchoolDto {

    @pmi0("city")
    private final Integer city;

    /* renamed from: class, reason: not valid java name */
    @pmi0("class")
    private final String f39class;

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

    public UsersSchoolDto() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UsersSchoolDto)) {
            return false;
        }
        UsersSchoolDto usersSchoolDto = (UsersSchoolDto) obj;
        return epx.f(this.city, usersSchoolDto.city) && epx.f(this.f39class, usersSchoolDto.f39class) && epx.f(this.classId, usersSchoolDto.classId) && epx.f(this.country, usersSchoolDto.country) && epx.f(this.id, usersSchoolDto.id) && epx.f(this.name, usersSchoolDto.name) && epx.f(this.type, usersSchoolDto.type) && epx.f(this.typeStr, usersSchoolDto.typeStr) && epx.f(this.yearFrom, usersSchoolDto.yearFrom) && epx.f(this.yearGraduated, usersSchoolDto.yearGraduated) && epx.f(this.yearTo, usersSchoolDto.yearTo) && epx.f(this.speciality, usersSchoolDto.speciality);
    }

    public final int hashCode() {
        Integer num = this.city;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f39class;
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

    public final String toString() {
        Integer num = this.city;
        String str = this.f39class;
        Integer num2 = this.classId;
        Integer num3 = this.country;
        String str2 = this.id;
        String str3 = this.name;
        Integer num4 = this.type;
        String str4 = this.typeStr;
        Integer num5 = this.yearFrom;
        Integer num6 = this.yearGraduated;
        Integer num7 = this.yearTo;
        String str5 = this.speciality;
        StringBuilder sb = new StringBuilder("UsersSchoolDto(city=");
        sb.append(num);
        sb.append(", class=");
        sb.append(str);
        sb.append(", classId=");
        sq.b(sb, num2, ", country=", num3, ", id=");
        n6j.b(sb, str2, ", name=", str3, ", type=");
        mq.b(num4, ", typeStr=", str4, ", yearFrom=", sb);
        sq.b(sb, num5, ", yearGraduated=", num6, ", yearTo=");
        sb.append(num7);
        sb.append(", speciality=");
        sb.append(str5);
        sb.append(")");
        return sb.toString();
    }

    public UsersSchoolDto(Integer num, String str, Integer num2, Integer num3, String str2, String str3, Integer num4, String str4, Integer num5, Integer num6, Integer num7, String str5) {
        this.city = num;
        this.f39class = str;
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
