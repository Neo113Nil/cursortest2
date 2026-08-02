package androidx.compose.foundation.text;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CoreTextField.kt */
/* loaded from: classes11.dex */
public final class HandleState {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ HandleState[] $VALUES;
    public static final HandleState Cursor;
    public static final HandleState None;
    public static final HandleState Selection;

    static {
        HandleState handleState = new HandleState("None", 0);
        None = handleState;
        HandleState handleState2 = new HandleState("Selection", 1);
        Selection = handleState2;
        HandleState handleState3 = new HandleState("Cursor", 2);
        Cursor = handleState3;
        HandleState[] handleStateArr = {handleState, handleState2, handleState3};
        $VALUES = handleStateArr;
        $ENTRIES = new asp(handleStateArr);
    }

    public HandleState() {
        throw null;
    }

    public static HandleState valueOf(String str) {
        return (HandleState) Enum.valueOf(HandleState.class, str);
    }

    public static HandleState[] values() {
        return (HandleState[]) $VALUES.clone();
    }
}
