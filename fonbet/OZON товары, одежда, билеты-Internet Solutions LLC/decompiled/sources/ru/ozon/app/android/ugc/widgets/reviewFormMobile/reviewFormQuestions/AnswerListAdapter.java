package ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormQuestions;

import WZ.l;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import androidx.recyclerview.widget.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormQuestions.ReviewFormQuestionsVO;
import ru.ozon.uni.android.controls.tag.TagButtonView;
import ru.ozon.uni.atoms.v3.holders.controls.tag.TagButtonHolderKt;
import vW.ViewOnClickListenerC10284a;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001aB\u001b\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0016R\u0018\u0010\b\u001a\u00060\u0006j\u0002`\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0017R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormQuestions/AnswerListAdapter;", "Landroidx/recyclerview/widget/t;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormQuestions/ReviewFormQuestionsVO$QuestionVO$AnswerVO;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormQuestions/AnswerListAdapter$AnswerViewHolder;", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "<init>", "(Lru/ozon/app/android/composer/ComposerReferences;LWZ/l;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormQuestions/AnswerListAdapter$AnswerViewHolder;", "holder", "position", "", "onBindViewHolder", "(Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormQuestions/AnswerListAdapter$AnswerViewHolder;I)V", "Lru/ozon/app/android/composer/ComposerReferences;", "LWZ/l;", "selectedAnswer", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormQuestions/ReviewFormQuestionsVO$QuestionVO$AnswerVO;", "AnswerViewHolder", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AnswerListAdapter extends t<ReviewFormQuestionsVO.QuestionVO.AnswerVO, AnswerViewHolder> {

    @NotNull
    private final ComposerReferences refs;
    private ReviewFormQuestionsVO.QuestionVO.AnswerVO selectedAnswer;

    @NotNull
    private final l tokenizedAnalytics;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormQuestions/AnswerListAdapter$AnswerViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Lru/ozon/uni/android/controls/tag/TagButtonView;", "tagButtonView", "<init>", "(Lru/ozon/uni/android/controls/tag/TagButtonView;)V", "Lru/ozon/uni/android/controls/tag/TagButtonView;", "getTagButtonView", "()Lru/ozon/uni/android/controls/tag/TagButtonView;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AnswerViewHolder extends RecyclerView.C {
        public static final int $stable = TagButtonView.$stable;

        @NotNull
        private final TagButtonView tagButtonView;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnswerViewHolder(@NotNull TagButtonView tagButtonView) {
            super(tagButtonView);
            Intrinsics.checkNotNullParameter(tagButtonView, "tagButtonView");
            this.tagButtonView = tagButtonView;
        }

        @NotNull
        public final TagButtonView getTagButtonView() {
            return this.tagButtonView;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnswerListAdapter(@NotNull ComposerReferences refs, @NotNull l tokenizedAnalytics) {
        super(new i.d<ReviewFormQuestionsVO.QuestionVO.AnswerVO>() { // from class: ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormQuestions.AnswerListAdapter.1
            @Override // androidx.recyclerview.widget.i.d
            public boolean areContentsTheSame(ReviewFormQuestionsVO.QuestionVO.AnswerVO oldItem, ReviewFormQuestionsVO.QuestionVO.AnswerVO newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return Intrinsics.d(oldItem, newItem);
            }

            @Override // androidx.recyclerview.widget.i.d
            public boolean areItemsTheSame(ReviewFormQuestionsVO.QuestionVO.AnswerVO oldItem, ReviewFormQuestionsVO.QuestionVO.AnswerVO newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return Intrinsics.d(oldItem.getId(), newItem.getId());
            }
        });
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.refs = refs;
        this.tokenizedAnalytics = tokenizedAnalytics;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$3$lambda$2$lambda$1(TagButtonView tagButtonView, AnswerListAdapter answerListAdapter, ReviewFormQuestionsVO.QuestionVO.AnswerVO answerVO, View view) {
        boolean z11;
        if (tagButtonView.isSelected()) {
            answerListAdapter.selectedAnswer = null;
            z11 = false;
        } else {
            answerListAdapter.selectedAnswer = answerVO;
            WZ.t clickEvent = answerVO.getClickEvent();
            if (clickEvent != null) {
                TokenizedAnalyticsExtensionsKt.processClickEvents$default(answerListAdapter.tokenizedAnalytics, clickEvent, null, 2, null);
            }
            z11 = true;
        }
        answerListAdapter.refs.getController().update(new AnswerStateUpdate(answerVO.getQuestionId(), answerVO.getId(), z11));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull AnswerViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        ReviewFormQuestionsVO.QuestionVO.AnswerVO item = getItem(position);
        if (item != null) {
            if (Intrinsics.d(item.getTagButton().isSelected(), Boolean.TRUE)) {
                this.selectedAnswer = item;
            }
            TagButtonView tagButtonView = holder.getTagButtonView();
            TagButtonHolderKt.bindOrGone$default(tagButtonView, item.getTagButton(), null, 2, null);
            String id2 = item.getId();
            ReviewFormQuestionsVO.QuestionVO.AnswerVO answerVO = this.selectedAnswer;
            tagButtonView.setSelected(Intrinsics.d(id2, answerVO != null ? answerVO.getId() : null));
            tagButtonView.setOnClickListener(new ViewOnClickListenerC10284a(tagButtonView, this, item, 0));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public AnswerViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        TagButtonView tagButtonView = new TagButtonView(context, null, 0, 0, 14, null);
        tagButtonView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        return new AnswerViewHolder(tagButtonView);
    }
}
