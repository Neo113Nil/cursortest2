package com.vk.sdk.api.docs.dto;

import java.util.List;
import xsna.epx;
import xsna.pmi0;
import xsna.pn;

/* compiled from: DocsSearchResponseDto.kt */
/* loaded from: classes5.dex */
public final class DocsSearchResponseDto {

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<DocsDocDto> items;

    public DocsSearchResponseDto(int i, List<DocsDocDto> list) {
        this.count = i;
        this.items = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DocsSearchResponseDto)) {
            return false;
        }
        DocsSearchResponseDto docsSearchResponseDto = (DocsSearchResponseDto) obj;
        return this.count == docsSearchResponseDto.count && epx.f(this.items, docsSearchResponseDto.items);
    }

    public final int hashCode() {
        return this.items.hashCode() + (Integer.hashCode(this.count) * 31);
    }

    public final String toString() {
        return pn.c(this.count, "DocsSearchResponseDto(count=", ", items=", ")", this.items);
    }
}
