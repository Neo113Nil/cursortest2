package com.vk.core.performance.score;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PerformanceScoreEventType.kt */
/* loaded from: classes17.dex */
public final class PerformanceScoreEventType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ PerformanceScoreEventType[] $VALUES;
    public static final PerformanceScoreEventType ANR;
    public static final PerformanceScoreEventType CRASH;
    private final boolean needFinishSession;

    static {
        PerformanceScoreEventType performanceScoreEventType = new PerformanceScoreEventType("CRASH", 0, true);
        CRASH = performanceScoreEventType;
        PerformanceScoreEventType performanceScoreEventType2 = new PerformanceScoreEventType("ANR", 1, false);
        ANR = performanceScoreEventType2;
        PerformanceScoreEventType[] performanceScoreEventTypeArr = {performanceScoreEventType, performanceScoreEventType2};
        $VALUES = performanceScoreEventTypeArr;
        $ENTRIES = new asp(performanceScoreEventTypeArr);
    }

    public PerformanceScoreEventType(String str, int i, boolean z) {
        this.needFinishSession = z;
    }

    public static zrp<PerformanceScoreEventType> h() {
        return $ENTRIES;
    }

    public static PerformanceScoreEventType valueOf(String str) {
        return (PerformanceScoreEventType) Enum.valueOf(PerformanceScoreEventType.class, str);
    }

    public static PerformanceScoreEventType[] values() {
        return (PerformanceScoreEventType[]) $VALUES.clone();
    }

    public final boolean i() {
        return this.needFinishSession;
    }
}
