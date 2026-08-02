package com.vk.sdk.api.newsfeed.dto;

import com.vk.sdk.api.wall.dto.WallWallpostFullDto;
import java.util.List;
import xsna.epx;
import xsna.oq;
import xsna.pmi0;
import xsna.shy;
import xsna.vr;
import xsna.zcl;

/* compiled from: NewsfeedSearchResponseDto.kt */
/* loaded from: classes5.dex */
public final class NewsfeedSearchResponseDto {

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<WallWallpostFullDto> items;

    @pmi0("next_from")
    private final String nextFrom;

    @pmi0("suggested_queries")
    private final List<String> suggestedQueries;

    @pmi0("total_count")
    private final Integer totalCount;

    public NewsfeedSearchResponseDto(List<WallWallpostFullDto> list, int i, List<String> list2, String str, Integer num) {
        this.items = list;
        this.count = i;
        this.suggestedQueries = list2;
        this.nextFrom = str;
        this.totalCount = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsfeedSearchResponseDto)) {
            return false;
        }
        NewsfeedSearchResponseDto newsfeedSearchResponseDto = (NewsfeedSearchResponseDto) obj;
        return epx.f(this.items, newsfeedSearchResponseDto.items) && this.count == newsfeedSearchResponseDto.count && epx.f(this.suggestedQueries, newsfeedSearchResponseDto.suggestedQueries) && epx.f(this.nextFrom, newsfeedSearchResponseDto.nextFrom) && epx.f(this.totalCount, newsfeedSearchResponseDto.totalCount);
    }

    public final int hashCode() {
        int a = shy.a(this.count, this.items.hashCode() * 31, 31);
        List<String> list = this.suggestedQueries;
        int hashCode = (a + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.nextFrom;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.totalCount;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        List<WallWallpostFullDto> list = this.items;
        int i = this.count;
        List<String> list2 = this.suggestedQueries;
        String str = this.nextFrom;
        Integer num = this.totalCount;
        StringBuilder sb = new StringBuilder("NewsfeedSearchResponseDto(items=");
        sb.append(list);
        sb.append(", count=");
        sb.append(i);
        sb.append(", suggestedQueries=");
        vr.c(", nextFrom=", str, ", totalCount=", sb, list2);
        return oq.b(sb, num, ")");
    }

    public /* synthetic */ NewsfeedSearchResponseDto(List list, int i, List list2, String str, Integer num, int i2, zcl zclVar) {
        this(list, i, (i2 & 4) != 0 ? null : list2, (i2 & 8) != 0 ? null : str, (i2 & 16) != 0 ? null : num);
    }
}
