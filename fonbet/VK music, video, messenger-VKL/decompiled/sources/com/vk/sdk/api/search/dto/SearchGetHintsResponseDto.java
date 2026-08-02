package com.vk.sdk.api.search.dto;

import java.util.List;
import xsna.epx;
import xsna.fw3;
import xsna.pmi0;
import xsna.vp;
import xsna.zcl;
import xsna.zn;

/* compiled from: SearchGetHintsResponseDto.kt */
/* loaded from: classes5.dex */
public final class SearchGetHintsResponseDto {

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<SearchHintDto> items;

    @pmi0("suggested_queries")
    private final List<String> suggestedQueries;

    public SearchGetHintsResponseDto(int i, List<SearchHintDto> list, List<String> list2) {
        this.count = i;
        this.items = list;
        this.suggestedQueries = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchGetHintsResponseDto)) {
            return false;
        }
        SearchGetHintsResponseDto searchGetHintsResponseDto = (SearchGetHintsResponseDto) obj;
        return this.count == searchGetHintsResponseDto.count && epx.f(this.items, searchGetHintsResponseDto.items) && epx.f(this.suggestedQueries, searchGetHintsResponseDto.suggestedQueries);
    }

    public final int hashCode() {
        int a = fw3.a(Integer.hashCode(this.count) * 31, 31, this.items);
        List<String> list = this.suggestedQueries;
        return a + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        int i = this.count;
        List<SearchHintDto> list = this.items;
        return vp.b(")", zn.c(i, "SearchGetHintsResponseDto(count=", ", items=", ", suggestedQueries=", list), this.suggestedQueries);
    }

    public /* synthetic */ SearchGetHintsResponseDto(int i, List list, List list2, int i2, zcl zclVar) {
        this(i, list, (i2 & 4) != 0 ? null : list2);
    }
}
