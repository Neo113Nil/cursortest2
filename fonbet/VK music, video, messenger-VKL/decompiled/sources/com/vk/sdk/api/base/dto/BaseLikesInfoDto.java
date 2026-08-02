package com.vk.sdk.api.base.dto;

import xsna.epx;
import xsna.pmi0;
import xsna.shy;
import xsna.to;
import xsna.vp;
import xsna.xq;
import xsna.zcl;

/* compiled from: BaseLikesInfoDto.kt */
/* loaded from: classes5.dex */
public final class BaseLikesInfoDto {

    @pmi0("can_like")
    private final BaseBoolIntDto canLike;

    @pmi0("can_publish")
    private final BaseBoolIntDto canPublish;

    @pmi0("count")
    private final int count;

    @pmi0("repost_disabled")
    private final Boolean repostDisabled;

    @pmi0("user_likes")
    private final BaseBoolIntDto userLikes;

    public BaseLikesInfoDto(BaseBoolIntDto baseBoolIntDto, int i, BaseBoolIntDto baseBoolIntDto2, BaseBoolIntDto baseBoolIntDto3, Boolean bool) {
        this.canLike = baseBoolIntDto;
        this.count = i;
        this.userLikes = baseBoolIntDto2;
        this.canPublish = baseBoolIntDto3;
        this.repostDisabled = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BaseLikesInfoDto)) {
            return false;
        }
        BaseLikesInfoDto baseLikesInfoDto = (BaseLikesInfoDto) obj;
        return this.canLike == baseLikesInfoDto.canLike && this.count == baseLikesInfoDto.count && this.userLikes == baseLikesInfoDto.userLikes && this.canPublish == baseLikesInfoDto.canPublish && epx.f(this.repostDisabled, baseLikesInfoDto.repostDisabled);
    }

    public final int hashCode() {
        int a = vp.a(this.userLikes, shy.a(this.count, this.canLike.hashCode() * 31, 31), 31);
        BaseBoolIntDto baseBoolIntDto = this.canPublish;
        int hashCode = (a + (baseBoolIntDto == null ? 0 : baseBoolIntDto.hashCode())) * 31;
        Boolean bool = this.repostDisabled;
        return hashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        BaseBoolIntDto baseBoolIntDto = this.canLike;
        int i = this.count;
        BaseBoolIntDto baseBoolIntDto2 = this.userLikes;
        BaseBoolIntDto baseBoolIntDto3 = this.canPublish;
        Boolean bool = this.repostDisabled;
        StringBuilder sb = new StringBuilder("BaseLikesInfoDto(canLike=");
        sb.append(baseBoolIntDto);
        sb.append(", count=");
        sb.append(i);
        sb.append(", userLikes=");
        to.b(sb, baseBoolIntDto2, ", canPublish=", baseBoolIntDto3, ", repostDisabled=");
        return xq.d(sb, bool, ")");
    }

    public /* synthetic */ BaseLikesInfoDto(BaseBoolIntDto baseBoolIntDto, int i, BaseBoolIntDto baseBoolIntDto2, BaseBoolIntDto baseBoolIntDto3, Boolean bool, int i2, zcl zclVar) {
        this(baseBoolIntDto, i, baseBoolIntDto2, (i2 & 8) != 0 ? null : baseBoolIntDto3, (i2 & 16) != 0 ? null : bool);
    }
}
