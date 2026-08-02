package com.vk.superapp.api.dto.menu;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SuperAppAnimationConfig.kt */
/* loaded from: classes6.dex */
public final class Action {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ Action[] $VALUES;
    public static final Action OPEN;
    public static final Action SHAKE;
    private final String value;

    static {
        Action action = new Action("SHAKE", 0, "shake");
        SHAKE = action;
        Action action2 = new Action("OPEN", 1, "open");
        OPEN = action2;
        Action[] actionArr = {action, action2};
        $VALUES = actionArr;
        $ENTRIES = new asp(actionArr);
    }

    public Action(String str, int i, String str2) {
        this.value = str2;
    }

    public static Action valueOf(String str) {
        return (Action) Enum.valueOf(Action.class, str);
    }

    public static Action[] values() {
        return (Action[]) $VALUES.clone();
    }

    public final String h() {
        return this.value;
    }
}
