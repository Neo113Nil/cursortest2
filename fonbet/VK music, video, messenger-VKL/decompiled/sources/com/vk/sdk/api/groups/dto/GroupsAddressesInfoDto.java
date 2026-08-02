package com.vk.sdk.api.groups.dto;

import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: GroupsAddressesInfoDto.kt */
/* loaded from: classes5.dex */
public final class GroupsAddressesInfoDto {

    @pmi0("count")
    private final Integer count;

    @pmi0("is_enabled")
    private final boolean isEnabled;

    @pmi0("main_address")
    private final GroupsAddressDto mainAddress;

    @pmi0("main_address_id")
    private final Integer mainAddressId;

    public GroupsAddressesInfoDto(boolean z, Integer num, GroupsAddressDto groupsAddressDto, Integer num2) {
        this.isEnabled = z;
        this.mainAddressId = num;
        this.mainAddress = groupsAddressDto;
        this.count = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsAddressesInfoDto)) {
            return false;
        }
        GroupsAddressesInfoDto groupsAddressesInfoDto = (GroupsAddressesInfoDto) obj;
        return this.isEnabled == groupsAddressesInfoDto.isEnabled && epx.f(this.mainAddressId, groupsAddressesInfoDto.mainAddressId) && epx.f(this.mainAddress, groupsAddressesInfoDto.mainAddress) && epx.f(this.count, groupsAddressesInfoDto.count);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.isEnabled) * 31;
        Integer num = this.mainAddressId;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        GroupsAddressDto groupsAddressDto = this.mainAddress;
        int hashCode3 = (hashCode2 + (groupsAddressDto == null ? 0 : groupsAddressDto.hashCode())) * 31;
        Integer num2 = this.count;
        return hashCode3 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return "GroupsAddressesInfoDto(isEnabled=" + this.isEnabled + ", mainAddressId=" + this.mainAddressId + ", mainAddress=" + this.mainAddress + ", count=" + this.count + ")";
    }

    public /* synthetic */ GroupsAddressesInfoDto(boolean z, Integer num, GroupsAddressDto groupsAddressDto, Integer num2, int i, zcl zclVar) {
        this(z, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : groupsAddressDto, (i & 8) != 0 ? null : num2);
    }
}
