package com.vk.im.engine.models.reporters;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DialogsFilterChangeSource.kt */
/* loaded from: classes2.dex */
public final class DialogsFilterChangeSource {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ DialogsFilterChangeSource[] $VALUES;
    public static final DialogsFilterChangeSource BOTTOM_NAVIGATION;
    public static final DialogsFilterChangeSource LIST_EMPTY;
    public static final DialogsFilterChangeSource LIST_WITH_ITEMS;
    public static final DialogsFilterChangeSource SELECTOR;

    static {
        DialogsFilterChangeSource dialogsFilterChangeSource = new DialogsFilterChangeSource("SELECTOR", 0);
        SELECTOR = dialogsFilterChangeSource;
        DialogsFilterChangeSource dialogsFilterChangeSource2 = new DialogsFilterChangeSource("BOTTOM_NAVIGATION", 1);
        BOTTOM_NAVIGATION = dialogsFilterChangeSource2;
        DialogsFilterChangeSource dialogsFilterChangeSource3 = new DialogsFilterChangeSource("LIST_WITH_ITEMS", 2);
        LIST_WITH_ITEMS = dialogsFilterChangeSource3;
        DialogsFilterChangeSource dialogsFilterChangeSource4 = new DialogsFilterChangeSource("LIST_EMPTY", 3);
        LIST_EMPTY = dialogsFilterChangeSource4;
        DialogsFilterChangeSource[] dialogsFilterChangeSourceArr = {dialogsFilterChangeSource, dialogsFilterChangeSource2, dialogsFilterChangeSource3, dialogsFilterChangeSource4};
        $VALUES = dialogsFilterChangeSourceArr;
        $ENTRIES = new asp(dialogsFilterChangeSourceArr);
    }

    public DialogsFilterChangeSource() {
        throw null;
    }

    public static DialogsFilterChangeSource valueOf(String str) {
        return (DialogsFilterChangeSource) Enum.valueOf(DialogsFilterChangeSource.class, str);
    }

    public static DialogsFilterChangeSource[] values() {
        return (DialogsFilterChangeSource[]) $VALUES.clone();
    }
}
