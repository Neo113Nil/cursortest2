package com.vk.clips.design.view.sidecontrols.side.favorites;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FavoritesLoadingState.kt */
/* loaded from: classes16.dex */
public final class FavoritesLoadingState {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ FavoritesLoadingState[] $VALUES;
    public static final FavoritesLoadingState LOAD_ADD_TO_FAVORITES;
    public static final FavoritesLoadingState NONE;

    static {
        FavoritesLoadingState favoritesLoadingState = new FavoritesLoadingState("LOAD_ADD_TO_FAVORITES", 0);
        LOAD_ADD_TO_FAVORITES = favoritesLoadingState;
        FavoritesLoadingState favoritesLoadingState2 = new FavoritesLoadingState("NONE", 1);
        NONE = favoritesLoadingState2;
        FavoritesLoadingState[] favoritesLoadingStateArr = {favoritesLoadingState, favoritesLoadingState2};
        $VALUES = favoritesLoadingStateArr;
        $ENTRIES = new asp(favoritesLoadingStateArr);
    }

    public FavoritesLoadingState() {
        throw null;
    }

    public static FavoritesLoadingState valueOf(String str) {
        return (FavoritesLoadingState) Enum.valueOf(FavoritesLoadingState.class, str);
    }

    public static FavoritesLoadingState[] values() {
        return (FavoritesLoadingState[]) $VALUES.clone();
    }
}
