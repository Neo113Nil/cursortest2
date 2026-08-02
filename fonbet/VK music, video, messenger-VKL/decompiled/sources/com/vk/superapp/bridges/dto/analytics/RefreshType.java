package com.vk.superapp.bridges.dto.analytics;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: RefreshType.kt */
/* loaded from: classes6.dex */
public final class RefreshType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ RefreshType[] $VALUES;
    public static final RefreshType PREVIEW;
    public static final RefreshType REFRESH;

    static {
        RefreshType refreshType = new RefreshType("PREVIEW", 0);
        PREVIEW = refreshType;
        RefreshType refreshType2 = new RefreshType("REFRESH", 1);
        REFRESH = refreshType2;
        RefreshType[] refreshTypeArr = {refreshType, refreshType2};
        $VALUES = refreshTypeArr;
        $ENTRIES = new asp(refreshTypeArr);
    }

    public RefreshType() {
        throw null;
    }

    public static RefreshType valueOf(String str) {
        return (RefreshType) Enum.valueOf(RefreshType.class, str);
    }

    public static RefreshType[] values() {
        return (RefreshType[]) $VALUES.clone();
    }
}
