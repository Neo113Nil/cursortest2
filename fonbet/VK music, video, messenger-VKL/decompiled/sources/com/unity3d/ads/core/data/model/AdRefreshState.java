package com.unity3d.ads.core.data.model;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AdRefreshState.kt */
/* loaded from: classes14.dex */
public final class AdRefreshState {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AdRefreshState[] $VALUES;
    public static final AdRefreshState REUSE_RELOADED = new AdRefreshState("REUSE_RELOADED", 0);
    public static final AdRefreshState REUSE_NO_FILL = new AdRefreshState("REUSE_NO_FILL", 1);
    public static final AdRefreshState REUSE_ERROR = new AdRefreshState("REUSE_ERROR", 2);
    public static final AdRefreshState REUSE_DURING_RELOAD = new AdRefreshState("REUSE_DURING_RELOAD", 3);

    private static final /* synthetic */ AdRefreshState[] $values() {
        return new AdRefreshState[]{REUSE_RELOADED, REUSE_NO_FILL, REUSE_ERROR, REUSE_DURING_RELOAD};
    }

    static {
        AdRefreshState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = new asp($values);
    }

    private AdRefreshState(String str, int i) {
    }

    public static zrp<AdRefreshState> getEntries() {
        return $ENTRIES;
    }

    public static AdRefreshState valueOf(String str) {
        return (AdRefreshState) Enum.valueOf(AdRefreshState.class, str);
    }

    public static AdRefreshState[] values() {
        return (AdRefreshState[]) $VALUES.clone();
    }
}
