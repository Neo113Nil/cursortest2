package com.vk.sdk.api.ads.dto;

import java.util.List;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AdsGetCategoriesResponseDto.kt */
/* loaded from: classes5.dex */
public final class AdsGetCategoriesResponseDto {

    @pmi0("v1")
    private final List<AdsCategoryDto> v1;

    @pmi0("v2")
    private final List<AdsCategoryDto> v2;

    /* JADX WARN: Multi-variable type inference failed */
    public AdsGetCategoriesResponseDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdsGetCategoriesResponseDto)) {
            return false;
        }
        AdsGetCategoriesResponseDto adsGetCategoriesResponseDto = (AdsGetCategoriesResponseDto) obj;
        return epx.f(this.v1, adsGetCategoriesResponseDto.v1) && epx.f(this.v2, adsGetCategoriesResponseDto.v2);
    }

    public final int hashCode() {
        List<AdsCategoryDto> list = this.v1;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<AdsCategoryDto> list2 = this.v2;
        return hashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        return "AdsGetCategoriesResponseDto(v1=" + this.v1 + ", v2=" + this.v2 + ")";
    }

    public AdsGetCategoriesResponseDto(List<AdsCategoryDto> list, List<AdsCategoryDto> list2) {
        this.v1 = list;
        this.v2 = list2;
    }

    public /* synthetic */ AdsGetCategoriesResponseDto(List list, List list2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2);
    }
}
