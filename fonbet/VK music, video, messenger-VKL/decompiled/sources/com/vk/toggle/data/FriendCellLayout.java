package com.vk.toggle.data;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FriendCellDesignConfig.kt */
/* loaded from: classes6.dex */
public final class FriendCellLayout {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ FriendCellLayout[] $VALUES;
    public static final a Companion;
    public static final FriendCellLayout THREE_LINES_COMPACT;
    public static final FriendCellLayout THREE_LINES_LARGE;
    public static final FriendCellLayout TWO_LINES;
    private final String value;

    /* compiled from: FriendCellDesignConfig.kt */
    public static final class a {
    }

    static {
        FriendCellLayout friendCellLayout = new FriendCellLayout("TWO_LINES", 0, "2lines");
        TWO_LINES = friendCellLayout;
        FriendCellLayout friendCellLayout2 = new FriendCellLayout("THREE_LINES_COMPACT", 1, "3linesCompact");
        THREE_LINES_COMPACT = friendCellLayout2;
        FriendCellLayout friendCellLayout3 = new FriendCellLayout("THREE_LINES_LARGE", 2, "3linesLarge");
        THREE_LINES_LARGE = friendCellLayout3;
        FriendCellLayout[] friendCellLayoutArr = {friendCellLayout, friendCellLayout2, friendCellLayout3};
        $VALUES = friendCellLayoutArr;
        $ENTRIES = new asp(friendCellLayoutArr);
        Companion = new a();
    }

    public FriendCellLayout(String str, int i, String str2) {
        this.value = str2;
    }

    public static FriendCellLayout valueOf(String str) {
        return (FriendCellLayout) Enum.valueOf(FriendCellLayout.class, str);
    }

    public static FriendCellLayout[] values() {
        return (FriendCellLayout[]) $VALUES.clone();
    }
}
