package com.vk.repository.internal.repos.stickers.database.converters.dto;

import java.util.Map;
import xsna.cjl0;
import xsna.epx;
import xsna.pmi0;

/* compiled from: AwayLinkDto.kt */
/* loaded from: classes5.dex */
public final class AwayLinkDto {

    @pmi0("awayParams")
    private final Map<String, String> awayParams;

    @pmi0("url")
    private final String url;

    public AwayLinkDto(String str, Map<String, String> map) {
        this.url = str;
        this.awayParams = map;
    }

    public final Map<String, String> a() {
        return this.awayParams;
    }

    public final String b() {
        return this.url;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AwayLinkDto)) {
            return false;
        }
        AwayLinkDto awayLinkDto = (AwayLinkDto) obj;
        return epx.f(this.url, awayLinkDto.url) && epx.f(this.awayParams, awayLinkDto.awayParams);
    }

    public final int hashCode() {
        String str = this.url;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Map<String, String> map = this.awayParams;
        return hashCode + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AwayLinkDto(url=");
        sb.append(this.url);
        sb.append(", awayParams=");
        return cjl0.a(sb, this.awayParams, ')');
    }
}
