package com.vk.sdk.api.ads.dto;

import com.ironsource.X3;
import java.util.List;
import xsna.epx;
import xsna.kr;
import xsna.pmi0;
import xsna.tq;
import xsna.zcl;

/* compiled from: AdsTargetGroupDto.kt */
/* loaded from: classes5.dex */
public final class AdsTargetGroupDto {

    @pmi0("api_source")
    private final Boolean apiSource;

    @pmi0("audience_count")
    private final Integer audienceCount;

    @pmi0(X3.j.D)
    private final String domain;

    @pmi0("file_source")
    private final Boolean fileSource;

    @pmi0("id")
    private final Integer id;

    @pmi0("is_audience")
    private final Boolean isAudience;

    @pmi0("is_shared")
    private final Boolean isShared;

    @pmi0("last_updated")
    private final Integer lastUpdated;

    @pmi0("lifetime")
    private final Integer lifetime;

    @pmi0("lookalike_source")
    private final Boolean lookalikeSource;

    @pmi0("name")
    private final String name;

    @pmi0("pixel")
    private final String pixel;

    @pmi0("target_pixel_id")
    private final Integer targetPixelId;

    @pmi0("target_pixel_rules")
    private final List<AdsTargetGroupTargetPixelRuleDto> targetPixelRules;

    public AdsTargetGroupDto() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdsTargetGroupDto)) {
            return false;
        }
        AdsTargetGroupDto adsTargetGroupDto = (AdsTargetGroupDto) obj;
        return epx.f(this.id, adsTargetGroupDto.id) && epx.f(this.name, adsTargetGroupDto.name) && epx.f(this.isAudience, adsTargetGroupDto.isAudience) && epx.f(this.isShared, adsTargetGroupDto.isShared) && epx.f(this.fileSource, adsTargetGroupDto.fileSource) && epx.f(this.apiSource, adsTargetGroupDto.apiSource) && epx.f(this.lookalikeSource, adsTargetGroupDto.lookalikeSource) && epx.f(this.audienceCount, adsTargetGroupDto.audienceCount) && epx.f(this.domain, adsTargetGroupDto.domain) && epx.f(this.lifetime, adsTargetGroupDto.lifetime) && epx.f(this.pixel, adsTargetGroupDto.pixel) && epx.f(this.targetPixelId, adsTargetGroupDto.targetPixelId) && epx.f(this.targetPixelRules, adsTargetGroupDto.targetPixelRules) && epx.f(this.lastUpdated, adsTargetGroupDto.lastUpdated);
    }

    public final int hashCode() {
        Integer num = this.id;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.name;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.isAudience;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isShared;
        int hashCode4 = (hashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.fileSource;
        int hashCode5 = (hashCode4 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.apiSource;
        int hashCode6 = (hashCode5 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.lookalikeSource;
        int hashCode7 = (hashCode6 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Integer num2 = this.audienceCount;
        int hashCode8 = (hashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.domain;
        int hashCode9 = (hashCode8 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num3 = this.lifetime;
        int hashCode10 = (hashCode9 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str3 = this.pixel;
        int hashCode11 = (hashCode10 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num4 = this.targetPixelId;
        int hashCode12 = (hashCode11 + (num4 == null ? 0 : num4.hashCode())) * 31;
        List<AdsTargetGroupTargetPixelRuleDto> list = this.targetPixelRules;
        int hashCode13 = (hashCode12 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num5 = this.lastUpdated;
        return hashCode13 + (num5 != null ? num5.hashCode() : 0);
    }

    public final String toString() {
        Integer num = this.id;
        String str = this.name;
        Boolean bool = this.isAudience;
        Boolean bool2 = this.isShared;
        Boolean bool3 = this.fileSource;
        Boolean bool4 = this.apiSource;
        Boolean bool5 = this.lookalikeSource;
        Integer num2 = this.audienceCount;
        String str2 = this.domain;
        Integer num3 = this.lifetime;
        String str3 = this.pixel;
        Integer num4 = this.targetPixelId;
        List<AdsTargetGroupTargetPixelRuleDto> list = this.targetPixelRules;
        Integer num5 = this.lastUpdated;
        StringBuilder sb = new StringBuilder("AdsTargetGroupDto(id=");
        sb.append(num);
        sb.append(", name=");
        sb.append(str);
        sb.append(", isAudience=");
        tq.i(sb, bool, ", isShared=", bool2, ", fileSource=");
        tq.i(sb, bool3, ", apiSource=", bool4, ", lookalikeSource=");
        sb.append(bool5);
        sb.append(", audienceCount=");
        sb.append(num2);
        sb.append(", domain=");
        kr.b(num3, str2, ", lifetime=", ", pixel=", sb);
        kr.b(num4, str3, ", targetPixelId=", ", targetPixelRules=", sb);
        sb.append(list);
        sb.append(", lastUpdated=");
        sb.append(num5);
        sb.append(")");
        return sb.toString();
    }

    public AdsTargetGroupDto(Integer num, String str, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Integer num2, String str2, Integer num3, String str3, Integer num4, List<AdsTargetGroupTargetPixelRuleDto> list, Integer num5) {
        this.id = num;
        this.name = str;
        this.isAudience = bool;
        this.isShared = bool2;
        this.fileSource = bool3;
        this.apiSource = bool4;
        this.lookalikeSource = bool5;
        this.audienceCount = num2;
        this.domain = str2;
        this.lifetime = num3;
        this.pixel = str3;
        this.targetPixelId = num4;
        this.targetPixelRules = list;
        this.lastUpdated = num5;
    }

    public /* synthetic */ AdsTargetGroupDto(Integer num, String str, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Integer num2, String str2, Integer num3, String str3, Integer num4, List list, Integer num5, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : bool2, (i & 16) != 0 ? null : bool3, (i & 32) != 0 ? null : bool4, (i & 64) != 0 ? null : bool5, (i & 128) != 0 ? null : num2, (i & 256) != 0 ? null : str2, (i & 512) != 0 ? null : num3, (i & 1024) != 0 ? null : str3, (i & 2048) != 0 ? null : num4, (i & 4096) != 0 ? null : list, (i & 8192) != 0 ? null : num5);
    }
}
