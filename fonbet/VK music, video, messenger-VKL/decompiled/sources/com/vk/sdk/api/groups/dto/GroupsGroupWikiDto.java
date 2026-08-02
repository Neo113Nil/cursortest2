package com.vk.sdk.api.groups.dto;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GroupsGroupWikiDto.kt */
/* loaded from: classes5.dex */
public final class GroupsGroupWikiDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GroupsGroupWikiDto[] $VALUES;

    @pmi0("0")
    public static final GroupsGroupWikiDto DISABLED;

    @pmi0("2")
    public static final GroupsGroupWikiDto LIMITED;

    @pmi0("1")
    public static final GroupsGroupWikiDto OPEN;
    private final int value;

    static {
        GroupsGroupWikiDto groupsGroupWikiDto = new GroupsGroupWikiDto("DISABLED", 0, 0);
        DISABLED = groupsGroupWikiDto;
        GroupsGroupWikiDto groupsGroupWikiDto2 = new GroupsGroupWikiDto("OPEN", 1, 1);
        OPEN = groupsGroupWikiDto2;
        GroupsGroupWikiDto groupsGroupWikiDto3 = new GroupsGroupWikiDto("LIMITED", 2, 2);
        LIMITED = groupsGroupWikiDto3;
        GroupsGroupWikiDto[] groupsGroupWikiDtoArr = {groupsGroupWikiDto, groupsGroupWikiDto2, groupsGroupWikiDto3};
        $VALUES = groupsGroupWikiDtoArr;
        $ENTRIES = new asp(groupsGroupWikiDtoArr);
    }

    private GroupsGroupWikiDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static GroupsGroupWikiDto valueOf(String str) {
        return (GroupsGroupWikiDto) Enum.valueOf(GroupsGroupWikiDto.class, str);
    }

    public static GroupsGroupWikiDto[] values() {
        return (GroupsGroupWikiDto[]) $VALUES.clone();
    }
}
