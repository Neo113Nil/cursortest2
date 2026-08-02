package com.vk.sdk.api.groups.dto;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GroupsGroupVideoDto.kt */
/* loaded from: classes5.dex */
public final class GroupsGroupVideoDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GroupsGroupVideoDto[] $VALUES;

    @pmi0("0")
    public static final GroupsGroupVideoDto DISABLED;

    @pmi0("2")
    public static final GroupsGroupVideoDto LIMITED;

    @pmi0("1")
    public static final GroupsGroupVideoDto OPEN;
    private final int value;

    static {
        GroupsGroupVideoDto groupsGroupVideoDto = new GroupsGroupVideoDto("DISABLED", 0, 0);
        DISABLED = groupsGroupVideoDto;
        GroupsGroupVideoDto groupsGroupVideoDto2 = new GroupsGroupVideoDto("OPEN", 1, 1);
        OPEN = groupsGroupVideoDto2;
        GroupsGroupVideoDto groupsGroupVideoDto3 = new GroupsGroupVideoDto("LIMITED", 2, 2);
        LIMITED = groupsGroupVideoDto3;
        GroupsGroupVideoDto[] groupsGroupVideoDtoArr = {groupsGroupVideoDto, groupsGroupVideoDto2, groupsGroupVideoDto3};
        $VALUES = groupsGroupVideoDtoArr;
        $ENTRIES = new asp(groupsGroupVideoDtoArr);
    }

    private GroupsGroupVideoDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static GroupsGroupVideoDto valueOf(String str) {
        return (GroupsGroupVideoDto) Enum.valueOf(GroupsGroupVideoDto.class, str);
    }

    public static GroupsGroupVideoDto[] values() {
        return (GroupsGroupVideoDto[]) $VALUES.clone();
    }
}
