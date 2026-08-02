package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeAction;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.pmi0;
import xsna.shy;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsVideoStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsVideoStat$TypePinVideoAction implements SchemeStat$TypeAction.b {

    @pmi0("block_name")
    private final BlockName blockName;

    @pmi0("event_subtype")
    private final EventSubtype eventSubtype;

    @pmi0("event_type")
    private final EventType eventType;

    @pmi0("video_id")
    private final int videoId;

    @pmi0("video_owner_id")
    private final long videoOwnerId;

    @pmi0("video_type")
    private final VideoType videoType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsVideoStat.kt */
    public static final class BlockName {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ BlockName[] $VALUES;

        @pmi0("all")
        public static final BlockName ALL;

        @pmi0("followers")
        public static final BlockName FOLLOWERS;

        @pmi0("non_followers")
        public static final BlockName NON_FOLLOWERS;

        static {
            BlockName blockName = new BlockName("ALL", 0);
            ALL = blockName;
            BlockName blockName2 = new BlockName("FOLLOWERS", 1);
            FOLLOWERS = blockName2;
            BlockName blockName3 = new BlockName("NON_FOLLOWERS", 2);
            NON_FOLLOWERS = blockName3;
            BlockName[] blockNameArr = {blockName, blockName2, blockName3};
            $VALUES = blockNameArr;
            $ENTRIES = new asp(blockNameArr);
        }

        private BlockName(String str, int i) {
        }

        public static BlockName valueOf(String str) {
            return (BlockName) Enum.valueOf(BlockName.class, str);
        }

        public static BlockName[] values() {
            return (BlockName[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsVideoStat.kt */
    public static final class EventSubtype {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventSubtype[] $VALUES;

        @pmi0("from_main")
        public static final EventSubtype FROM_MAIN;

        static {
            EventSubtype eventSubtype = new EventSubtype("FROM_MAIN", 0);
            FROM_MAIN = eventSubtype;
            EventSubtype[] eventSubtypeArr = {eventSubtype};
            $VALUES = eventSubtypeArr;
            $ENTRIES = new asp(eventSubtypeArr);
        }

        private EventSubtype(String str, int i) {
        }

        public static EventSubtype valueOf(String str) {
            return (EventSubtype) Enum.valueOf(EventSubtype.class, str);
        }

        public static EventSubtype[] values() {
            return (EventSubtype[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsVideoStat.kt */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("pin_clip")
        public static final EventType PIN_CLIP;

        @pmi0("pin_video")
        public static final EventType PIN_VIDEO;

        @pmi0("unpin_clip")
        public static final EventType UNPIN_CLIP;

        @pmi0("unpin_video")
        public static final EventType UNPIN_VIDEO;

        static {
            EventType eventType = new EventType("PIN_VIDEO", 0);
            PIN_VIDEO = eventType;
            EventType eventType2 = new EventType("UNPIN_VIDEO", 1);
            UNPIN_VIDEO = eventType2;
            EventType eventType3 = new EventType("PIN_CLIP", 2);
            PIN_CLIP = eventType3;
            EventType eventType4 = new EventType("UNPIN_CLIP", 3);
            UNPIN_CLIP = eventType4;
            EventType[] eventTypeArr = {eventType, eventType2, eventType3, eventType4};
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
    public static final class VideoType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ VideoType[] $VALUES;

        @pmi0("clip")
        public static final VideoType CLIP;

        @pmi0("video")
        public static final VideoType VIDEO;

        static {
            VideoType videoType = new VideoType(SignalingProtocol.MEDIA_OPTION_VIDEO, 0);
            VIDEO = videoType;
            VideoType videoType2 = new VideoType("CLIP", 1);
            CLIP = videoType2;
            VideoType[] videoTypeArr = {videoType, videoType2};
            $VALUES = videoTypeArr;
            $ENTRIES = new asp(videoTypeArr);
        }

        private VideoType(String str, int i) {
        }

        public static VideoType valueOf(String str) {
            return (VideoType) Enum.valueOf(VideoType.class, str);
        }

        public static VideoType[] values() {
            return (VideoType[]) $VALUES.clone();
        }
    }

    public MobileOfficialAppsVideoStat$TypePinVideoAction(long j, int i, EventType eventType, BlockName blockName, VideoType videoType, EventSubtype eventSubtype) {
        this.videoOwnerId = j;
        this.videoId = i;
        this.eventType = eventType;
        this.blockName = blockName;
        this.videoType = videoType;
        this.eventSubtype = eventSubtype;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsVideoStat$TypePinVideoAction)) {
            return false;
        }
        MobileOfficialAppsVideoStat$TypePinVideoAction mobileOfficialAppsVideoStat$TypePinVideoAction = (MobileOfficialAppsVideoStat$TypePinVideoAction) obj;
        return this.videoOwnerId == mobileOfficialAppsVideoStat$TypePinVideoAction.videoOwnerId && this.videoId == mobileOfficialAppsVideoStat$TypePinVideoAction.videoId && this.eventType == mobileOfficialAppsVideoStat$TypePinVideoAction.eventType && this.blockName == mobileOfficialAppsVideoStat$TypePinVideoAction.blockName && this.videoType == mobileOfficialAppsVideoStat$TypePinVideoAction.videoType && this.eventSubtype == mobileOfficialAppsVideoStat$TypePinVideoAction.eventSubtype;
    }

    public final int hashCode() {
        int a = shy.a(this.videoId, Long.hashCode(this.videoOwnerId) * 31, 31);
        EventType eventType = this.eventType;
        int hashCode = (a + (eventType == null ? 0 : eventType.hashCode())) * 31;
        BlockName blockName = this.blockName;
        int hashCode2 = (hashCode + (blockName == null ? 0 : blockName.hashCode())) * 31;
        VideoType videoType = this.videoType;
        int hashCode3 = (hashCode2 + (videoType == null ? 0 : videoType.hashCode())) * 31;
        EventSubtype eventSubtype = this.eventSubtype;
        return hashCode3 + (eventSubtype != null ? eventSubtype.hashCode() : 0);
    }

    public final String toString() {
        return "TypePinVideoAction(videoOwnerId=" + this.videoOwnerId + ", videoId=" + this.videoId + ", eventType=" + this.eventType + ", blockName=" + this.blockName + ", videoType=" + this.videoType + ", eventSubtype=" + this.eventSubtype + ')';
    }

    public /* synthetic */ MobileOfficialAppsVideoStat$TypePinVideoAction(long j, int i, EventType eventType, BlockName blockName, VideoType videoType, EventSubtype eventSubtype, int i2, zcl zclVar) {
        this(j, i, (i2 & 4) != 0 ? null : eventType, (i2 & 8) != 0 ? null : blockName, (i2 & 16) != 0 ? null : videoType, (i2 & 32) != 0 ? null : eventSubtype);
    }
}
