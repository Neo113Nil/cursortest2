package com.vk.sdk.api.groups.dto;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GroupsToggleMarketStateDto.kt */
/* loaded from: classes5.dex */
public final class GroupsToggleMarketStateDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GroupsToggleMarketStateDto[] $VALUES;

    @pmi0("advanced")
    public static final GroupsToggleMarketStateDto ADVANCED;

    @pmi0("basic")
    public static final GroupsToggleMarketStateDto BASIC;

    @pmi0("none")
    public static final GroupsToggleMarketStateDto NONE;
    private final String value;

    static {
        GroupsToggleMarketStateDto groupsToggleMarketStateDto = new GroupsToggleMarketStateDto("ADVANCED", 0, "advanced");
        ADVANCED = groupsToggleMarketStateDto;
        GroupsToggleMarketStateDto groupsToggleMarketStateDto2 = new GroupsToggleMarketStateDto("BASIC", 1, "basic");
        BASIC = groupsToggleMarketStateDto2;
        GroupsToggleMarketStateDto groupsToggleMarketStateDto3 = new GroupsToggleMarketStateDto("NONE", 2, "none");
        NONE = groupsToggleMarketStateDto3;
        GroupsToggleMarketStateDto[] groupsToggleMarketStateDtoArr = {groupsToggleMarketStateDto, groupsToggleMarketStateDto2, groupsToggleMarketStateDto3};
        $VALUES = groupsToggleMarketStateDtoArr;
        $ENTRIES = new asp(groupsToggleMarketStateDtoArr);
    }

    private GroupsToggleMarketStateDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static GroupsToggleMarketStateDto valueOf(String str) {
        return (GroupsToggleMarketStateDto) Enum.valueOf(GroupsToggleMarketStateDto.class, str);
    }

    public static GroupsToggleMarketStateDto[] values() {
        return (GroupsToggleMarketStateDto[]) $VALUES.clone();
    }
}
