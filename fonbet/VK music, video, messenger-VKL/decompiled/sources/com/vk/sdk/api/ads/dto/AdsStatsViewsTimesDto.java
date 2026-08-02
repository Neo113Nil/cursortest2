package com.vk.sdk.api.ads.dto;

import xsna.epx;
import xsna.kr;
import xsna.oq;
import xsna.pmi0;
import xsna.sq;
import xsna.wr;
import xsna.zcl;

/* compiled from: AdsStatsViewsTimesDto.kt */
/* loaded from: classes5.dex */
public final class AdsStatsViewsTimesDto {

    @pmi0("views_ads_times_1")
    private final Integer viewsAdsTimes1;

    @pmi0("views_ads_times_10")
    private final Integer viewsAdsTimes10;

    @pmi0("views_ads_times_11_plus")
    private final Integer viewsAdsTimes11Plus;

    @pmi0("views_ads_times_2")
    private final Integer viewsAdsTimes2;

    @pmi0("views_ads_times_3")
    private final Integer viewsAdsTimes3;

    @pmi0("views_ads_times_4")
    private final Integer viewsAdsTimes4;

    @pmi0("views_ads_times_5")
    private final String viewsAdsTimes5;

    @pmi0("views_ads_times_6")
    private final Integer viewsAdsTimes6;

    @pmi0("views_ads_times_7")
    private final Integer viewsAdsTimes7;

    @pmi0("views_ads_times_8")
    private final Integer viewsAdsTimes8;

    @pmi0("views_ads_times_9")
    private final Integer viewsAdsTimes9;

    public AdsStatsViewsTimesDto() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdsStatsViewsTimesDto)) {
            return false;
        }
        AdsStatsViewsTimesDto adsStatsViewsTimesDto = (AdsStatsViewsTimesDto) obj;
        return epx.f(this.viewsAdsTimes1, adsStatsViewsTimesDto.viewsAdsTimes1) && epx.f(this.viewsAdsTimes2, adsStatsViewsTimesDto.viewsAdsTimes2) && epx.f(this.viewsAdsTimes3, adsStatsViewsTimesDto.viewsAdsTimes3) && epx.f(this.viewsAdsTimes4, adsStatsViewsTimesDto.viewsAdsTimes4) && epx.f(this.viewsAdsTimes5, adsStatsViewsTimesDto.viewsAdsTimes5) && epx.f(this.viewsAdsTimes6, adsStatsViewsTimesDto.viewsAdsTimes6) && epx.f(this.viewsAdsTimes7, adsStatsViewsTimesDto.viewsAdsTimes7) && epx.f(this.viewsAdsTimes8, adsStatsViewsTimesDto.viewsAdsTimes8) && epx.f(this.viewsAdsTimes9, adsStatsViewsTimesDto.viewsAdsTimes9) && epx.f(this.viewsAdsTimes10, adsStatsViewsTimesDto.viewsAdsTimes10) && epx.f(this.viewsAdsTimes11Plus, adsStatsViewsTimesDto.viewsAdsTimes11Plus);
    }

    public final int hashCode() {
        Integer num = this.viewsAdsTimes1;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.viewsAdsTimes2;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.viewsAdsTimes3;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.viewsAdsTimes4;
        int hashCode4 = (hashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str = this.viewsAdsTimes5;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num5 = this.viewsAdsTimes6;
        int hashCode6 = (hashCode5 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.viewsAdsTimes7;
        int hashCode7 = (hashCode6 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.viewsAdsTimes8;
        int hashCode8 = (hashCode7 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.viewsAdsTimes9;
        int hashCode9 = (hashCode8 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.viewsAdsTimes10;
        int hashCode10 = (hashCode9 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Integer num10 = this.viewsAdsTimes11Plus;
        return hashCode10 + (num10 != null ? num10.hashCode() : 0);
    }

    public final String toString() {
        Integer num = this.viewsAdsTimes1;
        Integer num2 = this.viewsAdsTimes2;
        Integer num3 = this.viewsAdsTimes3;
        Integer num4 = this.viewsAdsTimes4;
        String str = this.viewsAdsTimes5;
        Integer num5 = this.viewsAdsTimes6;
        Integer num6 = this.viewsAdsTimes7;
        Integer num7 = this.viewsAdsTimes8;
        Integer num8 = this.viewsAdsTimes9;
        Integer num9 = this.viewsAdsTimes10;
        Integer num10 = this.viewsAdsTimes11Plus;
        StringBuilder a = wr.a(num, "AdsStatsViewsTimesDto(viewsAdsTimes1=", num2, ", viewsAdsTimes2=", ", viewsAdsTimes3=");
        sq.b(a, num3, ", viewsAdsTimes4=", num4, ", viewsAdsTimes5=");
        kr.b(num5, str, ", viewsAdsTimes6=", ", viewsAdsTimes7=", a);
        sq.b(a, num6, ", viewsAdsTimes8=", num7, ", viewsAdsTimes9=");
        sq.b(a, num8, ", viewsAdsTimes10=", num9, ", viewsAdsTimes11Plus=");
        return oq.b(a, num10, ")");
    }

    public AdsStatsViewsTimesDto(Integer num, Integer num2, Integer num3, Integer num4, String str, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10) {
        this.viewsAdsTimes1 = num;
        this.viewsAdsTimes2 = num2;
        this.viewsAdsTimes3 = num3;
        this.viewsAdsTimes4 = num4;
        this.viewsAdsTimes5 = str;
        this.viewsAdsTimes6 = num5;
        this.viewsAdsTimes7 = num6;
        this.viewsAdsTimes8 = num7;
        this.viewsAdsTimes9 = num8;
        this.viewsAdsTimes10 = num9;
        this.viewsAdsTimes11Plus = num10;
    }

    public /* synthetic */ AdsStatsViewsTimesDto(Integer num, Integer num2, Integer num3, Integer num4, String str, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : num3, (i & 8) != 0 ? null : num4, (i & 16) != 0 ? null : str, (i & 32) != 0 ? null : num5, (i & 64) != 0 ? null : num6, (i & 128) != 0 ? null : num7, (i & 256) != 0 ? null : num8, (i & 512) != 0 ? null : num9, (i & 1024) != 0 ? null : num10);
    }
}
