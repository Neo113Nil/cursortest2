package com.vk.video.polls.analytics;

import java.util.List;
import xsna.asp;
import xsna.epx;
import xsna.ms9;
import xsna.zrp;

/* compiled from: UxPollsAnalytics.kt */
/* loaded from: classes6.dex */
public interface UxPollsAnalytics {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: UxPollsAnalytics.kt */
    public static final class QuestionType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ QuestionType[] $VALUES;
        public static final QuestionType CHECKBOXES;
        public static final QuestionType CHECKBOXES_OPEN;
        public static final QuestionType FACES_RATING;
        public static final QuestionType GRADE;
        public static final QuestionType OPEN;
        public static final QuestionType SELECTION;
        public static final QuestionType STAR_RATING;
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

        public QuestionType() {
            throw null;
        }

        public static QuestionType valueOf(String str) {
            return (QuestionType) Enum.valueOf(QuestionType.class, str);
        }

        public static QuestionType[] values() {
            return (QuestionType[]) $VALUES.clone();
        }
    }

    /* compiled from: UxPollsAnalytics.kt */
    public static final class a {
        public final QuestionType a;
        public final Long b;
        public final List<Integer> c;

        /* JADX WARN: Multi-variable type inference failed */
        public a() {
            this((QuestionType) null, (Long) (0 == true ? 1 : 0), 7);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c);
        }

        public final int hashCode() {
            QuestionType questionType = this.a;
            int hashCode = (questionType == null ? 0 : questionType.hashCode()) * 31;
            Long l = this.b;
            int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
            List<Integer> list = this.c;
            return hashCode2 + (list != null ? list.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Params(questionType=");
            sb.append(this.a);
            sb.append(", questionId=");
            sb.append(this.b);
            sb.append(", answerNumeric=");
            return ms9.a(')', sb, this.c);
        }

        public /* synthetic */ a(QuestionType questionType, Long l, int i) {
            this((i & 1) != 0 ? null : questionType, (i & 2) != 0 ? null : l, (List<Integer>) null);
        }

        public a(QuestionType questionType, Long l, List<Integer> list) {
            this.a = questionType;
            this.b = l;
            this.c = list;
        }
    }

    default void a() {
    }

    default void b() {
    }
}
