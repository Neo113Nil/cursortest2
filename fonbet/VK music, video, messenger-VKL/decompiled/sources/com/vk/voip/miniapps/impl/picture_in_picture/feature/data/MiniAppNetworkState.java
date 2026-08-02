package com.vk.voip.miniapps.impl.picture_in_picture.feature.data;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MiniAppNetworkState.kt */
/* loaded from: classes7.dex */
public final class MiniAppNetworkState {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MiniAppNetworkState[] $VALUES;
    public static final MiniAppNetworkState BAD;
    public static final MiniAppNetworkState GOOD;
    public static final MiniAppNetworkState MEDIUM;

    static {
        MiniAppNetworkState miniAppNetworkState = new MiniAppNetworkState("GOOD", 0);
        GOOD = miniAppNetworkState;
        MiniAppNetworkState miniAppNetworkState2 = new MiniAppNetworkState("MEDIUM", 1);
        MEDIUM = miniAppNetworkState2;
        MiniAppNetworkState miniAppNetworkState3 = new MiniAppNetworkState("BAD", 2);
        BAD = miniAppNetworkState3;
        MiniAppNetworkState[] miniAppNetworkStateArr = {miniAppNetworkState, miniAppNetworkState2, miniAppNetworkState3};
        $VALUES = miniAppNetworkStateArr;
        $ENTRIES = new asp(miniAppNetworkStateArr);
    }

    public MiniAppNetworkState() {
        throw null;
    }

    public static MiniAppNetworkState valueOf(String str) {
        return (MiniAppNetworkState) Enum.valueOf(MiniAppNetworkState.class, str);
    }

    public static MiniAppNetworkState[] values() {
        return (MiniAppNetworkState[]) $VALUES.clone();
    }
}
