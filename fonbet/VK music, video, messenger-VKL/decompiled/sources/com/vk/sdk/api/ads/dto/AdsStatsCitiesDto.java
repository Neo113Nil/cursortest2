package com.vk.sdk.api.ads.dto;

import xsna.epx;
import xsna.jq;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AdsStatsCitiesDto.kt */
/* loaded from: classes5.dex */
public final class AdsStatsCitiesDto {

    @pmi0("clicks_rate")
    private final Float clicksRate;

    @pmi0("impressions_rate")
    private final Float impressionsRate;

    @pmi0("name")
    private final String name;

    @pmi0("value")
    private final Integer value;

    public AdsStatsCitiesDto() {
        this(null, null, null, null, 15, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdsStatsCitiesDto)) {
            return false;
        }
        AdsStatsCitiesDto adsStatsCitiesDto = (AdsStatsCitiesDto) obj;
        return epx.f(this.name, adsStatsCitiesDto.name) && epx.f(this.value, adsStatsCitiesDto.value) && epx.f(this.clicksRate, adsStatsCitiesDto.clicksRate) && epx.f(this.impressionsRate, adsStatsCitiesDto.impressionsRate);
    }

    public final int hashCode() {
        String str = this.name;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.value;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Float f = this.clicksRate;
        int hashCode3 = (hashCode2 + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.impressionsRate;
        return hashCode3 + (f2 != null ? f2.hashCode() : 0);
    }

    public final String toString() {
        String str = this.name;
        Integer num = this.value;
        Float f = this.clicksRate;
        Float f2 = this.impressionsRate;
        StringBuilder d = jq.d(num, "AdsStatsCitiesDto(name=", str, ", value=", ", clicksRate=");
        d.append(f);
        d.append(", impressionsRate=");
        d.append(f2);
        d.append(")");
        return d.toString();
    }

    public AdsStatsCitiesDto(String str, Integer num, Float f, Float f2) {
        this.name = str;
        this.value = num;
        this.clicksRate = f;
        this.impressionsRate = f2;
    }

    public /* synthetic */ AdsStatsCitiesDto(String str, Integer num, Float f, Float f2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : f, (i & 8) != 0 ? null : f2);
    }
}
