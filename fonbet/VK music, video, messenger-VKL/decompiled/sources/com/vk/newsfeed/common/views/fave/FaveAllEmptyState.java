package com.vk.newsfeed.common.views.fave;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FaveAllEmptyState.kt */
/* loaded from: classes4.dex */
public final class FaveAllEmptyState {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ FaveAllEmptyState[] $VALUES;
    public static final FaveAllEmptyState EMPTY;
    public static final FaveAllEmptyState EMPTY_TAG;
    public static final FaveAllEmptyState NONE;

    static {
        FaveAllEmptyState faveAllEmptyState = new FaveAllEmptyState("NONE", 0);
        NONE = faveAllEmptyState;
        FaveAllEmptyState faveAllEmptyState2 = new FaveAllEmptyState("EMPTY", 1);
        EMPTY = faveAllEmptyState2;
        FaveAllEmptyState faveAllEmptyState3 = new FaveAllEmptyState("EMPTY_TAG", 2);
        EMPTY_TAG = faveAllEmptyState3;
        FaveAllEmptyState[] faveAllEmptyStateArr = {faveAllEmptyState, faveAllEmptyState2, faveAllEmptyState3};
        $VALUES = faveAllEmptyStateArr;
        $ENTRIES = new asp(faveAllEmptyStateArr);
    }

    public FaveAllEmptyState() {
        throw null;
    }

    public static FaveAllEmptyState valueOf(String str) {
        return (FaveAllEmptyState) Enum.valueOf(FaveAllEmptyState.class, str);
    }

    public static FaveAllEmptyState[] values() {
        return (FaveAllEmptyState[]) $VALUES.clone();
    }
}
