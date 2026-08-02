package com.vk.design.demo.presentation.screens.authorheader;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AuthorHeaderState.kt */
/* loaded from: classes18.dex */
public final class DescriptionType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ DescriptionType[] $VALUES;
    public static final DescriptionType Empty;
    public static final DescriptionType Filled;
    public static final DescriptionType None;

    static {
        DescriptionType descriptionType = new DescriptionType("Filled", 0);
        Filled = descriptionType;
        DescriptionType descriptionType2 = new DescriptionType("Empty", 1);
        Empty = descriptionType2;
        DescriptionType descriptionType3 = new DescriptionType("None", 2);
        None = descriptionType3;
        DescriptionType[] descriptionTypeArr = {descriptionType, descriptionType2, descriptionType3};
        $VALUES = descriptionTypeArr;
        $ENTRIES = new asp(descriptionTypeArr);
    }

    public DescriptionType() {
        throw null;
    }

    public static DescriptionType valueOf(String str) {
        return (DescriptionType) Enum.valueOf(DescriptionType.class, str);
    }

    public static DescriptionType[] values() {
        return (DescriptionType[]) $VALUES.clone();
    }
}
