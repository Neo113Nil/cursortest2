package com.vk.search.integration.api;

import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import android.view.ViewGroup;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.zrp;

/* compiled from: SearchDelegate.kt */
/* loaded from: classes5.dex */
public interface SearchDelegate {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SearchDelegate.kt */
    public static final class SearchState {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ SearchState[] $VALUES;
        public static final SearchState ACTIVE;
        public static final SearchState COLLAPSED;
        public static final SearchState EXPANDED;

        static {
            SearchState searchState = new SearchState("COLLAPSED", 0);
            COLLAPSED = searchState;
            SearchState searchState2 = new SearchState("EXPANDED", 1);
            EXPANDED = searchState2;
            SearchState searchState3 = new SearchState(SignalingProtocol.STATE_ACTIVE, 2);
            ACTIVE = searchState3;
            SearchState[] searchStateArr = {searchState, searchState2, searchState3};
            $VALUES = searchStateArr;
            $ENTRIES = new asp(searchStateArr);
        }

        public SearchState() {
            throw null;
        }

        public static SearchState valueOf(String str) {
            return (SearchState) Enum.valueOf(SearchState.class, str);
        }

        public static SearchState[] values() {
            return (SearchState[]) $VALUES.clone();
        }
    }

    void d();

    View e(Context context, ViewGroup viewGroup);

    void onConfigurationChanged(Configuration configuration);
}
