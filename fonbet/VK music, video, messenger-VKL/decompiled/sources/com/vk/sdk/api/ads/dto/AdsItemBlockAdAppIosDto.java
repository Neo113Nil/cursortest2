package com.vk.sdk.api.ads.dto;

import com.vk.sdk.api.base.dto.BasePropertyExistsDto;
import xsna.epx;
import xsna.i5s;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AdsItemBlockAdAppIosDto.kt */
/* loaded from: classes5.dex */
public final class AdsItemBlockAdAppIosDto {

    @pmi0("app_id")
    private final String appId;

    @pmi0("open_inline_store")
    private final BasePropertyExistsDto openInlineStore;

    @pmi0("open_url")
    private final String openUrl;

    public AdsItemBlockAdAppIosDto(String str, BasePropertyExistsDto basePropertyExistsDto, String str2) {
        this.appId = str;
        this.openInlineStore = basePropertyExistsDto;
        this.openUrl = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdsItemBlockAdAppIosDto)) {
            return false;
        }
        AdsItemBlockAdAppIosDto adsItemBlockAdAppIosDto = (AdsItemBlockAdAppIosDto) obj;
        return epx.f(this.appId, adsItemBlockAdAppIosDto.appId) && this.openInlineStore == adsItemBlockAdAppIosDto.openInlineStore && epx.f(this.openUrl, adsItemBlockAdAppIosDto.openUrl);
    }

    public final int hashCode() {
        int hashCode = this.appId.hashCode() * 31;
        BasePropertyExistsDto basePropertyExistsDto = this.openInlineStore;
        int hashCode2 = (hashCode + (basePropertyExistsDto == null ? 0 : basePropertyExistsDto.hashCode())) * 31;
        String str = this.openUrl;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        String str = this.appId;
        BasePropertyExistsDto basePropertyExistsDto = this.openInlineStore;
        String str2 = this.openUrl;
        StringBuilder sb = new StringBuilder("AdsItemBlockAdAppIosDto(appId=");
        sb.append(str);
        sb.append(", openInlineStore=");
        sb.append(basePropertyExistsDto);
        sb.append(", openUrl=");
        return i5s.a(sb, str2, ")");
    }

    public /* synthetic */ AdsItemBlockAdAppIosDto(String str, BasePropertyExistsDto basePropertyExistsDto, String str2, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : basePropertyExistsDto, (i & 4) != 0 ? null : str2);
    }
}
