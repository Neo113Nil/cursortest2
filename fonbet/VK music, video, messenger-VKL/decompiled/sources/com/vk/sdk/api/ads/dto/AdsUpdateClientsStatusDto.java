package com.vk.sdk.api.ads.dto;

import xsna.epx;
import xsna.i5s;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AdsUpdateClientsStatusDto.kt */
/* loaded from: classes5.dex */
public final class AdsUpdateClientsStatusDto {

    @pmi0("error_code")
    private final Integer errorCode;

    @pmi0("error_desc")
    private final String errorDesc;

    @pmi0("id")
    private final int id;

    public AdsUpdateClientsStatusDto(int i, Integer num, String str) {
        this.id = i;
        this.errorCode = num;
        this.errorDesc = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdsUpdateClientsStatusDto)) {
            return false;
        }
        AdsUpdateClientsStatusDto adsUpdateClientsStatusDto = (AdsUpdateClientsStatusDto) obj;
        return this.id == adsUpdateClientsStatusDto.id && epx.f(this.errorCode, adsUpdateClientsStatusDto.errorCode) && epx.f(this.errorDesc, adsUpdateClientsStatusDto.errorDesc);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.id) * 31;
        Integer num = this.errorCode;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.errorDesc;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        int i = this.id;
        Integer num = this.errorCode;
        String str = this.errorDesc;
        StringBuilder sb = new StringBuilder("AdsUpdateClientsStatusDto(id=");
        sb.append(i);
        sb.append(", errorCode=");
        sb.append(num);
        sb.append(", errorDesc=");
        return i5s.a(sb, str, ")");
    }

    public /* synthetic */ AdsUpdateClientsStatusDto(int i, Integer num, String str, int i2, zcl zclVar) {
        this(i, (i2 & 2) != 0 ? null : num, (i2 & 4) != 0 ? null : str);
    }
}
