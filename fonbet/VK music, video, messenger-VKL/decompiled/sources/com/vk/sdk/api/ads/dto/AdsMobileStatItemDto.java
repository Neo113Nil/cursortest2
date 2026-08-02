package com.vk.sdk.api.ads.dto;

import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AdsMobileStatItemDto.kt */
/* loaded from: classes5.dex */
public final class AdsMobileStatItemDto {

    @pmi0("key")
    private final String key;

    @pmi0("value")
    private final Float value;

    /* JADX WARN: Multi-variable type inference failed */
    public AdsMobileStatItemDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdsMobileStatItemDto)) {
            return false;
        }
        AdsMobileStatItemDto adsMobileStatItemDto = (AdsMobileStatItemDto) obj;
        return epx.f(this.key, adsMobileStatItemDto.key) && epx.f(this.value, adsMobileStatItemDto.value);
    }

    public final int hashCode() {
        String str = this.key;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Float f = this.value;
        return hashCode + (f != null ? f.hashCode() : 0);
    }

    public final String toString() {
        return "AdsMobileStatItemDto(key=" + this.key + ", value=" + this.value + ")";
    }

    public AdsMobileStatItemDto(String str, Float f) {
        this.key = str;
        this.value = f;
    }

    public /* synthetic */ AdsMobileStatItemDto(String str, Float f, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : f);
    }
}
