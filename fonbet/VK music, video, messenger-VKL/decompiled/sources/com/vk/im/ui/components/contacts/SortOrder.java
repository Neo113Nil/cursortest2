package com.vk.im.ui.components.contacts;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SortOrder.kt */
/* loaded from: classes2.dex */
public final class SortOrder {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ SortOrder[] $VALUES;
    public static final SortOrder BY_CONTACT_NAME;
    public static final SortOrder BY_HINTS;
    public static final SortOrder BY_NAME;
    public static final SortOrder BY_ONLINE;
    private final int id;

    static {
        SortOrder sortOrder = new SortOrder("BY_ONLINE", 0, 0);
        BY_ONLINE = sortOrder;
        SortOrder sortOrder2 = new SortOrder("BY_HINTS", 1, 1);
        BY_HINTS = sortOrder2;
        SortOrder sortOrder3 = new SortOrder("BY_NAME", 2, 2);
        BY_NAME = sortOrder3;
        SortOrder sortOrder4 = new SortOrder("BY_CONTACT_NAME", 3, 3);
        BY_CONTACT_NAME = sortOrder4;
        SortOrder[] sortOrderArr = {sortOrder, sortOrder2, sortOrder3, sortOrder4};
        $VALUES = sortOrderArr;
        $ENTRIES = new asp(sortOrderArr);
    }

    public SortOrder(String str, int i, int i2) {
        this.id = i2;
    }

    public static SortOrder valueOf(String str) {
        return (SortOrder) Enum.valueOf(SortOrder.class, str);
    }

    public static SortOrder[] values() {
        return (SortOrder[]) $VALUES.clone();
    }
}
