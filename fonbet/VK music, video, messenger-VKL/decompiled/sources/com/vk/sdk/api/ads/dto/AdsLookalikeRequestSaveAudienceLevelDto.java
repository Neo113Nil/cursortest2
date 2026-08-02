package com.vk.sdk.api.ads.dto;

import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AdsLookalikeRequestSaveAudienceLevelDto.kt */
/* loaded from: classes5.dex */
public final class AdsLookalikeRequestSaveAudienceLevelDto {

    @pmi0("audience_count")
    private final Integer audienceCount;

    @pmi0("level")
    private final Integer level;

    /* JADX WARN: Multi-variable type inference failed */
    public AdsLookalikeRequestSaveAudienceLevelDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdsLookalikeRequestSaveAudienceLevelDto)) {
            return false;
        }
        AdsLookalikeRequestSaveAudienceLevelDto adsLookalikeRequestSaveAudienceLevelDto = (AdsLookalikeRequestSaveAudienceLevelDto) obj;
        return epx.f(this.level, adsLookalikeRequestSaveAudienceLevelDto.level) && epx.f(this.audienceCount, adsLookalikeRequestSaveAudienceLevelDto.audienceCount);
    }

    public final int hashCode() {
        Integer num = this.level;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.audienceCount;
        return hashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return "AdsLookalikeRequestSaveAudienceLevelDto(level=" + this.level + ", audienceCount=" + this.audienceCount + ")";
    }

    public AdsLookalikeRequestSaveAudienceLevelDto(Integer num, Integer num2) {
        this.level = num;
        this.audienceCount = num2;
    }

    public /* synthetic */ AdsLookalikeRequestSaveAudienceLevelDto(Integer num, Integer num2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2);
    }
}
