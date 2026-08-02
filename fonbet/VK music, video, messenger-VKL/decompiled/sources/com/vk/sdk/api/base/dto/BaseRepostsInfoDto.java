package com.vk.sdk.api.base.dto;

import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: BaseRepostsInfoDto.kt */
/* loaded from: classes5.dex */
public final class BaseRepostsInfoDto {

    @pmi0("count")
    private final int count;

    @pmi0("mail_count")
    private final Integer mailCount;

    @pmi0("user_reposted")
    private final BaseBoolIntDto userReposted;

    @pmi0("wall_count")
    private final Integer wallCount;

    public BaseRepostsInfoDto(int i, Integer num, Integer num2, BaseBoolIntDto baseBoolIntDto) {
        this.count = i;
        this.wallCount = num;
        this.mailCount = num2;
        this.userReposted = baseBoolIntDto;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BaseRepostsInfoDto)) {
            return false;
        }
        BaseRepostsInfoDto baseRepostsInfoDto = (BaseRepostsInfoDto) obj;
        return this.count == baseRepostsInfoDto.count && epx.f(this.wallCount, baseRepostsInfoDto.wallCount) && epx.f(this.mailCount, baseRepostsInfoDto.mailCount) && this.userReposted == baseRepostsInfoDto.userReposted;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.count) * 31;
        Integer num = this.wallCount;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.mailCount;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto = this.userReposted;
        return hashCode3 + (baseBoolIntDto != null ? baseBoolIntDto.hashCode() : 0);
    }

    public final String toString() {
        return "BaseRepostsInfoDto(count=" + this.count + ", wallCount=" + this.wallCount + ", mailCount=" + this.mailCount + ", userReposted=" + this.userReposted + ")";
    }

    public /* synthetic */ BaseRepostsInfoDto(int i, Integer num, Integer num2, BaseBoolIntDto baseBoolIntDto, int i2, zcl zclVar) {
        this(i, (i2 & 2) != 0 ? null : num, (i2 & 4) != 0 ? null : num2, (i2 & 8) != 0 ? null : baseBoolIntDto);
    }
}
