package ru.ozon.app.android.pdp.widgets.cartButtonQuant;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class CartButtonQuantActionHandler$handler$2 extends AbstractC7737t implements Function0<Function1<? super AtomAction, ? extends Unit>> {
    final /* synthetic */ CartButtonQuantActionHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CartButtonQuantActionHandler$handler$2(CartButtonQuantActionHandler cartButtonQuantActionHandler) {
        super(0);
        this.this$0 = cartButtonQuantActionHandler;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Function1<? super AtomAction, ? extends Unit> invoke() {
        CartQuantView cartQuantView;
        ActionHandler.Builder customAnalyticHandler;
        ActionHandler.Builder onClick;
        cartQuantView = this.this$0.cartView;
        ActionHandler.Builder actionHandlerBuilder = cartQuantView.getActionHandlerBuilder();
        if (actionHandlerBuilder == null || (customAnalyticHandler = actionHandlerBuilder.customAnalyticHandler(CartButtonQuantActionHandler$handler$2$1$1.INSTANCE)) == null || (onClick = customAnalyticHandler.onClick(new CartButtonQuantActionHandler$handler$2$1$2(cartQuantView))) == null) {
            return null;
        }
        return onClick.buildHandler();
    }
}
