package com.vk.ecomm.products_multipicker.impl.presentation.adapters.itemadapter.paginationerror;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MarketMultiPickerPaginationErrorItem.kt */
/* loaded from: classes18.dex */
public final class TypeOfItems {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ TypeOfItems[] $VALUES;
    public static final TypeOfItems FAVE_ITEMS;
    public static final TypeOfItems GROUP_ITEMS;

    static {
        TypeOfItems typeOfItems = new TypeOfItems("GROUP_ITEMS", 0);
        GROUP_ITEMS = typeOfItems;
        TypeOfItems typeOfItems2 = new TypeOfItems("FAVE_ITEMS", 1);
        FAVE_ITEMS = typeOfItems2;
        TypeOfItems[] typeOfItemsArr = {typeOfItems, typeOfItems2};
        $VALUES = typeOfItemsArr;
        $ENTRIES = new asp(typeOfItemsArr);
    }

    public TypeOfItems() {
        throw null;
    }

    public static TypeOfItems valueOf(String str) {
        return (TypeOfItems) Enum.valueOf(TypeOfItems.class, str);
    }

    public static TypeOfItems[] values() {
        return (TypeOfItems[]) $VALUES.clone();
    }
}
