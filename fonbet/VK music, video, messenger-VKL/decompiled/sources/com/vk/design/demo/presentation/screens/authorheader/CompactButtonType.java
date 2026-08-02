package com.vk.design.demo.presentation.screens.authorheader;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AuthorHeaderState.kt */
/* loaded from: classes18.dex */
public final class CompactButtonType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CompactButtonType[] $VALUES;
    public static final CompactButtonType BellChecked;
    public static final CompactButtonType BellUnChecked;
    public static final CompactButtonType Call;
    public static final CompactButtonType Email;
    public static final CompactButtonType None;
    public static final CompactButtonType OpenApp;
    public static final CompactButtonType OpenBooking;
    public static final CompactButtonType OpenInternalApp;
    public static final CompactButtonType OpenInternalUrl;
    public static final CompactButtonType OpenUrl;
    public static final CompactButtonType VKCall;

    static {
        CompactButtonType compactButtonType = new CompactButtonType("None", 0);
        None = compactButtonType;
        CompactButtonType compactButtonType2 = new CompactButtonType("BellChecked", 1);
        BellChecked = compactButtonType2;
        CompactButtonType compactButtonType3 = new CompactButtonType("BellUnChecked", 2);
        BellUnChecked = compactButtonType3;
        CompactButtonType compactButtonType4 = new CompactButtonType("VKCall", 3);
        VKCall = compactButtonType4;
        CompactButtonType compactButtonType5 = new CompactButtonType("Call", 4);
        Call = compactButtonType5;
        CompactButtonType compactButtonType6 = new CompactButtonType("Email", 5);
        Email = compactButtonType6;
        CompactButtonType compactButtonType7 = new CompactButtonType("OpenUrl", 6);
        OpenUrl = compactButtonType7;
        CompactButtonType compactButtonType8 = new CompactButtonType("OpenInternalUrl", 7);
        OpenInternalUrl = compactButtonType8;
        CompactButtonType compactButtonType9 = new CompactButtonType("OpenApp", 8);
        OpenApp = compactButtonType9;
        CompactButtonType compactButtonType10 = new CompactButtonType("OpenInternalApp", 9);
        OpenInternalApp = compactButtonType10;
        CompactButtonType compactButtonType11 = new CompactButtonType("OpenBooking", 10);
        OpenBooking = compactButtonType11;
        CompactButtonType[] compactButtonTypeArr = {compactButtonType, compactButtonType2, compactButtonType3, compactButtonType4, compactButtonType5, compactButtonType6, compactButtonType7, compactButtonType8, compactButtonType9, compactButtonType10, compactButtonType11};
        $VALUES = compactButtonTypeArr;
        $ENTRIES = new asp(compactButtonTypeArr);
    }

    public CompactButtonType() {
        throw null;
    }

    public static CompactButtonType valueOf(String str) {
        return (CompactButtonType) Enum.valueOf(CompactButtonType.class, str);
    }

    public static CompactButtonType[] values() {
        return (CompactButtonType[]) $VALUES.clone();
    }
}
