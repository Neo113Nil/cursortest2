package com.vk.sdk.api.groups.dto;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GroupsGroupFullMemberStatusDto.kt */
/* loaded from: classes5.dex */
public final class GroupsGroupFullMemberStatusDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GroupsGroupFullMemberStatusDto[] $VALUES;

    @pmi0("3")
    public static final GroupsGroupFullMemberStatusDto DECLINED;

    @pmi0("4")
    public static final GroupsGroupFullMemberStatusDto HAS_SENT_A_REQUEST;

    @pmi0(CampaignEx.CLICKMODE_ON)
    public static final GroupsGroupFullMemberStatusDto INVITED;

    @pmi0("1")
    public static final GroupsGroupFullMemberStatusDto MEMBER;

    @pmi0("0")
    public static final GroupsGroupFullMemberStatusDto NOT_A_MEMBER;

    @pmi0("2")
    public static final GroupsGroupFullMemberStatusDto NOT_SURE;
    private final int value;

    static {
        GroupsGroupFullMemberStatusDto groupsGroupFullMemberStatusDto = new GroupsGroupFullMemberStatusDto("NOT_A_MEMBER", 0, 0);
        NOT_A_MEMBER = groupsGroupFullMemberStatusDto;
        GroupsGroupFullMemberStatusDto groupsGroupFullMemberStatusDto2 = new GroupsGroupFullMemberStatusDto("MEMBER", 1, 1);
        MEMBER = groupsGroupFullMemberStatusDto2;
        GroupsGroupFullMemberStatusDto groupsGroupFullMemberStatusDto3 = new GroupsGroupFullMemberStatusDto("NOT_SURE", 2, 2);
        NOT_SURE = groupsGroupFullMemberStatusDto3;
        GroupsGroupFullMemberStatusDto groupsGroupFullMemberStatusDto4 = new GroupsGroupFullMemberStatusDto("DECLINED", 3, 3);
        DECLINED = groupsGroupFullMemberStatusDto4;
        GroupsGroupFullMemberStatusDto groupsGroupFullMemberStatusDto5 = new GroupsGroupFullMemberStatusDto("HAS_SENT_A_REQUEST", 4, 4);
        HAS_SENT_A_REQUEST = groupsGroupFullMemberStatusDto5;
        GroupsGroupFullMemberStatusDto groupsGroupFullMemberStatusDto6 = new GroupsGroupFullMemberStatusDto("INVITED", 5, 5);
        INVITED = groupsGroupFullMemberStatusDto6;
        GroupsGroupFullMemberStatusDto[] groupsGroupFullMemberStatusDtoArr = {groupsGroupFullMemberStatusDto, groupsGroupFullMemberStatusDto2, groupsGroupFullMemberStatusDto3, groupsGroupFullMemberStatusDto4, groupsGroupFullMemberStatusDto5, groupsGroupFullMemberStatusDto6};
        $VALUES = groupsGroupFullMemberStatusDtoArr;
        $ENTRIES = new asp(groupsGroupFullMemberStatusDtoArr);
    }

    private GroupsGroupFullMemberStatusDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static GroupsGroupFullMemberStatusDto valueOf(String str) {
        return (GroupsGroupFullMemberStatusDto) Enum.valueOf(GroupsGroupFullMemberStatusDto.class, str);
    }

    public static GroupsGroupFullMemberStatusDto[] values() {
        return (GroupsGroupFullMemberStatusDto[]) $VALUES.clone();
    }
}
