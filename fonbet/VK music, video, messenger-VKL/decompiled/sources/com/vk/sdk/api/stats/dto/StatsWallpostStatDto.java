package com.vk.sdk.api.stats.dto;

import java.util.List;
import xsna.epx;
import xsna.pmi0;
import xsna.sq;
import xsna.wr;
import xsna.zcl;

/* compiled from: StatsWallpostStatDto.kt */
/* loaded from: classes5.dex */
public final class StatsWallpostStatDto {

    @pmi0("hide")
    private final Integer hide;

    @pmi0("join_group")
    private final Integer joinGroup;

    @pmi0("links")
    private final Integer links;

    @pmi0("post_id")
    private final Integer postId;

    @pmi0("reach_ads")
    private final Integer reachAds;

    @pmi0("reach_subscribers")
    private final Integer reachSubscribers;

    @pmi0("reach_subscribers_count")
    private final Integer reachSubscribersCount;

    @pmi0("reach_total")
    private final Integer reachTotal;

    @pmi0("reach_total_count")
    private final Integer reachTotalCount;

    @pmi0("reach_viral")
    private final Integer reachViral;

    @pmi0("report")
    private final Integer report;

    @pmi0("sex_age")
    private final List<StatsSexAgeDto> sexAge;

    @pmi0("to_group")
    private final Integer toGroup;

    @pmi0("unsubscribe")
    private final Integer unsubscribe;

    public StatsWallpostStatDto() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StatsWallpostStatDto)) {
            return false;
        }
        StatsWallpostStatDto statsWallpostStatDto = (StatsWallpostStatDto) obj;
        return epx.f(this.postId, statsWallpostStatDto.postId) && epx.f(this.hide, statsWallpostStatDto.hide) && epx.f(this.joinGroup, statsWallpostStatDto.joinGroup) && epx.f(this.links, statsWallpostStatDto.links) && epx.f(this.reachSubscribers, statsWallpostStatDto.reachSubscribers) && epx.f(this.reachSubscribersCount, statsWallpostStatDto.reachSubscribersCount) && epx.f(this.reachTotal, statsWallpostStatDto.reachTotal) && epx.f(this.reachTotalCount, statsWallpostStatDto.reachTotalCount) && epx.f(this.reachViral, statsWallpostStatDto.reachViral) && epx.f(this.reachAds, statsWallpostStatDto.reachAds) && epx.f(this.report, statsWallpostStatDto.report) && epx.f(this.toGroup, statsWallpostStatDto.toGroup) && epx.f(this.unsubscribe, statsWallpostStatDto.unsubscribe) && epx.f(this.sexAge, statsWallpostStatDto.sexAge);
    }

    public final int hashCode() {
        Integer num = this.postId;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.hide;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.joinGroup;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.links;
        int hashCode4 = (hashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.reachSubscribers;
        int hashCode5 = (hashCode4 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.reachSubscribersCount;
        int hashCode6 = (hashCode5 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.reachTotal;
        int hashCode7 = (hashCode6 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.reachTotalCount;
        int hashCode8 = (hashCode7 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.reachViral;
        int hashCode9 = (hashCode8 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Integer num10 = this.reachAds;
        int hashCode10 = (hashCode9 + (num10 == null ? 0 : num10.hashCode())) * 31;
        Integer num11 = this.report;
        int hashCode11 = (hashCode10 + (num11 == null ? 0 : num11.hashCode())) * 31;
        Integer num12 = this.toGroup;
        int hashCode12 = (hashCode11 + (num12 == null ? 0 : num12.hashCode())) * 31;
        Integer num13 = this.unsubscribe;
        int hashCode13 = (hashCode12 + (num13 == null ? 0 : num13.hashCode())) * 31;
        List<StatsSexAgeDto> list = this.sexAge;
        return hashCode13 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        Integer num = this.postId;
        Integer num2 = this.hide;
        Integer num3 = this.joinGroup;
        Integer num4 = this.links;
        Integer num5 = this.reachSubscribers;
        Integer num6 = this.reachSubscribersCount;
        Integer num7 = this.reachTotal;
        Integer num8 = this.reachTotalCount;
        Integer num9 = this.reachViral;
        Integer num10 = this.reachAds;
        Integer num11 = this.report;
        Integer num12 = this.toGroup;
        Integer num13 = this.unsubscribe;
        List<StatsSexAgeDto> list = this.sexAge;
        StringBuilder a = wr.a(num, "StatsWallpostStatDto(postId=", num2, ", hide=", ", joinGroup=");
        sq.b(a, num3, ", links=", num4, ", reachSubscribers=");
        sq.b(a, num5, ", reachSubscribersCount=", num6, ", reachTotal=");
        sq.b(a, num7, ", reachTotalCount=", num8, ", reachViral=");
        sq.b(a, num9, ", reachAds=", num10, ", report=");
        sq.b(a, num11, ", toGroup=", num12, ", unsubscribe=");
        a.append(num13);
        a.append(", sexAge=");
        a.append(list);
        a.append(")");
        return a.toString();
    }

    public StatsWallpostStatDto(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12, Integer num13, List<StatsSexAgeDto> list) {
        this.postId = num;
        this.hide = num2;
        this.joinGroup = num3;
        this.links = num4;
        this.reachSubscribers = num5;
        this.reachSubscribersCount = num6;
        this.reachTotal = num7;
        this.reachTotalCount = num8;
        this.reachViral = num9;
        this.reachAds = num10;
        this.report = num11;
        this.toGroup = num12;
        this.unsubscribe = num13;
        this.sexAge = list;
    }

    public /* synthetic */ StatsWallpostStatDto(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12, Integer num13, List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : num3, (i & 8) != 0 ? null : num4, (i & 16) != 0 ? null : num5, (i & 32) != 0 ? null : num6, (i & 64) != 0 ? null : num7, (i & 128) != 0 ? null : num8, (i & 256) != 0 ? null : num9, (i & 512) != 0 ? null : num10, (i & 1024) != 0 ? null : num11, (i & 2048) != 0 ? null : num12, (i & 4096) != 0 ? null : num13, (i & 8192) != 0 ? null : list);
    }
}
