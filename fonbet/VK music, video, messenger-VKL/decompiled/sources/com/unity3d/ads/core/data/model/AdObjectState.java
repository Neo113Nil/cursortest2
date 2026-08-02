package com.unity3d.ads.core.data.model;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AdObject.kt */
/* loaded from: classes14.dex */
public final class AdObjectState {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AdObjectState[] $VALUES;
    public static final AdObjectState INIT = new AdObjectState("INIT", 0);
    public static final AdObjectState LOADED = new AdObjectState("LOADED", 1);
    public static final AdObjectState SHOWING = new AdObjectState("SHOWING", 2);
    public static final AdObjectState EXPIRED = new AdObjectState("EXPIRED", 3);
    public static final AdObjectState COMPLETED = new AdObjectState("COMPLETED", 4);

    private static final /* synthetic */ AdObjectState[] $values() {
        return new AdObjectState[]{INIT, LOADED, SHOWING, EXPIRED, COMPLETED};
    }

    static {
        AdObjectState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = new asp($values);
    }

    private AdObjectState(String str, int i) {
    }

    public static zrp<AdObjectState> getEntries() {
        return $ENTRIES;
    }

    public static AdObjectState valueOf(String str) {
        return (AdObjectState) Enum.valueOf(AdObjectState.class, str);
    }

    public static AdObjectState[] values() {
        return (AdObjectState[]) $VALUES.clone();
    }
}
