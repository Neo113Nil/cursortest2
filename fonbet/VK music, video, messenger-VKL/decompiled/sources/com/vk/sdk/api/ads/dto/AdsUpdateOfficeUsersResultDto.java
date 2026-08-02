package com.vk.sdk.api.ads.dto;

import com.vk.dto.common.id.UserId;
import com.vk.sdk.api.base.dto.BaseErrorDto;
import xsna.epx;
import xsna.pmi0;
import xsna.qoy;
import xsna.zcl;

/* compiled from: AdsUpdateOfficeUsersResultDto.kt */
/* loaded from: classes5.dex */
public final class AdsUpdateOfficeUsersResultDto {

    @pmi0("error")
    private final BaseErrorDto error;

    @pmi0("is_success")
    private final boolean isSuccess;

    @pmi0("user_id")
    private final UserId userId;

    public AdsUpdateOfficeUsersResultDto(UserId userId, boolean z, BaseErrorDto baseErrorDto) {
        this.userId = userId;
        this.isSuccess = z;
        this.error = baseErrorDto;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdsUpdateOfficeUsersResultDto)) {
            return false;
        }
        AdsUpdateOfficeUsersResultDto adsUpdateOfficeUsersResultDto = (AdsUpdateOfficeUsersResultDto) obj;
        return epx.f(this.userId, adsUpdateOfficeUsersResultDto.userId) && this.isSuccess == adsUpdateOfficeUsersResultDto.isSuccess && epx.f(this.error, adsUpdateOfficeUsersResultDto.error);
    }

    public final int hashCode() {
        int b = qoy.b(Long.hashCode(this.userId.b) * 31, 31, this.isSuccess);
        BaseErrorDto baseErrorDto = this.error;
        return b + (baseErrorDto == null ? 0 : baseErrorDto.hashCode());
    }

    public final String toString() {
        return "AdsUpdateOfficeUsersResultDto(userId=" + this.userId + ", isSuccess=" + this.isSuccess + ", error=" + this.error + ")";
    }

    public /* synthetic */ AdsUpdateOfficeUsersResultDto(UserId userId, boolean z, BaseErrorDto baseErrorDto, int i, zcl zclVar) {
        this(userId, z, (i & 4) != 0 ? null : baseErrorDto);
    }
}
