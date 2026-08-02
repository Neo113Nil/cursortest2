package com.vk.sdk.api.ads.dto;

import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AdsPostDonutDto.kt */
/* loaded from: classes5.dex */
public final class AdsPostDonutDto {

    @pmi0("is_donut")
    private final Boolean isDonut;

    /* JADX WARN: Multi-variable type inference failed */
    public AdsPostDonutDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AdsPostDonutDto) && epx.f(this.isDonut, ((AdsPostDonutDto) obj).isDonut);
    }

    public final int hashCode() {
        Boolean bool = this.isDonut;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public final String toString() {
        return "AdsPostDonutDto(isDonut=" + this.isDonut + ")";
    }

    public AdsPostDonutDto(Boolean bool) {
        this.isDonut = bool;
    }

    public /* synthetic */ AdsPostDonutDto(Boolean bool, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : bool);
    }
}
