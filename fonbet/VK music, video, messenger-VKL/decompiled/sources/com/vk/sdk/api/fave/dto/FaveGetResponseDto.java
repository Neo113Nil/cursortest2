package com.vk.sdk.api.fave.dto;

import java.util.List;
import xsna.epx;
import xsna.pmi0;
import xsna.pn;

/* compiled from: FaveGetResponseDto.kt */
/* loaded from: classes5.dex */
public final class FaveGetResponseDto {

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<FaveBookmarkDto> items;

    public FaveGetResponseDto(int i, List<FaveBookmarkDto> list) {
        this.count = i;
        this.items = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FaveGetResponseDto)) {
            return false;
        }
        FaveGetResponseDto faveGetResponseDto = (FaveGetResponseDto) obj;
        return this.count == faveGetResponseDto.count && epx.f(this.items, faveGetResponseDto.items);
    }

    public final int hashCode() {
        return this.items.hashCode() + (Integer.hashCode(this.count) * 31);
    }

    public final String toString() {
        return pn.c(this.count, "FaveGetResponseDto(count=", ", items=", ")", this.items);
    }
}
