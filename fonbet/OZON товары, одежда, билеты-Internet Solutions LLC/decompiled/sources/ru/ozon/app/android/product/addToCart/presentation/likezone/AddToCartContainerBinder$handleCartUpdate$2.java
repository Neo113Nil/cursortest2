package ru.ozon.app.android.product.addToCart.presentation.likezone;

import Sc.s;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.cart.common.models.CartItemInfo;
import ru.ozon.app.android.storefront.data.tiles.addtocart.likezone.AddToCartContainerDTO;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.app.android.product.addToCart.presentation.likezone.AddToCartContainerBinder$handleCartUpdate$2", f = "AddToCartContainerBinder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class AddToCartContainerBinder$handleCartUpdate$2 extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {
    final /* synthetic */ CartItemInfo $familyCartItemInfo;
    final /* synthetic */ CartItemInfo $personalCartItemInfo;
    int label;
    final /* synthetic */ AddToCartContainerBinder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddToCartContainerBinder$handleCartUpdate$2(AddToCartContainerBinder addToCartContainerBinder, CartItemInfo cartItemInfo, CartItemInfo cartItemInfo2, kotlin.coroutines.d<? super AddToCartContainerBinder$handleCartUpdate$2> dVar) {
        super(2, dVar);
        this.this$0 = addToCartContainerBinder;
        this.$personalCartItemInfo = cartItemInfo;
        this.$familyCartItemInfo = cartItemInfo2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new AddToCartContainerBinder$handleCartUpdate$2(this.this$0, this.$personalCartItemInfo, this.$familyCartItemInfo, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        WeakReference weakReference;
        AddToCartContainerDTO addToCartContainerDTO;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        AddToCartContainerBinder addToCartContainerBinder = this.this$0;
        weakReference = addToCartContainerBinder.buttonContainer;
        AddToCartContainerView addToCartContainerView = weakReference != null ? (AddToCartContainerView) weakReference.get() : null;
        addToCartContainerDTO = this.this$0.addToCartContainerDTO;
        addToCartContainerBinder.bindButtonContainer(addToCartContainerView, addToCartContainerDTO, this.$personalCartItemInfo, this.$familyCartItemInfo);
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((AddToCartContainerBinder$handleCartUpdate$2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
