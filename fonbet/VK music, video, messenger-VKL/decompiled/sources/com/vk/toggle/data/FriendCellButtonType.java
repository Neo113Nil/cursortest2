package com.vk.toggle.data;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FriendCellDesignConfig.kt */
/* loaded from: classes6.dex */
public final class FriendCellButtonType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ FriendCellButtonType[] $VALUES;
    public static final a Companion;
    public static final FriendCellButtonType IMAGES;
    public static final FriendCellButtonType TEXTS;
    public static final FriendCellButtonType TEXTS_OUTLINE;
    private final String value;

    /* compiled from: FriendCellDesignConfig.kt */
    public static final class a {
    }

    static {
        FriendCellButtonType friendCellButtonType = new FriendCellButtonType("TEXTS", 0, "texts");
        TEXTS = friendCellButtonType;
        FriendCellButtonType friendCellButtonType2 = new FriendCellButtonType("TEXTS_OUTLINE", 1, "texts_outline");
        TEXTS_OUTLINE = friendCellButtonType2;
        FriendCellButtonType friendCellButtonType3 = new FriendCellButtonType("IMAGES", 2, "images");
        IMAGES = friendCellButtonType3;
        FriendCellButtonType[] friendCellButtonTypeArr = {friendCellButtonType, friendCellButtonType2, friendCellButtonType3};
        $VALUES = friendCellButtonTypeArr;
        $ENTRIES = new asp(friendCellButtonTypeArr);
        Companion = new a();
    }

    public FriendCellButtonType(String str, int i, String str2) {
        this.value = str2;
    }

    public static FriendCellButtonType valueOf(String str) {
        return (FriendCellButtonType) Enum.valueOf(FriendCellButtonType.class, str);
    }

    public static FriendCellButtonType[] values() {
        return (FriendCellButtonType[]) $VALUES.clone();
    }
}
