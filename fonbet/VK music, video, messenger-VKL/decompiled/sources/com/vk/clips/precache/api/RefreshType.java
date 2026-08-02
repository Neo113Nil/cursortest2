package com.vk.clips.precache.api;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: RefreshType.kt */
/* loaded from: classes16.dex */
public final class RefreshType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ RefreshType[] $VALUES;
    public static final RefreshType NotRefresh;
    public static final RefreshType RefreshOnEmpty;
    public static final RefreshType RefreshOnInit;

    static {
        RefreshType refreshType = new RefreshType("NotRefresh", 0);
        NotRefresh = refreshType;
        RefreshType refreshType2 = new RefreshType("RefreshOnInit", 1);
        RefreshOnInit = refreshType2;
        RefreshType refreshType3 = new RefreshType("RefreshOnEmpty", 2);
        RefreshOnEmpty = refreshType3;
        RefreshType[] refreshTypeArr = {refreshType, refreshType2, refreshType3};
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
