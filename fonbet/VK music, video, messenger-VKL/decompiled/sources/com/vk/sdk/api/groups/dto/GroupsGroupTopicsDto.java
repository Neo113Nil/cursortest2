package com.vk.sdk.api.groups.dto;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GroupsGroupTopicsDto.kt */
/* loaded from: classes5.dex */
public final class GroupsGroupTopicsDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GroupsGroupTopicsDto[] $VALUES;

    @pmi0("0")
    public static final GroupsGroupTopicsDto DISABLED;

    @pmi0("2")
    public static final GroupsGroupTopicsDto LIMITED;

    @pmi0("1")
    public static final GroupsGroupTopicsDto OPEN;
    private final int value;

    static {
        GroupsGroupTopicsDto groupsGroupTopicsDto = new GroupsGroupTopicsDto("DISABLED", 0, 0);
        DISABLED = groupsGroupTopicsDto;
        GroupsGroupTopicsDto groupsGroupTopicsDto2 = new GroupsGroupTopicsDto("OPEN", 1, 1);
        OPEN = groupsGroupTopicsDto2;
        GroupsGroupTopicsDto groupsGroupTopicsDto3 = new GroupsGroupTopicsDto("LIMITED", 2, 2);
        LIMITED = groupsGroupTopicsDto3;
        GroupsGroupTopicsDto[] groupsGroupTopicsDtoArr = {groupsGroupTopicsDto, groupsGroupTopicsDto2, groupsGroupTopicsDto3};
        $VALUES = groupsGroupTopicsDtoArr;
        $ENTRIES = new asp(groupsGroupTopicsDtoArr);
    }

    private GroupsGroupTopicsDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static GroupsGroupTopicsDto valueOf(String str) {
        return (GroupsGroupTopicsDto) Enum.valueOf(GroupsGroupTopicsDto.class, str);
    }

    public static GroupsGroupTopicsDto[] values() {
        return (GroupsGroupTopicsDto[]) $VALUES.clone();
    }
}
