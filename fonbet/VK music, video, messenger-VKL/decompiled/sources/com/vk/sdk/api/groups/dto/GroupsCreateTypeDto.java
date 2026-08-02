package com.vk.sdk.api.groups.dto;

import androidx.core.app.NotificationCompat;
import io.appmetrica.analytics.BuildConfig;
import ru.ok.android.webrtc.Privacy;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GroupsCreateTypeDto.kt */
/* loaded from: classes5.dex */
public final class GroupsCreateTypeDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GroupsCreateTypeDto[] $VALUES;

    @pmi0(NotificationCompat.CATEGORY_EVENT)
    public static final GroupsCreateTypeDto EVENT;

    @pmi0("group")
    public static final GroupsCreateTypeDto GROUP;

    @pmi0(BuildConfig.SDK_BUILD_FLAVOR)
    public static final GroupsCreateTypeDto PUBLIC;
    private final String value;

    static {
        GroupsCreateTypeDto groupsCreateTypeDto = new GroupsCreateTypeDto("EVENT", 0, NotificationCompat.CATEGORY_EVENT);
        EVENT = groupsCreateTypeDto;
        GroupsCreateTypeDto groupsCreateTypeDto2 = new GroupsCreateTypeDto("GROUP", 1, "group");
        GROUP = groupsCreateTypeDto2;
        GroupsCreateTypeDto groupsCreateTypeDto3 = new GroupsCreateTypeDto(Privacy.PUBLIC, 2, BuildConfig.SDK_BUILD_FLAVOR);
        PUBLIC = groupsCreateTypeDto3;
        GroupsCreateTypeDto[] groupsCreateTypeDtoArr = {groupsCreateTypeDto, groupsCreateTypeDto2, groupsCreateTypeDto3};
        $VALUES = groupsCreateTypeDtoArr;
        $ENTRIES = new asp(groupsCreateTypeDtoArr);
    }

    private GroupsCreateTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static GroupsCreateTypeDto valueOf(String str) {
        return (GroupsCreateTypeDto) Enum.valueOf(GroupsCreateTypeDto.class, str);
    }

    public static GroupsCreateTypeDto[] values() {
        return (GroupsCreateTypeDto[]) $VALUES.clone();
    }
}
