package com.vk.clips.sdk.shared.feed.model;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BannerCompanionState.kt */
/* loaded from: classes17.dex */
public final class DataLoadState {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ DataLoadState[] $VALUES;
    public static final DataLoadState DATA_TRIED_TO_LOAD;
    public static final DataLoadState POSITION_NOT_REACHED;
    public static final DataLoadState POSITION_REACHED;

    static {
        DataLoadState dataLoadState = new DataLoadState("POSITION_NOT_REACHED", 0);
        POSITION_NOT_REACHED = dataLoadState;
        DataLoadState dataLoadState2 = new DataLoadState("POSITION_REACHED", 1);
        POSITION_REACHED = dataLoadState2;
        DataLoadState dataLoadState3 = new DataLoadState("DATA_TRIED_TO_LOAD", 2);
        DATA_TRIED_TO_LOAD = dataLoadState3;
        DataLoadState[] dataLoadStateArr = {dataLoadState, dataLoadState2, dataLoadState3};
        $VALUES = dataLoadStateArr;
        $ENTRIES = new asp(dataLoadStateArr);
    }

    public DataLoadState() {
        throw null;
    }

    public static DataLoadState valueOf(String str) {
        return (DataLoadState) Enum.valueOf(DataLoadState.class, str);
    }

    public static DataLoadState[] values() {
        return (DataLoadState[]) $VALUES.clone();
    }
}
