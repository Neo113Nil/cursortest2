package com.vk.superapp.browser.ui.dialogs;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DialogResultState.kt */
/* loaded from: classes6.dex */
public final class DialogResultState {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ DialogResultState[] $VALUES;
    public static final DialogResultState CANCEL;
    public static final a Companion;
    public static final DialogResultState EXIT;
    public static final DialogResultState GAME_CLICKED;
    public static final DialogResultState OUTSIDE;
    public static final DialogResultState SHOWN;

    /* compiled from: DialogResultState.kt */
    public static final class a {
    }

    static {
        DialogResultState dialogResultState = new DialogResultState("EXIT", 0);
        EXIT = dialogResultState;
        DialogResultState dialogResultState2 = new DialogResultState("CANCEL", 1);
        CANCEL = dialogResultState2;
        DialogResultState dialogResultState3 = new DialogResultState("OUTSIDE", 2);
        OUTSIDE = dialogResultState3;
        DialogResultState dialogResultState4 = new DialogResultState("SHOWN", 3);
        SHOWN = dialogResultState4;
        DialogResultState dialogResultState5 = new DialogResultState("GAME_CLICKED", 4);
        GAME_CLICKED = dialogResultState5;
        DialogResultState[] dialogResultStateArr = {dialogResultState, dialogResultState2, dialogResultState3, dialogResultState4, dialogResultState5};
        $VALUES = dialogResultStateArr;
        $ENTRIES = new asp(dialogResultStateArr);
        Companion = new a();
    }

    public DialogResultState() {
        throw null;
    }

    public static zrp<DialogResultState> h() {
        return $ENTRIES;
    }

    public static DialogResultState valueOf(String str) {
        return (DialogResultState) Enum.valueOf(DialogResultState.class, str);
    }

    public static DialogResultState[] values() {
        return (DialogResultState[]) $VALUES.clone();
    }
}
