package com.vk.im.chat.restriction.impl.domain;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WriteRestrictionAction.kt */
/* loaded from: classes2.dex */
public final class WriteRestrictionAction {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ WriteRestrictionAction[] $VALUES;
    public static final WriteRestrictionAction DISABLE;
    public static final WriteRestrictionAction ENABLE;

    static {
        WriteRestrictionAction writeRestrictionAction = new WriteRestrictionAction("DISABLE", 0);
        DISABLE = writeRestrictionAction;
        WriteRestrictionAction writeRestrictionAction2 = new WriteRestrictionAction("ENABLE", 1);
        ENABLE = writeRestrictionAction2;
        WriteRestrictionAction[] writeRestrictionActionArr = {writeRestrictionAction, writeRestrictionAction2};
        $VALUES = writeRestrictionActionArr;
        $ENTRIES = new asp(writeRestrictionActionArr);
    }

    public WriteRestrictionAction() {
        throw null;
    }

    public static WriteRestrictionAction valueOf(String str) {
        return (WriteRestrictionAction) Enum.valueOf(WriteRestrictionAction.class, str);
    }

    public static WriteRestrictionAction[] values() {
        return (WriteRestrictionAction[]) $VALUES.clone();
    }
}
