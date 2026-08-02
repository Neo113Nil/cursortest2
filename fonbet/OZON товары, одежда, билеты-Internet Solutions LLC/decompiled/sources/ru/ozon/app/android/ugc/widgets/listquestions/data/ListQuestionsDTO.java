package ru.ozon.app.android.ugc.widgets.listquestions.data;

import P4.f;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.ugc.widgets.listanswers.data.ListAnswersDTO;
import ru.ozon.app.android.ugc.widgets.singlequestion.data.SingleQuestionDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u001cB'\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\bHÆ\u0003J/\u0010\u0014\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/ugc/widgets/listquestions/data/ListQuestionsDTO;", "", "elements", "", "Lru/ozon/app/android/ugc/widgets/listquestions/data/ListQuestionsDTO$Element;", "moreQuestions", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleCounter;", "productID", "", "<init>", "(Ljava/util/List;Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleCounter;J)V", "getElements", "()Ljava/util/List;", "getMoreQuestions", "()Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleCounter;", "getProductID", "()J", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Element", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ListQuestionsDTO {
    public static final int $stable = 8;

    @NotNull
    private final List<Element> elements;
    private final CellAtom.CellAtomWithSubtitle.CellWithSubtitleCounter moreQuestions;
    private final long productID;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/ugc/widgets/listquestions/data/ListQuestionsDTO$Element;", "", "question", "Lru/ozon/app/android/ugc/widgets/singlequestion/data/SingleQuestionDTO$AuthorQuestion;", "answer", "Lru/ozon/app/android/ugc/widgets/listanswers/data/ListAnswersDTO$Answer;", "moreAnswers", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "<init>", "(Lru/ozon/app/android/ugc/widgets/singlequestion/data/SingleQuestionDTO$AuthorQuestion;Lru/ozon/app/android/ugc/widgets/listanswers/data/ListAnswersDTO$Answer;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;)V", "getQuestion", "()Lru/ozon/app/android/ugc/widgets/singlequestion/data/SingleQuestionDTO$AuthorQuestion;", "getAnswer", "()Lru/ozon/app/android/ugc/widgets/listanswers/data/ListAnswersDTO$Answer;", "getMoreAnswers", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Element {
        public static final int $stable = 8;
        private final ListAnswersDTO.Answer answer;
        private final ButtonV3Atom.SmallBorderlessButton moreAnswers;

        @NotNull
        private final SingleQuestionDTO.AuthorQuestion question;

        public Element(@NotNull SingleQuestionDTO.AuthorQuestion question, ListAnswersDTO.Answer answer, ButtonV3Atom.SmallBorderlessButton smallBorderlessButton) {
            Intrinsics.checkNotNullParameter(question, "question");
            this.question = question;
            this.answer = answer;
            this.moreAnswers = smallBorderlessButton;
        }

        public static /* synthetic */ Element copy$default(Element element, SingleQuestionDTO.AuthorQuestion authorQuestion, ListAnswersDTO.Answer answer, ButtonV3Atom.SmallBorderlessButton smallBorderlessButton, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                authorQuestion = element.question;
            }
            if ((i11 & 2) != 0) {
                answer = element.answer;
            }
            if ((i11 & 4) != 0) {
                smallBorderlessButton = element.moreAnswers;
            }
            return element.copy(authorQuestion, answer, smallBorderlessButton);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final SingleQuestionDTO.AuthorQuestion getQuestion() {
            return this.question;
        }

        /* renamed from: component2, reason: from getter */
        public final ListAnswersDTO.Answer getAnswer() {
            return this.answer;
        }

        /* renamed from: component3, reason: from getter */
        public final ButtonV3Atom.SmallBorderlessButton getMoreAnswers() {
            return this.moreAnswers;
        }

        @NotNull
        public final Element copy(@NotNull SingleQuestionDTO.AuthorQuestion question, ListAnswersDTO.Answer answer, ButtonV3Atom.SmallBorderlessButton moreAnswers) {
            Intrinsics.checkNotNullParameter(question, "question");
            return new Element(question, answer, moreAnswers);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Element)) {
                return false;
            }
            Element element = (Element) other;
            return Intrinsics.d(this.question, element.question) && Intrinsics.d(this.answer, element.answer) && Intrinsics.d(this.moreAnswers, element.moreAnswers);
        }

        public final ListAnswersDTO.Answer getAnswer() {
            return this.answer;
        }

        public final ButtonV3Atom.SmallBorderlessButton getMoreAnswers() {
            return this.moreAnswers;
        }

        @NotNull
        public final SingleQuestionDTO.AuthorQuestion getQuestion() {
            return this.question;
        }

        public int hashCode() {
            int hashCode = this.question.hashCode() * 31;
            ListAnswersDTO.Answer answer = this.answer;
            int hashCode2 = (hashCode + (answer == null ? 0 : answer.hashCode())) * 31;
            ButtonV3Atom.SmallBorderlessButton smallBorderlessButton = this.moreAnswers;
            return hashCode2 + (smallBorderlessButton != null ? smallBorderlessButton.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Element(question=" + this.question + ", answer=" + this.answer + ", moreAnswers=" + this.moreAnswers + ")";
        }
    }

    public ListQuestionsDTO(@NotNull List<Element> elements, CellAtom.CellAtomWithSubtitle.CellWithSubtitleCounter cellWithSubtitleCounter, long j11) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.elements = elements;
        this.moreQuestions = cellWithSubtitleCounter;
        this.productID = j11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ListQuestionsDTO copy$default(ListQuestionsDTO listQuestionsDTO, List list, CellAtom.CellAtomWithSubtitle.CellWithSubtitleCounter cellWithSubtitleCounter, long j11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = listQuestionsDTO.elements;
        }
        if ((i11 & 2) != 0) {
            cellWithSubtitleCounter = listQuestionsDTO.moreQuestions;
        }
        if ((i11 & 4) != 0) {
            j11 = listQuestionsDTO.productID;
        }
        return listQuestionsDTO.copy(list, cellWithSubtitleCounter, j11);
    }

    @NotNull
    public final List<Element> component1() {
        return this.elements;
    }

    /* renamed from: component2, reason: from getter */
    public final CellAtom.CellAtomWithSubtitle.CellWithSubtitleCounter getMoreQuestions() {
        return this.moreQuestions;
    }

    /* renamed from: component3, reason: from getter */
    public final long getProductID() {
        return this.productID;
    }

    @NotNull
    public final ListQuestionsDTO copy(@NotNull List<Element> elements, CellAtom.CellAtomWithSubtitle.CellWithSubtitleCounter moreQuestions, long productID) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new ListQuestionsDTO(elements, moreQuestions, productID);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ListQuestionsDTO)) {
            return false;
        }
        ListQuestionsDTO listQuestionsDTO = (ListQuestionsDTO) other;
        return Intrinsics.d(this.elements, listQuestionsDTO.elements) && Intrinsics.d(this.moreQuestions, listQuestionsDTO.moreQuestions) && this.productID == listQuestionsDTO.productID;
    }

    @NotNull
    public final List<Element> getElements() {
        return this.elements;
    }

    public final CellAtom.CellAtomWithSubtitle.CellWithSubtitleCounter getMoreQuestions() {
        return this.moreQuestions;
    }

    public final long getProductID() {
        return this.productID;
    }

    public int hashCode() {
        int hashCode = this.elements.hashCode() * 31;
        CellAtom.CellAtomWithSubtitle.CellWithSubtitleCounter cellWithSubtitleCounter = this.moreQuestions;
        return Long.hashCode(this.productID) + ((hashCode + (cellWithSubtitleCounter == null ? 0 : cellWithSubtitleCounter.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        List<Element> list = this.elements;
        CellAtom.CellAtomWithSubtitle.CellWithSubtitleCounter cellWithSubtitleCounter = this.moreQuestions;
        long j11 = this.productID;
        StringBuilder sb2 = new StringBuilder("ListQuestionsDTO(elements=");
        sb2.append(list);
        sb2.append(", moreQuestions=");
        sb2.append(cellWithSubtitleCounter);
        sb2.append(", productID=");
        return f.a(j11, ")", sb2);
    }
}
