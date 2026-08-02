package com.vk.sdk.api.market.dto;

import com.ironsource.X3;
import java.util.List;
import xsna.epx;
import xsna.fw3;
import xsna.odj;
import xsna.pmi0;
import xsna.shy;
import xsna.zcl;

/* compiled from: MarketSearchBasicResponseDto.kt */
/* loaded from: classes5.dex */
public final class MarketSearchBasicResponseDto {

    @pmi0("count")
    private final int count;

    @pmi0("has_more")
    private final Boolean hasMore;

    @pmi0("items")
    private final List<MarketMarketItemBasicWithGroupDto> items;

    @pmi0(X3.i.l)
    private final int total;

    public MarketSearchBasicResponseDto(int i, int i2, List<MarketMarketItemBasicWithGroupDto> list, Boolean bool) {
        this.count = i;
        this.total = i2;
        this.items = list;
        this.hasMore = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketSearchBasicResponseDto)) {
            return false;
        }
        MarketSearchBasicResponseDto marketSearchBasicResponseDto = (MarketSearchBasicResponseDto) obj;
        return this.count == marketSearchBasicResponseDto.count && this.total == marketSearchBasicResponseDto.total && epx.f(this.items, marketSearchBasicResponseDto.items) && epx.f(this.hasMore, marketSearchBasicResponseDto.hasMore);
    }

    public final int hashCode() {
        int a = fw3.a(shy.a(this.total, Integer.hashCode(this.count) * 31, 31), 31, this.items);
        Boolean bool = this.hasMore;
        return a + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        int i = this.count;
        int i2 = this.total;
        List<MarketMarketItemBasicWithGroupDto> list = this.items;
        Boolean bool = this.hasMore;
        StringBuilder a = odj.a(i, i2, "MarketSearchBasicResponseDto(count=", ", total=", ", items=");
        a.append(list);
        a.append(", hasMore=");
        a.append(bool);
        a.append(")");
        return a.toString();
    }

    public /* synthetic */ MarketSearchBasicResponseDto(int i, int i2, List list, Boolean bool, int i3, zcl zclVar) {
        this(i, i2, list, (i3 & 8) != 0 ? null : bool);
    }
}
