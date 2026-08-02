package com.vk.sdk.api.groups.dto;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GroupsGroupFullAgeLimitsDto.kt */
/* loaded from: classes5.dex */
public final class GroupsGroupFullAgeLimitsDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GroupsGroupFullAgeLimitsDto[] $VALUES;

    @pmi0("1")
    public static final GroupsGroupFullAgeLimitsDto NO;

    @pmi0("2")
    public static final GroupsGroupFullAgeLimitsDto OVER_16;

    @pmi0("3")
    public static final GroupsGroupFullAgeLimitsDto OVER_18;
    private final int value;

    static {
        GroupsGroupFullAgeLimitsDto groupsGroupFullAgeLimitsDto = new GroupsGroupFullAgeLimitsDto("NO", 0, 1);
        NO = groupsGroupFullAgeLimitsDto;
        GroupsGroupFullAgeLimitsDto groupsGroupFullAgeLimitsDto2 = new GroupsGroupFullAgeLimitsDto("OVER_16", 1, 2);
        OVER_16 = groupsGroupFullAgeLimitsDto2;
        GroupsGroupFullAgeLimitsDto groupsGroupFullAgeLimitsDto3 = new GroupsGroupFullAgeLimitsDto("OVER_18", 2, 3);
        OVER_18 = groupsGroupFullAgeLimitsDto3;
        GroupsGroupFullAgeLimitsDto[] groupsGroupFullAgeLimitsDtoArr = {groupsGroupFullAgeLimitsDto, groupsGroupFullAgeLimitsDto2, groupsGroupFullAgeLimitsDto3};
        $VALUES = groupsGroupFullAgeLimitsDtoArr;
        $ENTRIES = new asp(groupsGroupFullAgeLimitsDtoArr);
    }

    private GroupsGroupFullAgeLimitsDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static GroupsGroupFullAgeLimitsDto valueOf(String str) {
        return (GroupsGroupFullAgeLimitsDto) Enum.valueOf(GroupsGroupFullAgeLimitsDto.class, str);
    }

    public static GroupsGroupFullAgeLimitsDto[] values() {
        return (GroupsGroupFullAgeLimitsDto[]) $VALUES.clone();
    }
}
