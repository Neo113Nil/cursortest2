package com.vk.sdk.api.groups.dto;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GroupsAddressWorkInfoStatusDto.kt */
/* loaded from: classes5.dex */
public final class GroupsAddressWorkInfoStatusDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GroupsAddressWorkInfoStatusDto[] $VALUES;

    @pmi0("always_opened")
    public static final GroupsAddressWorkInfoStatusDto ALWAYS_OPENED;

    @pmi0("forever_closed")
    public static final GroupsAddressWorkInfoStatusDto FOREVER_CLOSED;

    @pmi0("no_information")
    public static final GroupsAddressWorkInfoStatusDto NO_INFORMATION;

    @pmi0("temporarily_closed")
    public static final GroupsAddressWorkInfoStatusDto TEMPORARILY_CLOSED;

    @pmi0("timetable")
    public static final GroupsAddressWorkInfoStatusDto TIMETABLE;
    private final String value;

    static {
        GroupsAddressWorkInfoStatusDto groupsAddressWorkInfoStatusDto = new GroupsAddressWorkInfoStatusDto("NO_INFORMATION", 0, "no_information");
        NO_INFORMATION = groupsAddressWorkInfoStatusDto;
        GroupsAddressWorkInfoStatusDto groupsAddressWorkInfoStatusDto2 = new GroupsAddressWorkInfoStatusDto("TEMPORARILY_CLOSED", 1, "temporarily_closed");
        TEMPORARILY_CLOSED = groupsAddressWorkInfoStatusDto2;
        GroupsAddressWorkInfoStatusDto groupsAddressWorkInfoStatusDto3 = new GroupsAddressWorkInfoStatusDto("ALWAYS_OPENED", 2, "always_opened");
        ALWAYS_OPENED = groupsAddressWorkInfoStatusDto3;
        GroupsAddressWorkInfoStatusDto groupsAddressWorkInfoStatusDto4 = new GroupsAddressWorkInfoStatusDto("TIMETABLE", 3, "timetable");
        TIMETABLE = groupsAddressWorkInfoStatusDto4;
        GroupsAddressWorkInfoStatusDto groupsAddressWorkInfoStatusDto5 = new GroupsAddressWorkInfoStatusDto("FOREVER_CLOSED", 4, "forever_closed");
        FOREVER_CLOSED = groupsAddressWorkInfoStatusDto5;
        GroupsAddressWorkInfoStatusDto[] groupsAddressWorkInfoStatusDtoArr = {groupsAddressWorkInfoStatusDto, groupsAddressWorkInfoStatusDto2, groupsAddressWorkInfoStatusDto3, groupsAddressWorkInfoStatusDto4, groupsAddressWorkInfoStatusDto5};
        $VALUES = groupsAddressWorkInfoStatusDtoArr;
        $ENTRIES = new asp(groupsAddressWorkInfoStatusDtoArr);
    }

    private GroupsAddressWorkInfoStatusDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static GroupsAddressWorkInfoStatusDto valueOf(String str) {
        return (GroupsAddressWorkInfoStatusDto) Enum.valueOf(GroupsAddressWorkInfoStatusDto.class, str);
    }

    public static GroupsAddressWorkInfoStatusDto[] values() {
        return (GroupsAddressWorkInfoStatusDto[]) $VALUES.clone();
    }
}
