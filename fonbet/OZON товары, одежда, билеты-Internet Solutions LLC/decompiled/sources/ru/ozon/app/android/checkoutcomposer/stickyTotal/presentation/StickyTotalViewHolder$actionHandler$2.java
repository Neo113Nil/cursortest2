package ru.ozon.app.android.checkoutcomposer.stickyTotal.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.checkout.prefetch.CheckoutPrefetchController;
import ru.ozon.app.android.payment.ui.createorder.CreateAndPayViewModel;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class StickyTotalViewHolder$actionHandler$2 extends AbstractC7737t implements Function1<AtomAction.ComposerAction, Unit> {
    final /* synthetic */ StickyTotalViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StickyTotalViewHolder$actionHandler$2(StickyTotalViewHolder stickyTotalViewHolder) {
        super(1);
        this.this$0 = stickyTotalViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction.ComposerAction composerAction) {
        invoke2(composerAction);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AtomAction.ComposerAction it) {
        CreateAndPayViewModel createAndPayViewModel;
        CheckoutPrefetchController checkoutPrefetchController;
        CreateAndPayViewModel createAndPayViewModel2;
        Intrinsics.checkNotNullParameter(it, "it");
        String actionName = it.getActionName();
        if (Intrinsics.d(actionName, "createOrder")) {
            createAndPayViewModel2 = this.this$0.createAndPayViewModel;
            CreateAndPayViewModel.createOrder$default(createAndPayViewModel2, it.getActionName(), this.this$0.getTrackingData(), null, 4, null);
        } else if (Intrinsics.d(actionName, "createOrderV2")) {
            createAndPayViewModel = this.this$0.createAndPayViewModel;
            CreateAndPayViewModel.createOrderV2$default(createAndPayViewModel, it.getActionName(), this.this$0.getTrackingData(), null, null, 12, null);
        }
        checkoutPrefetchController = this.this$0.checkoutPrefetchController;
        checkoutPrefetchController.removeAllCache();
    }
}
