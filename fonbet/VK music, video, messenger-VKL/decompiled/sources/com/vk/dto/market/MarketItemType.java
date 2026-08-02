package com.vk.dto.market;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MarketItemType.kt */
/* loaded from: classes18.dex */
public final class MarketItemType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MarketItemType[] $VALUES;
    public static final a Companion;
    public static final MarketItemType OZON;
    public static final MarketItemType VK;
    private final int type;

    /* compiled from: MarketItemType.kt */
    public static final class a {
        public static MarketItemType a(Integer num) {
            if (num == null) {
                return MarketItemType.VK;
            }
            MarketItemType marketItemType = MarketItemType.OZON;
            return num.intValue() == marketItemType.h() ? marketItemType : MarketItemType.VK;
        }
    }

    static {
        MarketItemType marketItemType = new MarketItemType("VK", 0, 1);
        VK = marketItemType;
        MarketItemType marketItemType2 = new MarketItemType("OZON", 1, 3);
        OZON = marketItemType2;
        MarketItemType[] marketItemTypeArr = {marketItemType, marketItemType2};
        $VALUES = marketItemTypeArr;
        $ENTRIES = new asp(marketItemTypeArr);
        Companion = new a();
    }

    public MarketItemType(String str, int i, int i2) {
        this.type = i2;
    }

    public static MarketItemType valueOf(String str) {
        return (MarketItemType) Enum.valueOf(MarketItemType.class, str);
    }

    public static MarketItemType[] values() {
        return (MarketItemType[]) $VALUES.clone();
    }

    public final int h() {
        return this.type;
    }
}
