package ru.ozon.app.android.orderdetails.productsToPay.presentation.productstopay.viewHolder;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.orderdetails.productsToPay.presentation.productstopay.viewItem.ProductsToPayVO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.orderdetails.productsToPay.presentation.productstopay.viewHolder.ProductsToPayWidgetViewHolder$onItemClick$1", f = "ProductsToPayWidgetViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class ProductsToPayWidgetViewHolder$onItemClick$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ ProductsToPayVO $item;
    int label;
    final /* synthetic */ ProductsToPayWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProductsToPayWidgetViewHolder$onItemClick$1(ProductsToPayVO productsToPayVO, ProductsToPayWidgetViewHolder productsToPayWidgetViewHolder, d<? super ProductsToPayWidgetViewHolder$onItemClick$1> dVar) {
        super(2, dVar);
        this.$item = productsToPayVO;
        this.this$0 = productsToPayWidgetViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new ProductsToPayWidgetViewHolder$onItemClick$1(this.$item, this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        AtomAction atomAction;
        ProductsToPayWidgetClickHelper productsToPayWidgetClickHelper;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        CommonControlSettings common = this.$item.getCommon();
        if (common != null && (atomAction = common.toAtomAction()) != null) {
            ProductsToPayWidgetViewHolder productsToPayWidgetViewHolder = this.this$0;
            ProductsToPayVO productsToPayVO = this.$item;
            productsToPayWidgetClickHelper = productsToPayWidgetViewHolder.clickHelper;
            productsToPayWidgetClickHelper.onItemClick(atomAction, productsToPayVO.getState());
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((ProductsToPayWidgetViewHolder$onItemClick$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
