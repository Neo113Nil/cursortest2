package com.vk.voip.media.mute.model;

import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VoipMediaMuteOption.kt */
/* loaded from: classes7.dex */
public final class VoipMediaMuteOption {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VoipMediaMuteOption[] $VALUES;
    public static final VoipMediaMuteOption CAMERA;
    public static final VoipMediaMuteOption MICROPHONE;
    public static final VoipMediaMuteOption MOVIE_SHARING;
    public static final VoipMediaMuteOption SCREEN_SHARING;

    static {
        VoipMediaMuteOption voipMediaMuteOption = new VoipMediaMuteOption("CAMERA", 0);
        CAMERA = voipMediaMuteOption;
        VoipMediaMuteOption voipMediaMuteOption2 = new VoipMediaMuteOption("MICROPHONE", 1);
        MICROPHONE = voipMediaMuteOption2;
        VoipMediaMuteOption voipMediaMuteOption3 = new VoipMediaMuteOption(SignalingProtocol.MEDIA_OPTION_SCREEN_SHARING, 2);
        SCREEN_SHARING = voipMediaMuteOption3;
        VoipMediaMuteOption voipMediaMuteOption4 = new VoipMediaMuteOption(SignalingProtocol.MEDIA_OPTION_MOVIE_SHARING, 3);
        MOVIE_SHARING = voipMediaMuteOption4;
        VoipMediaMuteOption[] voipMediaMuteOptionArr = {voipMediaMuteOption, voipMediaMuteOption2, voipMediaMuteOption3, voipMediaMuteOption4};
        $VALUES = voipMediaMuteOptionArr;
        $ENTRIES = new asp(voipMediaMuteOptionArr);
    }

    public VoipMediaMuteOption() {
        throw null;
    }

    public static VoipMediaMuteOption valueOf(String str) {
        return (VoipMediaMuteOption) Enum.valueOf(VoipMediaMuteOption.class, str);
    }

    public static VoipMediaMuteOption[] values() {
        return (VoipMediaMuteOption[]) $VALUES.clone();
    }
}
