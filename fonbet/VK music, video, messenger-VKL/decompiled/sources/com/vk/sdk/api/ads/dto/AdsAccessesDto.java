package com.vk.sdk.api.ads.dto;

import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AdsAccessesDto.kt */
/* loaded from: classes5.dex */
public final class AdsAccessesDto {

    @pmi0("client_id")
    private final String clientId;

    @pmi0("role")
    private final AdsAccessRoleDto role;

    /* JADX WARN: Multi-variable type inference failed */
    public AdsAccessesDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdsAccessesDto)) {
            return false;
        }
        AdsAccessesDto adsAccessesDto = (AdsAccessesDto) obj;
        return epx.f(this.clientId, adsAccessesDto.clientId) && this.role == adsAccessesDto.role;
    }

    public final int hashCode() {
        String str = this.clientId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        AdsAccessRoleDto adsAccessRoleDto = this.role;
        return hashCode + (adsAccessRoleDto != null ? adsAccessRoleDto.hashCode() : 0);
    }

    public final String toString() {
        return "AdsAccessesDto(clientId=" + this.clientId + ", role=" + this.role + ")";
    }

    public AdsAccessesDto(String str, AdsAccessRoleDto adsAccessRoleDto) {
        this.clientId = str;
        this.role = adsAccessRoleDto;
    }

    public /* synthetic */ AdsAccessesDto(String str, AdsAccessRoleDto adsAccessRoleDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : adsAccessRoleDto);
    }
}
