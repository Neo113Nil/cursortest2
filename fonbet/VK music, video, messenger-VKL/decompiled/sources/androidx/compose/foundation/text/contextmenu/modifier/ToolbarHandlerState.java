package androidx.compose.foundation.text.contextmenu.modifier;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TextContextMenuToolbarHandlerModifier.kt */
/* loaded from: classes11.dex */
public final class ToolbarHandlerState {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ToolbarHandlerState[] $VALUES;
    public static final ToolbarHandlerState Attached;
    public static final ToolbarHandlerState Detached;
    public static final ToolbarHandlerState Uninitialized;

    static {
        ToolbarHandlerState toolbarHandlerState = new ToolbarHandlerState("Uninitialized", 0);
        Uninitialized = toolbarHandlerState;
        ToolbarHandlerState toolbarHandlerState2 = new ToolbarHandlerState("Detached", 1);
        Detached = toolbarHandlerState2;
        ToolbarHandlerState toolbarHandlerState3 = new ToolbarHandlerState("Attached", 2);
        Attached = toolbarHandlerState3;
        ToolbarHandlerState[] toolbarHandlerStateArr = {toolbarHandlerState, toolbarHandlerState2, toolbarHandlerState3};
        $VALUES = toolbarHandlerStateArr;
        $ENTRIES = new asp(toolbarHandlerStateArr);
    }

    public ToolbarHandlerState() {
        throw null;
    }

    public static ToolbarHandlerState valueOf(String str) {
        return (ToolbarHandlerState) Enum.valueOf(ToolbarHandlerState.class, str);
    }

    public static ToolbarHandlerState[] values() {
        return (ToolbarHandlerState[]) $VALUES.clone();
    }
}
