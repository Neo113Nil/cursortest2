package com.vk.voip.ui;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VoipViewModelState.kt */
/* loaded from: classes11.dex */
public final class VoipViewModelState {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VoipViewModelState[] $VALUES;
    public static final VoipViewModelState AboutToCallPeer;
    public static final VoipViewModelState CallingPeer;
    public static final VoipViewModelState Connecting;
    public static final VoipViewModelState DeclinedTransient;
    public static final VoipViewModelState FinishedTransient;
    public static final VoipViewModelState Idle;
    public static final VoipViewModelState InCall;
    public static final VoipViewModelState ReceivingCallFromPeer;
    public static final VoipViewModelState RecordingAudioMessage;
    public static final VoipViewModelState WaitingRoom;

    static {
        VoipViewModelState voipViewModelState = new VoipViewModelState("Idle", 0);
        Idle = voipViewModelState;
        VoipViewModelState voipViewModelState2 = new VoipViewModelState("AboutToCallPeer", 1);
        AboutToCallPeer = voipViewModelState2;
        VoipViewModelState voipViewModelState3 = new VoipViewModelState("CallingPeer", 2);
        CallingPeer = voipViewModelState3;
        VoipViewModelState voipViewModelState4 = new VoipViewModelState("WaitingRoom", 3);
        WaitingRoom = voipViewModelState4;
        VoipViewModelState voipViewModelState5 = new VoipViewModelState("RecordingAudioMessage", 4);
        RecordingAudioMessage = voipViewModelState5;
        VoipViewModelState voipViewModelState6 = new VoipViewModelState("ReceivingCallFromPeer", 5);
        ReceivingCallFromPeer = voipViewModelState6;
        VoipViewModelState voipViewModelState7 = new VoipViewModelState("Connecting", 6);
        Connecting = voipViewModelState7;
        VoipViewModelState voipViewModelState8 = new VoipViewModelState("InCall", 7);
        InCall = voipViewModelState8;
        VoipViewModelState voipViewModelState9 = new VoipViewModelState("FinishedTransient", 8);
        FinishedTransient = voipViewModelState9;
        VoipViewModelState voipViewModelState10 = new VoipViewModelState("DeclinedTransient", 9);
        DeclinedTransient = voipViewModelState10;
        VoipViewModelState[] voipViewModelStateArr = {voipViewModelState, voipViewModelState2, voipViewModelState3, voipViewModelState4, voipViewModelState5, voipViewModelState6, voipViewModelState7, voipViewModelState8, voipViewModelState9, voipViewModelState10};
        $VALUES = voipViewModelStateArr;
        $ENTRIES = new asp(voipViewModelStateArr);
    }

    public VoipViewModelState() {
        throw null;
    }

    public static VoipViewModelState valueOf(String str) {
        return (VoipViewModelState) Enum.valueOf(VoipViewModelState.class, str);
    }

    public static VoipViewModelState[] values() {
        return (VoipViewModelState[]) $VALUES.clone();
    }

    public final boolean h() {
        return this == AboutToCallPeer || this == CallingPeer || this == ReceivingCallFromPeer || this == Connecting || this == InCall || this == WaitingRoom;
    }

    public final boolean i() {
        return (this == Idle || this == FinishedTransient || this == DeclinedTransient) ? false : true;
    }
}
