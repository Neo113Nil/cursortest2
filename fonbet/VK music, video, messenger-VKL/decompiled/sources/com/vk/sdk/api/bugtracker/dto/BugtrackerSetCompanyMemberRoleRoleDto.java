package com.vk.sdk.api.bugtracker.dto;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BugtrackerSetCompanyMemberRoleRoleDto.kt */
/* loaded from: classes5.dex */
public final class BugtrackerSetCompanyMemberRoleRoleDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ BugtrackerSetCompanyMemberRoleRoleDto[] $VALUES;

    @pmi0("0")
    public static final BugtrackerSetCompanyMemberRoleRoleDto TYPE_0;

    @pmi0("1")
    public static final BugtrackerSetCompanyMemberRoleRoleDto TYPE_1;
    private final int value;

    static {
        BugtrackerSetCompanyMemberRoleRoleDto bugtrackerSetCompanyMemberRoleRoleDto = new BugtrackerSetCompanyMemberRoleRoleDto("TYPE_0", 0, 0);
        TYPE_0 = bugtrackerSetCompanyMemberRoleRoleDto;
        BugtrackerSetCompanyMemberRoleRoleDto bugtrackerSetCompanyMemberRoleRoleDto2 = new BugtrackerSetCompanyMemberRoleRoleDto("TYPE_1", 1, 1);
        TYPE_1 = bugtrackerSetCompanyMemberRoleRoleDto2;
        BugtrackerSetCompanyMemberRoleRoleDto[] bugtrackerSetCompanyMemberRoleRoleDtoArr = {bugtrackerSetCompanyMemberRoleRoleDto, bugtrackerSetCompanyMemberRoleRoleDto2};
        $VALUES = bugtrackerSetCompanyMemberRoleRoleDtoArr;
        $ENTRIES = new asp(bugtrackerSetCompanyMemberRoleRoleDtoArr);
    }

    private BugtrackerSetCompanyMemberRoleRoleDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static BugtrackerSetCompanyMemberRoleRoleDto valueOf(String str) {
        return (BugtrackerSetCompanyMemberRoleRoleDto) Enum.valueOf(BugtrackerSetCompanyMemberRoleRoleDto.class, str);
    }

    public static BugtrackerSetCompanyMemberRoleRoleDto[] values() {
        return (BugtrackerSetCompanyMemberRoleRoleDto[]) $VALUES.clone();
    }
}
