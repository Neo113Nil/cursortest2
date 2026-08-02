package com.vk.sdk.api.base.dto;

import xsna.epx;
import xsna.i5s;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: BaseLinkRatingDto.kt */
/* loaded from: classes5.dex */
public final class BaseLinkRatingDto {

    @pmi0("reviews_count")
    private final Integer reviewsCount;

    @pmi0("stars")
    private final Float stars;

    @pmi0("type")
    private final String type;

    public BaseLinkRatingDto() {
        this(null, null, null, 7, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BaseLinkRatingDto)) {
            return false;
        }
        BaseLinkRatingDto baseLinkRatingDto = (BaseLinkRatingDto) obj;
        return epx.f(this.reviewsCount, baseLinkRatingDto.reviewsCount) && epx.f(this.stars, baseLinkRatingDto.stars) && epx.f(this.type, baseLinkRatingDto.type);
    }

    public final int hashCode() {
        Integer num = this.reviewsCount;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Float f = this.stars;
        int hashCode2 = (hashCode + (f == null ? 0 : f.hashCode())) * 31;
        String str = this.type;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        Integer num = this.reviewsCount;
        Float f = this.stars;
        String str = this.type;
        StringBuilder sb = new StringBuilder("BaseLinkRatingDto(reviewsCount=");
        sb.append(num);
        sb.append(", stars=");
        sb.append(f);
        sb.append(", type=");
        return i5s.a(sb, str, ")");
    }

    public BaseLinkRatingDto(Integer num, Float f, String str) {
        this.reviewsCount = num;
        this.stars = f;
        this.type = str;
    }

    public /* synthetic */ BaseLinkRatingDto(Integer num, Float f, String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : f, (i & 4) != 0 ? null : str);
    }
}
