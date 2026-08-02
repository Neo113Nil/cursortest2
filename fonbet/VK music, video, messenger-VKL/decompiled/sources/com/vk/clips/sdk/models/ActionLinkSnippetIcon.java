package com.vk.clips.sdk.models;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ActionLinkSnippetIcon.kt */
/* loaded from: classes17.dex */
public final class ActionLinkSnippetIcon {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ActionLinkSnippetIcon[] $VALUES;
    public static final ActionLinkSnippetIcon LIVE_FINISHED;
    public static final ActionLinkSnippetIcon LIVE_STARTED;
    public static final ActionLinkSnippetIcon LIVE_UPCOMING;
    private final String value;

    static {
        ActionLinkSnippetIcon actionLinkSnippetIcon = new ActionLinkSnippetIcon("LIVE_STARTED", 0, "live_started");
        LIVE_STARTED = actionLinkSnippetIcon;
        ActionLinkSnippetIcon actionLinkSnippetIcon2 = new ActionLinkSnippetIcon("LIVE_UPCOMING", 1, "live_upcoming");
        LIVE_UPCOMING = actionLinkSnippetIcon2;
        ActionLinkSnippetIcon actionLinkSnippetIcon3 = new ActionLinkSnippetIcon("LIVE_FINISHED", 2, "live_finished");
        LIVE_FINISHED = actionLinkSnippetIcon3;
        ActionLinkSnippetIcon[] actionLinkSnippetIconArr = {actionLinkSnippetIcon, actionLinkSnippetIcon2, actionLinkSnippetIcon3};
        $VALUES = actionLinkSnippetIconArr;
        $ENTRIES = new asp(actionLinkSnippetIconArr);
    }

    public ActionLinkSnippetIcon(String str, int i, String str2) {
        this.value = str2;
    }

    public static zrp<ActionLinkSnippetIcon> h() {
        return $ENTRIES;
    }

    public static ActionLinkSnippetIcon valueOf(String str) {
        return (ActionLinkSnippetIcon) Enum.valueOf(ActionLinkSnippetIcon.class, str);
    }

    public static ActionLinkSnippetIcon[] values() {
        return (ActionLinkSnippetIcon[]) $VALUES.clone();
    }

    public final String i() {
        return this.value;
    }
}
