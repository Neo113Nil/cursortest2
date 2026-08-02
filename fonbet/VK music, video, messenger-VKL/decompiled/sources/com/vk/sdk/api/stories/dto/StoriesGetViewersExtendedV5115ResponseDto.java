package com.vk.sdk.api.stories.dto;

import java.util.List;
import xsna.epx;
import xsna.fw3;
import xsna.h5s;
import xsna.pmi0;
import xsna.zcl;
import xsna.zn;

/* compiled from: StoriesGetViewersExtendedV5115ResponseDto.kt */
/* loaded from: classes5.dex */
public final class StoriesGetViewersExtendedV5115ResponseDto {

    @pmi0("count")
    private final int count;

    @pmi0("hidden_reason")
    private final String hiddenReason;

    @pmi0("items")
    private final List<StoriesViewersItemDto> items;

    @pmi0("next_from")
    private final String nextFrom;

    public StoriesGetViewersExtendedV5115ResponseDto(int i, List<StoriesViewersItemDto> list, String str, String str2) {
        this.count = i;
        this.items = list;
        this.hiddenReason = str;
        this.nextFrom = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoriesGetViewersExtendedV5115ResponseDto)) {
            return false;
        }
        StoriesGetViewersExtendedV5115ResponseDto storiesGetViewersExtendedV5115ResponseDto = (StoriesGetViewersExtendedV5115ResponseDto) obj;
        return this.count == storiesGetViewersExtendedV5115ResponseDto.count && epx.f(this.items, storiesGetViewersExtendedV5115ResponseDto.items) && epx.f(this.hiddenReason, storiesGetViewersExtendedV5115ResponseDto.hiddenReason) && epx.f(this.nextFrom, storiesGetViewersExtendedV5115ResponseDto.nextFrom);
    }

    public final int hashCode() {
        int a = fw3.a(Integer.hashCode(this.count) * 31, 31, this.items);
        String str = this.hiddenReason;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.nextFrom;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        int i = this.count;
        List<StoriesViewersItemDto> list = this.items;
        return h5s.d(zn.c(i, "StoriesGetViewersExtendedV5115ResponseDto(count=", ", items=", ", hiddenReason=", list), this.hiddenReason, ", nextFrom=", this.nextFrom, ")");
    }

    public /* synthetic */ StoriesGetViewersExtendedV5115ResponseDto(int i, List list, String str, String str2, int i2, zcl zclVar) {
        this(i, list, (i2 & 4) != 0 ? null : str, (i2 & 8) != 0 ? null : str2);
    }
}
