package com.vk.sdk.api.groups.dto;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GroupsGetMembersSortDto.kt */
/* loaded from: classes5.dex */
public final class GroupsGetMembersSortDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GroupsGetMembersSortDto[] $VALUES;

    @pmi0("id_asc")
    public static final GroupsGetMembersSortDto ID_ASC;

    @pmi0("id_desc")
    public static final GroupsGetMembersSortDto ID_DESC;

    @pmi0("time_asc")
    public static final GroupsGetMembersSortDto TIME_ASC;

    @pmi0("time_desc")
    public static final GroupsGetMembersSortDto TIME_DESC;
    private final String value;

    static {
        GroupsGetMembersSortDto groupsGetMembersSortDto = new GroupsGetMembersSortDto("ID_ASC", 0, "id_asc");
        ID_ASC = groupsGetMembersSortDto;
        GroupsGetMembersSortDto groupsGetMembersSortDto2 = new GroupsGetMembersSortDto("ID_DESC", 1, "id_desc");
        ID_DESC = groupsGetMembersSortDto2;
        GroupsGetMembersSortDto groupsGetMembersSortDto3 = new GroupsGetMembersSortDto("TIME_ASC", 2, "time_asc");
        TIME_ASC = groupsGetMembersSortDto3;
        GroupsGetMembersSortDto groupsGetMembersSortDto4 = new GroupsGetMembersSortDto("TIME_DESC", 3, "time_desc");
        TIME_DESC = groupsGetMembersSortDto4;
        GroupsGetMembersSortDto[] groupsGetMembersSortDtoArr = {groupsGetMembersSortDto, groupsGetMembersSortDto2, groupsGetMembersSortDto3, groupsGetMembersSortDto4};
        $VALUES = groupsGetMembersSortDtoArr;
        $ENTRIES = new asp(groupsGetMembersSortDtoArr);
    }

    private GroupsGetMembersSortDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static GroupsGetMembersSortDto valueOf(String str) {
        return (GroupsGetMembersSortDto) Enum.valueOf(GroupsGetMembersSortDto.class, str);
    }

    public static GroupsGetMembersSortDto[] values() {
        return (GroupsGetMembersSortDto[]) $VALUES.clone();
    }
}
