package com.vk.sdk.api.base.dto;

import com.ironsource.X3;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: BaseLinkApplicationDto.kt */
/* loaded from: classes5.dex */
public final class BaseLinkApplicationDto {

    @pmi0("app_id")
    private final Float appId;

    @pmi0(X3.i.U)
    private final BaseLinkApplicationStoreDto store;

    /* JADX WARN: Multi-variable type inference failed */
    public BaseLinkApplicationDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BaseLinkApplicationDto)) {
            return false;
        }
        BaseLinkApplicationDto baseLinkApplicationDto = (BaseLinkApplicationDto) obj;
        return epx.f(this.appId, baseLinkApplicationDto.appId) && epx.f(this.store, baseLinkApplicationDto.store);
    }

    public final int hashCode() {
        Float f = this.appId;
        int hashCode = (f == null ? 0 : f.hashCode()) * 31;
        BaseLinkApplicationStoreDto baseLinkApplicationStoreDto = this.store;
        return hashCode + (baseLinkApplicationStoreDto != null ? baseLinkApplicationStoreDto.hashCode() : 0);
    }

    public final String toString() {
        return "BaseLinkApplicationDto(appId=" + this.appId + ", store=" + this.store + ")";
    }

    public BaseLinkApplicationDto(Float f, BaseLinkApplicationStoreDto baseLinkApplicationStoreDto) {
        this.appId = f;
        this.store = baseLinkApplicationStoreDto;
    }

    public /* synthetic */ BaseLinkApplicationDto(Float f, BaseLinkApplicationStoreDto baseLinkApplicationStoreDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : f, (i & 2) != 0 ? null : baseLinkApplicationStoreDto);
    }
}
