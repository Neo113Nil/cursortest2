package com.vk.sdk.api.groups.dto;

import com.mbridge.msdk.foundation.entity.b;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GroupsMemberRolePermissionDto.kt */
/* loaded from: classes5.dex */
public final class GroupsMemberRolePermissionDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GroupsMemberRolePermissionDto[] $VALUES;

    @pmi0(b.JSON_KEY_ADS)
    public static final GroupsMemberRolePermissionDto ADS;
    private final String value;

    static {
        GroupsMemberRolePermissionDto groupsMemberRolePermissionDto = new GroupsMemberRolePermissionDto("ADS", 0, b.JSON_KEY_ADS);
        ADS = groupsMemberRolePermissionDto;
        GroupsMemberRolePermissionDto[] groupsMemberRolePermissionDtoArr = {groupsMemberRolePermissionDto};
        $VALUES = groupsMemberRolePermissionDtoArr;
        $ENTRIES = new asp(groupsMemberRolePermissionDtoArr);
    }

    private GroupsMemberRolePermissionDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static GroupsMemberRolePermissionDto valueOf(String str) {
        return (GroupsMemberRolePermissionDto) Enum.valueOf(GroupsMemberRolePermissionDto.class, str);
    }

    public static GroupsMemberRolePermissionDto[] values() {
        return (GroupsMemberRolePermissionDto[]) $VALUES.clone();
    }
}
