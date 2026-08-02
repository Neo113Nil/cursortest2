package com.vk.im.ui.components.viewcontrollers.msg_list.decoration;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ItemDecorationImpl.kt */
/* loaded from: classes2.dex */
public final class ItemDecorationImpl$Companion$TypeTop {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ItemDecorationImpl$Companion$TypeTop[] $VALUES;
    public static final ItemDecorationImpl$Companion$TypeTop DATE;
    public static final ItemDecorationImpl$Companion$TypeTop ETC;
    public static final ItemDecorationImpl$Companion$TypeTop MSG_BUBBLE;
    public static final ItemDecorationImpl$Companion$TypeTop MSG_FLAT;
    public static final ItemDecorationImpl$Companion$TypeTop SERVICE;
    public static final ItemDecorationImpl$Companion$TypeTop UNREAD;
    private final int id;

    static {
        ItemDecorationImpl$Companion$TypeTop itemDecorationImpl$Companion$TypeTop = new ItemDecorationImpl$Companion$TypeTop("ETC", 0, 0);
        ETC = itemDecorationImpl$Companion$TypeTop;
        ItemDecorationImpl$Companion$TypeTop itemDecorationImpl$Companion$TypeTop2 = new ItemDecorationImpl$Companion$TypeTop("MSG_BUBBLE", 1, 1);
        MSG_BUBBLE = itemDecorationImpl$Companion$TypeTop2;
        ItemDecorationImpl$Companion$TypeTop itemDecorationImpl$Companion$TypeTop3 = new ItemDecorationImpl$Companion$TypeTop("MSG_FLAT", 2, 2);
        MSG_FLAT = itemDecorationImpl$Companion$TypeTop3;
        ItemDecorationImpl$Companion$TypeTop itemDecorationImpl$Companion$TypeTop4 = new ItemDecorationImpl$Companion$TypeTop("UNREAD", 3, 3);
        UNREAD = itemDecorationImpl$Companion$TypeTop4;
        ItemDecorationImpl$Companion$TypeTop itemDecorationImpl$Companion$TypeTop5 = new ItemDecorationImpl$Companion$TypeTop("DATE", 4, 4);
        DATE = itemDecorationImpl$Companion$TypeTop5;
        ItemDecorationImpl$Companion$TypeTop itemDecorationImpl$Companion$TypeTop6 = new ItemDecorationImpl$Companion$TypeTop("SERVICE", 5, 5);
        SERVICE = itemDecorationImpl$Companion$TypeTop6;
        ItemDecorationImpl$Companion$TypeTop[] itemDecorationImpl$Companion$TypeTopArr = {itemDecorationImpl$Companion$TypeTop, itemDecorationImpl$Companion$TypeTop2, itemDecorationImpl$Companion$TypeTop3, itemDecorationImpl$Companion$TypeTop4, itemDecorationImpl$Companion$TypeTop5, itemDecorationImpl$Companion$TypeTop6};
        $VALUES = itemDecorationImpl$Companion$TypeTopArr;
        $ENTRIES = new asp(itemDecorationImpl$Companion$TypeTopArr);
    }

    public ItemDecorationImpl$Companion$TypeTop(String str, int i, int i2) {
        this.id = i2;
    }

    public static ItemDecorationImpl$Companion$TypeTop valueOf(String str) {
        return (ItemDecorationImpl$Companion$TypeTop) Enum.valueOf(ItemDecorationImpl$Companion$TypeTop.class, str);
    }

    public static ItemDecorationImpl$Companion$TypeTop[] values() {
        return (ItemDecorationImpl$Companion$TypeTop[]) $VALUES.clone();
    }

    public final int h() {
        return this.id;
    }
}
