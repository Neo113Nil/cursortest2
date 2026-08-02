package com.vk.stat.scheme;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import java.util.List;
import xsna.asp;
import xsna.bh10;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.shy;
import xsna.zcl;
import xsna.zrp;

/* compiled from: CommonUxpollsStat.kt */
/* loaded from: classes5.dex */
public final class CommonUxpollsStat$TypeUxpollsEvent implements SchemeStat$TypeAction.b {

    @pmi0("answer_numeric")
    private final List<Integer> answerNumeric;

    @pmi0("event_type")
    private final EventType eventType;

    @pmi0("poll_id")
    private final int pollId;

    @pmi0("question_id")
    private final Long questionId;

    @pmi0("question_type")
    private final QuestionType questionType;

    @pmi0("session_id")
    private final long sessionId;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonUxpollsStat.kt */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("answer")
        public static final EventType ANSWER;

        @pmi0(CampaignEx.JSON_NATIVE_VIDEO_COMPLETE)
        public static final EventType COMPLETE;

        @pmi0("hide")
        public static final EventType HIDE;

        @pmi0("ignore")
        public static final EventType IGNORE;

        @pmi0("invite_hide")
        public static final EventType INVITE_HIDE;

        @pmi0("invite_view")
        public static final EventType INVITE_VIEW;

        @pmi0("notified")
        public static final EventType NOTIFIED;

        @pmi0("show")
        public static final EventType SHOW;

        @pmi0("undo_complete")
        public static final EventType UNDO_COMPLETE;

        static {
            EventType eventType = new EventType("ANSWER", 0);
            ANSWER = eventType;
            EventType eventType2 = new EventType("SHOW", 1);
            SHOW = eventType2;
            EventType eventType3 = new EventType("HIDE", 2);
            HIDE = eventType3;
            EventType eventType4 = new EventType("COMPLETE", 3);
            COMPLETE = eventType4;
            EventType eventType5 = new EventType("UNDO_COMPLETE", 4);
            UNDO_COMPLETE = eventType5;
            EventType eventType6 = new EventType("NOTIFIED", 5);
            NOTIFIED = eventType6;
            EventType eventType7 = new EventType("INVITE_HIDE", 6);
            INVITE_HIDE = eventType7;
            EventType eventType8 = new EventType("INVITE_VIEW", 7);
            INVITE_VIEW = eventType8;
            EventType eventType9 = new EventType("IGNORE", 8);
            IGNORE = eventType9;
            EventType[] eventTypeArr = {eventType, eventType2, eventType3, eventType4, eventType5, eventType6, eventType7, eventType8, eventType9};
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
    /* compiled from: CommonUxpollsStat.kt */
    public static final class QuestionType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ QuestionType[] $VALUES;

        @pmi0("checkboxes")
        public static final QuestionType CHECKBOXES;

        @pmi0("checkboxes_open")
        public static final QuestionType CHECKBOXES_OPEN;

        @pmi0("faces_rating")
        public static final QuestionType FACES_RATING;

        @pmi0("grade")
        public static final QuestionType GRADE;

        @pmi0("open")
        public static final QuestionType OPEN;

        @pmi0("selection")
        public static final QuestionType SELECTION;

        @pmi0("star_rating")
        public static final QuestionType STAR_RATING;

        @pmi0("tabs")
        public static final QuestionType TABS;

        static {
            QuestionType questionType = new QuestionType("STAR_RATING", 0);
            STAR_RATING = questionType;
            QuestionType questionType2 = new QuestionType("FACES_RATING", 1);
            FACES_RATING = questionType2;
            QuestionType questionType3 = new QuestionType("SELECTION", 2);
            SELECTION = questionType3;
            QuestionType questionType4 = new QuestionType("CHECKBOXES", 3);
            CHECKBOXES = questionType4;
            QuestionType questionType5 = new QuestionType("CHECKBOXES_OPEN", 4);
            CHECKBOXES_OPEN = questionType5;
            QuestionType questionType6 = new QuestionType("OPEN", 5);
            OPEN = questionType6;
            QuestionType questionType7 = new QuestionType("GRADE", 6);
            GRADE = questionType7;
            QuestionType questionType8 = new QuestionType("TABS", 7);
            TABS = questionType8;
            QuestionType[] questionTypeArr = {questionType, questionType2, questionType3, questionType4, questionType5, questionType6, questionType7, questionType8};
            $VALUES = questionTypeArr;
            $ENTRIES = new asp(questionTypeArr);
        }

        private QuestionType(String str, int i) {
        }

        public static QuestionType valueOf(String str) {
            return (QuestionType) Enum.valueOf(QuestionType.class, str);
        }

        public static QuestionType[] values() {
            return (QuestionType[]) $VALUES.clone();
        }
    }

    public CommonUxpollsStat$TypeUxpollsEvent(EventType eventType, int i, long j, QuestionType questionType, Long l, List<Integer> list) {
        this.eventType = eventType;
        this.pollId = i;
        this.sessionId = j;
        this.questionType = questionType;
        this.questionId = l;
        this.answerNumeric = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonUxpollsStat$TypeUxpollsEvent)) {
            return false;
        }
        CommonUxpollsStat$TypeUxpollsEvent commonUxpollsStat$TypeUxpollsEvent = (CommonUxpollsStat$TypeUxpollsEvent) obj;
        return this.eventType == commonUxpollsStat$TypeUxpollsEvent.eventType && this.pollId == commonUxpollsStat$TypeUxpollsEvent.pollId && this.sessionId == commonUxpollsStat$TypeUxpollsEvent.sessionId && this.questionType == commonUxpollsStat$TypeUxpollsEvent.questionType && epx.f(this.questionId, commonUxpollsStat$TypeUxpollsEvent.questionId) && epx.f(this.answerNumeric, commonUxpollsStat$TypeUxpollsEvent.answerNumeric);
    }

    public final int hashCode() {
        int hashCode = (this.questionType.hashCode() + bh10.a(shy.a(this.pollId, this.eventType.hashCode() * 31, 31), 31, this.sessionId)) * 31;
        Long l = this.questionId;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        List<Integer> list = this.answerNumeric;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeUxpollsEvent(eventType=");
        sb.append(this.eventType);
        sb.append(", pollId=");
        sb.append(this.pollId);
        sb.append(", sessionId=");
        sb.append(this.sessionId);
        sb.append(", questionType=");
        sb.append(this.questionType);
        sb.append(", questionId=");
        sb.append(this.questionId);
        sb.append(", answerNumeric=");
        return ms9.a(')', sb, this.answerNumeric);
    }

    public /* synthetic */ CommonUxpollsStat$TypeUxpollsEvent(EventType eventType, int i, long j, QuestionType questionType, Long l, List list, int i2, zcl zclVar) {
        this(eventType, i, j, questionType, (i2 & 16) != 0 ? null : l, (i2 & 32) != 0 ? null : list);
    }
}
