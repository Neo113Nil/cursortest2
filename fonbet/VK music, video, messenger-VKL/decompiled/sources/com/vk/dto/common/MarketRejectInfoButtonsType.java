package com.vk.dto.common;

import xsna.asp;
import xsna.epx;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MarketRejectInfo.kt */
/* loaded from: classes18.dex */
public final class MarketRejectInfoButtonsType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MarketRejectInfoButtonsType[] $VALUES;
    public static final a Companion;
    public static final MarketRejectInfoButtonsType MARKET_DELETE;
    public static final MarketRejectInfoButtonsType MARKET_EDIT;
    private final String type;

    /* compiled from: MarketRejectInfo.kt */
    public static final class a {
        public static MarketRejectInfoButtonsType a(String str) {
            for (MarketRejectInfoButtonsType marketRejectInfoButtonsType : MarketRejectInfoButtonsType.values()) {
                if (epx.f(marketRejectInfoButtonsType.h(), str)) {
                    return marketRejectInfoButtonsType;
                }
            }
            return null;
        }
    }

    static {
        MarketRejectInfoButtonsType marketRejectInfoButtonsType = new MarketRejectInfoButtonsType("MARKET_EDIT", 0, "market_edit");
        MARKET_EDIT = marketRejectInfoButtonsType;
        MarketRejectInfoButtonsType marketRejectInfoButtonsType2 = new MarketRejectInfoButtonsType("MARKET_DELETE", 1, "market_delete");
        MARKET_DELETE = marketRejectInfoButtonsType2;
        MarketRejectInfoButtonsType[] marketRejectInfoButtonsTypeArr = {marketRejectInfoButtonsType, marketRejectInfoButtonsType2};
        $VALUES = marketRejectInfoButtonsTypeArr;
        $ENTRIES = new asp(marketRejectInfoButtonsTypeArr);
        Companion = new a();
    }

    public MarketRejectInfoButtonsType(String str, int i, String str2) {
        this.type = str2;
    }

    public static MarketRejectInfoButtonsType valueOf(String str) {
        return (MarketRejectInfoButtonsType) Enum.valueOf(MarketRejectInfoButtonsType.class, str);
    }

    public static MarketRejectInfoButtonsType[] values() {
        return (MarketRejectInfoButtonsType[]) $VALUES.clone();
    }

    public final String h() {
        return this.type;
    }
}
