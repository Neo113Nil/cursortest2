package com.vk.stat.scheme;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.stat.scheme.SchemeStat$TypeView;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;
import xsna.zrp;

/* compiled from: CommonVideoStat.kt */
/* loaded from: classes5.dex */
public final class CommonVideoStat$TypeVideoCommentsView implements SchemeStat$TypeView.b {

    @pmi0("comment_id")
    private final int commentId;

    @pmi0("duration")
    private final Integer duration;

    @pmi0("event_type")
    private final EventType eventType;

    @pmi0("generation_id")
    private final Long generationId;

    @pmi0("start_ts")
    private final Integer startTs;

    @pmi0("user_comments_sort_setting_video")
    private final UserCommentsSortSettingVideo userCommentsSortSettingVideo;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonVideoStat.kt */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("expand")
        public static final EventType EXPAND;

        @pmi0(MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW)
        public static final EventType VIEW;

        static {
            EventType eventType = new EventType("VIEW", 0);
            VIEW = eventType;
            EventType eventType2 = new EventType("EXPAND", 1);
            EXPAND = eventType2;
            EventType[] eventTypeArr = {eventType, eventType2};
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
    public static final class UserCommentsSortSettingVideo {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ UserCommentsSortSettingVideo[] $VALUES;

        @pmi0("asc")
        public static final UserCommentsSortSettingVideo ASC;

        @pmi0(CampaignEx.JSON_KEY_DESC)
        public static final UserCommentsSortSettingVideo DESC;

        @pmi0("interest")
        public static final UserCommentsSortSettingVideo INTEREST;

        static {
            UserCommentsSortSettingVideo userCommentsSortSettingVideo = new UserCommentsSortSettingVideo("INTEREST", 0);
            INTEREST = userCommentsSortSettingVideo;
            UserCommentsSortSettingVideo userCommentsSortSettingVideo2 = new UserCommentsSortSettingVideo("DESC", 1);
            DESC = userCommentsSortSettingVideo2;
            UserCommentsSortSettingVideo userCommentsSortSettingVideo3 = new UserCommentsSortSettingVideo("ASC", 2);
            ASC = userCommentsSortSettingVideo3;
            UserCommentsSortSettingVideo[] userCommentsSortSettingVideoArr = {userCommentsSortSettingVideo, userCommentsSortSettingVideo2, userCommentsSortSettingVideo3};
            $VALUES = userCommentsSortSettingVideoArr;
            $ENTRIES = new asp(userCommentsSortSettingVideoArr);
        }

        private UserCommentsSortSettingVideo(String str, int i) {
        }

        public static UserCommentsSortSettingVideo valueOf(String str) {
            return (UserCommentsSortSettingVideo) Enum.valueOf(UserCommentsSortSettingVideo.class, str);
        }

        public static UserCommentsSortSettingVideo[] values() {
            return (UserCommentsSortSettingVideo[]) $VALUES.clone();
        }
    }

    public CommonVideoStat$TypeVideoCommentsView(int i, EventType eventType, Long l, Integer num, UserCommentsSortSettingVideo userCommentsSortSettingVideo, Integer num2) {
        this.commentId = i;
        this.eventType = eventType;
        this.generationId = l;
        this.startTs = num;
        this.userCommentsSortSettingVideo = userCommentsSortSettingVideo;
        this.duration = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonVideoStat$TypeVideoCommentsView)) {
            return false;
        }
        CommonVideoStat$TypeVideoCommentsView commonVideoStat$TypeVideoCommentsView = (CommonVideoStat$TypeVideoCommentsView) obj;
        return this.commentId == commonVideoStat$TypeVideoCommentsView.commentId && this.eventType == commonVideoStat$TypeVideoCommentsView.eventType && epx.f(this.generationId, commonVideoStat$TypeVideoCommentsView.generationId) && epx.f(this.startTs, commonVideoStat$TypeVideoCommentsView.startTs) && this.userCommentsSortSettingVideo == commonVideoStat$TypeVideoCommentsView.userCommentsSortSettingVideo && epx.f(this.duration, commonVideoStat$TypeVideoCommentsView.duration);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.commentId) * 31;
        EventType eventType = this.eventType;
        int hashCode2 = (hashCode + (eventType == null ? 0 : eventType.hashCode())) * 31;
        Long l = this.generationId;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        Integer num = this.startTs;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        UserCommentsSortSettingVideo userCommentsSortSettingVideo = this.userCommentsSortSettingVideo;
        int hashCode5 = (hashCode4 + (userCommentsSortSettingVideo == null ? 0 : userCommentsSortSettingVideo.hashCode())) * 31;
        Integer num2 = this.duration;
        return hashCode5 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeVideoCommentsView(commentId=");
        sb.append(this.commentId);
        sb.append(", eventType=");
        sb.append(this.eventType);
        sb.append(", generationId=");
        sb.append(this.generationId);
        sb.append(", startTs=");
        sb.append(this.startTs);
        sb.append(", userCommentsSortSettingVideo=");
        sb.append(this.userCommentsSortSettingVideo);
        sb.append(", duration=");
        return uqi.b(sb, this.duration, ')');
    }

    public /* synthetic */ CommonVideoStat$TypeVideoCommentsView(int i, EventType eventType, Long l, Integer num, UserCommentsSortSettingVideo userCommentsSortSettingVideo, Integer num2, int i2, zcl zclVar) {
        this(i, (i2 & 2) != 0 ? null : eventType, (i2 & 4) != 0 ? null : l, (i2 & 8) != 0 ? null : num, (i2 & 16) != 0 ? null : userCommentsSortSettingVideo, (i2 & 32) != 0 ? null : num2);
    }
}
