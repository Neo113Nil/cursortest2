package com.vk.fave.api;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FaveLoadState.kt */
/* loaded from: classes18.dex */
public final class FaveLoadState {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ FaveLoadState[] $VALUES;
    public static final FaveLoadState EMPTY;
    public static final FaveLoadState ERROR;
    public static final FaveLoadState NORMAL;
    public static final FaveLoadState PROGRESS;

    static {
        FaveLoadState faveLoadState = new FaveLoadState("PROGRESS", 0);
        PROGRESS = faveLoadState;
        FaveLoadState faveLoadState2 = new FaveLoadState("EMPTY", 1);
        EMPTY = faveLoadState2;
        FaveLoadState faveLoadState3 = new FaveLoadState("NORMAL", 2);
        NORMAL = faveLoadState3;
        FaveLoadState faveLoadState4 = new FaveLoadState("ERROR", 3);
        ERROR = faveLoadState4;
        FaveLoadState[] faveLoadStateArr = {faveLoadState, faveLoadState2, faveLoadState3, faveLoadState4};
        $VALUES = faveLoadStateArr;
        $ENTRIES = new asp(faveLoadStateArr);
    }

    public FaveLoadState() {
        throw null;
    }

    public static FaveLoadState valueOf(String str) {
        return (FaveLoadState) Enum.valueOf(FaveLoadState.class, str);
    }

    public static FaveLoadState[] values() {
        return (FaveLoadState[]) $VALUES.clone();
    }
}
