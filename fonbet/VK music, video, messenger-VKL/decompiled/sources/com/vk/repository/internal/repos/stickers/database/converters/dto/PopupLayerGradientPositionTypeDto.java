package com.vk.repository.internal.repos.stickers.database.converters.dto;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PopupLayerGradientPositionTypeDto.kt */
/* loaded from: classes5.dex */
public final class PopupLayerGradientPositionTypeDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ PopupLayerGradientPositionTypeDto[] $VALUES;
    public static final PopupLayerGradientPositionTypeDto BOTTOM;
    public static final PopupLayerGradientPositionTypeDto CENTER;
    public static final a Companion;
    public static final PopupLayerGradientPositionTypeDto LEFT;
    public static final PopupLayerGradientPositionTypeDto RIGHT;
    public static final PopupLayerGradientPositionTypeDto TOP;

    @pmi0("typeName")
    private final String typeName;

    /* compiled from: PopupLayerGradientPositionTypeDto.kt */
    public static final class a {
    }

    static {
        PopupLayerGradientPositionTypeDto popupLayerGradientPositionTypeDto = new PopupLayerGradientPositionTypeDto("TOP", 0, "top");
        TOP = popupLayerGradientPositionTypeDto;
        PopupLayerGradientPositionTypeDto popupLayerGradientPositionTypeDto2 = new PopupLayerGradientPositionTypeDto("BOTTOM", 1, "bottom");
        BOTTOM = popupLayerGradientPositionTypeDto2;
        PopupLayerGradientPositionTypeDto popupLayerGradientPositionTypeDto3 = new PopupLayerGradientPositionTypeDto("LEFT", 2, TtmlNode.LEFT);
        LEFT = popupLayerGradientPositionTypeDto3;
        PopupLayerGradientPositionTypeDto popupLayerGradientPositionTypeDto4 = new PopupLayerGradientPositionTypeDto("CENTER", 3, TtmlNode.CENTER);
        CENTER = popupLayerGradientPositionTypeDto4;
        PopupLayerGradientPositionTypeDto popupLayerGradientPositionTypeDto5 = new PopupLayerGradientPositionTypeDto("RIGHT", 4, TtmlNode.RIGHT);
        RIGHT = popupLayerGradientPositionTypeDto5;
        PopupLayerGradientPositionTypeDto[] popupLayerGradientPositionTypeDtoArr = {popupLayerGradientPositionTypeDto, popupLayerGradientPositionTypeDto2, popupLayerGradientPositionTypeDto3, popupLayerGradientPositionTypeDto4, popupLayerGradientPositionTypeDto5};
        $VALUES = popupLayerGradientPositionTypeDtoArr;
        $ENTRIES = new asp(popupLayerGradientPositionTypeDtoArr);
        Companion = new a();
    }

    private PopupLayerGradientPositionTypeDto(String str, int i, String str2) {
        this.typeName = str2;
    }

    public static PopupLayerGradientPositionTypeDto valueOf(String str) {
        return (PopupLayerGradientPositionTypeDto) Enum.valueOf(PopupLayerGradientPositionTypeDto.class, str);
    }

    public static PopupLayerGradientPositionTypeDto[] values() {
        return (PopupLayerGradientPositionTypeDto[]) $VALUES.clone();
    }
}
