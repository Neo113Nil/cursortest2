package com.vk.ecomm.products_multipicker.api;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MarketMultiPickerSource.kt */
/* loaded from: classes18.dex */
public final class MarketMultiPickerSource {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MarketMultiPickerSource[] $VALUES;
    public static final MarketMultiPickerSource CLIP_POSTING;
    public static final a Companion;
    public static final MarketMultiPickerSource POSTING;

    /* compiled from: MarketMultiPickerSource.kt */
    public static final class a {
    }

    static {
        MarketMultiPickerSource marketMultiPickerSource = new MarketMultiPickerSource("CLIP_POSTING", 0);
        CLIP_POSTING = marketMultiPickerSource;
        MarketMultiPickerSource marketMultiPickerSource2 = new MarketMultiPickerSource("POSTING", 1);
        POSTING = marketMultiPickerSource2;
        MarketMultiPickerSource[] marketMultiPickerSourceArr = {marketMultiPickerSource, marketMultiPickerSource2};
        $VALUES = marketMultiPickerSourceArr;
        $ENTRIES = new asp(marketMultiPickerSourceArr);
        Companion = new a();
    }

    public MarketMultiPickerSource() {
        throw null;
    }

    public static zrp<MarketMultiPickerSource> h() {
        return $ENTRIES;
    }

    public static MarketMultiPickerSource valueOf(String str) {
        return (MarketMultiPickerSource) Enum.valueOf(MarketMultiPickerSource.class, str);
    }

    public static MarketMultiPickerSource[] values() {
        return (MarketMultiPickerSource[]) $VALUES.clone();
    }
}
