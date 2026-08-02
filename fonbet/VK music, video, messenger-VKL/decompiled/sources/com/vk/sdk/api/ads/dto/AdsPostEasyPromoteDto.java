package com.vk.sdk.api.ads.dto;

import xsna.epx;
import xsna.n6j;
import xsna.oq;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AdsPostEasyPromoteDto.kt */
/* loaded from: classes5.dex */
public final class AdsPostEasyPromoteDto {

    @pmi0("ad_id")
    private final Integer adId;

    @pmi0("button_text")
    private final String buttonText;

    @pmi0("is_ad_not_easy")
    private final Boolean isAdNotEasy;

    @pmi0("label_text")
    private final String labelText;

    @pmi0("text")
    private final String text;

    @pmi0("top_union_id")
    private final Integer topUnionId;

    @pmi0("type")
    private final Integer type;

    public AdsPostEasyPromoteDto() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdsPostEasyPromoteDto)) {
            return false;
        }
        AdsPostEasyPromoteDto adsPostEasyPromoteDto = (AdsPostEasyPromoteDto) obj;
        return epx.f(this.type, adsPostEasyPromoteDto.type) && epx.f(this.text, adsPostEasyPromoteDto.text) && epx.f(this.labelText, adsPostEasyPromoteDto.labelText) && epx.f(this.buttonText, adsPostEasyPromoteDto.buttonText) && epx.f(this.isAdNotEasy, adsPostEasyPromoteDto.isAdNotEasy) && epx.f(this.adId, adsPostEasyPromoteDto.adId) && epx.f(this.topUnionId, adsPostEasyPromoteDto.topUnionId);
    }

    public final int hashCode() {
        Integer num = this.type;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.text;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.labelText;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.buttonText;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.isAdNotEasy;
        int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num2 = this.adId;
        int hashCode6 = (hashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.topUnionId;
        return hashCode6 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        Integer num = this.type;
        String str = this.text;
        String str2 = this.labelText;
        String str3 = this.buttonText;
        Boolean bool = this.isAdNotEasy;
        Integer num2 = this.adId;
        Integer num3 = this.topUnionId;
        StringBuilder sb = new StringBuilder("AdsPostEasyPromoteDto(type=");
        sb.append(num);
        sb.append(", text=");
        sb.append(str);
        sb.append(", labelText=");
        n6j.b(sb, str2, ", buttonText=", str3, ", isAdNotEasy=");
        sb.append(bool);
        sb.append(", adId=");
        sb.append(num2);
        sb.append(", topUnionId=");
        return oq.b(sb, num3, ")");
    }

    public AdsPostEasyPromoteDto(Integer num, String str, String str2, String str3, Boolean bool, Integer num2, Integer num3) {
        this.type = num;
        this.text = str;
        this.labelText = str2;
        this.buttonText = str3;
        this.isAdNotEasy = bool;
        this.adId = num2;
        this.topUnionId = num3;
    }

    public /* synthetic */ AdsPostEasyPromoteDto(Integer num, String str, String str2, String str3, Boolean bool, Integer num2, Integer num3, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : bool, (i & 32) != 0 ? null : num2, (i & 64) != 0 ? null : num3);
    }
}
