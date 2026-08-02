package com.vk.voip.media.mute.model;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VoipMediaMuteOptionState.kt */
/* loaded from: classes7.dex */
public final class VoipMediaMuteOptionState {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VoipMediaMuteOptionState[] $VALUES;
    public static final VoipMediaMuteOptionState MUTED_PERMANENT;
    public static final VoipMediaMuteOptionState MUTED_PERMANENT_BUT_UNMUTED_ONCE;
    public static final VoipMediaMuteOptionState UNMUTED;
    public static final VoipMediaMuteOptionState UNMUTED_BUT_MUTED_ONCE;

    static {
        VoipMediaMuteOptionState voipMediaMuteOptionState = new VoipMediaMuteOptionState("MUTED_PERMANENT", 0);
        MUTED_PERMANENT = voipMediaMuteOptionState;
        VoipMediaMuteOptionState voipMediaMuteOptionState2 = new VoipMediaMuteOptionState("UNMUTED_BUT_MUTED_ONCE", 1);
        UNMUTED_BUT_MUTED_ONCE = voipMediaMuteOptionState2;
        VoipMediaMuteOptionState voipMediaMuteOptionState3 = new VoipMediaMuteOptionState("MUTED_PERMANENT_BUT_UNMUTED_ONCE", 2);
        MUTED_PERMANENT_BUT_UNMUTED_ONCE = voipMediaMuteOptionState3;
        VoipMediaMuteOptionState voipMediaMuteOptionState4 = new VoipMediaMuteOptionState("UNMUTED", 3);
        UNMUTED = voipMediaMuteOptionState4;
        VoipMediaMuteOptionState[] voipMediaMuteOptionStateArr = {voipMediaMuteOptionState, voipMediaMuteOptionState2, voipMediaMuteOptionState3, voipMediaMuteOptionState4};
        $VALUES = voipMediaMuteOptionStateArr;
        $ENTRIES = new asp(voipMediaMuteOptionStateArr);
    }

    public VoipMediaMuteOptionState() {
        throw null;
    }

    public static VoipMediaMuteOptionState valueOf(String str) {
        return (VoipMediaMuteOptionState) Enum.valueOf(VoipMediaMuteOptionState.class, str);
    }

    public static VoipMediaMuteOptionState[] values() {
        return (VoipMediaMuteOptionState[]) $VALUES.clone();
    }
}
