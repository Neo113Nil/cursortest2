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

/* compiled from: CommonWallStat.kt */
/* loaded from: classes5.dex */
public final class CommonWallStat$TypeWallCommentsView implements SchemeStat$TypeView.b {

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

    @pmi0("user_comments_sort_setting_post")
    private final UserCommentsSortSettingPost userCommentsSortSettingPost;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonWallStat.kt */
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
    /* compiled from: CommonWallStat.kt */
    public static final class UserCommentsSortSettingPost {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ UserCommentsSortSettingPost[] $VALUES;

        @pmi0("asc")
        public static final UserCommentsSortSettingPost ASC;

        @pmi0(CampaignEx.JSON_KEY_DESC)
        public static final UserCommentsSortSettingPost DESC;

        @pmi0("smart")
        public static final UserCommentsSortSettingPost SMART;

        static {
            UserCommentsSortSettingPost userCommentsSortSettingPost = new UserCommentsSortSettingPost("SMART", 0);
            SMART = userCommentsSortSettingPost;
            UserCommentsSortSettingPost userCommentsSortSettingPost2 = new UserCommentsSortSettingPost("DESC", 1);
            DESC = userCommentsSortSettingPost2;
            UserCommentsSortSettingPost userCommentsSortSettingPost3 = new UserCommentsSortSettingPost("ASC", 2);
            ASC = userCommentsSortSettingPost3;
            UserCommentsSortSettingPost[] userCommentsSortSettingPostArr = {userCommentsSortSettingPost, userCommentsSortSettingPost2, userCommentsSortSettingPost3};
            $VALUES = userCommentsSortSettingPostArr;
            $ENTRIES = new asp(userCommentsSortSettingPostArr);
        }

        private UserCommentsSortSettingPost(String str, int i) {
        }

        public static UserCommentsSortSettingPost valueOf(String str) {
            return (UserCommentsSortSettingPost) Enum.valueOf(UserCommentsSortSettingPost.class, str);
        }

        public static UserCommentsSortSettingPost[] values() {
            return (UserCommentsSortSettingPost[]) $VALUES.clone();
        }
    }

    public CommonWallStat$TypeWallCommentsView(int i, EventType eventType, Long l, Integer num, UserCommentsSortSettingPost userCommentsSortSettingPost, Integer num2) {
        this.commentId = i;
        this.eventType = eventType;
        this.generationId = l;
        this.startTs = num;
        this.userCommentsSortSettingPost = userCommentsSortSettingPost;
        this.duration = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonWallStat$TypeWallCommentsView)) {
            return false;
        }
        CommonWallStat$TypeWallCommentsView commonWallStat$TypeWallCommentsView = (CommonWallStat$TypeWallCommentsView) obj;
        return this.commentId == commonWallStat$TypeWallCommentsView.commentId && this.eventType == commonWallStat$TypeWallCommentsView.eventType && epx.f(this.generationId, commonWallStat$TypeWallCommentsView.generationId) && epx.f(this.startTs, commonWallStat$TypeWallCommentsView.startTs) && this.userCommentsSortSettingPost == commonWallStat$TypeWallCommentsView.userCommentsSortSettingPost && epx.f(this.duration, commonWallStat$TypeWallCommentsView.duration);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.commentId) * 31;
        EventType eventType = this.eventType;
        int hashCode2 = (hashCode + (eventType == null ? 0 : eventType.hashCode())) * 31;
        Long l = this.generationId;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        Integer num = this.startTs;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        UserCommentsSortSettingPost userCommentsSortSettingPost = this.userCommentsSortSettingPost;
        int hashCode5 = (hashCode4 + (userCommentsSortSettingPost == null ? 0 : userCommentsSortSettingPost.hashCode())) * 31;
        Integer num2 = this.duration;
        return hashCode5 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeWallCommentsView(commentId=");
        sb.append(this.commentId);
        sb.append(", eventType=");
        sb.append(this.eventType);
        sb.append(", generationId=");
        sb.append(this.generationId);
        sb.append(", startTs=");
        sb.append(this.startTs);
        sb.append(", userCommentsSortSettingPost=");
        sb.append(this.userCommentsSortSettingPost);
        sb.append(", duration=");
        return uqi.b(sb, this.duration, ')');
    }

    public /* synthetic */ CommonWallStat$TypeWallCommentsView(int i, EventType eventType, Long l, Integer num, UserCommentsSortSettingPost userCommentsSortSettingPost, Integer num2, int i2, zcl zclVar) {
        this(i, (i2 & 2) != 0 ? null : eventType, (i2 & 4) != 0 ? null : l, (i2 & 8) != 0 ? null : num, (i2 & 16) != 0 ? null : userCommentsSortSettingPost, (i2 & 32) != 0 ? null : num2);
    }
}
