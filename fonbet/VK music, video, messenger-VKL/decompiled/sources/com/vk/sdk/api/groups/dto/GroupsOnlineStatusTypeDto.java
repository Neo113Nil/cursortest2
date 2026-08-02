package com.vk.sdk.api.groups.dto;

import xsna.asp;
import xsna.eok;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GroupsOnlineStatusTypeDto.kt */
/* loaded from: classes5.dex */
public final class GroupsOnlineStatusTypeDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GroupsOnlineStatusTypeDto[] $VALUES;

    @pmi0("answer_mark")
    public static final GroupsOnlineStatusTypeDto ANSWER_MARK;

    @pmi0("none")
    public static final GroupsOnlineStatusTypeDto NONE;

    @pmi0(eok.ONLINE_EXTRAS_KEY)
    public static final GroupsOnlineStatusTypeDto ONLINE;
    private final String value;

    static {
        GroupsOnlineStatusTypeDto groupsOnlineStatusTypeDto = new GroupsOnlineStatusTypeDto("NONE", 0, "none");
        NONE = groupsOnlineStatusTypeDto;
        GroupsOnlineStatusTypeDto groupsOnlineStatusTypeDto2 = new GroupsOnlineStatusTypeDto("ONLINE", 1, eok.ONLINE_EXTRAS_KEY);
        ONLINE = groupsOnlineStatusTypeDto2;
        GroupsOnlineStatusTypeDto groupsOnlineStatusTypeDto3 = new GroupsOnlineStatusTypeDto("ANSWER_MARK", 2, "answer_mark");
        ANSWER_MARK = groupsOnlineStatusTypeDto3;
        GroupsOnlineStatusTypeDto[] groupsOnlineStatusTypeDtoArr = {groupsOnlineStatusTypeDto, groupsOnlineStatusTypeDto2, groupsOnlineStatusTypeDto3};
        $VALUES = groupsOnlineStatusTypeDtoArr;
        $ENTRIES = new asp(groupsOnlineStatusTypeDtoArr);
    }

    private GroupsOnlineStatusTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static GroupsOnlineStatusTypeDto valueOf(String str) {
        return (GroupsOnlineStatusTypeDto) Enum.valueOf(GroupsOnlineStatusTypeDto.class, str);
    }

    public static GroupsOnlineStatusTypeDto[] values() {
        return (GroupsOnlineStatusTypeDto[]) $VALUES.clone();
    }
}
