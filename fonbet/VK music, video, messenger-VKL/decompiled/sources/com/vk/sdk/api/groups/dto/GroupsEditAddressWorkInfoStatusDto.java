package com.vk.sdk.api.groups.dto;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GroupsEditAddressWorkInfoStatusDto.kt */
/* loaded from: classes5.dex */
public final class GroupsEditAddressWorkInfoStatusDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GroupsEditAddressWorkInfoStatusDto[] $VALUES;

    @pmi0("always_opened")
    public static final GroupsEditAddressWorkInfoStatusDto ALWAYS_OPENED;

    @pmi0("forever_closed")
    public static final GroupsEditAddressWorkInfoStatusDto FOREVER_CLOSED;

    @pmi0("no_information")
    public static final GroupsEditAddressWorkInfoStatusDto NO_INFORMATION;

    @pmi0("temporarily_closed")
    public static final GroupsEditAddressWorkInfoStatusDto TEMPORARILY_CLOSED;

    @pmi0("timetable")
    public static final GroupsEditAddressWorkInfoStatusDto TIMETABLE;
    private final String value;

    static {
        GroupsEditAddressWorkInfoStatusDto groupsEditAddressWorkInfoStatusDto = new GroupsEditAddressWorkInfoStatusDto("ALWAYS_OPENED", 0, "always_opened");
        ALWAYS_OPENED = groupsEditAddressWorkInfoStatusDto;
        GroupsEditAddressWorkInfoStatusDto groupsEditAddressWorkInfoStatusDto2 = new GroupsEditAddressWorkInfoStatusDto("FOREVER_CLOSED", 1, "forever_closed");
        FOREVER_CLOSED = groupsEditAddressWorkInfoStatusDto2;
        GroupsEditAddressWorkInfoStatusDto groupsEditAddressWorkInfoStatusDto3 = new GroupsEditAddressWorkInfoStatusDto("NO_INFORMATION", 2, "no_information");
        NO_INFORMATION = groupsEditAddressWorkInfoStatusDto3;
        GroupsEditAddressWorkInfoStatusDto groupsEditAddressWorkInfoStatusDto4 = new GroupsEditAddressWorkInfoStatusDto("TEMPORARILY_CLOSED", 3, "temporarily_closed");
        TEMPORARILY_CLOSED = groupsEditAddressWorkInfoStatusDto4;
        GroupsEditAddressWorkInfoStatusDto groupsEditAddressWorkInfoStatusDto5 = new GroupsEditAddressWorkInfoStatusDto("TIMETABLE", 4, "timetable");
        TIMETABLE = groupsEditAddressWorkInfoStatusDto5;
        GroupsEditAddressWorkInfoStatusDto[] groupsEditAddressWorkInfoStatusDtoArr = {groupsEditAddressWorkInfoStatusDto, groupsEditAddressWorkInfoStatusDto2, groupsEditAddressWorkInfoStatusDto3, groupsEditAddressWorkInfoStatusDto4, groupsEditAddressWorkInfoStatusDto5};
        $VALUES = groupsEditAddressWorkInfoStatusDtoArr;
        $ENTRIES = new asp(groupsEditAddressWorkInfoStatusDtoArr);
    }

    private GroupsEditAddressWorkInfoStatusDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static GroupsEditAddressWorkInfoStatusDto valueOf(String str) {
        return (GroupsEditAddressWorkInfoStatusDto) Enum.valueOf(GroupsEditAddressWorkInfoStatusDto.class, str);
    }

    public static GroupsEditAddressWorkInfoStatusDto[] values() {
        return (GroupsEditAddressWorkInfoStatusDto[]) $VALUES.clone();
    }
}
