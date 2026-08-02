package ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormQuestions;

import android.view.View;
import android.widget.LinearLayout;
import androidx.core.view.C5316f0;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormQuestions.ReviewFormQuestionsVO;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000bR\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0007\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormQuestions/QuestionVH;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Landroid/widget/LinearLayout;", "view", "<init>", "(Landroid/widget/LinearLayout;)V", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormQuestions/ReviewFormQuestionsVO$QuestionVO;", "question", "", "bind", "(Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormQuestions/ReviewFormQuestionsVO$QuestionVO;)V", "Landroid/widget/LinearLayout;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormQuestions/ReviewFormQuestionsVO$QuestionVO;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class QuestionVH extends RecyclerView.C {
    private ReviewFormQuestionsVO.QuestionVO question;

    @NotNull
    private final LinearLayout view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuestionVH(@NotNull LinearLayout view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        this.view = view;
    }

    public final void bind(@NotNull ReviewFormQuestionsVO.QuestionVO question) {
        Intrinsics.checkNotNullParameter(question, "question");
        this.question = question;
        View a11 = C5316f0.a(this.view, 0);
        TextAtomV2View textAtomV2View = a11 instanceof TextAtomV2View ? (TextAtomV2View) a11 : null;
        if (textAtomV2View != null) {
            TextHolderKt.bindOrGone$default(textAtomV2View, question.getTitle(), null, 2, null);
        }
        View a12 = C5316f0.a(this.view, 1);
        RecyclerView recyclerView = a12 instanceof RecyclerView ? (RecyclerView) a12 : null;
        Object adapter = recyclerView != null ? recyclerView.getAdapter() : null;
        AnswerListAdapter answerListAdapter = adapter instanceof AnswerListAdapter ? (AnswerListAdapter) adapter : null;
        if (answerListAdapter != null) {
            answerListAdapter.submitList(question.getAnswers());
        }
    }
}
