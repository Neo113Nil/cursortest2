package com.unity3d.ads;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ShowFinishState.kt */
/* loaded from: classes14.dex */
public final class ShowFinishState {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ShowFinishState[] $VALUES;
    public static final ShowFinishState SKIPPED = new ShowFinishState("SKIPPED", 0);
    public static final ShowFinishState COMPLETED = new ShowFinishState("COMPLETED", 1);

    private static final /* synthetic */ ShowFinishState[] $values() {
        return new ShowFinishState[]{SKIPPED, COMPLETED};
    }

    static {
        ShowFinishState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = new asp($values);
    }

    private ShowFinishState(String str, int i) {
    }

    public static zrp<ShowFinishState> getEntries() {
        return $ENTRIES;
    }

    public static ShowFinishState valueOf(String str) {
        return (ShowFinishState) Enum.valueOf(ShowFinishState.class, str);
    }

    public static ShowFinishState[] values() {
        return (ShowFinishState[]) $VALUES.clone();
    }
}
