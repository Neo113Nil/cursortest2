package com.vk.design.demo.presentation.screens.authorheader;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AuthorHeaderState.kt */
/* loaded from: classes18.dex */
public final class OverlayType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ OverlayType[] $VALUES;
    public static final OverlayType Empty;
    public static final OverlayType Pagination;
    public static final OverlayType Stories;
    public static final OverlayType StoriesEmpty;

    static {
        OverlayType overlayType = new OverlayType("Empty", 0);
        Empty = overlayType;
        OverlayType overlayType2 = new OverlayType("Pagination", 1);
        Pagination = overlayType2;
        OverlayType overlayType3 = new OverlayType("StoriesEmpty", 2);
        StoriesEmpty = overlayType3;
        OverlayType overlayType4 = new OverlayType("Stories", 3);
        Stories = overlayType4;
        OverlayType[] overlayTypeArr = {overlayType, overlayType2, overlayType3, overlayType4};
        $VALUES = overlayTypeArr;
        $ENTRIES = new asp(overlayTypeArr);
    }

    public OverlayType() {
        throw null;
    }

    public static OverlayType valueOf(String str) {
        return (OverlayType) Enum.valueOf(OverlayType.class, str);
    }

    public static OverlayType[] values() {
        return (OverlayType[]) $VALUES.clone();
    }
}
