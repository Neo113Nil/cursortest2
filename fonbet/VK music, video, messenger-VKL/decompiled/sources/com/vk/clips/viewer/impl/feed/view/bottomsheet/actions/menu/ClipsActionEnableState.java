package com.vk.clips.viewer.impl.feed.view.bottomsheet.actions.menu;

import org.webrtc.PeerConnectionFactory;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ClipsActionEnableState.kt */
/* loaded from: classes17.dex */
public final class ClipsActionEnableState {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ClipsActionEnableState[] $VALUES;
    public static final ClipsActionEnableState Disabled;
    public static final ClipsActionEnableState EnableWithBlockedClickAction;
    public static final ClipsActionEnableState Enabled;

    static {
        ClipsActionEnableState clipsActionEnableState = new ClipsActionEnableState(PeerConnectionFactory.TRIAL_ENABLED, 0);
        Enabled = clipsActionEnableState;
        ClipsActionEnableState clipsActionEnableState2 = new ClipsActionEnableState("Disabled", 1);
        Disabled = clipsActionEnableState2;
        ClipsActionEnableState clipsActionEnableState3 = new ClipsActionEnableState("EnableWithBlockedClickAction", 2);
        EnableWithBlockedClickAction = clipsActionEnableState3;
        ClipsActionEnableState[] clipsActionEnableStateArr = {clipsActionEnableState, clipsActionEnableState2, clipsActionEnableState3};
        $VALUES = clipsActionEnableStateArr;
        $ENTRIES = new asp(clipsActionEnableStateArr);
    }

    public ClipsActionEnableState() {
        throw null;
    }

    public static ClipsActionEnableState valueOf(String str) {
        return (ClipsActionEnableState) Enum.valueOf(ClipsActionEnableState.class, str);
    }

    public static ClipsActionEnableState[] values() {
        return (ClipsActionEnableState[]) $VALUES.clone();
    }
}
