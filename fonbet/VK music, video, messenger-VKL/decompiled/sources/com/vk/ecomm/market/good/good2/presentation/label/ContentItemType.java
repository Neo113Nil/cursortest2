package com.vk.ecomm.market.good.good2.presentation.label;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ProductLabel.kt */
/* loaded from: classes18.dex */
public final class ContentItemType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ContentItemType[] $VALUES;
    public static final ContentItemType APPLICATION;
    public static final ContentItemType DELIVERY;
    public static final ContentItemType PAYMENT;

    static {
        ContentItemType contentItemType = new ContentItemType("APPLICATION", 0);
        APPLICATION = contentItemType;
        ContentItemType contentItemType2 = new ContentItemType("PAYMENT", 1);
        PAYMENT = contentItemType2;
        ContentItemType contentItemType3 = new ContentItemType("DELIVERY", 2);
        DELIVERY = contentItemType3;
        ContentItemType[] contentItemTypeArr = {contentItemType, contentItemType2, contentItemType3};
        $VALUES = contentItemTypeArr;
        $ENTRIES = new asp(contentItemTypeArr);
    }

    public ContentItemType() {
        throw null;
    }

    public static ContentItemType valueOf(String str) {
        return (ContentItemType) Enum.valueOf(ContentItemType.class, str);
    }

    public static ContentItemType[] values() {
        return (ContentItemType[]) $VALUES.clone();
    }
}
