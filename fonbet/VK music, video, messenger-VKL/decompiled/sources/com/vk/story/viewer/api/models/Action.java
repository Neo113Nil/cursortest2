package com.vk.story.viewer.api.models;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: StoryReporter.kt */
/* loaded from: classes6.dex */
public final class Action {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ Action[] $VALUES;
    public static final Action OPEN_CAMERA;
    public static final Action SEND_MESSAGE;

    static {
        Action action = new Action("OPEN_CAMERA", 0);
        OPEN_CAMERA = action;
        Action action2 = new Action("SEND_MESSAGE", 1);
        SEND_MESSAGE = action2;
        Action[] actionArr = {action, action2};
        $VALUES = actionArr;
        $ENTRIES = new asp(actionArr);
    }

    public Action() {
        throw null;
    }

    public static Action valueOf(String str) {
        return (Action) Enum.valueOf(Action.class, str);
    }

    public static Action[] values() {
        return (Action[]) $VALUES.clone();
    }
}
