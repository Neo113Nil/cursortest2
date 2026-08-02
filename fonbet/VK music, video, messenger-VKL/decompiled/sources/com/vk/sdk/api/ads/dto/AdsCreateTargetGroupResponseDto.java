package com.vk.sdk.api.ads.dto;

import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AdsCreateTargetGroupResponseDto.kt */
/* loaded from: classes5.dex */
public final class AdsCreateTargetGroupResponseDto {

    @pmi0("id")
    private final Integer id;

    @pmi0("pixel")
    private final String pixel;

    /* JADX WARN: Multi-variable type inference failed */
    public AdsCreateTargetGroupResponseDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdsCreateTargetGroupResponseDto)) {
            return false;
        }
        AdsCreateTargetGroupResponseDto adsCreateTargetGroupResponseDto = (AdsCreateTargetGroupResponseDto) obj;
        return epx.f(this.id, adsCreateTargetGroupResponseDto.id) && epx.f(this.pixel, adsCreateTargetGroupResponseDto.pixel);
    }

    public final int hashCode() {
        Integer num = this.id;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.pixel;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "AdsCreateTargetGroupResponseDto(id=" + this.id + ", pixel=" + this.pixel + ")";
    }

    public AdsCreateTargetGroupResponseDto(Integer num, String str) {
        this.id = num;
        this.pixel = str;
    }

    public /* synthetic */ AdsCreateTargetGroupResponseDto(Integer num, String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str);
    }
}
