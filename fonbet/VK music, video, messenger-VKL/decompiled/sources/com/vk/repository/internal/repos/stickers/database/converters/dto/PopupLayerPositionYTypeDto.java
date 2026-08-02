package com.vk.repository.internal.repos.stickers.database.converters.dto;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PopupLayerPositionYTypeDto.kt */
/* loaded from: classes5.dex */
public final class PopupLayerPositionYTypeDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ PopupLayerPositionYTypeDto[] $VALUES;
    public static final PopupLayerPositionYTypeDto BOTTOM;
    public static final a Companion;
    public static final PopupLayerPositionYTypeDto MIDDLE;
    public static final PopupLayerPositionYTypeDto TOP;

    @pmi0("typeName")
    private final String typeName;

    /* compiled from: PopupLayerPositionYTypeDto.kt */
    public static final class a {
    }

    static {
        PopupLayerPositionYTypeDto popupLayerPositionYTypeDto = new PopupLayerPositionYTypeDto("TOP", 0, "top");
        TOP = popupLayerPositionYTypeDto;
        PopupLayerPositionYTypeDto popupLayerPositionYTypeDto2 = new PopupLayerPositionYTypeDto("MIDDLE", 1, "middle");
        MIDDLE = popupLayerPositionYTypeDto2;
        PopupLayerPositionYTypeDto popupLayerPositionYTypeDto3 = new PopupLayerPositionYTypeDto("BOTTOM", 2, "bottom");
        BOTTOM = popupLayerPositionYTypeDto3;
        PopupLayerPositionYTypeDto[] popupLayerPositionYTypeDtoArr = {popupLayerPositionYTypeDto, popupLayerPositionYTypeDto2, popupLayerPositionYTypeDto3};
        $VALUES = popupLayerPositionYTypeDtoArr;
        $ENTRIES = new asp(popupLayerPositionYTypeDtoArr);
        Companion = new a();
    }

    private PopupLayerPositionYTypeDto(String str, int i, String str2) {
        this.typeName = str2;
    }

    public static PopupLayerPositionYTypeDto valueOf(String str) {
        return (PopupLayerPositionYTypeDto) Enum.valueOf(PopupLayerPositionYTypeDto.class, str);
    }

    public static PopupLayerPositionYTypeDto[] values() {
        return (PopupLayerPositionYTypeDto[]) $VALUES.clone();
    }
}
