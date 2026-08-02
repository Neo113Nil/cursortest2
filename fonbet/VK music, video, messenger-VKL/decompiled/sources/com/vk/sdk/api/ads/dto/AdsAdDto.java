package com.vk.sdk.api.ads.dto;

import com.vk.sdk.api.base.dto.BaseBoolIntDto;
import java.util.List;
import xsna.epx;
import xsna.jax0;
import xsna.kr;
import xsna.mq;
import xsna.n6j;
import xsna.odj;
import xsna.pmi0;
import xsna.rq;
import xsna.shy;
import xsna.sq;
import xsna.to;
import xsna.urd0;
import xsna.vq;
import xsna.zcl;

/* compiled from: AdsAdDto.kt */
/* loaded from: classes5.dex */
public final class AdsAdDto {

    @pmi0("ad_format")
    private final int adFormat;

    @pmi0("ad_platform")
    private final int adPlatform;

    @pmi0("ad_platform_no_ad_network")
    private final Integer adPlatformNoAdNetwork;

    @pmi0("ad_platform_no_wall")
    private final Integer adPlatformNoWall;

    @pmi0("age_restriction")
    private final Integer ageRestriction;

    @pmi0("all_limit")
    private final String allLimit;

    @pmi0("approved")
    private final AdsAdApprovedDto approved;

    @pmi0("autobidding")
    private final BaseBoolIntDto autobidding;

    @pmi0("autobidding_max_cost")
    private final String autobiddingMaxCost;

    @pmi0("campaign_id")
    private final int campaignId;

    @pmi0("category1_id")
    private final Integer category1Id;

    @pmi0("category2_id")
    private final Integer category2Id;

    @pmi0("conversion_event_id")
    private final Integer conversionEventId;

    @pmi0("conversion_pixel_id")
    private final Integer conversionPixelId;

    @pmi0("cost_type")
    private final AdsAdCostTypeDto costType;

    @pmi0("cpa")
    private final String cpa;

    @pmi0("cpc")
    private final String cpc;

    @pmi0("cpm")
    private final String cpm;

    @pmi0("create_time")
    private final Integer createTime;

    @pmi0("day_limit")
    private final String dayLimit;

    @pmi0("disclaimer_finance")
    private final Integer disclaimerFinance;

    @pmi0("disclaimer_finance_license_no")
    private final String disclaimerFinanceLicenseNo;

    @pmi0("disclaimer_finance_name")
    private final String disclaimerFinanceName;

    @pmi0("disclaimer_medical")
    private final BaseBoolIntDto disclaimerMedical;

    @pmi0("disclaimer_specialist")
    private final BaseBoolIntDto disclaimerSpecialist;

    @pmi0("disclaimer_supplements")
    private final BaseBoolIntDto disclaimerSupplements;

    @pmi0("events_retargeting_groups")
    private final List<AdsEventsRetargetingGroupDto> eventsRetargetingGroups;

    @pmi0("goal_type")
    private final Integer goalType;

    @pmi0("has_campaign_budget_optimization")
    private final Boolean hasCampaignBudgetOptimization;

    @pmi0("id")
    private final int id;

    @pmi0("impressions_limit")
    private final Integer impressionsLimit;

    @pmi0("impressions_limit_period")
    private final Integer impressionsLimitPeriod;

    @pmi0("impressions_limited")
    private final BaseBoolIntDto impressionsLimited;

    @pmi0("is_promo")
    private final Boolean isPromo;

    @pmi0("link_id")
    private final Integer linkId;

    @pmi0("link_owner_id")
    private final Long linkOwnerId;

    @pmi0("link_url")
    private final String linkUrl;

    @pmi0("name")
    private final String name;

    @pmi0("ocpm")
    private final String ocpm;

    @pmi0("publisher_platforms")
    private final String publisherPlatforms;

    @pmi0("publisher_platforms_auto")
    private final BaseBoolIntDto publisherPlatformsAuto;

    @pmi0("start_time")
    private final Integer startTime;

    @pmi0("status")
    private final AdsAdStatusDto status;

    @pmi0("stop_time")
    private final Integer stopTime;

    @pmi0("suggested_criteria")
    private final Integer suggestedCriteria;

    @pmi0("update_time")
    private final Integer updateTime;

    @pmi0("user_goal_type")
    private final Integer userGoalType;

    @pmi0("video")
    private final BaseBoolIntDto video;

    @pmi0("weekly_schedule_hours")
    private final List<String> weeklyScheduleHours;

    @pmi0("weekly_schedule_use_holidays")
    private final Integer weeklyScheduleUseHolidays;

    public AdsAdDto(int i, int i2, String str, AdsAdApprovedDto adsAdApprovedDto, int i3, AdsAdCostTypeDto adsAdCostTypeDto, int i4, String str2, AdsAdStatusDto adsAdStatusDto, Integer num, Integer num2, String str3, String str4, String str5, String str6, BaseBoolIntDto baseBoolIntDto, String str7, BaseBoolIntDto baseBoolIntDto2, BaseBoolIntDto baseBoolIntDto3, BaseBoolIntDto baseBoolIntDto4, Integer num3, Integer num4, BaseBoolIntDto baseBoolIntDto5, BaseBoolIntDto baseBoolIntDto6, String str8, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12, Integer num13, BaseBoolIntDto baseBoolIntDto7, String str9, String str10, Long l, Integer num14, Boolean bool, List<AdsEventsRetargetingGroupDto> list, List<String> list2, Integer num15, Integer num16, Integer num17, Integer num18, String str11, String str12, Boolean bool2, Integer num19) {
        this.adFormat = i;
        this.adPlatform = i2;
        this.allLimit = str;
        this.approved = adsAdApprovedDto;
        this.campaignId = i3;
        this.costType = adsAdCostTypeDto;
        this.id = i4;
        this.name = str2;
        this.status = adsAdStatusDto;
        this.category1Id = num;
        this.category2Id = num2;
        this.cpc = str3;
        this.cpm = str4;
        this.cpa = str5;
        this.ocpm = str6;
        this.autobidding = baseBoolIntDto;
        this.autobiddingMaxCost = str7;
        this.disclaimerMedical = baseBoolIntDto2;
        this.disclaimerSpecialist = baseBoolIntDto3;
        this.disclaimerSupplements = baseBoolIntDto4;
        this.impressionsLimit = num3;
        this.impressionsLimitPeriod = num4;
        this.impressionsLimited = baseBoolIntDto5;
        this.video = baseBoolIntDto6;
        this.dayLimit = str8;
        this.goalType = num5;
        this.userGoalType = num6;
        this.ageRestriction = num7;
        this.conversionPixelId = num8;
        this.conversionEventId = num9;
        this.createTime = num10;
        this.updateTime = num11;
        this.startTime = num12;
        this.stopTime = num13;
        this.publisherPlatformsAuto = baseBoolIntDto7;
        this.publisherPlatforms = str9;
        this.linkUrl = str10;
        this.linkOwnerId = l;
        this.linkId = num14;
        this.hasCampaignBudgetOptimization = bool;
        this.eventsRetargetingGroups = list;
        this.weeklyScheduleHours = list2;
        this.weeklyScheduleUseHolidays = num15;
        this.adPlatformNoAdNetwork = num16;
        this.adPlatformNoWall = num17;
        this.disclaimerFinance = num18;
        this.disclaimerFinanceName = str11;
        this.disclaimerFinanceLicenseNo = str12;
        this.isPromo = bool2;
        this.suggestedCriteria = num19;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdsAdDto)) {
            return false;
        }
        AdsAdDto adsAdDto = (AdsAdDto) obj;
        return this.adFormat == adsAdDto.adFormat && this.adPlatform == adsAdDto.adPlatform && epx.f(this.allLimit, adsAdDto.allLimit) && this.approved == adsAdDto.approved && this.campaignId == adsAdDto.campaignId && this.costType == adsAdDto.costType && this.id == adsAdDto.id && epx.f(this.name, adsAdDto.name) && this.status == adsAdDto.status && epx.f(this.category1Id, adsAdDto.category1Id) && epx.f(this.category2Id, adsAdDto.category2Id) && epx.f(this.cpc, adsAdDto.cpc) && epx.f(this.cpm, adsAdDto.cpm) && epx.f(this.cpa, adsAdDto.cpa) && epx.f(this.ocpm, adsAdDto.ocpm) && this.autobidding == adsAdDto.autobidding && epx.f(this.autobiddingMaxCost, adsAdDto.autobiddingMaxCost) && this.disclaimerMedical == adsAdDto.disclaimerMedical && this.disclaimerSpecialist == adsAdDto.disclaimerSpecialist && this.disclaimerSupplements == adsAdDto.disclaimerSupplements && epx.f(this.impressionsLimit, adsAdDto.impressionsLimit) && epx.f(this.impressionsLimitPeriod, adsAdDto.impressionsLimitPeriod) && this.impressionsLimited == adsAdDto.impressionsLimited && this.video == adsAdDto.video && epx.f(this.dayLimit, adsAdDto.dayLimit) && epx.f(this.goalType, adsAdDto.goalType) && epx.f(this.userGoalType, adsAdDto.userGoalType) && epx.f(this.ageRestriction, adsAdDto.ageRestriction) && epx.f(this.conversionPixelId, adsAdDto.conversionPixelId) && epx.f(this.conversionEventId, adsAdDto.conversionEventId) && epx.f(this.createTime, adsAdDto.createTime) && epx.f(this.updateTime, adsAdDto.updateTime) && epx.f(this.startTime, adsAdDto.startTime) && epx.f(this.stopTime, adsAdDto.stopTime) && this.publisherPlatformsAuto == adsAdDto.publisherPlatformsAuto && epx.f(this.publisherPlatforms, adsAdDto.publisherPlatforms) && epx.f(this.linkUrl, adsAdDto.linkUrl) && epx.f(this.linkOwnerId, adsAdDto.linkOwnerId) && epx.f(this.linkId, adsAdDto.linkId) && epx.f(this.hasCampaignBudgetOptimization, adsAdDto.hasCampaignBudgetOptimization) && epx.f(this.eventsRetargetingGroups, adsAdDto.eventsRetargetingGroups) && epx.f(this.weeklyScheduleHours, adsAdDto.weeklyScheduleHours) && epx.f(this.weeklyScheduleUseHolidays, adsAdDto.weeklyScheduleUseHolidays) && epx.f(this.adPlatformNoAdNetwork, adsAdDto.adPlatformNoAdNetwork) && epx.f(this.adPlatformNoWall, adsAdDto.adPlatformNoWall) && epx.f(this.disclaimerFinance, adsAdDto.disclaimerFinance) && epx.f(this.disclaimerFinanceName, adsAdDto.disclaimerFinanceName) && epx.f(this.disclaimerFinanceLicenseNo, adsAdDto.disclaimerFinanceLicenseNo) && epx.f(this.isPromo, adsAdDto.isPromo) && epx.f(this.suggestedCriteria, adsAdDto.suggestedCriteria);
    }

    public final int hashCode() {
        int hashCode = (this.status.hashCode() + urd0.a(shy.a(this.id, (this.costType.hashCode() + shy.a(this.campaignId, (this.approved.hashCode() + urd0.a(shy.a(this.adPlatform, Integer.hashCode(this.adFormat) * 31, 31), 31, this.allLimit)) * 31, 31)) * 31, 31), 31, this.name)) * 31;
        Integer num = this.category1Id;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.category2Id;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.cpc;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.cpm;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.cpa;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.ocpm;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto = this.autobidding;
        int hashCode8 = (hashCode7 + (baseBoolIntDto == null ? 0 : baseBoolIntDto.hashCode())) * 31;
        String str5 = this.autobiddingMaxCost;
        int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto2 = this.disclaimerMedical;
        int hashCode10 = (hashCode9 + (baseBoolIntDto2 == null ? 0 : baseBoolIntDto2.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto3 = this.disclaimerSpecialist;
        int hashCode11 = (hashCode10 + (baseBoolIntDto3 == null ? 0 : baseBoolIntDto3.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto4 = this.disclaimerSupplements;
        int hashCode12 = (hashCode11 + (baseBoolIntDto4 == null ? 0 : baseBoolIntDto4.hashCode())) * 31;
        Integer num3 = this.impressionsLimit;
        int hashCode13 = (hashCode12 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.impressionsLimitPeriod;
        int hashCode14 = (hashCode13 + (num4 == null ? 0 : num4.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto5 = this.impressionsLimited;
        int hashCode15 = (hashCode14 + (baseBoolIntDto5 == null ? 0 : baseBoolIntDto5.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto6 = this.video;
        int hashCode16 = (hashCode15 + (baseBoolIntDto6 == null ? 0 : baseBoolIntDto6.hashCode())) * 31;
        String str6 = this.dayLimit;
        int hashCode17 = (hashCode16 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num5 = this.goalType;
        int hashCode18 = (hashCode17 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.userGoalType;
        int hashCode19 = (hashCode18 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.ageRestriction;
        int hashCode20 = (hashCode19 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.conversionPixelId;
        int hashCode21 = (hashCode20 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.conversionEventId;
        int hashCode22 = (hashCode21 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Integer num10 = this.createTime;
        int hashCode23 = (hashCode22 + (num10 == null ? 0 : num10.hashCode())) * 31;
        Integer num11 = this.updateTime;
        int hashCode24 = (hashCode23 + (num11 == null ? 0 : num11.hashCode())) * 31;
        Integer num12 = this.startTime;
        int hashCode25 = (hashCode24 + (num12 == null ? 0 : num12.hashCode())) * 31;
        Integer num13 = this.stopTime;
        int hashCode26 = (hashCode25 + (num13 == null ? 0 : num13.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto7 = this.publisherPlatformsAuto;
        int hashCode27 = (hashCode26 + (baseBoolIntDto7 == null ? 0 : baseBoolIntDto7.hashCode())) * 31;
        String str7 = this.publisherPlatforms;
        int hashCode28 = (hashCode27 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.linkUrl;
        int hashCode29 = (hashCode28 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Long l = this.linkOwnerId;
        int hashCode30 = (hashCode29 + (l == null ? 0 : l.hashCode())) * 31;
        Integer num14 = this.linkId;
        int hashCode31 = (hashCode30 + (num14 == null ? 0 : num14.hashCode())) * 31;
        Boolean bool = this.hasCampaignBudgetOptimization;
        int hashCode32 = (hashCode31 + (bool == null ? 0 : bool.hashCode())) * 31;
        List<AdsEventsRetargetingGroupDto> list = this.eventsRetargetingGroups;
        int hashCode33 = (hashCode32 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.weeklyScheduleHours;
        int hashCode34 = (hashCode33 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num15 = this.weeklyScheduleUseHolidays;
        int hashCode35 = (hashCode34 + (num15 == null ? 0 : num15.hashCode())) * 31;
        Integer num16 = this.adPlatformNoAdNetwork;
        int hashCode36 = (hashCode35 + (num16 == null ? 0 : num16.hashCode())) * 31;
        Integer num17 = this.adPlatformNoWall;
        int hashCode37 = (hashCode36 + (num17 == null ? 0 : num17.hashCode())) * 31;
        Integer num18 = this.disclaimerFinance;
        int hashCode38 = (hashCode37 + (num18 == null ? 0 : num18.hashCode())) * 31;
        String str9 = this.disclaimerFinanceName;
        int hashCode39 = (hashCode38 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.disclaimerFinanceLicenseNo;
        int hashCode40 = (hashCode39 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Boolean bool2 = this.isPromo;
        int hashCode41 = (hashCode40 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num19 = this.suggestedCriteria;
        return hashCode41 + (num19 != null ? num19.hashCode() : 0);
    }

    public final String toString() {
        int i = this.adFormat;
        int i2 = this.adPlatform;
        String str = this.allLimit;
        AdsAdApprovedDto adsAdApprovedDto = this.approved;
        int i3 = this.campaignId;
        AdsAdCostTypeDto adsAdCostTypeDto = this.costType;
        int i4 = this.id;
        String str2 = this.name;
        AdsAdStatusDto adsAdStatusDto = this.status;
        Integer num = this.category1Id;
        Integer num2 = this.category2Id;
        String str3 = this.cpc;
        String str4 = this.cpm;
        String str5 = this.cpa;
        String str6 = this.ocpm;
        BaseBoolIntDto baseBoolIntDto = this.autobidding;
        String str7 = this.autobiddingMaxCost;
        BaseBoolIntDto baseBoolIntDto2 = this.disclaimerMedical;
        BaseBoolIntDto baseBoolIntDto3 = this.disclaimerSpecialist;
        BaseBoolIntDto baseBoolIntDto4 = this.disclaimerSupplements;
        Integer num3 = this.impressionsLimit;
        Integer num4 = this.impressionsLimitPeriod;
        BaseBoolIntDto baseBoolIntDto5 = this.impressionsLimited;
        BaseBoolIntDto baseBoolIntDto6 = this.video;
        String str8 = this.dayLimit;
        Integer num5 = this.goalType;
        Integer num6 = this.userGoalType;
        Integer num7 = this.ageRestriction;
        Integer num8 = this.conversionPixelId;
        Integer num9 = this.conversionEventId;
        Integer num10 = this.createTime;
        Integer num11 = this.updateTime;
        Integer num12 = this.startTime;
        Integer num13 = this.stopTime;
        BaseBoolIntDto baseBoolIntDto7 = this.publisherPlatformsAuto;
        String str9 = this.publisherPlatforms;
        String str10 = this.linkUrl;
        Long l = this.linkOwnerId;
        Integer num14 = this.linkId;
        Boolean bool = this.hasCampaignBudgetOptimization;
        List<AdsEventsRetargetingGroupDto> list = this.eventsRetargetingGroups;
        List<String> list2 = this.weeklyScheduleHours;
        Integer num15 = this.weeklyScheduleUseHolidays;
        Integer num16 = this.adPlatformNoAdNetwork;
        Integer num17 = this.adPlatformNoWall;
        Integer num18 = this.disclaimerFinance;
        String str11 = this.disclaimerFinanceName;
        String str12 = this.disclaimerFinanceLicenseNo;
        Boolean bool2 = this.isPromo;
        Integer num19 = this.suggestedCriteria;
        StringBuilder a = odj.a(i, i2, "AdsAdDto(adFormat=", ", adPlatform=", ", allLimit=");
        a.append(str);
        a.append(", approved=");
        a.append(adsAdApprovedDto);
        a.append(", campaignId=");
        a.append(i3);
        a.append(", costType=");
        a.append(adsAdCostTypeDto);
        a.append(", id=");
        jax0.a(i4, ", name=", str2, ", status=", a);
        a.append(adsAdStatusDto);
        a.append(", category1Id=");
        a.append(num);
        a.append(", category2Id=");
        mq.b(num2, ", cpc=", str3, ", cpm=", a);
        n6j.b(a, str4, ", cpa=", str5, ", ocpm=");
        a.append(str6);
        a.append(", autobidding=");
        a.append(baseBoolIntDto);
        a.append(", autobiddingMaxCost=");
        a.append(str7);
        a.append(", disclaimerMedical=");
        a.append(baseBoolIntDto2);
        a.append(", disclaimerSpecialist=");
        to.b(a, baseBoolIntDto3, ", disclaimerSupplements=", baseBoolIntDto4, ", impressionsLimit=");
        sq.b(a, num3, ", impressionsLimitPeriod=", num4, ", impressionsLimited=");
        to.b(a, baseBoolIntDto5, ", video=", baseBoolIntDto6, ", dayLimit=");
        kr.b(num5, str8, ", goalType=", ", userGoalType=", a);
        sq.b(a, num6, ", ageRestriction=", num7, ", conversionPixelId=");
        sq.b(a, num8, ", conversionEventId=", num9, ", createTime=");
        sq.b(a, num10, ", updateTime=", num11, ", startTime=");
        sq.b(a, num12, ", stopTime=", num13, ", publisherPlatformsAuto=");
        a.append(baseBoolIntDto7);
        a.append(", publisherPlatforms=");
        a.append(str9);
        a.append(", linkUrl=");
        a.append(str10);
        a.append(", linkOwnerId=");
        a.append(l);
        a.append(", linkId=");
        rq.h(a, num14, ", hasCampaignBudgetOptimization=", bool, ", eventsRetargetingGroups=");
        vq.d(a, list, ", weeklyScheduleHours=", list2, ", weeklyScheduleUseHolidays=");
        sq.b(a, num15, ", adPlatformNoAdNetwork=", num16, ", adPlatformNoWall=");
        sq.b(a, num17, ", disclaimerFinance=", num18, ", disclaimerFinanceName=");
        n6j.b(a, str11, ", disclaimerFinanceLicenseNo=", str12, ", isPromo=");
        a.append(bool2);
        a.append(", suggestedCriteria=");
        a.append(num19);
        a.append(")");
        return a.toString();
    }

    public /* synthetic */ AdsAdDto(int i, int i2, String str, AdsAdApprovedDto adsAdApprovedDto, int i3, AdsAdCostTypeDto adsAdCostTypeDto, int i4, String str2, AdsAdStatusDto adsAdStatusDto, Integer num, Integer num2, String str3, String str4, String str5, String str6, BaseBoolIntDto baseBoolIntDto, String str7, BaseBoolIntDto baseBoolIntDto2, BaseBoolIntDto baseBoolIntDto3, BaseBoolIntDto baseBoolIntDto4, Integer num3, Integer num4, BaseBoolIntDto baseBoolIntDto5, BaseBoolIntDto baseBoolIntDto6, String str8, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12, Integer num13, BaseBoolIntDto baseBoolIntDto7, String str9, String str10, Long l, Integer num14, Boolean bool, List list, List list2, Integer num15, Integer num16, Integer num17, Integer num18, String str11, String str12, Boolean bool2, Integer num19, int i5, int i6, zcl zclVar) {
        this(i, i2, str, adsAdApprovedDto, i3, adsAdCostTypeDto, i4, str2, adsAdStatusDto, (i5 & 512) != 0 ? null : num, (i5 & 1024) != 0 ? null : num2, (i5 & 2048) != 0 ? null : str3, (i5 & 4096) != 0 ? null : str4, (i5 & 8192) != 0 ? null : str5, (i5 & 16384) != 0 ? null : str6, (i5 & 32768) != 0 ? null : baseBoolIntDto, (i5 & 65536) != 0 ? null : str7, (i5 & 131072) != 0 ? null : baseBoolIntDto2, (262144 & i5) != 0 ? null : baseBoolIntDto3, (524288 & i5) != 0 ? null : baseBoolIntDto4, (1048576 & i5) != 0 ? null : num3, (2097152 & i5) != 0 ? null : num4, (4194304 & i5) != 0 ? null : baseBoolIntDto5, (8388608 & i5) != 0 ? null : baseBoolIntDto6, (16777216 & i5) != 0 ? null : str8, (33554432 & i5) != 0 ? null : num5, (67108864 & i5) != 0 ? null : num6, (134217728 & i5) != 0 ? null : num7, (268435456 & i5) != 0 ? null : num8, (536870912 & i5) != 0 ? null : num9, (1073741824 & i5) != 0 ? null : num10, (i5 & Integer.MIN_VALUE) != 0 ? null : num11, (i6 & 1) != 0 ? null : num12, (i6 & 2) != 0 ? null : num13, (i6 & 4) != 0 ? null : baseBoolIntDto7, (i6 & 8) != 0 ? null : str9, (i6 & 16) != 0 ? null : str10, (i6 & 32) != 0 ? null : l, (i6 & 64) != 0 ? null : num14, (i6 & 128) != 0 ? null : bool, (i6 & 256) != 0 ? null : list, (i6 & 512) != 0 ? null : list2, (i6 & 1024) != 0 ? null : num15, (i6 & 2048) != 0 ? null : num16, (i6 & 4096) != 0 ? null : num17, (i6 & 8192) != 0 ? null : num18, (i6 & 16384) != 0 ? null : str11, (i6 & 32768) != 0 ? null : str12, (i6 & 65536) != 0 ? null : bool2, (i6 & 131072) != 0 ? null : num19);
    }
}
