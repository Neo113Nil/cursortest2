package com.vk.stat.scheme;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CommonAudioStat.kt */
/* loaded from: classes5.dex */
public final class CommonAudioStat$TypeLanguageSettingEnum {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CommonAudioStat$TypeLanguageSettingEnum[] $VALUES;

    @pmi0("instrumental")
    public static final CommonAudioStat$TypeLanguageSettingEnum INSTRUMENTAL;

    @pmi0("international")
    public static final CommonAudioStat$TypeLanguageSettingEnum INTERNATIONAL;

    @pmi0("ru")
    public static final CommonAudioStat$TypeLanguageSettingEnum RU;

    static {
        CommonAudioStat$TypeLanguageSettingEnum commonAudioStat$TypeLanguageSettingEnum = new CommonAudioStat$TypeLanguageSettingEnum("RU", 0);
        RU = commonAudioStat$TypeLanguageSettingEnum;
        CommonAudioStat$TypeLanguageSettingEnum commonAudioStat$TypeLanguageSettingEnum2 = new CommonAudioStat$TypeLanguageSettingEnum("INTERNATIONAL", 1);
        INTERNATIONAL = commonAudioStat$TypeLanguageSettingEnum2;
        CommonAudioStat$TypeLanguageSettingEnum commonAudioStat$TypeLanguageSettingEnum3 = new CommonAudioStat$TypeLanguageSettingEnum("INSTRUMENTAL", 2);
        INSTRUMENTAL = commonAudioStat$TypeLanguageSettingEnum3;
        CommonAudioStat$TypeLanguageSettingEnum[] commonAudioStat$TypeLanguageSettingEnumArr = {commonAudioStat$TypeLanguageSettingEnum, commonAudioStat$TypeLanguageSettingEnum2, commonAudioStat$TypeLanguageSettingEnum3};
        $VALUES = commonAudioStat$TypeLanguageSettingEnumArr;
        $ENTRIES = new asp(commonAudioStat$TypeLanguageSettingEnumArr);
    }

    private CommonAudioStat$TypeLanguageSettingEnum(String str, int i) {
    }

    public static CommonAudioStat$TypeLanguageSettingEnum valueOf(String str) {
        return (CommonAudioStat$TypeLanguageSettingEnum) Enum.valueOf(CommonAudioStat$TypeLanguageSettingEnum.class, str);
    }

    public static CommonAudioStat$TypeLanguageSettingEnum[] values() {
        return (CommonAudioStat$TypeLanguageSettingEnum[]) $VALUES.clone();
    }
}
