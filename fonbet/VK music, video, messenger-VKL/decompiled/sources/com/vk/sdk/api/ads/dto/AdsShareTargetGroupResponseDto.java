package com.vk.sdk.api.ads.dto;

import xsna.pmi0;
import xsna.tgw;

/* compiled from: AdsShareTargetGroupResponseDto.kt */
/* loaded from: classes5.dex */
public final class AdsShareTargetGroupResponseDto {

    @pmi0("id")
    private final int id;

    public AdsShareTargetGroupResponseDto(int i) {
        this.id = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AdsShareTargetGroupResponseDto) && this.id == ((AdsShareTargetGroupResponseDto) obj).id;
    }

    public final int hashCode() {
        return Integer.hashCode(this.id);
    }

    public final String toString() {
        return tgw.b(this.id, "AdsShareTargetGroupResponseDto(id=", ")");
    }
}
