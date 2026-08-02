package com.vk.friends.requests.api.di;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FriendsRequestsComponent.kt */
/* loaded from: classes16.dex */
public final class ScreenType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ScreenType[] $VALUES;
    public static final ScreenType ANY;
    public static final ScreenType FRIENDS_LIST;
    public static final ScreenType RECOMMENDATIONS;

    static {
        ScreenType screenType = new ScreenType("ANY", 0);
        ANY = screenType;
        ScreenType screenType2 = new ScreenType("FRIENDS_LIST", 1);
        FRIENDS_LIST = screenType2;
        ScreenType screenType3 = new ScreenType("RECOMMENDATIONS", 2);
        RECOMMENDATIONS = screenType3;
        ScreenType[] screenTypeArr = {screenType, screenType2, screenType3};
        $VALUES = screenTypeArr;
        $ENTRIES = new asp(screenTypeArr);
    }

    public ScreenType() {
        throw null;
    }

    public static ScreenType valueOf(String str) {
        return (ScreenType) Enum.valueOf(ScreenType.class, str);
    }

    public static ScreenType[] values() {
        return (ScreenType[]) $VALUES.clone();
    }
}
