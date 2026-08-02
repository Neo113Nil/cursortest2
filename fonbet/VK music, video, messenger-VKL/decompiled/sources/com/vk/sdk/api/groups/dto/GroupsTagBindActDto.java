package com.vk.sdk.api.groups.dto;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GroupsTagBindActDto.kt */
/* loaded from: classes5.dex */
public final class GroupsTagBindActDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GroupsTagBindActDto[] $VALUES;

    @pmi0("bind")
    public static final GroupsTagBindActDto BIND;

    @pmi0("unbind")
    public static final GroupsTagBindActDto UNBIND;
    private final String value;

    static {
        GroupsTagBindActDto groupsTagBindActDto = new GroupsTagBindActDto("BIND", 0, "bind");
        BIND = groupsTagBindActDto;
        GroupsTagBindActDto groupsTagBindActDto2 = new GroupsTagBindActDto("UNBIND", 1, "unbind");
        UNBIND = groupsTagBindActDto2;
        GroupsTagBindActDto[] groupsTagBindActDtoArr = {groupsTagBindActDto, groupsTagBindActDto2};
        $VALUES = groupsTagBindActDtoArr;
        $ENTRIES = new asp(groupsTagBindActDtoArr);
    }

    private GroupsTagBindActDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static GroupsTagBindActDto valueOf(String str) {
        return (GroupsTagBindActDto) Enum.valueOf(GroupsTagBindActDto.class, str);
    }

    public static GroupsTagBindActDto[] values() {
        return (GroupsTagBindActDto[]) $VALUES.clone();
    }
}
