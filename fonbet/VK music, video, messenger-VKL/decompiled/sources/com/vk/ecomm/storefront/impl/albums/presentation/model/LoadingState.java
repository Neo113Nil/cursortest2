package com.vk.ecomm.storefront.impl.albums.presentation.model;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: StorefrontAlbumsState.kt */
/* loaded from: classes18.dex */
public final class LoadingState {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ LoadingState[] $VALUES;
    public static final LoadingState Full;
    public static final LoadingState None;
    public static final LoadingState Page;
    public static final LoadingState Refresh;

    static {
        LoadingState loadingState = new LoadingState("None", 0);
        None = loadingState;
        LoadingState loadingState2 = new LoadingState("Full", 1);
        Full = loadingState2;
        LoadingState loadingState3 = new LoadingState("Refresh", 2);
        Refresh = loadingState3;
        LoadingState loadingState4 = new LoadingState("Page", 3);
        Page = loadingState4;
        LoadingState[] loadingStateArr = {loadingState, loadingState2, loadingState3, loadingState4};
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
