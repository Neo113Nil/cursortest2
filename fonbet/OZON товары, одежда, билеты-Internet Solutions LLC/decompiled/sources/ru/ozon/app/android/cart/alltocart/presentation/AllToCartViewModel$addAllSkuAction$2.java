package ru.ozon.app.android.cart.alltocart.presentation;

import io.reactivex.C;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.cart.common.data.CartAddItemDTO;
import ru.ozon.app.android.cart.common.domain.CartService;
import ru.ozon.app.android.cart.common.models.AddProductsWithTokenizedAnalytics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a*\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0014\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u00032\u000b\u0010\u0002\u001a\u00070\u0000¢\u0006\u0002\b\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lru/ozon/app/android/cart/common/models/AddProductsWithTokenizedAnalytics;", "Lkotlin/jvm/internal/EnhancedNullability;", "it", "Lio/reactivex/C;", "Lru/ozon/app/android/cart/common/data/CartAddItemDTO;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/cart/common/models/AddProductsWithTokenizedAnalytics;)Lio/reactivex/C;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes11.dex */
final class AllToCartViewModel$addAllSkuAction$2 extends AbstractC7737t implements Function1<AddProductsWithTokenizedAnalytics, C<? extends CartAddItemDTO>> {
    final /* synthetic */ AllToCartViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AllToCartViewModel$addAllSkuAction$2(AllToCartViewModel allToCartViewModel) {
        super(1);
        this.this$0 = allToCartViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C<? extends CartAddItemDTO> invoke(AddProductsWithTokenizedAnalytics it) {
        CartService cartService;
        Intrinsics.checkNotNullParameter(it, "it");
        cartService = this.this$0.cartService;
        return cartService.addMultipleProductsWithCustomAnalytics(it);
    }
}
