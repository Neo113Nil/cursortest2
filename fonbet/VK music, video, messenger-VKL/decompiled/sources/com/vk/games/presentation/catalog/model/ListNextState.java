package com.vk.games.presentation.catalog.model;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ListNextState.kt */
/* loaded from: classes17.dex */
public final class ListNextState {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ListNextState[] $VALUES;
    public static final ListNextState ERROR;
    public static final ListNextState LOADING;

    static {
        ListNextState listNextState = new ListNextState("LOADING", 0);
        LOADING = listNextState;
        ListNextState listNextState2 = new ListNextState("ERROR", 1);
        ERROR = listNextState2;
        ListNextState[] listNextStateArr = {listNextState, listNextState2};
        $VALUES = listNextStateArr;
        $ENTRIES = new asp(listNextStateArr);
    }

    public ListNextState() {
        throw null;
    }

    public static ListNextState valueOf(String str) {
        return (ListNextState) Enum.valueOf(ListNextState.class, str);
    }

    public static ListNextState[] values() {
        return (ListNextState[]) $VALUES.clone();
    }
}
