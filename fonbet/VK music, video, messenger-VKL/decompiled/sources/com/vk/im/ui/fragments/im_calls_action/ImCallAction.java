package com.vk.im.ui.fragments.im_calls_action;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ImCallAction.kt */
/* loaded from: classes2.dex */
public final class ImCallAction {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ImCallAction[] $VALUES;
    public static final ImCallAction CREATE_SCHEDULED;
    public static final ImCallAction CREATE_WITH_LINK;
    public static final ImCallAction GO_TO_CALLS;

    static {
        ImCallAction imCallAction = new ImCallAction("CREATE_WITH_LINK", 0);
        CREATE_WITH_LINK = imCallAction;
        ImCallAction imCallAction2 = new ImCallAction("CREATE_SCHEDULED", 1);
        CREATE_SCHEDULED = imCallAction2;
        ImCallAction imCallAction3 = new ImCallAction("GO_TO_CALLS", 2);
        GO_TO_CALLS = imCallAction3;
        ImCallAction[] imCallActionArr = {imCallAction, imCallAction2, imCallAction3};
        $VALUES = imCallActionArr;
        $ENTRIES = new asp(imCallActionArr);
    }

    public ImCallAction() {
        throw null;
    }

    public static ImCallAction valueOf(String str) {
        return (ImCallAction) Enum.valueOf(ImCallAction.class, str);
    }

    public static ImCallAction[] values() {
        return (ImCallAction[]) $VALUES.clone();
    }
}
