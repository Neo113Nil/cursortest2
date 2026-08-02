package com.vk.sdk.api.ads.dto;

import xsna.epx;
import xsna.pmi0;
import xsna.ss9;
import xsna.zcl;

/* compiled from: AdsItemBlockAdAppDto.kt */
/* loaded from: classes5.dex */
public final class AdsItemBlockAdAppDto {

    @pmi0("app_id")
    private final String appId;

    @pmi0("open_url")
    private final String openUrl;

    public AdsItemBlockAdAppDto(String str, String str2) {
        this.appId = str;
        this.openUrl = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdsItemBlockAdAppDto)) {
            return false;
        }
        AdsItemBlockAdAppDto adsItemBlockAdAppDto = (AdsItemBlockAdAppDto) obj;
        return epx.f(this.appId, adsItemBlockAdAppDto.appId) && epx.f(this.openUrl, adsItemBlockAdAppDto.openUrl);
    }

    public final int hashCode() {
        int hashCode = this.appId.hashCode() * 31;
        String str = this.openUrl;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return ss9.a("AdsItemBlockAdAppDto(appId=", this.appId, ", openUrl=", this.openUrl, ")");
    }

    public /* synthetic */ AdsItemBlockAdAppDto(String str, String str2, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : str2);
    }
}
