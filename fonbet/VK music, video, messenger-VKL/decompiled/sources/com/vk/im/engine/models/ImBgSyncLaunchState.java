package com.vk.im.engine.models;

import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ImBgSyncLaunchState.kt */
/* loaded from: classes.dex */
public final class ImBgSyncLaunchState {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ImBgSyncLaunchState[] $VALUES;
    public static final ImBgSyncLaunchState ACTIVE;
    public static final ImBgSyncLaunchState IDLE;
    public static final ImBgSyncLaunchState LAUNCHING;

    static {
        ImBgSyncLaunchState imBgSyncLaunchState = new ImBgSyncLaunchState("IDLE", 0);
        IDLE = imBgSyncLaunchState;
        ImBgSyncLaunchState imBgSyncLaunchState2 = new ImBgSyncLaunchState("LAUNCHING", 1);
        LAUNCHING = imBgSyncLaunchState2;
        ImBgSyncLaunchState imBgSyncLaunchState3 = new ImBgSyncLaunchState(SignalingProtocol.STATE_ACTIVE, 2);
        ACTIVE = imBgSyncLaunchState3;
        ImBgSyncLaunchState[] imBgSyncLaunchStateArr = {imBgSyncLaunchState, imBgSyncLaunchState2, imBgSyncLaunchState3};
        $VALUES = imBgSyncLaunchStateArr;
        $ENTRIES = new asp(imBgSyncLaunchStateArr);
    }

    public ImBgSyncLaunchState() {
        throw null;
    }

    public static ImBgSyncLaunchState valueOf(String str) {
        return (ImBgSyncLaunchState) Enum.valueOf(ImBgSyncLaunchState.class, str);
    }

    public static ImBgSyncLaunchState[] values() {
        return (ImBgSyncLaunchState[]) $VALUES.clone();
    }
}
