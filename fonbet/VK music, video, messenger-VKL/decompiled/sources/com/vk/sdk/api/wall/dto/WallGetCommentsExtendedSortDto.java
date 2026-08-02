package com.vk.sdk.api.wall.dto;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WallGetCommentsExtendedSortDto.kt */
/* loaded from: classes5.dex */
public final class WallGetCommentsExtendedSortDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ WallGetCommentsExtendedSortDto[] $VALUES;

    @pmi0("asc")
    public static final WallGetCommentsExtendedSortDto CHRONOLOGICAL;

    @pmi0(CampaignEx.JSON_KEY_DESC)
    public static final WallGetCommentsExtendedSortDto REVERSE_CHRONOLOGICAL;
    private final String value;

    static {
        WallGetCommentsExtendedSortDto wallGetCommentsExtendedSortDto = new WallGetCommentsExtendedSortDto("CHRONOLOGICAL", 0, "asc");
        CHRONOLOGICAL = wallGetCommentsExtendedSortDto;
        WallGetCommentsExtendedSortDto wallGetCommentsExtendedSortDto2 = new WallGetCommentsExtendedSortDto("REVERSE_CHRONOLOGICAL", 1, CampaignEx.JSON_KEY_DESC);
        REVERSE_CHRONOLOGICAL = wallGetCommentsExtendedSortDto2;
        WallGetCommentsExtendedSortDto[] wallGetCommentsExtendedSortDtoArr = {wallGetCommentsExtendedSortDto, wallGetCommentsExtendedSortDto2};
        $VALUES = wallGetCommentsExtendedSortDtoArr;
        $ENTRIES = new asp(wallGetCommentsExtendedSortDtoArr);
    }

    private WallGetCommentsExtendedSortDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static WallGetCommentsExtendedSortDto valueOf(String str) {
        return (WallGetCommentsExtendedSortDto) Enum.valueOf(WallGetCommentsExtendedSortDto.class, str);
    }

    public static WallGetCommentsExtendedSortDto[] values() {
        return (WallGetCommentsExtendedSortDto[]) $VALUES.clone();
    }
}
