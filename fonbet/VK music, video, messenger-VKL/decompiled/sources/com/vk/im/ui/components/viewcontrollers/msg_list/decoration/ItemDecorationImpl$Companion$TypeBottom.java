package com.vk.im.ui.components.viewcontrollers.msg_list.decoration;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ItemDecorationImpl.kt */
/* loaded from: classes2.dex */
public final class ItemDecorationImpl$Companion$TypeBottom {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ItemDecorationImpl$Companion$TypeBottom[] $VALUES;
    public static final ItemDecorationImpl$Companion$TypeBottom DATE;
    public static final ItemDecorationImpl$Companion$TypeBottom ETC;
    public static final ItemDecorationImpl$Companion$TypeBottom MSG_BUBBLE_ANY;
    public static final ItemDecorationImpl$Companion$TypeBottom MSG_BUBBLE_GROUP;
    public static final ItemDecorationImpl$Companion$TypeBottom MSG_FLAT_ANY;
    public static final ItemDecorationImpl$Companion$TypeBottom MSG_FLAT_GROUP;
    public static final ItemDecorationImpl$Companion$TypeBottom SERVICE;
    public static final ItemDecorationImpl$Companion$TypeBottom UNREAD;
    private final int id;

    static {
        ItemDecorationImpl$Companion$TypeBottom itemDecorationImpl$Companion$TypeBottom = new ItemDecorationImpl$Companion$TypeBottom("ETC", 0, 0);
        ETC = itemDecorationImpl$Companion$TypeBottom;
        ItemDecorationImpl$Companion$TypeBottom itemDecorationImpl$Companion$TypeBottom2 = new ItemDecorationImpl$Companion$TypeBottom("MSG_BUBBLE_ANY", 1, 1);
        MSG_BUBBLE_ANY = itemDecorationImpl$Companion$TypeBottom2;
        ItemDecorationImpl$Companion$TypeBottom itemDecorationImpl$Companion$TypeBottom3 = new ItemDecorationImpl$Companion$TypeBottom("MSG_BUBBLE_GROUP", 2, 2);
        MSG_BUBBLE_GROUP = itemDecorationImpl$Companion$TypeBottom3;
        ItemDecorationImpl$Companion$TypeBottom itemDecorationImpl$Companion$TypeBottom4 = new ItemDecorationImpl$Companion$TypeBottom("MSG_FLAT_ANY", 3, 3);
        MSG_FLAT_ANY = itemDecorationImpl$Companion$TypeBottom4;
        ItemDecorationImpl$Companion$TypeBottom itemDecorationImpl$Companion$TypeBottom5 = new ItemDecorationImpl$Companion$TypeBottom("MSG_FLAT_GROUP", 4, 4);
        MSG_FLAT_GROUP = itemDecorationImpl$Companion$TypeBottom5;
        ItemDecorationImpl$Companion$TypeBottom itemDecorationImpl$Companion$TypeBottom6 = new ItemDecorationImpl$Companion$TypeBottom("UNREAD", 5, 5);
        UNREAD = itemDecorationImpl$Companion$TypeBottom6;
        ItemDecorationImpl$Companion$TypeBottom itemDecorationImpl$Companion$TypeBottom7 = new ItemDecorationImpl$Companion$TypeBottom("DATE", 6, 6);
        DATE = itemDecorationImpl$Companion$TypeBottom7;
        ItemDecorationImpl$Companion$TypeBottom itemDecorationImpl$Companion$TypeBottom8 = new ItemDecorationImpl$Companion$TypeBottom("SERVICE", 7, 7);
        SERVICE = itemDecorationImpl$Companion$TypeBottom8;
        ItemDecorationImpl$Companion$TypeBottom[] itemDecorationImpl$Companion$TypeBottomArr = {itemDecorationImpl$Companion$TypeBottom, itemDecorationImpl$Companion$TypeBottom2, itemDecorationImpl$Companion$TypeBottom3, itemDecorationImpl$Companion$TypeBottom4, itemDecorationImpl$Companion$TypeBottom5, itemDecorationImpl$Companion$TypeBottom6, itemDecorationImpl$Companion$TypeBottom7, itemDecorationImpl$Companion$TypeBottom8};
        $VALUES = itemDecorationImpl$Companion$TypeBottomArr;
        $ENTRIES = new asp(itemDecorationImpl$Companion$TypeBottomArr);
    }

    public ItemDecorationImpl$Companion$TypeBottom(String str, int i, int i2) {
        this.id = i2;
    }

    public static ItemDecorationImpl$Companion$TypeBottom valueOf(String str) {
        return (ItemDecorationImpl$Companion$TypeBottom) Enum.valueOf(ItemDecorationImpl$Companion$TypeBottom.class, str);
    }

    public static ItemDecorationImpl$Companion$TypeBottom[] values() {
        return (ItemDecorationImpl$Companion$TypeBottom[]) $VALUES.clone();
    }

    public final int h() {
        return this.id;
    }
}
