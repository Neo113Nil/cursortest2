package com.vk.voip.dto.broadcast;

import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VoipBroadcastStatus.kt */
/* loaded from: classes7.dex */
public final class VoipBroadcastStatus {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VoipBroadcastStatus[] $VALUES;
    public static final VoipBroadcastStatus FAILED;
    public static final VoipBroadcastStatus FINISHED;
    public static final VoipBroadcastStatus LIVE;
    public static final VoipBroadcastStatus STARTED;
    public static final VoipBroadcastStatus UPCOMING;
    public static final VoipBroadcastStatus WAITING;

    static {
        VoipBroadcastStatus voipBroadcastStatus = new VoipBroadcastStatus("UPCOMING", 0);
        UPCOMING = voipBroadcastStatus;
        VoipBroadcastStatus voipBroadcastStatus2 = new VoipBroadcastStatus("WAITING", 1);
        WAITING = voipBroadcastStatus2;
        VoipBroadcastStatus voipBroadcastStatus3 = new VoipBroadcastStatus(SignalingProtocol.STATE_STARTED, 2);
        STARTED = voipBroadcastStatus3;
        VoipBroadcastStatus voipBroadcastStatus4 = new VoipBroadcastStatus("LIVE", 3);
        LIVE = voipBroadcastStatus4;
        VoipBroadcastStatus voipBroadcastStatus5 = new VoipBroadcastStatus("FINISHED", 4);
        FINISHED = voipBroadcastStatus5;
        VoipBroadcastStatus voipBroadcastStatus6 = new VoipBroadcastStatus(SignalingProtocol.HUNGUP_REASON_FAILED, 5);
        FAILED = voipBroadcastStatus6;
        VoipBroadcastStatus[] voipBroadcastStatusArr = {voipBroadcastStatus, voipBroadcastStatus2, voipBroadcastStatus3, voipBroadcastStatus4, voipBroadcastStatus5, voipBroadcastStatus6};
        $VALUES = voipBroadcastStatusArr;
        $ENTRIES = new asp(voipBroadcastStatusArr);
    }

    public VoipBroadcastStatus() {
        throw null;
    }

    public static VoipBroadcastStatus valueOf(String str) {
        return (VoipBroadcastStatus) Enum.valueOf(VoipBroadcastStatus.class, str);
    }

    public static VoipBroadcastStatus[] values() {
        return (VoipBroadcastStatus[]) $VALUES.clone();
    }
}
