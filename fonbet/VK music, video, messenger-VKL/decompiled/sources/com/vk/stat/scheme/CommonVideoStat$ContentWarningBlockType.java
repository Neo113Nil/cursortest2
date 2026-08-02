package com.vk.stat.scheme;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CommonVideoStat.kt */
/* loaded from: classes5.dex */
public final class CommonVideoStat$ContentWarningBlockType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CommonVideoStat$ContentWarningBlockType[] $VALUES;

    @pmi0("controversial")
    public static final CommonVideoStat$ContentWarningBlockType CONTROVERSIAL;

    @pmi0("false_info")
    public static final CommonVideoStat$ContentWarningBlockType FALSE_INFO;

    static {
        CommonVideoStat$ContentWarningBlockType commonVideoStat$ContentWarningBlockType = new CommonVideoStat$ContentWarningBlockType("CONTROVERSIAL", 0);
        CONTROVERSIAL = commonVideoStat$ContentWarningBlockType;
        CommonVideoStat$ContentWarningBlockType commonVideoStat$ContentWarningBlockType2 = new CommonVideoStat$ContentWarningBlockType("FALSE_INFO", 1);
        FALSE_INFO = commonVideoStat$ContentWarningBlockType2;
        CommonVideoStat$ContentWarningBlockType[] commonVideoStat$ContentWarningBlockTypeArr = {commonVideoStat$ContentWarningBlockType, commonVideoStat$ContentWarningBlockType2};
        $VALUES = commonVideoStat$ContentWarningBlockTypeArr;
        $ENTRIES = new asp(commonVideoStat$ContentWarningBlockTypeArr);
    }

    private CommonVideoStat$ContentWarningBlockType(String str, int i) {
    }

    public static CommonVideoStat$ContentWarningBlockType valueOf(String str) {
        return (CommonVideoStat$ContentWarningBlockType) Enum.valueOf(CommonVideoStat$ContentWarningBlockType.class, str);
    }

    public static CommonVideoStat$ContentWarningBlockType[] values() {
        return (CommonVideoStat$ContentWarningBlockType[]) $VALUES.clone();
    }
}
