package com.vk.stat.scheme;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CommonAudioStat.kt */
/* loaded from: classes11.dex */
public final class CommonAudioStat$LaunchOriginItem {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CommonAudioStat$LaunchOriginItem[] $VALUES;

    @pmi0("kids_editorial_section")
    public static final CommonAudioStat$LaunchOriginItem KIDS_EDITORIAL_SECTION;

    @pmi0("kids_section")
    public static final CommonAudioStat$LaunchOriginItem KIDS_SECTION;

    static {
        CommonAudioStat$LaunchOriginItem commonAudioStat$LaunchOriginItem = new CommonAudioStat$LaunchOriginItem("KIDS_SECTION", 0);
        KIDS_SECTION = commonAudioStat$LaunchOriginItem;
        CommonAudioStat$LaunchOriginItem commonAudioStat$LaunchOriginItem2 = new CommonAudioStat$LaunchOriginItem("KIDS_EDITORIAL_SECTION", 1);
        KIDS_EDITORIAL_SECTION = commonAudioStat$LaunchOriginItem2;
        CommonAudioStat$LaunchOriginItem[] commonAudioStat$LaunchOriginItemArr = {commonAudioStat$LaunchOriginItem, commonAudioStat$LaunchOriginItem2};
        $VALUES = commonAudioStat$LaunchOriginItemArr;
        $ENTRIES = new asp(commonAudioStat$LaunchOriginItemArr);
    }

    private CommonAudioStat$LaunchOriginItem(String str, int i) {
    }

    public static CommonAudioStat$LaunchOriginItem valueOf(String str) {
        return (CommonAudioStat$LaunchOriginItem) Enum.valueOf(CommonAudioStat$LaunchOriginItem.class, str);
    }

    public static CommonAudioStat$LaunchOriginItem[] values() {
        return (CommonAudioStat$LaunchOriginItem[]) $VALUES.clone();
    }
}
