package com.vk.sdk.api.ads.dto;

import xsna.epx;
import xsna.i5s;
import xsna.pmi0;
import xsna.xe9;
import xsna.zcl;

/* compiled from: AdsClipItemLinkDto.kt */
/* loaded from: classes5.dex */
public final class AdsClipItemLinkDto {

    @pmi0("key")
    private final String key;

    @pmi0("text")
    private final String text;

    @pmi0("url")
    private final String url;

    public AdsClipItemLinkDto() {
        this(null, null, null, 7, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdsClipItemLinkDto)) {
            return false;
        }
        AdsClipItemLinkDto adsClipItemLinkDto = (AdsClipItemLinkDto) obj;
        return epx.f(this.text, adsClipItemLinkDto.text) && epx.f(this.key, adsClipItemLinkDto.key) && epx.f(this.url, adsClipItemLinkDto.url);
    }

    public final int hashCode() {
        String str = this.text;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.key;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.url;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        String str = this.text;
        String str2 = this.key;
        return i5s.a(xe9.a("AdsClipItemLinkDto(text=", str, ", key=", str2, ", url="), this.url, ")");
    }

    public AdsClipItemLinkDto(String str, String str2, String str3) {
        this.text = str;
        this.key = str2;
        this.url = str3;
    }

    public /* synthetic */ AdsClipItemLinkDto(String str, String str2, String str3, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
