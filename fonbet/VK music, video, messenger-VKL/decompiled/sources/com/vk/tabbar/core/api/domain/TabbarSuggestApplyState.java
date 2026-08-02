package com.vk.tabbar.core.api.domain;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TabbarSuggestApplyState.kt */
/* loaded from: classes6.dex */
public final class TabbarSuggestApplyState {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ TabbarSuggestApplyState[] $VALUES;
    public static final TabbarSuggestApplyState AddFailed;
    public static final TabbarSuggestApplyState OpenSettings;
    public static final TabbarSuggestApplyState RemoveFailed;

    static {
        TabbarSuggestApplyState tabbarSuggestApplyState = new TabbarSuggestApplyState("OpenSettings", 0);
        OpenSettings = tabbarSuggestApplyState;
        TabbarSuggestApplyState tabbarSuggestApplyState2 = new TabbarSuggestApplyState("RemoveFailed", 1);
        RemoveFailed = tabbarSuggestApplyState2;
        TabbarSuggestApplyState tabbarSuggestApplyState3 = new TabbarSuggestApplyState("AddFailed", 2);
        AddFailed = tabbarSuggestApplyState3;
        TabbarSuggestApplyState[] tabbarSuggestApplyStateArr = {tabbarSuggestApplyState, tabbarSuggestApplyState2, tabbarSuggestApplyState3};
        $VALUES = tabbarSuggestApplyStateArr;
        $ENTRIES = new asp(tabbarSuggestApplyStateArr);
    }

    public TabbarSuggestApplyState() {
        throw null;
    }

    public static TabbarSuggestApplyState valueOf(String str) {
        return (TabbarSuggestApplyState) Enum.valueOf(TabbarSuggestApplyState.class, str);
    }

    public static TabbarSuggestApplyState[] values() {
        return (TabbarSuggestApplyState[]) $VALUES.clone();
    }
}
