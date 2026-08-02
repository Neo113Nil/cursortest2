package com.vk.search.integration.friends.api;

import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SearchFriendsDelegate.kt */
/* loaded from: classes5.dex */
public final class SearchFriendsDelegate$ViewCallback$SearchState {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ SearchFriendsDelegate$ViewCallback$SearchState[] $VALUES;
    public static final SearchFriendsDelegate$ViewCallback$SearchState ACTIVE;
    public static final SearchFriendsDelegate$ViewCallback$SearchState EXPANDED;

    static {
        SearchFriendsDelegate$ViewCallback$SearchState searchFriendsDelegate$ViewCallback$SearchState = new SearchFriendsDelegate$ViewCallback$SearchState("EXPANDED", 0);
        EXPANDED = searchFriendsDelegate$ViewCallback$SearchState;
        SearchFriendsDelegate$ViewCallback$SearchState searchFriendsDelegate$ViewCallback$SearchState2 = new SearchFriendsDelegate$ViewCallback$SearchState(SignalingProtocol.STATE_ACTIVE, 1);
        ACTIVE = searchFriendsDelegate$ViewCallback$SearchState2;
        SearchFriendsDelegate$ViewCallback$SearchState[] searchFriendsDelegate$ViewCallback$SearchStateArr = {searchFriendsDelegate$ViewCallback$SearchState, searchFriendsDelegate$ViewCallback$SearchState2};
        $VALUES = searchFriendsDelegate$ViewCallback$SearchStateArr;
        $ENTRIES = new asp(searchFriendsDelegate$ViewCallback$SearchStateArr);
    }

    public SearchFriendsDelegate$ViewCallback$SearchState() {
        throw null;
    }

    public static SearchFriendsDelegate$ViewCallback$SearchState valueOf(String str) {
        return (SearchFriendsDelegate$ViewCallback$SearchState) Enum.valueOf(SearchFriendsDelegate$ViewCallback$SearchState.class, str);
    }

    public static SearchFriendsDelegate$ViewCallback$SearchState[] values() {
        return (SearchFriendsDelegate$ViewCallback$SearchState[]) $VALUES.clone();
    }
}
