package com.vk.sdk.api.groups.dto;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GroupsGroupAdminLevelDto.kt */
/* loaded from: classes5.dex */
public final class GroupsGroupAdminLevelDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GroupsGroupAdminLevelDto[] $VALUES;

    @pmi0("3")
    public static final GroupsGroupAdminLevelDto ADMINISTRATOR;

    @pmi0("2")
    public static final GroupsGroupAdminLevelDto EDITOR;

    @pmi0("1")
    public static final GroupsGroupAdminLevelDto MODERATOR;
    private final int value;

    static {
        GroupsGroupAdminLevelDto groupsGroupAdminLevelDto = new GroupsGroupAdminLevelDto("MODERATOR", 0, 1);
        MODERATOR = groupsGroupAdminLevelDto;
        GroupsGroupAdminLevelDto groupsGroupAdminLevelDto2 = new GroupsGroupAdminLevelDto("EDITOR", 1, 2);
        EDITOR = groupsGroupAdminLevelDto2;
        GroupsGroupAdminLevelDto groupsGroupAdminLevelDto3 = new GroupsGroupAdminLevelDto("ADMINISTRATOR", 2, 3);
        ADMINISTRATOR = groupsGroupAdminLevelDto3;
        GroupsGroupAdminLevelDto[] groupsGroupAdminLevelDtoArr = {groupsGroupAdminLevelDto, groupsGroupAdminLevelDto2, groupsGroupAdminLevelDto3};
        $VALUES = groupsGroupAdminLevelDtoArr;
        $ENTRIES = new asp(groupsGroupAdminLevelDtoArr);
    }

    private GroupsGroupAdminLevelDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static GroupsGroupAdminLevelDto valueOf(String str) {
        return (GroupsGroupAdminLevelDto) Enum.valueOf(GroupsGroupAdminLevelDto.class, str);
    }

    public static GroupsGroupAdminLevelDto[] values() {
        return (GroupsGroupAdminLevelDto[]) $VALUES.clone();
    }
}
