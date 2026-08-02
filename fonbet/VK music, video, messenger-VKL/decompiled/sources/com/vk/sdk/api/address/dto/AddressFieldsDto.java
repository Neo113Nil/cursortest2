package com.vk.sdk.api.address.dto;

import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.vk.push.core.analytics.AnalyticsBaseParamsConstantsKt;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AddressFieldsDto.kt */
/* loaded from: classes5.dex */
public final class AddressFieldsDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AddressFieldsDto[] $VALUES;

    @pmi0("additional_address")
    public static final AddressFieldsDto ADDITIONAL_ADDRESS;

    @pmi0(RTCStatsConstants.KEY_ADDRESS)
    public static final AddressFieldsDto ADDRESS;

    @pmi0("city")
    public static final AddressFieldsDto CITY;

    @pmi0("city_id")
    public static final AddressFieldsDto CITY_ID;

    @pmi0("country")
    public static final AddressFieldsDto COUNTRY;

    @pmi0(AnalyticsBaseParamsConstantsKt.COUNTRY_ID)
    public static final AddressFieldsDto COUNTRY_ID;

    @pmi0("distance")
    public static final AddressFieldsDto DISTANCE;

    @pmi0("has_vk_taxi")
    public static final AddressFieldsDto HAS_VK_TAXI;

    @pmi0("id")
    public static final AddressFieldsDto ID;

    @pmi0("latitude")
    public static final AddressFieldsDto LATITUDE;

    @pmi0("longitude")
    public static final AddressFieldsDto LONGITUDE;

    @pmi0("metro_station")
    public static final AddressFieldsDto METRO_STATION;

    @pmi0("metro_station_id")
    public static final AddressFieldsDto METRO_STATION_ID;

    @pmi0("phone")
    public static final AddressFieldsDto PHONE;

    @pmi0("timetable")
    public static final AddressFieldsDto TIMETABLE;

    @pmi0("time_offset")
    public static final AddressFieldsDto TIME_OFFSET;

    @pmi0("title")
    public static final AddressFieldsDto TITLE;

    @pmi0("vk_taxi_icon")
    public static final AddressFieldsDto VK_TAXI_ICON;

    @pmi0("work_info_status")
    public static final AddressFieldsDto WORK_INFO_STATUS;
    private final String value;

    static {
        AddressFieldsDto addressFieldsDto = new AddressFieldsDto("ID", 0, "id");
        ID = addressFieldsDto;
        AddressFieldsDto addressFieldsDto2 = new AddressFieldsDto(NativeAdContent.ViewTag.AD_TITLE, 1, "title");
        TITLE = addressFieldsDto2;
        AddressFieldsDto addressFieldsDto3 = new AddressFieldsDto("ADDRESS", 2, RTCStatsConstants.KEY_ADDRESS);
        ADDRESS = addressFieldsDto3;
        AddressFieldsDto addressFieldsDto4 = new AddressFieldsDto("ADDITIONAL_ADDRESS", 3, "additional_address");
        ADDITIONAL_ADDRESS = addressFieldsDto4;
        AddressFieldsDto addressFieldsDto5 = new AddressFieldsDto("COUNTRY_ID", 4, AnalyticsBaseParamsConstantsKt.COUNTRY_ID);
        COUNTRY_ID = addressFieldsDto5;
        AddressFieldsDto addressFieldsDto6 = new AddressFieldsDto("COUNTRY", 5, "country");
        COUNTRY = addressFieldsDto6;
        AddressFieldsDto addressFieldsDto7 = new AddressFieldsDto("CITY_ID", 6, "city_id");
        CITY_ID = addressFieldsDto7;
        AddressFieldsDto addressFieldsDto8 = new AddressFieldsDto("CITY", 7, "city");
        CITY = addressFieldsDto8;
        AddressFieldsDto addressFieldsDto9 = new AddressFieldsDto("METRO_STATION_ID", 8, "metro_station_id");
        METRO_STATION_ID = addressFieldsDto9;
        AddressFieldsDto addressFieldsDto10 = new AddressFieldsDto("METRO_STATION", 9, "metro_station");
        METRO_STATION = addressFieldsDto10;
        AddressFieldsDto addressFieldsDto11 = new AddressFieldsDto("LATITUDE", 10, "latitude");
        LATITUDE = addressFieldsDto11;
        AddressFieldsDto addressFieldsDto12 = new AddressFieldsDto("LONGITUDE", 11, "longitude");
        LONGITUDE = addressFieldsDto12;
        AddressFieldsDto addressFieldsDto13 = new AddressFieldsDto("DISTANCE", 12, "distance");
        DISTANCE = addressFieldsDto13;
        AddressFieldsDto addressFieldsDto14 = new AddressFieldsDto("WORK_INFO_STATUS", 13, "work_info_status");
        WORK_INFO_STATUS = addressFieldsDto14;
        AddressFieldsDto addressFieldsDto15 = new AddressFieldsDto("TIMETABLE", 14, "timetable");
        TIMETABLE = addressFieldsDto15;
        AddressFieldsDto addressFieldsDto16 = new AddressFieldsDto("PHONE", 15, "phone");
        PHONE = addressFieldsDto16;
        AddressFieldsDto addressFieldsDto17 = new AddressFieldsDto("TIME_OFFSET", 16, "time_offset");
        TIME_OFFSET = addressFieldsDto17;
        AddressFieldsDto addressFieldsDto18 = new AddressFieldsDto("HAS_VK_TAXI", 17, "has_vk_taxi");
        HAS_VK_TAXI = addressFieldsDto18;
        AddressFieldsDto addressFieldsDto19 = new AddressFieldsDto("VK_TAXI_ICON", 18, "vk_taxi_icon");
        VK_TAXI_ICON = addressFieldsDto19;
        AddressFieldsDto[] addressFieldsDtoArr = {addressFieldsDto, addressFieldsDto2, addressFieldsDto3, addressFieldsDto4, addressFieldsDto5, addressFieldsDto6, addressFieldsDto7, addressFieldsDto8, addressFieldsDto9, addressFieldsDto10, addressFieldsDto11, addressFieldsDto12, addressFieldsDto13, addressFieldsDto14, addressFieldsDto15, addressFieldsDto16, addressFieldsDto17, addressFieldsDto18, addressFieldsDto19};
        $VALUES = addressFieldsDtoArr;
        $ENTRIES = new asp(addressFieldsDtoArr);
    }

    private AddressFieldsDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AddressFieldsDto valueOf(String str) {
        return (AddressFieldsDto) Enum.valueOf(AddressFieldsDto.class, str);
    }

    public static AddressFieldsDto[] values() {
        return (AddressFieldsDto[]) $VALUES.clone();
    }
}
