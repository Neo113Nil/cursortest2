package androidx.compose.animation.core;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AnimationEndReason.kt */
/* loaded from: classes11.dex */
public final class AnimationEndReason {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AnimationEndReason[] $VALUES;
    public static final AnimationEndReason BoundReached;
    public static final AnimationEndReason Finished;

    static {
        AnimationEndReason animationEndReason = new AnimationEndReason("BoundReached", 0);
        BoundReached = animationEndReason;
        AnimationEndReason animationEndReason2 = new AnimationEndReason("Finished", 1);
        Finished = animationEndReason2;
        AnimationEndReason[] animationEndReasonArr = {animationEndReason, animationEndReason2};
        $VALUES = animationEndReasonArr;
        $ENTRIES = new asp(animationEndReasonArr);
    }

    public AnimationEndReason() {
        throw null;
    }

    public static AnimationEndReason valueOf(String str) {
        return (AnimationEndReason) Enum.valueOf(AnimationEndReason.class, str);
    }

    public static AnimationEndReason[] values() {
        return (AnimationEndReason[]) $VALUES.clone();
    }
}
