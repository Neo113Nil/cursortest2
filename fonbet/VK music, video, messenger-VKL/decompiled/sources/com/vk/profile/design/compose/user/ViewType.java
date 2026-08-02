package com.vk.profile.design.compose.user;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VkProfileFriendsInfo.kt */
/* loaded from: classes5.dex */
public final class ViewType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ViewType[] $VALUES;
    public static final ViewType FIND_FRIENDS;
    public static final ViewType MULTILINE;
    public static final ViewType ONE_LINE;

    static {
        ViewType viewType = new ViewType("ONE_LINE", 0);
        ONE_LINE = viewType;
        ViewType viewType2 = new ViewType("MULTILINE", 1);
        MULTILINE = viewType2;
        ViewType viewType3 = new ViewType("FIND_FRIENDS", 2);
        FIND_FRIENDS = viewType3;
        ViewType[] viewTypeArr = {viewType, viewType2, viewType3};
        $VALUES = viewTypeArr;
        $ENTRIES = new asp(viewTypeArr);
    }

    public ViewType() {
        throw null;
    }

    public static ViewType valueOf(String str) {
        return (ViewType) Enum.valueOf(ViewType.class, str);
    }

    public static ViewType[] values() {
        return (ViewType[]) $VALUES.clone();
    }
}
