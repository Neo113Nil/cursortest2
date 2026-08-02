package ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.product;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7719a;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
/* synthetic */ class CartSplitV2ProductWidgetViewHolder$onAttach$1 extends C7719a implements Function2<Boolean, d<? super Unit>, Object> {
    CartSplitV2ProductWidgetViewHolder$onAttach$1(Object obj) {
        super(2, obj, CartSplitV2ProductWidgetViewHolder.class, "updateAsyncLocking", "updateAsyncLocking(Z)V", 4);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Boolean bool, d<? super Unit> dVar) {
        return invoke(bool.booleanValue(), dVar);
    }

    public final Object invoke(boolean z11, d<? super Unit> dVar) {
        Object onAttach$updateAsyncLocking;
        onAttach$updateAsyncLocking = CartSplitV2ProductWidgetViewHolder.onAttach$updateAsyncLocking((CartSplitV2ProductWidgetViewHolder) this.receiver, z11, dVar);
        return onAttach$updateAsyncLocking;
    }
}
