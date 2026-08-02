package com.vk.newsfeed.common.recycler.holders.videos.clips.retention;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ClipsRetentionBlockHolder.kt */
/* loaded from: classes4.dex */
public final class RetentionType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ RetentionType[] $VALUES;
    public static final RetentionType OZON;
    public static final RetentionType RETENTION;
    public static final RetentionType SHOPS;

    static {
        RetentionType retentionType = new RetentionType("OZON", 0);
        OZON = retentionType;
        RetentionType retentionType2 = new RetentionType("SHOPS", 1);
        SHOPS = retentionType2;
        RetentionType retentionType3 = new RetentionType("RETENTION", 2);
        RETENTION = retentionType3;
        RetentionType[] retentionTypeArr = {retentionType, retentionType2, retentionType3};
        $VALUES = retentionTypeArr;
        $ENTRIES = new asp(retentionTypeArr);
    }

    public RetentionType() {
        throw null;
    }

    public static RetentionType valueOf(String str) {
        return (RetentionType) Enum.valueOf(RetentionType.class, str);
    }

    public static RetentionType[] values() {
        return (RetentionType[]) $VALUES.clone();
    }
}
