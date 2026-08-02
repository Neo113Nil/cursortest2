package com.vk.sdk.api.utils.dto;

import xsna.epx;
import xsna.h5s;
import xsna.pmi0;
import xsna.xe9;
import xsna.zcl;

/* compiled from: UtilsShortLinkDto.kt */
/* loaded from: classes5.dex */
public final class UtilsShortLinkDto {

    @pmi0("access_key")
    private final String accessKey;

    @pmi0("key")
    private final String key;

    @pmi0("short_url")
    private final String shortUrl;

    @pmi0("url")
    private final String url;

    public UtilsShortLinkDto() {
        this(null, null, null, null, 15, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UtilsShortLinkDto)) {
            return false;
        }
        UtilsShortLinkDto utilsShortLinkDto = (UtilsShortLinkDto) obj;
        return epx.f(this.accessKey, utilsShortLinkDto.accessKey) && epx.f(this.key, utilsShortLinkDto.key) && epx.f(this.shortUrl, utilsShortLinkDto.shortUrl) && epx.f(this.url, utilsShortLinkDto.url);
    }

    public final int hashCode() {
        String str = this.accessKey;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.key;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.shortUrl;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.url;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        String str = this.accessKey;
        String str2 = this.key;
        return h5s.d(xe9.a("UtilsShortLinkDto(accessKey=", str, ", key=", str2, ", shortUrl="), this.shortUrl, ", url=", this.url, ")");
    }

    public UtilsShortLinkDto(String str, String str2, String str3, String str4) {
        this.accessKey = str;
        this.key = str2;
        this.shortUrl = str3;
        this.url = str4;
    }

    public /* synthetic */ UtilsShortLinkDto(String str, String str2, String str3, String str4, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }
}
