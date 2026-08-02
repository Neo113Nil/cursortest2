package com.vk.sdk.api.ads.dto;

import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AdsCreateTargetPixelResponseDto.kt */
/* loaded from: classes5.dex */
public final class AdsCreateTargetPixelResponseDto {

    @pmi0("id")
    private final Integer id;

    @pmi0("pixel")
    private final String pixel;

    /* JADX WARN: Multi-variable type inference failed */
    public AdsCreateTargetPixelResponseDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdsCreateTargetPixelResponseDto)) {
            return false;
        }
        AdsCreateTargetPixelResponseDto adsCreateTargetPixelResponseDto = (AdsCreateTargetPixelResponseDto) obj;
        return epx.f(this.id, adsCreateTargetPixelResponseDto.id) && epx.f(this.pixel, adsCreateTargetPixelResponseDto.pixel);
    }

    public final int hashCode() {
        Integer num = this.id;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.pixel;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "AdsCreateTargetPixelResponseDto(id=" + this.id + ", pixel=" + this.pixel + ")";
    }

    public AdsCreateTargetPixelResponseDto(Integer num, String str) {
        this.id = num;
        this.pixel = str;
    }

    public /* synthetic */ AdsCreateTargetPixelResponseDto(Integer num, String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str);
    }
}
