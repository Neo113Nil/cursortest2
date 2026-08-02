package com.vk.sdk.api.ads.dto;

import xsna.epx;
import xsna.pmi0;
import xsna.xe9;
import xsna.zcl;

/* compiled from: AdsRulesDto.kt */
/* loaded from: classes5.dex */
public final class AdsRulesDto {

    @pmi0("content_html")
    private final String contentHtml;

    @pmi0("help_chat")
    private final Boolean helpChat;

    @pmi0("help_label")
    private final String helpLabel;

    @pmi0("help_url")
    private final String helpUrl;

    public AdsRulesDto() {
        this(null, null, null, null, 15, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdsRulesDto)) {
            return false;
        }
        AdsRulesDto adsRulesDto = (AdsRulesDto) obj;
        return epx.f(this.helpUrl, adsRulesDto.helpUrl) && epx.f(this.helpLabel, adsRulesDto.helpLabel) && epx.f(this.contentHtml, adsRulesDto.contentHtml) && epx.f(this.helpChat, adsRulesDto.helpChat);
    }

    public final int hashCode() {
        String str = this.helpUrl;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.helpLabel;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.contentHtml;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.helpChat;
        return hashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        String str = this.helpUrl;
        String str2 = this.helpLabel;
        String str3 = this.contentHtml;
        Boolean bool = this.helpChat;
        StringBuilder a = xe9.a("AdsRulesDto(helpUrl=", str, ", helpLabel=", str2, ", contentHtml=");
        a.append(str3);
        a.append(", helpChat=");
        a.append(bool);
        a.append(")");
        return a.toString();
    }

    public AdsRulesDto(String str, String str2, String str3, Boolean bool) {
        this.helpUrl = str;
        this.helpLabel = str2;
        this.contentHtml = str3;
        this.helpChat = bool;
    }

    public /* synthetic */ AdsRulesDto(String str, String str2, String str3, Boolean bool, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : bool);
    }
}
