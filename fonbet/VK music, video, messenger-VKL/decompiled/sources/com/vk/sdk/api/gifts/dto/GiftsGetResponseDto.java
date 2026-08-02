package com.vk.sdk.api.gifts.dto;

import java.util.List;
import xsna.epx;
import xsna.pmi0;
import xsna.pn;

/* compiled from: GiftsGetResponseDto.kt */
/* loaded from: classes5.dex */
public final class GiftsGetResponseDto {

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<GiftsGiftDto> items;

    public GiftsGetResponseDto(int i, List<GiftsGiftDto> list) {
        this.count = i;
        this.items = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GiftsGetResponseDto)) {
            return false;
        }
        GiftsGetResponseDto giftsGetResponseDto = (GiftsGetResponseDto) obj;
        return this.count == giftsGetResponseDto.count && epx.f(this.items, giftsGetResponseDto.items);
    }

    public final int hashCode() {
        return this.items.hashCode() + (Integer.hashCode(this.count) * 31);
    }

    public final String toString() {
        return pn.c(this.count, "GiftsGetResponseDto(count=", ", items=", ")", this.items);
    }
}
