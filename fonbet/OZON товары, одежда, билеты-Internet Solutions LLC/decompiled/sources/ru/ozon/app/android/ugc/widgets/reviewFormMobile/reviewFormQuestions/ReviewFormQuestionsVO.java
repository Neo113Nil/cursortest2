package ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormQuestions;

import Ak.C2436a;
import B90.C2618u;
import Co.a;
import G.g;
import N3.C3660k;
import Ns.b;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.tag.TagButtonDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001#B-\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ>\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u0011R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010!\u001a\u0004\b\"\u0010\u0013¨\u0006$"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormQuestions/ReviewFormQuestionsVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "uploadKey", "", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormQuestions/ReviewFormQuestionsVO$QuestionVO;", "questions", "", "visibleQuestionsCount", "<init>", "(JLjava/lang/String;Ljava/util/List;I)V", "copy", "(JLjava/lang/String;Ljava/util/List;I)Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormQuestions/ReviewFormQuestionsVO;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getUploadKey", "Ljava/util/List;", "getQuestions", "()Ljava/util/List;", "I", "getVisibleQuestionsCount", "QuestionVO", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ReviewFormQuestionsVO implements c {
    private final long id;

    @NotNull
    private final List<QuestionVO> questions;

    @NotNull
    private final String uploadKey;
    private final int visibleQuestionsCount;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001eB%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ4\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormQuestions/ReviewFormQuestionsVO$QuestionVO;", "", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormQuestions/ReviewFormQuestionsVO$QuestionVO$AnswerVO;", "answers", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;)V", "copy", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;)Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormQuestions/ReviewFormQuestionsVO$QuestionVO;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Ljava/util/List;", "getAnswers", "()Ljava/util/List;", "AnswerVO", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class QuestionVO {

        @NotNull
        private final List<AnswerVO> answers;

        @NotNull
        private final String id;

        @NotNull
        private final TextDTO title;

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u000e\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b¢\u0006\u0004\b\n\u0010\u000bJ@\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0010\b\u0002\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\bHÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0019\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001f\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormQuestions/ReviewFormQuestionsVO$QuestionVO$AnswerVO;", "", "", "questionId", "id", "Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;", "tagButton", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "clickEvent", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;LWZ/t;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;LWZ/t;)Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormQuestions/ReviewFormQuestionsVO$QuestionVO$AnswerVO;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getQuestionId", "getId", "Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;", "getTagButton", "()Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;", "LWZ/t;", "getClickEvent", "()LWZ/t;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class AnswerVO {
            private final t clickEvent;

            @NotNull
            private final String id;

            @NotNull
            private final String questionId;

            @NotNull
            private final TagButtonDTO tagButton;

            public AnswerVO(@NotNull String questionId, @NotNull String id2, @NotNull TagButtonDTO tagButton, t tVar) {
                Intrinsics.checkNotNullParameter(questionId, "questionId");
                Intrinsics.checkNotNullParameter(id2, "id");
                Intrinsics.checkNotNullParameter(tagButton, "tagButton");
                this.questionId = questionId;
                this.id = id2;
                this.tagButton = tagButton;
                this.clickEvent = tVar;
            }

            public static /* synthetic */ AnswerVO copy$default(AnswerVO answerVO, String str, String str2, TagButtonDTO tagButtonDTO, t tVar, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = answerVO.questionId;
                }
                if ((i11 & 2) != 0) {
                    str2 = answerVO.id;
                }
                if ((i11 & 4) != 0) {
                    tagButtonDTO = answerVO.tagButton;
                }
                if ((i11 & 8) != 0) {
                    tVar = answerVO.clickEvent;
                }
                return answerVO.copy(str, str2, tagButtonDTO, tVar);
            }

            @NotNull
            public final AnswerVO copy(@NotNull String questionId, @NotNull String id2, @NotNull TagButtonDTO tagButton, t clickEvent) {
                Intrinsics.checkNotNullParameter(questionId, "questionId");
                Intrinsics.checkNotNullParameter(id2, "id");
                Intrinsics.checkNotNullParameter(tagButton, "tagButton");
                return new AnswerVO(questionId, id2, tagButton, clickEvent);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof AnswerVO)) {
                    return false;
                }
                AnswerVO answerVO = (AnswerVO) other;
                return Intrinsics.d(this.questionId, answerVO.questionId) && Intrinsics.d(this.id, answerVO.id) && Intrinsics.d(this.tagButton, answerVO.tagButton) && Intrinsics.d(this.clickEvent, answerVO.clickEvent);
            }

            public final t getClickEvent() {
                return this.clickEvent;
            }

            @NotNull
            public final String getId() {
                return this.id;
            }

            @NotNull
            public final String getQuestionId() {
                return this.questionId;
            }

            @NotNull
            public final TagButtonDTO getTagButton() {
                return this.tagButton;
            }

            public int hashCode() {
                int hashCode = (this.tagButton.hashCode() + g.a(this.questionId.hashCode() * 31, 31, this.id)) * 31;
                t tVar = this.clickEvent;
                return hashCode + (tVar == null ? 0 : tVar.hashCode());
            }

            @NotNull
            public String toString() {
                String str = this.questionId;
                String str2 = this.id;
                TagButtonDTO tagButtonDTO = this.tagButton;
                t tVar = this.clickEvent;
                StringBuilder d11 = C3660k.d("AnswerVO(questionId=", str, ", id=", str2, ", tagButton=");
                d11.append(tagButtonDTO);
                d11.append(", clickEvent=");
                d11.append(tVar);
                d11.append(")");
                return d11.toString();
            }
        }

        public QuestionVO(@NotNull String id2, @NotNull TextDTO title, @NotNull List<AnswerVO> answers) {
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(answers, "answers");
            this.id = id2;
            this.title = title;
            this.answers = answers;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ QuestionVO copy$default(QuestionVO questionVO, String str, TextDTO textDTO, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = questionVO.id;
            }
            if ((i11 & 2) != 0) {
                textDTO = questionVO.title;
            }
            if ((i11 & 4) != 0) {
                list = questionVO.answers;
            }
            return questionVO.copy(str, textDTO, list);
        }

        @NotNull
        public final QuestionVO copy(@NotNull String id2, @NotNull TextDTO title, @NotNull List<AnswerVO> answers) {
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(answers, "answers");
            return new QuestionVO(id2, title, answers);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof QuestionVO)) {
                return false;
            }
            QuestionVO questionVO = (QuestionVO) other;
            return Intrinsics.d(this.id, questionVO.id) && Intrinsics.d(this.title, questionVO.title) && Intrinsics.d(this.answers, questionVO.answers);
        }

        @NotNull
        public final List<AnswerVO> getAnswers() {
            return this.answers;
        }

        @NotNull
        public final String getId() {
            return this.id;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.answers.hashCode() + b.a(this.title, this.id.hashCode() * 31, 31);
        }

        @NotNull
        public String toString() {
            String str = this.id;
            TextDTO textDTO = this.title;
            return C2618u.h(a.b("QuestionVO(id=", textDTO, str, ", title=", ", answers="), this.answers, ")");
        }
    }

    public ReviewFormQuestionsVO(long j11, @NotNull String uploadKey, @NotNull List<QuestionVO> questions, int i11) {
        Intrinsics.checkNotNullParameter(uploadKey, "uploadKey");
        Intrinsics.checkNotNullParameter(questions, "questions");
        this.id = j11;
        this.uploadKey = uploadKey;
        this.questions = questions;
        this.visibleQuestionsCount = i11;
    }

    public static /* synthetic */ ReviewFormQuestionsVO copy$default(ReviewFormQuestionsVO reviewFormQuestionsVO, long j11, String str, List list, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            j11 = reviewFormQuestionsVO.id;
        }
        long j12 = j11;
        if ((i12 & 2) != 0) {
            str = reviewFormQuestionsVO.uploadKey;
        }
        String str2 = str;
        if ((i12 & 4) != 0) {
            list = reviewFormQuestionsVO.questions;
        }
        List list2 = list;
        if ((i12 & 8) != 0) {
            i11 = reviewFormQuestionsVO.visibleQuestionsCount;
        }
        return reviewFormQuestionsVO.copy(j12, str2, list2, i11);
    }

    @NotNull
    public final ReviewFormQuestionsVO copy(long id2, @NotNull String uploadKey, @NotNull List<QuestionVO> questions, int visibleQuestionsCount) {
        Intrinsics.checkNotNullParameter(uploadKey, "uploadKey");
        Intrinsics.checkNotNullParameter(questions, "questions");
        return new ReviewFormQuestionsVO(id2, uploadKey, questions, visibleQuestionsCount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReviewFormQuestionsVO)) {
            return false;
        }
        ReviewFormQuestionsVO reviewFormQuestionsVO = (ReviewFormQuestionsVO) other;
        return this.id == reviewFormQuestionsVO.id && Intrinsics.d(this.uploadKey, reviewFormQuestionsVO.uploadKey) && Intrinsics.d(this.questions, reviewFormQuestionsVO.questions) && this.visibleQuestionsCount == reviewFormQuestionsVO.visibleQuestionsCount;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final List<QuestionVO> getQuestions() {
        return this.questions;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final String getUploadKey() {
        return this.uploadKey;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public final int getVisibleQuestionsCount() {
        return this.visibleQuestionsCount;
    }

    public int hashCode() {
        return Integer.hashCode(this.visibleQuestionsCount) + g.b(g.a(Long.hashCode(this.id) * 31, 31, this.uploadKey), 31, this.questions);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.uploadKey;
        List<QuestionVO> list = this.questions;
        int i11 = this.visibleQuestionsCount;
        StringBuilder c11 = C2436a.c(j11, "ReviewFormQuestionsVO(id=", ", uploadKey=", str);
        c11.append(", questions=");
        c11.append(list);
        c11.append(", visibleQuestionsCount=");
        c11.append(i11);
        c11.append(")");
        return c11.toString();
    }
}
