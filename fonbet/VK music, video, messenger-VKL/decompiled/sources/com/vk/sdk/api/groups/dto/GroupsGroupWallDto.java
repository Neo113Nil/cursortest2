package com.vk.sdk.api.groups.dto;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GroupsGroupWallDto.kt */
/* loaded from: classes5.dex */
public final class GroupsGroupWallDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GroupsGroupWallDto[] $VALUES;

    @pmi0("3")
    public static final GroupsGroupWallDto CLOSED;

    @pmi0("0")
    public static final GroupsGroupWallDto DISABLED;

    @pmi0("2")
    public static final GroupsGroupWallDto LIMITED;

    @pmi0("1")
    public static final GroupsGroupWallDto OPEN;
    private final int value;

    static {
        GroupsGroupWallDto groupsGroupWallDto = new GroupsGroupWallDto("DISABLED", 0, 0);
        DISABLED = groupsGroupWallDto;
        GroupsGroupWallDto groupsGroupWallDto2 = new GroupsGroupWallDto("OPEN", 1, 1);
        OPEN = groupsGroupWallDto2;
        GroupsGroupWallDto groupsGroupWallDto3 = new GroupsGroupWallDto("LIMITED", 2, 2);
        LIMITED = groupsGroupWallDto3;
        GroupsGroupWallDto groupsGroupWallDto4 = new GroupsGroupWallDto("CLOSED", 3, 3);
        CLOSED = groupsGroupWallDto4;
        GroupsGroupWallDto[] groupsGroupWallDtoArr = {groupsGroupWallDto, groupsGroupWallDto2, groupsGroupWallDto3, groupsGroupWallDto4};
        $VALUES = groupsGroupWallDtoArr;
        $ENTRIES = new asp(groupsGroupWallDtoArr);
    }

    private GroupsGroupWallDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static GroupsGroupWallDto valueOf(String str) {
        return (GroupsGroupWallDto) Enum.valueOf(GroupsGroupWallDto.class, str);
    }

    public static GroupsGroupWallDto[] values() {
        return (GroupsGroupWallDto[]) $VALUES.clone();
    }
}
