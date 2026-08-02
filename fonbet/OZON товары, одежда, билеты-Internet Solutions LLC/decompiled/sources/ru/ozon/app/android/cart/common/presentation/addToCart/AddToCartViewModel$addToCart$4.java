package ru.ozon.app.android.cart.common.presentation.addToCart;

import Sc.v;
import io.reactivex.AbstractC7094b;
import io.reactivex.f;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.cart.common.data.CartAddItemDTO;
import ru.ozon.app.android.cart.common.domain.CartRefreshReason;
import ru.ozon.app.android.cart.common.domain.CartType;
import ru.ozon.app.android.cart.common.domain.CartTypeKt;
import ru.ozon.app.android.cart.common.presentation.refresh.CartEventsController;
import vc.C10300e;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\n\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00062\"\u0010\u0005\u001a\u001e\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000¢\u0006\u0002\b\u0002H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"LSc/v;", "Lru/ozon/app/android/cart/common/data/CartAddItemDTO;", "Lkotlin/jvm/internal/EnhancedNullability;", "", "Lru/ozon/app/android/cart/common/domain/CartType;", "<destruct>", "Lio/reactivex/f;", "kotlin.jvm.PlatformType", "invoke", "(LSc/v;)Lio/reactivex/f;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes11.dex */
final class AddToCartViewModel$addToCart$4 extends AbstractC7737t implements Function1<v<? extends CartAddItemDTO, ? extends Boolean, ? extends CartType>, f> {
    final /* synthetic */ AddToCartViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddToCartViewModel$addToCart$4(AddToCartViewModel addToCartViewModel) {
        super(1);
        this.this$0 = addToCartViewModel;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final f invoke2(v<CartAddItemDTO, Boolean, ? extends CartType> vVar) {
        CartEventsController cartEventsController;
        CartEventsController cartEventsController2;
        Intrinsics.checkNotNullParameter(vVar, "<destruct>");
        CartAddItemDTO a11 = vVar.a();
        Intrinsics.checkNotNullExpressionValue(a11, "component1(...)");
        CartAddItemDTO cartAddItemDTO = a11;
        boolean booleanValue = vVar.b().booleanValue();
        CartType d11 = vVar.d();
        if (booleanValue) {
            if (CartTypeKt.isFamilyCart(d11)) {
                cartEventsController2 = this.this$0.refreshController;
                cartEventsController2.handleEvent(CartRefreshReason.AddToFamilyCart.INSTANCE);
            } else {
                cartEventsController = this.this$0.refreshController;
                cartEventsController.handleEvent(new CartRefreshReason.AddToCart(null));
            }
        }
        return !cartAddItemDTO.getSuccess() ? AbstractC7094b.h(new Exception("not success")) : C10300e.f102773a;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ f invoke(v<? extends CartAddItemDTO, ? extends Boolean, ? extends CartType> vVar) {
        return invoke2((v<CartAddItemDTO, Boolean, ? extends CartType>) vVar);
    }
}
