package com.vk.sdk.api.groups.dto;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GroupsEditAgeLimitsDto.kt */
/* loaded from: classes5.dex */
public final class GroupsEditAgeLimitsDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GroupsEditAgeLimitsDto[] $VALUES;

    @pmi0("1")
    public static final GroupsEditAgeLimitsDto TYPE_1;

    @pmi0("2")
    public static final GroupsEditAgeLimitsDto TYPE_2;

    @pmi0("3")
    public static final GroupsEditAgeLimitsDto TYPE_3;
    private final int value;

    static {
        GroupsEditAgeLimitsDto groupsEditAgeLimitsDto = new GroupsEditAgeLimitsDto("TYPE_1", 0, 1);
        TYPE_1 = groupsEditAgeLimitsDto;
        GroupsEditAgeLimitsDto groupsEditAgeLimitsDto2 = new GroupsEditAgeLimitsDto("TYPE_2", 1, 2);
        TYPE_2 = groupsEditAgeLimitsDto2;
        GroupsEditAgeLimitsDto groupsEditAgeLimitsDto3 = new GroupsEditAgeLimitsDto("TYPE_3", 2, 3);
        TYPE_3 = groupsEditAgeLimitsDto3;
        GroupsEditAgeLimitsDto[] groupsEditAgeLimitsDtoArr = {groupsEditAgeLimitsDto, groupsEditAgeLimitsDto2, groupsEditAgeLimitsDto3};
        $VALUES = groupsEditAgeLimitsDtoArr;
        $ENTRIES = new asp(groupsEditAgeLimitsDtoArr);
    }

    private GroupsEditAgeLimitsDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static GroupsEditAgeLimitsDto valueOf(String str) {
        return (GroupsEditAgeLimitsDto) Enum.valueOf(GroupsEditAgeLimitsDto.class, str);
    }

    public static GroupsEditAgeLimitsDto[] values() {
        return (GroupsEditAgeLimitsDto[]) $VALUES.clone();
    }
}
