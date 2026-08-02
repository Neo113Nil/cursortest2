package com.vk.sdk.api.ads.dto;

import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AdsPostCommentsDto.kt */
/* loaded from: classes5.dex */
public final class AdsPostCommentsDto {

    @pmi0("count")
    private final Integer count;

    /* JADX WARN: Multi-variable type inference failed */
    public AdsPostCommentsDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AdsPostCommentsDto) && epx.f(this.count, ((AdsPostCommentsDto) obj).count);
    }

    public final int hashCode() {
        Integer num = this.count;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        return "AdsPostCommentsDto(count=" + this.count + ")";
    }

    public AdsPostCommentsDto(Integer num) {
        this.count = num;
    }

    public /* synthetic */ AdsPostCommentsDto(Integer num, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num);
    }
}
