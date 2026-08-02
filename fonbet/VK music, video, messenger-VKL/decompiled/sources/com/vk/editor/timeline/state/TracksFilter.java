package com.vk.editor.timeline.state;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TracksFilter.kt */
/* loaded from: classes18.dex */
public final class TracksFilter {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ TracksFilter[] $VALUES;
    public static final TracksFilter ALL;
    public static final TracksFilter ONLY_FIXED;
    public static final TracksFilter WITHOUT_FIXED;

    static {
        TracksFilter tracksFilter = new TracksFilter("ALL", 0);
        ALL = tracksFilter;
        TracksFilter tracksFilter2 = new TracksFilter("ONLY_FIXED", 1);
        ONLY_FIXED = tracksFilter2;
        TracksFilter tracksFilter3 = new TracksFilter("WITHOUT_FIXED", 2);
        WITHOUT_FIXED = tracksFilter3;
        TracksFilter[] tracksFilterArr = {tracksFilter, tracksFilter2, tracksFilter3};
        $VALUES = tracksFilterArr;
        $ENTRIES = new asp(tracksFilterArr);
    }

    public TracksFilter() {
        throw null;
    }

    public static TracksFilter valueOf(String str) {
        return (TracksFilter) Enum.valueOf(TracksFilter.class, str);
    }

    public static TracksFilter[] values() {
        return (TracksFilter[]) $VALUES.clone();
    }
}
