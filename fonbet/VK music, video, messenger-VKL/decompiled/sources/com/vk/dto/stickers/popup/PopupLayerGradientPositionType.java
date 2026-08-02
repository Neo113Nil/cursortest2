package com.vk.dto.stickers.popup;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import xsna.asp;
import xsna.epx;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PopupLayerGradientPositionType.kt */
/* loaded from: classes18.dex */
public final class PopupLayerGradientPositionType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ PopupLayerGradientPositionType[] $VALUES;
    public static final PopupLayerGradientPositionType BOTTOM;
    public static final PopupLayerGradientPositionType CENTER;
    public static final a Companion;
    public static final PopupLayerGradientPositionType LEFT;
    public static final PopupLayerGradientPositionType RIGHT;
    public static final PopupLayerGradientPositionType TOP;
    private final String typeName;

    /* compiled from: PopupLayerGradientPositionType.kt */
    public static final class a {
        public static PopupLayerGradientPositionType a(String str) {
            PopupLayerGradientPositionType popupLayerGradientPositionType;
            PopupLayerGradientPositionType[] values = PopupLayerGradientPositionType.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    popupLayerGradientPositionType = null;
                    break;
                }
                popupLayerGradientPositionType = values[i];
                if (epx.f(popupLayerGradientPositionType.h(), str)) {
                    break;
                }
                i++;
            }
            return popupLayerGradientPositionType == null ? PopupLayerGradientPositionType.CENTER : popupLayerGradientPositionType;
        }
    }

    static {
        PopupLayerGradientPositionType popupLayerGradientPositionType = new PopupLayerGradientPositionType("TOP", 0, "top");
        TOP = popupLayerGradientPositionType;
        PopupLayerGradientPositionType popupLayerGradientPositionType2 = new PopupLayerGradientPositionType("BOTTOM", 1, "bottom");
        BOTTOM = popupLayerGradientPositionType2;
        PopupLayerGradientPositionType popupLayerGradientPositionType3 = new PopupLayerGradientPositionType("LEFT", 2, TtmlNode.LEFT);
        LEFT = popupLayerGradientPositionType3;
        PopupLayerGradientPositionType popupLayerGradientPositionType4 = new PopupLayerGradientPositionType("CENTER", 3, TtmlNode.CENTER);
        CENTER = popupLayerGradientPositionType4;
        PopupLayerGradientPositionType popupLayerGradientPositionType5 = new PopupLayerGradientPositionType("RIGHT", 4, TtmlNode.RIGHT);
        RIGHT = popupLayerGradientPositionType5;
        PopupLayerGradientPositionType[] popupLayerGradientPositionTypeArr = {popupLayerGradientPositionType, popupLayerGradientPositionType2, popupLayerGradientPositionType3, popupLayerGradientPositionType4, popupLayerGradientPositionType5};
        $VALUES = popupLayerGradientPositionTypeArr;
        $ENTRIES = new asp(popupLayerGradientPositionTypeArr);
        Companion = new a();
    }

    public PopupLayerGradientPositionType(String str, int i, String str2) {
        this.typeName = str2;
    }

    public static PopupLayerGradientPositionType valueOf(String str) {
        return (PopupLayerGradientPositionType) Enum.valueOf(PopupLayerGradientPositionType.class, str);
    }

    public static PopupLayerGradientPositionType[] values() {
        return (PopupLayerGradientPositionType[]) $VALUES.clone();
    }

    public final String h() {
        return this.typeName;
    }
}
