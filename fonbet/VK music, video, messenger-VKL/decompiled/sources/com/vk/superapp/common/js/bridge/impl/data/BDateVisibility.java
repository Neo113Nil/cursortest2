package com.vk.superapp.common.js.bridge.impl.data;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BDateVisibility.kt */
/* loaded from: classes6.dex */
public final class BDateVisibility {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ BDateVisibility[] $VALUES;
    public static final a Companion;
    public static final BDateVisibility HIDE;
    public static final BDateVisibility HIDE_YEAR;
    public static final BDateVisibility SHOW;
    private final int code;

    /* compiled from: BDateVisibility.kt */
    public static final class a {
    }

    static {
        BDateVisibility bDateVisibility = new BDateVisibility("HIDE", 0, 0);
        HIDE = bDateVisibility;
        BDateVisibility bDateVisibility2 = new BDateVisibility("SHOW", 1, 1);
        SHOW = bDateVisibility2;
        BDateVisibility bDateVisibility3 = new BDateVisibility("HIDE_YEAR", 2, 2);
        HIDE_YEAR = bDateVisibility3;
        BDateVisibility[] bDateVisibilityArr = {bDateVisibility, bDateVisibility2, bDateVisibility3};
        $VALUES = bDateVisibilityArr;
        $ENTRIES = new asp(bDateVisibilityArr);
        Companion = new a();
    }

    public BDateVisibility(String str, int i, int i2) {
        this.code = i2;
    }

    public static BDateVisibility valueOf(String str) {
        return (BDateVisibility) Enum.valueOf(BDateVisibility.class, str);
    }

    public static BDateVisibility[] values() {
        return (BDateVisibility[]) $VALUES.clone();
    }
}
