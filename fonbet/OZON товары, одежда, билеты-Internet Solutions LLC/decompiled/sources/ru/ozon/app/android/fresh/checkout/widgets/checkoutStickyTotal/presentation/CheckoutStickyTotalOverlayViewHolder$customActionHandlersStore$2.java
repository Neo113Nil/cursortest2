package ru.ozon.app.android.fresh.checkout.widgets.checkoutStickyTotal.presentation;

import Vg.c;
import Vg.d;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.fresh.checkout.domain.actionHandlers.CreateFreshOrderActionHandler;
import ru.ozon.app.android.fresh.checkout.domain.actionHandlers.CreateFreshOrderV2ActionHandler;
import ru.ozon.app.android.fresh.common.domain.actionHandlers.PopAndRedirectActionHandler;
import ru.ozon.app.android.platform.customActionHandlers.composerActionWithAction.ComposerActionWithActionHandler;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LVg/c;", "invoke", "()LVg/c;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes12.dex */
final class CheckoutStickyTotalOverlayViewHolder$customActionHandlersStore$2 extends AbstractC7737t implements Function0<c> {
    final /* synthetic */ d $customActionHandlersStoreFactory;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CheckoutStickyTotalOverlayViewHolder$customActionHandlersStore$2(d dVar) {
        super(0);
        this.$customActionHandlersStoreFactory = dVar;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final c invoke() {
        return this.$customActionHandlersStoreFactory.create(PopAndRedirectActionHandler.class, CreateFreshOrderActionHandler.class, CreateFreshOrderV2ActionHandler.class, ComposerActionWithActionHandler.class);
    }
}
