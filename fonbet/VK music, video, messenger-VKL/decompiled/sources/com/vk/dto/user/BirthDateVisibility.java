package com.vk.dto.user;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BirthDateVisibility.kt */
/* loaded from: classes18.dex */
public final class BirthDateVisibility {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ BirthDateVisibility[] $VALUES;
    public static final a Companion;
    public static final BirthDateVisibility HIDE;
    public static final BirthDateVisibility HIDE_YEAR;
    public static final BirthDateVisibility SHOW;
    private final int code;

    /* compiled from: BirthDateVisibility.kt */
    public static final class a {
    }

    static {
        BirthDateVisibility birthDateVisibility = new BirthDateVisibility("HIDE", 0, 0);
        HIDE = birthDateVisibility;
        BirthDateVisibility birthDateVisibility2 = new BirthDateVisibility("SHOW", 1, 1);
        SHOW = birthDateVisibility2;
        BirthDateVisibility birthDateVisibility3 = new BirthDateVisibility("HIDE_YEAR", 2, 2);
        HIDE_YEAR = birthDateVisibility3;
        BirthDateVisibility[] birthDateVisibilityArr = {birthDateVisibility, birthDateVisibility2, birthDateVisibility3};
        $VALUES = birthDateVisibilityArr;
        $ENTRIES = new asp(birthDateVisibilityArr);
        Companion = new a();
    }

    public BirthDateVisibility(String str, int i, int i2) {
        this.code = i2;
    }

    public static BirthDateVisibility valueOf(String str) {
        return (BirthDateVisibility) Enum.valueOf(BirthDateVisibility.class, str);
    }

    public static BirthDateVisibility[] values() {
        return (BirthDateVisibility[]) $VALUES.clone();
    }

    public final int h() {
        return this.code;
    }
}
