package com.vk.music.bottomsheets.reactions.presentation;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LoadReactionsStateValue.kt */
/* loaded from: classes3.dex */
public final class LoadReactionsStateValue {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ LoadReactionsStateValue[] $VALUES;
    public static final LoadReactionsStateValue COMPLETED;
    public static final LoadReactionsStateValue ERROR;
    public static final LoadReactionsStateValue LOADING;

    static {
        LoadReactionsStateValue loadReactionsStateValue = new LoadReactionsStateValue("LOADING", 0);
        LOADING = loadReactionsStateValue;
        LoadReactionsStateValue loadReactionsStateValue2 = new LoadReactionsStateValue("COMPLETED", 1);
        COMPLETED = loadReactionsStateValue2;
        LoadReactionsStateValue loadReactionsStateValue3 = new LoadReactionsStateValue("ERROR", 2);
        ERROR = loadReactionsStateValue3;
        LoadReactionsStateValue[] loadReactionsStateValueArr = {loadReactionsStateValue, loadReactionsStateValue2, loadReactionsStateValue3};
        $VALUES = loadReactionsStateValueArr;
        $ENTRIES = new asp(loadReactionsStateValueArr);
    }

    public LoadReactionsStateValue() {
        throw null;
    }

    public static LoadReactionsStateValue valueOf(String str) {
        return (LoadReactionsStateValue) Enum.valueOf(LoadReactionsStateValue.class, str);
    }

    public static LoadReactionsStateValue[] values() {
        return (LoadReactionsStateValue[]) $VALUES.clone();
    }
}
