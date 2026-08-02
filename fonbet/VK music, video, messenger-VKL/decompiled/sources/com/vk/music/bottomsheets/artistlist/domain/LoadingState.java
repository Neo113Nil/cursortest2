package com.vk.music.bottomsheets.artistlist.domain;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LoadingState.kt */
/* loaded from: classes3.dex */
public final class LoadingState {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ LoadingState[] $VALUES;
    public static final LoadingState ERROR;
    public static final LoadingState LOADED;
    public static final LoadingState LOADING;

    static {
        LoadingState loadingState = new LoadingState("LOADING", 0);
        LOADING = loadingState;
        LoadingState loadingState2 = new LoadingState("LOADED", 1);
        LOADED = loadingState2;
        LoadingState loadingState3 = new LoadingState("ERROR", 2);
        ERROR = loadingState3;
        LoadingState[] loadingStateArr = {loadingState, loadingState2, loadingState3};
        $VALUES = loadingStateArr;
        $ENTRIES = new asp(loadingStateArr);
    }

    public LoadingState() {
        throw null;
    }

    public static LoadingState valueOf(String str) {
        return (LoadingState) Enum.valueOf(LoadingState.class, str);
    }

    public static LoadingState[] values() {
        return (LoadingState[]) $VALUES.clone();
    }
}
