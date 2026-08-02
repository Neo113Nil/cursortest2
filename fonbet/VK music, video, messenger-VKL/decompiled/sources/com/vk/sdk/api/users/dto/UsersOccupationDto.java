package com.vk.sdk.api.users.dto;

import com.vk.push.core.analytics.AnalyticsBaseParamsConstantsKt;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: UsersOccupationDto.kt */
/* loaded from: classes5.dex */
public final class UsersOccupationDto {

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
    public static final class TypeDto {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;

        @pmi0("school")
        public static final TypeDto SCHOOL;

        @pmi0("university")
        public static final TypeDto UNIVERSITY;

        @pmi0("work")
        public static final TypeDto WORK;
        private final String value;

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
    }

    public UsersOccupationDto() {
        this(null, null, null, null, null, null, 63, null);
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
        return "UsersOccupationDto(id=" + this.id + ", name=" + this.name + ", type=" + this.type + ", graduateYear=" + this.graduateYear + ", countryId=" + this.countryId + ", cityId=" + this.cityId + ")";
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
