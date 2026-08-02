package com.vk.sdk.api.ads.dto;

import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AdsUserSpecificationCuttedDto.kt */
/* loaded from: classes5.dex */
public final class AdsUserSpecificationCuttedDto {

    @pmi0("client_id")
    private final Integer clientId;

    @pmi0("role")
    private final AdsAccessRolePublicDto role;

    @pmi0("user_id")
    private final UserId userId;

    @pmi0("view_budget")
    private final Boolean viewBudget;

    public AdsUserSpecificationCuttedDto(UserId userId, AdsAccessRolePublicDto adsAccessRolePublicDto, Integer num, Boolean bool) {
        this.userId = userId;
        this.role = adsAccessRolePublicDto;
        this.clientId = num;
        this.viewBudget = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdsUserSpecificationCuttedDto)) {
            return false;
        }
        AdsUserSpecificationCuttedDto adsUserSpecificationCuttedDto = (AdsUserSpecificationCuttedDto) obj;
        return epx.f(this.userId, adsUserSpecificationCuttedDto.userId) && this.role == adsUserSpecificationCuttedDto.role && epx.f(this.clientId, adsUserSpecificationCuttedDto.clientId) && epx.f(this.viewBudget, adsUserSpecificationCuttedDto.viewBudget);
    }

    public final int hashCode() {
        int hashCode = (this.role.hashCode() + (Long.hashCode(this.userId.b) * 31)) * 31;
        Integer num = this.clientId;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.viewBudget;
        return hashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "AdsUserSpecificationCuttedDto(userId=" + this.userId + ", role=" + this.role + ", clientId=" + this.clientId + ", viewBudget=" + this.viewBudget + ")";
    }

    public /* synthetic */ AdsUserSpecificationCuttedDto(UserId userId, AdsAccessRolePublicDto adsAccessRolePublicDto, Integer num, Boolean bool, int i, zcl zclVar) {
        this(userId, adsAccessRolePublicDto, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : bool);
    }
}
