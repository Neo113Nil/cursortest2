package com.vk.dto.stickers.popup;

import xsna.asp;
import xsna.epx;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PopupLayerRepeatType.kt */
/* loaded from: classes18.dex */
public final class PopupLayerRepeatType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ PopupLayerRepeatType[] $VALUES;
    public static final a Companion;
    public static final PopupLayerRepeatType NO_REPEAT;
    public static final PopupLayerRepeatType REPEAT;
    public static final PopupLayerRepeatType REPEAT_X;
    public static final PopupLayerRepeatType REPEAT_Y;
    private final String typeName;

    /* compiled from: PopupLayerRepeatType.kt */
    public static final class a {
        public static PopupLayerRepeatType a(String str) {
            PopupLayerRepeatType popupLayerRepeatType;
            PopupLayerRepeatType[] values = PopupLayerRepeatType.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    popupLayerRepeatType = null;
                    break;
                }
                popupLayerRepeatType = values[i];
                if (epx.f(popupLayerRepeatType.h(), str)) {
                    break;
                }
                i++;
            }
            return popupLayerRepeatType == null ? PopupLayerRepeatType.NO_REPEAT : popupLayerRepeatType;
        }
    }

    static {
        PopupLayerRepeatType popupLayerRepeatType = new PopupLayerRepeatType("NO_REPEAT", 0, "no-repeat");
        NO_REPEAT = popupLayerRepeatType;
        PopupLayerRepeatType popupLayerRepeatType2 = new PopupLayerRepeatType("REPEAT_X", 1, "repeat-x");
        REPEAT_X = popupLayerRepeatType2;
        PopupLayerRepeatType popupLayerRepeatType3 = new PopupLayerRepeatType("REPEAT_Y", 2, "repeat-y");
        REPEAT_Y = popupLayerRepeatType3;
        PopupLayerRepeatType popupLayerRepeatType4 = new PopupLayerRepeatType("REPEAT", 3, "repeat");
        REPEAT = popupLayerRepeatType4;
        PopupLayerRepeatType[] popupLayerRepeatTypeArr = {popupLayerRepeatType, popupLayerRepeatType2, popupLayerRepeatType3, popupLayerRepeatType4};
        $VALUES = popupLayerRepeatTypeArr;
        $ENTRIES = new asp(popupLayerRepeatTypeArr);
        Companion = new a();
    }

    public PopupLayerRepeatType(String str, int i, String str2) {
        this.typeName = str2;
    }

    public static PopupLayerRepeatType valueOf(String str) {
        return (PopupLayerRepeatType) Enum.valueOf(PopupLayerRepeatType.class, str);
    }

    public static PopupLayerRepeatType[] values() {
        return (PopupLayerRepeatType[]) $VALUES.clone();
    }

    public final String h() {
        return this.typeName;
    }
}
