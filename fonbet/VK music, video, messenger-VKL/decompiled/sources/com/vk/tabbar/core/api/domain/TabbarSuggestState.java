package com.vk.tabbar.core.api.domain;

import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TabbarSuggestState.kt */
/* loaded from: classes6.dex */
public final class TabbarSuggestState {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ TabbarSuggestState[] $VALUES;
    public static final TabbarSuggestState ADD;
    public static final TabbarSuggestState REMOVE;

    static {
        TabbarSuggestState tabbarSuggestState = new TabbarSuggestState("ADD", 0);
        ADD = tabbarSuggestState;
        TabbarSuggestState tabbarSuggestState2 = new TabbarSuggestState(SignalingProtocol.KEY_ROOMS_EVENT_TYPE_REMOVE, 1);
        REMOVE = tabbarSuggestState2;
        TabbarSuggestState[] tabbarSuggestStateArr = {tabbarSuggestState, tabbarSuggestState2};
        $VALUES = tabbarSuggestStateArr;
        $ENTRIES = new asp(tabbarSuggestStateArr);
    }

    public TabbarSuggestState() {
        throw null;
    }

    public static TabbarSuggestState valueOf(String str) {
        return (TabbarSuggestState) Enum.valueOf(TabbarSuggestState.class, str);
    }

    public static TabbarSuggestState[] values() {
        return (TabbarSuggestState[]) $VALUES.clone();
    }
}
