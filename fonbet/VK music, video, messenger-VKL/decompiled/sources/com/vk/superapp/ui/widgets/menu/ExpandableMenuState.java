package com.vk.superapp.ui.widgets.menu;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ExpandableMenuState.kt */
/* loaded from: classes6.dex */
public final class ExpandableMenuState {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ExpandableMenuState[] $VALUES;
    public static final ExpandableMenuState COLLAPSED;
    public static final ExpandableMenuState EXPANDED;

    static {
        ExpandableMenuState expandableMenuState = new ExpandableMenuState("EXPANDED", 0);
        EXPANDED = expandableMenuState;
        ExpandableMenuState expandableMenuState2 = new ExpandableMenuState("COLLAPSED", 1);
        COLLAPSED = expandableMenuState2;
        ExpandableMenuState[] expandableMenuStateArr = {expandableMenuState, expandableMenuState2};
        $VALUES = expandableMenuStateArr;
        $ENTRIES = new asp(expandableMenuStateArr);
    }

    public ExpandableMenuState() {
        throw null;
    }

    public static ExpandableMenuState valueOf(String str) {
        return (ExpandableMenuState) Enum.valueOf(ExpandableMenuState.class, str);
    }

    public static ExpandableMenuState[] values() {
        return (ExpandableMenuState[]) $VALUES.clone();
    }
}
