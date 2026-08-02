package com.vk.core.ui.utils;

import com.fyber.inneractive.sdk.external.NativeAdContent;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SimpleAdapter.kt */
/* loaded from: classes17.dex */
public final class ItemType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ItemType[] $VALUES;
    public static final ItemType CUSTOM;
    public static final ItemType DEFAULT;
    public static final ItemType DEFAULT_WITH_CHECK;
    public static final ItemType TITLE;
    private final int type;

    static {
        ItemType itemType = new ItemType("DEFAULT", 0, 0);
        DEFAULT = itemType;
        ItemType itemType2 = new ItemType("DEFAULT_WITH_CHECK", 1, 1);
        DEFAULT_WITH_CHECK = itemType2;
        ItemType itemType3 = new ItemType(NativeAdContent.ViewTag.AD_TITLE, 2, 2);
        TITLE = itemType3;
        ItemType itemType4 = new ItemType("CUSTOM", 3, 3);
        CUSTOM = itemType4;
        ItemType[] itemTypeArr = {itemType, itemType2, itemType3, itemType4};
        $VALUES = itemTypeArr;
        $ENTRIES = new asp(itemTypeArr);
    }

    public ItemType(String str, int i, int i2) {
        this.type = i2;
    }

    public static ItemType valueOf(String str) {
        return (ItemType) Enum.valueOf(ItemType.class, str);
    }

    public static ItemType[] values() {
        return (ItemType[]) $VALUES.clone();
    }

    public final int h() {
        return this.type;
    }
}
