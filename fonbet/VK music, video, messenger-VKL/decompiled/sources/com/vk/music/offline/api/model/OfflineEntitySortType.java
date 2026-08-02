package com.vk.music.offline.api.model;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OfflineEntitySortType.kt */
/* loaded from: classes3.dex */
public final class OfflineEntitySortType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ OfflineEntitySortType[] $VALUES;
    public static final OfflineEntitySortType ByTitle;
    public static final OfflineEntitySortType NewerFirst;
    public static final OfflineEntitySortType OlderFirst;

    static {
        OfflineEntitySortType offlineEntitySortType = new OfflineEntitySortType("NewerFirst", 0);
        NewerFirst = offlineEntitySortType;
        OfflineEntitySortType offlineEntitySortType2 = new OfflineEntitySortType("OlderFirst", 1);
        OlderFirst = offlineEntitySortType2;
        OfflineEntitySortType offlineEntitySortType3 = new OfflineEntitySortType("ByTitle", 2);
        ByTitle = offlineEntitySortType3;
        OfflineEntitySortType[] offlineEntitySortTypeArr = {offlineEntitySortType, offlineEntitySortType2, offlineEntitySortType3};
        $VALUES = offlineEntitySortTypeArr;
        $ENTRIES = new asp(offlineEntitySortTypeArr);
    }

    public OfflineEntitySortType() {
        throw null;
    }

    public static OfflineEntitySortType valueOf(String str) {
        return (OfflineEntitySortType) Enum.valueOf(OfflineEntitySortType.class, str);
    }

    public static OfflineEntitySortType[] values() {
        return (OfflineEntitySortType[]) $VALUES.clone();
    }
}
