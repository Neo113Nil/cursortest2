package com.vk.newsfeed.posting.impl.presentation.model;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PostingViewState.kt */
/* loaded from: classes4.dex */
public final class ToolbarNavButtonType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ToolbarNavButtonType[] $VALUES;
    public static final ToolbarNavButtonType Back;
    public static final ToolbarNavButtonType Close;

    static {
        ToolbarNavButtonType toolbarNavButtonType = new ToolbarNavButtonType("Close", 0);
        Close = toolbarNavButtonType;
        ToolbarNavButtonType toolbarNavButtonType2 = new ToolbarNavButtonType("Back", 1);
        Back = toolbarNavButtonType2;
        ToolbarNavButtonType[] toolbarNavButtonTypeArr = {toolbarNavButtonType, toolbarNavButtonType2};
        $VALUES = toolbarNavButtonTypeArr;
        $ENTRIES = new asp(toolbarNavButtonTypeArr);
    }

    public ToolbarNavButtonType() {
        throw null;
    }

    public static ToolbarNavButtonType valueOf(String str) {
        return (ToolbarNavButtonType) Enum.valueOf(ToolbarNavButtonType.class, str);
    }

    public static ToolbarNavButtonType[] values() {
        return (ToolbarNavButtonType[]) $VALUES.clone();
    }
}
