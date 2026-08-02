package com.vk.sdk.api.fave.dto;

import java.util.List;
import xsna.epx;
import xsna.pmi0;
import xsna.pn;

/* compiled from: FaveGetTagsResponseDto.kt */
/* loaded from: classes5.dex */
public final class FaveGetTagsResponseDto {

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<FaveTagDto> items;

    public FaveGetTagsResponseDto(int i, List<FaveTagDto> list) {
        this.count = i;
        this.items = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FaveGetTagsResponseDto)) {
            return false;
        }
        FaveGetTagsResponseDto faveGetTagsResponseDto = (FaveGetTagsResponseDto) obj;
        return this.count == faveGetTagsResponseDto.count && epx.f(this.items, faveGetTagsResponseDto.items);
    }

    public final int hashCode() {
        return this.items.hashCode() + (Integer.hashCode(this.count) * 31);
    }

    public final String toString() {
        return pn.c(this.count, "FaveGetTagsResponseDto(count=", ", items=", ")", this.items);
    }
}
