package ru.ozon.app.android.storefront.widgets.stickyCart.presenatation;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.cart.common.domain.CartState;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/cart/common/domain/CartState;", "kotlin.jvm.PlatformType"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.storefront.widgets.stickyCart.presenatation.StickyCartOverlayViewHolder$addCartObserver$1", f = "StickyCartOverlayViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class StickyCartOverlayViewHolder$addCartObserver$1 extends j implements Function2<CartState, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ StickyCartOverlayViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StickyCartOverlayViewHolder$addCartObserver$1(StickyCartOverlayViewHolder stickyCartOverlayViewHolder, d<? super StickyCartOverlayViewHolder$addCartObserver$1> dVar) {
        super(2, dVar);
        this.this$0 = stickyCartOverlayViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        StickyCartOverlayViewHolder$addCartObserver$1 stickyCartOverlayViewHolder$addCartObserver$1 = new StickyCartOverlayViewHolder$addCartObserver$1(this.this$0, dVar);
        stickyCartOverlayViewHolder$addCartObserver$1.L$0 = obj;
        return stickyCartOverlayViewHolder$addCartObserver$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        this.this$0.applyCartState(((CartState) this.L$0).getTotalCount());
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CartState cartState, d<? super Unit> dVar) {
        return ((StickyCartOverlayViewHolder$addCartObserver$1) create(cartState, dVar)).invokeSuspend(Unit.f71690a);
    }
}
