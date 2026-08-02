package com.vk.sdk.api.base.dto;

import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: BaseLikesDto.kt */
/* loaded from: classes5.dex */
public final class BaseLikesDto {

    @pmi0("count")
    private final Integer count;

    @pmi0("user_likes")
    private final BaseBoolIntDto userLikes;

    /* JADX WARN: Multi-variable type inference failed */
    public BaseLikesDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BaseLikesDto)) {
            return false;
        }
        BaseLikesDto baseLikesDto = (BaseLikesDto) obj;
        return epx.f(this.count, baseLikesDto.count) && this.userLikes == baseLikesDto.userLikes;
    }

    public final int hashCode() {
        Integer num = this.count;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        BaseBoolIntDto baseBoolIntDto = this.userLikes;
        return hashCode + (baseBoolIntDto != null ? baseBoolIntDto.hashCode() : 0);
    }

    public final String toString() {
        return "BaseLikesDto(count=" + this.count + ", userLikes=" + this.userLikes + ")";
    }

    public BaseLikesDto(Integer num, BaseBoolIntDto baseBoolIntDto) {
        this.count = num;
        this.userLikes = baseBoolIntDto;
    }

    public /* synthetic */ BaseLikesDto(Integer num, BaseBoolIntDto baseBoolIntDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : baseBoolIntDto);
    }
}
