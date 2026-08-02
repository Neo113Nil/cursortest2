package com.vk.sdk.api.ads.dto;

import com.ironsource.O6;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.List;
import xsna.epx;
import xsna.kr;
import xsna.mq;
import xsna.n6j;
import xsna.pmi0;
import xsna.sq;
import xsna.vp;
import xsna.wr;
import xsna.zcl;

/* compiled from: AdsStatsFormatDto.kt */
/* loaded from: classes5.dex */
public final class AdsStatsFormatDto {

    @pmi0("clicks")
    private final Integer clicks;

    @pmi0("conversion_count")
    private final Integer conversionCount;

    @pmi0("conversion_cr")
    private final String conversionCr;

    @pmi0("conversions_external")
    private final Integer conversionsExternal;

    @pmi0(O6.K0)
    private final String ctr;

    @pmi0("day")
    private final String day;

    @pmi0("day_from")
    private final String dayFrom;

    @pmi0("day_to")
    private final String dayTo;

    @pmi0("effective_cost_per_click")
    private final String effectiveCostPerClick;

    @pmi0("effective_cost_per_message")
    private final String effectiveCostPerMessage;

    @pmi0("effective_cost_per_mille")
    private final String effectiveCostPerMille;

    @pmi0("effective_cpf")
    private final String effectiveCpf;

    @pmi0("impressions")
    private final Integer impressions;

    @pmi0("join_rate")
    private final Integer joinRate;

    @pmi0("link_external_clicks")
    private final Integer linkExternalClicks;

    @pmi0("message_sends")
    private final Integer messageSends;

    @pmi0("message_sends_by_any_user")
    private final Integer messageSendsByAnyUser;

    @pmi0("mobile_app_stat")
    private final List<AdsMobileStatItemDto> mobileAppStat;

    @pmi0("month")
    private final String month;

    @pmi0("overall")
    private final Integer overall;

    @pmi0("reach")
    private final Integer reach;

    @pmi0("spent")
    private final String spent;

    @pmi0("uniq_views_count")
    private final Integer uniqViewsCount;

    @pmi0("video_plays_unique_100_percents")
    private final Integer videoPlaysUnique100Percents;

    @pmi0("video_plays_unique_10_seconds")
    private final Integer videoPlaysUnique10Seconds;

    @pmi0("video_plays_unique_25_percents")
    private final Integer videoPlaysUnique25Percents;

    @pmi0("video_plays_unique_3_seconds")
    private final Integer videoPlaysUnique3Seconds;

    @pmi0("video_plays_unique_50_percents")
    private final Integer videoPlaysUnique50Percents;

    @pmi0("video_plays_unique_75_percents")
    private final Integer videoPlaysUnique75Percents;

    @pmi0("video_plays_unique_started")
    private final Integer videoPlaysUniqueStarted;

    @pmi0("year")
    private final Integer year;

    public AdsStatsFormatDto() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Integer.MAX_VALUE, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdsStatsFormatDto)) {
            return false;
        }
        AdsStatsFormatDto adsStatsFormatDto = (AdsStatsFormatDto) obj;
        return epx.f(this.clicks, adsStatsFormatDto.clicks) && epx.f(this.linkExternalClicks, adsStatsFormatDto.linkExternalClicks) && epx.f(this.day, adsStatsFormatDto.day) && epx.f(this.impressions, adsStatsFormatDto.impressions) && epx.f(this.joinRate, adsStatsFormatDto.joinRate) && epx.f(this.month, adsStatsFormatDto.month) && epx.f(this.year, adsStatsFormatDto.year) && epx.f(this.overall, adsStatsFormatDto.overall) && epx.f(this.reach, adsStatsFormatDto.reach) && epx.f(this.spent, adsStatsFormatDto.spent) && epx.f(this.videoPlaysUniqueStarted, adsStatsFormatDto.videoPlaysUniqueStarted) && epx.f(this.videoPlaysUnique3Seconds, adsStatsFormatDto.videoPlaysUnique3Seconds) && epx.f(this.videoPlaysUnique10Seconds, adsStatsFormatDto.videoPlaysUnique10Seconds) && epx.f(this.videoPlaysUnique25Percents, adsStatsFormatDto.videoPlaysUnique25Percents) && epx.f(this.videoPlaysUnique50Percents, adsStatsFormatDto.videoPlaysUnique50Percents) && epx.f(this.videoPlaysUnique75Percents, adsStatsFormatDto.videoPlaysUnique75Percents) && epx.f(this.videoPlaysUnique100Percents, adsStatsFormatDto.videoPlaysUnique100Percents) && epx.f(this.effectiveCostPerClick, adsStatsFormatDto.effectiveCostPerClick) && epx.f(this.effectiveCostPerMille, adsStatsFormatDto.effectiveCostPerMille) && epx.f(this.effectiveCpf, adsStatsFormatDto.effectiveCpf) && epx.f(this.effectiveCostPerMessage, adsStatsFormatDto.effectiveCostPerMessage) && epx.f(this.messageSends, adsStatsFormatDto.messageSends) && epx.f(this.messageSendsByAnyUser, adsStatsFormatDto.messageSendsByAnyUser) && epx.f(this.conversionsExternal, adsStatsFormatDto.conversionsExternal) && epx.f(this.conversionCount, adsStatsFormatDto.conversionCount) && epx.f(this.conversionCr, adsStatsFormatDto.conversionCr) && epx.f(this.dayFrom, adsStatsFormatDto.dayFrom) && epx.f(this.dayTo, adsStatsFormatDto.dayTo) && epx.f(this.ctr, adsStatsFormatDto.ctr) && epx.f(this.uniqViewsCount, adsStatsFormatDto.uniqViewsCount) && epx.f(this.mobileAppStat, adsStatsFormatDto.mobileAppStat);
    }

    public final int hashCode() {
        Integer num = this.clicks;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.linkExternalClicks;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.day;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num3 = this.impressions;
        int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.joinRate;
        int hashCode5 = (hashCode4 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str2 = this.month;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num5 = this.year;
        int hashCode7 = (hashCode6 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.overall;
        int hashCode8 = (hashCode7 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.reach;
        int hashCode9 = (hashCode8 + (num7 == null ? 0 : num7.hashCode())) * 31;
        String str3 = this.spent;
        int hashCode10 = (hashCode9 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num8 = this.videoPlaysUniqueStarted;
        int hashCode11 = (hashCode10 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.videoPlaysUnique3Seconds;
        int hashCode12 = (hashCode11 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Integer num10 = this.videoPlaysUnique10Seconds;
        int hashCode13 = (hashCode12 + (num10 == null ? 0 : num10.hashCode())) * 31;
        Integer num11 = this.videoPlaysUnique25Percents;
        int hashCode14 = (hashCode13 + (num11 == null ? 0 : num11.hashCode())) * 31;
        Integer num12 = this.videoPlaysUnique50Percents;
        int hashCode15 = (hashCode14 + (num12 == null ? 0 : num12.hashCode())) * 31;
        Integer num13 = this.videoPlaysUnique75Percents;
        int hashCode16 = (hashCode15 + (num13 == null ? 0 : num13.hashCode())) * 31;
        Integer num14 = this.videoPlaysUnique100Percents;
        int hashCode17 = (hashCode16 + (num14 == null ? 0 : num14.hashCode())) * 31;
        String str4 = this.effectiveCostPerClick;
        int hashCode18 = (hashCode17 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.effectiveCostPerMille;
        int hashCode19 = (hashCode18 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.effectiveCpf;
        int hashCode20 = (hashCode19 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.effectiveCostPerMessage;
        int hashCode21 = (hashCode20 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Integer num15 = this.messageSends;
        int hashCode22 = (hashCode21 + (num15 == null ? 0 : num15.hashCode())) * 31;
        Integer num16 = this.messageSendsByAnyUser;
        int hashCode23 = (hashCode22 + (num16 == null ? 0 : num16.hashCode())) * 31;
        Integer num17 = this.conversionsExternal;
        int hashCode24 = (hashCode23 + (num17 == null ? 0 : num17.hashCode())) * 31;
        Integer num18 = this.conversionCount;
        int hashCode25 = (hashCode24 + (num18 == null ? 0 : num18.hashCode())) * 31;
        String str8 = this.conversionCr;
        int hashCode26 = (hashCode25 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.dayFrom;
        int hashCode27 = (hashCode26 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.dayTo;
        int hashCode28 = (hashCode27 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.ctr;
        int hashCode29 = (hashCode28 + (str11 == null ? 0 : str11.hashCode())) * 31;
        Integer num19 = this.uniqViewsCount;
        int hashCode30 = (hashCode29 + (num19 == null ? 0 : num19.hashCode())) * 31;
        List<AdsMobileStatItemDto> list = this.mobileAppStat;
        return hashCode30 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        Integer num = this.clicks;
        Integer num2 = this.linkExternalClicks;
        String str = this.day;
        Integer num3 = this.impressions;
        Integer num4 = this.joinRate;
        String str2 = this.month;
        Integer num5 = this.year;
        Integer num6 = this.overall;
        Integer num7 = this.reach;
        String str3 = this.spent;
        Integer num8 = this.videoPlaysUniqueStarted;
        Integer num9 = this.videoPlaysUnique3Seconds;
        Integer num10 = this.videoPlaysUnique10Seconds;
        Integer num11 = this.videoPlaysUnique25Percents;
        Integer num12 = this.videoPlaysUnique50Percents;
        Integer num13 = this.videoPlaysUnique75Percents;
        Integer num14 = this.videoPlaysUnique100Percents;
        String str4 = this.effectiveCostPerClick;
        String str5 = this.effectiveCostPerMille;
        String str6 = this.effectiveCpf;
        String str7 = this.effectiveCostPerMessage;
        Integer num15 = this.messageSends;
        Integer num16 = this.messageSendsByAnyUser;
        Integer num17 = this.conversionsExternal;
        Integer num18 = this.conversionCount;
        String str8 = this.conversionCr;
        String str9 = this.dayFrom;
        String str10 = this.dayTo;
        String str11 = this.ctr;
        Integer num19 = this.uniqViewsCount;
        List<AdsMobileStatItemDto> list = this.mobileAppStat;
        StringBuilder a = wr.a(num, "AdsStatsFormatDto(clicks=", num2, ", linkExternalClicks=", ", day=");
        kr.b(num3, str, ", impressions=", ", joinRate=", a);
        mq.b(num4, ", month=", str2, ", year=", a);
        sq.b(a, num5, ", overall=", num6, ", reach=");
        mq.b(num7, ", spent=", str3, ", videoPlaysUniqueStarted=", a);
        sq.b(a, num8, ", videoPlaysUnique3Seconds=", num9, ", videoPlaysUnique10Seconds=");
        sq.b(a, num10, ", videoPlaysUnique25Percents=", num11, ", videoPlaysUnique50Percents=");
        sq.b(a, num12, ", videoPlaysUnique75Percents=", num13, ", videoPlaysUnique100Percents=");
        mq.b(num14, ", effectiveCostPerClick=", str4, ", effectiveCostPerMille=", a);
        n6j.b(a, str5, ", effectiveCpf=", str6, ", effectiveCostPerMessage=");
        kr.b(num15, str7, ", messageSends=", ", messageSendsByAnyUser=", a);
        sq.b(a, num16, ", conversionsExternal=", num17, ", conversionCount=");
        mq.b(num18, ", conversionCr=", str8, ", dayFrom=", a);
        n6j.b(a, str9, ", dayTo=", str10, ", ctr=");
        kr.b(num19, str11, ", uniqViewsCount=", ", mobileAppStat=", a);
        return vp.b(")", a, list);
    }

    public AdsStatsFormatDto(Integer num, Integer num2, String str, Integer num3, Integer num4, String str2, Integer num5, Integer num6, Integer num7, String str3, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12, Integer num13, Integer num14, String str4, String str5, String str6, String str7, Integer num15, Integer num16, Integer num17, Integer num18, String str8, String str9, String str10, String str11, Integer num19, List<AdsMobileStatItemDto> list) {
        this.clicks = num;
        this.linkExternalClicks = num2;
        this.day = str;
        this.impressions = num3;
        this.joinRate = num4;
        this.month = str2;
        this.year = num5;
        this.overall = num6;
        this.reach = num7;
        this.spent = str3;
        this.videoPlaysUniqueStarted = num8;
        this.videoPlaysUnique3Seconds = num9;
        this.videoPlaysUnique10Seconds = num10;
        this.videoPlaysUnique25Percents = num11;
        this.videoPlaysUnique50Percents = num12;
        this.videoPlaysUnique75Percents = num13;
        this.videoPlaysUnique100Percents = num14;
        this.effectiveCostPerClick = str4;
        this.effectiveCostPerMille = str5;
        this.effectiveCpf = str6;
        this.effectiveCostPerMessage = str7;
        this.messageSends = num15;
        this.messageSendsByAnyUser = num16;
        this.conversionsExternal = num17;
        this.conversionCount = num18;
        this.conversionCr = str8;
        this.dayFrom = str9;
        this.dayTo = str10;
        this.ctr = str11;
        this.uniqViewsCount = num19;
        this.mobileAppStat = list;
    }

    public /* synthetic */ AdsStatsFormatDto(Integer num, Integer num2, String str, Integer num3, Integer num4, String str2, Integer num5, Integer num6, Integer num7, String str3, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12, Integer num13, Integer num14, String str4, String str5, String str6, String str7, Integer num15, Integer num16, Integer num17, Integer num18, String str8, String str9, String str10, String str11, Integer num19, List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : num3, (i & 16) != 0 ? null : num4, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? null : num5, (i & 128) != 0 ? null : num6, (i & 256) != 0 ? null : num7, (i & 512) != 0 ? null : str3, (i & 1024) != 0 ? null : num8, (i & 2048) != 0 ? null : num9, (i & 4096) != 0 ? null : num10, (i & 8192) != 0 ? null : num11, (i & 16384) != 0 ? null : num12, (i & 32768) != 0 ? null : num13, (i & 65536) != 0 ? null : num14, (i & 131072) != 0 ? null : str4, (i & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : str5, (i & 524288) != 0 ? null : str6, (i & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : str7, (i & 2097152) != 0 ? null : num15, (i & 4194304) != 0 ? null : num16, (i & 8388608) != 0 ? null : num17, (i & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : num18, (i & 33554432) != 0 ? null : str8, (i & 67108864) != 0 ? null : str9, (i & 134217728) != 0 ? null : str10, (i & 268435456) != 0 ? null : str11, (i & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : num19, (i & 1073741824) != 0 ? null : list);
    }
}
