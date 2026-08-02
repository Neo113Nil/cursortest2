package com.vk.repository.internal.repos.stickers.database.converters.dto;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PopupLayerFitTypeDto.kt */
/* loaded from: classes5.dex */
public final class PopupLayerFitTypeDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ PopupLayerFitTypeDto[] $VALUES;
    public static final PopupLayerFitTypeDto CONTAIN;
    public static final PopupLayerFitTypeDto COVER;
    public static final a Companion;

    @pmi0("typeName")
    private final String typeName;

    /* compiled from: PopupLayerFitTypeDto.kt */
    public static final class a {
    }

    static {
        PopupLayerFitTypeDto popupLayerFitTypeDto = new PopupLayerFitTypeDto("CONTAIN", 0, "contain");
        CONTAIN = popupLayerFitTypeDto;
        PopupLayerFitTypeDto popupLayerFitTypeDto2 = new PopupLayerFitTypeDto("COVER", 1, "cover");
        COVER = popupLayerFitTypeDto2;
        PopupLayerFitTypeDto[] popupLayerFitTypeDtoArr = {popupLayerFitTypeDto, popupLayerFitTypeDto2};
        $VALUES = popupLayerFitTypeDtoArr;
        $ENTRIES = new asp(popupLayerFitTypeDtoArr);
        Companion = new a();
    }

    private PopupLayerFitTypeDto(String str, int i, String str2) {
        this.typeName = str2;
    }

    public static PopupLayerFitTypeDto valueOf(String str) {
        return (PopupLayerFitTypeDto) Enum.valueOf(PopupLayerFitTypeDto.class, str);
    }

    public static PopupLayerFitTypeDto[] values() {
        return (PopupLayerFitTypeDto[]) $VALUES.clone();
    }
}
