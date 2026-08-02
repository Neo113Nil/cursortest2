package com.vk.repository.internal.repos.stickers.database.converters.dto;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PopupLayerRepeatTypeDto.kt */
/* loaded from: classes5.dex */
public final class PopupLayerRepeatTypeDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ PopupLayerRepeatTypeDto[] $VALUES;
    public static final a Companion;
    public static final PopupLayerRepeatTypeDto NO_REPEAT;
    public static final PopupLayerRepeatTypeDto REPEAT;
    public static final PopupLayerRepeatTypeDto REPEAT_X;
    public static final PopupLayerRepeatTypeDto REPEAT_Y;

    @pmi0("typeName")
    private final String typeName;

    /* compiled from: PopupLayerRepeatTypeDto.kt */
    public static final class a {
    }

    static {
        PopupLayerRepeatTypeDto popupLayerRepeatTypeDto = new PopupLayerRepeatTypeDto("NO_REPEAT", 0, "no-repeat");
        NO_REPEAT = popupLayerRepeatTypeDto;
        PopupLayerRepeatTypeDto popupLayerRepeatTypeDto2 = new PopupLayerRepeatTypeDto("REPEAT_X", 1, "repeat-x");
        REPEAT_X = popupLayerRepeatTypeDto2;
        PopupLayerRepeatTypeDto popupLayerRepeatTypeDto3 = new PopupLayerRepeatTypeDto("REPEAT_Y", 2, "repeat-y");
        REPEAT_Y = popupLayerRepeatTypeDto3;
        PopupLayerRepeatTypeDto popupLayerRepeatTypeDto4 = new PopupLayerRepeatTypeDto("REPEAT", 3, "repeat");
        REPEAT = popupLayerRepeatTypeDto4;
        PopupLayerRepeatTypeDto[] popupLayerRepeatTypeDtoArr = {popupLayerRepeatTypeDto, popupLayerRepeatTypeDto2, popupLayerRepeatTypeDto3, popupLayerRepeatTypeDto4};
        $VALUES = popupLayerRepeatTypeDtoArr;
        $ENTRIES = new asp(popupLayerRepeatTypeDtoArr);
        Companion = new a();
    }

    private PopupLayerRepeatTypeDto(String str, int i, String str2) {
        this.typeName = str2;
    }

    public static PopupLayerRepeatTypeDto valueOf(String str) {
        return (PopupLayerRepeatTypeDto) Enum.valueOf(PopupLayerRepeatTypeDto.class, str);
    }

    public static PopupLayerRepeatTypeDto[] values() {
        return (PopupLayerRepeatTypeDto[]) $VALUES.clone();
    }
}
