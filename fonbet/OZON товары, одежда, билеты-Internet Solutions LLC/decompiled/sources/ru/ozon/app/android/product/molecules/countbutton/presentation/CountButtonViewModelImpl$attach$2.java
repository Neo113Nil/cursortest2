package ru.ozon.app.android.product.molecules.countbutton.presentation;

import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7735q;
import ru.ozon.app.android.cart.common.models.CartItemInfo;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
/* synthetic */ class CountButtonViewModelImpl$attach$2 extends C7735q implements Function2<Map<Long, ? extends CartItemInfo>, d<? super Unit>, Object> {
    CountButtonViewModelImpl$attach$2(Object obj) {
        super(2, obj, CountButtonViewModelImpl.class, "onCartItemsChanged", "onCartItemsChanged(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Map<Long, ? extends CartItemInfo> map, d<? super Unit> dVar) {
        return invoke2((Map<Long, CartItemInfo>) map, dVar);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Map<Long, CartItemInfo> map, d<? super Unit> dVar) {
        Object onCartItemsChanged;
        onCartItemsChanged = ((CountButtonViewModelImpl) this.receiver).onCartItemsChanged(map, dVar);
        return onCartItemsChanged;
    }
}
