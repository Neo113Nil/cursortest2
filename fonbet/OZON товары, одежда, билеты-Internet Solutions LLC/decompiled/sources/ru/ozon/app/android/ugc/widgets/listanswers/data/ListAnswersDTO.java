package ru.ozon.app.android.ugc.widgets.listanswers.data;

import G.g;
import Ns.b;
import T7.P;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.pdp.ui.configurators.ugc.common.SubmitDialog;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.app.android.ugc.widgets.common.MenuDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.app.android.ugc.widgets.singlequestion.data.SingleQuestionDTO;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.tag.TagV3Atom;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0002!\"B1\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010\u0018\u001a\u00020\nHÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006#"}, d2 = {"Lru/ozon/app/android/ugc/widgets/listanswers/data/ListAnswersDTO;", "", CommentV3DTO.HEADER_FIELD_NAME, "Lru/ozon/app/android/ugc/widgets/listanswers/data/ListAnswersDTO$Header;", "answers", "", "Lru/ozon/app/android/ugc/widgets/listanswers/data/ListAnswersDTO$Answer;", "moreAnswers", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "productID", "", "<init>", "(Lru/ozon/app/android/ugc/widgets/listanswers/data/ListAnswersDTO$Header;Ljava/util/List;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;J)V", "getHeader", "()Lru/ozon/app/android/ugc/widgets/listanswers/data/ListAnswersDTO$Header;", "getAnswers", "()Ljava/util/List;", "getMoreAnswers", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "getProductID", "()J", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Header", "Answer", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ListAnswersDTO {
    public static final int $stable = 8;

    @NotNull
    private final List<Answer> answers;
    private final Header header;
    private final ButtonV3Atom.SmallBorderlessButton moreAnswers;
    private final long productID;

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0087\b\u0018\u00002\u00020\u0001:\u0001/BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010%\u001a\u00020\tHÆ\u0003J\t\u0010&\u001a\u00020\u000bHÆ\u0003J\u0010\u0010'\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010\u001eJ\u0017\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000fHÆ\u0003Jf\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000fHÆ\u0001¢\u0006\u0002\u0010*J\u0013\u0010+\u001a\u00020\r2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020\u0003HÖ\u0001J\t\u0010.\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0015\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\f\u0010\u001eR\u001f\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u00060"}, d2 = {"Lru/ozon/app/android/ugc/widgets/listanswers/data/ListAnswersDTO$Answer;", "", "id", "", "author", "Lru/ozon/app/android/ugc/widgets/singlequestion/data/SingleQuestionDTO$AuthorQuestion$Author;", "badge", "Lru/ozon/uni/atoms/data/badge/Badge;", "answerText", "Lru/ozon/uni/atoms/data/text/TextDTO;", "buttons", "Lru/ozon/app/android/ugc/widgets/listanswers/data/ListAnswersDTO$Answer$AnswerButtons;", "isHighlighted", "", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(ILru/ozon/app/android/ugc/widgets/singlequestion/data/SingleQuestionDTO$AuthorQuestion$Author;Lru/ozon/uni/atoms/data/badge/Badge;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/ugc/widgets/listanswers/data/ListAnswersDTO$Answer$AnswerButtons;Ljava/lang/Boolean;Ljava/util/Map;)V", "getId", "()I", "getAuthor", "()Lru/ozon/app/android/ugc/widgets/singlequestion/data/SingleQuestionDTO$AuthorQuestion$Author;", "getBadge", "()Lru/ozon/uni/atoms/data/badge/Badge;", "getAnswerText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getButtons", "()Lru/ozon/app/android/ugc/widgets/listanswers/data/ListAnswersDTO$Answer$AnswerButtons;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(ILru/ozon/app/android/ugc/widgets/singlequestion/data/SingleQuestionDTO$AuthorQuestion$Author;Lru/ozon/uni/atoms/data/badge/Badge;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/ugc/widgets/listanswers/data/ListAnswersDTO$Answer$AnswerButtons;Ljava/lang/Boolean;Ljava/util/Map;)Lru/ozon/app/android/ugc/widgets/listanswers/data/ListAnswersDTO$Answer;", "equals", "other", "hashCode", "toString", "AnswerButtons", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class Answer {
        public static final int $stable = 8;

        @NotNull
        private final TextDTO answerText;

        @NotNull
        private final SingleQuestionDTO.AuthorQuestion.Author author;
        private final Badge badge;

        @NotNull
        private final AnswerButtons buttons;
        private final int id;
        private final Boolean isHighlighted;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001#B3\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010\u001a\u001a\u00020\nHÆ\u0003J?\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006$"}, d2 = {"Lru/ozon/app/android/ugc/widgets/listanswers/data/ListAnswersDTO$Answer$AnswerButtons;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "like", "Lru/ozon/uni/atoms/data/tag/TagV3Atom$TagAtom;", "dislike", "makeBest", "Lru/ozon/app/android/ugc/widgets/listanswers/data/ListAnswersDTO$Answer$AnswerButtons$MakeBestButton;", "menu", "Lru/ozon/app/android/ugc/widgets/common/MenuDTO;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/tag/TagV3Atom$TagAtom;Lru/ozon/uni/atoms/data/tag/TagV3Atom$TagAtom;Lru/ozon/app/android/ugc/widgets/listanswers/data/ListAnswersDTO$Answer$AnswerButtons$MakeBestButton;Lru/ozon/app/android/ugc/widgets/common/MenuDTO;)V", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getLike", "()Lru/ozon/uni/atoms/data/tag/TagV3Atom$TagAtom;", "getDislike", "getMakeBest", "()Lru/ozon/app/android/ugc/widgets/listanswers/data/ListAnswersDTO$Answer$AnswerButtons$MakeBestButton;", "getMenu", "()Lru/ozon/app/android/ugc/widgets/common/MenuDTO;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "MakeBestButton", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @j(generateAdapter = true)
        public static final /* data */ class AnswerButtons {
            public static final int $stable = 8;

            @NotNull
            private final TagV3Atom.TagAtom dislike;

            @NotNull
            private final TagV3Atom.TagAtom like;
            private final MakeBestButton makeBest;

            @NotNull
            private final MenuDTO menu;
            private final TextAtom title;

            @j(generateAdapter = true)
            @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/ugc/widgets/listanswers/data/ListAnswersDTO$Answer$AnswerButtons$MakeBestButton;", "", "button", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "submitDialog", "Lru/ozon/app/android/pdp/ui/configurators/ugc/common/SubmitDialog;", "<init>", "(Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;Lru/ozon/app/android/pdp/ui/configurators/ugc/common/SubmitDialog;)V", "getButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "getSubmitDialog", "()Lru/ozon/app/android/pdp/ui/configurators/ugc/common/SubmitDialog;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class MakeBestButton {
                public static final int $stable = SubmitDialog.$stable | ButtonV3Atom.SmallIconButton.$stable;

                @NotNull
                private final ButtonV3Atom.SmallIconButton button;

                @NotNull
                private final SubmitDialog submitDialog;

                public MakeBestButton(@NotNull ButtonV3Atom.SmallIconButton button, @NotNull SubmitDialog submitDialog) {
                    Intrinsics.checkNotNullParameter(button, "button");
                    Intrinsics.checkNotNullParameter(submitDialog, "submitDialog");
                    this.button = button;
                    this.submitDialog = submitDialog;
                }

                public static /* synthetic */ MakeBestButton copy$default(MakeBestButton makeBestButton, ButtonV3Atom.SmallIconButton smallIconButton, SubmitDialog submitDialog, int i11, Object obj) {
                    if ((i11 & 1) != 0) {
                        smallIconButton = makeBestButton.button;
                    }
                    if ((i11 & 2) != 0) {
                        submitDialog = makeBestButton.submitDialog;
                    }
                    return makeBestButton.copy(smallIconButton, submitDialog);
                }

                @NotNull
                /* renamed from: component1, reason: from getter */
                public final ButtonV3Atom.SmallIconButton getButton() {
                    return this.button;
                }

                @NotNull
                /* renamed from: component2, reason: from getter */
                public final SubmitDialog getSubmitDialog() {
                    return this.submitDialog;
                }

                @NotNull
                public final MakeBestButton copy(@NotNull ButtonV3Atom.SmallIconButton button, @NotNull SubmitDialog submitDialog) {
                    Intrinsics.checkNotNullParameter(button, "button");
                    Intrinsics.checkNotNullParameter(submitDialog, "submitDialog");
                    return new MakeBestButton(button, submitDialog);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof MakeBestButton)) {
                        return false;
                    }
                    MakeBestButton makeBestButton = (MakeBestButton) other;
                    return Intrinsics.d(this.button, makeBestButton.button) && Intrinsics.d(this.submitDialog, makeBestButton.submitDialog);
                }

                @NotNull
                public final ButtonV3Atom.SmallIconButton getButton() {
                    return this.button;
                }

                @NotNull
                public final SubmitDialog getSubmitDialog() {
                    return this.submitDialog;
                }

                public int hashCode() {
                    return this.submitDialog.hashCode() + (this.button.hashCode() * 31);
                }

                @NotNull
                public String toString() {
                    return "MakeBestButton(button=" + this.button + ", submitDialog=" + this.submitDialog + ")";
                }
            }

            public AnswerButtons(TextAtom textAtom, @NotNull TagV3Atom.TagAtom like, @NotNull TagV3Atom.TagAtom dislike, MakeBestButton makeBestButton, @NotNull MenuDTO menu) {
                Intrinsics.checkNotNullParameter(like, "like");
                Intrinsics.checkNotNullParameter(dislike, "dislike");
                Intrinsics.checkNotNullParameter(menu, "menu");
                this.title = textAtom;
                this.like = like;
                this.dislike = dislike;
                this.makeBest = makeBestButton;
                this.menu = menu;
            }

            public static /* synthetic */ AnswerButtons copy$default(AnswerButtons answerButtons, TextAtom textAtom, TagV3Atom.TagAtom tagAtom, TagV3Atom.TagAtom tagAtom2, MakeBestButton makeBestButton, MenuDTO menuDTO, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    textAtom = answerButtons.title;
                }
                if ((i11 & 2) != 0) {
                    tagAtom = answerButtons.like;
                }
                if ((i11 & 4) != 0) {
                    tagAtom2 = answerButtons.dislike;
                }
                if ((i11 & 8) != 0) {
                    makeBestButton = answerButtons.makeBest;
                }
                if ((i11 & 16) != 0) {
                    menuDTO = answerButtons.menu;
                }
                MenuDTO menuDTO2 = menuDTO;
                TagV3Atom.TagAtom tagAtom3 = tagAtom2;
                return answerButtons.copy(textAtom, tagAtom, tagAtom3, makeBestButton, menuDTO2);
            }

            /* renamed from: component1, reason: from getter */
            public final TextAtom getTitle() {
                return this.title;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final TagV3Atom.TagAtom getLike() {
                return this.like;
            }

            @NotNull
            /* renamed from: component3, reason: from getter */
            public final TagV3Atom.TagAtom getDislike() {
                return this.dislike;
            }

            /* renamed from: component4, reason: from getter */
            public final MakeBestButton getMakeBest() {
                return this.makeBest;
            }

            @NotNull
            /* renamed from: component5, reason: from getter */
            public final MenuDTO getMenu() {
                return this.menu;
            }

            @NotNull
            public final AnswerButtons copy(TextAtom title, @NotNull TagV3Atom.TagAtom like, @NotNull TagV3Atom.TagAtom dislike, MakeBestButton makeBest, @NotNull MenuDTO menu) {
                Intrinsics.checkNotNullParameter(like, "like");
                Intrinsics.checkNotNullParameter(dislike, "dislike");
                Intrinsics.checkNotNullParameter(menu, "menu");
                return new AnswerButtons(title, like, dislike, makeBest, menu);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof AnswerButtons)) {
                    return false;
                }
                AnswerButtons answerButtons = (AnswerButtons) other;
                return Intrinsics.d(this.title, answerButtons.title) && Intrinsics.d(this.like, answerButtons.like) && Intrinsics.d(this.dislike, answerButtons.dislike) && Intrinsics.d(this.makeBest, answerButtons.makeBest) && Intrinsics.d(this.menu, answerButtons.menu);
            }

            @NotNull
            public final TagV3Atom.TagAtom getDislike() {
                return this.dislike;
            }

            @NotNull
            public final TagV3Atom.TagAtom getLike() {
                return this.like;
            }

            public final MakeBestButton getMakeBest() {
                return this.makeBest;
            }

            @NotNull
            public final MenuDTO getMenu() {
                return this.menu;
            }

            public final TextAtom getTitle() {
                return this.title;
            }

            public int hashCode() {
                TextAtom textAtom = this.title;
                int hashCode = (this.dislike.hashCode() + ((this.like.hashCode() + ((textAtom == null ? 0 : textAtom.hashCode()) * 31)) * 31)) * 31;
                MakeBestButton makeBestButton = this.makeBest;
                return this.menu.hashCode() + ((hashCode + (makeBestButton != null ? makeBestButton.hashCode() : 0)) * 31);
            }

            @NotNull
            public String toString() {
                return "AnswerButtons(title=" + this.title + ", like=" + this.like + ", dislike=" + this.dislike + ", makeBest=" + this.makeBest + ", menu=" + this.menu + ")";
            }
        }

        public Answer(int i11, @NotNull SingleQuestionDTO.AuthorQuestion.Author author, Badge badge, @NotNull TextDTO answerText, @NotNull AnswerButtons buttons, Boolean bool, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(author, "author");
            Intrinsics.checkNotNullParameter(answerText, "answerText");
            Intrinsics.checkNotNullParameter(buttons, "buttons");
            this.id = i11;
            this.author = author;
            this.badge = badge;
            this.answerText = answerText;
            this.buttons = buttons;
            this.isHighlighted = bool;
            this.trackingInfo = map;
        }

        public static /* synthetic */ Answer copy$default(Answer answer, int i11, SingleQuestionDTO.AuthorQuestion.Author author, Badge badge, TextDTO textDTO, AnswerButtons answerButtons, Boolean bool, Map map, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = answer.id;
            }
            if ((i12 & 2) != 0) {
                author = answer.author;
            }
            if ((i12 & 4) != 0) {
                badge = answer.badge;
            }
            if ((i12 & 8) != 0) {
                textDTO = answer.answerText;
            }
            if ((i12 & 16) != 0) {
                answerButtons = answer.buttons;
            }
            if ((i12 & 32) != 0) {
                bool = answer.isHighlighted;
            }
            if ((i12 & 64) != 0) {
                map = answer.trackingInfo;
            }
            Boolean bool2 = bool;
            Map map2 = map;
            AnswerButtons answerButtons2 = answerButtons;
            Badge badge2 = badge;
            return answer.copy(i11, author, badge2, textDTO, answerButtons2, bool2, map2);
        }

        /* renamed from: component1, reason: from getter */
        public final int getId() {
            return this.id;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final SingleQuestionDTO.AuthorQuestion.Author getAuthor() {
            return this.author;
        }

        /* renamed from: component3, reason: from getter */
        public final Badge getBadge() {
            return this.badge;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final TextDTO getAnswerText() {
            return this.answerText;
        }

        @NotNull
        /* renamed from: component5, reason: from getter */
        public final AnswerButtons getButtons() {
            return this.buttons;
        }

        /* renamed from: component6, reason: from getter */
        public final Boolean getIsHighlighted() {
            return this.isHighlighted;
        }

        public final Map<String, TokenizedTrackingInfo> component7() {
            return this.trackingInfo;
        }

        @NotNull
        public final Answer copy(int id2, @NotNull SingleQuestionDTO.AuthorQuestion.Author author, Badge badge, @NotNull TextDTO answerText, @NotNull AnswerButtons buttons, Boolean isHighlighted, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(author, "author");
            Intrinsics.checkNotNullParameter(answerText, "answerText");
            Intrinsics.checkNotNullParameter(buttons, "buttons");
            return new Answer(id2, author, badge, answerText, buttons, isHighlighted, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Answer)) {
                return false;
            }
            Answer answer = (Answer) other;
            return this.id == answer.id && Intrinsics.d(this.author, answer.author) && Intrinsics.d(this.badge, answer.badge) && Intrinsics.d(this.answerText, answer.answerText) && Intrinsics.d(this.buttons, answer.buttons) && Intrinsics.d(this.isHighlighted, answer.isHighlighted) && Intrinsics.d(this.trackingInfo, answer.trackingInfo);
        }

        @NotNull
        public final TextDTO getAnswerText() {
            return this.answerText;
        }

        @NotNull
        public final SingleQuestionDTO.AuthorQuestion.Author getAuthor() {
            return this.author;
        }

        public final Badge getBadge() {
            return this.badge;
        }

        @NotNull
        public final AnswerButtons getButtons() {
            return this.buttons;
        }

        public final int getId() {
            return this.id;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int hashCode = (this.author.hashCode() + (Integer.hashCode(this.id) * 31)) * 31;
            Badge badge = this.badge;
            int hashCode2 = (this.buttons.hashCode() + b.a(this.answerText, (hashCode + (badge == null ? 0 : badge.hashCode())) * 31, 31)) * 31;
            Boolean bool = this.isHighlighted;
            int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode3 + (map != null ? map.hashCode() : 0);
        }

        public final Boolean isHighlighted() {
            return this.isHighlighted;
        }

        @NotNull
        public String toString() {
            int i11 = this.id;
            SingleQuestionDTO.AuthorQuestion.Author author = this.author;
            Badge badge = this.badge;
            TextDTO textDTO = this.answerText;
            AnswerButtons answerButtons = this.buttons;
            Boolean bool = this.isHighlighted;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder sb2 = new StringBuilder("Answer(id=");
            sb2.append(i11);
            sb2.append(", author=");
            sb2.append(author);
            sb2.append(", badge=");
            sb2.append(badge);
            sb2.append(", answerText=");
            sb2.append(textDTO);
            sb2.append(", buttons=");
            sb2.append(answerButtons);
            sb2.append(", isHighlighted=");
            sb2.append(bool);
            sb2.append(", trackingInfo=");
            return P.f(sb2, map, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJ$\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/ugc/widgets/listanswers/data/ListAnswersDTO$Header;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "count", "", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;)V", "getTitle", "()Ljava/lang/String;", "getCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "copy", "(Ljava/lang/String;Ljava/lang/Integer;)Lru/ozon/app/android/ugc/widgets/listanswers/data/ListAnswersDTO$Header;", "equals", "", "other", "hashCode", "toString", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Header {
        public static final int $stable = 0;
        private final Integer count;

        @NotNull
        private final String title;

        public Header(@NotNull String title, Integer num) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.title = title;
            this.count = num;
        }

        public static /* synthetic */ Header copy$default(Header header, String str, Integer num, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = header.title;
            }
            if ((i11 & 2) != 0) {
                num = header.count;
            }
            return header.copy(str, num);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final Integer getCount() {
            return this.count;
        }

        @NotNull
        public final Header copy(@NotNull String title, Integer count) {
            Intrinsics.checkNotNullParameter(title, "title");
            return new Header(title, count);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Header)) {
                return false;
            }
            Header header = (Header) other;
            return Intrinsics.d(this.title, header.title) && Intrinsics.d(this.count, header.count);
        }

        public final Integer getCount() {
            return this.count;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            Integer num = this.count;
            return hashCode + (num == null ? 0 : num.hashCode());
        }

        @NotNull
        public String toString() {
            return "Header(title=" + this.title + ", count=" + this.count + ")";
        }
    }

    public ListAnswersDTO(Header header, @NotNull List<Answer> answers, ButtonV3Atom.SmallBorderlessButton smallBorderlessButton, long j11) {
        Intrinsics.checkNotNullParameter(answers, "answers");
        this.header = header;
        this.answers = answers;
        this.moreAnswers = smallBorderlessButton;
        this.productID = j11;
    }

    public static /* synthetic */ ListAnswersDTO copy$default(ListAnswersDTO listAnswersDTO, Header header, List list, ButtonV3Atom.SmallBorderlessButton smallBorderlessButton, long j11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            header = listAnswersDTO.header;
        }
        if ((i11 & 2) != 0) {
            list = listAnswersDTO.answers;
        }
        if ((i11 & 4) != 0) {
            smallBorderlessButton = listAnswersDTO.moreAnswers;
        }
        if ((i11 & 8) != 0) {
            j11 = listAnswersDTO.productID;
        }
        ButtonV3Atom.SmallBorderlessButton smallBorderlessButton2 = smallBorderlessButton;
        return listAnswersDTO.copy(header, list, smallBorderlessButton2, j11);
    }

    /* renamed from: component1, reason: from getter */
    public final Header getHeader() {
        return this.header;
    }

    @NotNull
    public final List<Answer> component2() {
        return this.answers;
    }

    /* renamed from: component3, reason: from getter */
    public final ButtonV3Atom.SmallBorderlessButton getMoreAnswers() {
        return this.moreAnswers;
    }

    /* renamed from: component4, reason: from getter */
    public final long getProductID() {
        return this.productID;
    }

    @NotNull
    public final ListAnswersDTO copy(Header header, @NotNull List<Answer> answers, ButtonV3Atom.SmallBorderlessButton moreAnswers, long productID) {
        Intrinsics.checkNotNullParameter(answers, "answers");
        return new ListAnswersDTO(header, answers, moreAnswers, productID);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ListAnswersDTO)) {
            return false;
        }
        ListAnswersDTO listAnswersDTO = (ListAnswersDTO) other;
        return Intrinsics.d(this.header, listAnswersDTO.header) && Intrinsics.d(this.answers, listAnswersDTO.answers) && Intrinsics.d(this.moreAnswers, listAnswersDTO.moreAnswers) && this.productID == listAnswersDTO.productID;
    }

    @NotNull
    public final List<Answer> getAnswers() {
        return this.answers;
    }

    public final Header getHeader() {
        return this.header;
    }

    public final ButtonV3Atom.SmallBorderlessButton getMoreAnswers() {
        return this.moreAnswers;
    }

    public final long getProductID() {
        return this.productID;
    }

    public int hashCode() {
        Header header = this.header;
        int b11 = g.b((header == null ? 0 : header.hashCode()) * 31, 31, this.answers);
        ButtonV3Atom.SmallBorderlessButton smallBorderlessButton = this.moreAnswers;
        return Long.hashCode(this.productID) + ((b11 + (smallBorderlessButton != null ? smallBorderlessButton.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        return "ListAnswersDTO(header=" + this.header + ", answers=" + this.answers + ", moreAnswers=" + this.moreAnswers + ", productID=" + this.productID + ")";
    }
}
