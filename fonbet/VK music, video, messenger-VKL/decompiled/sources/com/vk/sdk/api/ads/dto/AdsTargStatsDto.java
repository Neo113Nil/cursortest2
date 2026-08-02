package com.vk.sdk.api.ads.dto;

import xsna.epx;
import xsna.kh10;
import xsna.n6j;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AdsTargStatsDto.kt */
/* loaded from: classes5.dex */
public final class AdsTargStatsDto {

    @pmi0("audience_count")
    private final int audienceCount;

    @pmi0("recommended_cpc")
    private final String recommendedCpc;

    @pmi0("recommended_cpc_50")
    private final String recommendedCpc50;

    @pmi0("recommended_cpc_70")
    private final String recommendedCpc70;

    @pmi0("recommended_cpc_90")
    private final String recommendedCpc90;

    @pmi0("recommended_cpm")
    private final String recommendedCpm;

    @pmi0("recommended_cpm_50")
    private final String recommendedCpm50;

    @pmi0("recommended_cpm_70")
    private final String recommendedCpm70;

    @pmi0("recommended_cpm_90")
    private final String recommendedCpm90;

    @pmi0("total_alive_audience")
    private final Integer totalAliveAudience;

    public AdsTargStatsDto(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Integer num) {
        this.audienceCount = i;
        this.recommendedCpc = str;
        this.recommendedCpm = str2;
        this.recommendedCpc50 = str3;
        this.recommendedCpm50 = str4;
        this.recommendedCpc70 = str5;
        this.recommendedCpm70 = str6;
        this.recommendedCpc90 = str7;
        this.recommendedCpm90 = str8;
        this.totalAliveAudience = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdsTargStatsDto)) {
            return false;
        }
        AdsTargStatsDto adsTargStatsDto = (AdsTargStatsDto) obj;
        return this.audienceCount == adsTargStatsDto.audienceCount && epx.f(this.recommendedCpc, adsTargStatsDto.recommendedCpc) && epx.f(this.recommendedCpm, adsTargStatsDto.recommendedCpm) && epx.f(this.recommendedCpc50, adsTargStatsDto.recommendedCpc50) && epx.f(this.recommendedCpm50, adsTargStatsDto.recommendedCpm50) && epx.f(this.recommendedCpc70, adsTargStatsDto.recommendedCpc70) && epx.f(this.recommendedCpm70, adsTargStatsDto.recommendedCpm70) && epx.f(this.recommendedCpc90, adsTargStatsDto.recommendedCpc90) && epx.f(this.recommendedCpm90, adsTargStatsDto.recommendedCpm90) && epx.f(this.totalAliveAudience, adsTargStatsDto.totalAliveAudience);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.audienceCount) * 31;
        String str = this.recommendedCpc;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.recommendedCpm;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.recommendedCpc50;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.recommendedCpm50;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.recommendedCpc70;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.recommendedCpm70;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.recommendedCpc90;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.recommendedCpm90;
        int hashCode9 = (hashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Integer num = this.totalAliveAudience;
        return hashCode9 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        int i = this.audienceCount;
        String str = this.recommendedCpc;
        String str2 = this.recommendedCpm;
        String str3 = this.recommendedCpc50;
        String str4 = this.recommendedCpm50;
        String str5 = this.recommendedCpc70;
        String str6 = this.recommendedCpm70;
        String str7 = this.recommendedCpc90;
        String str8 = this.recommendedCpm90;
        Integer num = this.totalAliveAudience;
        StringBuilder a = kh10.a(i, "AdsTargStatsDto(audienceCount=", ", recommendedCpc=", str, ", recommendedCpm=");
        n6j.b(a, str2, ", recommendedCpc50=", str3, ", recommendedCpm50=");
        n6j.b(a, str4, ", recommendedCpc70=", str5, ", recommendedCpm70=");
        n6j.b(a, str6, ", recommendedCpc90=", str7, ", recommendedCpm90=");
        a.append(str8);
        a.append(", totalAliveAudience=");
        a.append(num);
        a.append(")");
        return a.toString();
    }

    public /* synthetic */ AdsTargStatsDto(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Integer num, int i2, zcl zclVar) {
        this(i, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : str3, (i2 & 16) != 0 ? null : str4, (i2 & 32) != 0 ? null : str5, (i2 & 64) != 0 ? null : str6, (i2 & 128) != 0 ? null : str7, (i2 & 256) != 0 ? null : str8, (i2 & 512) != 0 ? null : num);
    }
}
