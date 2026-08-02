package com.vk.sdk.api.ads.dto;

import java.util.List;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AdsRejectReasonDto.kt */
/* loaded from: classes5.dex */
public final class AdsRejectReasonDto {

    @pmi0("comment")
    private final String comment;

    @pmi0("rules")
    private final List<AdsRulesDto> rules;

    /* JADX WARN: Multi-variable type inference failed */
    public AdsRejectReasonDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdsRejectReasonDto)) {
            return false;
        }
        AdsRejectReasonDto adsRejectReasonDto = (AdsRejectReasonDto) obj;
        return epx.f(this.comment, adsRejectReasonDto.comment) && epx.f(this.rules, adsRejectReasonDto.rules);
    }

    public final int hashCode() {
        String str = this.comment;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<AdsRulesDto> list = this.rules;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "AdsRejectReasonDto(comment=" + this.comment + ", rules=" + this.rules + ")";
    }

    public AdsRejectReasonDto(String str, List<AdsRulesDto> list) {
        this.comment = str;
        this.rules = list;
    }

    public /* synthetic */ AdsRejectReasonDto(String str, List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list);
    }
}
