package com.vk.sdk.api.ads.dto;

import xsna.epx;
import xsna.jax0;
import xsna.oq;
import xsna.pmi0;
import xsna.shy;
import xsna.sq;
import xsna.urd0;
import xsna.xe9;
import xsna.zcl;

/* compiled from: AdsCampaignDto.kt */
/* loaded from: classes5.dex */
public final class AdsCampaignDto {

    @pmi0("ads_count")
    private final Integer adsCount;

    @pmi0("all_limit")
    private final String allLimit;

    @pmi0("create_time")
    private final Integer createTime;

    @pmi0("day_limit")
    private final String dayLimit;

    @pmi0("goal_type")
    private final Integer goalType;

    @pmi0("id")
    private final int id;

    @pmi0("is_cbo_enabled")
    private final Boolean isCboEnabled;

    @pmi0("name")
    private final String name;

    @pmi0("start_time")
    private final int startTime;

    @pmi0("status")
    private final AdsCampaignStatusDto status;

    @pmi0("stop_time")
    private final int stopTime;

    @pmi0("type")
    private final AdsCampaignTypeDto type;

    @pmi0("update_time")
    private final Integer updateTime;

    @pmi0("user_goal_type")
    private final Integer userGoalType;

    @pmi0("views_limit")
    private final Integer viewsLimit;

    public AdsCampaignDto(String str, String str2, int i, String str3, int i2, AdsCampaignStatusDto adsCampaignStatusDto, int i3, AdsCampaignTypeDto adsCampaignTypeDto, Integer num, Integer num2, Integer num3, Integer num4, Boolean bool, Integer num5, Integer num6) {
        this.allLimit = str;
        this.dayLimit = str2;
        this.id = i;
        this.name = str3;
        this.startTime = i2;
        this.status = adsCampaignStatusDto;
        this.stopTime = i3;
        this.type = adsCampaignTypeDto;
        this.adsCount = num;
        this.createTime = num2;
        this.goalType = num3;
        this.userGoalType = num4;
        this.isCboEnabled = bool;
        this.updateTime = num5;
        this.viewsLimit = num6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdsCampaignDto)) {
            return false;
        }
        AdsCampaignDto adsCampaignDto = (AdsCampaignDto) obj;
        return epx.f(this.allLimit, adsCampaignDto.allLimit) && epx.f(this.dayLimit, adsCampaignDto.dayLimit) && this.id == adsCampaignDto.id && epx.f(this.name, adsCampaignDto.name) && this.startTime == adsCampaignDto.startTime && this.status == adsCampaignDto.status && this.stopTime == adsCampaignDto.stopTime && this.type == adsCampaignDto.type && epx.f(this.adsCount, adsCampaignDto.adsCount) && epx.f(this.createTime, adsCampaignDto.createTime) && epx.f(this.goalType, adsCampaignDto.goalType) && epx.f(this.userGoalType, adsCampaignDto.userGoalType) && epx.f(this.isCboEnabled, adsCampaignDto.isCboEnabled) && epx.f(this.updateTime, adsCampaignDto.updateTime) && epx.f(this.viewsLimit, adsCampaignDto.viewsLimit);
    }

    public final int hashCode() {
        int hashCode = (this.type.hashCode() + shy.a(this.stopTime, (this.status.hashCode() + shy.a(this.startTime, urd0.a(shy.a(this.id, urd0.a(this.allLimit.hashCode() * 31, 31, this.dayLimit), 31), 31, this.name), 31)) * 31, 31)) * 31;
        Integer num = this.adsCount;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.createTime;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.goalType;
        int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.userGoalType;
        int hashCode5 = (hashCode4 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Boolean bool = this.isCboEnabled;
        int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num5 = this.updateTime;
        int hashCode7 = (hashCode6 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.viewsLimit;
        return hashCode7 + (num6 != null ? num6.hashCode() : 0);
    }

    public final String toString() {
        String str = this.allLimit;
        String str2 = this.dayLimit;
        int i = this.id;
        String str3 = this.name;
        int i2 = this.startTime;
        AdsCampaignStatusDto adsCampaignStatusDto = this.status;
        int i3 = this.stopTime;
        AdsCampaignTypeDto adsCampaignTypeDto = this.type;
        Integer num = this.adsCount;
        Integer num2 = this.createTime;
        Integer num3 = this.goalType;
        Integer num4 = this.userGoalType;
        Boolean bool = this.isCboEnabled;
        Integer num5 = this.updateTime;
        Integer num6 = this.viewsLimit;
        StringBuilder a = xe9.a("AdsCampaignDto(allLimit=", str, ", dayLimit=", str2, ", id=");
        jax0.a(i, ", name=", str3, ", startTime=", a);
        a.append(i2);
        a.append(", status=");
        a.append(adsCampaignStatusDto);
        a.append(", stopTime=");
        a.append(i3);
        a.append(", type=");
        a.append(adsCampaignTypeDto);
        a.append(", adsCount=");
        sq.b(a, num, ", createTime=", num2, ", goalType=");
        sq.b(a, num3, ", userGoalType=", num4, ", isCboEnabled=");
        a.append(bool);
        a.append(", updateTime=");
        a.append(num5);
        a.append(", viewsLimit=");
        return oq.b(a, num6, ")");
    }

    public /* synthetic */ AdsCampaignDto(String str, String str2, int i, String str3, int i2, AdsCampaignStatusDto adsCampaignStatusDto, int i3, AdsCampaignTypeDto adsCampaignTypeDto, Integer num, Integer num2, Integer num3, Integer num4, Boolean bool, Integer num5, Integer num6, int i4, zcl zclVar) {
        this(str, str2, i, str3, i2, adsCampaignStatusDto, i3, adsCampaignTypeDto, (i4 & 256) != 0 ? null : num, (i4 & 512) != 0 ? null : num2, (i4 & 1024) != 0 ? null : num3, (i4 & 2048) != 0 ? null : num4, (i4 & 4096) != 0 ? null : bool, (i4 & 8192) != 0 ? null : num5, (i4 & 16384) != 0 ? null : num6);
    }
}
