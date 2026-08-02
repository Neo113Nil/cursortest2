package ru.ozon.app.android.fresh.feature.b2b.widgets.faq.presentation;

import WZ.l;
import WZ.t;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.fresh.feature.b2b.databinding.WidgetFaqItemBinding;
import ru.ozon.app.android.fresh.feature.b2b.widgets.faq.data.FaqAnswerExpandedInfo;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class FaqItemViewHolder$bind$1$1 extends AbstractC7737t implements Function1<View, Unit> {
    final /* synthetic */ FaqAnswerExpandedInfo $item;
    final /* synthetic */ WidgetFaqItemBinding $this_with;
    final /* synthetic */ FaqItemViewHolder this$0;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "isIconUp", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.fresh.feature.b2b.widgets.faq.presentation.FaqItemViewHolder$bind$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<Boolean, Unit> {
        final /* synthetic */ FaqAnswerExpandedInfo $item;
        final /* synthetic */ WidgetFaqItemBinding $this_with;
        final /* synthetic */ FaqItemViewHolder this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(WidgetFaqItemBinding widgetFaqItemBinding, FaqItemViewHolder faqItemViewHolder, FaqAnswerExpandedInfo faqAnswerExpandedInfo) {
            super(1);
            this.$this_with = widgetFaqItemBinding;
            this.this$0 = faqItemViewHolder;
            this.$item = faqAnswerExpandedInfo;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.f71690a;
        }

        public final void invoke(boolean z11) {
            Function1 function1;
            l lVar;
            if (z11) {
                TextAtomV2View answer = this.$this_with.answer;
                Intrinsics.checkNotNullExpressionValue(answer, "answer");
                ViewExtKt.show(answer);
            }
            function1 = this.this$0.onAnswerExpanded;
            function1.invoke(new FaqAnswerExpandedInfo(this.$item.getFaqItem(), z11));
            FaqItemViewHolder faqItemViewHolder = this.this$0;
            ConstraintLayout constraintLayout = this.$this_with.getConstraintLayout();
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
            faqItemViewHolder.disclosureAnimation(constraintLayout, this.$item.getFaqItem().getDisclosureAnswerHeight(), z11);
            t tokenizedEvent = this.$item.getFaqItem().getTokenizedEvent();
            if (tokenizedEvent != null) {
                lVar = this.this$0.tokenizedAnalytics;
                TokenizedAnalyticsExtensionsKt.processClickEvents$default(lVar, tokenizedEvent, null, 2, null);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FaqItemViewHolder$bind$1$1(WidgetFaqItemBinding widgetFaqItemBinding, FaqItemViewHolder faqItemViewHolder, FaqAnswerExpandedInfo faqAnswerExpandedInfo) {
        super(1);
        this.$this_with = widgetFaqItemBinding;
        this.this$0 = faqItemViewHolder;
        this.$item = faqAnswerExpandedInfo;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(View view) {
        invoke2(view);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        WidgetFaqItemBinding widgetFaqItemBinding = this.$this_with;
        widgetFaqItemBinding.disclosureButton.onIconChange(new AnonymousClass1(widgetFaqItemBinding, this.this$0, this.$item));
    }
}
