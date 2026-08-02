package com.vk.stat.scheme;

import xsna.epx;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: MobileOfficialAppsStoriesStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsStoriesStat$StoryGalleryState {

    @pmi0("fav_content__half_year")
    private final Integer favContent_halfYear;

    @pmi0("fav_content__last_day")
    private final Integer favContent_lastDay;

    @pmi0("fav_content__last_month")
    private final Integer favContent_lastMonth;

    @pmi0("fav_content__last_week")
    private final Integer favContent_lastWeek;

    @pmi0("live_content__half_year")
    private final Integer liveContent_halfYear;

    @pmi0("live_content__last_day")
    private final Integer liveContent_lastDay;

    @pmi0("live_content__last_month")
    private final Integer liveContent_lastMonth;

    @pmi0("live_content__last_week")
    private final Integer liveContent_lastWeek;

    @pmi0("total_content__half_year")
    private final Integer totalContent_halfYear;

    @pmi0("total_content__last_day")
    private final Integer totalContent_lastDay;

    @pmi0("total_content__last_month")
    private final Integer totalContent_lastMonth;

    @pmi0("total_content__last_week")
    private final Integer totalContent_lastWeek;

    public MobileOfficialAppsStoriesStat$StoryGalleryState() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsStoriesStat$StoryGalleryState)) {
            return false;
        }
        MobileOfficialAppsStoriesStat$StoryGalleryState mobileOfficialAppsStoriesStat$StoryGalleryState = (MobileOfficialAppsStoriesStat$StoryGalleryState) obj;
        return epx.f(this.totalContent_halfYear, mobileOfficialAppsStoriesStat$StoryGalleryState.totalContent_halfYear) && epx.f(this.liveContent_halfYear, mobileOfficialAppsStoriesStat$StoryGalleryState.liveContent_halfYear) && epx.f(this.favContent_halfYear, mobileOfficialAppsStoriesStat$StoryGalleryState.favContent_halfYear) && epx.f(this.totalContent_lastMonth, mobileOfficialAppsStoriesStat$StoryGalleryState.totalContent_lastMonth) && epx.f(this.liveContent_lastMonth, mobileOfficialAppsStoriesStat$StoryGalleryState.liveContent_lastMonth) && epx.f(this.favContent_lastMonth, mobileOfficialAppsStoriesStat$StoryGalleryState.favContent_lastMonth) && epx.f(this.totalContent_lastWeek, mobileOfficialAppsStoriesStat$StoryGalleryState.totalContent_lastWeek) && epx.f(this.liveContent_lastWeek, mobileOfficialAppsStoriesStat$StoryGalleryState.liveContent_lastWeek) && epx.f(this.favContent_lastWeek, mobileOfficialAppsStoriesStat$StoryGalleryState.favContent_lastWeek) && epx.f(this.totalContent_lastDay, mobileOfficialAppsStoriesStat$StoryGalleryState.totalContent_lastDay) && epx.f(this.liveContent_lastDay, mobileOfficialAppsStoriesStat$StoryGalleryState.liveContent_lastDay) && epx.f(this.favContent_lastDay, mobileOfficialAppsStoriesStat$StoryGalleryState.favContent_lastDay);
    }

    public final int hashCode() {
        Integer num = this.totalContent_halfYear;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.liveContent_halfYear;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.favContent_halfYear;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.totalContent_lastMonth;
        int hashCode4 = (hashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.liveContent_lastMonth;
        int hashCode5 = (hashCode4 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.favContent_lastMonth;
        int hashCode6 = (hashCode5 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.totalContent_lastWeek;
        int hashCode7 = (hashCode6 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.liveContent_lastWeek;
        int hashCode8 = (hashCode7 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.favContent_lastWeek;
        int hashCode9 = (hashCode8 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Integer num10 = this.totalContent_lastDay;
        int hashCode10 = (hashCode9 + (num10 == null ? 0 : num10.hashCode())) * 31;
        Integer num11 = this.liveContent_lastDay;
        int hashCode11 = (hashCode10 + (num11 == null ? 0 : num11.hashCode())) * 31;
        Integer num12 = this.favContent_lastDay;
        return hashCode11 + (num12 != null ? num12.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoryGalleryState(totalContent_halfYear=");
        sb.append(this.totalContent_halfYear);
        sb.append(", liveContent_halfYear=");
        sb.append(this.liveContent_halfYear);
        sb.append(", favContent_halfYear=");
        sb.append(this.favContent_halfYear);
        sb.append(", totalContent_lastMonth=");
        sb.append(this.totalContent_lastMonth);
        sb.append(", liveContent_lastMonth=");
        sb.append(this.liveContent_lastMonth);
        sb.append(", favContent_lastMonth=");
        sb.append(this.favContent_lastMonth);
        sb.append(", totalContent_lastWeek=");
        sb.append(this.totalContent_lastWeek);
        sb.append(", liveContent_lastWeek=");
        sb.append(this.liveContent_lastWeek);
        sb.append(", favContent_lastWeek=");
        sb.append(this.favContent_lastWeek);
        sb.append(", totalContent_lastDay=");
        sb.append(this.totalContent_lastDay);
        sb.append(", liveContent_lastDay=");
        sb.append(this.liveContent_lastDay);
        sb.append(", favContent_lastDay=");
        return uqi.b(sb, this.favContent_lastDay, ')');
    }

    public MobileOfficialAppsStoriesStat$StoryGalleryState(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12) {
        this.totalContent_halfYear = num;
        this.liveContent_halfYear = num2;
        this.favContent_halfYear = num3;
        this.totalContent_lastMonth = num4;
        this.liveContent_lastMonth = num5;
        this.favContent_lastMonth = num6;
        this.totalContent_lastWeek = num7;
        this.liveContent_lastWeek = num8;
        this.favContent_lastWeek = num9;
        this.totalContent_lastDay = num10;
        this.liveContent_lastDay = num11;
        this.favContent_lastDay = num12;
    }

    public /* synthetic */ MobileOfficialAppsStoriesStat$StoryGalleryState(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : num3, (i & 8) != 0 ? null : num4, (i & 16) != 0 ? null : num5, (i & 32) != 0 ? null : num6, (i & 64) != 0 ? null : num7, (i & 128) != 0 ? null : num8, (i & 256) != 0 ? null : num9, (i & 512) != 0 ? null : num10, (i & 1024) != 0 ? null : num11, (i & 2048) != 0 ? null : num12);
    }
}
