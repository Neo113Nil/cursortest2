package com.vk.sdk.api.ads.dto;

import xsna.epx;
import xsna.jq;
import xsna.oq;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AdsItemBlockAdPhotoBaseDto.kt */
/* loaded from: classes5.dex */
public final class AdsItemBlockAdPhotoBaseDto {

    @pmi0("height")
    private final Integer height;

    @pmi0("url")
    private final String url;

    @pmi0("width")
    private final Integer width;

    public AdsItemBlockAdPhotoBaseDto() {
        this(null, null, null, 7, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdsItemBlockAdPhotoBaseDto)) {
            return false;
        }
        AdsItemBlockAdPhotoBaseDto adsItemBlockAdPhotoBaseDto = (AdsItemBlockAdPhotoBaseDto) obj;
        return epx.f(this.url, adsItemBlockAdPhotoBaseDto.url) && epx.f(this.width, adsItemBlockAdPhotoBaseDto.width) && epx.f(this.height, adsItemBlockAdPhotoBaseDto.height);
    }

    public final int hashCode() {
        String str = this.url;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.width;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.height;
        return hashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        String str = this.url;
        Integer num = this.width;
        return oq.b(jq.d(num, "AdsItemBlockAdPhotoBaseDto(url=", str, ", width=", ", height="), this.height, ")");
    }

    public AdsItemBlockAdPhotoBaseDto(String str, Integer num, Integer num2) {
        this.url = str;
        this.width = num;
        this.height = num2;
    }

    public /* synthetic */ AdsItemBlockAdPhotoBaseDto(String str, Integer num, Integer num2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2);
    }
}
