package ru.ozon.app.android.product.cartdelegate;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.product.cartdelegate.CartButtonDelegate;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
/* synthetic */ class CartButtonDelegate$observeButtonState$2 extends C7735q implements Function2<CartButtonDelegate.ButtonState, d<? super Unit>, Object> {
    CartButtonDelegate$observeButtonState$2(Object obj) {
        super(2, obj, Intrinsics.a.class, "suspendConversion0", "observeButtonState$suspendConversion0(Lkotlin/jvm/functions/Function1;Lru/ozon/app/android/product/cartdelegate/CartButtonDelegate$ButtonState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CartButtonDelegate.ButtonState buttonState, d<? super Unit> dVar) {
        Object observeButtonState$suspendConversion0;
        observeButtonState$suspendConversion0 = CartButtonDelegate.observeButtonState$suspendConversion0((Function1) this.receiver, buttonState, dVar);
        return observeButtonState$suspendConversion0;
    }
}
