package com.vk.sdk.api.ads.dto;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AdsCreateLookalikeRequestResponseDto.kt */
/* loaded from: classes5.dex */
public final class AdsCreateLookalikeRequestResponseDto {

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final Integer requestId;

    /* JADX WARN: Multi-variable type inference failed */
    public AdsCreateLookalikeRequestResponseDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AdsCreateLookalikeRequestResponseDto) && epx.f(this.requestId, ((AdsCreateLookalikeRequestResponseDto) obj).requestId);
    }

    public final int hashCode() {
        Integer num = this.requestId;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        return "AdsCreateLookalikeRequestResponseDto(requestId=" + this.requestId + ")";
    }

    public AdsCreateLookalikeRequestResponseDto(Integer num) {
        this.requestId = num;
    }

    public /* synthetic */ AdsCreateLookalikeRequestResponseDto(Integer num, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num);
    }
}
