package com.vk.sdk.api.utils.dto;

import java.util.List;
import xsna.epx;
import xsna.pmi0;
import xsna.pn;

/* compiled from: UtilsGetLastShortenedLinksResponseDto.kt */
/* loaded from: classes5.dex */
public final class UtilsGetLastShortenedLinksResponseDto {

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<UtilsLastShortenedLinkDto> items;

    public UtilsGetLastShortenedLinksResponseDto(int i, List<UtilsLastShortenedLinkDto> list) {
        this.count = i;
        this.items = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UtilsGetLastShortenedLinksResponseDto)) {
            return false;
        }
        UtilsGetLastShortenedLinksResponseDto utilsGetLastShortenedLinksResponseDto = (UtilsGetLastShortenedLinksResponseDto) obj;
        return this.count == utilsGetLastShortenedLinksResponseDto.count && epx.f(this.items, utilsGetLastShortenedLinksResponseDto.items);
    }

    public final int hashCode() {
        return this.items.hashCode() + (Integer.hashCode(this.count) * 31);
    }

    public final String toString() {
        return pn.c(this.count, "UtilsGetLastShortenedLinksResponseDto(count=", ", items=", ")", this.items);
    }
}
