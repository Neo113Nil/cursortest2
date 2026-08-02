package com.vk.sdk.api.users.dto;

import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: UsersLastSeenDto.kt */
/* loaded from: classes5.dex */
public final class UsersLastSeenDto {

    @pmi0("platform")
    private final Integer platform;

    @pmi0("time")
    private final Integer time;

    /* JADX WARN: Multi-variable type inference failed */
    public UsersLastSeenDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UsersLastSeenDto)) {
            return false;
        }
        UsersLastSeenDto usersLastSeenDto = (UsersLastSeenDto) obj;
        return epx.f(this.platform, usersLastSeenDto.platform) && epx.f(this.time, usersLastSeenDto.time);
    }

    public final int hashCode() {
        Integer num = this.platform;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.time;
        return hashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return "UsersLastSeenDto(platform=" + this.platform + ", time=" + this.time + ")";
    }

    public UsersLastSeenDto(Integer num, Integer num2) {
        this.platform = num;
        this.time = num2;
    }

    public /* synthetic */ UsersLastSeenDto(Integer num, Integer num2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2);
    }
}
