package com.vk.stat.scheme;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CommonVideoStat.kt */
/* loaded from: classes5.dex */
public final class CommonVideoStat$AgeMarkNotificationBlockType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CommonVideoStat$AgeMarkNotificationBlockType[] $VALUES;

    @pmi0("adult")
    public static final CommonVideoStat$AgeMarkNotificationBlockType ADULT;

    @pmi0("teen")
    public static final CommonVideoStat$AgeMarkNotificationBlockType TEEN;

    static {
        CommonVideoStat$AgeMarkNotificationBlockType commonVideoStat$AgeMarkNotificationBlockType = new CommonVideoStat$AgeMarkNotificationBlockType("ADULT", 0);
        ADULT = commonVideoStat$AgeMarkNotificationBlockType;
        CommonVideoStat$AgeMarkNotificationBlockType commonVideoStat$AgeMarkNotificationBlockType2 = new CommonVideoStat$AgeMarkNotificationBlockType("TEEN", 1);
        TEEN = commonVideoStat$AgeMarkNotificationBlockType2;
        CommonVideoStat$AgeMarkNotificationBlockType[] commonVideoStat$AgeMarkNotificationBlockTypeArr = {commonVideoStat$AgeMarkNotificationBlockType, commonVideoStat$AgeMarkNotificationBlockType2};
        $VALUES = commonVideoStat$AgeMarkNotificationBlockTypeArr;
        $ENTRIES = new asp(commonVideoStat$AgeMarkNotificationBlockTypeArr);
    }

    private CommonVideoStat$AgeMarkNotificationBlockType(String str, int i) {
    }

    public static CommonVideoStat$AgeMarkNotificationBlockType valueOf(String str) {
        return (CommonVideoStat$AgeMarkNotificationBlockType) Enum.valueOf(CommonVideoStat$AgeMarkNotificationBlockType.class, str);
    }

    public static CommonVideoStat$AgeMarkNotificationBlockType[] values() {
        return (CommonVideoStat$AgeMarkNotificationBlockType[]) $VALUES.clone();
    }
}
