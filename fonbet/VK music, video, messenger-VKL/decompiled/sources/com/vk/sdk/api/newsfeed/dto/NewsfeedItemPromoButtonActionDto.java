package com.vk.sdk.api.newsfeed.dto;

import xsna.epx;
import xsna.i5s;
import xsna.pmi0;
import xsna.xe9;
import xsna.zcl;

/* compiled from: NewsfeedItemPromoButtonActionDto.kt */
/* loaded from: classes5.dex */
public final class NewsfeedItemPromoButtonActionDto {

    @pmi0("target")
    private final String target;

    @pmi0("type")
    private final String type;

    @pmi0("url")
    private final String url;

    public NewsfeedItemPromoButtonActionDto() {
        this(null, null, null, 7, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsfeedItemPromoButtonActionDto)) {
            return false;
        }
        NewsfeedItemPromoButtonActionDto newsfeedItemPromoButtonActionDto = (NewsfeedItemPromoButtonActionDto) obj;
        return epx.f(this.url, newsfeedItemPromoButtonActionDto.url) && epx.f(this.type, newsfeedItemPromoButtonActionDto.type) && epx.f(this.target, newsfeedItemPromoButtonActionDto.target);
    }

    public final int hashCode() {
        String str = this.url;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.type;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.target;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        String str = this.url;
        String str2 = this.type;
        return i5s.a(xe9.a("NewsfeedItemPromoButtonActionDto(url=", str, ", type=", str2, ", target="), this.target, ")");
    }

    public NewsfeedItemPromoButtonActionDto(String str, String str2, String str3) {
        this.url = str;
        this.type = str2;
        this.target = str3;
    }

    public /* synthetic */ NewsfeedItemPromoButtonActionDto(String str, String str2, String str3, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
