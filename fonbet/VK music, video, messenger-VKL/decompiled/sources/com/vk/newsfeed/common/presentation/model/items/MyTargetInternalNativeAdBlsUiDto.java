package com.vk.newsfeed.common.presentation.model.items;

import com.ironsource.InterfaceC4413l1;
import com.vk.dto.common.Image;
import com.vk.dto.newsfeed.entries.MyTargetNativeAdEntry;
import java.util.ArrayList;
import java.util.List;
import xsna.asp;
import xsna.epx;
import xsna.gjx;
import xsna.ms9;
import xsna.ol60;
import xsna.urd0;
import xsna.zrp;

/* compiled from: MyTargetInternalNativeAdBlsUiDto.kt */
/* loaded from: classes4.dex */
public final class MyTargetInternalNativeAdBlsUiDto extends ol60 {
    public final gjx h;
    public final MyTargetNativeAdEntry i;
    public final a j;

    /* compiled from: MyTargetInternalNativeAdBlsUiDto.kt */
    public static final class AnswerUiDto {
        public final String a;
        public final AnswerType b;
        public final String c;
        public final List<Image> d;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: MyTargetInternalNativeAdBlsUiDto.kt */
        public static final class AnswerType {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ AnswerType[] $VALUES;
            public static final AnswerType NOTHING_ANSWER;
            public static final AnswerType OTHER_ANSWER;
            public static final AnswerType USER_ANSWER;

            static {
                AnswerType answerType = new AnswerType("USER_ANSWER", 0);
                USER_ANSWER = answerType;
                AnswerType answerType2 = new AnswerType("OTHER_ANSWER", 1);
                OTHER_ANSWER = answerType2;
                AnswerType answerType3 = new AnswerType("NOTHING_ANSWER", 2);
                NOTHING_ANSWER = answerType3;
                AnswerType[] answerTypeArr = {answerType, answerType2, answerType3};
                $VALUES = answerTypeArr;
                $ENTRIES = new asp(answerTypeArr);
            }

            public AnswerType() {
                throw null;
            }

            public static AnswerType valueOf(String str) {
                return (AnswerType) Enum.valueOf(AnswerType.class, str);
            }

            public static AnswerType[] values() {
                return (AnswerType[]) $VALUES.clone();
            }
        }

        public AnswerUiDto(String str, AnswerType answerType, String str2, List<Image> list) {
            this.a = str;
            this.b = answerType;
            this.c = str2;
            this.d = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AnswerUiDto)) {
                return false;
            }
            AnswerUiDto answerUiDto = (AnswerUiDto) obj;
            return epx.f(this.a, answerUiDto.a) && this.b == answerUiDto.b && epx.f(this.c, answerUiDto.c) && epx.f(this.d, answerUiDto.d);
        }

        public final int hashCode() {
            int a = urd0.a((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
            List<Image> list = this.d;
            return a + (list == null ? 0 : list.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AnswerUiDto(id=");
            sb.append(this.a);
            sb.append(", type=");
            sb.append(this.b);
            sb.append(", text=");
            sb.append(this.c);
            sb.append(", logo=");
            return ms9.a(')', sb, this.d);
        }
    }

    /* compiled from: MyTargetInternalNativeAdBlsUiDto.kt */
    public static final class QuestionUiDto {
        public final String a;
        public final QuestionType b;
        public final String c;
        public final List<Image> d;
        public final List<AnswerUiDto> e;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: MyTargetInternalNativeAdBlsUiDto.kt */
        public static final class QuestionType {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ QuestionType[] $VALUES;
            public static final QuestionType MULTIPLE_ANSWERS;
            public static final QuestionType ONE_ANSWER;

            static {
                QuestionType questionType = new QuestionType("ONE_ANSWER", 0);
                ONE_ANSWER = questionType;
                QuestionType questionType2 = new QuestionType("MULTIPLE_ANSWERS", 1);
                MULTIPLE_ANSWERS = questionType2;
                QuestionType[] questionTypeArr = {questionType, questionType2};
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

        public QuestionUiDto(String str, QuestionType questionType, String str2, List list, ArrayList arrayList) {
            this.a = str;
            this.b = questionType;
            this.c = str2;
            this.d = list;
            this.e = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof QuestionUiDto)) {
                return false;
            }
            QuestionUiDto questionUiDto = (QuestionUiDto) obj;
            return epx.f(this.a, questionUiDto.a) && this.b == questionUiDto.b && epx.f(this.c, questionUiDto.c) && epx.f(this.d, questionUiDto.d) && epx.f(this.e, questionUiDto.e);
        }

        public final int hashCode() {
            int a = urd0.a((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
            List<Image> list = this.d;
            return this.e.hashCode() + ((a + (list == null ? 0 : list.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("QuestionUiDto(blockId=");
            sb.append(this.a);
            sb.append(", questionType=");
            sb.append(this.b);
            sb.append(", text=");
            sb.append(this.c);
            sb.append(", images=");
            sb.append(this.d);
            sb.append(", answers=");
            return ms9.a(')', sb, this.e);
        }
    }

    /* compiled from: MyTargetInternalNativeAdBlsUiDto.kt */
    public interface a {

        /* compiled from: MyTargetInternalNativeAdBlsUiDto.kt */
        /* renamed from: com.vk.newsfeed.common.presentation.model.items.MyTargetInternalNativeAdBlsUiDto$a$a, reason: collision with other inner class name */
        public static final class C1368a implements a {
            public static final C1368a a = new C1368a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C1368a);
            }

            public final int hashCode() {
                return 2130329650;
            }

            public final String toString() {
                return "Finished";
            }
        }

        /* compiled from: MyTargetInternalNativeAdBlsUiDto.kt */
        public static final class b implements a {
            public final boolean a;
            public final QuestionUiDto b;

            public b(boolean z, QuestionUiDto questionUiDto) {
                this.a = z;
                this.b = questionUiDto;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return this.a == bVar.a && epx.f(this.b, bVar.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
            }

            public final String toString() {
                return "Page(isExpandable=" + this.a + ", question=" + this.b + ')';
            }
        }
    }

    public MyTargetInternalNativeAdBlsUiDto(gjx gjxVar, MyTargetNativeAdEntry myTargetNativeAdEntry, a aVar) {
        super(InterfaceC4413l1.a.b.i, 0, 0, 0, null);
        this.h = gjxVar;
        this.i = myTargetNativeAdEntry;
        this.j = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MyTargetInternalNativeAdBlsUiDto)) {
            return false;
        }
        MyTargetInternalNativeAdBlsUiDto myTargetInternalNativeAdBlsUiDto = (MyTargetInternalNativeAdBlsUiDto) obj;
        myTargetInternalNativeAdBlsUiDto.getClass();
        return epx.f(this.h, myTargetInternalNativeAdBlsUiDto.h) && epx.f(this.i, myTargetInternalNativeAdBlsUiDto.i) && epx.f(this.j, myTargetInternalNativeAdBlsUiDto.j);
    }

    @Override // xsna.ol60
    public final int f() {
        return 0;
    }

    public final int hashCode() {
        return this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + (Integer.hashCode(0) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "MyTargetInternalNativeAdBlsUiDto(seqId=0, internalNativeBanner=" + this.h + ", rawEntry=" + this.i + ", state=" + this.j + ')';
    }
}
