package com.vk.sdk.api.groups.dto;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GroupsGroupDocsDto.kt */
/* loaded from: classes5.dex */
public final class GroupsGroupDocsDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GroupsGroupDocsDto[] $VALUES;

    @pmi0("0")
    public static final GroupsGroupDocsDto DISABLED;

    @pmi0("2")
    public static final GroupsGroupDocsDto LIMITED;

    @pmi0("1")
    public static final GroupsGroupDocsDto OPEN;
    private final int value;

    static {
        GroupsGroupDocsDto groupsGroupDocsDto = new GroupsGroupDocsDto("DISABLED", 0, 0);
        DISABLED = groupsGroupDocsDto;
        GroupsGroupDocsDto groupsGroupDocsDto2 = new GroupsGroupDocsDto("OPEN", 1, 1);
        OPEN = groupsGroupDocsDto2;
        GroupsGroupDocsDto groupsGroupDocsDto3 = new GroupsGroupDocsDto("LIMITED", 2, 2);
        LIMITED = groupsGroupDocsDto3;
        GroupsGroupDocsDto[] groupsGroupDocsDtoArr = {groupsGroupDocsDto, groupsGroupDocsDto2, groupsGroupDocsDto3};
        $VALUES = groupsGroupDocsDtoArr;
        $ENTRIES = new asp(groupsGroupDocsDtoArr);
    }

    private GroupsGroupDocsDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static GroupsGroupDocsDto valueOf(String str) {
        return (GroupsGroupDocsDto) Enum.valueOf(GroupsGroupDocsDto.class, str);
    }

    public static GroupsGroupDocsDto[] values() {
        return (GroupsGroupDocsDto[]) $VALUES.clone();
    }
}
