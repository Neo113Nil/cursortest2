package com.vk.sdk.api.groups.dto;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GroupsGroupIsClosedDto.kt */
/* loaded from: classes5.dex */
public final class GroupsGroupIsClosedDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GroupsGroupIsClosedDto[] $VALUES;

    @pmi0("1")
    public static final GroupsGroupIsClosedDto CLOSED;

    @pmi0("0")
    public static final GroupsGroupIsClosedDto OPEN;

    @pmi0("2")
    public static final GroupsGroupIsClosedDto PRIVATE;
    private final int value;

    static {
        GroupsGroupIsClosedDto groupsGroupIsClosedDto = new GroupsGroupIsClosedDto("OPEN", 0, 0);
        OPEN = groupsGroupIsClosedDto;
        GroupsGroupIsClosedDto groupsGroupIsClosedDto2 = new GroupsGroupIsClosedDto("CLOSED", 1, 1);
        CLOSED = groupsGroupIsClosedDto2;
        GroupsGroupIsClosedDto groupsGroupIsClosedDto3 = new GroupsGroupIsClosedDto("PRIVATE", 2, 2);
        PRIVATE = groupsGroupIsClosedDto3;
        GroupsGroupIsClosedDto[] groupsGroupIsClosedDtoArr = {groupsGroupIsClosedDto, groupsGroupIsClosedDto2, groupsGroupIsClosedDto3};
        $VALUES = groupsGroupIsClosedDtoArr;
        $ENTRIES = new asp(groupsGroupIsClosedDtoArr);
    }

    private GroupsGroupIsClosedDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static GroupsGroupIsClosedDto valueOf(String str) {
        return (GroupsGroupIsClosedDto) Enum.valueOf(GroupsGroupIsClosedDto.class, str);
    }

    public static GroupsGroupIsClosedDto[] values() {
        return (GroupsGroupIsClosedDto[]) $VALUES.clone();
    }
}
