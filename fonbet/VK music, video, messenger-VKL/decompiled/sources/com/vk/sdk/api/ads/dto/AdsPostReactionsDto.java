package com.vk.sdk.api.ads.dto;

import java.util.List;
import xsna.epx;
import xsna.pmi0;
import xsna.vp;
import xsna.wr;
import xsna.zcl;

/* compiled from: AdsPostReactionsDto.kt */
/* loaded from: classes5.dex */
public final class AdsPostReactionsDto {

    @pmi0("count")
    private final Integer count;

    @pmi0("items")
    private final List<AdsPostReactionsItemDto> items;

    @pmi0("user_reaction")
    private final Integer userReaction;

    public AdsPostReactionsDto() {
        this(null, null, null, 7, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdsPostReactionsDto)) {
            return false;
        }
        AdsPostReactionsDto adsPostReactionsDto = (AdsPostReactionsDto) obj;
        return epx.f(this.count, adsPostReactionsDto.count) && epx.f(this.userReaction, adsPostReactionsDto.userReaction) && epx.f(this.items, adsPostReactionsDto.items);
    }

    public final int hashCode() {
        Integer num = this.count;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.userReaction;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        List<AdsPostReactionsItemDto> list = this.items;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        Integer num = this.count;
        Integer num2 = this.userReaction;
        return vp.b(")", wr.a(num, "AdsPostReactionsDto(count=", num2, ", userReaction=", ", items="), this.items);
    }

    public AdsPostReactionsDto(Integer num, Integer num2, List<AdsPostReactionsItemDto> list) {
        this.count = num;
        this.userReaction = num2;
        this.items = list;
    }

    public /* synthetic */ AdsPostReactionsDto(Integer num, Integer num2, List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : list);
    }
}
