package com.vk.sdk.api.groups.dto;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GroupsGroupAgeLimitsDto.kt */
/* loaded from: classes5.dex */
public final class GroupsGroupAgeLimitsDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GroupsGroupAgeLimitsDto[] $VALUES;

    @pmi0("2")
    public static final GroupsGroupAgeLimitsDto TYPE_16_PLUS;

    @pmi0("3")
    public static final GroupsGroupAgeLimitsDto TYPE_18_PLUS;

    @pmi0("1")
    public static final GroupsGroupAgeLimitsDto UNLIMITED;
    private final int value;

    static {
        GroupsGroupAgeLimitsDto groupsGroupAgeLimitsDto = new GroupsGroupAgeLimitsDto("UNLIMITED", 0, 1);
        UNLIMITED = groupsGroupAgeLimitsDto;
        GroupsGroupAgeLimitsDto groupsGroupAgeLimitsDto2 = new GroupsGroupAgeLimitsDto("TYPE_16_PLUS", 1, 2);
        TYPE_16_PLUS = groupsGroupAgeLimitsDto2;
        GroupsGroupAgeLimitsDto groupsGroupAgeLimitsDto3 = new GroupsGroupAgeLimitsDto("TYPE_18_PLUS", 2, 3);
        TYPE_18_PLUS = groupsGroupAgeLimitsDto3;
        GroupsGroupAgeLimitsDto[] groupsGroupAgeLimitsDtoArr = {groupsGroupAgeLimitsDto, groupsGroupAgeLimitsDto2, groupsGroupAgeLimitsDto3};
        $VALUES = groupsGroupAgeLimitsDtoArr;
        $ENTRIES = new asp(groupsGroupAgeLimitsDtoArr);
    }

    private GroupsGroupAgeLimitsDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static GroupsGroupAgeLimitsDto valueOf(String str) {
        return (GroupsGroupAgeLimitsDto) Enum.valueOf(GroupsGroupAgeLimitsDto.class, str);
    }

    public static GroupsGroupAgeLimitsDto[] values() {
        return (GroupsGroupAgeLimitsDto[]) $VALUES.clone();
    }
}
