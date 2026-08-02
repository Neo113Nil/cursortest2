package com.vk.sdk.api.ads.dto;

import java.util.List;
import xsna.epx;
import xsna.pmi0;
import xsna.pn;

/* compiled from: AdsGetLookalikeRequestsResponseDto.kt */
/* loaded from: classes5.dex */
public final class AdsGetLookalikeRequestsResponseDto {

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<AdsLookalikeRequestDto> items;

    public AdsGetLookalikeRequestsResponseDto(int i, List<AdsLookalikeRequestDto> list) {
        this.count = i;
        this.items = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdsGetLookalikeRequestsResponseDto)) {
            return false;
        }
        AdsGetLookalikeRequestsResponseDto adsGetLookalikeRequestsResponseDto = (AdsGetLookalikeRequestsResponseDto) obj;
        return this.count == adsGetLookalikeRequestsResponseDto.count && epx.f(this.items, adsGetLookalikeRequestsResponseDto.items);
    }

    public final int hashCode() {
        return this.items.hashCode() + (Integer.hashCode(this.count) * 31);
    }

    public final String toString() {
        return pn.c(this.count, "AdsGetLookalikeRequestsResponseDto(count=", ", items=", ")", this.items);
    }
}
