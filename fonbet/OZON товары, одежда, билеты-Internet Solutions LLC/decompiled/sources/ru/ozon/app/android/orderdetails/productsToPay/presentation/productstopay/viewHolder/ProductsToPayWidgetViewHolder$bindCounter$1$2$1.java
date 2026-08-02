package ru.ozon.app.android.orderdetails.productsToPay.presentation.productstopay.viewHolder;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.M;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.orderdetails.productsToPay.presentation.productstopay.viewHolder.ProductsToPayWidgetViewHolder$bindCounter$1$2$1", f = "ProductsToPayWidgetViewHolder.kt", l = {182}, m = "invokeSuspend")
/* loaded from: classes13.dex */
public final class ProductsToPayWidgetViewHolder$bindCounter$1$2$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ AtomAction $action;
    final /* synthetic */ int $newValue;
    final /* synthetic */ String $state;
    int label;
    final /* synthetic */ ProductsToPayWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProductsToPayWidgetViewHolder$bindCounter$1$2$1(ProductsToPayWidgetViewHolder productsToPayWidgetViewHolder, AtomAction atomAction, int i11, String str, d<? super ProductsToPayWidgetViewHolder$bindCounter$1$2$1> dVar) {
        super(2, dVar);
        this.this$0 = productsToPayWidgetViewHolder;
        this.$action = atomAction;
        this.$newValue = i11;
        this.$state = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new ProductsToPayWidgetViewHolder$bindCounter$1$2$1(this.this$0, this.$action, this.$newValue, this.$state, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ProductsToPayWidgetClickHelper productsToPayWidgetClickHelper;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            productsToPayWidgetClickHelper = this.this$0.clickHelper;
            AtomAction atomAction = this.$action;
            int i12 = this.$newValue;
            String str = this.$state;
            this.label = 1;
            if (productsToPayWidgetClickHelper.onCounterClick(atomAction, i12, str, this) == aVar) {
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
        return ((ProductsToPayWidgetViewHolder$bindCounter$1$2$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
