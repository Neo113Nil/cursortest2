package com.vk.sdk.api.aliexpress.dto;

import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AliexpressGroupInfoDto.kt */
/* loaded from: classes5.dex */
public final class AliexpressGroupInfoDto {

    @pmi0("group_name")
    private final String groupName;

    @pmi0("is_group_verified")
    private final Boolean isGroupVerified;

    /* JADX WARN: Multi-variable type inference failed */
    public AliexpressGroupInfoDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AliexpressGroupInfoDto)) {
            return false;
        }
        AliexpressGroupInfoDto aliexpressGroupInfoDto = (AliexpressGroupInfoDto) obj;
        return epx.f(this.isGroupVerified, aliexpressGroupInfoDto.isGroupVerified) && epx.f(this.groupName, aliexpressGroupInfoDto.groupName);
    }

    public final int hashCode() {
        Boolean bool = this.isGroupVerified;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.groupName;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "AliexpressGroupInfoDto(isGroupVerified=" + this.isGroupVerified + ", groupName=" + this.groupName + ")";
    }

    public AliexpressGroupInfoDto(Boolean bool, String str) {
        this.isGroupVerified = bool;
        this.groupName = str;
    }

    public /* synthetic */ AliexpressGroupInfoDto(Boolean bool, String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : str);
    }
}
