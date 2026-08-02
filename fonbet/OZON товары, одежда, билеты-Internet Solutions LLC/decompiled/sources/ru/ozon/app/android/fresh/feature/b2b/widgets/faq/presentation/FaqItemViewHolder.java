package ru.ozon.app.android.fresh.feature.b2b.widgets.faq.presentation;

import WZ.l;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.helper.widget.Layer;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.feature.b2b.databinding.WidgetFaqItemBinding;
import ru.ozon.app.android.fresh.feature.b2b.widgets.faq.data.FaqAnswerExpandedInfo;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0001\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0013\u001a\u00020\u0006*\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0019R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0019R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001c¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/faq/presentation/FaqItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Lru/ozon/app/android/fresh/feature/b2b/databinding/WidgetFaqItemBinding;", "binding", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onAction", "Lru/ozon/app/android/fresh/feature/b2b/widgets/faq/data/FaqAnswerExpandedInfo;", "onAnswerExpanded", "LWZ/l;", "tokenizedAnalytics", "<init>", "(Lru/ozon/app/android/fresh/feature/b2b/databinding/WidgetFaqItemBinding;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;LWZ/l;)V", "Landroid/view/View;", "", "increaseHeight", "", "isDisclosureOpen", "disclosureAnimation", "(Landroid/view/View;IZ)V", "item", "bind", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/faq/data/FaqAnswerExpandedInfo;)V", "Lru/ozon/app/android/fresh/feature/b2b/databinding/WidgetFaqItemBinding;", "Lkotlin/jvm/functions/Function1;", "LWZ/l;", "answerMargin", "I", "questionMargin", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FaqItemViewHolder extends RecyclerView.C {
    private final int answerMargin;

    @NotNull
    private final WidgetFaqItemBinding binding;

    @NotNull
    private final Function1<AtomAction, Unit> onAction;

    @NotNull
    private final Function1<FaqAnswerExpandedInfo, Unit> onAnswerExpanded;
    private final int questionMargin;

    @NotNull
    private final l tokenizedAnalytics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FaqItemViewHolder(@NotNull WidgetFaqItemBinding binding, @NotNull Function1<? super AtomAction, Unit> onAction, @NotNull Function1<? super FaqAnswerExpandedInfo, Unit> onAnswerExpanded, @NotNull l tokenizedAnalytics) {
        super(binding.getConstraintLayout());
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        Intrinsics.checkNotNullParameter(onAnswerExpanded, "onAnswerExpanded");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.binding = binding;
        this.onAction = onAction;
        this.onAnswerExpanded = onAnswerExpanded;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.answerMargin = ResourceExtKt.toPx(8);
        this.questionMargin = ResourceExtKt.toPx(24);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void disclosureAnimation(final View view, int i11, final boolean z11) {
        int i12 = i11 + this.answerMargin;
        int measuredHeight = view.getMeasuredHeight();
        ValueAnimator ofInt = ValueAnimator.ofInt(view.getMeasuredHeight(), z11 ? measuredHeight + i12 : measuredHeight - i12);
        ofInt.setDuration(200L);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ru.ozon.app.android.fresh.feature.b2b.utils.UtilsKt$expandWithAnimation$2$1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator it) {
                Intrinsics.checkNotNullParameter(it, "it");
                View view2 = view;
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                Object animatedValue = it.getAnimatedValue();
                Intrinsics.g(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                layoutParams.height = ((Integer) animatedValue).intValue();
                view2.setLayoutParams(layoutParams);
            }
        });
        ofInt.addListener(new Animator.AnimatorListener() { // from class: ru.ozon.app.android.fresh.feature.b2b.widgets.faq.presentation.FaqItemViewHolder$disclosureAnimation$$inlined$expandWithAnimation$default$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@NotNull Animator animator) {
                WidgetFaqItemBinding widgetFaqItemBinding;
                if (z11) {
                    return;
                }
                widgetFaqItemBinding = this.binding;
                TextAtomV2View answer = widgetFaqItemBinding.answer;
                Intrinsics.checkNotNullExpressionValue(answer, "answer");
                ViewExtKt.gone(answer);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(@NotNull Animator animator) {
            }
        });
        ofInt.start();
    }

    public final void bind(@NotNull FaqAnswerExpandedInfo item) {
        int collapsedContentHeight;
        int i11;
        Intrinsics.checkNotNullParameter(item, "item");
        WidgetFaqItemBinding widgetFaqItemBinding = this.binding;
        widgetFaqItemBinding.disclosureButton.setState(item.getIsExpanded());
        TextAtomV2View question = widgetFaqItemBinding.question;
        Intrinsics.checkNotNullExpressionValue(question, "question");
        TextHolderKt.bind$default(question, item.getFaqItem().getQuestion(), null, 2, null);
        TextAtomV2View answer = widgetFaqItemBinding.answer;
        Intrinsics.checkNotNullExpressionValue(answer, "answer");
        TextHolderKt.bind(answer, item.getFaqItem().getAnswer(), this.onAction);
        TextAtomV2View answer2 = widgetFaqItemBinding.answer;
        Intrinsics.checkNotNullExpressionValue(answer2, "answer");
        answer2.setVisibility(item.getIsExpanded() ? 0 : 8);
        Layer clickableAreaF = widgetFaqItemBinding.clickableAreaF;
        Intrinsics.checkNotNullExpressionValue(clickableAreaF, "clickableAreaF");
        ViewExtKt.setOnClickListenerThrottle$default(clickableAreaF, 0L, new FaqItemViewHolder$bind$1$1(widgetFaqItemBinding, this, item), 1, null);
        ConstraintLayout constraintLayout = widgetFaqItemBinding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        if (item.getIsExpanded()) {
            collapsedContentHeight = item.getFaqItem().getCollapsedContentHeight() + item.getFaqItem().getDisclosureAnswerHeight() + this.answerMargin;
            i11 = this.questionMargin;
        } else {
            collapsedContentHeight = item.getFaqItem().getCollapsedContentHeight();
            i11 = this.questionMargin;
        }
        layoutParams.height = collapsedContentHeight + i11;
        constraintLayout.setLayoutParams(layoutParams);
    }
}
