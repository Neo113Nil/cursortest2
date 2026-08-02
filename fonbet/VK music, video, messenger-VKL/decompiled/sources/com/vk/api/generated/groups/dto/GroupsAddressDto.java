package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.api.generated.base.dto.BaseCountryDto;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.database.dto.DatabaseCityByIdDto;
import com.vk.api.generated.database.dto.DatabaseStationDto;
import com.vk.push.core.analytics.AnalyticsBaseParamsConstantsKt;
import io.reactivex.rxjava3.subjects.b;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.sn;
import xsna.uqi;
import xsna.zcl;

/* compiled from: GroupsAddressDto.kt */
/* loaded from: classes14.dex */
public final class GroupsAddressDto implements Parcelable {
    public static final Parcelable.Creator<GroupsAddressDto> CREATOR = new a();

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

    @pmi0("has_vk_taxi")
    private final Boolean hasVkTaxi;

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

    @pmi0("open_status")
    private final GroupsOpenStatusDto openStatus;

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

    @pmi0("vk_taxi_icon")
    private final List<BaseImageDto> vkTaxiIcon;

    @pmi0("work_info_status")
    private final GroupsAddressWorkInfoStatusDto workInfoStatus;

    /* compiled from: GroupsAddressDto.kt */
    public static final class a implements Parcelable.Creator<GroupsAddressDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsAddressDto createFromParcel(Parcel parcel) {
            int i;
            GroupsOpenStatusDto createFromParcel;
            int i2;
            GroupsAddressWorkInfoStatusDto createFromParcel2;
            Boolean valueOf;
            String str;
            ArrayList arrayList;
            String str2;
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            DatabaseCityByIdDto createFromParcel3 = parcel.readInt() == 0 ? null : DatabaseCityByIdDto.CREATOR.createFromParcel(parcel);
            DatabaseStationDto createFromParcel4 = parcel.readInt() == 0 ? null : DatabaseStationDto.CREATOR.createFromParcel(parcel);
            BaseCountryDto createFromParcel5 = parcel.readInt() == 0 ? null : BaseCountryDto.CREATOR.createFromParcel(parcel);
            Integer valueOf4 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Float valueOf5 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            Float valueOf6 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            Integer valueOf7 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString3 = parcel.readString();
            Integer valueOf8 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            GroupsAddressTimetableDto createFromParcel6 = parcel.readInt() == 0 ? null : GroupsAddressTimetableDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                i = readInt;
                createFromParcel = null;
            } else {
                i = readInt;
                createFromParcel = GroupsOpenStatusDto.CREATOR.createFromParcel(parcel);
            }
            GroupsOpenStatusDto groupsOpenStatusDto = createFromParcel;
            int i3 = i;
            String readString4 = parcel.readString();
            if (parcel.readInt() == 0) {
                i2 = i3;
                createFromParcel2 = null;
            } else {
                i2 = i3;
                createFromParcel2 = GroupsAddressWorkInfoStatusDto.CREATOR.createFromParcel(parcel);
            }
            GroupsAddressWorkInfoStatusDto groupsAddressWorkInfoStatusDto = createFromParcel2;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                str = readString;
                str2 = readString2;
                arrayList = null;
            } else {
                int readInt2 = parcel.readInt();
                str = readString;
                arrayList = new ArrayList(readInt2);
                str2 = readString2;
                int i4 = 0;
                while (i4 != readInt2) {
                    i4 = en.a(BaseImageDto.CREATOR, parcel, arrayList, i4, 1);
                    readInt2 = readInt2;
                    valueOf2 = valueOf2;
                }
            }
            return new GroupsAddressDto(i2, str, str2, valueOf2, valueOf3, createFromParcel3, createFromParcel4, createFromParcel5, valueOf4, valueOf5, valueOf6, valueOf7, readString3, valueOf8, createFromParcel6, groupsOpenStatusDto, readString4, groupsAddressWorkInfoStatusDto, valueOf, arrayList, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsAddressDto[] newArray(int i) {
            return new GroupsAddressDto[i];
        }
    }

    public GroupsAddressDto(int i, String str, String str2, Integer num, Integer num2, DatabaseCityByIdDto databaseCityByIdDto, DatabaseStationDto databaseStationDto, BaseCountryDto baseCountryDto, Integer num3, Float f, Float f2, Integer num4, String str3, Integer num5, GroupsAddressTimetableDto groupsAddressTimetableDto, GroupsOpenStatusDto groupsOpenStatusDto, String str4, GroupsAddressWorkInfoStatusDto groupsAddressWorkInfoStatusDto, Boolean bool, List<BaseImageDto> list, Integer num6) {
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
        this.openStatus = groupsOpenStatusDto;
        this.title = str4;
        this.workInfoStatus = groupsAddressWorkInfoStatusDto;
        this.hasVkTaxi = bool;
        this.vkTaxiIcon = list;
        this.placeId = num6;
    }

    public final GroupsOpenStatusDto B() {
        return this.openStatus;
    }

    public final String C() {
        return this.phone;
    }

    public final Integer D() {
        return this.timeOffset;
    }

    public final GroupsAddressTimetableDto F() {
        return this.timetable;
    }

    public final List<BaseImageDto> G() {
        return this.vkTaxiIcon;
    }

    public final GroupsAddressWorkInfoStatusDto K() {
        return this.workInfoStatus;
    }

    public final String d() {
        return this.additionalAddress;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.address;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsAddressDto)) {
            return false;
        }
        GroupsAddressDto groupsAddressDto = (GroupsAddressDto) obj;
        return this.id == groupsAddressDto.id && epx.f(this.additionalAddress, groupsAddressDto.additionalAddress) && epx.f(this.address, groupsAddressDto.address) && epx.f(this.cityId, groupsAddressDto.cityId) && epx.f(this.countryId, groupsAddressDto.countryId) && epx.f(this.city, groupsAddressDto.city) && epx.f(this.metroStation, groupsAddressDto.metroStation) && epx.f(this.country, groupsAddressDto.country) && epx.f(this.distance, groupsAddressDto.distance) && epx.f(this.latitude, groupsAddressDto.latitude) && epx.f(this.longitude, groupsAddressDto.longitude) && epx.f(this.metroStationId, groupsAddressDto.metroStationId) && epx.f(this.phone, groupsAddressDto.phone) && epx.f(this.timeOffset, groupsAddressDto.timeOffset) && epx.f(this.timetable, groupsAddressDto.timetable) && epx.f(this.openStatus, groupsAddressDto.openStatus) && epx.f(this.title, groupsAddressDto.title) && this.workInfoStatus == groupsAddressDto.workInfoStatus && epx.f(this.hasVkTaxi, groupsAddressDto.hasVkTaxi) && epx.f(this.vkTaxiIcon, groupsAddressDto.vkTaxiIcon) && epx.f(this.placeId, groupsAddressDto.placeId);
    }

    public final DatabaseCityByIdDto f() {
        return this.city;
    }

    public final Integer g() {
        return this.cityId;
    }

    public final int getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
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
        GroupsOpenStatusDto groupsOpenStatusDto = this.openStatus;
        int hashCode16 = (hashCode15 + (groupsOpenStatusDto == null ? 0 : groupsOpenStatusDto.hashCode())) * 31;
        String str4 = this.title;
        int hashCode17 = (hashCode16 + (str4 == null ? 0 : str4.hashCode())) * 31;
        GroupsAddressWorkInfoStatusDto groupsAddressWorkInfoStatusDto = this.workInfoStatus;
        int hashCode18 = (hashCode17 + (groupsAddressWorkInfoStatusDto == null ? 0 : groupsAddressWorkInfoStatusDto.hashCode())) * 31;
        Boolean bool = this.hasVkTaxi;
        int hashCode19 = (hashCode18 + (bool == null ? 0 : bool.hashCode())) * 31;
        List<BaseImageDto> list = this.vkTaxiIcon;
        int hashCode20 = (hashCode19 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num6 = this.placeId;
        return hashCode20 + (num6 != null ? num6.hashCode() : 0);
    }

    public final BaseCountryDto i() {
        return this.country;
    }

    public final Integer j() {
        return this.countryId;
    }

    public final Integer k() {
        return this.distance;
    }

    public final Boolean l() {
        return this.hasVkTaxi;
    }

    public final Float n() {
        return this.latitude;
    }

    public final Float o() {
        return this.longitude;
    }

    public final DatabaseStationDto p() {
        return this.metroStation;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupsAddressDto(id=");
        sb.append(this.id);
        sb.append(", additionalAddress=");
        sb.append(this.additionalAddress);
        sb.append(", address=");
        sb.append(this.address);
        sb.append(", cityId=");
        sb.append(this.cityId);
        sb.append(", countryId=");
        sb.append(this.countryId);
        sb.append(", city=");
        sb.append(this.city);
        sb.append(", metroStation=");
        sb.append(this.metroStation);
        sb.append(", country=");
        sb.append(this.country);
        sb.append(", distance=");
        sb.append(this.distance);
        sb.append(", latitude=");
        sb.append(this.latitude);
        sb.append(", longitude=");
        sb.append(this.longitude);
        sb.append(", metroStationId=");
        sb.append(this.metroStationId);
        sb.append(", phone=");
        sb.append(this.phone);
        sb.append(", timeOffset=");
        sb.append(this.timeOffset);
        sb.append(", timetable=");
        sb.append(this.timetable);
        sb.append(", openStatus=");
        sb.append(this.openStatus);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", workInfoStatus=");
        sb.append(this.workInfoStatus);
        sb.append(", hasVkTaxi=");
        sb.append(this.hasVkTaxi);
        sb.append(", vkTaxiIcon=");
        sb.append(this.vkTaxiIcon);
        sb.append(", placeId=");
        return uqi.b(sb, this.placeId, ')');
    }

    public final Integer u() {
        return this.metroStationId;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeString(this.additionalAddress);
        parcel.writeString(this.address);
        Integer num = this.cityId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.countryId;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        DatabaseCityByIdDto databaseCityByIdDto = this.city;
        if (databaseCityByIdDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            databaseCityByIdDto.writeToParcel(parcel, i);
        }
        DatabaseStationDto databaseStationDto = this.metroStation;
        if (databaseStationDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            databaseStationDto.writeToParcel(parcel, i);
        }
        BaseCountryDto baseCountryDto = this.country;
        if (baseCountryDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseCountryDto.writeToParcel(parcel, i);
        }
        Integer num3 = this.distance;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num3);
        }
        Float f = this.latitude;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            b.d(parcel, 1, f);
        }
        Float f2 = this.longitude;
        if (f2 == null) {
            parcel.writeInt(0);
        } else {
            b.d(parcel, 1, f2);
        }
        Integer num4 = this.metroStationId;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num4);
        }
        parcel.writeString(this.phone);
        Integer num5 = this.timeOffset;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num5);
        }
        GroupsAddressTimetableDto groupsAddressTimetableDto = this.timetable;
        if (groupsAddressTimetableDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsAddressTimetableDto.writeToParcel(parcel, i);
        }
        GroupsOpenStatusDto groupsOpenStatusDto = this.openStatus;
        if (groupsOpenStatusDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsOpenStatusDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.title);
        GroupsAddressWorkInfoStatusDto groupsAddressWorkInfoStatusDto = this.workInfoStatus;
        if (groupsAddressWorkInfoStatusDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsAddressWorkInfoStatusDto.writeToParcel(parcel, i);
        }
        Boolean bool = this.hasVkTaxi;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        List<BaseImageDto> list = this.vkTaxiIcon;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f3 = dn.f(parcel, list, 1);
            while (f3.hasNext()) {
                ((BaseImageDto) f3.next()).writeToParcel(parcel, i);
            }
        }
        Integer num6 = this.placeId;
        if (num6 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num6);
        }
    }

    public /* synthetic */ GroupsAddressDto(int i, String str, String str2, Integer num, Integer num2, DatabaseCityByIdDto databaseCityByIdDto, DatabaseStationDto databaseStationDto, BaseCountryDto baseCountryDto, Integer num3, Float f, Float f2, Integer num4, String str3, Integer num5, GroupsAddressTimetableDto groupsAddressTimetableDto, GroupsOpenStatusDto groupsOpenStatusDto, String str4, GroupsAddressWorkInfoStatusDto groupsAddressWorkInfoStatusDto, Boolean bool, List list, Integer num6, int i2, zcl zclVar) {
        this(i, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : num, (i2 & 16) != 0 ? null : num2, (i2 & 32) != 0 ? null : databaseCityByIdDto, (i2 & 64) != 0 ? null : databaseStationDto, (i2 & 128) != 0 ? null : baseCountryDto, (i2 & 256) != 0 ? null : num3, (i2 & 512) != 0 ? null : f, (i2 & 1024) != 0 ? null : f2, (i2 & 2048) != 0 ? null : num4, (i2 & 4096) != 0 ? null : str3, (i2 & 8192) != 0 ? null : num5, (i2 & 16384) != 0 ? null : groupsAddressTimetableDto, (i2 & 32768) != 0 ? null : groupsOpenStatusDto, (i2 & 65536) != 0 ? null : str4, (i2 & 131072) != 0 ? null : groupsAddressWorkInfoStatusDto, (i2 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : bool, (i2 & 524288) != 0 ? null : list, (i2 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : num6);
    }
}
