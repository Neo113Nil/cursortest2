package com.vk.sdk.api.ads.dto;

import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AdsPostReactionsItemDto.kt */
/* loaded from: classes5.dex */
public final class AdsPostReactionsItemDto {

    @pmi0("count")
    private final Integer count;

    @pmi0("id")
    private final Integer id;

    /* JADX WARN: Multi-variable type inference failed */
    public AdsPostReactionsItemDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdsPostReactionsItemDto)) {
            return false;
        }
        AdsPostReactionsItemDto adsPostReactionsItemDto = (AdsPostReactionsItemDto) obj;
        return epx.f(this.id, adsPostReactionsItemDto.id) && epx.f(this.count, adsPostReactionsItemDto.count);
    }

    public final int hashCode() {
        Integer num = this.id;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.count;
        return hashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return "AdsPostReactionsItemDto(id=" + this.id + ", count=" + this.count + ")";
    }

    public AdsPostReactionsItemDto(Integer num, Integer num2) {
        this.id = num;
        this.count = num2;
    }

    public /* synthetic */ AdsPostReactionsItemDto(Integer num, Integer num2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2);
    }
}
