package com.vk.stat.scheme;

import androidx.core.app.NotificationCompat;
import com.vk.stat.scheme.MobileOfficialAppsGroupsStat$TypeGroupsEventItem;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsGroupsStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsGroupsStat$LiveCoverEvent implements MobileOfficialAppsGroupsStat$TypeGroupsEventItem.b {

    @pmi0("duration")
    private final Integer duration;

    @pmi0("live_cover_event_type")
    private final LiveCoverEventType liveCoverEventType;

    @pmi0("live_cover_type")
    private final LiveCoverType liveCoverType;

    @pmi0(NotificationCompat.CATEGORY_PROGRESS)
    private final Integer progress;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsGroupsStat.kt */
    public static final class LiveCoverEventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ LiveCoverEventType[] $VALUES;

        @pmi0("downloading_error")
        public static final LiveCoverEventType DOWNLOADING_ERROR;

        @pmi0("hide")
        public static final LiveCoverEventType HIDE;

        @pmi0("reveal")
        public static final LiveCoverEventType REVEAL;

        @pmi0("start_play")
        public static final LiveCoverEventType START_PLAY;

        @pmi0("stop_play")
        public static final LiveCoverEventType STOP_PLAY;

        static {
            LiveCoverEventType liveCoverEventType = new LiveCoverEventType("START_PLAY", 0);
            START_PLAY = liveCoverEventType;
            LiveCoverEventType liveCoverEventType2 = new LiveCoverEventType("STOP_PLAY", 1);
            STOP_PLAY = liveCoverEventType2;
            LiveCoverEventType liveCoverEventType3 = new LiveCoverEventType("REVEAL", 2);
            REVEAL = liveCoverEventType3;
            LiveCoverEventType liveCoverEventType4 = new LiveCoverEventType("HIDE", 3);
            HIDE = liveCoverEventType4;
            LiveCoverEventType liveCoverEventType5 = new LiveCoverEventType("DOWNLOADING_ERROR", 4);
            DOWNLOADING_ERROR = liveCoverEventType5;
            LiveCoverEventType[] liveCoverEventTypeArr = {liveCoverEventType, liveCoverEventType2, liveCoverEventType3, liveCoverEventType4, liveCoverEventType5};
            $VALUES = liveCoverEventTypeArr;
            $ENTRIES = new asp(liveCoverEventTypeArr);
        }

        private LiveCoverEventType(String str, int i) {
        }

        public static LiveCoverEventType valueOf(String str) {
            return (LiveCoverEventType) Enum.valueOf(LiveCoverEventType.class, str);
        }

        public static LiveCoverEventType[] values() {
            return (LiveCoverEventType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsGroupsStat.kt */
    public static final class LiveCoverType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ LiveCoverType[] $VALUES;

        @pmi0("photo")
        public static final LiveCoverType PHOTO;

        @pmi0("video")
        public static final LiveCoverType VIDEO;

        @pmi0("video_preview")
        public static final LiveCoverType VIDEO_PREVIEW;

        static {
            LiveCoverType liveCoverType = new LiveCoverType(SignalingProtocol.MEDIA_OPTION_VIDEO, 0);
            VIDEO = liveCoverType;
            LiveCoverType liveCoverType2 = new LiveCoverType("VIDEO_PREVIEW", 1);
            VIDEO_PREVIEW = liveCoverType2;
            LiveCoverType liveCoverType3 = new LiveCoverType("PHOTO", 2);
            PHOTO = liveCoverType3;
            LiveCoverType[] liveCoverTypeArr = {liveCoverType, liveCoverType2, liveCoverType3};
            $VALUES = liveCoverTypeArr;
            $ENTRIES = new asp(liveCoverTypeArr);
        }

        private LiveCoverType(String str, int i) {
        }

        public static LiveCoverType valueOf(String str) {
            return (LiveCoverType) Enum.valueOf(LiveCoverType.class, str);
        }

        public static LiveCoverType[] values() {
            return (LiveCoverType[]) $VALUES.clone();
        }
    }

    public MobileOfficialAppsGroupsStat$LiveCoverEvent(LiveCoverEventType liveCoverEventType, LiveCoverType liveCoverType, Integer num, Integer num2) {
        this.liveCoverEventType = liveCoverEventType;
        this.liveCoverType = liveCoverType;
        this.progress = num;
        this.duration = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsGroupsStat$LiveCoverEvent)) {
            return false;
        }
        MobileOfficialAppsGroupsStat$LiveCoverEvent mobileOfficialAppsGroupsStat$LiveCoverEvent = (MobileOfficialAppsGroupsStat$LiveCoverEvent) obj;
        return this.liveCoverEventType == mobileOfficialAppsGroupsStat$LiveCoverEvent.liveCoverEventType && this.liveCoverType == mobileOfficialAppsGroupsStat$LiveCoverEvent.liveCoverType && epx.f(this.progress, mobileOfficialAppsGroupsStat$LiveCoverEvent.progress) && epx.f(this.duration, mobileOfficialAppsGroupsStat$LiveCoverEvent.duration);
    }

    public final int hashCode() {
        int hashCode = (this.liveCoverType.hashCode() + (this.liveCoverEventType.hashCode() * 31)) * 31;
        Integer num = this.progress;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.duration;
        return hashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LiveCoverEvent(liveCoverEventType=");
        sb.append(this.liveCoverEventType);
        sb.append(", liveCoverType=");
        sb.append(this.liveCoverType);
        sb.append(", progress=");
        sb.append(this.progress);
        sb.append(", duration=");
        return uqi.b(sb, this.duration, ')');
    }

    public /* synthetic */ MobileOfficialAppsGroupsStat$LiveCoverEvent(LiveCoverEventType liveCoverEventType, LiveCoverType liveCoverType, Integer num, Integer num2, int i, zcl zclVar) {
        this(liveCoverEventType, liveCoverType, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : num2);
    }
}
