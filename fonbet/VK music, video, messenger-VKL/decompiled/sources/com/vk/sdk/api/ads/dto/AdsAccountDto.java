package com.vk.sdk.api.ads.dto;

import com.vk.sdk.api.base.dto.BaseBoolIntDto;
import xsna.epx;
import xsna.pmi0;
import xsna.shy;
import xsna.urd0;
import xsna.vp;

/* compiled from: AdsAccountDto.kt */
/* loaded from: classes5.dex */
public final class AdsAccountDto {

    @pmi0("access_role")
    private final AdsAccessRoleDto accessRole;

    @pmi0("account_id")
    private final int accountId;

    @pmi0("account_name")
    private final String accountName;

    @pmi0("account_status")
    private final BaseBoolIntDto accountStatus;

    @pmi0("account_type")
    private final AdsAccountTypeDto accountType;

    @pmi0("can_view_budget")
    private final boolean canViewBudget;

    public AdsAccountDto(AdsAccessRoleDto adsAccessRoleDto, int i, BaseBoolIntDto baseBoolIntDto, AdsAccountTypeDto adsAccountTypeDto, String str, boolean z) {
        this.accessRole = adsAccessRoleDto;
        this.accountId = i;
        this.accountStatus = baseBoolIntDto;
        this.accountType = adsAccountTypeDto;
        this.accountName = str;
        this.canViewBudget = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdsAccountDto)) {
            return false;
        }
        AdsAccountDto adsAccountDto = (AdsAccountDto) obj;
        return this.accessRole == adsAccountDto.accessRole && this.accountId == adsAccountDto.accountId && this.accountStatus == adsAccountDto.accountStatus && this.accountType == adsAccountDto.accountType && epx.f(this.accountName, adsAccountDto.accountName) && this.canViewBudget == adsAccountDto.canViewBudget;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.canViewBudget) + urd0.a((this.accountType.hashCode() + vp.a(this.accountStatus, shy.a(this.accountId, this.accessRole.hashCode() * 31, 31), 31)) * 31, 31, this.accountName);
    }

    public final String toString() {
        return "AdsAccountDto(accessRole=" + this.accessRole + ", accountId=" + this.accountId + ", accountStatus=" + this.accountStatus + ", accountType=" + this.accountType + ", accountName=" + this.accountName + ", canViewBudget=" + this.canViewBudget + ")";
    }
}
