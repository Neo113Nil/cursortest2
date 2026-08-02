package com.vk.repository.internal.repos.stickers.database.converters.dto;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PopupLayerPositionXTypeDto.kt */
/* loaded from: classes5.dex */
public final class PopupLayerPositionXTypeDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ PopupLayerPositionXTypeDto[] $VALUES;
    public static final PopupLayerPositionXTypeDto CENTER;
    public static final a Companion;
    public static final PopupLayerPositionXTypeDto LEFT;
    public static final PopupLayerPositionXTypeDto RIGHT;

    @pmi0("typeName")
    private final String typeName;

    /* compiled from: PopupLayerPositionXTypeDto.kt */
    public static final class a {
    }

    static {
        PopupLayerPositionXTypeDto popupLayerPositionXTypeDto = new PopupLayerPositionXTypeDto("LEFT", 0, TtmlNode.LEFT);
        LEFT = popupLayerPositionXTypeDto;
        PopupLayerPositionXTypeDto popupLayerPositionXTypeDto2 = new PopupLayerPositionXTypeDto("CENTER", 1, TtmlNode.CENTER);
        CENTER = popupLayerPositionXTypeDto2;
        PopupLayerPositionXTypeDto popupLayerPositionXTypeDto3 = new PopupLayerPositionXTypeDto("RIGHT", 2, TtmlNode.RIGHT);
        RIGHT = popupLayerPositionXTypeDto3;
        PopupLayerPositionXTypeDto[] popupLayerPositionXTypeDtoArr = {popupLayerPositionXTypeDto, popupLayerPositionXTypeDto2, popupLayerPositionXTypeDto3};
        $VALUES = popupLayerPositionXTypeDtoArr;
        $ENTRIES = new asp(popupLayerPositionXTypeDtoArr);
        Companion = new a();
    }

    private PopupLayerPositionXTypeDto(String str, int i, String str2) {
        this.typeName = str2;
    }

    public static PopupLayerPositionXTypeDto valueOf(String str) {
        return (PopupLayerPositionXTypeDto) Enum.valueOf(PopupLayerPositionXTypeDto.class, str);
    }

    public static PopupLayerPositionXTypeDto[] values() {
        return (PopupLayerPositionXTypeDto[]) $VALUES.clone();
    }
}
