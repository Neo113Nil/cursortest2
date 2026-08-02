package com.vk.sdk.api.ads.dto;

import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AdsCreateAdStatusDto.kt */
/* loaded from: classes5.dex */
public final class AdsCreateAdStatusDto {

    @pmi0("error_code")
    private final Integer errorCode;

    @pmi0("error_desc")
    private final String errorDesc;

    @pmi0("id")
    private final int id;

    @pmi0("post_id")
    private final Integer postId;

    public AdsCreateAdStatusDto(int i, Integer num, Integer num2, String str) {
        this.id = i;
        this.postId = num;
        this.errorCode = num2;
        this.errorDesc = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdsCreateAdStatusDto)) {
            return false;
        }
        AdsCreateAdStatusDto adsCreateAdStatusDto = (AdsCreateAdStatusDto) obj;
        return this.id == adsCreateAdStatusDto.id && epx.f(this.postId, adsCreateAdStatusDto.postId) && epx.f(this.errorCode, adsCreateAdStatusDto.errorCode) && epx.f(this.errorDesc, adsCreateAdStatusDto.errorDesc);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.id) * 31;
        Integer num = this.postId;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.errorCode;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.errorDesc;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "AdsCreateAdStatusDto(id=" + this.id + ", postId=" + this.postId + ", errorCode=" + this.errorCode + ", errorDesc=" + this.errorDesc + ")";
    }

    public /* synthetic */ AdsCreateAdStatusDto(int i, Integer num, Integer num2, String str, int i2, zcl zclVar) {
        this(i, (i2 & 2) != 0 ? null : num, (i2 & 4) != 0 ? null : num2, (i2 & 8) != 0 ? null : str);
    }
}
