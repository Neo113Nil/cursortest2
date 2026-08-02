package com.vk.ecomm.storefrontservices.impl.presentation.feature;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: StorefrontServicesViewState.kt */
/* loaded from: classes18.dex */
public final class PlaceholderState {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ PlaceholderState[] $VALUES;
    public static final PlaceholderState Album;
    public static final PlaceholderState Albums;
    public static final PlaceholderState Search;
    public static final PlaceholderState Section;
    public static final PlaceholderState Services;

    static {
        PlaceholderState placeholderState = new PlaceholderState("Services", 0);
        Services = placeholderState;
        PlaceholderState placeholderState2 = new PlaceholderState("Album", 1);
        Album = placeholderState2;
        PlaceholderState placeholderState3 = new PlaceholderState("Albums", 2);
        Albums = placeholderState3;
        PlaceholderState placeholderState4 = new PlaceholderState("Section", 3);
        Section = placeholderState4;
        PlaceholderState placeholderState5 = new PlaceholderState("Search", 4);
        Search = placeholderState5;
        PlaceholderState[] placeholderStateArr = {placeholderState, placeholderState2, placeholderState3, placeholderState4, placeholderState5};
        $VALUES = placeholderStateArr;
        $ENTRIES = new asp(placeholderStateArr);
    }

    public PlaceholderState() {
        throw null;
    }

    public static PlaceholderState valueOf(String str) {
        return (PlaceholderState) Enum.valueOf(PlaceholderState.class, str);
    }

    public static PlaceholderState[] values() {
        return (PlaceholderState[]) $VALUES.clone();
    }
}
