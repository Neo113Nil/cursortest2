package com.vk.sdk.api.groups.dto;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GroupsGroupSuggestedPrivacyDto.kt */
/* loaded from: classes5.dex */
public final class GroupsGroupSuggestedPrivacyDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GroupsGroupSuggestedPrivacyDto[] $VALUES;

    @pmi0("1")
    public static final GroupsGroupSuggestedPrivacyDto ALL;

    @pmi0("0")
    public static final GroupsGroupSuggestedPrivacyDto NONE;

    @pmi0("2")
    public static final GroupsGroupSuggestedPrivacyDto SUBSCRIBERS;
    private final int value;

    static {
        GroupsGroupSuggestedPrivacyDto groupsGroupSuggestedPrivacyDto = new GroupsGroupSuggestedPrivacyDto("NONE", 0, 0);
        NONE = groupsGroupSuggestedPrivacyDto;
        GroupsGroupSuggestedPrivacyDto groupsGroupSuggestedPrivacyDto2 = new GroupsGroupSuggestedPrivacyDto("ALL", 1, 1);
        ALL = groupsGroupSuggestedPrivacyDto2;
        GroupsGroupSuggestedPrivacyDto groupsGroupSuggestedPrivacyDto3 = new GroupsGroupSuggestedPrivacyDto("SUBSCRIBERS", 2, 2);
        SUBSCRIBERS = groupsGroupSuggestedPrivacyDto3;
        GroupsGroupSuggestedPrivacyDto[] groupsGroupSuggestedPrivacyDtoArr = {groupsGroupSuggestedPrivacyDto, groupsGroupSuggestedPrivacyDto2, groupsGroupSuggestedPrivacyDto3};
        $VALUES = groupsGroupSuggestedPrivacyDtoArr;
        $ENTRIES = new asp(groupsGroupSuggestedPrivacyDtoArr);
    }

    private GroupsGroupSuggestedPrivacyDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static GroupsGroupSuggestedPrivacyDto valueOf(String str) {
        return (GroupsGroupSuggestedPrivacyDto) Enum.valueOf(GroupsGroupSuggestedPrivacyDto.class, str);
    }

    public static GroupsGroupSuggestedPrivacyDto[] values() {
        return (GroupsGroupSuggestedPrivacyDto[]) $VALUES.clone();
    }
}
