package ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder;

import Sc.s;
import Wc.a;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.cart.common.domain.CartState;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/cart/common/domain/CartState;", "kotlin.jvm.PlatformType"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.WidgetImagePlaceholderAdapter$setupObservers$1", f = "WidgetImagePlaceholderAdapter.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class WidgetImagePlaceholderAdapter$setupObservers$1 extends j implements Function2<CartState, d<? super Unit>, Object> {
    int label;
    final /* synthetic */ WidgetImagePlaceholderAdapter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WidgetImagePlaceholderAdapter$setupObservers$1(WidgetImagePlaceholderAdapter widgetImagePlaceholderAdapter, d<? super WidgetImagePlaceholderAdapter$setupObservers$1> dVar) {
        super(2, dVar);
        this.this$0 = widgetImagePlaceholderAdapter;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new WidgetImagePlaceholderAdapter$setupObservers$1(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        boolean z11;
        boolean currentInCartState;
        boolean currentInCartState2;
        Map map;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        z11 = this.this$0.isInCart;
        if (!z11) {
            currentInCartState2 = this.this$0.currentInCartState();
            if (currentInCartState2) {
                this.this$0.isInCart = true;
                map = this.this$0.prepareViews;
                WidgetImagePlaceholderAdapter widgetImagePlaceholderAdapter = this.this$0;
                Iterator it = map.entrySet().iterator();
                while (it.hasNext()) {
                    PrepareView prepareView = (PrepareView) ((Map.Entry) it.next()).getValue();
                    WidgetImagePlaceholderAdapter.cacheViewIfNeeded$default(widgetImagePlaceholderAdapter, prepareView.getView(), prepareView.getWidgetName(), prepareView.getStateId(), prepareView.getViewHolderPositionInfo(), prepareView.getJson(), null, 32, null);
                }
                return Unit.f71690a;
            }
        }
        WidgetImagePlaceholderAdapter widgetImagePlaceholderAdapter2 = this.this$0;
        currentInCartState = widgetImagePlaceholderAdapter2.currentInCartState();
        widgetImagePlaceholderAdapter2.isInCart = currentInCartState;
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CartState cartState, d<? super Unit> dVar) {
        return ((WidgetImagePlaceholderAdapter$setupObservers$1) create(cartState, dVar)).invokeSuspend(Unit.f71690a);
    }
}
