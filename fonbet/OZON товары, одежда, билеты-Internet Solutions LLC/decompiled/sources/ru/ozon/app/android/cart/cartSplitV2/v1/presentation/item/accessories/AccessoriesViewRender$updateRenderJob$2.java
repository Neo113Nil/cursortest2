package ru.ozon.app.android.cart.cartSplitV2.v1.presentation.item.accessories;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7719a;
import ru.ozon.app.android.cart.cartSplitV2.accessories.AccessoriesAsyncState;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
/* synthetic */ class AccessoriesViewRender$updateRenderJob$2 extends C7719a implements Function2<AccessoriesAsyncState, d<? super Unit>, Object> {
    AccessoriesViewRender$updateRenderJob$2(Object obj) {
        super(2, obj, AccessoriesViewRender.class, "renderState", "renderState(Lru/ozon/app/android/cart/cartSplitV2/accessories/AccessoriesAsyncState;)V", 4);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AccessoriesAsyncState accessoriesAsyncState, d<? super Unit> dVar) {
        Object updateRenderJob$renderState;
        updateRenderJob$renderState = AccessoriesViewRender.updateRenderJob$renderState((AccessoriesViewRender) this.receiver, accessoriesAsyncState, dVar);
        return updateRenderJob$renderState;
    }
}
