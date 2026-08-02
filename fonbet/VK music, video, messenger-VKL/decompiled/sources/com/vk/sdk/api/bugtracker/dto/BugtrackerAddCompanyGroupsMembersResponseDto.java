package com.vk.sdk.api.bugtracker.dto;

import java.util.List;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.epx;
import xsna.pmi0;
import xsna.wq;

/* compiled from: BugtrackerAddCompanyGroupsMembersResponseDto.kt */
/* loaded from: classes5.dex */
public final class BugtrackerAddCompanyGroupsMembersResponseDto {

    @pmi0(SignalingProtocol.KEY_ERRORS)
    private final List<BugtrackerAddCompanyGroupsMembersErrorDto> errors;

    public BugtrackerAddCompanyGroupsMembersResponseDto(List<BugtrackerAddCompanyGroupsMembersErrorDto> list) {
        this.errors = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BugtrackerAddCompanyGroupsMembersResponseDto) && epx.f(this.errors, ((BugtrackerAddCompanyGroupsMembersResponseDto) obj).errors);
    }

    public final int hashCode() {
        return this.errors.hashCode();
    }

    public final String toString() {
        return wq.c("BugtrackerAddCompanyGroupsMembersResponseDto(errors=", ")", this.errors);
    }
}
