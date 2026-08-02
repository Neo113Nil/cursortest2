package com.vk.clips.sdk.shared.item.market_ads.view.models;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ClipMarketAdsCarouselUiConfig.kt */
/* loaded from: classes17.dex */
public final class CarouselMode {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CarouselMode[] $VALUES;
    public static final CarouselMode DOUBLE;
    public static final CarouselMode SINGLE;

    static {
        CarouselMode carouselMode = new CarouselMode("SINGLE", 0);
        SINGLE = carouselMode;
        CarouselMode carouselMode2 = new CarouselMode("DOUBLE", 1);
        DOUBLE = carouselMode2;
        CarouselMode[] carouselModeArr = {carouselMode, carouselMode2};
        $VALUES = carouselModeArr;
        $ENTRIES = new asp(carouselModeArr);
    }

    public CarouselMode() {
        throw null;
    }

    public static CarouselMode valueOf(String str) {
        return (CarouselMode) Enum.valueOf(CarouselMode.class, str);
    }

    public static CarouselMode[] values() {
        return (CarouselMode[]) $VALUES.clone();
    }
}
