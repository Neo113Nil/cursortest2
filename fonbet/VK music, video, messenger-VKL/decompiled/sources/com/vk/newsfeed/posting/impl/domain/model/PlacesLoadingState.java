package com.vk.newsfeed.posting.impl.domain.model;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: NearbyPlaces.kt */
/* loaded from: classes4.dex */
public final class PlacesLoadingState {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ PlacesLoadingState[] $VALUES;
    public static final PlacesLoadingState Error;
    public static final PlacesLoadingState Idle;
    public static final PlacesLoadingState Loading;
    public static final PlacesLoadingState Success;

    static {
        PlacesLoadingState placesLoadingState = new PlacesLoadingState("Idle", 0);
        Idle = placesLoadingState;
        PlacesLoadingState placesLoadingState2 = new PlacesLoadingState("Success", 1);
        Success = placesLoadingState2;
        PlacesLoadingState placesLoadingState3 = new PlacesLoadingState("Loading", 2);
        Loading = placesLoadingState3;
        PlacesLoadingState placesLoadingState4 = new PlacesLoadingState("Error", 3);
        Error = placesLoadingState4;
        PlacesLoadingState[] placesLoadingStateArr = {placesLoadingState, placesLoadingState2, placesLoadingState3, placesLoadingState4};
        $VALUES = placesLoadingStateArr;
        $ENTRIES = new asp(placesLoadingStateArr);
    }

    public PlacesLoadingState() {
        throw null;
    }

    public static PlacesLoadingState valueOf(String str) {
        return (PlacesLoadingState) Enum.valueOf(PlacesLoadingState.class, str);
    }

    public static PlacesLoadingState[] values() {
        return (PlacesLoadingState[]) $VALUES.clone();
    }
}
