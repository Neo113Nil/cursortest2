package ru.ozon.app.android.pdp.widgets.cartButtonQuant.doubleCart;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class DoubleCartQuantViewImpl$onAction$2 extends AbstractC7737t implements Function0<Function1<? super AtomAction, ? extends Unit>> {
    final /* synthetic */ DoubleCartQuantViewImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DoubleCartQuantViewImpl$onAction$2(DoubleCartQuantViewImpl doubleCartQuantViewImpl) {
        super(0);
        this.this$0 = doubleCartQuantViewImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Function1<? super AtomAction, ? extends Unit> invoke() {
        ActionHandler.Builder actionHandlerBuilder = this.this$0.getActionHandlerBuilder();
        if (actionHandlerBuilder != null) {
            return actionHandlerBuilder.buildHandler();
        }
        return null;
    }
}
