package com.vk.sdk.api.ads.dto;

import com.vk.dto.common.id.UserId;
import java.util.List;
import xsna.epx;
import xsna.pmi0;

/* compiled from: AdsUsersDto.kt */
/* loaded from: classes5.dex */
public final class AdsUsersDto {

    @pmi0("accesses")
    private final List<AdsAccessesDto> accesses;

    @pmi0("user_id")
    private final UserId userId;

    public AdsUsersDto(List<AdsAccessesDto> list, UserId userId) {
        this.accesses = list;
        this.userId = userId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdsUsersDto)) {
            return false;
        }
        AdsUsersDto adsUsersDto = (AdsUsersDto) obj;
        return epx.f(this.accesses, adsUsersDto.accesses) && epx.f(this.userId, adsUsersDto.userId);
    }

    public final int hashCode() {
        return Long.hashCode(this.userId.b) + (this.accesses.hashCode() * 31);
    }

    public final String toString() {
        return "AdsUsersDto(accesses=" + this.accesses + ", userId=" + this.userId + ")";
    }
}
