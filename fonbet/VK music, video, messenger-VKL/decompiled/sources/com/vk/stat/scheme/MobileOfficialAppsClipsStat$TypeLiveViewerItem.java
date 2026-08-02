package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeAction;
import xsna.asp;
import xsna.epx;
import xsna.iq;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsClipsStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsClipsStat$TypeLiveViewerItem implements SchemeStat$TypeAction.b {

    @pmi0("event_type")
    private final EventType eventType;

    @pmi0("owner_id")
    private final Long ownerId;

    @pmi0("user_type")
    private final String userType;

    @pmi0("video_id")
    private final Integer videoId;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsClipsStat.kt */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("activate_supercomment")
        public static final EventType ACTIVATE_SUPERCOMMENT;

        @pmi0("block_user")
        public static final EventType BLOCK_USER;

        @pmi0("hide_comments")
        public static final EventType HIDE_COMMENTS;

        @pmi0("live_mute")
        public static final EventType LIVE_MUTE;

        @pmi0("live_unmute")
        public static final EventType LIVE_UNMUTE;

        @pmi0("open_next_auto_endscreen")
        public static final EventType OPEN_NEXT_AUTO_ENDSCREEN;

        @pmi0("player_close")
        public static final EventType PLAYER_CLOSE;

        @pmi0("player_show")
        public static final EventType PLAYER_SHOW;

        @pmi0("show_comments")
        public static final EventType SHOW_COMMENTS;

        @pmi0("show_gift_box")
        public static final EventType SHOW_GIFT_BOX;

        @pmi0("show_link")
        public static final EventType SHOW_LINK;

        @pmi0("subscribe")
        public static final EventType SUBSCRIBE;

        @pmi0("swipe")
        public static final EventType SWIPE;

        @pmi0("unsubscribe")
        public static final EventType UNSUBSCRIBE;

        @pmi0("view_streamer_profile")
        public static final EventType VIEW_STREAMER_PROFILE;

        @pmi0("view_user_profile")
        public static final EventType VIEW_USER_PROFILE;

        static {
            EventType eventType = new EventType("LIVE_MUTE", 0);
            LIVE_MUTE = eventType;
            EventType eventType2 = new EventType("LIVE_UNMUTE", 1);
            LIVE_UNMUTE = eventType2;
            EventType eventType3 = new EventType("BLOCK_USER", 2);
            BLOCK_USER = eventType3;
            EventType eventType4 = new EventType("HIDE_COMMENTS", 3);
            HIDE_COMMENTS = eventType4;
            EventType eventType5 = new EventType("SHOW_COMMENTS", 4);
            SHOW_COMMENTS = eventType5;
            EventType eventType6 = new EventType("PLAYER_SHOW", 5);
            PLAYER_SHOW = eventType6;
            EventType eventType7 = new EventType("PLAYER_CLOSE", 6);
            PLAYER_CLOSE = eventType7;
            EventType eventType8 = new EventType("SUBSCRIBE", 7);
            SUBSCRIBE = eventType8;
            EventType eventType9 = new EventType("UNSUBSCRIBE", 8);
            UNSUBSCRIBE = eventType9;
            EventType eventType10 = new EventType("VIEW_STREAMER_PROFILE", 9);
            VIEW_STREAMER_PROFILE = eventType10;
            EventType eventType11 = new EventType("VIEW_USER_PROFILE", 10);
            VIEW_USER_PROFILE = eventType11;
            EventType eventType12 = new EventType("SHOW_GIFT_BOX", 11);
            SHOW_GIFT_BOX = eventType12;
            EventType eventType13 = new EventType("ACTIVATE_SUPERCOMMENT", 12);
            ACTIVATE_SUPERCOMMENT = eventType13;
            EventType eventType14 = new EventType("OPEN_NEXT_AUTO_ENDSCREEN", 13);
            OPEN_NEXT_AUTO_ENDSCREEN = eventType14;
            EventType eventType15 = new EventType("SWIPE", 14);
            SWIPE = eventType15;
            EventType eventType16 = new EventType("SHOW_LINK", 15);
            SHOW_LINK = eventType16;
            EventType[] eventTypeArr = {eventType, eventType2, eventType3, eventType4, eventType5, eventType6, eventType7, eventType8, eventType9, eventType10, eventType11, eventType12, eventType13, eventType14, eventType15, eventType16};
            $VALUES = eventTypeArr;
            $ENTRIES = new asp(eventTypeArr);
        }

        private EventType(String str, int i) {
        }

        public static EventType valueOf(String str) {
            return (EventType) Enum.valueOf(EventType.class, str);
        }

        public static EventType[] values() {
            return (EventType[]) $VALUES.clone();
        }
    }

    public MobileOfficialAppsClipsStat$TypeLiveViewerItem(EventType eventType, String str, Integer num, Long l) {
        this.eventType = eventType;
        this.userType = str;
        this.videoId = num;
        this.ownerId = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsClipsStat$TypeLiveViewerItem)) {
            return false;
        }
        MobileOfficialAppsClipsStat$TypeLiveViewerItem mobileOfficialAppsClipsStat$TypeLiveViewerItem = (MobileOfficialAppsClipsStat$TypeLiveViewerItem) obj;
        return this.eventType == mobileOfficialAppsClipsStat$TypeLiveViewerItem.eventType && epx.f(this.userType, mobileOfficialAppsClipsStat$TypeLiveViewerItem.userType) && epx.f(this.videoId, mobileOfficialAppsClipsStat$TypeLiveViewerItem.videoId) && epx.f(this.ownerId, mobileOfficialAppsClipsStat$TypeLiveViewerItem.ownerId);
    }

    public final int hashCode() {
        int hashCode = this.eventType.hashCode() * 31;
        String str = this.userType;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.videoId;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Long l = this.ownerId;
        return hashCode3 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeLiveViewerItem(eventType=");
        sb.append(this.eventType);
        sb.append(", userType=");
        sb.append(this.userType);
        sb.append(", videoId=");
        sb.append(this.videoId);
        sb.append(", ownerId=");
        return iq.b(sb, this.ownerId, ')');
    }

    public /* synthetic */ MobileOfficialAppsClipsStat$TypeLiveViewerItem(EventType eventType, String str, Integer num, Long l, int i, zcl zclVar) {
        this(eventType, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : l);
    }
}
