package com.vk.friends.groupinvite.api.domain;

import xsna.asp;
import xsna.zrp;

/* compiled from: InviteFriendsAnalytics.kt */
/* loaded from: classes14.dex */
public interface InviteFriendsAnalytics {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: InviteFriendsAnalytics.kt */
    public static final class InviteFriendsSource {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ InviteFriendsSource[] $VALUES;
        public static final InviteFriendsSource CHECKLIST;
        public static final InviteFriendsSource MAIN;
        public static final InviteFriendsSource WIZARD;

        static {
            InviteFriendsSource inviteFriendsSource = new InviteFriendsSource("MAIN", 0);
            MAIN = inviteFriendsSource;
            InviteFriendsSource inviteFriendsSource2 = new InviteFriendsSource("CHECKLIST", 1);
            CHECKLIST = inviteFriendsSource2;
            InviteFriendsSource inviteFriendsSource3 = new InviteFriendsSource("WIZARD", 2);
            WIZARD = inviteFriendsSource3;
            InviteFriendsSource[] inviteFriendsSourceArr = {inviteFriendsSource, inviteFriendsSource2, inviteFriendsSource3};
            $VALUES = inviteFriendsSourceArr;
            $ENTRIES = new asp(inviteFriendsSourceArr);
        }

        public InviteFriendsSource() {
            throw null;
        }

        public static InviteFriendsSource valueOf(String str) {
            return (InviteFriendsSource) Enum.valueOf(InviteFriendsSource.class, str);
        }

        public static InviteFriendsSource[] values() {
            return (InviteFriendsSource[]) $VALUES.clone();
        }
    }

    void a(long j, InviteFriendsSource inviteFriendsSource);
}
