package com.vk.profile.core.scheduled_clips.bottom_sheet.actions;

import org.webrtc.PeerConnectionFactory;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CommunityScheduledClipsActionEnableState.kt */
/* loaded from: classes5.dex */
public final class CommunityScheduledClipsActionEnableState {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CommunityScheduledClipsActionEnableState[] $VALUES;
    public static final CommunityScheduledClipsActionEnableState Disabled;
    public static final CommunityScheduledClipsActionEnableState EnableWithBlockedClickAction;
    public static final CommunityScheduledClipsActionEnableState Enabled;

    static {
        CommunityScheduledClipsActionEnableState communityScheduledClipsActionEnableState = new CommunityScheduledClipsActionEnableState(PeerConnectionFactory.TRIAL_ENABLED, 0);
        Enabled = communityScheduledClipsActionEnableState;
        CommunityScheduledClipsActionEnableState communityScheduledClipsActionEnableState2 = new CommunityScheduledClipsActionEnableState("Disabled", 1);
        Disabled = communityScheduledClipsActionEnableState2;
        CommunityScheduledClipsActionEnableState communityScheduledClipsActionEnableState3 = new CommunityScheduledClipsActionEnableState("EnableWithBlockedClickAction", 2);
        EnableWithBlockedClickAction = communityScheduledClipsActionEnableState3;
        CommunityScheduledClipsActionEnableState[] communityScheduledClipsActionEnableStateArr = {communityScheduledClipsActionEnableState, communityScheduledClipsActionEnableState2, communityScheduledClipsActionEnableState3};
        $VALUES = communityScheduledClipsActionEnableStateArr;
        $ENTRIES = new asp(communityScheduledClipsActionEnableStateArr);
    }

    public CommunityScheduledClipsActionEnableState() {
        throw null;
    }

    public static CommunityScheduledClipsActionEnableState valueOf(String str) {
        return (CommunityScheduledClipsActionEnableState) Enum.valueOf(CommunityScheduledClipsActionEnableState.class, str);
    }

    public static CommunityScheduledClipsActionEnableState[] values() {
        return (CommunityScheduledClipsActionEnableState[]) $VALUES.clone();
    }
}
