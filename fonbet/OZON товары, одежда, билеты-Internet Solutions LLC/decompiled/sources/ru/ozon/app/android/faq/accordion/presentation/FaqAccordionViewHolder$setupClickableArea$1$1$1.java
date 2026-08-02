package ru.ozon.app.android.faq.accordion.presentation;

import Sc.o;
import WZ.t;
import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.faq.data.model.FaqVO$TopicVO$TopicItemVO;
import ru.ozon.app.android.faq.databinding.FaqAccordionBinding;
import ru.ozon.app.android.faq.state.FaqVOState;
import ru.ozon.app.android.faq.state.FaqVOStorage;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class FaqAccordionViewHolder$setupClickableArea$1$1$1 extends AbstractC7737t implements Function1<View, Unit> {
    final /* synthetic */ FaqVO$TopicVO$TopicItemVO $item;
    final /* synthetic */ FaqAccordionBinding $this_with;
    final /* synthetic */ FaqVO$TopicVO$TopicItemVO $this_with$1;
    final /* synthetic */ FaqAccordionViewHolder this$0;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "isIconUp", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.faq.accordion.presentation.FaqAccordionViewHolder$setupClickableArea$1$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<Boolean, Unit> {
        final /* synthetic */ FaqVO$TopicVO$TopicItemVO $item;
        final /* synthetic */ FaqAccordionViewHolder this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(FaqVO$TopicVO$TopicItemVO faqVO$TopicVO$TopicItemVO, FaqAccordionViewHolder faqAccordionViewHolder) {
            super(1);
            this.$item = faqVO$TopicVO$TopicItemVO;
            this.this$0 = faqAccordionViewHolder;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.f71690a;
        }

        public final void invoke(boolean z11) {
            FaqVOStorage faqVOStorage;
            FaqVOStorage faqVOStorage2;
            ((FaqVO$TopicVO$TopicItemVO.AccordionVO) this.$item).setDisclosureOpen(!((FaqVO$TopicVO$TopicItemVO.AccordionVO) r10).getIsDisclosureOpen());
            faqVOStorage = this.this$0.storage;
            String obj = ((FaqVO$TopicVO$TopicItemVO.AccordionVO) this.$item).getQuestion().toString();
            Intrinsics.checkNotNullExpressionValue(obj, "toString(...)");
            FaqVOState state = faqVOStorage.getState(obj);
            if (state != null) {
                FaqAccordionViewHolder faqAccordionViewHolder = this.this$0;
                FaqVO$TopicVO$TopicItemVO faqVO$TopicVO$TopicItemVO = this.$item;
                faqVOStorage2 = faqAccordionViewHolder.storage;
                FaqVO$TopicVO$TopicItemVO.AccordionVO accordionVO = (FaqVO$TopicVO$TopicItemVO.AccordionVO) faqVO$TopicVO$TopicItemVO;
                String obj2 = accordionVO.getQuestion().toString();
                Intrinsics.checkNotNullExpressionValue(obj2, "toString(...)");
                faqVOStorage2.update(obj2, FaqVOState.copy$default(state, accordionVO.getIsDisclosureOpen(), null, null, 6, null));
            }
            this.this$0.updateUiWithAnimationPayload((FaqVO$TopicVO$TopicItemVO.AccordionVO) this.$item);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FaqAccordionViewHolder$setupClickableArea$1$1$1(FaqVO$TopicVO$TopicItemVO faqVO$TopicVO$TopicItemVO, FaqAccordionBinding faqAccordionBinding, FaqVO$TopicVO$TopicItemVO faqVO$TopicVO$TopicItemVO2, FaqAccordionViewHolder faqAccordionViewHolder) {
        super(1);
        this.$item = faqVO$TopicVO$TopicItemVO;
        this.$this_with = faqAccordionBinding;
        this.$this_with$1 = faqVO$TopicVO$TopicItemVO2;
        this.this$0 = faqAccordionViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(View view) {
        invoke2(view);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(View it) {
        Function1 function1;
        t tokenizedEvent;
        ComposerReferences composerReferences;
        Intrinsics.checkNotNullParameter(it, "it");
        FaqVO$TopicVO$TopicItemVO faqVO$TopicVO$TopicItemVO = this.$item;
        if (faqVO$TopicVO$TopicItemVO instanceof FaqVO$TopicVO$TopicItemVO.AccordionVO) {
            this.$this_with.disclosureIconIv.onIconChange(new AnonymousClass1(faqVO$TopicVO$TopicItemVO, this.this$0));
        } else {
            if (!(faqVO$TopicVO$TopicItemVO instanceof FaqVO$TopicVO$TopicItemVO.LinkItemVO)) {
                throw new o();
            }
            AtomAction action = ((FaqVO$TopicVO$TopicItemVO.LinkItemVO) faqVO$TopicVO$TopicItemVO).getAction();
            if (action != null) {
                function1 = this.this$0.actionHandler;
                function1.invoke(action);
            }
        }
        FaqVO$TopicVO$TopicItemVO faqVO$TopicVO$TopicItemVO2 = this.$item;
        if ((faqVO$TopicVO$TopicItemVO2 instanceof FaqVO$TopicVO$TopicItemVO.AccordionVO) && ((FaqVO$TopicVO$TopicItemVO.AccordionVO) faqVO$TopicVO$TopicItemVO2).getIsDisclosureOpen() && (tokenizedEvent = this.$this_with$1.getTokenizedEvent()) != null) {
            composerReferences = this.this$0.refs;
            TokenizedAnalyticsExtensionsKt.processClickEvents$default(composerReferences.getTokenizedAnalytics(), tokenizedEvent, null, 2, null);
        }
    }
}
