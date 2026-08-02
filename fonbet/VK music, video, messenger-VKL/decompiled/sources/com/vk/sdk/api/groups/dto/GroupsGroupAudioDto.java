package com.vk.sdk.api.groups.dto;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GroupsGroupAudioDto.kt */
/* loaded from: classes5.dex */
public final class GroupsGroupAudioDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GroupsGroupAudioDto[] $VALUES;

    @pmi0("0")
    public static final GroupsGroupAudioDto DISABLED;

    @pmi0("2")
    public static final GroupsGroupAudioDto LIMITED;

    @pmi0("1")
    public static final GroupsGroupAudioDto OPEN;
    private final int value;

    static {
        GroupsGroupAudioDto groupsGroupAudioDto = new GroupsGroupAudioDto("DISABLED", 0, 0);
        DISABLED = groupsGroupAudioDto;
        GroupsGroupAudioDto groupsGroupAudioDto2 = new GroupsGroupAudioDto("OPEN", 1, 1);
        OPEN = groupsGroupAudioDto2;
        GroupsGroupAudioDto groupsGroupAudioDto3 = new GroupsGroupAudioDto("LIMITED", 2, 2);
        LIMITED = groupsGroupAudioDto3;
        GroupsGroupAudioDto[] groupsGroupAudioDtoArr = {groupsGroupAudioDto, groupsGroupAudioDto2, groupsGroupAudioDto3};
        $VALUES = groupsGroupAudioDtoArr;
        $ENTRIES = new asp(groupsGroupAudioDtoArr);
    }

    private GroupsGroupAudioDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static GroupsGroupAudioDto valueOf(String str) {
        return (GroupsGroupAudioDto) Enum.valueOf(GroupsGroupAudioDto.class, str);
    }

    public static GroupsGroupAudioDto[] values() {
        return (GroupsGroupAudioDto[]) $VALUES.clone();
    }
}
