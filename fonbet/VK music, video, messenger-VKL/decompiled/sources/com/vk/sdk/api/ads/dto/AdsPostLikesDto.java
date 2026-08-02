package com.vk.sdk.api.ads.dto;

import xsna.epx;
import xsna.oq;
import xsna.pmi0;
import xsna.wr;
import xsna.zcl;

/* compiled from: AdsPostLikesDto.kt */
/* loaded from: classes5.dex */
public final class AdsPostLikesDto {

    @pmi0("can_like")
    private final Integer canLike;

    @pmi0("count")
    private final Integer count;

    @pmi0("user_likes")
    private final Integer userLikes;

    public AdsPostLikesDto() {
        this(null, null, null, 7, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdsPostLikesDto)) {
            return false;
        }
        AdsPostLikesDto adsPostLikesDto = (AdsPostLikesDto) obj;
        return epx.f(this.canLike, adsPostLikesDto.canLike) && epx.f(this.count, adsPostLikesDto.count) && epx.f(this.userLikes, adsPostLikesDto.userLikes);
    }

    public final int hashCode() {
        Integer num = this.canLike;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.count;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.userLikes;
        return hashCode2 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        Integer num = this.canLike;
        Integer num2 = this.count;
        return oq.b(wr.a(num, "AdsPostLikesDto(canLike=", num2, ", count=", ", userLikes="), this.userLikes, ")");
    }

    public AdsPostLikesDto(Integer num, Integer num2, Integer num3) {
        this.canLike = num;
        this.count = num2;
        this.userLikes = num3;
    }

    public /* synthetic */ AdsPostLikesDto(Integer num, Integer num2, Integer num3, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : num3);
    }
}
