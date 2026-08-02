package com.vk.stat.scheme;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CommonAudioStat.kt */
/* loaded from: classes11.dex */
public final class CommonAudioStat$AudioListeningPlayEventSubtypes {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CommonAudioStat$AudioListeningPlayEventSubtypes[] $VALUES;

    @pmi0("autoplay")
    public static final CommonAudioStat$AudioListeningPlayEventSubtypes AUTOPLAY;

    @pmi0("autoplay_error")
    public static final CommonAudioStat$AudioListeningPlayEventSubtypes AUTOPLAY_ERROR;

    @pmi0("fastplay")
    public static final CommonAudioStat$AudioListeningPlayEventSubtypes FASTPLAY;

    @pmi0("fastplay_audio_btn")
    public static final CommonAudioStat$AudioListeningPlayEventSubtypes FASTPLAY_AUDIO_BTN;

    @pmi0("fastplay_list_btn")
    public static final CommonAudioStat$AudioListeningPlayEventSubtypes FASTPLAY_LIST_BTN;

    @pmi0("heartbeat")
    public static final CommonAudioStat$AudioListeningPlayEventSubtypes HEARTBEAT;

    @pmi0("mix_and_play_btn")
    public static final CommonAudioStat$AudioListeningPlayEventSubtypes MIX_AND_PLAY_BTN;

    @pmi0("next_btn")
    public static final CommonAudioStat$AudioListeningPlayEventSubtypes NEXT_BTN;

    @pmi0("next_by_system")
    public static final CommonAudioStat$AudioListeningPlayEventSubtypes NEXT_BY_SYSTEM;

    @pmi0("next_double_tap")
    public static final CommonAudioStat$AudioListeningPlayEventSubtypes NEXT_DOUBLE_TAP;

    @pmi0("next_voice")
    public static final CommonAudioStat$AudioListeningPlayEventSubtypes NEXT_VOICE;

    @pmi0("paywall_pause")
    public static final CommonAudioStat$AudioListeningPlayEventSubtypes PAYWALL_PAUSE;

    @pmi0("play_btn")
    public static final CommonAudioStat$AudioListeningPlayEventSubtypes PLAY_BTN;

    @pmi0("prev_btn")
    public static final CommonAudioStat$AudioListeningPlayEventSubtypes PREV_BTN;

    @pmi0("prev_by_system")
    public static final CommonAudioStat$AudioListeningPlayEventSubtypes PREV_BY_SYSTEM;

    @pmi0("prev_double_tap")
    public static final CommonAudioStat$AudioListeningPlayEventSubtypes PREV_DOUBLE_TAP;

    @pmi0("prev_voice")
    public static final CommonAudioStat$AudioListeningPlayEventSubtypes PREV_VOICE;

    @pmi0("pull_slider_back")
    public static final CommonAudioStat$AudioListeningPlayEventSubtypes PULL_SLIDER_BACK;

    @pmi0("pull_slider_forward")
    public static final CommonAudioStat$AudioListeningPlayEventSubtypes PULL_SLIDER_FORWARD;

    @pmi0("repeat")
    public static final CommonAudioStat$AudioListeningPlayEventSubtypes REPEAT;

    @pmi0("seek_tap_back")
    public static final CommonAudioStat$AudioListeningPlayEventSubtypes SEEK_TAP_BACK;

    @pmi0("seek_tap_forward")
    public static final CommonAudioStat$AudioListeningPlayEventSubtypes SEEK_TAP_FORWARD;

    @pmi0("session_terminated_autostart")
    public static final CommonAudioStat$AudioListeningPlayEventSubtypes SESSION_TERMINATED_AUTOSTART;

    @pmi0("unhandled_on_client")
    public static final CommonAudioStat$AudioListeningPlayEventSubtypes UNHANDLED_ON_CLIENT;

    @pmi0("voice")
    public static final CommonAudioStat$AudioListeningPlayEventSubtypes VOICE;

    static {
        CommonAudioStat$AudioListeningPlayEventSubtypes commonAudioStat$AudioListeningPlayEventSubtypes = new CommonAudioStat$AudioListeningPlayEventSubtypes("PLAY_BTN", 0);
        PLAY_BTN = commonAudioStat$AudioListeningPlayEventSubtypes;
        CommonAudioStat$AudioListeningPlayEventSubtypes commonAudioStat$AudioListeningPlayEventSubtypes2 = new CommonAudioStat$AudioListeningPlayEventSubtypes("FASTPLAY", 1);
        FASTPLAY = commonAudioStat$AudioListeningPlayEventSubtypes2;
        CommonAudioStat$AudioListeningPlayEventSubtypes commonAudioStat$AudioListeningPlayEventSubtypes3 = new CommonAudioStat$AudioListeningPlayEventSubtypes("FASTPLAY_LIST_BTN", 2);
        FASTPLAY_LIST_BTN = commonAudioStat$AudioListeningPlayEventSubtypes3;
        CommonAudioStat$AudioListeningPlayEventSubtypes commonAudioStat$AudioListeningPlayEventSubtypes4 = new CommonAudioStat$AudioListeningPlayEventSubtypes("FASTPLAY_AUDIO_BTN", 3);
        FASTPLAY_AUDIO_BTN = commonAudioStat$AudioListeningPlayEventSubtypes4;
        CommonAudioStat$AudioListeningPlayEventSubtypes commonAudioStat$AudioListeningPlayEventSubtypes5 = new CommonAudioStat$AudioListeningPlayEventSubtypes("AUTOPLAY", 4);
        AUTOPLAY = commonAudioStat$AudioListeningPlayEventSubtypes5;
        CommonAudioStat$AudioListeningPlayEventSubtypes commonAudioStat$AudioListeningPlayEventSubtypes6 = new CommonAudioStat$AudioListeningPlayEventSubtypes("AUTOPLAY_ERROR", 5);
        AUTOPLAY_ERROR = commonAudioStat$AudioListeningPlayEventSubtypes6;
        CommonAudioStat$AudioListeningPlayEventSubtypes commonAudioStat$AudioListeningPlayEventSubtypes7 = new CommonAudioStat$AudioListeningPlayEventSubtypes("REPEAT", 6);
        REPEAT = commonAudioStat$AudioListeningPlayEventSubtypes7;
        CommonAudioStat$AudioListeningPlayEventSubtypes commonAudioStat$AudioListeningPlayEventSubtypes8 = new CommonAudioStat$AudioListeningPlayEventSubtypes("VOICE", 7);
        VOICE = commonAudioStat$AudioListeningPlayEventSubtypes8;
        CommonAudioStat$AudioListeningPlayEventSubtypes commonAudioStat$AudioListeningPlayEventSubtypes9 = new CommonAudioStat$AudioListeningPlayEventSubtypes("MIX_AND_PLAY_BTN", 8);
        MIX_AND_PLAY_BTN = commonAudioStat$AudioListeningPlayEventSubtypes9;
        CommonAudioStat$AudioListeningPlayEventSubtypes commonAudioStat$AudioListeningPlayEventSubtypes10 = new CommonAudioStat$AudioListeningPlayEventSubtypes("NEXT_VOICE", 9);
        NEXT_VOICE = commonAudioStat$AudioListeningPlayEventSubtypes10;
        CommonAudioStat$AudioListeningPlayEventSubtypes commonAudioStat$AudioListeningPlayEventSubtypes11 = new CommonAudioStat$AudioListeningPlayEventSubtypes("PREV_VOICE", 10);
        PREV_VOICE = commonAudioStat$AudioListeningPlayEventSubtypes11;
        CommonAudioStat$AudioListeningPlayEventSubtypes commonAudioStat$AudioListeningPlayEventSubtypes12 = new CommonAudioStat$AudioListeningPlayEventSubtypes("NEXT_BTN", 11);
        NEXT_BTN = commonAudioStat$AudioListeningPlayEventSubtypes12;
        CommonAudioStat$AudioListeningPlayEventSubtypes commonAudioStat$AudioListeningPlayEventSubtypes13 = new CommonAudioStat$AudioListeningPlayEventSubtypes("PREV_BTN", 12);
        PREV_BTN = commonAudioStat$AudioListeningPlayEventSubtypes13;
        CommonAudioStat$AudioListeningPlayEventSubtypes commonAudioStat$AudioListeningPlayEventSubtypes14 = new CommonAudioStat$AudioListeningPlayEventSubtypes("PULL_SLIDER_FORWARD", 13);
        PULL_SLIDER_FORWARD = commonAudioStat$AudioListeningPlayEventSubtypes14;
        CommonAudioStat$AudioListeningPlayEventSubtypes commonAudioStat$AudioListeningPlayEventSubtypes15 = new CommonAudioStat$AudioListeningPlayEventSubtypes("PULL_SLIDER_BACK", 14);
        PULL_SLIDER_BACK = commonAudioStat$AudioListeningPlayEventSubtypes15;
        CommonAudioStat$AudioListeningPlayEventSubtypes commonAudioStat$AudioListeningPlayEventSubtypes16 = new CommonAudioStat$AudioListeningPlayEventSubtypes("SEEK_TAP_FORWARD", 15);
        SEEK_TAP_FORWARD = commonAudioStat$AudioListeningPlayEventSubtypes16;
        CommonAudioStat$AudioListeningPlayEventSubtypes commonAudioStat$AudioListeningPlayEventSubtypes17 = new CommonAudioStat$AudioListeningPlayEventSubtypes("SEEK_TAP_BACK", 16);
        SEEK_TAP_BACK = commonAudioStat$AudioListeningPlayEventSubtypes17;
        CommonAudioStat$AudioListeningPlayEventSubtypes commonAudioStat$AudioListeningPlayEventSubtypes18 = new CommonAudioStat$AudioListeningPlayEventSubtypes("NEXT_DOUBLE_TAP", 17);
        NEXT_DOUBLE_TAP = commonAudioStat$AudioListeningPlayEventSubtypes18;
        CommonAudioStat$AudioListeningPlayEventSubtypes commonAudioStat$AudioListeningPlayEventSubtypes19 = new CommonAudioStat$AudioListeningPlayEventSubtypes("PREV_DOUBLE_TAP", 18);
        PREV_DOUBLE_TAP = commonAudioStat$AudioListeningPlayEventSubtypes19;
        CommonAudioStat$AudioListeningPlayEventSubtypes commonAudioStat$AudioListeningPlayEventSubtypes20 = new CommonAudioStat$AudioListeningPlayEventSubtypes("HEARTBEAT", 19);
        HEARTBEAT = commonAudioStat$AudioListeningPlayEventSubtypes20;
        CommonAudioStat$AudioListeningPlayEventSubtypes commonAudioStat$AudioListeningPlayEventSubtypes21 = new CommonAudioStat$AudioListeningPlayEventSubtypes("SESSION_TERMINATED_AUTOSTART", 20);
        SESSION_TERMINATED_AUTOSTART = commonAudioStat$AudioListeningPlayEventSubtypes21;
        CommonAudioStat$AudioListeningPlayEventSubtypes commonAudioStat$AudioListeningPlayEventSubtypes22 = new CommonAudioStat$AudioListeningPlayEventSubtypes("UNHANDLED_ON_CLIENT", 21);
        UNHANDLED_ON_CLIENT = commonAudioStat$AudioListeningPlayEventSubtypes22;
        CommonAudioStat$AudioListeningPlayEventSubtypes commonAudioStat$AudioListeningPlayEventSubtypes23 = new CommonAudioStat$AudioListeningPlayEventSubtypes("NEXT_BY_SYSTEM", 22);
        NEXT_BY_SYSTEM = commonAudioStat$AudioListeningPlayEventSubtypes23;
        CommonAudioStat$AudioListeningPlayEventSubtypes commonAudioStat$AudioListeningPlayEventSubtypes24 = new CommonAudioStat$AudioListeningPlayEventSubtypes("PREV_BY_SYSTEM", 23);
        PREV_BY_SYSTEM = commonAudioStat$AudioListeningPlayEventSubtypes24;
        CommonAudioStat$AudioListeningPlayEventSubtypes commonAudioStat$AudioListeningPlayEventSubtypes25 = new CommonAudioStat$AudioListeningPlayEventSubtypes("PAYWALL_PAUSE", 24);
        PAYWALL_PAUSE = commonAudioStat$AudioListeningPlayEventSubtypes25;
        CommonAudioStat$AudioListeningPlayEventSubtypes[] commonAudioStat$AudioListeningPlayEventSubtypesArr = {commonAudioStat$AudioListeningPlayEventSubtypes, commonAudioStat$AudioListeningPlayEventSubtypes2, commonAudioStat$AudioListeningPlayEventSubtypes3, commonAudioStat$AudioListeningPlayEventSubtypes4, commonAudioStat$AudioListeningPlayEventSubtypes5, commonAudioStat$AudioListeningPlayEventSubtypes6, commonAudioStat$AudioListeningPlayEventSubtypes7, commonAudioStat$AudioListeningPlayEventSubtypes8, commonAudioStat$AudioListeningPlayEventSubtypes9, commonAudioStat$AudioListeningPlayEventSubtypes10, commonAudioStat$AudioListeningPlayEventSubtypes11, commonAudioStat$AudioListeningPlayEventSubtypes12, commonAudioStat$AudioListeningPlayEventSubtypes13, commonAudioStat$AudioListeningPlayEventSubtypes14, commonAudioStat$AudioListeningPlayEventSubtypes15, commonAudioStat$AudioListeningPlayEventSubtypes16, commonAudioStat$AudioListeningPlayEventSubtypes17, commonAudioStat$AudioListeningPlayEventSubtypes18, commonAudioStat$AudioListeningPlayEventSubtypes19, commonAudioStat$AudioListeningPlayEventSubtypes20, commonAudioStat$AudioListeningPlayEventSubtypes21, commonAudioStat$AudioListeningPlayEventSubtypes22, commonAudioStat$AudioListeningPlayEventSubtypes23, commonAudioStat$AudioListeningPlayEventSubtypes24, commonAudioStat$AudioListeningPlayEventSubtypes25};
        $VALUES = commonAudioStat$AudioListeningPlayEventSubtypesArr;
        $ENTRIES = new asp(commonAudioStat$AudioListeningPlayEventSubtypesArr);
    }

    private CommonAudioStat$AudioListeningPlayEventSubtypes(String str, int i) {
    }

    public static CommonAudioStat$AudioListeningPlayEventSubtypes valueOf(String str) {
        return (CommonAudioStat$AudioListeningPlayEventSubtypes) Enum.valueOf(CommonAudioStat$AudioListeningPlayEventSubtypes.class, str);
    }

    public static CommonAudioStat$AudioListeningPlayEventSubtypes[] values() {
        return (CommonAudioStat$AudioListeningPlayEventSubtypes[]) $VALUES.clone();
    }
}
