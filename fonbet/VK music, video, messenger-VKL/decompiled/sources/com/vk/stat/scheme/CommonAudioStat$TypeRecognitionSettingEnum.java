package com.vk.stat.scheme;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CommonAudioStat.kt */
/* loaded from: classes5.dex */
public final class CommonAudioStat$TypeRecognitionSettingEnum {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CommonAudioStat$TypeRecognitionSettingEnum[] $VALUES;

    @pmi0("fresh")
    public static final CommonAudioStat$TypeRecognitionSettingEnum FRESH;

    @pmi0("known")
    public static final CommonAudioStat$TypeRecognitionSettingEnum KNOWN;

    @pmi0("unknown")
    public static final CommonAudioStat$TypeRecognitionSettingEnum UNKNOWN;

    static {
        CommonAudioStat$TypeRecognitionSettingEnum commonAudioStat$TypeRecognitionSettingEnum = new CommonAudioStat$TypeRecognitionSettingEnum("KNOWN", 0);
        KNOWN = commonAudioStat$TypeRecognitionSettingEnum;
        CommonAudioStat$TypeRecognitionSettingEnum commonAudioStat$TypeRecognitionSettingEnum2 = new CommonAudioStat$TypeRecognitionSettingEnum(GrsBaseInfo.CountryCodeSource.UNKNOWN, 1);
        UNKNOWN = commonAudioStat$TypeRecognitionSettingEnum2;
        CommonAudioStat$TypeRecognitionSettingEnum commonAudioStat$TypeRecognitionSettingEnum3 = new CommonAudioStat$TypeRecognitionSettingEnum("FRESH", 2);
        FRESH = commonAudioStat$TypeRecognitionSettingEnum3;
        CommonAudioStat$TypeRecognitionSettingEnum[] commonAudioStat$TypeRecognitionSettingEnumArr = {commonAudioStat$TypeRecognitionSettingEnum, commonAudioStat$TypeRecognitionSettingEnum2, commonAudioStat$TypeRecognitionSettingEnum3};
        $VALUES = commonAudioStat$TypeRecognitionSettingEnumArr;
        $ENTRIES = new asp(commonAudioStat$TypeRecognitionSettingEnumArr);
    }

    private CommonAudioStat$TypeRecognitionSettingEnum(String str, int i) {
    }

    public static CommonAudioStat$TypeRecognitionSettingEnum valueOf(String str) {
        return (CommonAudioStat$TypeRecognitionSettingEnum) Enum.valueOf(CommonAudioStat$TypeRecognitionSettingEnum.class, str);
    }

    public static CommonAudioStat$TypeRecognitionSettingEnum[] values() {
        return (CommonAudioStat$TypeRecognitionSettingEnum[]) $VALUES.clone();
    }
}
