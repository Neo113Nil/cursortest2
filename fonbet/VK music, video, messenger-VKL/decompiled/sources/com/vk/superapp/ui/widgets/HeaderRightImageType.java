package com.vk.superapp.ui.widgets;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: HeaderRightImageType.kt */
/* loaded from: classes6.dex */
public final class HeaderRightImageType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ HeaderRightImageType[] $VALUES;
    public static final HeaderRightImageType ADD;
    public static final HeaderRightImageType CHEVRON;
    public static final HeaderRightImageType MORE;
    public static final HeaderRightImageType NONE;
    private final String type;

    static {
        HeaderRightImageType headerRightImageType = new HeaderRightImageType("NONE", 0, "none");
        NONE = headerRightImageType;
        HeaderRightImageType headerRightImageType2 = new HeaderRightImageType("MORE", 1, "more");
        MORE = headerRightImageType2;
        HeaderRightImageType headerRightImageType3 = new HeaderRightImageType("CHEVRON", 2, "chevron");
        CHEVRON = headerRightImageType3;
        HeaderRightImageType headerRightImageType4 = new HeaderRightImageType("ADD", 3, "add");
        ADD = headerRightImageType4;
        HeaderRightImageType[] headerRightImageTypeArr = {headerRightImageType, headerRightImageType2, headerRightImageType3, headerRightImageType4};
        $VALUES = headerRightImageTypeArr;
        $ENTRIES = new asp(headerRightImageTypeArr);
    }

    public HeaderRightImageType(String str, int i, String str2) {
        this.type = str2;
    }

    public static HeaderRightImageType valueOf(String str) {
        return (HeaderRightImageType) Enum.valueOf(HeaderRightImageType.class, str);
    }

    public static HeaderRightImageType[] values() {
        return (HeaderRightImageType[]) $VALUES.clone();
    }
}
