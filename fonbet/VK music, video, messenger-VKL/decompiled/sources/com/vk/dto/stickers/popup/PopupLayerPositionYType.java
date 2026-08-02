package com.vk.dto.stickers.popup;

import xsna.asp;
import xsna.epx;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PopupLayerPositionYType.kt */
/* loaded from: classes18.dex */
public final class PopupLayerPositionYType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ PopupLayerPositionYType[] $VALUES;
    public static final PopupLayerPositionYType BOTTOM;
    public static final a Companion;
    public static final PopupLayerPositionYType MIDDLE;
    public static final PopupLayerPositionYType TOP;
    private final String typeName;

    /* compiled from: PopupLayerPositionYType.kt */
    public static final class a {
        public static PopupLayerPositionYType a(String str) {
            PopupLayerPositionYType popupLayerPositionYType;
            PopupLayerPositionYType[] values = PopupLayerPositionYType.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    popupLayerPositionYType = null;
                    break;
                }
                popupLayerPositionYType = values[i];
                if (epx.f(popupLayerPositionYType.h(), str)) {
                    break;
                }
                i++;
            }
            return popupLayerPositionYType == null ? PopupLayerPositionYType.MIDDLE : popupLayerPositionYType;
        }
    }

    static {
        PopupLayerPositionYType popupLayerPositionYType = new PopupLayerPositionYType("TOP", 0, "top");
        TOP = popupLayerPositionYType;
        PopupLayerPositionYType popupLayerPositionYType2 = new PopupLayerPositionYType("MIDDLE", 1, "middle");
        MIDDLE = popupLayerPositionYType2;
        PopupLayerPositionYType popupLayerPositionYType3 = new PopupLayerPositionYType("BOTTOM", 2, "bottom");
        BOTTOM = popupLayerPositionYType3;
        PopupLayerPositionYType[] popupLayerPositionYTypeArr = {popupLayerPositionYType, popupLayerPositionYType2, popupLayerPositionYType3};
        $VALUES = popupLayerPositionYTypeArr;
        $ENTRIES = new asp(popupLayerPositionYTypeArr);
        Companion = new a();
    }

    public PopupLayerPositionYType(String str, int i, String str2) {
        this.typeName = str2;
    }

    public static PopupLayerPositionYType valueOf(String str) {
        return (PopupLayerPositionYType) Enum.valueOf(PopupLayerPositionYType.class, str);
    }

    public static PopupLayerPositionYType[] values() {
        return (PopupLayerPositionYType[]) $VALUES.clone();
    }

    public final String h() {
        return this.typeName;
    }
}
