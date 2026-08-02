package com.vk.clips.attachments.impl.publish.cta;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ActionButtonsPickerTestTags.kt */
/* loaded from: classes16.dex */
public final class ActionButtonsPickerTestTags {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ActionButtonsPickerTestTags[] $VALUES;
    public static final ActionButtonsPickerTestTags ActionButtonsPickerCta;
    public static final ActionButtonsPickerTestTags ActionButtonsPickerDone;
    public static final ActionButtonsPickerTestTags ActionButtonsPickerTopBar;
    private final String tag;

    static {
        ActionButtonsPickerTestTags actionButtonsPickerTestTags = new ActionButtonsPickerTestTags("ActionButtonsPickerTopBar", 0, "action_button_picker_toolbar");
        ActionButtonsPickerTopBar = actionButtonsPickerTestTags;
        ActionButtonsPickerTestTags actionButtonsPickerTestTags2 = new ActionButtonsPickerTestTags("ActionButtonsPickerCta", 1, "action_button_picker_cta");
        ActionButtonsPickerCta = actionButtonsPickerTestTags2;
        ActionButtonsPickerTestTags actionButtonsPickerTestTags3 = new ActionButtonsPickerTestTags("ActionButtonsPickerDone", 2, "action_button_picker_done");
        ActionButtonsPickerDone = actionButtonsPickerTestTags3;
        ActionButtonsPickerTestTags[] actionButtonsPickerTestTagsArr = {actionButtonsPickerTestTags, actionButtonsPickerTestTags2, actionButtonsPickerTestTags3};
        $VALUES = actionButtonsPickerTestTagsArr;
        $ENTRIES = new asp(actionButtonsPickerTestTagsArr);
    }

    public ActionButtonsPickerTestTags(String str, int i, String str2) {
        this.tag = str2;
    }

    public static ActionButtonsPickerTestTags valueOf(String str) {
        return (ActionButtonsPickerTestTags) Enum.valueOf(ActionButtonsPickerTestTags.class, str);
    }

    public static ActionButtonsPickerTestTags[] values() {
        return (ActionButtonsPickerTestTags[]) $VALUES.clone();
    }

    public final String h() {
        return this.tag;
    }
}
