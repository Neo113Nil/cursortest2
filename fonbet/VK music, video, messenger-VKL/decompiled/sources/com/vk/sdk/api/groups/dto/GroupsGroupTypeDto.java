package com.vk.sdk.api.groups.dto;

import androidx.core.app.NotificationCompat;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GroupsGroupTypeDto.kt */
/* loaded from: classes5.dex */
public final class GroupsGroupTypeDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GroupsGroupTypeDto[] $VALUES;

    @pmi0(NotificationCompat.CATEGORY_EVENT)
    public static final GroupsGroupTypeDto EVENT;

    @pmi0("group")
    public static final GroupsGroupTypeDto GROUP;

    @pmi0("page")
    public static final GroupsGroupTypeDto PAGE;
    private final String value;

    static {
        GroupsGroupTypeDto groupsGroupTypeDto = new GroupsGroupTypeDto("GROUP", 0, "group");
        GROUP = groupsGroupTypeDto;
        GroupsGroupTypeDto groupsGroupTypeDto2 = new GroupsGroupTypeDto("PAGE", 1, "page");
        PAGE = groupsGroupTypeDto2;
        GroupsGroupTypeDto groupsGroupTypeDto3 = new GroupsGroupTypeDto("EVENT", 2, NotificationCompat.CATEGORY_EVENT);
        EVENT = groupsGroupTypeDto3;
        GroupsGroupTypeDto[] groupsGroupTypeDtoArr = {groupsGroupTypeDto, groupsGroupTypeDto2, groupsGroupTypeDto3};
        $VALUES = groupsGroupTypeDtoArr;
        $ENTRIES = new asp(groupsGroupTypeDtoArr);
    }

    private GroupsGroupTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static GroupsGroupTypeDto valueOf(String str) {
        return (GroupsGroupTypeDto) Enum.valueOf(GroupsGroupTypeDto.class, str);
    }

    public static GroupsGroupTypeDto[] values() {
        return (GroupsGroupTypeDto[]) $VALUES.clone();
    }
}
