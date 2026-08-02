package com.vk.profile.community.impl.ui.tag;

import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CommunityActionTags.kt */
/* loaded from: classes5.dex */
public final class CommunityActionTags {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CommunityActionTags[] $VALUES;
    public static final CommunityActionTags ADMIN_MESSAGES;
    public static final CommunityActionTags ADMIN_PROMOTION;
    public static final CommunityActionTags CALL_TO_ACTION;
    public static final CommunityActionTags EVENT_OPTIONS;
    public static final CommunityActionTags JOIN;
    public static final CommunityActionTags JOIN_POPUP;
    public static final CommunityActionTags JOIN_UNSURE;
    public static final CommunityActionTags LEAVE;
    public static final CommunityActionTags MESSAGE;
    public static final CommunityActionTags NOTIFICATION;
    public static final CommunityActionTags OPTIONS;
    public static final CommunityActionTags REVIEW;
    private final String value;

    static {
        CommunityActionTags communityActionTags = new CommunityActionTags("JOIN", 0, "join");
        JOIN = communityActionTags;
        CommunityActionTags communityActionTags2 = new CommunityActionTags("JOIN_UNSURE", 1, "join_unsure");
        JOIN_UNSURE = communityActionTags2;
        CommunityActionTags communityActionTags3 = new CommunityActionTags("JOIN_POPUP", 2, "join_popup");
        JOIN_POPUP = communityActionTags3;
        CommunityActionTags communityActionTags4 = new CommunityActionTags("OPTIONS", 3, SignalingProtocol.KEY_OPTIONS);
        OPTIONS = communityActionTags4;
        CommunityActionTags communityActionTags5 = new CommunityActionTags("LEAVE", 4, "leave");
        LEAVE = communityActionTags5;
        CommunityActionTags communityActionTags6 = new CommunityActionTags("MESSAGE", 5, "message");
        MESSAGE = communityActionTags6;
        CommunityActionTags communityActionTags7 = new CommunityActionTags("ADMIN_MESSAGES", 6, "admin_messages");
        ADMIN_MESSAGES = communityActionTags7;
        CommunityActionTags communityActionTags8 = new CommunityActionTags("ADMIN_PROMOTION", 7, "admin_promotion");
        ADMIN_PROMOTION = communityActionTags8;
        CommunityActionTags communityActionTags9 = new CommunityActionTags("CALL_TO_ACTION", 8, "call_to_action");
        CALL_TO_ACTION = communityActionTags9;
        CommunityActionTags communityActionTags10 = new CommunityActionTags("EVENT_OPTIONS", 9, "event_options");
        EVENT_OPTIONS = communityActionTags10;
        CommunityActionTags communityActionTags11 = new CommunityActionTags("NOTIFICATION", 10, "notification");
        NOTIFICATION = communityActionTags11;
        CommunityActionTags communityActionTags12 = new CommunityActionTags("REVIEW", 11, "review");
        REVIEW = communityActionTags12;
        CommunityActionTags[] communityActionTagsArr = {communityActionTags, communityActionTags2, communityActionTags3, communityActionTags4, communityActionTags5, communityActionTags6, communityActionTags7, communityActionTags8, communityActionTags9, communityActionTags10, communityActionTags11, communityActionTags12};
        $VALUES = communityActionTagsArr;
        $ENTRIES = new asp(communityActionTagsArr);
    }

    public CommunityActionTags(String str, int i, String str2) {
        this.value = str2;
    }

    public static CommunityActionTags valueOf(String str) {
        return (CommunityActionTags) Enum.valueOf(CommunityActionTags.class, str);
    }

    public static CommunityActionTags[] values() {
        return (CommunityActionTags[]) $VALUES.clone();
    }

    public final String h() {
        return this.value;
    }
}
