package com.vk.dto.stickers.popup;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import xsna.asp;
import xsna.epx;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PopupLayerPositionXType.kt */
/* loaded from: classes18.dex */
public final class PopupLayerPositionXType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ PopupLayerPositionXType[] $VALUES;
    public static final PopupLayerPositionXType CENTER;
    public static final a Companion;
    public static final PopupLayerPositionXType LEFT;
    public static final PopupLayerPositionXType RIGHT;
    private final String typeName;

    /* compiled from: PopupLayerPositionXType.kt */
    public static final class a {
        public static PopupLayerPositionXType a(String str) {
            PopupLayerPositionXType popupLayerPositionXType;
            PopupLayerPositionXType[] values = PopupLayerPositionXType.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    popupLayerPositionXType = null;
                    break;
                }
                popupLayerPositionXType = values[i];
                if (epx.f(popupLayerPositionXType.h(), str)) {
                    break;
                }
                i++;
            }
            return popupLayerPositionXType == null ? PopupLayerPositionXType.CENTER : popupLayerPositionXType;
        }
    }

    static {
        PopupLayerPositionXType popupLayerPositionXType = new PopupLayerPositionXType("LEFT", 0, TtmlNode.LEFT);
        LEFT = popupLayerPositionXType;
        PopupLayerPositionXType popupLayerPositionXType2 = new PopupLayerPositionXType("CENTER", 1, TtmlNode.CENTER);
        CENTER = popupLayerPositionXType2;
        PopupLayerPositionXType popupLayerPositionXType3 = new PopupLayerPositionXType("RIGHT", 2, TtmlNode.RIGHT);
        RIGHT = popupLayerPositionXType3;
        PopupLayerPositionXType[] popupLayerPositionXTypeArr = {popupLayerPositionXType, popupLayerPositionXType2, popupLayerPositionXType3};
        $VALUES = popupLayerPositionXTypeArr;
        $ENTRIES = new asp(popupLayerPositionXTypeArr);
        Companion = new a();
    }

    public PopupLayerPositionXType(String str, int i, String str2) {
        this.typeName = str2;
    }

    public static PopupLayerPositionXType valueOf(String str) {
        return (PopupLayerPositionXType) Enum.valueOf(PopupLayerPositionXType.class, str);
    }

    public static PopupLayerPositionXType[] values() {
        return (PopupLayerPositionXType[]) $VALUES.clone();
    }

    public final String h() {
        return this.typeName;
    }
}
