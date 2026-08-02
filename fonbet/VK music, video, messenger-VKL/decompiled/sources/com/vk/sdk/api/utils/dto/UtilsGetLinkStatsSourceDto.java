package com.vk.sdk.api.utils.dto;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: UtilsGetLinkStatsSourceDto.kt */
/* loaded from: classes5.dex */
public final class UtilsGetLinkStatsSourceDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ UtilsGetLinkStatsSourceDto[] $VALUES;

    @pmi0("vk_cc")
    public static final UtilsGetLinkStatsSourceDto VK_CC;

    @pmi0("vk_link")
    public static final UtilsGetLinkStatsSourceDto VK_LINK;
    private final String value;

    static {
        UtilsGetLinkStatsSourceDto utilsGetLinkStatsSourceDto = new UtilsGetLinkStatsSourceDto("VK_CC", 0, "vk_cc");
        VK_CC = utilsGetLinkStatsSourceDto;
        UtilsGetLinkStatsSourceDto utilsGetLinkStatsSourceDto2 = new UtilsGetLinkStatsSourceDto("VK_LINK", 1, "vk_link");
        VK_LINK = utilsGetLinkStatsSourceDto2;
        UtilsGetLinkStatsSourceDto[] utilsGetLinkStatsSourceDtoArr = {utilsGetLinkStatsSourceDto, utilsGetLinkStatsSourceDto2};
        $VALUES = utilsGetLinkStatsSourceDtoArr;
        $ENTRIES = new asp(utilsGetLinkStatsSourceDtoArr);
    }

    private UtilsGetLinkStatsSourceDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static UtilsGetLinkStatsSourceDto valueOf(String str) {
        return (UtilsGetLinkStatsSourceDto) Enum.valueOf(UtilsGetLinkStatsSourceDto.class, str);
    }

    public static UtilsGetLinkStatsSourceDto[] values() {
        return (UtilsGetLinkStatsSourceDto[]) $VALUES.clone();
    }
}
