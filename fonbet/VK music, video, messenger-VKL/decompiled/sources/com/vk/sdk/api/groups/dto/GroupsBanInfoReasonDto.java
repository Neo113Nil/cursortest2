package com.vk.sdk.api.groups.dto;

import com.fyber.inneractive.sdk.external.NativeAdContent;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GroupsBanInfoReasonDto.kt */
/* loaded from: classes5.dex */
public final class GroupsBanInfoReasonDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GroupsBanInfoReasonDto[] $VALUES;

    @pmi0("4")
    public static final GroupsBanInfoReasonDto FLOOD;

    @pmi0("0")
    public static final GroupsBanInfoReasonDto OTHER;

    @pmi0("1")
    public static final GroupsBanInfoReasonDto SPAM;

    @pmi0("3")
    public static final GroupsBanInfoReasonDto STRONG_LANGUAGE;

    @pmi0("2")
    public static final GroupsBanInfoReasonDto VERBAL_ABUSE;
    private final int value;

    static {
        GroupsBanInfoReasonDto groupsBanInfoReasonDto = new GroupsBanInfoReasonDto(NativeAdContent.ViewTag.OTHER, 0, 0);
        OTHER = groupsBanInfoReasonDto;
        GroupsBanInfoReasonDto groupsBanInfoReasonDto2 = new GroupsBanInfoReasonDto("SPAM", 1, 1);
        SPAM = groupsBanInfoReasonDto2;
        GroupsBanInfoReasonDto groupsBanInfoReasonDto3 = new GroupsBanInfoReasonDto("VERBAL_ABUSE", 2, 2);
        VERBAL_ABUSE = groupsBanInfoReasonDto3;
        GroupsBanInfoReasonDto groupsBanInfoReasonDto4 = new GroupsBanInfoReasonDto("STRONG_LANGUAGE", 3, 3);
        STRONG_LANGUAGE = groupsBanInfoReasonDto4;
        GroupsBanInfoReasonDto groupsBanInfoReasonDto5 = new GroupsBanInfoReasonDto("FLOOD", 4, 4);
        FLOOD = groupsBanInfoReasonDto5;
        GroupsBanInfoReasonDto[] groupsBanInfoReasonDtoArr = {groupsBanInfoReasonDto, groupsBanInfoReasonDto2, groupsBanInfoReasonDto3, groupsBanInfoReasonDto4, groupsBanInfoReasonDto5};
        $VALUES = groupsBanInfoReasonDtoArr;
        $ENTRIES = new asp(groupsBanInfoReasonDtoArr);
    }

    private GroupsBanInfoReasonDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static GroupsBanInfoReasonDto valueOf(String str) {
        return (GroupsBanInfoReasonDto) Enum.valueOf(GroupsBanInfoReasonDto.class, str);
    }

    public static GroupsBanInfoReasonDto[] values() {
        return (GroupsBanInfoReasonDto[]) $VALUES.clone();
    }
}
