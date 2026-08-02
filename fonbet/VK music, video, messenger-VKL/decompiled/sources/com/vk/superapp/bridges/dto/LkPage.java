package com.vk.superapp.bridges.dto;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LkPage.kt */
/* loaded from: classes6.dex */
public final class LkPage {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ LkPage[] $VALUES;
    public static final LkPage DEFAULT;
    public static final LkPage RECOMMENDATIONS;
    private final String id;

    static {
        LkPage lkPage = new LkPage("DEFAULT", 0, "");
        DEFAULT = lkPage;
        LkPage lkPage2 = new LkPage("RECOMMENDATIONS", 1, "recommendation=1");
        RECOMMENDATIONS = lkPage2;
        LkPage[] lkPageArr = {lkPage, lkPage2};
        $VALUES = lkPageArr;
        $ENTRIES = new asp(lkPageArr);
    }

    public LkPage(String str, int i, String str2) {
        this.id = str2;
    }

    public static LkPage valueOf(String str) {
        return (LkPage) Enum.valueOf(LkPage.class, str);
    }

    public static LkPage[] values() {
        return (LkPage[]) $VALUES.clone();
    }
}
