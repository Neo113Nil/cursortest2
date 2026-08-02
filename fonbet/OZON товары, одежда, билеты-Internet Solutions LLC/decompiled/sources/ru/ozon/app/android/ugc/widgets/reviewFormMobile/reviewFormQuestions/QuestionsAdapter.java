package ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormQuestions;

import WZ.l;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import androidx.recyclerview.widget.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.pdp.utils.MarginItemDecoration;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormQuestions.ReviewFormQuestionsVO;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u0000M\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0004*\u0001\u001e\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001b\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u001a\u001a\u00020\u00132\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001cR\u0018\u0010\b\u001a\u00060\u0006j\u0002`\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormQuestions/QuestionsAdapter;", "Landroidx/recyclerview/widget/t;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormQuestions/ReviewFormQuestionsVO$QuestionVO;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormQuestions/QuestionVH;", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "<init>", "(Lru/ozon/app/android/composer/ComposerReferences;LWZ/l;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormQuestions/QuestionVH;", "holder", "position", "", "onBindViewHolder", "(Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormQuestions/QuestionVH;I)V", "", "list", "Ljava/lang/Runnable;", "commitCallback", "submitList", "(Ljava/util/List;Ljava/lang/Runnable;)V", "Lru/ozon/app/android/composer/ComposerReferences;", "LWZ/l;", "ru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormQuestions/QuestionsAdapter$answerOnItemTouchListener$1", "answerOnItemTouchListener", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormQuestions/QuestionsAdapter$answerOnItemTouchListener$1;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class QuestionsAdapter extends t<ReviewFormQuestionsVO.QuestionVO, QuestionVH> {

    @NotNull
    private final QuestionsAdapter$answerOnItemTouchListener$1 answerOnItemTouchListener;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final l tokenizedAnalytics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v1, types: [ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormQuestions.QuestionsAdapter$answerOnItemTouchListener$1] */
    public QuestionsAdapter(@NotNull ComposerReferences refs, @NotNull l tokenizedAnalytics) {
        super(new i.d<ReviewFormQuestionsVO.QuestionVO>() { // from class: ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormQuestions.QuestionsAdapter.1
            @Override // androidx.recyclerview.widget.i.d
            public boolean areContentsTheSame(ReviewFormQuestionsVO.QuestionVO oldItem, ReviewFormQuestionsVO.QuestionVO newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return Intrinsics.d(oldItem, newItem);
            }

            @Override // androidx.recyclerview.widget.i.d
            public boolean areItemsTheSame(ReviewFormQuestionsVO.QuestionVO oldItem, ReviewFormQuestionsVO.QuestionVO newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return Intrinsics.d(oldItem.getId(), newItem.getId());
            }
        });
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.refs = refs;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.answerOnItemTouchListener = new RecyclerView.y() { // from class: ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormQuestions.QuestionsAdapter$answerOnItemTouchListener$1
            @Override // androidx.recyclerview.widget.RecyclerView.s
            public boolean onInterceptTouchEvent(RecyclerView rv, MotionEvent e11) {
                View findChildViewUnder;
                Intrinsics.checkNotNullParameter(rv, "rv");
                Intrinsics.checkNotNullParameter(e11, "e");
                if (e11.getAction() == 1 && (findChildViewUnder = rv.findChildViewUnder(e11.getX(), e11.getY())) != null) {
                    int childAdapterPosition = rv.getChildAdapterPosition(findChildViewUnder);
                    RecyclerView.o layoutManager = rv.getLayoutManager();
                    LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                    Integer valueOf = linearLayoutManager != null ? Integer.valueOf(linearLayoutManager.findLastVisibleItemPosition()) : null;
                    if (valueOf != null && childAdapterPosition == valueOf.intValue()) {
                        int dp_16 = Dimens.INSTANCE.getDP_16() + (findChildViewUnder.getRight() - rv.getWidth());
                        if (dp_16 > 0) {
                            rv.smoothScrollBy(dp_16, 0);
                        }
                    }
                }
                return false;
            }
        };
    }

    @Override // androidx.recyclerview.widget.t
    public void submitList(List<ReviewFormQuestionsVO.QuestionVO> list, Runnable commitCallback) {
        if (getCurrentList().isEmpty()) {
            submitList(list);
        } else {
            super.submitList(list, commitCallback);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull QuestionVH holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        ReviewFormQuestionsVO.QuestionVO item = getItem(position);
        Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
        holder.bind(item);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public QuestionVH onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        LinearLayout linearLayout = new LinearLayout(parent.getContext());
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout.setOrientation(1);
        Context context = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        Dimens dimens = Dimens.INSTANCE;
        layoutParams.setMargins(dimens.getDP_16(), ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, dimens.getDP_16(), ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
        textAtomV2View.setLayoutParams(layoutParams);
        linearLayout.addView(textAtomV2View);
        RecyclerView recyclerView = new RecyclerView(parent.getContext());
        recyclerView.setOverScrollMode(2);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setAdapter(new AnswerListAdapter(this.refs, this.tokenizedAnalytics));
        recyclerView.setItemAnimator(null);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 0, false));
        recyclerView.addItemDecoration(new MarginItemDecoration(dimens.getDP_6(), dimens.getDP_16()));
        recyclerView.setLayoutParams(new ConstraintLayout.b(-2, -2));
        ViewExtKt.updatePadding$default(recyclerView, 0, dimens.getDP_8(), 0, 0, 13, null);
        recyclerView.addOnItemTouchListener(this.answerOnItemTouchListener);
        linearLayout.addView(recyclerView);
        return new QuestionVH(linearLayout);
    }
}
