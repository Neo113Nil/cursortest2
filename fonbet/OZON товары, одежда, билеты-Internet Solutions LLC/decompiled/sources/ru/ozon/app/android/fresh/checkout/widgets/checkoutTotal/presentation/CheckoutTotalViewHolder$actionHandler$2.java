package ru.ozon.app.android.fresh.checkout.widgets.checkoutTotal.presentation;

import Vg.c;
import Vg.f;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.fresh.checkout.domain.actionHandlers.CreateFreshOrderActionHandler;
import ru.ozon.app.android.fresh.checkout.domain.actionHandlers.CreateFreshOrderV2ActionHandler;
import ru.ozon.app.android.fresh.checkout.widgets.checkoutProgressBar.presentation.FreshProgressBarVO;
import ru.ozon.app.android.fresh.checkout.widgets.checkoutTotal.presentation.CheckoutTotalVO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/uni/atoms/af/AtomAction;", "invoke", "(Lru/ozon/uni/atoms/af/AtomAction;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class CheckoutTotalViewHolder$actionHandler$2 extends AbstractC7737t implements Function1<AtomAction, Boolean> {
    final /* synthetic */ CheckoutTotalViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CheckoutTotalViewHolder$actionHandler$2(CheckoutTotalViewHolder checkoutTotalViewHolder) {
        super(1);
        this.this$0 = checkoutTotalViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(AtomAction action) {
        c customActionHandlersStore;
        CheckoutTotalVO.InteractiveActions interactiveActions;
        c customActionHandlersStore2;
        CheckoutTotalVO.InteractiveActions interactiveActions2;
        Intrinsics.checkNotNullParameter(action, "action");
        String id2 = action.getId();
        FreshProgressBarVO freshProgressBarVO = null;
        if (Intrinsics.d(id2, "createFreshOrderV2")) {
            customActionHandlersStore2 = this.this$0.getCustomActionHandlersStore();
            f handler = customActionHandlersStore2.getHandler("createFreshOrderV2");
            CreateFreshOrderV2ActionHandler createFreshOrderV2ActionHandler = handler instanceof CreateFreshOrderV2ActionHandler ? (CreateFreshOrderV2ActionHandler) handler : null;
            if (createFreshOrderV2ActionHandler != null) {
                CheckoutTotalVO boundData = this.this$0.getBoundData();
                if (boundData != null && (interactiveActions2 = boundData.getInteractiveActions()) != null) {
                    freshProgressBarVO = interactiveActions2.getProgressBar();
                }
                createFreshOrderV2ActionHandler.setProgressBar(freshProgressBarVO);
            }
        } else if (Intrinsics.d(id2, "createFreshOrder")) {
            customActionHandlersStore = this.this$0.getCustomActionHandlersStore();
            f handler2 = customActionHandlersStore.getHandler("createFreshOrder");
            CreateFreshOrderActionHandler createFreshOrderActionHandler = handler2 instanceof CreateFreshOrderActionHandler ? (CreateFreshOrderActionHandler) handler2 : null;
            if (createFreshOrderActionHandler != null) {
                CheckoutTotalVO boundData2 = this.this$0.getBoundData();
                if (boundData2 != null && (interactiveActions = boundData2.getInteractiveActions()) != null) {
                    freshProgressBarVO = interactiveActions.getProgressBar();
                }
                createFreshOrderActionHandler.setProgressBar(freshProgressBarVO);
            }
        }
        return Boolean.FALSE;
    }
}
