package com.vk.stat.scheme;

import com.unity3d.ads.BuildConfig;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CommonAudioStat.kt */
/* loaded from: classes5.dex */
public final class CommonAudioStat$TypeAudioSourceEnum {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CommonAudioStat$TypeAudioSourceEnum[] $VALUES;

    @pmi0(BuildConfig.FLAVOR)
    public static final CommonAudioStat$TypeAudioSourceEnum DEFAULT;

    @pmi0("menu")
    public static final CommonAudioStat$TypeAudioSourceEnum MENU;

    @pmi0("popup_cta_enable_push")
    public static final CommonAudioStat$TypeAudioSourceEnum POPUP_CTA_ENABLE_PUSH;

    @pmi0("radiostations_curtain")
    public static final CommonAudioStat$TypeAudioSourceEnum RADIOSTATIONS_CURTAIN;

    @pmi0("radio_player")
    public static final CommonAudioStat$TypeAudioSourceEnum RADIO_PLAYER;

    @pmi0("radio_player_menu")
    public static final CommonAudioStat$TypeAudioSourceEnum RADIO_PLAYER_MENU;

    @pmi0("track_menu")
    public static final CommonAudioStat$TypeAudioSourceEnum TRACK_MENU;

    static {
        CommonAudioStat$TypeAudioSourceEnum commonAudioStat$TypeAudioSourceEnum = new CommonAudioStat$TypeAudioSourceEnum("DEFAULT", 0);
        DEFAULT = commonAudioStat$TypeAudioSourceEnum;
        CommonAudioStat$TypeAudioSourceEnum commonAudioStat$TypeAudioSourceEnum2 = new CommonAudioStat$TypeAudioSourceEnum("RADIO_PLAYER_MENU", 1);
        RADIO_PLAYER_MENU = commonAudioStat$TypeAudioSourceEnum2;
        CommonAudioStat$TypeAudioSourceEnum commonAudioStat$TypeAudioSourceEnum3 = new CommonAudioStat$TypeAudioSourceEnum("RADIO_PLAYER", 2);
        RADIO_PLAYER = commonAudioStat$TypeAudioSourceEnum3;
        CommonAudioStat$TypeAudioSourceEnum commonAudioStat$TypeAudioSourceEnum4 = new CommonAudioStat$TypeAudioSourceEnum("MENU", 3);
        MENU = commonAudioStat$TypeAudioSourceEnum4;
        CommonAudioStat$TypeAudioSourceEnum commonAudioStat$TypeAudioSourceEnum5 = new CommonAudioStat$TypeAudioSourceEnum("RADIOSTATIONS_CURTAIN", 4);
        RADIOSTATIONS_CURTAIN = commonAudioStat$TypeAudioSourceEnum5;
        CommonAudioStat$TypeAudioSourceEnum commonAudioStat$TypeAudioSourceEnum6 = new CommonAudioStat$TypeAudioSourceEnum("TRACK_MENU", 5);
        TRACK_MENU = commonAudioStat$TypeAudioSourceEnum6;
        CommonAudioStat$TypeAudioSourceEnum commonAudioStat$TypeAudioSourceEnum7 = new CommonAudioStat$TypeAudioSourceEnum("POPUP_CTA_ENABLE_PUSH", 6);
        POPUP_CTA_ENABLE_PUSH = commonAudioStat$TypeAudioSourceEnum7;
        CommonAudioStat$TypeAudioSourceEnum[] commonAudioStat$TypeAudioSourceEnumArr = {commonAudioStat$TypeAudioSourceEnum, commonAudioStat$TypeAudioSourceEnum2, commonAudioStat$TypeAudioSourceEnum3, commonAudioStat$TypeAudioSourceEnum4, commonAudioStat$TypeAudioSourceEnum5, commonAudioStat$TypeAudioSourceEnum6, commonAudioStat$TypeAudioSourceEnum7};
        $VALUES = commonAudioStat$TypeAudioSourceEnumArr;
        $ENTRIES = new asp(commonAudioStat$TypeAudioSourceEnumArr);
    }

    private CommonAudioStat$TypeAudioSourceEnum(String str, int i) {
    }

    public static zrp<CommonAudioStat$TypeAudioSourceEnum> h() {
        return $ENTRIES;
    }

    public static CommonAudioStat$TypeAudioSourceEnum valueOf(String str) {
        return (CommonAudioStat$TypeAudioSourceEnum) Enum.valueOf(CommonAudioStat$TypeAudioSourceEnum.class, str);
    }

    public static CommonAudioStat$TypeAudioSourceEnum[] values() {
        return (CommonAudioStat$TypeAudioSourceEnum[]) $VALUES.clone();
    }
}
