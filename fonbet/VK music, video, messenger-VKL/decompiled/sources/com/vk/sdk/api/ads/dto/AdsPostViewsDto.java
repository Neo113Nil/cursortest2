package com.vk.sdk.api.ads.dto;

import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AdsPostViewsDto.kt */
/* loaded from: classes5.dex */
public final class AdsPostViewsDto {

    @pmi0("count")
    private final Integer count;

    /* JADX WARN: Multi-variable type inference failed */
    public AdsPostViewsDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AdsPostViewsDto) && epx.f(this.count, ((AdsPostViewsDto) obj).count);
    }

    public final int hashCode() {
        Integer num = this.count;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        return "AdsPostViewsDto(count=" + this.count + ")";
    }

    public AdsPostViewsDto(Integer num) {
        this.count = num;
    }

    public /* synthetic */ AdsPostViewsDto(Integer num, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num);
    }
}
