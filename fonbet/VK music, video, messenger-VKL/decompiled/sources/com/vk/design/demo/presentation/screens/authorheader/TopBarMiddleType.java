package com.vk.design.demo.presentation.screens.authorheader;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AuthorHeaderState.kt */
/* loaded from: classes18.dex */
public final class TopBarMiddleType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ TopBarMiddleType[] $VALUES;
    public static final TopBarMiddleType Empty;
    public static final TopBarMiddleType OwnerNickname;
    public static final TopBarMiddleType Search;

    static {
        TopBarMiddleType topBarMiddleType = new TopBarMiddleType("Empty", 0);
        Empty = topBarMiddleType;
        TopBarMiddleType topBarMiddleType2 = new TopBarMiddleType("OwnerNickname", 1);
        OwnerNickname = topBarMiddleType2;
        TopBarMiddleType topBarMiddleType3 = new TopBarMiddleType("Search", 2);
        Search = topBarMiddleType3;
        TopBarMiddleType[] topBarMiddleTypeArr = {topBarMiddleType, topBarMiddleType2, topBarMiddleType3};
        $VALUES = topBarMiddleTypeArr;
        $ENTRIES = new asp(topBarMiddleTypeArr);
    }

    public TopBarMiddleType() {
        throw null;
    }

    public static TopBarMiddleType valueOf(String str) {
        return (TopBarMiddleType) Enum.valueOf(TopBarMiddleType.class, str);
    }

    public static TopBarMiddleType[] values() {
        return (TopBarMiddleType[]) $VALUES.clone();
    }
}
