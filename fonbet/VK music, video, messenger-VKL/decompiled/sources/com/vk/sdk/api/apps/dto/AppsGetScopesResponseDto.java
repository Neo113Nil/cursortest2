package com.vk.sdk.api.apps.dto;

import java.util.List;
import xsna.epx;
import xsna.pmi0;
import xsna.pn;

/* compiled from: AppsGetScopesResponseDto.kt */
/* loaded from: classes5.dex */
public final class AppsGetScopesResponseDto {

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<AppsScopeDto> items;

    public AppsGetScopesResponseDto(int i, List<AppsScopeDto> list) {
        this.count = i;
        this.items = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsGetScopesResponseDto)) {
            return false;
        }
        AppsGetScopesResponseDto appsGetScopesResponseDto = (AppsGetScopesResponseDto) obj;
        return this.count == appsGetScopesResponseDto.count && epx.f(this.items, appsGetScopesResponseDto.items);
    }

    public final int hashCode() {
        return this.items.hashCode() + (Integer.hashCode(this.count) * 31);
    }

    public final String toString() {
        return pn.c(this.count, "AppsGetScopesResponseDto(count=", ", items=", ")", this.items);
    }
}
