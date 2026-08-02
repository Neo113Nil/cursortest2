package ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormQuestions;

import WZ.l;
import android.view.View;
import androidx.camera.core.impl.Y;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.ConnectionResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.pdp.utils.VerticalMarginItemDecoration;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.presentation.ReviewFormViewModel;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.presentation.ViewIntent;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormQuestions.ReviewFormQuestionsVO;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u001e2\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003:\u0001\u001eB+\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\u0010\f\u001a\u00060\nj\u0002`\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00022\n\u0010\u0015\u001a\u00060\u0013j\u0002`\u0014H\u0014¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0019R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormQuestions/ReviewFormQuestionsVH;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormQuestions/ReviewFormQuestionsVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/presentation/ReviewFormViewModel;", "formViewModel", "Landroidx/recyclerview/widget/RecyclerView;", "questionsRv", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "<init>", "(Lru/ozon/app/android/ugc/widgets/reviewFormMobile/presentation/ReviewFormViewModel;Landroidx/recyclerview/widget/RecyclerView;Lru/ozon/app/android/composer/ComposerReferences;LWZ/l;)V", "", "diffFinished", "()V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormQuestions/ReviewFormQuestionsVO;Ll20/d;)V", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/presentation/ReviewFormViewModel;", "Landroidx/recyclerview/widget/RecyclerView;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormQuestions/QuestionsAdapter;", "questionsAdapter", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormQuestions/QuestionsAdapter;", "Companion", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ReviewFormQuestionsVH extends k<ReviewFormQuestionsVO> {

    @NotNull
    private final ReviewFormViewModel formViewModel;

    @NotNull
    private final QuestionsAdapter questionsAdapter;

    @NotNull
    private final RecyclerView questionsRv;

    @NotNull
    private final ComposerReferences refs;
    public static final int $stable = 8;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ReviewFormQuestionsVH(@NotNull ReviewFormViewModel formViewModel, @NotNull RecyclerView questionsRv, @NotNull ComposerReferences refs, @NotNull l tokenizedAnalytics) {
        super(r0);
        Intrinsics.checkNotNullParameter(formViewModel, "formViewModel");
        Intrinsics.checkNotNullParameter(questionsRv, "questionsRv");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        View rootView = questionsRv.getRootView();
        Intrinsics.checkNotNullExpressionValue(rootView, "getRootView(...)");
        this.formViewModel = formViewModel;
        this.questionsRv = questionsRv;
        this.refs = refs;
        QuestionsAdapter questionsAdapter = new QuestionsAdapter(refs, tokenizedAnalytics);
        this.questionsAdapter = questionsAdapter;
        questionsRv.setAdapter(questionsAdapter);
        questionsRv.addItemDecoration(new VerticalMarginItemDecoration(Dimens.INSTANCE.getDP_16(), 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void diffFinished() {
        final int bottom = this.questionsRv.getBottom();
        this.questionsRv.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormQuestions.ReviewFormQuestionsVH$diffFinished$$inlined$doOnNextLayout$1
            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int left, int top, int right, int bottom2, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                ComposerReferences composerReferences;
                View view2;
                RecyclerView composerRecyclerView;
                Intrinsics.checkNotNullParameter(view, "view");
                view.removeOnLayoutChangeListener(this);
                composerReferences = ReviewFormQuestionsVH.this.refs;
                ComponentCallbacksC5392m c11 = composerReferences.getContainer().c();
                if (c11 == null || (view2 = c11.getView()) == null || (composerRecyclerView = ComposerViewExtensionKt.composerRecyclerView(view2)) == null) {
                    return;
                }
                composerRecyclerView.smoothScrollBy(0, view.getBottom() - bottom, null, ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull ReviewFormQuestionsVO item, @NotNull d info) {
        Object obj;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.questionsAdapter.submitList(item.getQuestions().subList(0, item.getVisibleQuestionsCount()), new Y(this, 3));
        List<ReviewFormQuestionsVO.QuestionVO> questions = item.getQuestions();
        ArrayList arrayList = new ArrayList();
        for (ReviewFormQuestionsVO.QuestionVO questionVO : questions) {
            Iterator<T> it = questionVO.getAnswers().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                Boolean isSelected = ((ReviewFormQuestionsVO.QuestionVO.AnswerVO) obj).getTagButton().isSelected();
                if (isSelected != null ? isSelected.booleanValue() : false) {
                    break;
                }
            }
            ReviewFormQuestionsVO.QuestionVO.AnswerVO answerVO = (ReviewFormQuestionsVO.QuestionVO.AnswerVO) obj;
            Pair pair = answerVO != null ? new Pair(questionVO.getId(), answerVO.getId()) : null;
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        this.formViewModel.onViewIntent(new ViewIntent.QuestionsUpdated(item.getUploadKey(), U.s(arrayList)));
    }
}
