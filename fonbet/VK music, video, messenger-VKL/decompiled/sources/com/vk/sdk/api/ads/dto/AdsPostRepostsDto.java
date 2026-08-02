package com.vk.sdk.api.ads.dto;

import xsna.epx;
import xsna.oq;
import xsna.pmi0;
import xsna.wr;
import xsna.zcl;

/* compiled from: AdsPostRepostsDto.kt */
/* loaded from: classes5.dex */
public final class AdsPostRepostsDto {

    @pmi0("count")
    private final Integer count;

    @pmi0("mail_count")
    private final Integer mailCount;

    @pmi0("wall_count")
    private final Integer wallCount;

    public AdsPostRepostsDto() {
        this(null, null, null, 7, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdsPostRepostsDto)) {
            return false;
        }
        AdsPostRepostsDto adsPostRepostsDto = (AdsPostRepostsDto) obj;
        return epx.f(this.count, adsPostRepostsDto.count) && epx.f(this.wallCount, adsPostRepostsDto.wallCount) && epx.f(this.mailCount, adsPostRepostsDto.mailCount);
    }

    public final int hashCode() {
        Integer num = this.count;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.wallCount;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.mailCount;
        return hashCode2 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        Integer num = this.count;
        Integer num2 = this.wallCount;
        return oq.b(wr.a(num, "AdsPostRepostsDto(count=", num2, ", wallCount=", ", mailCount="), this.mailCount, ")");
    }

    public AdsPostRepostsDto(Integer num, Integer num2, Integer num3) {
        this.count = num;
        this.wallCount = num2;
        this.mailCount = num3;
    }

    public /* synthetic */ AdsPostRepostsDto(Integer num, Integer num2, Integer num3, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : num3);
    }
}
