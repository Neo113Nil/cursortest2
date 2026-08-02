package com.vk.friends.groupinvite.impl.models;

import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FriendInvitationState.kt */
/* loaded from: classes14.dex */
public final class FriendInvitationState {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ FriendInvitationState[] $VALUES;
    public static final FriendInvitationState ACCEPTED;
    public static final FriendInvitationState INVITED;
    public static final FriendInvitationState NOT_INVITED;

    static {
        FriendInvitationState friendInvitationState = new FriendInvitationState("NOT_INVITED", 0);
        NOT_INVITED = friendInvitationState;
        FriendInvitationState friendInvitationState2 = new FriendInvitationState("INVITED", 1);
        INVITED = friendInvitationState2;
        FriendInvitationState friendInvitationState3 = new FriendInvitationState(SignalingProtocol.PARTICIPANT_STATE_ACCEPTED, 2);
        ACCEPTED = friendInvitationState3;
        FriendInvitationState[] friendInvitationStateArr = {friendInvitationState, friendInvitationState2, friendInvitationState3};
        $VALUES = friendInvitationStateArr;
        $ENTRIES = new asp(friendInvitationStateArr);
    }

    public FriendInvitationState() {
        throw null;
    }

    public static FriendInvitationState valueOf(String str) {
        return (FriendInvitationState) Enum.valueOf(FriendInvitationState.class, str);
    }

    public static FriendInvitationState[] values() {
        return (FriendInvitationState[]) $VALUES.clone();
    }
}
