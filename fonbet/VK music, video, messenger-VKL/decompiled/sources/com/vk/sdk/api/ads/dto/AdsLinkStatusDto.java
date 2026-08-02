package com.vk.sdk.api.ads.dto;

import xsna.epx;
import xsna.i5s;
import xsna.pmi0;
import xsna.xe9;
import xsna.zcl;

/* compiled from: AdsLinkStatusDto.kt */
/* loaded from: classes5.dex */
public final class AdsLinkStatusDto {

    @pmi0("description")
    private final String description;

    @pmi0("redirect_url")
    private final String redirectUrl;

    @pmi0("status")
    private final String status;

    public AdsLinkStatusDto(String str, String str2, String str3) {
        this.status = str;
        this.description = str2;
        this.redirectUrl = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdsLinkStatusDto)) {
            return false;
        }
        AdsLinkStatusDto adsLinkStatusDto = (AdsLinkStatusDto) obj;
        return epx.f(this.status, adsLinkStatusDto.status) && epx.f(this.description, adsLinkStatusDto.description) && epx.f(this.redirectUrl, adsLinkStatusDto.redirectUrl);
    }

    public final int hashCode() {
        int hashCode = this.status.hashCode() * 31;
        String str = this.description;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.redirectUrl;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        String str = this.status;
        String str2 = this.description;
        return i5s.a(xe9.a("AdsLinkStatusDto(status=", str, ", description=", str2, ", redirectUrl="), this.redirectUrl, ")");
    }

    public /* synthetic */ AdsLinkStatusDto(String str, String str2, String str3, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
