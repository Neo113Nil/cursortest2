package com.vk.sdk.api.ads.dto;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import io.requery.android.database.sqlite.SQLiteDatabase;
import xsna.epx;
import xsna.i5s;
import xsna.n6j;
import xsna.pmi0;
import xsna.xe9;
import xsna.zcl;

/* compiled from: AdsTargSettingsDto.kt */
/* loaded from: classes5.dex */
public final class AdsTargSettingsDto {

    @pmi0("ab_test")
    private final String abTest;

    @pmi0("age_from")
    private final String ageFrom;

    @pmi0("age_to")
    private final String ageTo;

    @pmi0("apps")
    private final String apps;

    @pmi0("apps_not")
    private final String appsNot;

    @pmi0("birthday")
    private final String birthday;

    @pmi0("browsers")
    private final String browsers;

    @pmi0("campaign_id")
    private final String campaignId;

    @pmi0("cities")
    private final String cities;

    @pmi0("cities_not")
    private final String citiesNot;

    @pmi0("count")
    private final String count;

    @pmi0("country")
    private final String country;

    @pmi0("districts")
    private final String districts;

    @pmi0("geo_near")
    private final String geoNear;

    @pmi0("geo_point_type")
    private final String geoPointType;

    @pmi0("group_types")
    private final String groupTypes;

    @pmi0("groups")
    private final String groups;

    @pmi0("groups_active")
    private final String groupsActive;

    @pmi0("groups_active_formula")
    private final String groupsActiveFormula;

    @pmi0("groups_active_recommended")
    private final String groupsActiveRecommended;

    @pmi0("groups_formula")
    private final String groupsFormula;

    @pmi0("groups_not")
    private final String groupsNot;

    @pmi0("groups_recommended")
    private final String groupsRecommended;

    @pmi0("id")
    private final String id;

    @pmi0("interest_categories")
    private final String interestCategories;

    @pmi0("interest_categories_formula")
    private final String interestCategoriesFormula;

    @pmi0("interests")
    private final String interests;

    @pmi0("key_phrases")
    private final String keyPhrases;

    @pmi0("key_phrases_days")
    private final String keyPhrasesDays;

    @pmi0("mobile_apps_events_formula")
    private final String mobileAppsEventsFormula;

    @pmi0("mobile_manufacturers")
    private final String mobileManufacturers;

    @pmi0("mobile_os_max_version")
    private final String mobileOsMaxVersion;

    @pmi0("mobile_os_min_version")
    private final String mobileOsMinVersion;

    @pmi0("music_artists_formula")
    private final String musicArtistsFormula;

    @pmi0("operators")
    private final String operators;

    @pmi0("paying")
    private final String paying;

    @pmi0("positions")
    private final String positions;

    @pmi0("price_list_audience_type")
    private final String priceListAudienceType;

    @pmi0("price_list_id")
    private final String priceListId;

    @pmi0("price_list_retargeting_formula")
    private final String priceListRetargetingFormula;

    @pmi0("religions")
    private final String religions;

    @pmi0("retargeting_groups")
    private final String retargetingGroups;

    @pmi0("retargeting_groups_not")
    private final String retargetingGroupsNot;

    @pmi0("school_from")
    private final String schoolFrom;

    @pmi0("school_to")
    private final String schoolTo;

    @pmi0("schools")
    private final String schools;

    @pmi0("sex")
    private final AdsCriteriaSexDto sex;

    @pmi0("stations")
    private final String stations;

    @pmi0("statuses")
    private final String statuses;

    @pmi0("streets")
    private final String streets;

    @pmi0("suggested_criteria")
    private final String suggestedCriteria;

    @pmi0("tags")
    private final String tags;

    @pmi0("travellers")
    private final String travellers;

    @pmi0("uni_from")
    private final String uniFrom;

    @pmi0("uni_to")
    private final String uniTo;

    @pmi0("user_browsers")
    private final String userBrowsers;

    @pmi0("user_devices")
    private final String userDevices;

    @pmi0("user_os")
    private final String userOs;

    @pmi0("wifi_only")
    private final String wifiOnly;

    public AdsTargSettingsDto() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 134217727, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdsTargSettingsDto)) {
            return false;
        }
        AdsTargSettingsDto adsTargSettingsDto = (AdsTargSettingsDto) obj;
        return epx.f(this.id, adsTargSettingsDto.id) && epx.f(this.campaignId, adsTargSettingsDto.campaignId) && epx.f(this.ageFrom, adsTargSettingsDto.ageFrom) && epx.f(this.ageTo, adsTargSettingsDto.ageTo) && epx.f(this.apps, adsTargSettingsDto.apps) && epx.f(this.appsNot, adsTargSettingsDto.appsNot) && epx.f(this.birthday, adsTargSettingsDto.birthday) && epx.f(this.cities, adsTargSettingsDto.cities) && epx.f(this.citiesNot, adsTargSettingsDto.citiesNot) && epx.f(this.country, adsTargSettingsDto.country) && epx.f(this.districts, adsTargSettingsDto.districts) && epx.f(this.groups, adsTargSettingsDto.groups) && epx.f(this.interestCategories, adsTargSettingsDto.interestCategories) && epx.f(this.interests, adsTargSettingsDto.interests) && epx.f(this.paying, adsTargSettingsDto.paying) && epx.f(this.positions, adsTargSettingsDto.positions) && epx.f(this.religions, adsTargSettingsDto.religions) && epx.f(this.retargetingGroups, adsTargSettingsDto.retargetingGroups) && epx.f(this.retargetingGroupsNot, adsTargSettingsDto.retargetingGroupsNot) && epx.f(this.schoolFrom, adsTargSettingsDto.schoolFrom) && epx.f(this.schoolTo, adsTargSettingsDto.schoolTo) && epx.f(this.schools, adsTargSettingsDto.schools) && this.sex == adsTargSettingsDto.sex && epx.f(this.stations, adsTargSettingsDto.stations) && epx.f(this.statuses, adsTargSettingsDto.statuses) && epx.f(this.streets, adsTargSettingsDto.streets) && epx.f(this.travellers, adsTargSettingsDto.travellers) && epx.f(this.abTest, adsTargSettingsDto.abTest) && epx.f(this.uniFrom, adsTargSettingsDto.uniFrom) && epx.f(this.uniTo, adsTargSettingsDto.uniTo) && epx.f(this.userBrowsers, adsTargSettingsDto.userBrowsers) && epx.f(this.userDevices, adsTargSettingsDto.userDevices) && epx.f(this.userOs, adsTargSettingsDto.userOs) && epx.f(this.suggestedCriteria, adsTargSettingsDto.suggestedCriteria) && epx.f(this.groupsNot, adsTargSettingsDto.groupsNot) && epx.f(this.priceListAudienceType, adsTargSettingsDto.priceListAudienceType) && epx.f(this.count, adsTargSettingsDto.count) && epx.f(this.groupsActiveFormula, adsTargSettingsDto.groupsActiveFormula) && epx.f(this.interestCategoriesFormula, adsTargSettingsDto.interestCategoriesFormula) && epx.f(this.groupsFormula, adsTargSettingsDto.groupsFormula) && epx.f(this.groupsActive, adsTargSettingsDto.groupsActive) && epx.f(this.groupTypes, adsTargSettingsDto.groupTypes) && epx.f(this.keyPhrases, adsTargSettingsDto.keyPhrases) && epx.f(this.keyPhrasesDays, adsTargSettingsDto.keyPhrasesDays) && epx.f(this.geoNear, adsTargSettingsDto.geoNear) && epx.f(this.geoPointType, adsTargSettingsDto.geoPointType) && epx.f(this.priceListId, adsTargSettingsDto.priceListId) && epx.f(this.groupsRecommended, adsTargSettingsDto.groupsRecommended) && epx.f(this.groupsActiveRecommended, adsTargSettingsDto.groupsActiveRecommended) && epx.f(this.musicArtistsFormula, adsTargSettingsDto.musicArtistsFormula) && epx.f(this.priceListRetargetingFormula, adsTargSettingsDto.priceListRetargetingFormula) && epx.f(this.tags, adsTargSettingsDto.tags) && epx.f(this.browsers, adsTargSettingsDto.browsers) && epx.f(this.mobileOsMinVersion, adsTargSettingsDto.mobileOsMinVersion) && epx.f(this.mobileAppsEventsFormula, adsTargSettingsDto.mobileAppsEventsFormula) && epx.f(this.mobileOsMaxVersion, adsTargSettingsDto.mobileOsMaxVersion) && epx.f(this.operators, adsTargSettingsDto.operators) && epx.f(this.wifiOnly, adsTargSettingsDto.wifiOnly) && epx.f(this.mobileManufacturers, adsTargSettingsDto.mobileManufacturers);
    }

    public final int hashCode() {
        String str = this.id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.campaignId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.ageFrom;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.ageTo;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.apps;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.appsNot;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.birthday;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.cities;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.citiesNot;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.country;
        int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.districts;
        int hashCode11 = (hashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.groups;
        int hashCode12 = (hashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.interestCategories;
        int hashCode13 = (hashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.interests;
        int hashCode14 = (hashCode13 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.paying;
        int hashCode15 = (hashCode14 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.positions;
        int hashCode16 = (hashCode15 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.religions;
        int hashCode17 = (hashCode16 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.retargetingGroups;
        int hashCode18 = (hashCode17 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.retargetingGroupsNot;
        int hashCode19 = (hashCode18 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.schoolFrom;
        int hashCode20 = (hashCode19 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.schoolTo;
        int hashCode21 = (hashCode20 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.schools;
        int hashCode22 = (hashCode21 + (str22 == null ? 0 : str22.hashCode())) * 31;
        AdsCriteriaSexDto adsCriteriaSexDto = this.sex;
        int hashCode23 = (hashCode22 + (adsCriteriaSexDto == null ? 0 : adsCriteriaSexDto.hashCode())) * 31;
        String str23 = this.stations;
        int hashCode24 = (hashCode23 + (str23 == null ? 0 : str23.hashCode())) * 31;
        String str24 = this.statuses;
        int hashCode25 = (hashCode24 + (str24 == null ? 0 : str24.hashCode())) * 31;
        String str25 = this.streets;
        int hashCode26 = (hashCode25 + (str25 == null ? 0 : str25.hashCode())) * 31;
        String str26 = this.travellers;
        int hashCode27 = (hashCode26 + (str26 == null ? 0 : str26.hashCode())) * 31;
        String str27 = this.abTest;
        int hashCode28 = (hashCode27 + (str27 == null ? 0 : str27.hashCode())) * 31;
        String str28 = this.uniFrom;
        int hashCode29 = (hashCode28 + (str28 == null ? 0 : str28.hashCode())) * 31;
        String str29 = this.uniTo;
        int hashCode30 = (hashCode29 + (str29 == null ? 0 : str29.hashCode())) * 31;
        String str30 = this.userBrowsers;
        int hashCode31 = (hashCode30 + (str30 == null ? 0 : str30.hashCode())) * 31;
        String str31 = this.userDevices;
        int hashCode32 = (hashCode31 + (str31 == null ? 0 : str31.hashCode())) * 31;
        String str32 = this.userOs;
        int hashCode33 = (hashCode32 + (str32 == null ? 0 : str32.hashCode())) * 31;
        String str33 = this.suggestedCriteria;
        int hashCode34 = (hashCode33 + (str33 == null ? 0 : str33.hashCode())) * 31;
        String str34 = this.groupsNot;
        int hashCode35 = (hashCode34 + (str34 == null ? 0 : str34.hashCode())) * 31;
        String str35 = this.priceListAudienceType;
        int hashCode36 = (hashCode35 + (str35 == null ? 0 : str35.hashCode())) * 31;
        String str36 = this.count;
        int hashCode37 = (hashCode36 + (str36 == null ? 0 : str36.hashCode())) * 31;
        String str37 = this.groupsActiveFormula;
        int hashCode38 = (hashCode37 + (str37 == null ? 0 : str37.hashCode())) * 31;
        String str38 = this.interestCategoriesFormula;
        int hashCode39 = (hashCode38 + (str38 == null ? 0 : str38.hashCode())) * 31;
        String str39 = this.groupsFormula;
        int hashCode40 = (hashCode39 + (str39 == null ? 0 : str39.hashCode())) * 31;
        String str40 = this.groupsActive;
        int hashCode41 = (hashCode40 + (str40 == null ? 0 : str40.hashCode())) * 31;
        String str41 = this.groupTypes;
        int hashCode42 = (hashCode41 + (str41 == null ? 0 : str41.hashCode())) * 31;
        String str42 = this.keyPhrases;
        int hashCode43 = (hashCode42 + (str42 == null ? 0 : str42.hashCode())) * 31;
        String str43 = this.keyPhrasesDays;
        int hashCode44 = (hashCode43 + (str43 == null ? 0 : str43.hashCode())) * 31;
        String str44 = this.geoNear;
        int hashCode45 = (hashCode44 + (str44 == null ? 0 : str44.hashCode())) * 31;
        String str45 = this.geoPointType;
        int hashCode46 = (hashCode45 + (str45 == null ? 0 : str45.hashCode())) * 31;
        String str46 = this.priceListId;
        int hashCode47 = (hashCode46 + (str46 == null ? 0 : str46.hashCode())) * 31;
        String str47 = this.groupsRecommended;
        int hashCode48 = (hashCode47 + (str47 == null ? 0 : str47.hashCode())) * 31;
        String str48 = this.groupsActiveRecommended;
        int hashCode49 = (hashCode48 + (str48 == null ? 0 : str48.hashCode())) * 31;
        String str49 = this.musicArtistsFormula;
        int hashCode50 = (hashCode49 + (str49 == null ? 0 : str49.hashCode())) * 31;
        String str50 = this.priceListRetargetingFormula;
        int hashCode51 = (hashCode50 + (str50 == null ? 0 : str50.hashCode())) * 31;
        String str51 = this.tags;
        int hashCode52 = (hashCode51 + (str51 == null ? 0 : str51.hashCode())) * 31;
        String str52 = this.browsers;
        int hashCode53 = (hashCode52 + (str52 == null ? 0 : str52.hashCode())) * 31;
        String str53 = this.mobileOsMinVersion;
        int hashCode54 = (hashCode53 + (str53 == null ? 0 : str53.hashCode())) * 31;
        String str54 = this.mobileAppsEventsFormula;
        int hashCode55 = (hashCode54 + (str54 == null ? 0 : str54.hashCode())) * 31;
        String str55 = this.mobileOsMaxVersion;
        int hashCode56 = (hashCode55 + (str55 == null ? 0 : str55.hashCode())) * 31;
        String str56 = this.operators;
        int hashCode57 = (hashCode56 + (str56 == null ? 0 : str56.hashCode())) * 31;
        String str57 = this.wifiOnly;
        int hashCode58 = (hashCode57 + (str57 == null ? 0 : str57.hashCode())) * 31;
        String str58 = this.mobileManufacturers;
        return hashCode58 + (str58 != null ? str58.hashCode() : 0);
    }

    public final String toString() {
        String str = this.id;
        String str2 = this.campaignId;
        String str3 = this.ageFrom;
        String str4 = this.ageTo;
        String str5 = this.apps;
        String str6 = this.appsNot;
        String str7 = this.birthday;
        String str8 = this.cities;
        String str9 = this.citiesNot;
        String str10 = this.country;
        String str11 = this.districts;
        String str12 = this.groups;
        String str13 = this.interestCategories;
        String str14 = this.interests;
        String str15 = this.paying;
        String str16 = this.positions;
        String str17 = this.religions;
        String str18 = this.retargetingGroups;
        String str19 = this.retargetingGroupsNot;
        String str20 = this.schoolFrom;
        String str21 = this.schoolTo;
        String str22 = this.schools;
        AdsCriteriaSexDto adsCriteriaSexDto = this.sex;
        String str23 = this.stations;
        String str24 = this.statuses;
        String str25 = this.streets;
        String str26 = this.travellers;
        String str27 = this.abTest;
        String str28 = this.uniFrom;
        String str29 = this.uniTo;
        String str30 = this.userBrowsers;
        String str31 = this.userDevices;
        String str32 = this.userOs;
        String str33 = this.suggestedCriteria;
        String str34 = this.groupsNot;
        String str35 = this.priceListAudienceType;
        String str36 = this.count;
        String str37 = this.groupsActiveFormula;
        String str38 = this.interestCategoriesFormula;
        String str39 = this.groupsFormula;
        String str40 = this.groupsActive;
        String str41 = this.groupTypes;
        String str42 = this.keyPhrases;
        String str43 = this.keyPhrasesDays;
        String str44 = this.geoNear;
        String str45 = this.geoPointType;
        String str46 = this.priceListId;
        String str47 = this.groupsRecommended;
        String str48 = this.groupsActiveRecommended;
        String str49 = this.musicArtistsFormula;
        String str50 = this.priceListRetargetingFormula;
        String str51 = this.tags;
        String str52 = this.browsers;
        String str53 = this.mobileOsMinVersion;
        String str54 = this.mobileAppsEventsFormula;
        String str55 = this.mobileOsMaxVersion;
        String str56 = this.operators;
        String str57 = this.wifiOnly;
        String str58 = this.mobileManufacturers;
        StringBuilder a = xe9.a("AdsTargSettingsDto(id=", str, ", campaignId=", str2, ", ageFrom=");
        n6j.b(a, str3, ", ageTo=", str4, ", apps=");
        n6j.b(a, str5, ", appsNot=", str6, ", birthday=");
        n6j.b(a, str7, ", cities=", str8, ", citiesNot=");
        n6j.b(a, str9, ", country=", str10, ", districts=");
        n6j.b(a, str11, ", groups=", str12, ", interestCategories=");
        n6j.b(a, str13, ", interests=", str14, ", paying=");
        n6j.b(a, str15, ", positions=", str16, ", religions=");
        n6j.b(a, str17, ", retargetingGroups=", str18, ", retargetingGroupsNot=");
        n6j.b(a, str19, ", schoolFrom=", str20, ", schoolTo=");
        n6j.b(a, str21, ", schools=", str22, ", sex=");
        a.append(adsCriteriaSexDto);
        a.append(", stations=");
        a.append(str23);
        a.append(", statuses=");
        n6j.b(a, str24, ", streets=", str25, ", travellers=");
        n6j.b(a, str26, ", abTest=", str27, ", uniFrom=");
        n6j.b(a, str28, ", uniTo=", str29, ", userBrowsers=");
        n6j.b(a, str30, ", userDevices=", str31, ", userOs=");
        n6j.b(a, str32, ", suggestedCriteria=", str33, ", groupsNot=");
        n6j.b(a, str34, ", priceListAudienceType=", str35, ", count=");
        n6j.b(a, str36, ", groupsActiveFormula=", str37, ", interestCategoriesFormula=");
        n6j.b(a, str38, ", groupsFormula=", str39, ", groupsActive=");
        n6j.b(a, str40, ", groupTypes=", str41, ", keyPhrases=");
        n6j.b(a, str42, ", keyPhrasesDays=", str43, ", geoNear=");
        n6j.b(a, str44, ", geoPointType=", str45, ", priceListId=");
        n6j.b(a, str46, ", groupsRecommended=", str47, ", groupsActiveRecommended=");
        n6j.b(a, str48, ", musicArtistsFormula=", str49, ", priceListRetargetingFormula=");
        n6j.b(a, str50, ", tags=", str51, ", browsers=");
        n6j.b(a, str52, ", mobileOsMinVersion=", str53, ", mobileAppsEventsFormula=");
        n6j.b(a, str54, ", mobileOsMaxVersion=", str55, ", operators=");
        n6j.b(a, str56, ", wifiOnly=", str57, ", mobileManufacturers=");
        return i5s.a(a, str58, ")");
    }

    public AdsTargSettingsDto(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, AdsCriteriaSexDto adsCriteriaSexDto, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, String str38, String str39, String str40, String str41, String str42, String str43, String str44, String str45, String str46, String str47, String str48, String str49, String str50, String str51, String str52, String str53, String str54, String str55, String str56, String str57, String str58) {
        this.id = str;
        this.campaignId = str2;
        this.ageFrom = str3;
        this.ageTo = str4;
        this.apps = str5;
        this.appsNot = str6;
        this.birthday = str7;
        this.cities = str8;
        this.citiesNot = str9;
        this.country = str10;
        this.districts = str11;
        this.groups = str12;
        this.interestCategories = str13;
        this.interests = str14;
        this.paying = str15;
        this.positions = str16;
        this.religions = str17;
        this.retargetingGroups = str18;
        this.retargetingGroupsNot = str19;
        this.schoolFrom = str20;
        this.schoolTo = str21;
        this.schools = str22;
        this.sex = adsCriteriaSexDto;
        this.stations = str23;
        this.statuses = str24;
        this.streets = str25;
        this.travellers = str26;
        this.abTest = str27;
        this.uniFrom = str28;
        this.uniTo = str29;
        this.userBrowsers = str30;
        this.userDevices = str31;
        this.userOs = str32;
        this.suggestedCriteria = str33;
        this.groupsNot = str34;
        this.priceListAudienceType = str35;
        this.count = str36;
        this.groupsActiveFormula = str37;
        this.interestCategoriesFormula = str38;
        this.groupsFormula = str39;
        this.groupsActive = str40;
        this.groupTypes = str41;
        this.keyPhrases = str42;
        this.keyPhrasesDays = str43;
        this.geoNear = str44;
        this.geoPointType = str45;
        this.priceListId = str46;
        this.groupsRecommended = str47;
        this.groupsActiveRecommended = str48;
        this.musicArtistsFormula = str49;
        this.priceListRetargetingFormula = str50;
        this.tags = str51;
        this.browsers = str52;
        this.mobileOsMinVersion = str53;
        this.mobileAppsEventsFormula = str54;
        this.mobileOsMaxVersion = str55;
        this.operators = str56;
        this.wifiOnly = str57;
        this.mobileManufacturers = str58;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ AdsTargSettingsDto(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, AdsCriteriaSexDto adsCriteriaSexDto, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, String str38, String str39, String str40, String str41, String str42, String str43, String str44, String str45, String str46, String str47, String str48, String str49, String str50, String str51, String str52, String str53, String str54, String str55, String str56, String str57, String str58, int i, int i2, zcl zclVar) {
        this(r2, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : str10, (i & 1024) != 0 ? null : str11, (i & 2048) != 0 ? null : str12, (i & 4096) != 0 ? null : str13, (i & 8192) != 0 ? null : str14, (i & 16384) != 0 ? null : str15, (i & 32768) != 0 ? null : str16, (i & 65536) != 0 ? null : str17, (i & 131072) != 0 ? null : str18, (i & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : str19, (i & 524288) != 0 ? null : str20, (i & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : str21, (i & 2097152) != 0 ? null : str22, (i & 4194304) != 0 ? null : adsCriteriaSexDto, (i & 8388608) != 0 ? null : str23, (i & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : str24, (i & 33554432) != 0 ? null : str25, (i & 67108864) != 0 ? null : str26, (i & 134217728) != 0 ? null : str27, (i & 268435456) != 0 ? null : str28, (i & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : str29, (i & 1073741824) != 0 ? null : str30, (i & Integer.MIN_VALUE) != 0 ? null : str31, (i2 & 1) != 0 ? null : str32, (i2 & 2) != 0 ? null : str33, (i2 & 4) != 0 ? null : str34, (i2 & 8) != 0 ? null : str35, (i2 & 16) != 0 ? null : str36, (i2 & 32) != 0 ? null : str37, (i2 & 64) != 0 ? null : str38, (i2 & 128) != 0 ? null : str39, (i2 & 256) != 0 ? null : str40, (i2 & 512) != 0 ? null : str41, (i2 & 1024) != 0 ? null : str42, (i2 & 2048) != 0 ? null : str43, (i2 & 4096) != 0 ? null : str44, (i2 & 8192) != 0 ? null : str45, (i2 & 16384) != 0 ? null : str46, (i2 & 32768) != 0 ? null : str47, (i2 & 65536) != 0 ? null : str48, (i2 & 131072) != 0 ? null : str49, (i2 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : str50, (i2 & 524288) != 0 ? null : str51, (i2 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : str52, (i2 & 2097152) != 0 ? null : str53, (i2 & 4194304) != 0 ? null : str54, (i2 & 8388608) != 0 ? null : str55, (i2 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : str56, (i2 & 33554432) != 0 ? null : str57, (i2 & 67108864) != 0 ? null : str58);
        String str59 = (i & 1) != 0 ? null : str;
    }
}
