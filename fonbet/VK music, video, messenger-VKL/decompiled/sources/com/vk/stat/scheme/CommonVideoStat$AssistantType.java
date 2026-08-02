package com.vk.stat.scheme;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CommonVideoStat.kt */
/* loaded from: classes5.dex */
public final class CommonVideoStat$AssistantType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CommonVideoStat$AssistantType[] $VALUES;

    @pmi0("common")
    public static final CommonVideoStat$AssistantType COMMON;

    @pmi0("music")
    public static final CommonVideoStat$AssistantType MUSIC;

    static {
        CommonVideoStat$AssistantType commonVideoStat$AssistantType = new CommonVideoStat$AssistantType("COMMON", 0);
        COMMON = commonVideoStat$AssistantType;
        CommonVideoStat$AssistantType commonVideoStat$AssistantType2 = new CommonVideoStat$AssistantType("MUSIC", 1);
        MUSIC = commonVideoStat$AssistantType2;
        CommonVideoStat$AssistantType[] commonVideoStat$AssistantTypeArr = {commonVideoStat$AssistantType, commonVideoStat$AssistantType2};
        $VALUES = commonVideoStat$AssistantTypeArr;
        $ENTRIES = new asp(commonVideoStat$AssistantTypeArr);
    }

    private CommonVideoStat$AssistantType(String str, int i) {
    }

    public static zrp<CommonVideoStat$AssistantType> h() {
        return $ENTRIES;
    }

    public static CommonVideoStat$AssistantType valueOf(String str) {
        return (CommonVideoStat$AssistantType) Enum.valueOf(CommonVideoStat$AssistantType.class, str);
    }

    public static CommonVideoStat$AssistantType[] values() {
        return (CommonVideoStat$AssistantType[]) $VALUES.clone();
    }
}
