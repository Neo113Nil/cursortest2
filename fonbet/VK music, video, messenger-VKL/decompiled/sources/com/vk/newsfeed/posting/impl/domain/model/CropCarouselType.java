package com.vk.newsfeed.posting.impl.domain.model;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CropCarouselType.kt */
/* loaded from: classes4.dex */
public final class CropCarouselType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CropCarouselType[] $VALUES;
    public static final CropCarouselType ALL;
    public static final CropCarouselType FIRST;

    static {
        CropCarouselType cropCarouselType = new CropCarouselType("ALL", 0);
        ALL = cropCarouselType;
        CropCarouselType cropCarouselType2 = new CropCarouselType("FIRST", 1);
        FIRST = cropCarouselType2;
        CropCarouselType[] cropCarouselTypeArr = {cropCarouselType, cropCarouselType2};
        $VALUES = cropCarouselTypeArr;
        $ENTRIES = new asp(cropCarouselTypeArr);
    }

    public CropCarouselType() {
        throw null;
    }

    public static CropCarouselType valueOf(String str) {
        return (CropCarouselType) Enum.valueOf(CropCarouselType.class, str);
    }

    public static CropCarouselType[] values() {
        return (CropCarouselType[]) $VALUES.clone();
    }
}
