package com.vk.newsfeed.common.presentation.model.items.attachments;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MarketFaveUiDto.kt */
/* loaded from: classes4.dex */
public final class CtaButtonClickType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CtaButtonClickType[] $VALUES;
    public static final CtaButtonClickType ADD_TO_CART;
    public static final CtaButtonClickType CALL;
    public static final CtaButtonClickType NONE;
    public static final CtaButtonClickType OPEN_CART;
    public static final CtaButtonClickType OPEN_LINK;
    public static final CtaButtonClickType SIMILAR;
    public static final CtaButtonClickType WRITE_OWNER;

    static {
        CtaButtonClickType ctaButtonClickType = new CtaButtonClickType("NONE", 0);
        NONE = ctaButtonClickType;
        CtaButtonClickType ctaButtonClickType2 = new CtaButtonClickType("ADD_TO_CART", 1);
        ADD_TO_CART = ctaButtonClickType2;
        CtaButtonClickType ctaButtonClickType3 = new CtaButtonClickType("OPEN_CART", 2);
        OPEN_CART = ctaButtonClickType3;
        CtaButtonClickType ctaButtonClickType4 = new CtaButtonClickType("WRITE_OWNER", 3);
        WRITE_OWNER = ctaButtonClickType4;
        CtaButtonClickType ctaButtonClickType5 = new CtaButtonClickType("OPEN_LINK", 4);
        OPEN_LINK = ctaButtonClickType5;
        CtaButtonClickType ctaButtonClickType6 = new CtaButtonClickType("SIMILAR", 5);
        SIMILAR = ctaButtonClickType6;
        CtaButtonClickType ctaButtonClickType7 = new CtaButtonClickType("CALL", 6);
        CALL = ctaButtonClickType7;
        CtaButtonClickType[] ctaButtonClickTypeArr = {ctaButtonClickType, ctaButtonClickType2, ctaButtonClickType3, ctaButtonClickType4, ctaButtonClickType5, ctaButtonClickType6, ctaButtonClickType7};
        $VALUES = ctaButtonClickTypeArr;
        $ENTRIES = new asp(ctaButtonClickTypeArr);
    }

    public CtaButtonClickType() {
        throw null;
    }

    public static CtaButtonClickType valueOf(String str) {
        return (CtaButtonClickType) Enum.valueOf(CtaButtonClickType.class, str);
    }

    public static CtaButtonClickType[] values() {
        return (CtaButtonClickType[]) $VALUES.clone();
    }
}
