package com.vk.sdk.api.utils.dto;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: UtilsGetLinkStatsExtendedSourceDto.kt */
/* loaded from: classes5.dex */
public final class UtilsGetLinkStatsExtendedSourceDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ UtilsGetLinkStatsExtendedSourceDto[] $VALUES;

    @pmi0("vk_cc")
    public static final UtilsGetLinkStatsExtendedSourceDto VK_CC;

    @pmi0("vk_link")
    public static final UtilsGetLinkStatsExtendedSourceDto VK_LINK;
    private final String value;

    static {
        UtilsGetLinkStatsExtendedSourceDto utilsGetLinkStatsExtendedSourceDto = new UtilsGetLinkStatsExtendedSourceDto("VK_CC", 0, "vk_cc");
        VK_CC = utilsGetLinkStatsExtendedSourceDto;
        UtilsGetLinkStatsExtendedSourceDto utilsGetLinkStatsExtendedSourceDto2 = new UtilsGetLinkStatsExtendedSourceDto("VK_LINK", 1, "vk_link");
        VK_LINK = utilsGetLinkStatsExtendedSourceDto2;
        UtilsGetLinkStatsExtendedSourceDto[] utilsGetLinkStatsExtendedSourceDtoArr = {utilsGetLinkStatsExtendedSourceDto, utilsGetLinkStatsExtendedSourceDto2};
        $VALUES = utilsGetLinkStatsExtendedSourceDtoArr;
        $ENTRIES = new asp(utilsGetLinkStatsExtendedSourceDtoArr);
    }

    private UtilsGetLinkStatsExtendedSourceDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static UtilsGetLinkStatsExtendedSourceDto valueOf(String str) {
        return (UtilsGetLinkStatsExtendedSourceDto) Enum.valueOf(UtilsGetLinkStatsExtendedSourceDto.class, str);
    }

    public static UtilsGetLinkStatsExtendedSourceDto[] values() {
        return (UtilsGetLinkStatsExtendedSourceDto[]) $VALUES.clone();
    }
}
