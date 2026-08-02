package com.vk.design.demo.presentation.screens.authorheader;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AuthorHeaderState.kt */
/* loaded from: classes18.dex */
public final class AfterSlot1Type {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AfterSlot1Type[] $VALUES;
    public static final AfterSlot1Type Join;
    public static final AfterSlot1Type None;
    public static final AfterSlot1Type Notification;
    public static final AfterSlot1Type Settings;

    static {
        AfterSlot1Type afterSlot1Type = new AfterSlot1Type("None", 0);
        None = afterSlot1Type;
        AfterSlot1Type afterSlot1Type2 = new AfterSlot1Type("Join", 1);
        Join = afterSlot1Type2;
        AfterSlot1Type afterSlot1Type3 = new AfterSlot1Type("Notification", 2);
        Notification = afterSlot1Type3;
        AfterSlot1Type afterSlot1Type4 = new AfterSlot1Type("Settings", 3);
        Settings = afterSlot1Type4;
        AfterSlot1Type[] afterSlot1TypeArr = {afterSlot1Type, afterSlot1Type2, afterSlot1Type3, afterSlot1Type4};
        $VALUES = afterSlot1TypeArr;
        $ENTRIES = new asp(afterSlot1TypeArr);
    }

    public AfterSlot1Type() {
        throw null;
    }

    public static AfterSlot1Type valueOf(String str) {
        return (AfterSlot1Type) Enum.valueOf(AfterSlot1Type.class, str);
    }

    public static AfterSlot1Type[] values() {
        return (AfterSlot1Type[]) $VALUES.clone();
    }
}
