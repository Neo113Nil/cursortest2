package com.vk.typography;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TextViewExt.kt */
/* loaded from: classes6.dex */
public final class TextFlag {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ TextFlag[] $VALUES;
    public static final TextFlag DO_NOT_CHANGE_SIZE;
    private final int flag = 2;

    static {
        TextFlag textFlag = new TextFlag();
        DO_NOT_CHANGE_SIZE = textFlag;
        TextFlag[] textFlagArr = {textFlag};
        $VALUES = textFlagArr;
        $ENTRIES = new asp(textFlagArr);
    }

    public static TextFlag valueOf(String str) {
        return (TextFlag) Enum.valueOf(TextFlag.class, str);
    }

    public static TextFlag[] values() {
        return (TextFlag[]) $VALUES.clone();
    }

    public final int h() {
        return this.flag;
    }
}
