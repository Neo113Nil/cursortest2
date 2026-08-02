package com.vk.stat.scheme;

import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CommonAudioStat.kt */
/* loaded from: classes5.dex */
public final class CommonAudioStat$TypeVibeSettingEnum {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CommonAudioStat$TypeVibeSettingEnum[] $VALUES;

    @pmi0(SignalingProtocol.KEY_ACTIVE)
    public static final CommonAudioStat$TypeVibeSettingEnum ACTIVE;

    @pmi0("calm")
    public static final CommonAudioStat$TypeVibeSettingEnum CALM;

    @pmi0("happy")
    public static final CommonAudioStat$TypeVibeSettingEnum HAPPY;

    @pmi0("love")
    public static final CommonAudioStat$TypeVibeSettingEnum LOVE;

    @pmi0("new_year")
    public static final CommonAudioStat$TypeVibeSettingEnum NEW_YEAR;

    @pmi0("sad")
    public static final CommonAudioStat$TypeVibeSettingEnum SAD;

    static {
        CommonAudioStat$TypeVibeSettingEnum commonAudioStat$TypeVibeSettingEnum = new CommonAudioStat$TypeVibeSettingEnum("LOVE", 0);
        LOVE = commonAudioStat$TypeVibeSettingEnum;
        CommonAudioStat$TypeVibeSettingEnum commonAudioStat$TypeVibeSettingEnum2 = new CommonAudioStat$TypeVibeSettingEnum("HAPPY", 1);
        HAPPY = commonAudioStat$TypeVibeSettingEnum2;
        CommonAudioStat$TypeVibeSettingEnum commonAudioStat$TypeVibeSettingEnum3 = new CommonAudioStat$TypeVibeSettingEnum("SAD", 2);
        SAD = commonAudioStat$TypeVibeSettingEnum3;
        CommonAudioStat$TypeVibeSettingEnum commonAudioStat$TypeVibeSettingEnum4 = new CommonAudioStat$TypeVibeSettingEnum(SignalingProtocol.STATE_ACTIVE, 3);
        ACTIVE = commonAudioStat$TypeVibeSettingEnum4;
        CommonAudioStat$TypeVibeSettingEnum commonAudioStat$TypeVibeSettingEnum5 = new CommonAudioStat$TypeVibeSettingEnum("CALM", 4);
        CALM = commonAudioStat$TypeVibeSettingEnum5;
        CommonAudioStat$TypeVibeSettingEnum commonAudioStat$TypeVibeSettingEnum6 = new CommonAudioStat$TypeVibeSettingEnum("NEW_YEAR", 5);
        NEW_YEAR = commonAudioStat$TypeVibeSettingEnum6;
        CommonAudioStat$TypeVibeSettingEnum[] commonAudioStat$TypeVibeSettingEnumArr = {commonAudioStat$TypeVibeSettingEnum, commonAudioStat$TypeVibeSettingEnum2, commonAudioStat$TypeVibeSettingEnum3, commonAudioStat$TypeVibeSettingEnum4, commonAudioStat$TypeVibeSettingEnum5, commonAudioStat$TypeVibeSettingEnum6};
        $VALUES = commonAudioStat$TypeVibeSettingEnumArr;
        $ENTRIES = new asp(commonAudioStat$TypeVibeSettingEnumArr);
    }

    private CommonAudioStat$TypeVibeSettingEnum(String str, int i) {
    }

    public static CommonAudioStat$TypeVibeSettingEnum valueOf(String str) {
        return (CommonAudioStat$TypeVibeSettingEnum) Enum.valueOf(CommonAudioStat$TypeVibeSettingEnum.class, str);
    }

    public static CommonAudioStat$TypeVibeSettingEnum[] values() {
        return (CommonAudioStat$TypeVibeSettingEnum[]) $VALUES.clone();
    }
}
