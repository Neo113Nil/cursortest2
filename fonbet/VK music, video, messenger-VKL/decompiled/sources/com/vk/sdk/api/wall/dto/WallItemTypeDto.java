package com.vk.sdk.api.wall.dto;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WallItemTypeDto.kt */
/* loaded from: classes5.dex */
public final class WallItemTypeDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ WallItemTypeDto[] $VALUES;

    @pmi0("donut_wall_donate_block")
    public static final WallItemTypeDto DONUT_WALL_DONATE_BLOCK;

    @pmi0("post")
    public static final WallItemTypeDto POST;
    private final String value;

    static {
        WallItemTypeDto wallItemTypeDto = new WallItemTypeDto("DONUT_WALL_DONATE_BLOCK", 0, "donut_wall_donate_block");
        DONUT_WALL_DONATE_BLOCK = wallItemTypeDto;
        WallItemTypeDto wallItemTypeDto2 = new WallItemTypeDto("POST", 1, "post");
        POST = wallItemTypeDto2;
        WallItemTypeDto[] wallItemTypeDtoArr = {wallItemTypeDto, wallItemTypeDto2};
        $VALUES = wallItemTypeDtoArr;
        $ENTRIES = new asp(wallItemTypeDtoArr);
    }

    private WallItemTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static WallItemTypeDto valueOf(String str) {
        return (WallItemTypeDto) Enum.valueOf(WallItemTypeDto.class, str);
    }

    public static WallItemTypeDto[] values() {
        return (WallItemTypeDto[]) $VALUES.clone();
    }
}
