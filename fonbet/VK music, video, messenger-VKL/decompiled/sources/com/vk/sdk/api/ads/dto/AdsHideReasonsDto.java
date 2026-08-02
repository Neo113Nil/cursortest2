package com.vk.sdk.api.ads.dto;

import java.util.List;
import xsna.epx;
import xsna.pmi0;
import xsna.wq;
import xsna.zcl;

/* compiled from: AdsHideReasonsDto.kt */
/* loaded from: classes5.dex */
public final class AdsHideReasonsDto {

    @pmi0("items")
    private final List<AdsHideReasonDto> items;

    /* JADX WARN: Multi-variable type inference failed */
    public AdsHideReasonsDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AdsHideReasonsDto) && epx.f(this.items, ((AdsHideReasonsDto) obj).items);
    }

    public final int hashCode() {
        List<AdsHideReasonDto> list = this.items;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return wq.c("AdsHideReasonsDto(items=", ")", this.items);
    }

    public AdsHideReasonsDto(List<AdsHideReasonDto> list) {
        this.items = list;
    }

    public /* synthetic */ AdsHideReasonsDto(List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list);
    }
}
