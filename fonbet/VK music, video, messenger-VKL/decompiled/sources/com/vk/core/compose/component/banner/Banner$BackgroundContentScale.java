package com.vk.core.compose.component.banner;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Banner.kt */
/* loaded from: classes17.dex */
public final class Banner$BackgroundContentScale {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ Banner$BackgroundContentScale[] $VALUES;
    public static final Banner$BackgroundContentScale Crop;
    public static final Banner$BackgroundContentScale Fit;

    static {
        Banner$BackgroundContentScale banner$BackgroundContentScale = new Banner$BackgroundContentScale("Fit", 0);
        Fit = banner$BackgroundContentScale;
        Banner$BackgroundContentScale banner$BackgroundContentScale2 = new Banner$BackgroundContentScale("Crop", 1);
        Crop = banner$BackgroundContentScale2;
        Banner$BackgroundContentScale[] banner$BackgroundContentScaleArr = {banner$BackgroundContentScale, banner$BackgroundContentScale2};
        $VALUES = banner$BackgroundContentScaleArr;
        $ENTRIES = new asp(banner$BackgroundContentScaleArr);
    }

    public Banner$BackgroundContentScale() {
        throw null;
    }

    public static Banner$BackgroundContentScale valueOf(String str) {
        return (Banner$BackgroundContentScale) Enum.valueOf(Banner$BackgroundContentScale.class, str);
    }

    public static Banner$BackgroundContentScale[] values() {
        return (Banner$BackgroundContentScale[]) $VALUES.clone();
    }
}
