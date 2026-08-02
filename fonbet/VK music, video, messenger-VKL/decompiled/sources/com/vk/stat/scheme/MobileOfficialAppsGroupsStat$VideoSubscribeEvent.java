package com.vk.stat.scheme;

import com.vk.stat.scheme.MobileOfficialAppsGroupsStat$TypeGroupsEventItem;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: MobileOfficialAppsGroupsStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsGroupsStat$VideoSubscribeEvent implements MobileOfficialAppsGroupsStat$TypeGroupsEventItem.b {

    @pmi0("video_subscribe_event_type")
    private final VideoSubscribeEventType videoSubscribeEventType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsGroupsStat.kt */
    public static final class VideoSubscribeEventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ VideoSubscribeEventType[] $VALUES;

        @pmi0("subscribe_all")
        public static final VideoSubscribeEventType SUBSCRIBE_ALL;

        @pmi0("subscribe_recom")
        public static final VideoSubscribeEventType SUBSCRIBE_RECOM;

        @pmi0("unsubscribe")
        public static final VideoSubscribeEventType UNSUBSCRIBE;

        static {
            VideoSubscribeEventType videoSubscribeEventType = new VideoSubscribeEventType("SUBSCRIBE_ALL", 0);
            SUBSCRIBE_ALL = videoSubscribeEventType;
            VideoSubscribeEventType videoSubscribeEventType2 = new VideoSubscribeEventType("SUBSCRIBE_RECOM", 1);
            SUBSCRIBE_RECOM = videoSubscribeEventType2;
            VideoSubscribeEventType videoSubscribeEventType3 = new VideoSubscribeEventType("UNSUBSCRIBE", 2);
            UNSUBSCRIBE = videoSubscribeEventType3;
            VideoSubscribeEventType[] videoSubscribeEventTypeArr = {videoSubscribeEventType, videoSubscribeEventType2, videoSubscribeEventType3};
            $VALUES = videoSubscribeEventTypeArr;
            $ENTRIES = new asp(videoSubscribeEventTypeArr);
        }

        private VideoSubscribeEventType(String str, int i) {
        }

        public static VideoSubscribeEventType valueOf(String str) {
            return (VideoSubscribeEventType) Enum.valueOf(VideoSubscribeEventType.class, str);
        }

        public static VideoSubscribeEventType[] values() {
            return (VideoSubscribeEventType[]) $VALUES.clone();
        }
    }

    public MobileOfficialAppsGroupsStat$VideoSubscribeEvent(VideoSubscribeEventType videoSubscribeEventType) {
        this.videoSubscribeEventType = videoSubscribeEventType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileOfficialAppsGroupsStat$VideoSubscribeEvent) && this.videoSubscribeEventType == ((MobileOfficialAppsGroupsStat$VideoSubscribeEvent) obj).videoSubscribeEventType;
    }

    public final int hashCode() {
        return this.videoSubscribeEventType.hashCode();
    }

    public final String toString() {
        return "VideoSubscribeEvent(videoSubscribeEventType=" + this.videoSubscribeEventType + ')';
    }
}
