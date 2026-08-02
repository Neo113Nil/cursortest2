package com.vk.design.demo.presentation.screens;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FormFieldScreenContent.kt */
/* loaded from: classes18.dex */
public final class GroupMode {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GroupMode[] $VALUES;
    public static final GroupMode None;
    public static final GroupMode Row;

    static {
        GroupMode groupMode = new GroupMode("None", 0);
        None = groupMode;
        GroupMode groupMode2 = new GroupMode("Row", 1);
        Row = groupMode2;
        GroupMode[] groupModeArr = {groupMode, groupMode2};
        $VALUES = groupModeArr;
        $ENTRIES = new asp(groupModeArr);
    }

    public GroupMode() {
        throw null;
    }

    public static zrp<GroupMode> h() {
        return $ENTRIES;
    }

    public static GroupMode valueOf(String str) {
        return (GroupMode) Enum.valueOf(GroupMode.class, str);
    }

    public static GroupMode[] values() {
        return (GroupMode[]) $VALUES.clone();
    }
}
