package ru.ozon.app.android.fresh.cart.widgets.reorderTile.presentation;

import Ae.C2399j;
import Ae.InterfaceC2395h;
import Ge.n;
import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7719a;
import ru.ozon.app.android.cart.common.domain.CartService;
import ru.ozon.app.android.cart.common.domain.CartState;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.fresh.cart.widgets.reorderTile.presentation.ReorderTileViewHolder$subscribeToCartUpdates$1", f = "ReorderTileViewHolder.kt", l = {123}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class ReorderTileViewHolder$subscribeToCartUpdates$1 extends j implements Function2<M, d<? super Unit>, Object> {
    int label;
    final /* synthetic */ ReorderTileViewHolder this$0;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.fresh.cart.widgets.reorderTile.presentation.ReorderTileViewHolder$subscribeToCartUpdates$1$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 extends C7719a implements Function2<CartState, d<? super Unit>, Object> {
        AnonymousClass1(Object obj) {
            super(2, obj, ReorderTileViewHolder.class, "applyCartState", "applyCartState(Lru/ozon/app/android/cart/common/domain/CartState;)V", 4);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CartState cartState, d<? super Unit> dVar) {
            return ReorderTileViewHolder$subscribeToCartUpdates$1.invokeSuspend$applyCartState((ReorderTileViewHolder) this.receiver, cartState, dVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReorderTileViewHolder$subscribeToCartUpdates$1(ReorderTileViewHolder reorderTileViewHolder, d<? super ReorderTileViewHolder$subscribeToCartUpdates$1> dVar) {
        super(2, dVar);
        this.this$0 = reorderTileViewHolder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object invokeSuspend$applyCartState(ReorderTileViewHolder reorderTileViewHolder, CartState cartState, d dVar) {
        reorderTileViewHolder.applyCartState(cartState);
        return Unit.f71690a;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new ReorderTileViewHolder$subscribeToCartUpdates$1(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CartService cartService;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            cartService = this.this$0.cartService;
            InterfaceC2395h a11 = n.a(CartService.DefaultImpls.observeCartState$default(cartService, false, 1, null));
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0);
            this.label = 1;
            if (C2399j.h(a11, anonymousClass1, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((ReorderTileViewHolder$subscribeToCartUpdates$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
