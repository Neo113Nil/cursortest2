package ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.product;

import Sc.s;
import Wc.a;
import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.cart.cartSplitV2.v2.util.swipeToDelete.view.BaseSwipeableWrapperView;
import ru.ozon.app.android.cart.cartSplitV2.v2.util.swipeToDelete.viewObjects.SwipeInfoVO;
import ru.ozon.app.android.favorites.domain.model.FavoriteProductModel;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "groupId", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.product.CartSplitV2ProductWidgetViewHolder$observeSwipeFavButton$1", f = "CartSplitV2ProductWidgetViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class CartSplitV2ProductWidgetViewHolder$observeSwipeFavButton$1 extends j implements Function2<String, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CartSplitV2ProductWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CartSplitV2ProductWidgetViewHolder$observeSwipeFavButton$1(CartSplitV2ProductWidgetViewHolder cartSplitV2ProductWidgetViewHolder, d<? super CartSplitV2ProductWidgetViewHolder$observeSwipeFavButton$1> dVar) {
        super(2, dVar);
        this.this$0 = cartSplitV2ProductWidgetViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        CartSplitV2ProductWidgetViewHolder$observeSwipeFavButton$1 cartSplitV2ProductWidgetViewHolder$observeSwipeFavButton$1 = new CartSplitV2ProductWidgetViewHolder$observeSwipeFavButton$1(this.this$0, dVar);
        cartSplitV2ProductWidgetViewHolder$observeSwipeFavButton$1.L$0 = obj;
        return cartSplitV2ProductWidgetViewHolder$observeSwipeFavButton$1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        SwipeInfoVO swipeInfo;
        FavoriteProductModel favMolecule;
        BaseSwipeableWrapperView baseSwipeableWrapperView;
        BaseSwipeableWrapperView baseSwipeableWrapperView2;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        if (Intrinsics.d((String) this.L$0, this.this$0.getSwipeGroupId())) {
            CartSplitV2ProductVO cartSplitV2ProductVO = (CartSplitV2ProductVO) this.this$0.getBoundData();
            if (cartSplitV2ProductVO == null || (swipeInfo = cartSplitV2ProductVO.getSwipeInfo()) == null || (favMolecule = swipeInfo.getFavMolecule()) == null) {
                return Unit.f71690a;
            }
            baseSwipeableWrapperView = this.this$0.containerView;
            Function2<FavoriteProductModel, View, Unit> onClick = baseSwipeableWrapperView.getFavButton().getOnClick();
            if (onClick != null) {
                baseSwipeableWrapperView2 = this.this$0.containerView;
                onClick.invoke(favMolecule, baseSwipeableWrapperView2.getFavButton().getFavIcon());
            }
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(String str, d<? super Unit> dVar) {
        return ((CartSplitV2ProductWidgetViewHolder$observeSwipeFavButton$1) create(str, dVar)).invokeSuspend(Unit.f71690a);
    }
}
