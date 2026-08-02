package com.vk.libvideo.models.history;

import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ForceLogReason.kt */
/* loaded from: classes3.dex */
public final class ForceLogReason {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ForceLogReason[] $VALUES;
    public static final ForceLogReason FASTSEEK;
    public static final ForceLogReason FULLSCREEN;
    public static final ForceLogReason SEEK;
    public static final ForceLogReason TAP;
    public static final ForceLogReason UNMUTE;

    static {
        ForceLogReason forceLogReason = new ForceLogReason(SignalingProtocol.MEDIA_OPTION_STATE_UNMUTE, 0);
        UNMUTE = forceLogReason;
        ForceLogReason forceLogReason2 = new ForceLogReason("SEEK", 1);
        SEEK = forceLogReason2;
        ForceLogReason forceLogReason3 = new ForceLogReason("FULLSCREEN", 2);
        FULLSCREEN = forceLogReason3;
        ForceLogReason forceLogReason4 = new ForceLogReason("TAP", 3);
        TAP = forceLogReason4;
        ForceLogReason forceLogReason5 = new ForceLogReason("FASTSEEK", 4);
        FASTSEEK = forceLogReason5;
        ForceLogReason[] forceLogReasonArr = {forceLogReason, forceLogReason2, forceLogReason3, forceLogReason4, forceLogReason5};
        $VALUES = forceLogReasonArr;
        $ENTRIES = new asp(forceLogReasonArr);
    }

    public ForceLogReason() {
        throw null;
    }

    public static ForceLogReason valueOf(String str) {
        return (ForceLogReason) Enum.valueOf(ForceLogReason.class, str);
    }

    public static ForceLogReason[] values() {
        return (ForceLogReason[]) $VALUES.clone();
    }
}
