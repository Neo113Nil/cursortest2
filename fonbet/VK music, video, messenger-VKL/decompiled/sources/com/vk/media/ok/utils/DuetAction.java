package com.vk.media.ok.utils;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DuetAction.kt */
/* loaded from: classes3.dex */
public final class DuetAction {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ DuetAction[] $VALUES;
    public static final DuetAction BLUR;
    public static final DuetAction CANCEL;
    public static final DuetAction CARD;
    public static final a Companion;
    public static final DuetAction HOR;
    public static final DuetAction VERT;
    private final int id;

    /* compiled from: DuetAction.kt */
    public static final class a {
    }

    static {
        DuetAction duetAction = new DuetAction("CANCEL", 0, -1);
        CANCEL = duetAction;
        DuetAction duetAction2 = new DuetAction("BLUR", 1, 1);
        BLUR = duetAction2;
        DuetAction duetAction3 = new DuetAction("CARD", 2, 2);
        CARD = duetAction3;
        DuetAction duetAction4 = new DuetAction("VERT", 3, 3);
        VERT = duetAction4;
        DuetAction duetAction5 = new DuetAction("HOR", 4, 4);
        HOR = duetAction5;
        DuetAction[] duetActionArr = {duetAction, duetAction2, duetAction3, duetAction4, duetAction5};
        $VALUES = duetActionArr;
        $ENTRIES = new asp(duetActionArr);
        Companion = new a();
    }

    public DuetAction(String str, int i, int i2) {
        this.id = i2;
    }

    public static DuetAction valueOf(String str) {
        return (DuetAction) Enum.valueOf(DuetAction.class, str);
    }

    public static DuetAction[] values() {
        return (DuetAction[]) $VALUES.clone();
    }

    public final int h() {
        return this.id;
    }
}
