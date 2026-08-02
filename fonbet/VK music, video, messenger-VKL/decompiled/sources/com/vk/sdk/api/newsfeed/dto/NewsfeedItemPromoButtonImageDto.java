package com.vk.sdk.api.newsfeed.dto;

import xsna.epx;
import xsna.i5s;
import xsna.pmi0;
import xsna.wr;
import xsna.zcl;

/* compiled from: NewsfeedItemPromoButtonImageDto.kt */
/* loaded from: classes5.dex */
public final class NewsfeedItemPromoButtonImageDto {

    @pmi0("height")
    private final Integer height;

    @pmi0("url")
    private final String url;

    @pmi0("width")
    private final Integer width;

    public NewsfeedItemPromoButtonImageDto() {
        this(null, null, null, 7, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsfeedItemPromoButtonImageDto)) {
            return false;
        }
        NewsfeedItemPromoButtonImageDto newsfeedItemPromoButtonImageDto = (NewsfeedItemPromoButtonImageDto) obj;
        return epx.f(this.width, newsfeedItemPromoButtonImageDto.width) && epx.f(this.height, newsfeedItemPromoButtonImageDto.height) && epx.f(this.url, newsfeedItemPromoButtonImageDto.url);
    }

    public final int hashCode() {
        Integer num = this.width;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.height;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.url;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        Integer num = this.width;
        Integer num2 = this.height;
        return i5s.a(wr.a(num, "NewsfeedItemPromoButtonImageDto(width=", num2, ", height=", ", url="), this.url, ")");
    }

    public NewsfeedItemPromoButtonImageDto(Integer num, Integer num2, String str) {
        this.width = num;
        this.height = num2;
        this.url = str;
    }

    public /* synthetic */ NewsfeedItemPromoButtonImageDto(Integer num, Integer num2, String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : str);
    }
}
