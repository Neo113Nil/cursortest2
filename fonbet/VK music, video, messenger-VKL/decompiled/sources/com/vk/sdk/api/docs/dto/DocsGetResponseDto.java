package com.vk.sdk.api.docs.dto;

import java.util.List;
import xsna.epx;
import xsna.pmi0;
import xsna.pn;

/* compiled from: DocsGetResponseDto.kt */
/* loaded from: classes5.dex */
public final class DocsGetResponseDto {

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<DocsDocDto> items;

    public DocsGetResponseDto(int i, List<DocsDocDto> list) {
        this.count = i;
        this.items = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DocsGetResponseDto)) {
            return false;
        }
        DocsGetResponseDto docsGetResponseDto = (DocsGetResponseDto) obj;
        return this.count == docsGetResponseDto.count && epx.f(this.items, docsGetResponseDto.items);
    }

    public final int hashCode() {
        return this.items.hashCode() + (Integer.hashCode(this.count) * 31);
    }

    public final String toString() {
        return pn.c(this.count, "DocsGetResponseDto(count=", ", items=", ")", this.items);
    }
}
