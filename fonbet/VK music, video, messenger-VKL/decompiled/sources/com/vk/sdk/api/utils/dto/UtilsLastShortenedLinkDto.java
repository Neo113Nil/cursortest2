package com.vk.sdk.api.utils.dto;

import xsna.epx;
import xsna.kr;
import xsna.pmi0;
import xsna.xe9;
import xsna.zcl;

/* compiled from: UtilsLastShortenedLinkDto.kt */
/* loaded from: classes5.dex */
public final class UtilsLastShortenedLinkDto {

    @pmi0("access_key")
    private final String accessKey;

    @pmi0("key")
    private final String key;

    @pmi0("short_url")
    private final String shortUrl;

    @pmi0("timestamp")
    private final Integer timestamp;

    @pmi0("url")
    private final String url;

    @pmi0("views")
    private final Integer views;

    public UtilsLastShortenedLinkDto() {
        this(null, null, null, null, null, null, 63, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UtilsLastShortenedLinkDto)) {
            return false;
        }
        UtilsLastShortenedLinkDto utilsLastShortenedLinkDto = (UtilsLastShortenedLinkDto) obj;
        return epx.f(this.accessKey, utilsLastShortenedLinkDto.accessKey) && epx.f(this.key, utilsLastShortenedLinkDto.key) && epx.f(this.shortUrl, utilsLastShortenedLinkDto.shortUrl) && epx.f(this.timestamp, utilsLastShortenedLinkDto.timestamp) && epx.f(this.url, utilsLastShortenedLinkDto.url) && epx.f(this.views, utilsLastShortenedLinkDto.views);
    }

    public final int hashCode() {
        String str = this.accessKey;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.key;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.shortUrl;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.timestamp;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.url;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num2 = this.views;
        return hashCode5 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        String str = this.accessKey;
        String str2 = this.key;
        String str3 = this.shortUrl;
        Integer num = this.timestamp;
        String str4 = this.url;
        Integer num2 = this.views;
        StringBuilder a = xe9.a("UtilsLastShortenedLinkDto(accessKey=", str, ", key=", str2, ", shortUrl=");
        kr.b(num, str3, ", timestamp=", ", url=", a);
        a.append(str4);
        a.append(", views=");
        a.append(num2);
        a.append(")");
        return a.toString();
    }

    public UtilsLastShortenedLinkDto(String str, String str2, String str3, Integer num, String str4, Integer num2) {
        this.accessKey = str;
        this.key = str2;
        this.shortUrl = str3;
        this.timestamp = num;
        this.url = str4;
        this.views = num2;
    }

    public /* synthetic */ UtilsLastShortenedLinkDto(String str, String str2, String str3, Integer num, String str4, Integer num2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : num2);
    }
}
