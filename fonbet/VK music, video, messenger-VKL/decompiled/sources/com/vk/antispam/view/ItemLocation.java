package com.vk.antispam.view;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ReportSpamContent.kt */
/* loaded from: classes14.dex */
public final class ItemLocation {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ItemLocation[] $VALUES;
    public static final ItemLocation Bottom;
    public static final ItemLocation Middle;
    public static final ItemLocation Top;

    static {
        ItemLocation itemLocation = new ItemLocation("Top", 0);
        Top = itemLocation;
        ItemLocation itemLocation2 = new ItemLocation("Middle", 1);
        Middle = itemLocation2;
        ItemLocation itemLocation3 = new ItemLocation("Bottom", 2);
        Bottom = itemLocation3;
        ItemLocation[] itemLocationArr = {itemLocation, itemLocation2, itemLocation3};
        $VALUES = itemLocationArr;
        $ENTRIES = new asp(itemLocationArr);
    }

    public ItemLocation() {
        throw null;
    }

    public static ItemLocation valueOf(String str) {
        return (ItemLocation) Enum.valueOf(ItemLocation.class, str);
    }

    public static ItemLocation[] values() {
        return (ItemLocation[]) $VALUES.clone();
    }
}
