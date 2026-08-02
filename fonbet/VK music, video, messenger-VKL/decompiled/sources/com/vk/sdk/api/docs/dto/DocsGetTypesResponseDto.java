package com.vk.sdk.api.docs.dto;

import java.util.List;
import xsna.epx;
import xsna.pmi0;
import xsna.pn;

/* compiled from: DocsGetTypesResponseDto.kt */
/* loaded from: classes5.dex */
public final class DocsGetTypesResponseDto {

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<DocsDocTypesDto> items;

    public DocsGetTypesResponseDto(int i, List<DocsDocTypesDto> list) {
        this.count = i;
        this.items = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DocsGetTypesResponseDto)) {
            return false;
        }
        DocsGetTypesResponseDto docsGetTypesResponseDto = (DocsGetTypesResponseDto) obj;
        return this.count == docsGetTypesResponseDto.count && epx.f(this.items, docsGetTypesResponseDto.items);
    }

    public final int hashCode() {
        return this.items.hashCode() + (Integer.hashCode(this.count) * 31);
    }

    public final String toString() {
        return pn.c(this.count, "DocsGetTypesResponseDto(count=", ", items=", ")", this.items);
    }
}
