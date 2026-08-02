package com.vk.dto.stickers.popup;

import xsna.asp;
import xsna.epx;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PopupLayerFitType.kt */
/* loaded from: classes18.dex */
public final class PopupLayerFitType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ PopupLayerFitType[] $VALUES;
    public static final PopupLayerFitType CONTAIN;
    public static final PopupLayerFitType COVER;
    public static final a Companion;
    private final String typeName;

    /* compiled from: PopupLayerFitType.kt */
    public static final class a {
        public static PopupLayerFitType a(String str) {
            PopupLayerFitType popupLayerFitType;
            PopupLayerFitType[] values = PopupLayerFitType.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    popupLayerFitType = null;
                    break;
                }
                popupLayerFitType = values[i];
                if (epx.f(popupLayerFitType.h(), str)) {
                    break;
                }
                i++;
            }
            return popupLayerFitType == null ? PopupLayerFitType.CONTAIN : popupLayerFitType;
        }
    }

    static {
        PopupLayerFitType popupLayerFitType = new PopupLayerFitType("CONTAIN", 0, "contain");
        CONTAIN = popupLayerFitType;
        PopupLayerFitType popupLayerFitType2 = new PopupLayerFitType("COVER", 1, "cover");
        COVER = popupLayerFitType2;
        PopupLayerFitType[] popupLayerFitTypeArr = {popupLayerFitType, popupLayerFitType2};
        $VALUES = popupLayerFitTypeArr;
        $ENTRIES = new asp(popupLayerFitTypeArr);
        Companion = new a();
    }

    public PopupLayerFitType(String str, int i, String str2) {
        this.typeName = str2;
    }

    public static PopupLayerFitType valueOf(String str) {
        return (PopupLayerFitType) Enum.valueOf(PopupLayerFitType.class, str);
    }

    public static PopupLayerFitType[] values() {
        return (PopupLayerFitType[]) $VALUES.clone();
    }

    public final String h() {
        return this.typeName;
    }
}
