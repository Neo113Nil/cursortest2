package ru.ozon.app.android.cart.controls.v2.presentation;

import Vg.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.cart.cartSplitV2.RemoveCartSplitActionHandler;
import ru.ozon.app.android.delivery.customActionsHandlers.postRefreshWithScroll.PostRefreshWithScrollActionHandler;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LVg/c;", "invoke", "()LVg/c;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes6.dex */
final class ControlsViewMapper$customActionHandlersStore$2 extends AbstractC7737t implements Function0<c> {
    final /* synthetic */ ControlsViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ControlsViewMapper$customActionHandlersStore$2(ControlsViewMapper controlsViewMapper) {
        super(0);
        this.this$0 = controlsViewMapper;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final c invoke() {
        return this.this$0.component().getCustomActionHandlersStoreFactory().create(RemoveCartSplitActionHandler.class, PostRefreshWithScrollActionHandler.class);
    }
}
