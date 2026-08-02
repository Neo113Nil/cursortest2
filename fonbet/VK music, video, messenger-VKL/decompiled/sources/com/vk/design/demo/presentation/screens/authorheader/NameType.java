package com.vk.design.demo.presentation.screens.authorheader;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AuthorHeaderState.kt */
/* loaded from: classes18.dex */
public final class NameType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ NameType[] $VALUES;
    public static final NameType Default;
    public static final NameType PrivateCommunity;

    static {
        NameType nameType = new NameType("Default", 0);
        Default = nameType;
        NameType nameType2 = new NameType("PrivateCommunity", 1);
        PrivateCommunity = nameType2;
        NameType[] nameTypeArr = {nameType, nameType2};
        $VALUES = nameTypeArr;
        $ENTRIES = new asp(nameTypeArr);
    }

    public NameType() {
        throw null;
    }

    public static NameType valueOf(String str) {
        return (NameType) Enum.valueOf(NameType.class, str);
    }

    public static NameType[] values() {
        return (NameType[]) $VALUES.clone();
    }
}
