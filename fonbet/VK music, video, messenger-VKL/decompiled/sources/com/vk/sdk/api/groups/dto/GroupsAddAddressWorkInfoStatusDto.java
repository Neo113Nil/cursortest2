package com.vk.sdk.api.groups.dto;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GroupsAddAddressWorkInfoStatusDto.kt */
/* loaded from: classes5.dex */
public final class GroupsAddAddressWorkInfoStatusDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GroupsAddAddressWorkInfoStatusDto[] $VALUES;

    @pmi0("always_opened")
    public static final GroupsAddAddressWorkInfoStatusDto ALWAYS_OPENED;

    @pmi0("forever_closed")
    public static final GroupsAddAddressWorkInfoStatusDto FOREVER_CLOSED;

    @pmi0("no_information")
    public static final GroupsAddAddressWorkInfoStatusDto NO_INFORMATION;

    @pmi0("temporarily_closed")
    public static final GroupsAddAddressWorkInfoStatusDto TEMPORARILY_CLOSED;

    @pmi0("timetable")
    public static final GroupsAddAddressWorkInfoStatusDto TIMETABLE;
    private final String value;

    static {
        GroupsAddAddressWorkInfoStatusDto groupsAddAddressWorkInfoStatusDto = new GroupsAddAddressWorkInfoStatusDto("ALWAYS_OPENED", 0, "always_opened");
        ALWAYS_OPENED = groupsAddAddressWorkInfoStatusDto;
        GroupsAddAddressWorkInfoStatusDto groupsAddAddressWorkInfoStatusDto2 = new GroupsAddAddressWorkInfoStatusDto("FOREVER_CLOSED", 1, "forever_closed");
        FOREVER_CLOSED = groupsAddAddressWorkInfoStatusDto2;
        GroupsAddAddressWorkInfoStatusDto groupsAddAddressWorkInfoStatusDto3 = new GroupsAddAddressWorkInfoStatusDto("NO_INFORMATION", 2, "no_information");
        NO_INFORMATION = groupsAddAddressWorkInfoStatusDto3;
        GroupsAddAddressWorkInfoStatusDto groupsAddAddressWorkInfoStatusDto4 = new GroupsAddAddressWorkInfoStatusDto("TEMPORARILY_CLOSED", 3, "temporarily_closed");
        TEMPORARILY_CLOSED = groupsAddAddressWorkInfoStatusDto4;
        GroupsAddAddressWorkInfoStatusDto groupsAddAddressWorkInfoStatusDto5 = new GroupsAddAddressWorkInfoStatusDto("TIMETABLE", 4, "timetable");
        TIMETABLE = groupsAddAddressWorkInfoStatusDto5;
        GroupsAddAddressWorkInfoStatusDto[] groupsAddAddressWorkInfoStatusDtoArr = {groupsAddAddressWorkInfoStatusDto, groupsAddAddressWorkInfoStatusDto2, groupsAddAddressWorkInfoStatusDto3, groupsAddAddressWorkInfoStatusDto4, groupsAddAddressWorkInfoStatusDto5};
        $VALUES = groupsAddAddressWorkInfoStatusDtoArr;
        $ENTRIES = new asp(groupsAddAddressWorkInfoStatusDtoArr);
    }

    private GroupsAddAddressWorkInfoStatusDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static GroupsAddAddressWorkInfoStatusDto valueOf(String str) {
        return (GroupsAddAddressWorkInfoStatusDto) Enum.valueOf(GroupsAddAddressWorkInfoStatusDto.class, str);
    }

    public static GroupsAddAddressWorkInfoStatusDto[] values() {
        return (GroupsAddAddressWorkInfoStatusDto[]) $VALUES.clone();
    }
}
