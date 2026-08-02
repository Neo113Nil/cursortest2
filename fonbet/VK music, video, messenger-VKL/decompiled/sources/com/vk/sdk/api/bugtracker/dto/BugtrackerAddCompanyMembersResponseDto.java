package com.vk.sdk.api.bugtracker.dto;

import java.util.List;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.epx;
import xsna.pmi0;
import xsna.wq;

/* compiled from: BugtrackerAddCompanyMembersResponseDto.kt */
/* loaded from: classes5.dex */
public final class BugtrackerAddCompanyMembersResponseDto {

    @pmi0(SignalingProtocol.KEY_ERRORS)
    private final List<String> errors;

    public BugtrackerAddCompanyMembersResponseDto(List<String> list) {
        this.errors = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BugtrackerAddCompanyMembersResponseDto) && epx.f(this.errors, ((BugtrackerAddCompanyMembersResponseDto) obj).errors);
    }

    public final int hashCode() {
        return this.errors.hashCode();
    }

    public final String toString() {
        return wq.c("BugtrackerAddCompanyMembersResponseDto(errors=", ")", this.errors);
    }
}
