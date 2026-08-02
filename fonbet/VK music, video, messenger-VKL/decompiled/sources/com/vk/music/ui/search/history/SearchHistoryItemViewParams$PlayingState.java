package com.vk.music.ui.search.history;

import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SearchHistoryItemViewParams.kt */
/* loaded from: classes3.dex */
public final class SearchHistoryItemViewParams$PlayingState {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ SearchHistoryItemViewParams$PlayingState[] $VALUES;
    public static final SearchHistoryItemViewParams$PlayingState ACTIVE;
    public static final SearchHistoryItemViewParams$PlayingState INACTIVE;
    public static final SearchHistoryItemViewParams$PlayingState NONE;

    static {
        SearchHistoryItemViewParams$PlayingState searchHistoryItemViewParams$PlayingState = new SearchHistoryItemViewParams$PlayingState("NONE", 0);
        NONE = searchHistoryItemViewParams$PlayingState;
        SearchHistoryItemViewParams$PlayingState searchHistoryItemViewParams$PlayingState2 = new SearchHistoryItemViewParams$PlayingState("INACTIVE", 1);
        INACTIVE = searchHistoryItemViewParams$PlayingState2;
        SearchHistoryItemViewParams$PlayingState searchHistoryItemViewParams$PlayingState3 = new SearchHistoryItemViewParams$PlayingState(SignalingProtocol.STATE_ACTIVE, 2);
        ACTIVE = searchHistoryItemViewParams$PlayingState3;
        SearchHistoryItemViewParams$PlayingState[] searchHistoryItemViewParams$PlayingStateArr = {searchHistoryItemViewParams$PlayingState, searchHistoryItemViewParams$PlayingState2, searchHistoryItemViewParams$PlayingState3};
        $VALUES = searchHistoryItemViewParams$PlayingStateArr;
        $ENTRIES = new asp(searchHistoryItemViewParams$PlayingStateArr);
    }

    public SearchHistoryItemViewParams$PlayingState() {
        throw null;
    }

    public static SearchHistoryItemViewParams$PlayingState valueOf(String str) {
        return (SearchHistoryItemViewParams$PlayingState) Enum.valueOf(SearchHistoryItemViewParams$PlayingState.class, str);
    }

    public static SearchHistoryItemViewParams$PlayingState[] values() {
        return (SearchHistoryItemViewParams$PlayingState[]) $VALUES.clone();
    }
}
