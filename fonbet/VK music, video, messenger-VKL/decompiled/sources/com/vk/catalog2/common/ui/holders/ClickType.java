package com.vk.catalog2.common.ui.holders;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ComposeHeaderVh.kt */
/* loaded from: classes16.dex */
public final class ClickType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ClickType[] $VALUES;
    public static final ClickType CLOSE_ITEM;
    public static final ClickType SHOW_ALL;
    public static final ClickType SHOW_ALL_CHEVRON;
    public static final ClickType SHOW_ITEM;

    static {
        ClickType clickType = new ClickType("SHOW_ITEM", 0);
        SHOW_ITEM = clickType;
        ClickType clickType2 = new ClickType("SHOW_ALL", 1);
        SHOW_ALL = clickType2;
        ClickType clickType3 = new ClickType("SHOW_ALL_CHEVRON", 2);
        SHOW_ALL_CHEVRON = clickType3;
        ClickType clickType4 = new ClickType("CLOSE_ITEM", 3);
        CLOSE_ITEM = clickType4;
        ClickType[] clickTypeArr = {clickType, clickType2, clickType3, clickType4};
        $VALUES = clickTypeArr;
        $ENTRIES = new asp(clickTypeArr);
    }

    public ClickType() {
        throw null;
    }

    public static ClickType valueOf(String str) {
        return (ClickType) Enum.valueOf(ClickType.class, str);
    }

    public static ClickType[] values() {
        return (ClickType[]) $VALUES.clone();
    }
}
