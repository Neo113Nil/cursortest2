package com.vk.sdk.api.groups.dto;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GroupsGroupPhotosDto.kt */
/* loaded from: classes5.dex */
public final class GroupsGroupPhotosDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GroupsGroupPhotosDto[] $VALUES;

    @pmi0("0")
    public static final GroupsGroupPhotosDto DISABLED;

    @pmi0("2")
    public static final GroupsGroupPhotosDto LIMITED;

    @pmi0("1")
    public static final GroupsGroupPhotosDto OPEN;
    private final int value;

    static {
        GroupsGroupPhotosDto groupsGroupPhotosDto = new GroupsGroupPhotosDto("DISABLED", 0, 0);
        DISABLED = groupsGroupPhotosDto;
        GroupsGroupPhotosDto groupsGroupPhotosDto2 = new GroupsGroupPhotosDto("OPEN", 1, 1);
        OPEN = groupsGroupPhotosDto2;
        GroupsGroupPhotosDto groupsGroupPhotosDto3 = new GroupsGroupPhotosDto("LIMITED", 2, 2);
        LIMITED = groupsGroupPhotosDto3;
        GroupsGroupPhotosDto[] groupsGroupPhotosDtoArr = {groupsGroupPhotosDto, groupsGroupPhotosDto2, groupsGroupPhotosDto3};
        $VALUES = groupsGroupPhotosDtoArr;
        $ENTRIES = new asp(groupsGroupPhotosDtoArr);
    }

    private GroupsGroupPhotosDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static GroupsGroupPhotosDto valueOf(String str) {
        return (GroupsGroupPhotosDto) Enum.valueOf(GroupsGroupPhotosDto.class, str);
    }

    public static GroupsGroupPhotosDto[] values() {
        return (GroupsGroupPhotosDto[]) $VALUES.clone();
    }
}
