package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeAction;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.bh10;
import xsna.pmi0;
import xsna.vu5;
import xsna.zrp;

/* compiled from: MobileOfficialAppsVideoStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsVideoStat$TypeSportDirectLinkOpened implements SchemeStat$TypeAction.b {

    @pmi0("event_type")
    private final EventType eventType;

    @pmi0("screen")
    private final Screen screen;

    @pmi0("video_id")
    private final int videoId;

    @pmi0("video_owner_id")
    private final long videoOwnerId;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsVideoStat.kt */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("sport_direct_link_opened")
        public static final EventType SPORT_DIRECT_LINK_OPENED;

        static {
            EventType eventType = new EventType("SPORT_DIRECT_LINK_OPENED", 0);
            SPORT_DIRECT_LINK_OPENED = eventType;
            EventType[] eventTypeArr = {eventType};
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

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsVideoStat.kt */
    public static final class Screen {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Screen[] $VALUES;

        @pmi0(SignalingProtocol.KEY_CHAT_DIRECT)
        public static final Screen DIRECT;

        static {
            Screen screen = new Screen("DIRECT", 0);
            DIRECT = screen;
            Screen[] screenArr = {screen};
            $VALUES = screenArr;
            $ENTRIES = new asp(screenArr);
        }

        private Screen(String str, int i) {
        }

        public static Screen valueOf(String str) {
            return (Screen) Enum.valueOf(Screen.class, str);
        }

        public static Screen[] values() {
            return (Screen[]) $VALUES.clone();
        }
    }

    public MobileOfficialAppsVideoStat$TypeSportDirectLinkOpened(EventType eventType, Screen screen, long j, int i) {
        this.eventType = eventType;
        this.screen = screen;
        this.videoOwnerId = j;
        this.videoId = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsVideoStat$TypeSportDirectLinkOpened)) {
            return false;
        }
        MobileOfficialAppsVideoStat$TypeSportDirectLinkOpened mobileOfficialAppsVideoStat$TypeSportDirectLinkOpened = (MobileOfficialAppsVideoStat$TypeSportDirectLinkOpened) obj;
        return this.eventType == mobileOfficialAppsVideoStat$TypeSportDirectLinkOpened.eventType && this.screen == mobileOfficialAppsVideoStat$TypeSportDirectLinkOpened.screen && this.videoOwnerId == mobileOfficialAppsVideoStat$TypeSportDirectLinkOpened.videoOwnerId && this.videoId == mobileOfficialAppsVideoStat$TypeSportDirectLinkOpened.videoId;
    }

    public final int hashCode() {
        return Integer.hashCode(this.videoId) + bh10.a((this.screen.hashCode() + (this.eventType.hashCode() * 31)) * 31, 31, this.videoOwnerId);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeSportDirectLinkOpened(eventType=");
        sb.append(this.eventType);
        sb.append(", screen=");
        sb.append(this.screen);
        sb.append(", videoOwnerId=");
        sb.append(this.videoOwnerId);
        sb.append(", videoId=");
        return vu5.b(sb, this.videoId, ')');
    }
}
