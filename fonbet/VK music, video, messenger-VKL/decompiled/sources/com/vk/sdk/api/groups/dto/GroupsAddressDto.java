package com.vk.sdk.api.groups.dto;

import com.vk.push.core.analytics.AnalyticsBaseParamsConstantsKt;
import com.vk.sdk.api.base.dto.BaseCountryDto;
import com.vk.sdk.api.database.dto.DatabaseCityByIdDto;
import com.vk.sdk.api.database.dto.DatabaseStationDto;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;
import xsna.epx;
import xsna.kh10;
import xsna.kr;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: GroupsAddressDto.kt */
/* loaded from: classes5.dex */
public final class GroupsAddressDto {

    @pmi0("additional_address")
    private final String additionalAddress;

    @pmi0(RTCStatsConstants.KEY_ADDRESS)
    private final String address;

    @pmi0("city")
    private final DatabaseCityByIdDto city;

    @pmi0("city_id")
    private final Integer cityId;

    @pmi0("country")
    private final BaseCountryDto country;

    @pmi0(AnalyticsBaseParamsConstantsKt.COUNTRY_ID)
    private final Integer countryId;

    @pmi0("distance")
    private final Integer distance;

    @pmi0("id")
    private final int id;

    @pmi0("latitude")
    private final Float latitude;

    @pmi0("longitude")
    private final Float longitude;

    @pmi0("metro_station")
    private final DatabaseStationDto metroStation;

    @pmi0("metro_station_id")
    private final Integer metroStationId;

    @pmi0("phone")
    private final String phone;

    @pmi0("place_id")
    private final Integer placeId;

    @pmi0("time_offset")
    private final Integer timeOffset;

    @pmi0("timetable")
    private final GroupsAddressTimetableDto timetable;

    @pmi0("title")
    private final String title;

    @pmi0("work_info_status")
    private final GroupsAddressWorkInfoStatusDto workInfoStatus;

    public GroupsAddressDto(int i, String str, String str2, Integer num, Integer num2, DatabaseCityByIdDto databaseCityByIdDto, DatabaseStationDto databaseStationDto, BaseCountryDto baseCountryDto, Integer num3, Float f, Float f2, Integer num4, String str3, Integer num5, GroupsAddressTimetableDto groupsAddressTimetableDto, String str4, GroupsAddressWorkInfoStatusDto groupsAddressWorkInfoStatusDto, Integer num6) {
        this.id = i;
        this.additionalAddress = str;
        this.address = str2;
        this.cityId = num;
        this.countryId = num2;
        this.city = databaseCityByIdDto;
        this.metroStation = databaseStationDto;
        this.country = baseCountryDto;
        this.distance = num3;
        this.latitude = f;
        this.longitude = f2;
        this.metroStationId = num4;
        this.phone = str3;
        this.timeOffset = num5;
        this.timetable = groupsAddressTimetableDto;
        this.title = str4;
        this.workInfoStatus = groupsAddressWorkInfoStatusDto;
        this.placeId = num6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsAddressDto)) {
            return false;
        }
        GroupsAddressDto groupsAddressDto = (GroupsAddressDto) obj;
        return this.id == groupsAddressDto.id && epx.f(this.additionalAddress, groupsAddressDto.additionalAddress) && epx.f(this.address, groupsAddressDto.address) && epx.f(this.cityId, groupsAddressDto.cityId) && epx.f(this.countryId, groupsAddressDto.countryId) && epx.f(this.city, groupsAddressDto.city) && epx.f(this.metroStation, groupsAddressDto.metroStation) && epx.f(this.country, groupsAddressDto.country) && epx.f(this.distance, groupsAddressDto.distance) && epx.f(this.latitude, groupsAddressDto.latitude) && epx.f(this.longitude, groupsAddressDto.longitude) && epx.f(this.metroStationId, groupsAddressDto.metroStationId) && epx.f(this.phone, groupsAddressDto.phone) && epx.f(this.timeOffset, groupsAddressDto.timeOffset) && epx.f(this.timetable, groupsAddressDto.timetable) && epx.f(this.title, groupsAddressDto.title) && this.workInfoStatus == groupsAddressDto.workInfoStatus && epx.f(this.placeId, groupsAddressDto.placeId);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.id) * 31;
        String str = this.additionalAddress;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.address;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.cityId;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.countryId;
        int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        DatabaseCityByIdDto databaseCityByIdDto = this.city;
        int hashCode6 = (hashCode5 + (databaseCityByIdDto == null ? 0 : databaseCityByIdDto.hashCode())) * 31;
        DatabaseStationDto databaseStationDto = this.metroStation;
        int hashCode7 = (hashCode6 + (databaseStationDto == null ? 0 : databaseStationDto.hashCode())) * 31;
        BaseCountryDto baseCountryDto = this.country;
        int hashCode8 = (hashCode7 + (baseCountryDto == null ? 0 : baseCountryDto.hashCode())) * 31;
        Integer num3 = this.distance;
        int hashCode9 = (hashCode8 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Float f = this.latitude;
        int hashCode10 = (hashCode9 + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.longitude;
        int hashCode11 = (hashCode10 + (f2 == null ? 0 : f2.hashCode())) * 31;
        Integer num4 = this.metroStationId;
        int hashCode12 = (hashCode11 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str3 = this.phone;
        int hashCode13 = (hashCode12 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num5 = this.timeOffset;
        int hashCode14 = (hashCode13 + (num5 == null ? 0 : num5.hashCode())) * 31;
        GroupsAddressTimetableDto groupsAddressTimetableDto = this.timetable;
        int hashCode15 = (hashCode14 + (groupsAddressTimetableDto == null ? 0 : groupsAddressTimetableDto.hashCode())) * 31;
        String str4 = this.title;
        int hashCode16 = (hashCode15 + (str4 == null ? 0 : str4.hashCode())) * 31;
        GroupsAddressWorkInfoStatusDto groupsAddressWorkInfoStatusDto = this.workInfoStatus;
        int hashCode17 = (hashCode16 + (groupsAddressWorkInfoStatusDto == null ? 0 : groupsAddressWorkInfoStatusDto.hashCode())) * 31;
        Integer num6 = this.placeId;
        return hashCode17 + (num6 != null ? num6.hashCode() : 0);
    }

    public final String toString() {
        int i = this.id;
        String str = this.additionalAddress;
        String str2 = this.address;
        Integer num = this.cityId;
        Integer num2 = this.countryId;
        DatabaseCityByIdDto databaseCityByIdDto = this.city;
        DatabaseStationDto databaseStationDto = this.metroStation;
        BaseCountryDto baseCountryDto = this.country;
        Integer num3 = this.distance;
        Float f = this.latitude;
        Float f2 = this.longitude;
        Integer num4 = this.metroStationId;
        String str3 = this.phone;
        Integer num5 = this.timeOffset;
        GroupsAddressTimetableDto groupsAddressTimetableDto = this.timetable;
        String str4 = this.title;
        GroupsAddressWorkInfoStatusDto groupsAddressWorkInfoStatusDto = this.workInfoStatus;
        Integer num6 = this.placeId;
        StringBuilder a = kh10.a(i, "GroupsAddressDto(id=", ", additionalAddress=", str, ", address=");
        kr.b(num, str2, ", cityId=", ", countryId=", a);
        a.append(num2);
        a.append(", city=");
        a.append(databaseCityByIdDto);
        a.append(", metroStation=");
        a.append(databaseStationDto);
        a.append(", country=");
        a.append(baseCountryDto);
        a.append(", distance=");
        a.append(num3);
        a.append(", latitude=");
        a.append(f);
        a.append(", longitude=");
        a.append(f2);
        a.append(", metroStationId=");
        a.append(num4);
        a.append(", phone=");
        kr.b(num5, str3, ", timeOffset=", ", timetable=", a);
        a.append(groupsAddressTimetableDto);
        a.append(", title=");
        a.append(str4);
        a.append(", workInfoStatus=");
        a.append(groupsAddressWorkInfoStatusDto);
        a.append(", placeId=");
        a.append(num6);
        a.append(")");
        return a.toString();
    }

    public /* synthetic */ GroupsAddressDto(int i, String str, String str2, Integer num, Integer num2, DatabaseCityByIdDto databaseCityByIdDto, DatabaseStationDto databaseStationDto, BaseCountryDto baseCountryDto, Integer num3, Float f, Float f2, Integer num4, String str3, Integer num5, GroupsAddressTimetableDto groupsAddressTimetableDto, String str4, GroupsAddressWorkInfoStatusDto groupsAddressWorkInfoStatusDto, Integer num6, int i2, zcl zclVar) {
        this(i, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : num, (i2 & 16) != 0 ? null : num2, (i2 & 32) != 0 ? null : databaseCityByIdDto, (i2 & 64) != 0 ? null : databaseStationDto, (i2 & 128) != 0 ? null : baseCountryDto, (i2 & 256) != 0 ? null : num3, (i2 & 512) != 0 ? null : f, (i2 & 1024) != 0 ? null : f2, (i2 & 2048) != 0 ? null : num4, (i2 & 4096) != 0 ? null : str3, (i2 & 8192) != 0 ? null : num5, (i2 & 16384) != 0 ? null : groupsAddressTimetableDto, (i2 & 32768) != 0 ? null : str4, (i2 & 65536) != 0 ? null : groupsAddressWorkInfoStatusDto, (i2 & 131072) != 0 ? null : num6);
    }
}
