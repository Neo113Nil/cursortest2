package com.vk.newsfeed.common.presentation.newsfeed;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ListLoadingState.kt */
/* loaded from: classes4.dex */
public final class ListLoadingState {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ListLoadingState[] $VALUES;
    public static final ListLoadingState ERROR;
    public static final ListLoadingState IDLE;
    public static final ListLoadingState LOADING;
    public static final ListLoadingState REFRESHING;
    public static final ListLoadingState RELOADING;

    static {
        ListLoadingState listLoadingState = new ListLoadingState("IDLE", 0);
        IDLE = listLoadingState;
        ListLoadingState listLoadingState2 = new ListLoadingState("RELOADING", 1);
        RELOADING = listLoadingState2;
        ListLoadingState listLoadingState3 = new ListLoadingState("LOADING", 2);
        LOADING = listLoadingState3;
        ListLoadingState listLoadingState4 = new ListLoadingState("REFRESHING", 3);
        REFRESHING = listLoadingState4;
        ListLoadingState listLoadingState5 = new ListLoadingState("ERROR", 4);
        ERROR = listLoadingState5;
        ListLoadingState[] listLoadingStateArr = {listLoadingState, listLoadingState2, listLoadingState3, listLoadingState4, listLoadingState5};
        $VALUES = listLoadingStateArr;
        $ENTRIES = new asp(listLoadingStateArr);
    }

    public ListLoadingState() {
        throw null;
    }

    public static ListLoadingState valueOf(String str) {
        return (ListLoadingState) Enum.valueOf(ListLoadingState.class, str);
    }

    public static ListLoadingState[] values() {
        return (ListLoadingState[]) $VALUES.clone();
    }
}
