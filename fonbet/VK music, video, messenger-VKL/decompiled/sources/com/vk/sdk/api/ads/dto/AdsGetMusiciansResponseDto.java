package com.vk.sdk.api.ads.dto;

import java.util.List;
import xsna.epx;
import xsna.pmi0;
import xsna.wq;

/* compiled from: AdsGetMusiciansResponseDto.kt */
/* loaded from: classes5.dex */
public final class AdsGetMusiciansResponseDto {

    @pmi0("items")
    private final List<AdsMusicianDto> items;

    public AdsGetMusiciansResponseDto(List<AdsMusicianDto> list) {
        this.items = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AdsGetMusiciansResponseDto) && epx.f(this.items, ((AdsGetMusiciansResponseDto) obj).items);
    }

    public final int hashCode() {
        return this.items.hashCode();
    }

    public final String toString() {
        return wq.c("AdsGetMusiciansResponseDto(items=", ")", this.items);
    }
}
