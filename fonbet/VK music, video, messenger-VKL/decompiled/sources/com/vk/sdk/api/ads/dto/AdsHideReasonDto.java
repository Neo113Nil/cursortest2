package com.vk.sdk.api.ads.dto;

import xsna.epx;
import xsna.pmi0;
import xsna.xq;
import xsna.zcl;

/* compiled from: AdsHideReasonDto.kt */
/* loaded from: classes5.dex */
public final class AdsHideReasonDto {

    @pmi0("id")
    private final Integer id;

    @pmi0("name")
    private final String name;

    @pmi0("shouldCloseAd")
    private final Boolean shouldCloseAd;

    public AdsHideReasonDto() {
        this(null, null, null, 7, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdsHideReasonDto)) {
            return false;
        }
        AdsHideReasonDto adsHideReasonDto = (AdsHideReasonDto) obj;
        return epx.f(this.id, adsHideReasonDto.id) && epx.f(this.name, adsHideReasonDto.name) && epx.f(this.shouldCloseAd, adsHideReasonDto.shouldCloseAd);
    }

    public final int hashCode() {
        Integer num = this.id;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.name;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.shouldCloseAd;
        return hashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        Integer num = this.id;
        String str = this.name;
        Boolean bool = this.shouldCloseAd;
        StringBuilder sb = new StringBuilder("AdsHideReasonDto(id=");
        sb.append(num);
        sb.append(", name=");
        sb.append(str);
        sb.append(", shouldCloseAd=");
        return xq.d(sb, bool, ")");
    }

    public AdsHideReasonDto(Integer num, String str, Boolean bool) {
        this.id = num;
        this.name = str;
        this.shouldCloseAd = bool;
    }

    public /* synthetic */ AdsHideReasonDto(Integer num, String str, Boolean bool, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : bool);
    }
}
