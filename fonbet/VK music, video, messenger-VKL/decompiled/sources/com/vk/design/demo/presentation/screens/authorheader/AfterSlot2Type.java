package com.vk.design.demo.presentation.screens.authorheader;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AuthorHeaderState.kt */
/* loaded from: classes18.dex */
public final class AfterSlot2Type {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AfterSlot2Type[] $VALUES;
    public static final AfterSlot2Type Button;
    public static final AfterSlot2Type Loading;
    public static final AfterSlot2Type More;
    public static final AfterSlot2Type None;

    static {
        AfterSlot2Type afterSlot2Type = new AfterSlot2Type("None", 0);
        None = afterSlot2Type;
        AfterSlot2Type afterSlot2Type2 = new AfterSlot2Type("More", 1);
        More = afterSlot2Type2;
        AfterSlot2Type afterSlot2Type3 = new AfterSlot2Type("Button", 2);
        Button = afterSlot2Type3;
        AfterSlot2Type afterSlot2Type4 = new AfterSlot2Type("Loading", 3);
        Loading = afterSlot2Type4;
        AfterSlot2Type[] afterSlot2TypeArr = {afterSlot2Type, afterSlot2Type2, afterSlot2Type3, afterSlot2Type4};
        $VALUES = afterSlot2TypeArr;
        $ENTRIES = new asp(afterSlot2TypeArr);
    }

    public AfterSlot2Type() {
        throw null;
    }

    public static AfterSlot2Type valueOf(String str) {
        return (AfterSlot2Type) Enum.valueOf(AfterSlot2Type.class, str);
    }

    public static AfterSlot2Type[] values() {
        return (AfterSlot2Type[]) $VALUES.clone();
    }
}
