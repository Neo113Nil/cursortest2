package com.vk.sdk.api.wall.dto;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WallGetCommentsSortDto.kt */
/* loaded from: classes5.dex */
public final class WallGetCommentsSortDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ WallGetCommentsSortDto[] $VALUES;

    @pmi0("asc")
    public static final WallGetCommentsSortDto CHRONOLOGICAL;

    @pmi0(CampaignEx.JSON_KEY_DESC)
    public static final WallGetCommentsSortDto REVERSE_CHRONOLOGICAL;
    private final String value;

    static {
        WallGetCommentsSortDto wallGetCommentsSortDto = new WallGetCommentsSortDto("CHRONOLOGICAL", 0, "asc");
        CHRONOLOGICAL = wallGetCommentsSortDto;
        WallGetCommentsSortDto wallGetCommentsSortDto2 = new WallGetCommentsSortDto("REVERSE_CHRONOLOGICAL", 1, CampaignEx.JSON_KEY_DESC);
        REVERSE_CHRONOLOGICAL = wallGetCommentsSortDto2;
        WallGetCommentsSortDto[] wallGetCommentsSortDtoArr = {wallGetCommentsSortDto, wallGetCommentsSortDto2};
        $VALUES = wallGetCommentsSortDtoArr;
        $ENTRIES = new asp(wallGetCommentsSortDtoArr);
    }

    private WallGetCommentsSortDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static WallGetCommentsSortDto valueOf(String str) {
        return (WallGetCommentsSortDto) Enum.valueOf(WallGetCommentsSortDto.class, str);
    }

    public static WallGetCommentsSortDto[] values() {
        return (WallGetCommentsSortDto[]) $VALUES.clone();
    }
}
