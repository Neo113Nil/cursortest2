package com.vk.sdk.api.ads.dto;

import java.util.List;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AdsEventsRetargetingGroupDto.kt */
/* loaded from: classes5.dex */
public final class AdsEventsRetargetingGroupDto {

    @pmi0("id")
    private final Integer id;

    @pmi0("value")
    private final List<Integer> value;

    /* JADX WARN: Multi-variable type inference failed */
    public AdsEventsRetargetingGroupDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdsEventsRetargetingGroupDto)) {
            return false;
        }
        AdsEventsRetargetingGroupDto adsEventsRetargetingGroupDto = (AdsEventsRetargetingGroupDto) obj;
        return epx.f(this.id, adsEventsRetargetingGroupDto.id) && epx.f(this.value, adsEventsRetargetingGroupDto.value);
    }

    public final int hashCode() {
        Integer num = this.id;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        List<Integer> list = this.value;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "AdsEventsRetargetingGroupDto(id=" + this.id + ", value=" + this.value + ")";
    }

    public AdsEventsRetargetingGroupDto(Integer num, List<Integer> list) {
        this.id = num;
        this.value = list;
    }

    public /* synthetic */ AdsEventsRetargetingGroupDto(Integer num, List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : list);
    }
}
