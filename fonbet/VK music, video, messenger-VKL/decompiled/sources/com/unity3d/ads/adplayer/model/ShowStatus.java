package com.unity3d.ads.adplayer.model;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ShowStatus.kt */
/* loaded from: classes14.dex */
public final class ShowStatus {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ShowStatus[] $VALUES;
    public static final ShowStatus COMPLETED = new ShowStatus("COMPLETED", 0);
    public static final ShowStatus SKIPPED = new ShowStatus("SKIPPED", 1);
    public static final ShowStatus ERROR = new ShowStatus("ERROR", 2);

    private static final /* synthetic */ ShowStatus[] $values() {
        return new ShowStatus[]{COMPLETED, SKIPPED, ERROR};
    }

    static {
        ShowStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = new asp($values);
    }

    private ShowStatus(String str, int i) {
    }

    public static zrp<ShowStatus> getEntries() {
        return $ENTRIES;
    }

    public static ShowStatus valueOf(String str) {
        return (ShowStatus) Enum.valueOf(ShowStatus.class, str);
    }

    public static ShowStatus[] values() {
        return (ShowStatus[]) $VALUES.clone();
    }
}
