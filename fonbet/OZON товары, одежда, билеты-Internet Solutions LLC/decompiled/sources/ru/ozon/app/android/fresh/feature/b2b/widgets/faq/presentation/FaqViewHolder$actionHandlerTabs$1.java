package ru.ozon.app.android.fresh.feature.b2b.widgets.faq.presentation;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/uni/atoms/af/AtomAction;", "invoke", "(Lru/ozon/uni/atoms/af/AtomAction;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class FaqViewHolder$actionHandlerTabs$1 extends AbstractC7737t implements Function1<AtomAction, Boolean> {
    final /* synthetic */ FaqViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FaqViewHolder$actionHandlerTabs$1(FaqViewHolder faqViewHolder) {
        super(1);
        this.this$0 = faqViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(AtomAction it) {
        FaqViewModel faqViewModel;
        Intrinsics.checkNotNullParameter(it, "it");
        faqViewModel = this.this$0.viewModel;
        faqViewModel.discardFaqExpandedInfoData();
        return Boolean.FALSE;
    }
}
