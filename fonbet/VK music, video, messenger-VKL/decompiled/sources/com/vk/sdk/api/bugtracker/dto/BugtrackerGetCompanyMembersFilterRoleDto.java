package com.vk.sdk.api.bugtracker.dto;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BugtrackerGetCompanyMembersFilterRoleDto.kt */
/* loaded from: classes5.dex */
public final class BugtrackerGetCompanyMembersFilterRoleDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ BugtrackerGetCompanyMembersFilterRoleDto[] $VALUES;

    @pmi0("0")
    public static final BugtrackerGetCompanyMembersFilterRoleDto TYPE_0;

    @pmi0("1")
    public static final BugtrackerGetCompanyMembersFilterRoleDto TYPE_1;
    private final int value;

    static {
        BugtrackerGetCompanyMembersFilterRoleDto bugtrackerGetCompanyMembersFilterRoleDto = new BugtrackerGetCompanyMembersFilterRoleDto("TYPE_0", 0, 0);
        TYPE_0 = bugtrackerGetCompanyMembersFilterRoleDto;
        BugtrackerGetCompanyMembersFilterRoleDto bugtrackerGetCompanyMembersFilterRoleDto2 = new BugtrackerGetCompanyMembersFilterRoleDto("TYPE_1", 1, 1);
        TYPE_1 = bugtrackerGetCompanyMembersFilterRoleDto2;
        BugtrackerGetCompanyMembersFilterRoleDto[] bugtrackerGetCompanyMembersFilterRoleDtoArr = {bugtrackerGetCompanyMembersFilterRoleDto, bugtrackerGetCompanyMembersFilterRoleDto2};
        $VALUES = bugtrackerGetCompanyMembersFilterRoleDtoArr;
        $ENTRIES = new asp(bugtrackerGetCompanyMembersFilterRoleDtoArr);
    }

    private BugtrackerGetCompanyMembersFilterRoleDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static BugtrackerGetCompanyMembersFilterRoleDto valueOf(String str) {
        return (BugtrackerGetCompanyMembersFilterRoleDto) Enum.valueOf(BugtrackerGetCompanyMembersFilterRoleDto.class, str);
    }

    public static BugtrackerGetCompanyMembersFilterRoleDto[] values() {
        return (BugtrackerGetCompanyMembersFilterRoleDto[]) $VALUES.clone();
    }
}
