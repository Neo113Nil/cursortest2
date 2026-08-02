package com.vk.sdk.api.ads.dto;

import xsna.epx;
import xsna.h5s;
import xsna.pmi0;
import xsna.xe9;
import xsna.zcl;

/* compiled from: AdsStoryItemLinkDto.kt */
/* loaded from: classes5.dex */
public final class AdsStoryItemLinkDto {

    @pmi0("key")
    private final String key;

    @pmi0("raw_url")
    private final String rawUrl;

    @pmi0("text")
    private final String text;

    @pmi0("url")
    private final String url;

    public AdsStoryItemLinkDto() {
        this(null, null, null, null, 15, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdsStoryItemLinkDto)) {
            return false;
        }
        AdsStoryItemLinkDto adsStoryItemLinkDto = (AdsStoryItemLinkDto) obj;
        return epx.f(this.key, adsStoryItemLinkDto.key) && epx.f(this.text, adsStoryItemLinkDto.text) && epx.f(this.url, adsStoryItemLinkDto.url) && epx.f(this.rawUrl, adsStoryItemLinkDto.rawUrl);
    }

    public final int hashCode() {
        String str = this.key;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.text;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.url;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.rawUrl;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        String str = this.key;
        String str2 = this.text;
        return h5s.d(xe9.a("AdsStoryItemLinkDto(key=", str, ", text=", str2, ", url="), this.url, ", rawUrl=", this.rawUrl, ")");
    }

    public AdsStoryItemLinkDto(String str, String str2, String str3, String str4) {
        this.key = str;
        this.text = str2;
        this.url = str3;
        this.rawUrl = str4;
    }

    public /* synthetic */ AdsStoryItemLinkDto(String str, String str2, String str3, String str4, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }
}
