package com.vk.sdk.api.groups.dto;

import ru.ok.android.webrtc.Privacy;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GroupsGetMembersFilterDto.kt */
/* loaded from: classes5.dex */
public final class GroupsGetMembersFilterDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GroupsGetMembersFilterDto[] $VALUES;

    @pmi0("donut")
    public static final GroupsGetMembersFilterDto DONUT;

    @pmi0("friends")
    public static final GroupsGetMembersFilterDto FRIENDS;

    @pmi0("managers")
    public static final GroupsGetMembersFilterDto MANAGERS;

    @pmi0("unsure")
    public static final GroupsGetMembersFilterDto UNSURE;
    private final String value;

    static {
        GroupsGetMembersFilterDto groupsGetMembersFilterDto = new GroupsGetMembersFilterDto("DONUT", 0, "donut");
        DONUT = groupsGetMembersFilterDto;
        GroupsGetMembersFilterDto groupsGetMembersFilterDto2 = new GroupsGetMembersFilterDto(Privacy.FRIENDS, 1, "friends");
        FRIENDS = groupsGetMembersFilterDto2;
        GroupsGetMembersFilterDto groupsGetMembersFilterDto3 = new GroupsGetMembersFilterDto("MANAGERS", 2, "managers");
        MANAGERS = groupsGetMembersFilterDto3;
        GroupsGetMembersFilterDto groupsGetMembersFilterDto4 = new GroupsGetMembersFilterDto("UNSURE", 3, "unsure");
        UNSURE = groupsGetMembersFilterDto4;
        GroupsGetMembersFilterDto[] groupsGetMembersFilterDtoArr = {groupsGetMembersFilterDto, groupsGetMembersFilterDto2, groupsGetMembersFilterDto3, groupsGetMembersFilterDto4};
        $VALUES = groupsGetMembersFilterDtoArr;
        $ENTRIES = new asp(groupsGetMembersFilterDtoArr);
    }

    private GroupsGetMembersFilterDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static GroupsGetMembersFilterDto valueOf(String str) {
        return (GroupsGetMembersFilterDto) Enum.valueOf(GroupsGetMembersFilterDto.class, str);
    }

    public static GroupsGetMembersFilterDto[] values() {
        return (GroupsGetMembersFilterDto[]) $VALUES.clone();
    }
}
