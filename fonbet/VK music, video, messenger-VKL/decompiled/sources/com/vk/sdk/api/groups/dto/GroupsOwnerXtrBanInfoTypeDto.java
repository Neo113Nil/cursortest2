package com.vk.sdk.api.groups.dto;

import com.huawei.hms.support.api.entity.common.CommonConstant;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GroupsOwnerXtrBanInfoTypeDto.kt */
/* loaded from: classes5.dex */
public final class GroupsOwnerXtrBanInfoTypeDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GroupsOwnerXtrBanInfoTypeDto[] $VALUES;

    @pmi0("group")
    public static final GroupsOwnerXtrBanInfoTypeDto GROUP;

    @pmi0(CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE)
    public static final GroupsOwnerXtrBanInfoTypeDto PROFILE;
    private final String value;

    static {
        GroupsOwnerXtrBanInfoTypeDto groupsOwnerXtrBanInfoTypeDto = new GroupsOwnerXtrBanInfoTypeDto("GROUP", 0, "group");
        GROUP = groupsOwnerXtrBanInfoTypeDto;
        GroupsOwnerXtrBanInfoTypeDto groupsOwnerXtrBanInfoTypeDto2 = new GroupsOwnerXtrBanInfoTypeDto("PROFILE", 1, CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE);
        PROFILE = groupsOwnerXtrBanInfoTypeDto2;
        GroupsOwnerXtrBanInfoTypeDto[] groupsOwnerXtrBanInfoTypeDtoArr = {groupsOwnerXtrBanInfoTypeDto, groupsOwnerXtrBanInfoTypeDto2};
        $VALUES = groupsOwnerXtrBanInfoTypeDtoArr;
        $ENTRIES = new asp(groupsOwnerXtrBanInfoTypeDtoArr);
    }

    private GroupsOwnerXtrBanInfoTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static GroupsOwnerXtrBanInfoTypeDto valueOf(String str) {
        return (GroupsOwnerXtrBanInfoTypeDto) Enum.valueOf(GroupsOwnerXtrBanInfoTypeDto.class, str);
    }

    public static GroupsOwnerXtrBanInfoTypeDto[] values() {
        return (GroupsOwnerXtrBanInfoTypeDto[]) $VALUES.clone();
    }
}
