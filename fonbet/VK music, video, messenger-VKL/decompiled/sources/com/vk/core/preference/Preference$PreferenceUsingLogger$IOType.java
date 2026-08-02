package com.vk.core.preference;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Preference.kt */
/* loaded from: classes.dex */
public final class Preference$PreferenceUsingLogger$IOType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ Preference$PreferenceUsingLogger$IOType[] $VALUES;
    public static final Preference$PreferenceUsingLogger$IOType Contains;
    public static final Preference$PreferenceUsingLogger$IOType Read;
    public static final Preference$PreferenceUsingLogger$IOType Remove;
    public static final Preference$PreferenceUsingLogger$IOType Write;

    static {
        Preference$PreferenceUsingLogger$IOType preference$PreferenceUsingLogger$IOType = new Preference$PreferenceUsingLogger$IOType("Write", 0);
        Write = preference$PreferenceUsingLogger$IOType;
        Preference$PreferenceUsingLogger$IOType preference$PreferenceUsingLogger$IOType2 = new Preference$PreferenceUsingLogger$IOType("Read", 1);
        Read = preference$PreferenceUsingLogger$IOType2;
        Preference$PreferenceUsingLogger$IOType preference$PreferenceUsingLogger$IOType3 = new Preference$PreferenceUsingLogger$IOType("Contains", 2);
        Contains = preference$PreferenceUsingLogger$IOType3;
        Preference$PreferenceUsingLogger$IOType preference$PreferenceUsingLogger$IOType4 = new Preference$PreferenceUsingLogger$IOType("Remove", 3);
        Remove = preference$PreferenceUsingLogger$IOType4;
        Preference$PreferenceUsingLogger$IOType[] preference$PreferenceUsingLogger$IOTypeArr = {preference$PreferenceUsingLogger$IOType, preference$PreferenceUsingLogger$IOType2, preference$PreferenceUsingLogger$IOType3, preference$PreferenceUsingLogger$IOType4};
        $VALUES = preference$PreferenceUsingLogger$IOTypeArr;
        $ENTRIES = new asp(preference$PreferenceUsingLogger$IOTypeArr);
    }

    public Preference$PreferenceUsingLogger$IOType() {
        throw null;
    }

    public static Preference$PreferenceUsingLogger$IOType valueOf(String str) {
        return (Preference$PreferenceUsingLogger$IOType) Enum.valueOf(Preference$PreferenceUsingLogger$IOType.class, str);
    }

    public static Preference$PreferenceUsingLogger$IOType[] values() {
        return (Preference$PreferenceUsingLogger$IOType[]) $VALUES.clone();
    }
}
