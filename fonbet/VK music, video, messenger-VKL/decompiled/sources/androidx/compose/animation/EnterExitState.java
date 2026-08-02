package androidx.compose.animation;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AnimatedVisibility.kt */
/* loaded from: classes11.dex */
public final class EnterExitState {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ EnterExitState[] $VALUES;
    public static final EnterExitState PostExit;
    public static final EnterExitState PreEnter;
    public static final EnterExitState Visible;

    static {
        EnterExitState enterExitState = new EnterExitState("PreEnter", 0);
        PreEnter = enterExitState;
        EnterExitState enterExitState2 = new EnterExitState("Visible", 1);
        Visible = enterExitState2;
        EnterExitState enterExitState3 = new EnterExitState("PostExit", 2);
        PostExit = enterExitState3;
        EnterExitState[] enterExitStateArr = {enterExitState, enterExitState2, enterExitState3};
        $VALUES = enterExitStateArr;
        $ENTRIES = new asp(enterExitStateArr);
    }

    public EnterExitState() {
        throw null;
    }

    public static EnterExitState valueOf(String str) {
        return (EnterExitState) Enum.valueOf(EnterExitState.class, str);
    }

    public static EnterExitState[] values() {
        return (EnterExitState[]) $VALUES.clone();
    }
}
