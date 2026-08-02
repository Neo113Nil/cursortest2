package com.vk.ecomm.storefrontservices.impl.presentation.feature;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: StorefrontServicesViewState.kt */
/* loaded from: classes18.dex */
public final class LoadingState {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ LoadingState[] $VALUES;
    public static final LoadingState Error;
    public static final LoadingState Full;
    public static final LoadingState None;
    public static final LoadingState Page;
    public static final LoadingState Refresh;
    public static final LoadingState Search;

    static {
        LoadingState loadingState = new LoadingState("None", 0);
        None = loadingState;
        LoadingState loadingState2 = new LoadingState("Full", 1);
        Full = loadingState2;
        LoadingState loadingState3 = new LoadingState("Search", 2);
        Search = loadingState3;
        LoadingState loadingState4 = new LoadingState("Refresh", 3);
        Refresh = loadingState4;
        LoadingState loadingState5 = new LoadingState("Page", 4);
        Page = loadingState5;
        LoadingState loadingState6 = new LoadingState("Error", 5);
        Error = loadingState6;
        LoadingState[] loadingStateArr = {loadingState, loadingState2, loadingState3, loadingState4, loadingState5, loadingState6};
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
