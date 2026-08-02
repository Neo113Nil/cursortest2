package com.vk.clips.sdk.shared.item.market_ads.view.models;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ClipMarketAdsCarouselUiConfig.kt */
/* loaded from: classes17.dex */
public final class OverscrollMode {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ OverscrollMode[] $VALUES;
    public static final OverscrollMode FULL;
    public static final OverscrollMode NONE;
    public static final OverscrollMode SINGLE;

    static {
        OverscrollMode overscrollMode = new OverscrollMode("SINGLE", 0);
        SINGLE = overscrollMode;
        OverscrollMode overscrollMode2 = new OverscrollMode("FULL", 1);
        FULL = overscrollMode2;
        OverscrollMode overscrollMode3 = new OverscrollMode("NONE", 2);
        NONE = overscrollMode3;
        OverscrollMode[] overscrollModeArr = {overscrollMode, overscrollMode2, overscrollMode3};
        $VALUES = overscrollModeArr;
        $ENTRIES = new asp(overscrollModeArr);
    }

    public OverscrollMode() {
        throw null;
    }

    public static OverscrollMode valueOf(String str) {
        return (OverscrollMode) Enum.valueOf(OverscrollMode.class, str);
    }

    public static OverscrollMode[] values() {
        return (OverscrollMode[]) $VALUES.clone();
    }
}
