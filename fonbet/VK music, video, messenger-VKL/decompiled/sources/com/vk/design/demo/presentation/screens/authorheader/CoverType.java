package com.vk.design.demo.presentation.screens.authorheader;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AuthorHeaderState.kt */
/* loaded from: classes18.dex */
public final class CoverType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CoverType[] $VALUES;
    public static final CoverType Empty;
    public static final CoverType LiveCover;

    static {
        CoverType coverType = new CoverType("Empty", 0);
        Empty = coverType;
        CoverType coverType2 = new CoverType("LiveCover", 1);
        LiveCover = coverType2;
        CoverType[] coverTypeArr = {coverType, coverType2};
        $VALUES = coverTypeArr;
        $ENTRIES = new asp(coverTypeArr);
    }

    public CoverType() {
        throw null;
    }

    public static CoverType valueOf(String str) {
        return (CoverType) Enum.valueOf(CoverType.class, str);
    }

    public static CoverType[] values() {
        return (CoverType[]) $VALUES.clone();
    }
}
