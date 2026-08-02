package com.airbnb.lottie.compose;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LottieCancellationBehavior.kt */
/* loaded from: classes12.dex */
public final class LottieCancellationBehavior {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ LottieCancellationBehavior[] $VALUES;
    public static final LottieCancellationBehavior Immediately;
    public static final LottieCancellationBehavior OnIterationFinish;

    static {
        LottieCancellationBehavior lottieCancellationBehavior = new LottieCancellationBehavior("Immediately", 0);
        Immediately = lottieCancellationBehavior;
        LottieCancellationBehavior lottieCancellationBehavior2 = new LottieCancellationBehavior("OnIterationFinish", 1);
        OnIterationFinish = lottieCancellationBehavior2;
        LottieCancellationBehavior[] lottieCancellationBehaviorArr = {lottieCancellationBehavior, lottieCancellationBehavior2};
        $VALUES = lottieCancellationBehaviorArr;
        $ENTRIES = new asp(lottieCancellationBehaviorArr);
    }

    public LottieCancellationBehavior() {
        throw null;
    }

    public static LottieCancellationBehavior valueOf(String str) {
        return (LottieCancellationBehavior) Enum.valueOf(LottieCancellationBehavior.class, str);
    }

    public static LottieCancellationBehavior[] values() {
        return (LottieCancellationBehavior[]) $VALUES.clone();
    }
}
