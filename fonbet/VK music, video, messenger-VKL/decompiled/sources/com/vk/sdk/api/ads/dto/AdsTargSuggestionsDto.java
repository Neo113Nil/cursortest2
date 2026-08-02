package com.vk.sdk.api.ads.dto;

import xsna.epx;
import xsna.h5s;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AdsTargSuggestionsDto.kt */
/* loaded from: classes5.dex */
public final class AdsTargSuggestionsDto {

    @pmi0("id")
    private final Integer id;

    @pmi0("name")
    private final String name;

    @pmi0("parent")
    private final String parent;

    @pmi0("type")
    private final String type;

    public AdsTargSuggestionsDto() {
        this(null, null, null, null, 15, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdsTargSuggestionsDto)) {
            return false;
        }
        AdsTargSuggestionsDto adsTargSuggestionsDto = (AdsTargSuggestionsDto) obj;
        return epx.f(this.id, adsTargSuggestionsDto.id) && epx.f(this.name, adsTargSuggestionsDto.name) && epx.f(this.type, adsTargSuggestionsDto.type) && epx.f(this.parent, adsTargSuggestionsDto.parent);
    }

    public final int hashCode() {
        Integer num = this.id;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.name;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.type;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.parent;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        Integer num = this.id;
        String str = this.name;
        String str2 = this.type;
        String str3 = this.parent;
        StringBuilder sb = new StringBuilder("AdsTargSuggestionsDto(id=");
        sb.append(num);
        sb.append(", name=");
        sb.append(str);
        sb.append(", type=");
        return h5s.d(sb, str2, ", parent=", str3, ")");
    }

    public AdsTargSuggestionsDto(Integer num, String str, String str2, String str3) {
        this.id = num;
        this.name = str;
        this.type = str2;
        this.parent = str3;
    }

    public /* synthetic */ AdsTargSuggestionsDto(Integer num, String str, String str2, String str3, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3);
    }
}
