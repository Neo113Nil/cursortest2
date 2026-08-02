package ru.ozon.app.android.fresh.checkout.widgets.checkoutStickyTotal.presentation;

import Vg.c;
import Vg.f;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.fresh.checkout.domain.actionHandlers.CreateFreshOrderActionHandler;
import ru.ozon.app.android.fresh.checkout.domain.actionHandlers.CreateFreshOrderV2ActionHandler;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/uni/atoms/af/AtomAction;", "invoke", "(Lru/ozon/uni/atoms/af/AtomAction;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class CheckoutStickyTotalOverlayViewHolder$actionHandler$2 extends AbstractC7737t implements Function1<AtomAction, Boolean> {
    final /* synthetic */ CheckoutStickyTotalOverlayViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CheckoutStickyTotalOverlayViewHolder$actionHandler$2(CheckoutStickyTotalOverlayViewHolder checkoutStickyTotalOverlayViewHolder) {
        super(1);
        this.this$0 = checkoutStickyTotalOverlayViewHolder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(AtomAction action) {
        c customActionHandlersStore;
        c customActionHandlersStore2;
        Intrinsics.checkNotNullParameter(action, "action");
        String id2 = action.getId();
        if (Intrinsics.d(id2, "createFreshOrderV2")) {
            customActionHandlersStore2 = this.this$0.getCustomActionHandlersStore();
            f handler = customActionHandlersStore2.getHandler("createFreshOrderV2");
            CreateFreshOrderV2ActionHandler createFreshOrderV2ActionHandler = handler instanceof CreateFreshOrderV2ActionHandler ? (CreateFreshOrderV2ActionHandler) handler : null;
            if (createFreshOrderV2ActionHandler != null) {
                CheckoutStickyTotalVO checkoutStickyTotalVO = (CheckoutStickyTotalVO) this.this$0.getBoundData();
                createFreshOrderV2ActionHandler.setProgressBar(checkoutStickyTotalVO != null ? checkoutStickyTotalVO.getProgressBar() : null);
            }
        } else if (Intrinsics.d(id2, "createFreshOrder")) {
            customActionHandlersStore = this.this$0.getCustomActionHandlersStore();
            f handler2 = customActionHandlersStore.getHandler("createFreshOrder");
            CreateFreshOrderActionHandler createFreshOrderActionHandler = handler2 instanceof CreateFreshOrderActionHandler ? (CreateFreshOrderActionHandler) handler2 : null;
            if (createFreshOrderActionHandler != null) {
                CheckoutStickyTotalVO checkoutStickyTotalVO2 = (CheckoutStickyTotalVO) this.this$0.getBoundData();
                createFreshOrderActionHandler.setProgressBar(checkoutStickyTotalVO2 != null ? checkoutStickyTotalVO2.getProgressBar() : null);
            }
        }
        return Boolean.FALSE;
    }
}
