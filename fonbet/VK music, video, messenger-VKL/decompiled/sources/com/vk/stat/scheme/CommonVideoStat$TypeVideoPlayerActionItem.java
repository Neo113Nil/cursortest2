package com.vk.stat.scheme;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import ru.ok.android.externcalls.analytics.internal.storage.DatabaseHelper;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.shy;
import xsna.zrp;

/* compiled from: CommonVideoStat.kt */
/* loaded from: classes5.dex */
public final class CommonVideoStat$TypeVideoPlayerActionItem implements SchemeStat$TypeAction.b {

    @pmi0("event_type")
    private final EventType eventType;

    @pmi0("frame_timestamp")
    private final int frameTimestamp;

    @pmi0(DatabaseHelper.ITEM_COLUMN_NAME)
    private final CommonStat$TypeCommonEventItem item;

    @pmi0("video_type")
    private final VideoType videoType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonVideoStat.kt */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("heartbeat")
        public static final EventType HEARTBEAT;

        @pmi0("pause")
        public static final EventType PAUSE;

        @pmi0(CampaignEx.JSON_NATIVE_VIDEO_RESUME)
        public static final EventType RESUME;

        @pmi0("stop")
        public static final EventType STOP;

        static {
            EventType eventType = new EventType("STOP", 0);
            STOP = eventType;
            EventType eventType2 = new EventType("PAUSE", 1);
            PAUSE = eventType2;
            EventType eventType3 = new EventType("RESUME", 2);
            RESUME = eventType3;
            EventType eventType4 = new EventType("HEARTBEAT", 3);
            HEARTBEAT = eventType4;
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
    /* compiled from: CommonVideoStat.kt */
    public static final class VideoType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ VideoType[] $VALUES;

        @pmi0("active_live")
        public static final VideoType ACTIVE_LIVE;

        @pmi0("short_video")
        public static final VideoType SHORT_VIDEO;

        @pmi0("video")
        public static final VideoType VIDEO;

        static {
            VideoType videoType = new VideoType(SignalingProtocol.MEDIA_OPTION_VIDEO, 0);
            VIDEO = videoType;
            VideoType videoType2 = new VideoType("SHORT_VIDEO", 1);
            SHORT_VIDEO = videoType2;
            VideoType videoType3 = new VideoType("ACTIVE_LIVE", 2);
            ACTIVE_LIVE = videoType3;
            VideoType[] videoTypeArr = {videoType, videoType2, videoType3};
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

    public CommonVideoStat$TypeVideoPlayerActionItem(EventType eventType, VideoType videoType, int i, CommonStat$TypeCommonEventItem commonStat$TypeCommonEventItem) {
        this.eventType = eventType;
        this.videoType = videoType;
        this.frameTimestamp = i;
        this.item = commonStat$TypeCommonEventItem;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonVideoStat$TypeVideoPlayerActionItem)) {
            return false;
        }
        CommonVideoStat$TypeVideoPlayerActionItem commonVideoStat$TypeVideoPlayerActionItem = (CommonVideoStat$TypeVideoPlayerActionItem) obj;
        return this.eventType == commonVideoStat$TypeVideoPlayerActionItem.eventType && this.videoType == commonVideoStat$TypeVideoPlayerActionItem.videoType && this.frameTimestamp == commonVideoStat$TypeVideoPlayerActionItem.frameTimestamp && epx.f(this.item, commonVideoStat$TypeVideoPlayerActionItem.item);
    }

    public final int hashCode() {
        return this.item.hashCode() + shy.a(this.frameTimestamp, (this.videoType.hashCode() + (this.eventType.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        return "TypeVideoPlayerActionItem(eventType=" + this.eventType + ", videoType=" + this.videoType + ", frameTimestamp=" + this.frameTimestamp + ", item=" + this.item + ')';
    }
}
