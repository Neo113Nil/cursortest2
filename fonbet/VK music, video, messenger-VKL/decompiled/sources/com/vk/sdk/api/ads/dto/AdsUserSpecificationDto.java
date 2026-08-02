package com.vk.sdk.api.ads.dto;

import com.vk.dto.common.id.UserId;
import java.util.List;
import xsna.epx;
import xsna.pmi0;
import xsna.xq;
import xsna.zcl;

/* compiled from: AdsUserSpecificationDto.kt */
/* loaded from: classes5.dex */
public final class AdsUserSpecificationDto {

    @pmi0("client_ids")
    private final List<Integer> clientIds;

    @pmi0("grant_access_to_all_clients")
    private final Boolean grantAccessToAllClients;

    @pmi0("role")
    private final AdsAccessRolePublicDto role;

    @pmi0("user_id")
    private final UserId userId;

    @pmi0("view_budget")
    private final Boolean viewBudget;

    public AdsUserSpecificationDto(UserId userId, AdsAccessRolePublicDto adsAccessRolePublicDto, Boolean bool, List<Integer> list, Boolean bool2) {
        this.userId = userId;
        this.role = adsAccessRolePublicDto;
        this.grantAccessToAllClients = bool;
        this.clientIds = list;
        this.viewBudget = bool2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdsUserSpecificationDto)) {
            return false;
        }
        AdsUserSpecificationDto adsUserSpecificationDto = (AdsUserSpecificationDto) obj;
        return epx.f(this.userId, adsUserSpecificationDto.userId) && this.role == adsUserSpecificationDto.role && epx.f(this.grantAccessToAllClients, adsUserSpecificationDto.grantAccessToAllClients) && epx.f(this.clientIds, adsUserSpecificationDto.clientIds) && epx.f(this.viewBudget, adsUserSpecificationDto.viewBudget);
    }

    public final int hashCode() {
        int hashCode = (this.role.hashCode() + (Long.hashCode(this.userId.b) * 31)) * 31;
        Boolean bool = this.grantAccessToAllClients;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        List<Integer> list = this.clientIds;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool2 = this.viewBudget;
        return hashCode3 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        UserId userId = this.userId;
        AdsAccessRolePublicDto adsAccessRolePublicDto = this.role;
        Boolean bool = this.grantAccessToAllClients;
        List<Integer> list = this.clientIds;
        Boolean bool2 = this.viewBudget;
        StringBuilder sb = new StringBuilder("AdsUserSpecificationDto(userId=");
        sb.append(userId);
        sb.append(", role=");
        sb.append(adsAccessRolePublicDto);
        sb.append(", grantAccessToAllClients=");
        sb.append(bool);
        sb.append(", clientIds=");
        sb.append(list);
        sb.append(", viewBudget=");
        return xq.d(sb, bool2, ")");
    }

    public /* synthetic */ AdsUserSpecificationDto(UserId userId, AdsAccessRolePublicDto adsAccessRolePublicDto, Boolean bool, List list, Boolean bool2, int i, zcl zclVar) {
        this(userId, adsAccessRolePublicDto, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : bool2);
    }
}
