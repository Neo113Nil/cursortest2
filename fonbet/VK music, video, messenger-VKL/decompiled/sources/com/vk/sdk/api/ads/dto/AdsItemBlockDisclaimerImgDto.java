package com.vk.sdk.api.ads.dto;

import xsna.epx;
import xsna.oq;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AdsItemBlockDisclaimerImgDto.kt */
/* loaded from: classes5.dex */
public final class AdsItemBlockDisclaimerImgDto {

    @pmi0("id")
    private final String id;

    @pmi0("image_ratio")
    private final Float imageRatio;

    @pmi0("min_height")
    private final Integer minHeight;

    public AdsItemBlockDisclaimerImgDto() {
        this(null, null, null, 7, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdsItemBlockDisclaimerImgDto)) {
            return false;
        }
        AdsItemBlockDisclaimerImgDto adsItemBlockDisclaimerImgDto = (AdsItemBlockDisclaimerImgDto) obj;
        return epx.f(this.id, adsItemBlockDisclaimerImgDto.id) && epx.f(this.imageRatio, adsItemBlockDisclaimerImgDto.imageRatio) && epx.f(this.minHeight, adsItemBlockDisclaimerImgDto.minHeight);
    }

    public final int hashCode() {
        String str = this.id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Float f = this.imageRatio;
        int hashCode2 = (hashCode + (f == null ? 0 : f.hashCode())) * 31;
        Integer num = this.minHeight;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        String str = this.id;
        Float f = this.imageRatio;
        Integer num = this.minHeight;
        StringBuilder sb = new StringBuilder("AdsItemBlockDisclaimerImgDto(id=");
        sb.append(str);
        sb.append(", imageRatio=");
        sb.append(f);
        sb.append(", minHeight=");
        return oq.b(sb, num, ")");
    }

    public AdsItemBlockDisclaimerImgDto(String str, Float f, Integer num) {
        this.id = str;
        this.imageRatio = f;
        this.minHeight = num;
    }

    public /* synthetic */ AdsItemBlockDisclaimerImgDto(String str, Float f, Integer num, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : f, (i & 4) != 0 ? null : num);
    }
}
